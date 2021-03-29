grammar XGD;
//H:\Esir2\cin\Projet new\src;H:\Esir2\cin\jogl\gluegen-rt.jar;H:\Esir2\cin\jogl\jogl.jar
@header
{package parser;
import java.util.HashMap;
import Lib3d.*;
import Lib3d.GlSceneGraph.*;
import Lib3d.Loader.*;
import Lib3d.SceneGraph.*;}

// Déclaration d'une map
@members {
  HashMap<String,AbstractGeometry> mapi= new HashMap();
  HashMap<String,Material> mapmat= new HashMap();
  HashMap<String,Lib3d.GlSceneGraph.Group> mapgroup= new HashMap();
  public static Lib3d.GlSceneGraph.Group root = new Lib3d.GlSceneGraph.Group();
  Lib3d.GlSceneGraph.Group currentNode = root;
  java.util.Stack<Lib3d.GlSceneGraph.Group> stack = new java.util.Stack<Lib3d.GlSceneGraph.Group>();
  public static HashMap<String, Float> expressmap = new HashMap();
  public static HashMap<Lib3d.GlSceneGraph.Translation, String[]> transmap = new java.util.HashMap();
  public static HashMap<Lib3d.GlSceneGraph.Rotation, String[]> rotamap = new java.util.HashMap();
  public static HashMap<Lib3d.GlSceneGraph.Scale, String[]> scamap = new java.util.HashMap();
  String expression;
  float resultat;
}

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;


nombre	:	'-'?(INT|FLOAT);


transform	: /*{Lib3d.GlSceneGraph.Group node = new Lib3d.GlSceneGraph.Group();
		    currentNode.addChild(node);
		    currentNode = node;}*/ // Ca ya pas
		'Transform'';''type''=' (translation | rotation | scale)+ ';''nom''=' STRING ';';
			
translation
	:	'Translation''{'coordx=animation{String x = expression;}//float x=Float.valueOf($coordx.text);
			      ','coordy=animation{String y = expression;}//float y=Float.valueOf($coordy.text);
			      ','coordz=animation{String z = expression;}//Float.valueOf($coordz.text);
			      '}'{Vector3d vector_translation = new Vector3d(Float.valueOf($coordx.result),Float.valueOf($coordy.result),Float.valueOf($coordz.result));
			      Lib3d.GlSceneGraph.Translation node_translation = new Lib3d.GlSceneGraph.Translation(vector_translation);
			      currentNode.addChild(node_translation); 
			      currentNode = node_translation; 
			      String[] translations = {x,y,z};
			      transmap.put(node_translation,translations);
			      stack.push(node_translation);};
	
rotation:	'Rotation'  '{'coordx=animation{String x= expression;}
			      ','coordy=animation{String y=expression;}
			      ','coordz=animation{String z=expression;}
			      ','ang=animation{String angle=expression;}
			      '}'{Vector3d vector_rotation = new Vector3d(Float.valueOf($coordx.result),Float.valueOf($coordy.result),Float.valueOf($coordz.result));
			      Lib3d.GlSceneGraph.Rotation node_rotation = new Lib3d.GlSceneGraph.Rotation(vector_rotation,Float.valueOf($ang.result));
			      currentNode.addChild(node_rotation); 
			      currentNode = node_rotation; 
			      String[]rotations = {x,y,z,angle};
			      rotamap.put(node_rotation,rotations);
			      stack.push(node_rotation);};

scale	:   'Scale''{'      coordx=animation{String x= expression;}
			      ','coordy=animation{String y= expression;}
			      ','coordz=animation{String z= expression;}
			      '}'{Vector3d vector_scale =new Vector3d(Float.valueOf($coordx.result),Float.valueOf($coordy.result),Float.valueOf($coordz.result));
			      Lib3d.GlSceneGraph.Scale node_scale = new Lib3d.GlSceneGraph.Scale(vector_scale);
			      currentNode.addChild(node_scale); 
			      currentNode = node_scale; 
			      String[]scales = {x,y,z};
			      scamap.put(node_scale,scales);
			      stack.push(node_scale);};

group 	: 	  'Group'';'  'nom''=' 
			g =STRING{if(mapgroup.get($g.text) != null)
			{
				Lib3d.GlSceneGraph.Group node = mapgroup.get($g.text);
				currentNode.addChild(node);
				currentNode = node;
				stack.push(node);
			}
			else
			{
				Lib3d.GlSceneGraph.Group node = new Lib3d.GlSceneGraph.Group();
				mapgroup.put($g.text,node);
				currentNode.addChild(node);
				currentNode = node;
				stack.push(node);
			}	
			}';';


geometry:	'Geometry'';''type''=' (cone|cube|cylinder|sphere|teapot|tetrahedron|torus);

cone	:	 {float base; float height; int slices; int stacks;}
		('Cone''{'
		f1=nombre{base = Float.valueOf($f1.text);}
		','f1=nombre{height = Float.valueOf($f1.text);}
		','i1 =nombre{slices= Integer.valueOf($i1.text);}
		','i1 =nombre{stacks= Integer.valueOf($i1.text);}'}'
		 ';''nom''=' str=STRING{mapi.put($str.text,new Cone(base,height,slices,stacks));}//(float base, float height, int slices, int stacks)
		 ';''Material'':'
		 'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
		 	if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
				
		})
		|
		('Cone' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';');
		
		
sphere 	:	{Sphere spher; float radius; int slices; int stacks;}
	('Sphere''{'
	f1=nombre{radius = Float.valueOf($f1.text);}
	','i1 =nombre{slices= Integer.valueOf($i1.text);}
	','i1 =nombre{stacks= Integer.valueOf($i1.text);}'}'{spher = new Sphere(radius,slices,stacks);} // (float radius, int slices, int stacks)
	';'  'nom''=' str=STRING{mapi.put($str.text,spher);}
	';''Material'':'
	'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
		 	if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
		} )
		|
		('Sphere' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';');
	
	
cylinder :{Cylinder cyl;float base; float top; float height; int slices; int stacks;}
	('Cylinder''{'f1=nombre{base = Float.valueOf($f1.text);}
	','f1=nombre{top = Float.valueOf($f1.text);}
	','f1=nombre{height = Float.valueOf($f1.text);}
	','i1 =nombre{slices= Integer.valueOf($i1.text);}
	','i1 =nombre{stacks= Integer.valueOf($i1.text);}'}'
	';'  'nom''=' str=STRING{cyl = new Cylinder(base,top,height,slices,stacks);mapi.put($str.text,cyl);}
	';''Material'':'
	'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
			if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
		} )
		|
		('Cylinder' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';');
	
	
cube 	:	{float size;}
		('Cube''{'f1=nombre{size = Float.valueOf($f1.text);}'}'
		';'  'nom''=' str=STRING{mapi.put($str.text,new Cube(size));}
		';''Material'':'
		'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
			if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
		})
		|
		('Cube' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';');


teapot 	:	{float size;}
		('Teapot''{'f1=nombre{size = Float.valueOf($f1.text);}'}'
		';' 'nom''=' str=STRING{mapi.put($str.text,new Teapot(size));}
		';''Material'':'
		'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
		 	if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
		})
		|
		('Teapot' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';');


tetrahedron 
	:	('Tetrahedron''{''}'
		';' 'nom''=' str=STRING{mapi.put($str.text,new Tetrahedron());}
		';''Material'':'
		'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{
		 	if(mapmat.get($idmat.text) != null) {
				mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				currentNode.addChild(mapi.get($str.text));}
		} )
		|
		('Tetrahedron' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';') ;
	
	
torus 	:	{float iradius; float oradius; int sides ; int rings;}
	('Torus''{'f1=nombre{iradius = Float.valueOf($f1.text);}
	','f1= nombre{oradius = Float.valueOf($f1.text);}
	','i1 =nombre{sides= Integer.valueOf($i1.text);}
	','i1 =nombre{rings= Integer.valueOf($i1.text);}'}'
	';' 'nom''=' str=STRING{mapi.put($str.text,new Torus(iradius,oradius,sides,rings));}
	';''Material'':'
	'nom''='idmat=STRING';'(couleur[$idmat.text])?
		{	
			if(mapmat.get($idmat.text) != null) {
				 mapi.get($str.text).setMaterial(mapmat.get($idmat.text));
				 currentNode.addChild(mapi.get($str.text));}
		})
		|
		('Torus' ';'  'nom''=' str=STRING
		{
			if(mapi.get($str.text) != null)
			{
				currentNode.addChild(mapi.get($str.text));
			}
		}';') ;



couleur[String identifiant] :{Color Ka; Color Kd; Color Ks; float m_d; float m_Ns; Vector2d textureScale; String textureFile ; }
		  
	'Ka''{'Ka1=nombre','Ka2=nombre',' Ka3=nombre'}'
	',''Kd''{'Kd1=nombre','Kd2=nombre','Kd3=nombre'}'
	',''Ks''{'Ks1=nombre','Ks2=nombre',' Ks3=nombre'}'
	',''d''=' d=nombre{m_d=Float.valueOf($d.text);}
	',''Ns''=' Ns=nombre{m_Ns=Float.valueOf($Ns.text);}
	',''textureScale''{' v1=nombre',' v2=nombre '}'
	',''textureFile''=' str=STRING{textureFile = $str.text;}
	';'{ Kd= new Color(Float.valueOf($Kd1.text),Float.valueOf($Kd2.text),Float.valueOf($Kd3.text));
	     Ka= new Color(Float.valueOf($Ka1.text),Float.valueOf($Ka2.text), Float.valueOf($Ka3.text));
	     Ks=new Color(Float.valueOf($Ks1.text),Float.valueOf($Ks2.text),Float.valueOf($Ks3.text));
	     textureScale = new Vector2d(Float.valueOf($v1.text),Float.valueOf($v2.text));
	     mapmat.put(identifiant,new Material(identifiant,Ka,Kd,Ks,m_d,m_Ns,textureScale,textureFile));};
		 

syntaxe
	:	(('<' (geometry) '>')('<' '/' ('Geometry') '>'))
		|('<' (geometry) '/' '>' )
		|(('<' (transform) '>') syntaxe* ('<' '/' 'Transform' '>'){stack.pop(); currentNode=stack.peek();})
		|(('<' (group) '>') syntaxe* ('<' '/' ('Group') '>'){stack.pop(); currentNode=stack.peek();})
		;

root 	:	('<' 'Root' '>'){stack.push(root);}  syntaxe+ ('<' '/' 'Root' '>');
	

		

operande returns[Float val]
	:
	{int PosouNeg = 1;}
	('-'{PosouNeg = -1; expression = expression + '-';})?
	((id = ID {if (expressmap.containsKey($id.text)) {$val = expressmap.get($id.text) * PosouNeg; expression = expression + $val.toString();}}
	| i1 = INT {$val = Float.valueOf($i1.text) * PosouNeg; expression = expression + $val.toString();}
	| f1 = FLOAT {$val = Float.valueOf($f1.text) * PosouNeg; expression = expression + $val.toString();})
	| ('(' {expression = expression + '(';} mult = expMult ')'{$val = $mult.val * PosouNeg;expression = expression + ')';}));
	
//Une expression *,/ est composée d'une opérande ou d'une multiplication
//ou division entre opérandes.
expMult 	returns [Float val]
	:
	ope = operande {$val = $ope.val;}
	('*'  {expression = expression + '*';} mult = operande{$val = $val*$mult.val;}
	|'/'  {expression = expression + '/';} div = operande{$val = $val/$div.val;})*;

//Comme vu en cours, une expression PlusMoins est composée d'une
//expression MultiplcationDivision ou d'une addition / soustraction
//de deux expression MultiplcationDivision, afin de respecter la
//priorité des opérateurs (les opérations + ou - seront en haut
//de l'arbre syntaxique.
expPlus returns [Float val]
	:
	ope = expMult {$val = $ope.val;}
	('-'{ expression = expression + '-';} moins = expMult{$val = $val - $moins.val; expression = expression + '-';}
	'+'{ expression = expression + '+';}  plus = expMult{$val = $val + $plus.val;})*;

// Une ligne de calcul est composée d'une expression ou d'une
// déclaration / définition de variable et se termine par un ';'
expre returns [Float val]	:
	(exp = expPlus{$val = $exp.val;}) 
	;

// Un calcul est composé d'une ou plusieurs lignes
animation returns [String result]	:	  {expression = "";} xp = nombre{$result = $xp.text; expression =  $result;} | expr = expre{$result = $expr.val.toString(); resultat=Float.valueOf($result);};


