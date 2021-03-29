// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g 2017-11-12 15:32:46
package parser;
import java.util.HashMap;
import Lib3d.*;
import Lib3d.GlSceneGraph.*;
import Lib3d.Loader.*;
import Lib3d.SceneGraph.*;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class XGDParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'-'", "'Transform'", "';'", "'type'", "'='", "'nom'", "'Translation'", "'{'", "','", "'}'", "'Rotation'", "'Scale'", "'Group'", "'Geometry'", "'Cone'", "'Material'", "':'", "'Sphere'", "'Cylinder'", "'Cube'", "'Teapot'", "'Tetrahedron'", "'Torus'", "'Ka'", "'Kd'", "'Ks'", "'d'", "'Ns'", "'textureScale'", "'textureFile'", "'<'", "'>'", "'/'", "'Root'", "'('", "')'", "'*'", "'+'", "'animation'"
    };
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ID=4;
    public static final int INT=5;
    public static final int EXPONENT=6;
    public static final int FLOAT=7;
    public static final int COMMENT=8;
    public static final int WS=9;
    public static final int ESC_SEQ=10;
    public static final int STRING=11;
    public static final int CHAR=12;
    public static final int HEX_DIGIT=13;
    public static final int UNICODE_ESC=14;
    public static final int OCTAL_ESC=15;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "sphere", "cube", "group", "root", "expre", "animation", 
        "expPlus", "scale", "nombre", "torus", "translation", "cylinder", 
        "geometry", "syntaxe", "transform", "rotation", "operande", "expMult", 
        "couleur", "teapot", "cone", "tetrahedron"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public XGDParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public XGDParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public XGDParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return XGDParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g"; }


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


    public static class nombre_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nombre"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:84:1: nombre : ( '-' )? ( INT | FLOAT ) ;
    public final XGDParser.nombre_return nombre() throws RecognitionException {
        XGDParser.nombre_return retval = new XGDParser.nombre_return();
        retval.start = input.LT(1);

        try { dbg.enterRule(getGrammarFileName(), "nombre");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:84:8: ( ( '-' )? ( INT | FLOAT ) )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:84:10: ( '-' )? ( INT | FLOAT )
            {
            dbg.location(84,10);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:84:10: ( '-' )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:84:10: '-'
                    {
                    dbg.location(84,10);
                    match(input,16,FOLLOW_16_in_nombre569); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(84,14);
            if ( input.LA(1)==INT||input.LA(1)==FLOAT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(84, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nombre");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nombre"


    // $ANTLR start "transform"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:87:1: transform : 'Transform' ';' 'type' '=' ( translation | rotation | scale )+ ';' 'nom' '=' STRING ';' ;
    public final void transform() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "transform");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:87:11: ( 'Transform' ';' 'type' '=' ( translation | rotation | scale )+ ';' 'nom' '=' STRING ';' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:90:3: 'Transform' ';' 'type' '=' ( translation | rotation | scale )+ ';' 'nom' '=' STRING ';'
            {
            dbg.location(90,3);
            match(input,17,FOLLOW_17_in_transform589); 
            dbg.location(90,14);
            match(input,18,FOLLOW_18_in_transform590); 
            dbg.location(90,17);
            match(input,19,FOLLOW_19_in_transform591); 
            dbg.location(90,23);
            match(input,20,FOLLOW_20_in_transform592); 
            dbg.location(90,27);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:90:27: ( translation | rotation | scale )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=4;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 27:
                    {
                    alt2=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:90:28: translation
            	    {
            	    dbg.location(90,28);
            	    pushFollow(FOLLOW_translation_in_transform595);
            	    translation();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:90:42: rotation
            	    {
            	    dbg.location(90,42);
            	    pushFollow(FOLLOW_rotation_in_transform599);
            	    rotation();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:90:53: scale
            	    {
            	    dbg.location(90,53);
            	    pushFollow(FOLLOW_scale_in_transform603);
            	    scale();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(90,61);
            match(input,18,FOLLOW_18_in_transform607); 
            dbg.location(90,64);
            match(input,21,FOLLOW_21_in_transform608); 
            dbg.location(90,69);
            match(input,20,FOLLOW_20_in_transform609); 
            dbg.location(90,73);
            match(input,STRING,FOLLOW_STRING_in_transform611); 
            dbg.location(90,80);
            match(input,18,FOLLOW_18_in_transform613); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(90, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "transform");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "transform"


    // $ANTLR start "translation"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:92:1: translation : 'Translation' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}' ;
    public final void translation() throws RecognitionException {
        String coordx = null;

        String coordy = null;

        String coordz = null;


        try { dbg.enterRule(getGrammarFileName(), "translation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:93:2: ( 'Translation' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:93:4: 'Translation' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}'
            {
            dbg.location(93,4);
            match(input,22,FOLLOW_22_in_translation625); 
            dbg.location(93,17);
            match(input,23,FOLLOW_23_in_translation626); 
            dbg.location(93,26);
            pushFollow(FOLLOW_animation_in_translation629);
            coordx=animation();

            state._fsp--;

            dbg.location(93,36);
            String x = expression;
            dbg.location(94,10);
            match(input,24,FOLLOW_24_in_translation641); 
            dbg.location(94,19);
            pushFollow(FOLLOW_animation_in_translation644);
            coordy=animation();

            state._fsp--;

            dbg.location(94,29);
            String y = expression;
            dbg.location(95,10);
            match(input,24,FOLLOW_24_in_translation656); 
            dbg.location(95,19);
            pushFollow(FOLLOW_animation_in_translation659);
            coordz=animation();

            state._fsp--;

            dbg.location(95,29);
            String z = expression;
            dbg.location(96,10);
            match(input,25,FOLLOW_25_in_translation671); 
            dbg.location(96,13);
            Vector3d vector_translation = new Vector3d(Float.valueOf(coordx),Float.valueOf(coordy),Float.valueOf(coordz));
            			      Lib3d.GlSceneGraph.Translation node_translation = new Lib3d.GlSceneGraph.Translation(vector_translation);
            			      currentNode.addChild(node_translation); 
            			      currentNode = node_translation; 
            			      String[] translations = {x,y,z};
            			      transmap.put(node_translation,translations);
            			      stack.push(node_translation);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(102, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "translation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "translation"


    // $ANTLR start "rotation"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:104:1: rotation : 'Rotation' '{' coordx= animation ',' coordy= animation ',' coordz= animation ',' ang= animation '}' ;
    public final void rotation() throws RecognitionException {
        String coordx = null;

        String coordy = null;

        String coordz = null;

        String ang = null;


        try { dbg.enterRule(getGrammarFileName(), "rotation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:104:9: ( 'Rotation' '{' coordx= animation ',' coordy= animation ',' coordz= animation ',' ang= animation '}' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:104:11: 'Rotation' '{' coordx= animation ',' coordy= animation ',' coordz= animation ',' ang= animation '}'
            {
            dbg.location(104,11);
            match(input,26,FOLLOW_26_in_rotation680); 
            dbg.location(104,23);
            match(input,23,FOLLOW_23_in_rotation683); 
            dbg.location(104,32);
            pushFollow(FOLLOW_animation_in_rotation686);
            coordx=animation();

            state._fsp--;

            dbg.location(104,42);
            String x= expression;
            dbg.location(105,10);
            match(input,24,FOLLOW_24_in_rotation698); 
            dbg.location(105,19);
            pushFollow(FOLLOW_animation_in_rotation701);
            coordy=animation();

            state._fsp--;

            dbg.location(105,29);
            String y=expression;
            dbg.location(106,10);
            match(input,24,FOLLOW_24_in_rotation713); 
            dbg.location(106,19);
            pushFollow(FOLLOW_animation_in_rotation716);
            coordz=animation();

            state._fsp--;

            dbg.location(106,29);
            String z=expression;
            dbg.location(107,10);
            match(input,24,FOLLOW_24_in_rotation728); 
            dbg.location(107,16);
            pushFollow(FOLLOW_animation_in_rotation731);
            ang=animation();

            state._fsp--;

            dbg.location(107,26);
            String angle=expression;
            dbg.location(108,10);
            match(input,25,FOLLOW_25_in_rotation743); 
            dbg.location(108,13);
            Vector3d vector_rotation = new Vector3d(Float.valueOf(coordx),Float.valueOf(coordy),Float.valueOf(coordz));
            			      Lib3d.GlSceneGraph.Rotation node_rotation = new Lib3d.GlSceneGraph.Rotation(vector_rotation,Float.valueOf(ang));
            			      currentNode.addChild(node_rotation); 
            			      currentNode = node_rotation; 
            			      String[]rotations = {x,y,z,angle};
            			      rotamap.put(node_rotation,rotations);
            			      stack.push(node_rotation);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(114, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rotation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rotation"


    // $ANTLR start "scale"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:116:1: scale : 'Scale' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}' ;
    public final void scale() throws RecognitionException {
        String coordx = null;

        String coordy = null;

        String coordz = null;


        try { dbg.enterRule(getGrammarFileName(), "scale");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:116:7: ( 'Scale' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:116:11: 'Scale' '{' coordx= animation ',' coordy= animation ',' coordz= animation '}'
            {
            dbg.location(116,11);
            match(input,27,FOLLOW_27_in_scale754); 
            dbg.location(116,18);
            match(input,23,FOLLOW_23_in_scale755); 
            dbg.location(116,33);
            pushFollow(FOLLOW_animation_in_scale764);
            coordx=animation();

            state._fsp--;

            dbg.location(116,43);
            String x= expression;
            dbg.location(117,10);
            match(input,24,FOLLOW_24_in_scale776); 
            dbg.location(117,19);
            pushFollow(FOLLOW_animation_in_scale779);
            coordy=animation();

            state._fsp--;

            dbg.location(117,29);
            String y= expression;
            dbg.location(118,10);
            match(input,24,FOLLOW_24_in_scale791); 
            dbg.location(118,19);
            pushFollow(FOLLOW_animation_in_scale794);
            coordz=animation();

            state._fsp--;

            dbg.location(118,29);
            String z= expression;
            dbg.location(119,10);
            match(input,25,FOLLOW_25_in_scale806); 
            dbg.location(119,13);
            Vector3d vector_scale =new Vector3d(Float.valueOf(coordx),Float.valueOf(coordy),Float.valueOf(coordz));
            			      Lib3d.GlSceneGraph.Scale node_scale = new Lib3d.GlSceneGraph.Scale(vector_scale);
            			      currentNode.addChild(node_scale); 
            			      currentNode = node_scale; 
            			      String[]scales = {x,y,z};
            			      scamap.put(node_scale,scales);
            			      stack.push(node_scale);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(125, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scale");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "scale"


    // $ANTLR start "group"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:127:1: group : 'Group' ';' 'nom' '=' g= STRING ';' ;
    public final void group() throws RecognitionException {
        Token g=null;

        try { dbg.enterRule(getGrammarFileName(), "group");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:127:8: ( 'Group' ';' 'nom' '=' g= STRING ';' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:127:13: 'Group' ';' 'nom' '=' g= STRING ';'
            {
            dbg.location(127,13);
            match(input,28,FOLLOW_28_in_group819); 
            dbg.location(127,20);
            match(input,18,FOLLOW_18_in_group820); 
            dbg.location(127,25);
            match(input,21,FOLLOW_21_in_group823); 
            dbg.location(127,30);
            match(input,20,FOLLOW_20_in_group824); 
            dbg.location(128,6);
            g=(Token)match(input,STRING,FOLLOW_STRING_in_group833); 
            dbg.location(128,13);
            if(mapgroup.get((g!=null?g.getText():null)) != null)
            			{
            				Lib3d.GlSceneGraph.Group node = mapgroup.get((g!=null?g.getText():null));
            				currentNode.addChild(node);
            				currentNode = node;
            				stack.push(node);
            			}
            			else
            			{
            				Lib3d.GlSceneGraph.Group node = new Lib3d.GlSceneGraph.Group();
            				mapgroup.put((g!=null?g.getText():null),node);
            				currentNode.addChild(node);
            				currentNode = node;
            				stack.push(node);
            			}	
            			
            dbg.location(143,5);
            match(input,18,FOLLOW_18_in_group835); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(143, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "group");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "group"


    // $ANTLR start "geometry"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:1: geometry : 'Geometry' ';' 'type' '=' ( cone | cube | cylinder | sphere | teapot | tetrahedron | torus ) ;
    public final void geometry() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "geometry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:9: ( 'Geometry' ';' 'type' '=' ( cone | cube | cylinder | sphere | teapot | tetrahedron | torus ) )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:11: 'Geometry' ';' 'type' '=' ( cone | cube | cylinder | sphere | teapot | tetrahedron | torus )
            {
            dbg.location(146,11);
            match(input,29,FOLLOW_29_in_geometry843); 
            dbg.location(146,21);
            match(input,18,FOLLOW_18_in_geometry844); 
            dbg.location(146,24);
            match(input,19,FOLLOW_19_in_geometry845); 
            dbg.location(146,30);
            match(input,20,FOLLOW_20_in_geometry846); 
            dbg.location(146,34);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:34: ( cone | cube | cylinder | sphere | teapot | tetrahedron | torus )
            int alt3=7;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            case 36:
                {
                alt3=5;
                }
                break;
            case 37:
                {
                alt3=6;
                }
                break;
            case 38:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:35: cone
                    {
                    dbg.location(146,35);
                    pushFollow(FOLLOW_cone_in_geometry849);
                    cone();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:40: cube
                    {
                    dbg.location(146,40);
                    pushFollow(FOLLOW_cube_in_geometry851);
                    cube();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:45: cylinder
                    {
                    dbg.location(146,45);
                    pushFollow(FOLLOW_cylinder_in_geometry853);
                    cylinder();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:54: sphere
                    {
                    dbg.location(146,54);
                    pushFollow(FOLLOW_sphere_in_geometry855);
                    sphere();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:61: teapot
                    {
                    dbg.location(146,61);
                    pushFollow(FOLLOW_teapot_in_geometry857);
                    teapot();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:68: tetrahedron
                    {
                    dbg.location(146,68);
                    pushFollow(FOLLOW_tetrahedron_in_geometry859);
                    tetrahedron();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:146:80: torus
                    {
                    dbg.location(146,80);
                    pushFollow(FOLLOW_torus_in_geometry861);
                    torus();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(146, 86);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "geometry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "geometry"


    // $ANTLR start "cone"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:148:1: cone : ( ( 'Cone' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cone' ';' 'nom' '=' str= STRING ';' ) );
    public final void cone() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;

        XGDParser.nombre_return i1 = null;


        try { dbg.enterRule(getGrammarFileName(), "cone");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:148:6: ( ( 'Cone' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cone' ';' 'nom' '=' str= STRING ';' ) )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:148:9: ( 'Cone' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(148,9);
                    float base; float height; int slices; int stacks;
                    dbg.location(149,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:149:3: ( 'Cone' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:149:4: 'Cone' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(149,4);
                    match(input,30,FOLLOW_30_in_cone876); 
                    dbg.location(149,10);
                    match(input,23,FOLLOW_23_in_cone877); 
                    dbg.location(150,5);
                    pushFollow(FOLLOW_nombre_in_cone883);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(150,12);
                    base = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(151,3);
                    match(input,24,FOLLOW_24_in_cone888); 
                    dbg.location(151,8);
                    pushFollow(FOLLOW_nombre_in_cone891);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(151,15);
                    height = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(152,3);
                    match(input,24,FOLLOW_24_in_cone896); 
                    dbg.location(152,9);
                    pushFollow(FOLLOW_nombre_in_cone900);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(152,16);
                    slices= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(153,3);
                    match(input,24,FOLLOW_24_in_cone905); 
                    dbg.location(153,9);
                    pushFollow(FOLLOW_nombre_in_cone909);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(153,16);
                    stacks= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(153,52);
                    match(input,25,FOLLOW_25_in_cone911); 
                    dbg.location(154,4);
                    match(input,18,FOLLOW_18_in_cone916); 
                    dbg.location(154,7);
                    match(input,21,FOLLOW_21_in_cone917); 
                    dbg.location(154,12);
                    match(input,20,FOLLOW_20_in_cone918); 
                    dbg.location(154,19);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cone922); 
                    dbg.location(154,26);
                    mapi.put((str!=null?str.getText():null),new Cone(base,height,slices,stacks));
                    dbg.location(155,4);
                    match(input,18,FOLLOW_18_in_cone928); 
                    dbg.location(155,7);
                    match(input,31,FOLLOW_31_in_cone929); 
                    dbg.location(155,17);
                    match(input,32,FOLLOW_32_in_cone930); 
                    dbg.location(156,4);
                    match(input,21,FOLLOW_21_in_cone935); 
                    dbg.location(156,9);
                    match(input,20,FOLLOW_20_in_cone936); 
                    dbg.location(156,17);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_cone939); 
                    dbg.location(156,24);
                    match(input,18,FOLLOW_18_in_cone940); 
                    dbg.location(156,27);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:156:27: ( couleur[$idmat.text] )?
                    int alt4=2;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==39) ) {
                        alt4=1;
                    }
                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:156:28: couleur[$idmat.text]
                            {
                            dbg.location(156,28);
                            pushFollow(FOLLOW_couleur_in_cone942);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(157,3);

                    		 	if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    				
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:164:3: ( 'Cone' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(164,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:164:3: ( 'Cone' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:164:4: 'Cone' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(164,4);
                    match(input,30,FOLLOW_30_in_cone959); 
                    dbg.location(164,11);
                    match(input,18,FOLLOW_18_in_cone961); 
                    dbg.location(164,16);
                    match(input,21,FOLLOW_21_in_cone964); 
                    dbg.location(164,21);
                    match(input,20,FOLLOW_20_in_cone965); 
                    dbg.location(164,28);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cone969); 
                    dbg.location(165,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(170,4);
                    match(input,18,FOLLOW_18_in_cone974); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(170, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cone");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cone"


    // $ANTLR start "sphere"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:173:1: sphere : ( ( 'Sphere' '{' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Sphere' ';' 'nom' '=' str= STRING ';' ) );
    public final void sphere() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;

        XGDParser.nombre_return i1 = null;


        try { dbg.enterRule(getGrammarFileName(), "sphere");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:173:9: ( ( 'Sphere' '{' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Sphere' ';' 'nom' '=' str= STRING ';' ) )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    alt7=1;
                }
                else if ( (LA7_1==18) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:173:11: ( 'Sphere' '{' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(173,11);
                    Sphere spher; float radius; int slices; int stacks;
                    dbg.location(174,2);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:174:2: ( 'Sphere' '{' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:174:3: 'Sphere' '{' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(174,3);
                    match(input,33,FOLLOW_33_in_sphere993); 
                    dbg.location(174,11);
                    match(input,23,FOLLOW_23_in_sphere994); 
                    dbg.location(175,4);
                    pushFollow(FOLLOW_nombre_in_sphere999);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(175,11);
                    radius = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(176,2);
                    match(input,24,FOLLOW_24_in_sphere1003); 
                    dbg.location(176,8);
                    pushFollow(FOLLOW_nombre_in_sphere1007);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(176,15);
                    slices= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(177,2);
                    match(input,24,FOLLOW_24_in_sphere1011); 
                    dbg.location(177,8);
                    pushFollow(FOLLOW_nombre_in_sphere1015);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(177,15);
                    stacks= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(177,51);
                    match(input,25,FOLLOW_25_in_sphere1017); 
                    dbg.location(177,54);
                    spher = new Sphere(radius,slices,stacks);
                    dbg.location(178,2);
                    match(input,18,FOLLOW_18_in_sphere1022); 
                    dbg.location(178,7);
                    match(input,21,FOLLOW_21_in_sphere1025); 
                    dbg.location(178,12);
                    match(input,20,FOLLOW_20_in_sphere1026); 
                    dbg.location(178,19);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_sphere1030); 
                    dbg.location(178,26);
                    mapi.put((str!=null?str.getText():null),spher);
                    dbg.location(179,2);
                    match(input,18,FOLLOW_18_in_sphere1034); 
                    dbg.location(179,5);
                    match(input,31,FOLLOW_31_in_sphere1035); 
                    dbg.location(179,15);
                    match(input,32,FOLLOW_32_in_sphere1036); 
                    dbg.location(180,2);
                    match(input,21,FOLLOW_21_in_sphere1039); 
                    dbg.location(180,7);
                    match(input,20,FOLLOW_20_in_sphere1040); 
                    dbg.location(180,15);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_sphere1043); 
                    dbg.location(180,22);
                    match(input,18,FOLLOW_18_in_sphere1044); 
                    dbg.location(180,25);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:180:25: ( couleur[$idmat.text] )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==39) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:180:26: couleur[$idmat.text]
                            {
                            dbg.location(180,26);
                            pushFollow(FOLLOW_couleur_in_sphere1046);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(181,3);

                    		 	if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:187:3: ( 'Sphere' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(187,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:187:3: ( 'Sphere' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:187:4: 'Sphere' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(187,4);
                    match(input,33,FOLLOW_33_in_sphere1064); 
                    dbg.location(187,13);
                    match(input,18,FOLLOW_18_in_sphere1066); 
                    dbg.location(187,18);
                    match(input,21,FOLLOW_21_in_sphere1069); 
                    dbg.location(187,23);
                    match(input,20,FOLLOW_20_in_sphere1070); 
                    dbg.location(187,30);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_sphere1074); 
                    dbg.location(188,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(193,4);
                    match(input,18,FOLLOW_18_in_sphere1079); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(193, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sphere");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sphere"


    // $ANTLR start "cylinder"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:196:1: cylinder : ( ( 'Cylinder' '{' f1= nombre ',' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cylinder' ';' 'nom' '=' str= STRING ';' ) );
    public final void cylinder() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;

        XGDParser.nombre_return i1 = null;


        try { dbg.enterRule(getGrammarFileName(), "cylinder");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:196:10: ( ( 'Cylinder' '{' f1= nombre ',' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cylinder' ';' 'nom' '=' str= STRING ';' ) )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else if ( (LA9_1==18) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:196:11: ( 'Cylinder' '{' f1= nombre ',' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(196,11);
                    Cylinder cyl;float base; float top; float height; int slices; int stacks;
                    dbg.location(197,2);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:197:2: ( 'Cylinder' '{' f1= nombre ',' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:197:3: 'Cylinder' '{' f1= nombre ',' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(197,3);
                    match(input,34,FOLLOW_34_in_cylinder1094); 
                    dbg.location(197,13);
                    match(input,23,FOLLOW_23_in_cylinder1095); 
                    dbg.location(197,18);
                    pushFollow(FOLLOW_nombre_in_cylinder1098);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(197,25);
                    base = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(198,2);
                    match(input,24,FOLLOW_24_in_cylinder1102); 
                    dbg.location(198,7);
                    pushFollow(FOLLOW_nombre_in_cylinder1105);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(198,14);
                    top = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(199,2);
                    match(input,24,FOLLOW_24_in_cylinder1109); 
                    dbg.location(199,7);
                    pushFollow(FOLLOW_nombre_in_cylinder1112);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(199,14);
                    height = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(200,2);
                    match(input,24,FOLLOW_24_in_cylinder1116); 
                    dbg.location(200,8);
                    pushFollow(FOLLOW_nombre_in_cylinder1120);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(200,15);
                    slices= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(201,2);
                    match(input,24,FOLLOW_24_in_cylinder1124); 
                    dbg.location(201,8);
                    pushFollow(FOLLOW_nombre_in_cylinder1128);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(201,15);
                    stacks= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(201,51);
                    match(input,25,FOLLOW_25_in_cylinder1130); 
                    dbg.location(202,2);
                    match(input,18,FOLLOW_18_in_cylinder1133); 
                    dbg.location(202,7);
                    match(input,21,FOLLOW_21_in_cylinder1136); 
                    dbg.location(202,12);
                    match(input,20,FOLLOW_20_in_cylinder1137); 
                    dbg.location(202,19);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cylinder1141); 
                    dbg.location(202,26);
                    cyl = new Cylinder(base,top,height,slices,stacks);mapi.put((str!=null?str.getText():null),cyl);
                    dbg.location(203,2);
                    match(input,18,FOLLOW_18_in_cylinder1145); 
                    dbg.location(203,5);
                    match(input,31,FOLLOW_31_in_cylinder1146); 
                    dbg.location(203,15);
                    match(input,32,FOLLOW_32_in_cylinder1147); 
                    dbg.location(204,2);
                    match(input,21,FOLLOW_21_in_cylinder1150); 
                    dbg.location(204,7);
                    match(input,20,FOLLOW_20_in_cylinder1151); 
                    dbg.location(204,15);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_cylinder1154); 
                    dbg.location(204,22);
                    match(input,18,FOLLOW_18_in_cylinder1155); 
                    dbg.location(204,25);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:204:25: ( couleur[$idmat.text] )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==39) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:204:26: couleur[$idmat.text]
                            {
                            dbg.location(204,26);
                            pushFollow(FOLLOW_couleur_in_cylinder1157);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(205,3);

                    			if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:211:3: ( 'Cylinder' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(211,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:211:3: ( 'Cylinder' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:211:4: 'Cylinder' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(211,4);
                    match(input,34,FOLLOW_34_in_cylinder1175); 
                    dbg.location(211,15);
                    match(input,18,FOLLOW_18_in_cylinder1177); 
                    dbg.location(211,20);
                    match(input,21,FOLLOW_21_in_cylinder1180); 
                    dbg.location(211,25);
                    match(input,20,FOLLOW_20_in_cylinder1181); 
                    dbg.location(211,32);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cylinder1185); 
                    dbg.location(212,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(217,4);
                    match(input,18,FOLLOW_18_in_cylinder1190); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(217, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cylinder");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cylinder"


    // $ANTLR start "cube"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:220:1: cube : ( ( 'Cube' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cube' ';' 'nom' '=' str= STRING ';' ) );
    public final void cube() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;


        try { dbg.enterRule(getGrammarFileName(), "cube");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(220, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:220:7: ( ( 'Cube' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Cube' ';' 'nom' '=' str= STRING ';' ) )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else if ( (LA11_1==18) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:220:9: ( 'Cube' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(220,9);
                    float size;
                    dbg.location(221,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:221:3: ( 'Cube' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:221:4: 'Cube' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(221,4);
                    match(input,35,FOLLOW_35_in_cube1208); 
                    dbg.location(221,10);
                    match(input,23,FOLLOW_23_in_cube1209); 
                    dbg.location(221,15);
                    pushFollow(FOLLOW_nombre_in_cube1212);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(221,22);
                    size = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(221,55);
                    match(input,25,FOLLOW_25_in_cube1214); 
                    dbg.location(222,3);
                    match(input,18,FOLLOW_18_in_cube1218); 
                    dbg.location(222,8);
                    match(input,21,FOLLOW_21_in_cube1221); 
                    dbg.location(222,13);
                    match(input,20,FOLLOW_20_in_cube1222); 
                    dbg.location(222,20);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cube1226); 
                    dbg.location(222,27);
                    mapi.put((str!=null?str.getText():null),new Cube(size));
                    dbg.location(223,3);
                    match(input,18,FOLLOW_18_in_cube1231); 
                    dbg.location(223,6);
                    match(input,31,FOLLOW_31_in_cube1232); 
                    dbg.location(223,16);
                    match(input,32,FOLLOW_32_in_cube1233); 
                    dbg.location(224,3);
                    match(input,21,FOLLOW_21_in_cube1237); 
                    dbg.location(224,8);
                    match(input,20,FOLLOW_20_in_cube1238); 
                    dbg.location(224,16);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_cube1241); 
                    dbg.location(224,23);
                    match(input,18,FOLLOW_18_in_cube1242); 
                    dbg.location(224,26);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:224:26: ( couleur[$idmat.text] )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==39) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:224:27: couleur[$idmat.text]
                            {
                            dbg.location(224,27);
                            pushFollow(FOLLOW_couleur_in_cube1244);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(225,3);

                    			if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:231:3: ( 'Cube' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(231,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:231:3: ( 'Cube' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:231:4: 'Cube' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(231,4);
                    match(input,35,FOLLOW_35_in_cube1261); 
                    dbg.location(231,11);
                    match(input,18,FOLLOW_18_in_cube1263); 
                    dbg.location(231,16);
                    match(input,21,FOLLOW_21_in_cube1266); 
                    dbg.location(231,21);
                    match(input,20,FOLLOW_20_in_cube1267); 
                    dbg.location(231,28);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_cube1271); 
                    dbg.location(232,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(237,4);
                    match(input,18,FOLLOW_18_in_cube1276); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(237, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cube");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cube"


    // $ANTLR start "teapot"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:240:1: teapot : ( ( 'Teapot' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Teapot' ';' 'nom' '=' str= STRING ';' ) );
    public final void teapot() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;


        try { dbg.enterRule(getGrammarFileName(), "teapot");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(240, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:240:9: ( ( 'Teapot' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Teapot' ';' 'nom' '=' str= STRING ';' ) )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==23) ) {
                    alt13=1;
                }
                else if ( (LA13_1==18) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:240:11: ( 'Teapot' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(240,11);
                    float size;
                    dbg.location(241,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:241:3: ( 'Teapot' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:241:4: 'Teapot' '{' f1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(241,4);
                    match(input,36,FOLLOW_36_in_teapot1292); 
                    dbg.location(241,12);
                    match(input,23,FOLLOW_23_in_teapot1293); 
                    dbg.location(241,17);
                    pushFollow(FOLLOW_nombre_in_teapot1296);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(241,24);
                    size = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(241,57);
                    match(input,25,FOLLOW_25_in_teapot1298); 
                    dbg.location(242,3);
                    match(input,18,FOLLOW_18_in_teapot1302); 
                    dbg.location(242,7);
                    match(input,21,FOLLOW_21_in_teapot1304); 
                    dbg.location(242,12);
                    match(input,20,FOLLOW_20_in_teapot1305); 
                    dbg.location(242,19);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_teapot1309); 
                    dbg.location(242,26);
                    mapi.put((str!=null?str.getText():null),new Teapot(size));
                    dbg.location(243,3);
                    match(input,18,FOLLOW_18_in_teapot1314); 
                    dbg.location(243,6);
                    match(input,31,FOLLOW_31_in_teapot1315); 
                    dbg.location(243,16);
                    match(input,32,FOLLOW_32_in_teapot1316); 
                    dbg.location(244,3);
                    match(input,21,FOLLOW_21_in_teapot1320); 
                    dbg.location(244,8);
                    match(input,20,FOLLOW_20_in_teapot1321); 
                    dbg.location(244,16);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_teapot1324); 
                    dbg.location(244,23);
                    match(input,18,FOLLOW_18_in_teapot1325); 
                    dbg.location(244,26);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:244:26: ( couleur[$idmat.text] )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==39) ) {
                        alt12=1;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:244:27: couleur[$idmat.text]
                            {
                            dbg.location(244,27);
                            pushFollow(FOLLOW_couleur_in_teapot1327);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(245,3);

                    		 	if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:251:3: ( 'Teapot' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(251,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:251:3: ( 'Teapot' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:251:4: 'Teapot' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(251,4);
                    match(input,36,FOLLOW_36_in_teapot1344); 
                    dbg.location(251,13);
                    match(input,18,FOLLOW_18_in_teapot1346); 
                    dbg.location(251,18);
                    match(input,21,FOLLOW_21_in_teapot1349); 
                    dbg.location(251,23);
                    match(input,20,FOLLOW_20_in_teapot1350); 
                    dbg.location(251,30);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_teapot1354); 
                    dbg.location(252,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(257,4);
                    match(input,18,FOLLOW_18_in_teapot1359); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(257, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "teapot");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "teapot"


    // $ANTLR start "tetrahedron"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:260:1: tetrahedron : ( ( 'Tetrahedron' '{' '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Tetrahedron' ';' 'nom' '=' str= STRING ';' ) );
    public final void tetrahedron() throws RecognitionException {
        Token str=null;
        Token idmat=null;

        try { dbg.enterRule(getGrammarFileName(), "tetrahedron");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:261:2: ( ( 'Tetrahedron' '{' '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Tetrahedron' ';' 'nom' '=' str= STRING ';' ) )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==23) ) {
                    alt15=1;
                }
                else if ( (LA15_1==18) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:261:4: ( 'Tetrahedron' '{' '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(261,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:261:4: ( 'Tetrahedron' '{' '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:261:5: 'Tetrahedron' '{' '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(261,5);
                    match(input,37,FOLLOW_37_in_tetrahedron1372); 
                    dbg.location(261,18);
                    match(input,23,FOLLOW_23_in_tetrahedron1373); 
                    dbg.location(261,21);
                    match(input,25,FOLLOW_25_in_tetrahedron1374); 
                    dbg.location(262,3);
                    match(input,18,FOLLOW_18_in_tetrahedron1378); 
                    dbg.location(262,7);
                    match(input,21,FOLLOW_21_in_tetrahedron1380); 
                    dbg.location(262,12);
                    match(input,20,FOLLOW_20_in_tetrahedron1381); 
                    dbg.location(262,19);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_tetrahedron1385); 
                    dbg.location(262,26);
                    mapi.put((str!=null?str.getText():null),new Tetrahedron());
                    dbg.location(263,3);
                    match(input,18,FOLLOW_18_in_tetrahedron1390); 
                    dbg.location(263,6);
                    match(input,31,FOLLOW_31_in_tetrahedron1391); 
                    dbg.location(263,16);
                    match(input,32,FOLLOW_32_in_tetrahedron1392); 
                    dbg.location(264,3);
                    match(input,21,FOLLOW_21_in_tetrahedron1396); 
                    dbg.location(264,8);
                    match(input,20,FOLLOW_20_in_tetrahedron1397); 
                    dbg.location(264,16);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_tetrahedron1400); 
                    dbg.location(264,23);
                    match(input,18,FOLLOW_18_in_tetrahedron1401); 
                    dbg.location(264,26);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:264:26: ( couleur[$idmat.text] )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==39) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:264:27: couleur[$idmat.text]
                            {
                            dbg.location(264,27);
                            pushFollow(FOLLOW_couleur_in_tetrahedron1403);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(265,3);

                    		 	if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:271:3: ( 'Tetrahedron' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(271,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:271:3: ( 'Tetrahedron' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:271:4: 'Tetrahedron' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(271,4);
                    match(input,37,FOLLOW_37_in_tetrahedron1421); 
                    dbg.location(271,18);
                    match(input,18,FOLLOW_18_in_tetrahedron1423); 
                    dbg.location(271,23);
                    match(input,21,FOLLOW_21_in_tetrahedron1426); 
                    dbg.location(271,28);
                    match(input,20,FOLLOW_20_in_tetrahedron1427); 
                    dbg.location(271,35);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_tetrahedron1431); 
                    dbg.location(272,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(277,4);
                    match(input,18,FOLLOW_18_in_tetrahedron1436); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(277, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tetrahedron");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "tetrahedron"


    // $ANTLR start "torus"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:280:1: torus : ( ( 'Torus' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Torus' ';' 'nom' '=' str= STRING ';' ) );
    public final void torus() throws RecognitionException {
        Token str=null;
        Token idmat=null;
        XGDParser.nombre_return f1 = null;

        XGDParser.nombre_return i1 = null;


        try { dbg.enterRule(getGrammarFileName(), "torus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(280, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:280:8: ( ( 'Torus' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? ) | ( 'Torus' ';' 'nom' '=' str= STRING ';' ) )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==23) ) {
                    alt17=1;
                }
                else if ( (LA17_1==18) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:280:10: ( 'Torus' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    {
                    dbg.location(280,10);
                    float iradius; float oradius; int sides ; int rings;
                    dbg.location(281,2);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:281:2: ( 'Torus' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )? )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:281:3: 'Torus' '{' f1= nombre ',' f1= nombre ',' i1= nombre ',' i1= nombre '}' ';' 'nom' '=' str= STRING ';' 'Material' ':' 'nom' '=' idmat= STRING ';' ( couleur[$idmat.text] )?
                    {
                    dbg.location(281,3);
                    match(input,38,FOLLOW_38_in_torus1454); 
                    dbg.location(281,10);
                    match(input,23,FOLLOW_23_in_torus1455); 
                    dbg.location(281,15);
                    pushFollow(FOLLOW_nombre_in_torus1458);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(281,22);
                    iradius = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(282,2);
                    match(input,24,FOLLOW_24_in_torus1462); 
                    dbg.location(282,7);
                    pushFollow(FOLLOW_nombre_in_torus1466);
                    f1=nombre();

                    state._fsp--;

                    dbg.location(282,15);
                    oradius = Float.valueOf((f1!=null?input.toString(f1.start,f1.stop):null));
                    dbg.location(283,2);
                    match(input,24,FOLLOW_24_in_torus1470); 
                    dbg.location(283,8);
                    pushFollow(FOLLOW_nombre_in_torus1474);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(283,15);
                    sides= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(284,2);
                    match(input,24,FOLLOW_24_in_torus1478); 
                    dbg.location(284,8);
                    pushFollow(FOLLOW_nombre_in_torus1482);
                    i1=nombre();

                    state._fsp--;

                    dbg.location(284,15);
                    rings= Integer.valueOf((i1!=null?input.toString(i1.start,i1.stop):null));
                    dbg.location(284,50);
                    match(input,25,FOLLOW_25_in_torus1484); 
                    dbg.location(285,2);
                    match(input,18,FOLLOW_18_in_torus1487); 
                    dbg.location(285,6);
                    match(input,21,FOLLOW_21_in_torus1489); 
                    dbg.location(285,11);
                    match(input,20,FOLLOW_20_in_torus1490); 
                    dbg.location(285,18);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_torus1494); 
                    dbg.location(285,25);
                    mapi.put((str!=null?str.getText():null),new Torus(iradius,oradius,sides,rings));
                    dbg.location(286,2);
                    match(input,18,FOLLOW_18_in_torus1498); 
                    dbg.location(286,5);
                    match(input,31,FOLLOW_31_in_torus1499); 
                    dbg.location(286,15);
                    match(input,32,FOLLOW_32_in_torus1500); 
                    dbg.location(287,2);
                    match(input,21,FOLLOW_21_in_torus1503); 
                    dbg.location(287,7);
                    match(input,20,FOLLOW_20_in_torus1504); 
                    dbg.location(287,15);
                    idmat=(Token)match(input,STRING,FOLLOW_STRING_in_torus1507); 
                    dbg.location(287,22);
                    match(input,18,FOLLOW_18_in_torus1508); 
                    dbg.location(287,25);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:287:25: ( couleur[$idmat.text] )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==39) ) {
                        alt16=1;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:287:26: couleur[$idmat.text]
                            {
                            dbg.location(287,26);
                            pushFollow(FOLLOW_couleur_in_torus1510);
                            couleur((idmat!=null?idmat.getText():null));

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(288,3);
                    	
                    			if(mapmat.get((idmat!=null?idmat.getText():null)) != null) {
                    				 mapi.get((str!=null?str.getText():null)).setMaterial(mapmat.get((idmat!=null?idmat.getText():null)));
                    				 currentNode.addChild(mapi.get((str!=null?str.getText():null)));}
                    		

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:294:3: ( 'Torus' ';' 'nom' '=' str= STRING ';' )
                    {
                    dbg.location(294,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:294:3: ( 'Torus' ';' 'nom' '=' str= STRING ';' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:294:4: 'Torus' ';' 'nom' '=' str= STRING ';'
                    {
                    dbg.location(294,4);
                    match(input,38,FOLLOW_38_in_torus1527); 
                    dbg.location(294,12);
                    match(input,18,FOLLOW_18_in_torus1529); 
                    dbg.location(294,17);
                    match(input,21,FOLLOW_21_in_torus1532); 
                    dbg.location(294,22);
                    match(input,20,FOLLOW_20_in_torus1533); 
                    dbg.location(294,29);
                    str=(Token)match(input,STRING,FOLLOW_STRING_in_torus1537); 
                    dbg.location(295,3);

                    			if(mapi.get((str!=null?str.getText():null)) != null)
                    			{
                    				currentNode.addChild(mapi.get((str!=null?str.getText():null)));
                    			}
                    		
                    dbg.location(300,4);
                    match(input,18,FOLLOW_18_in_torus1542); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(300, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "torus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "torus"


    // $ANTLR start "couleur"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:304:1: couleur[String identifiant] : 'Ka' '{' Ka1= nombre ',' Ka2= nombre ',' Ka3= nombre '}' ',' 'Kd' '{' Kd1= nombre ',' Kd2= nombre ',' Kd3= nombre '}' ',' 'Ks' '{' Ks1= nombre ',' Ks2= nombre ',' Ks3= nombre '}' ',' 'd' '=' d= nombre ',' 'Ns' '=' Ns= nombre ',' 'textureScale' '{' v1= nombre ',' v2= nombre '}' ',' 'textureFile' '=' str= STRING ';' ;
    public final void couleur(String identifiant) throws RecognitionException {
        Token str=null;
        XGDParser.nombre_return Ka1 = null;

        XGDParser.nombre_return Ka2 = null;

        XGDParser.nombre_return Ka3 = null;

        XGDParser.nombre_return Kd1 = null;

        XGDParser.nombre_return Kd2 = null;

        XGDParser.nombre_return Kd3 = null;

        XGDParser.nombre_return Ks1 = null;

        XGDParser.nombre_return Ks2 = null;

        XGDParser.nombre_return Ks3 = null;

        XGDParser.nombre_return d = null;

        XGDParser.nombre_return Ns = null;

        XGDParser.nombre_return v1 = null;

        XGDParser.nombre_return v2 = null;


        try { dbg.enterRule(getGrammarFileName(), "couleur");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:304:29: ( 'Ka' '{' Ka1= nombre ',' Ka2= nombre ',' Ka3= nombre '}' ',' 'Kd' '{' Kd1= nombre ',' Kd2= nombre ',' Kd3= nombre '}' ',' 'Ks' '{' Ks1= nombre ',' Ks2= nombre ',' Ks3= nombre '}' ',' 'd' '=' d= nombre ',' 'Ns' '=' Ns= nombre ',' 'textureScale' '{' v1= nombre ',' v2= nombre '}' ',' 'textureFile' '=' str= STRING ';' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:304:30: 'Ka' '{' Ka1= nombre ',' Ka2= nombre ',' Ka3= nombre '}' ',' 'Kd' '{' Kd1= nombre ',' Kd2= nombre ',' Kd3= nombre '}' ',' 'Ks' '{' Ks1= nombre ',' Ks2= nombre ',' Ks3= nombre '}' ',' 'd' '=' d= nombre ',' 'Ns' '=' Ns= nombre ',' 'textureScale' '{' v1= nombre ',' v2= nombre '}' ',' 'textureFile' '=' str= STRING ';'
            {
            dbg.location(304,30);
            Color Ka; Color Kd; Color Ks; float m_d; float m_Ns; Vector2d textureScale; String textureFile ; 
            dbg.location(306,2);
            match(input,39,FOLLOW_39_in_couleur1562); 
            dbg.location(306,6);
            match(input,23,FOLLOW_23_in_couleur1563); 
            dbg.location(306,12);
            pushFollow(FOLLOW_nombre_in_couleur1566);
            Ka1=nombre();

            state._fsp--;

            dbg.location(306,19);
            match(input,24,FOLLOW_24_in_couleur1567); 
            dbg.location(306,25);
            pushFollow(FOLLOW_nombre_in_couleur1570);
            Ka2=nombre();

            state._fsp--;

            dbg.location(306,32);
            match(input,24,FOLLOW_24_in_couleur1571); 
            dbg.location(306,39);
            pushFollow(FOLLOW_nombre_in_couleur1575);
            Ka3=nombre();

            state._fsp--;

            dbg.location(306,46);
            match(input,25,FOLLOW_25_in_couleur1576); 
            dbg.location(307,2);
            match(input,24,FOLLOW_24_in_couleur1579); 
            dbg.location(307,5);
            match(input,40,FOLLOW_40_in_couleur1580); 
            dbg.location(307,9);
            match(input,23,FOLLOW_23_in_couleur1581); 
            dbg.location(307,15);
            pushFollow(FOLLOW_nombre_in_couleur1584);
            Kd1=nombre();

            state._fsp--;

            dbg.location(307,22);
            match(input,24,FOLLOW_24_in_couleur1585); 
            dbg.location(307,28);
            pushFollow(FOLLOW_nombre_in_couleur1588);
            Kd2=nombre();

            state._fsp--;

            dbg.location(307,35);
            match(input,24,FOLLOW_24_in_couleur1589); 
            dbg.location(307,41);
            pushFollow(FOLLOW_nombre_in_couleur1592);
            Kd3=nombre();

            state._fsp--;

            dbg.location(307,48);
            match(input,25,FOLLOW_25_in_couleur1593); 
            dbg.location(308,2);
            match(input,24,FOLLOW_24_in_couleur1596); 
            dbg.location(308,5);
            match(input,41,FOLLOW_41_in_couleur1597); 
            dbg.location(308,9);
            match(input,23,FOLLOW_23_in_couleur1598); 
            dbg.location(308,15);
            pushFollow(FOLLOW_nombre_in_couleur1601);
            Ks1=nombre();

            state._fsp--;

            dbg.location(308,22);
            match(input,24,FOLLOW_24_in_couleur1602); 
            dbg.location(308,28);
            pushFollow(FOLLOW_nombre_in_couleur1605);
            Ks2=nombre();

            state._fsp--;

            dbg.location(308,35);
            match(input,24,FOLLOW_24_in_couleur1606); 
            dbg.location(308,42);
            pushFollow(FOLLOW_nombre_in_couleur1610);
            Ks3=nombre();

            state._fsp--;

            dbg.location(308,49);
            match(input,25,FOLLOW_25_in_couleur1611); 
            dbg.location(309,2);
            match(input,24,FOLLOW_24_in_couleur1614); 
            dbg.location(309,5);
            match(input,42,FOLLOW_42_in_couleur1615); 
            dbg.location(309,8);
            match(input,20,FOLLOW_20_in_couleur1616); 
            dbg.location(309,13);
            pushFollow(FOLLOW_nombre_in_couleur1620);
            d=nombre();

            state._fsp--;

            dbg.location(309,20);
            m_d=Float.valueOf((d!=null?input.toString(d.start,d.stop):null));
            dbg.location(310,2);
            match(input,24,FOLLOW_24_in_couleur1624); 
            dbg.location(310,5);
            match(input,43,FOLLOW_43_in_couleur1625); 
            dbg.location(310,9);
            match(input,20,FOLLOW_20_in_couleur1626); 
            dbg.location(310,15);
            pushFollow(FOLLOW_nombre_in_couleur1630);
            Ns=nombre();

            state._fsp--;

            dbg.location(310,22);
            m_Ns=Float.valueOf((Ns!=null?input.toString(Ns.start,Ns.stop):null));
            dbg.location(311,2);
            match(input,24,FOLLOW_24_in_couleur1634); 
            dbg.location(311,5);
            match(input,44,FOLLOW_44_in_couleur1635); 
            dbg.location(311,19);
            match(input,23,FOLLOW_23_in_couleur1636); 
            dbg.location(311,25);
            pushFollow(FOLLOW_nombre_in_couleur1640);
            v1=nombre();

            state._fsp--;

            dbg.location(311,32);
            match(input,24,FOLLOW_24_in_couleur1641); 
            dbg.location(311,38);
            pushFollow(FOLLOW_nombre_in_couleur1645);
            v2=nombre();

            state._fsp--;

            dbg.location(311,46);
            match(input,25,FOLLOW_25_in_couleur1647); 
            dbg.location(312,2);
            match(input,24,FOLLOW_24_in_couleur1650); 
            dbg.location(312,5);
            match(input,45,FOLLOW_45_in_couleur1651); 
            dbg.location(312,18);
            match(input,20,FOLLOW_20_in_couleur1652); 
            dbg.location(312,25);
            str=(Token)match(input,STRING,FOLLOW_STRING_in_couleur1656); 
            dbg.location(312,32);
            textureFile = (str!=null?str.getText():null);
            dbg.location(313,2);
            match(input,18,FOLLOW_18_in_couleur1660); 
            dbg.location(313,5);
             Kd= new Color(Float.valueOf((Kd1!=null?input.toString(Kd1.start,Kd1.stop):null)),Float.valueOf((Kd2!=null?input.toString(Kd2.start,Kd2.stop):null)),Float.valueOf((Kd3!=null?input.toString(Kd3.start,Kd3.stop):null)));
            	     Ka= new Color(Float.valueOf((Ka1!=null?input.toString(Ka1.start,Ka1.stop):null)),Float.valueOf((Ka2!=null?input.toString(Ka2.start,Ka2.stop):null)), Float.valueOf((Ka3!=null?input.toString(Ka3.start,Ka3.stop):null)));
            	     Ks=new Color(Float.valueOf((Ks1!=null?input.toString(Ks1.start,Ks1.stop):null)),Float.valueOf((Ks2!=null?input.toString(Ks2.start,Ks2.stop):null)),Float.valueOf((Ks3!=null?input.toString(Ks3.start,Ks3.stop):null)));
            	     textureScale = new Vector2d(Float.valueOf((v1!=null?input.toString(v1.start,v1.stop):null)),Float.valueOf((v2!=null?input.toString(v2.start,v2.stop):null)));
            	     mapmat.put(identifiant,new Material(identifiant,Ka,Kd,Ks,m_d,m_Ns,textureScale,textureFile));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(317, 101);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "couleur");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "couleur"


    // $ANTLR start "syntaxe"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:320:1: syntaxe : ( ( ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' ) ) | ( '<' ( geometry ) '/' '>' ) | ( ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' ) ) | ( ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' ) ) );
    public final void syntaxe() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "syntaxe");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(320, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:2: ( ( ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' ) ) | ( '<' ( geometry ) '/' '>' ) | ( ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' ) ) | ( ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' ) ) )
            int alt20=4;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            try {
                isCyclicDecision = true;
                alt20 = dfa20.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:4: ( ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' ) )
                    {
                    dbg.location(321,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:4: ( ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' ) )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:5: ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' )
                    {
                    dbg.location(321,5);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:5: ( '<' ( geometry ) '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:6: '<' ( geometry ) '>'
                    {
                    dbg.location(321,6);
                    match(input,46,FOLLOW_46_in_syntaxe1676); 
                    dbg.location(321,10);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:10: ( geometry )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:11: geometry
                    {
                    dbg.location(321,11);
                    pushFollow(FOLLOW_geometry_in_syntaxe1679);
                    geometry();

                    state._fsp--;


                    }

                    dbg.location(321,21);
                    match(input,47,FOLLOW_47_in_syntaxe1682); 

                    }

                    dbg.location(321,25);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:25: ( '<' '/' ( 'Geometry' ) '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:26: '<' '/' ( 'Geometry' ) '>'
                    {
                    dbg.location(321,26);
                    match(input,46,FOLLOW_46_in_syntaxe1685); 
                    dbg.location(321,30);
                    match(input,48,FOLLOW_48_in_syntaxe1687); 
                    dbg.location(321,34);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:34: ( 'Geometry' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:321:35: 'Geometry'
                    {
                    dbg.location(321,35);
                    match(input,29,FOLLOW_29_in_syntaxe1690); 

                    }

                    dbg.location(321,47);
                    match(input,47,FOLLOW_47_in_syntaxe1693); 

                    }


                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:322:4: ( '<' ( geometry ) '/' '>' )
                    {
                    dbg.location(322,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:322:4: ( '<' ( geometry ) '/' '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:322:5: '<' ( geometry ) '/' '>'
                    {
                    dbg.location(322,5);
                    match(input,46,FOLLOW_46_in_syntaxe1701); 
                    dbg.location(322,9);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:322:9: ( geometry )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:322:10: geometry
                    {
                    dbg.location(322,10);
                    pushFollow(FOLLOW_geometry_in_syntaxe1704);
                    geometry();

                    state._fsp--;


                    }

                    dbg.location(322,20);
                    match(input,48,FOLLOW_48_in_syntaxe1707); 
                    dbg.location(322,24);
                    match(input,47,FOLLOW_47_in_syntaxe1709); 

                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:4: ( ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' ) )
                    {
                    dbg.location(323,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:4: ( ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' ) )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:5: ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' )
                    {
                    dbg.location(323,5);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:5: ( '<' ( transform ) '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:6: '<' ( transform ) '>'
                    {
                    dbg.location(323,6);
                    match(input,46,FOLLOW_46_in_syntaxe1718); 
                    dbg.location(323,10);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:10: ( transform )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:11: transform
                    {
                    dbg.location(323,11);
                    pushFollow(FOLLOW_transform_in_syntaxe1721);
                    transform();

                    state._fsp--;


                    }

                    dbg.location(323,22);
                    match(input,47,FOLLOW_47_in_syntaxe1724); 

                    }

                    dbg.location(323,27);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:27: ( syntaxe )*
                    try { dbg.enterSubRule(18);

                    loop18:
                    do {
                        int alt18=2;
                        try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==46) ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1==17||(LA18_1>=28 && LA18_1<=29)) ) {
                                alt18=1;
                            }


                        }


                        } finally {dbg.exitDecision(18);}

                        switch (alt18) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:27: syntaxe
                    	    {
                    	    dbg.location(323,27);
                    	    pushFollow(FOLLOW_syntaxe_in_syntaxe1727);
                    	    syntaxe();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(323,36);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:36: ( '<' '/' 'Transform' '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:323:37: '<' '/' 'Transform' '>'
                    {
                    dbg.location(323,37);
                    match(input,46,FOLLOW_46_in_syntaxe1731); 
                    dbg.location(323,41);
                    match(input,48,FOLLOW_48_in_syntaxe1733); 
                    dbg.location(323,45);
                    match(input,17,FOLLOW_17_in_syntaxe1735); 
                    dbg.location(323,57);
                    match(input,47,FOLLOW_47_in_syntaxe1737); 

                    }

                    dbg.location(323,61);
                    stack.pop(); currentNode=stack.peek();

                    }


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:4: ( ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' ) )
                    {
                    dbg.location(324,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:4: ( ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' ) )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:5: ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' )
                    {
                    dbg.location(324,5);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:5: ( '<' ( group ) '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:6: '<' ( group ) '>'
                    {
                    dbg.location(324,6);
                    match(input,46,FOLLOW_46_in_syntaxe1747); 
                    dbg.location(324,10);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:10: ( group )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:11: group
                    {
                    dbg.location(324,11);
                    pushFollow(FOLLOW_group_in_syntaxe1750);
                    group();

                    state._fsp--;


                    }

                    dbg.location(324,18);
                    match(input,47,FOLLOW_47_in_syntaxe1753); 

                    }

                    dbg.location(324,23);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:23: ( syntaxe )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==46) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==17||(LA19_1>=28 && LA19_1<=29)) ) {
                                alt19=1;
                            }


                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:23: syntaxe
                    	    {
                    	    dbg.location(324,23);
                    	    pushFollow(FOLLOW_syntaxe_in_syntaxe1756);
                    	    syntaxe();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(324,32);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:32: ( '<' '/' ( 'Group' ) '>' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:33: '<' '/' ( 'Group' ) '>'
                    {
                    dbg.location(324,33);
                    match(input,46,FOLLOW_46_in_syntaxe1760); 
                    dbg.location(324,37);
                    match(input,48,FOLLOW_48_in_syntaxe1762); 
                    dbg.location(324,41);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:41: ( 'Group' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:324:42: 'Group'
                    {
                    dbg.location(324,42);
                    match(input,28,FOLLOW_28_in_syntaxe1765); 

                    }

                    dbg.location(324,51);
                    match(input,47,FOLLOW_47_in_syntaxe1768); 

                    }

                    dbg.location(324,55);
                    stack.pop(); currentNode=stack.peek();

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(325, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "syntaxe");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "syntaxe"


    // $ANTLR start "root"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:1: root : ( '<' 'Root' '>' ) ( syntaxe )+ ( '<' '/' 'Root' '>' ) ;
    public final void root() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "root");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(327, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:7: ( ( '<' 'Root' '>' ) ( syntaxe )+ ( '<' '/' 'Root' '>' ) )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:9: ( '<' 'Root' '>' ) ( syntaxe )+ ( '<' '/' 'Root' '>' )
            {
            dbg.location(327,9);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:9: ( '<' 'Root' '>' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:10: '<' 'Root' '>'
            {
            dbg.location(327,10);
            match(input,46,FOLLOW_46_in_root1784); 
            dbg.location(327,14);
            match(input,49,FOLLOW_49_in_root1786); 
            dbg.location(327,21);
            match(input,47,FOLLOW_47_in_root1788); 

            }

            dbg.location(327,25);
            stack.push(root);
            dbg.location(327,46);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:46: ( syntaxe )+
            int cnt21=0;
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==17||(LA21_1>=28 && LA21_1<=29)) ) {
                        alt21=1;
                    }


                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:46: syntaxe
            	    {
            	    dbg.location(327,46);
            	    pushFollow(FOLLOW_syntaxe_in_root1793);
            	    syntaxe();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt21++;
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(327,55);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:55: ( '<' '/' 'Root' '>' )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:327:56: '<' '/' 'Root' '>'
            {
            dbg.location(327,56);
            match(input,46,FOLLOW_46_in_root1797); 
            dbg.location(327,60);
            match(input,48,FOLLOW_48_in_root1799); 
            dbg.location(327,64);
            match(input,49,FOLLOW_49_in_root1801); 
            dbg.location(327,71);
            match(input,47,FOLLOW_47_in_root1803); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(327, 75);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "root");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "root"


    // $ANTLR start "operande"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:332:1: operande returns [Float val] : ( '-' )? ( (id= ID | i1= INT | f1= FLOAT ) | ( '(' mult= expMult ')' ) ) ;
    public final Float operande() throws RecognitionException {
        Float val = null;

        Token id=null;
        Token i1=null;
        Token f1=null;
        Float mult = null;


        try { dbg.enterRule(getGrammarFileName(), "operande");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(332, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:333:2: ( ( '-' )? ( (id= ID | i1= INT | f1= FLOAT ) | ( '(' mult= expMult ')' ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:334:2: ( '-' )? ( (id= ID | i1= INT | f1= FLOAT ) | ( '(' mult= expMult ')' ) )
            {
            dbg.location(334,2);
            int PosouNeg = 1;
            dbg.location(335,2);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:335:2: ( '-' )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:335:3: '-'
                    {
                    dbg.location(335,3);
                    match(input,16,FOLLOW_16_in_operande1827); 
                    dbg.location(335,6);
                    PosouNeg = -1; expression = expression + '-';

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(336,2);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:336:2: ( (id= ID | i1= INT | f1= FLOAT ) | ( '(' mult= expMult ')' ) )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ID && LA24_0<=INT)||LA24_0==FLOAT) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:336:3: (id= ID | i1= INT | f1= FLOAT )
                    {
                    dbg.location(336,3);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:336:3: (id= ID | i1= INT | f1= FLOAT )
                    int alt23=3;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        alt23=1;
                        }
                        break;
                    case INT:
                        {
                        alt23=2;
                        }
                        break;
                    case FLOAT:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:336:4: id= ID
                            {
                            dbg.location(336,7);
                            id=(Token)match(input,ID,FOLLOW_ID_in_operande1839); 
                            dbg.location(336,12);
                            if (expressmap.containsKey((id!=null?id.getText():null))) {val = expressmap.get((id!=null?id.getText():null)) * PosouNeg; expression = expression + val.toString();}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:337:4: i1= INT
                            {
                            dbg.location(337,7);
                            i1=(Token)match(input,INT,FOLLOW_INT_in_operande1850); 
                            dbg.location(337,13);
                            val = Float.valueOf((i1!=null?i1.getText():null)) * PosouNeg; expression = expression + val.toString();

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:338:4: f1= FLOAT
                            {
                            dbg.location(338,7);
                            f1=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operande1861); 
                            dbg.location(338,15);
                            val = Float.valueOf((f1!=null?f1.getText():null)) * PosouNeg; expression = expression + val.toString();

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:339:4: ( '(' mult= expMult ')' )
                    {
                    dbg.location(339,4);
                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:339:4: ( '(' mult= expMult ')' )
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:339:5: '(' mult= expMult ')'
                    {
                    dbg.location(339,5);
                    match(input,50,FOLLOW_50_in_operande1870); 
                    dbg.location(339,9);
                    expression = expression + '(';
                    dbg.location(339,47);
                    pushFollow(FOLLOW_expMult_in_operande1878);
                    mult=expMult();

                    state._fsp--;

                    dbg.location(339,57);
                    match(input,51,FOLLOW_51_in_operande1880); 
                    dbg.location(339,60);
                    val = mult * PosouNeg;expression = expression + ')';

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(339, 122);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operande");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return val;
    }
    // $ANTLR end "operande"


    // $ANTLR start "expMult"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:343:1: expMult returns [Float val] : ope= operande ( '*' mult= operande | '/' div= operande )* ;
    public final Float expMult() throws RecognitionException {
        Float val = null;

        Float ope = null;

        Float mult = null;

        Float div = null;


        try { dbg.enterRule(getGrammarFileName(), "expMult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:344:2: (ope= operande ( '*' mult= operande | '/' div= operande )* )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:345:2: ope= operande ( '*' mult= operande | '/' div= operande )*
            {
            dbg.location(345,6);
            pushFollow(FOLLOW_operande_in_expMult1905);
            ope=operande();

            state._fsp--;

            dbg.location(345,17);
            val = ope;
            dbg.location(346,2);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:346:2: ( '*' mult= operande | '/' div= operande )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=3;
                try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==52) ) {
                    alt25=1;
                }
                else if ( (LA25_0==48) ) {
                    alt25=2;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:346:3: '*' mult= operande
            	    {
            	    dbg.location(346,3);
            	    match(input,52,FOLLOW_52_in_expMult1911); 
            	    dbg.location(346,8);
            	    expression = expression + '*';
            	    dbg.location(346,46);
            	    pushFollow(FOLLOW_operande_in_expMult1920);
            	    mult=operande();

            	    state._fsp--;

            	    dbg.location(346,56);
            	    val = val*mult;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:347:3: '/' div= operande
            	    {
            	    dbg.location(347,3);
            	    match(input,48,FOLLOW_48_in_expMult1925); 
            	    dbg.location(347,8);
            	    expression = expression + '/';
            	    dbg.location(347,45);
            	    pushFollow(FOLLOW_operande_in_expMult1934);
            	    div=operande();

            	    state._fsp--;

            	    dbg.location(347,55);
            	    val = val/div;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(347, 80);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expMult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return val;
    }
    // $ANTLR end "expMult"


    // $ANTLR start "expPlus"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:354:1: expPlus returns [Float val] : ope= expMult ( '-' moins= expMult '+' plus= expMult )* ;
    public final Float expPlus() throws RecognitionException {
        Float val = null;

        Float ope = null;

        Float moins = null;

        Float plus = null;


        try { dbg.enterRule(getGrammarFileName(), "expPlus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(354, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:355:2: (ope= expMult ( '-' moins= expMult '+' plus= expMult )* )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:356:2: ope= expMult ( '-' moins= expMult '+' plus= expMult )*
            {
            dbg.location(356,6);
            pushFollow(FOLLOW_expMult_in_expPlus1960);
            ope=expMult();

            state._fsp--;

            dbg.location(356,16);
            val = ope;
            dbg.location(357,2);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:357:2: ( '-' moins= expMult '+' plus= expMult )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:357:3: '-' moins= expMult '+' plus= expMult
            	    {
            	    dbg.location(357,3);
            	    match(input,16,FOLLOW_16_in_expPlus1966); 
            	    dbg.location(357,6);
            	     expression = expression + '-';
            	    dbg.location(357,46);
            	    pushFollow(FOLLOW_expMult_in_expPlus1973);
            	    moins=expMult();

            	    state._fsp--;

            	    dbg.location(357,55);
            	    val = val - moins; expression = expression + '-';
            	    dbg.location(358,2);
            	    match(input,53,FOLLOW_53_in_expPlus1977); 
            	    dbg.location(358,5);
            	     expression = expression + '+';
            	    dbg.location(358,45);
            	    pushFollow(FOLLOW_expMult_in_expPlus1985);
            	    plus=expMult();

            	    state._fsp--;

            	    dbg.location(358,54);
            	    val = val + plus;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(358, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expPlus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return val;
    }
    // $ANTLR end "expPlus"


    // $ANTLR start "expre"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:362:1: expre returns [Float val] : (exp= expPlus ) ;
    public final Float expre() throws RecognitionException {
        Float val = null;

        Float exp = null;


        try { dbg.enterRule(getGrammarFileName(), "expre");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(362, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:362:27: ( (exp= expPlus ) )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:363:2: (exp= expPlus )
            {
            dbg.location(363,2);
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:363:2: (exp= expPlus )
            dbg.enterAlt(1);

            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:363:3: exp= expPlus
            {
            dbg.location(363,7);
            pushFollow(FOLLOW_expPlus_in_expre2008);
            exp=expPlus();

            state._fsp--;

            dbg.location(363,16);
            val = exp;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(364, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expre");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return val;
    }
    // $ANTLR end "expre"


    // $ANTLR start "animation"
    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:367:1: animation returns [String result] : (xp= nombre | 'animation' '(' expr= expre ')' );
    public final String animation() throws RecognitionException {
        String result = null;

        XGDParser.nombre_return xp = null;

        Float expr = null;


        try { dbg.enterRule(getGrammarFileName(), "animation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 1);

        try {
            // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:367:35: (xp= nombre | 'animation' '(' expr= expre ')' )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==INT||LA27_0==FLOAT||LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==54) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:367:39: xp= nombre
                    {
                    dbg.location(367,39);
                    expression = "";
                    dbg.location(367,61);
                    pushFollow(FOLLOW_nombre_in_animation2034);
                    xp=nombre();

                    state._fsp--;

                    dbg.location(367,69);
                    result = (xp!=null?input.toString(xp.start,xp.stop):null); expression =  result;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\quent\\Desktop\\TPcin\\TP2\\XGD.g:367:116: 'animation' '(' expr= expre ')'
                    {
                    dbg.location(367,116);
                    match(input,54,FOLLOW_54_in_animation2039); 
                    dbg.location(367,127);
                    match(input,50,FOLLOW_50_in_animation2040); 
                    dbg.location(367,135);
                    pushFollow(FOLLOW_expre_in_animation2045);
                    expr=expre();

                    state._fsp--;

                    dbg.location(367,142);
                    result = expr.toString(); resultat=Float.valueOf(result);
                    dbg.location(367,208);
                    match(input,51,FOLLOW_51_in_animation2047); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(367, 211);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "animation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return result;
    }
    // $ANTLR end "animation"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\u025c\uffff";
    static final String DFA20_eofS =
        "\u025c\uffff";
    static final String DFA20_minS =
        "\1\56\1\21\1\22\2\uffff\1\23\1\24\1\36\7\22\1\5\1\25\1\5\1\25\1"+
        "\5\1\25\1\5\1\25\1\5\1\25\1\31\1\25\1\5\1\25\1\5\1\30\1\24\1\5\1"+
        "\31\1\24\1\5\1\30\1\24\1\5\1\30\1\24\1\5\1\31\1\24\1\22\1\24\1\5"+
        "\1\30\1\24\1\5\1\13\1\22\1\13\1\5\1\13\1\5\1\13\1\22\1\13\1\25\1"+
        "\13\1\5\1\13\1\5\1\30\1\22\1\25\1\22\1\5\1\30\1\22\1\5\1\30\1\22"+
        "\1\25\1\22\1\24\1\22\1\5\1\30\1\22\1\5\1\57\1\24\1\57\1\5\1\57\1"+
        "\5\1\57\1\24\1\57\1\13\1\57\1\5\1\57\1\5\1\30\2\uffff\1\13\1\5\1"+
        "\30\1\5\1\31\1\13\1\22\1\5\1\30\1\5\1\22\1\5\2\22\1\37\2\5\1\31"+
        "\1\37\1\5\1\30\1\25\1\37\1\40\1\5\1\31\1\22\1\40\1\5\1\24\1\40\1"+
        "\25\1\22\2\25\1\5\1\31\1\13\1\25\1\24\1\25\2\24\2\22\1\24\1\13\1"+
        "\24\2\13\1\25\1\37\1\13\1\22\1\13\2\22\1\24\1\40\1\22\1\47\1\22"+
        "\1\37\1\47\1\13\1\25\1\47\1\27\1\37\1\40\1\27\1\22\1\24\1\27\1\5"+
        "\1\40\1\25\1\5\1\37\1\13\2\5\1\30\1\25\1\24\1\5\1\30\1\40\1\22\1"+
        "\5\1\30\1\5\1\24\1\13\1\5\1\25\1\47\2\5\1\30\1\13\1\22\1\5\1\30"+
        "\1\24\1\27\1\5\1\30\1\5\1\22\1\47\1\5\1\13\3\5\1\31\1\47\1\27\1"+
        "\5\1\31\1\22\1\5\1\30\1\5\1\31\1\30\1\27\1\5\1\30\1\47\1\5\1\30"+
        "\1\50\2\5\1\30\1\50\1\27\1\5\1\30\1\50\1\27\1\5\1\30\1\5\1\27\2"+
        "\5\1\27\3\5\1\30\2\5\1\30\1\5\1\31\2\5\1\30\1\5\1\30\2\5\1\30\1"+
        "\5\1\30\1\5\1\30\3\5\1\31\2\5\1\30\1\50\2\5\1\30\1\5\1\31\1\30\1"+
        "\5\1\30\1\5\1\27\1\5\1\30\1\5\1\30\1\50\2\5\1\31\3\5\1\31\1\50\1"+
        "\27\1\5\1\31\1\30\1\5\1\30\1\5\1\31\1\30\1\27\1\5\1\30\1\50\1\5"+
        "\1\30\1\51\2\5\1\30\1\51\1\27\1\5\1\30\1\51\1\27\1\5\1\30\1\5\1"+
        "\27\2\5\1\27\3\5\1\30\2\5\1\30\1\5\1\31\2\5\1\30\1\5\1\30\2\5\1"+
        "\30\1\5\1\30\1\5\1\30\3\5\1\31\2\5\1\30\1\51\2\5\1\30\1\5\1\31\1"+
        "\30\1\5\1\30\1\5\1\27\1\5\1\30\1\5\1\30\1\51\2\5\1\31\3\5\1\31\1"+
        "\51\1\27\1\5\1\31\1\30\1\5\1\30\1\5\1\31\1\30\1\27\1\5\1\30\1\51"+
        "\1\5\1\30\1\52\2\5\1\30\1\52\1\27\1\5\1\30\1\52\1\24\1\5\1\30\1"+
        "\5\1\24\2\5\1\24\3\5\1\30\2\5\1\30\1\5\1\31\2\5\1\30\1\5\1\30\2"+
        "\5\1\30\1\5\1\30\1\5\1\30\1\53\2\5\1\31\1\53\1\5\1\30\1\52\1\53"+
        "\1\24\1\5\1\31\1\30\1\24\1\5\2\24\1\5\1\30\1\52\2\5\1\31\3\5\1\30"+
        "\1\52\1\24\1\5\2\30\1\5\1\30\1\5\1\30\1\54\1\24\1\5\1\54\1\52\1"+
        "\53\1\54\1\27\2\5\1\30\1\27\2\24\1\27\2\5\1\30\1\53\5\5\1\30\1\53"+
        "\1\24\1\5\1\30\1\5\1\30\1\5\1\30\1\5\1\30\1\5\1\24\2\5\1\53\1\54"+
        "\2\5\1\31\2\5\1\30\1\5\1\31\1\24\1\27\1\5\1\31\1\30\1\5\1\30\1\54"+
        "\1\30\2\5\1\30\1\55\1\54\1\27\1\55\1\5\1\30\1\5\1\30\1\55\1\24\1"+
        "\27\1\5\1\24\1\54\1\5\1\24\1\13\2\5\1\30\1\13\1\27\1\5\1\31\1\13"+
        "\1\22\1\5\1\30\1\5\1\22\1\5\1\30\1\22\1\57\2\5\1\31\1\57\1\5\1\30"+
        "\1\55\1\57\1\5\1\31\1\30\1\5\1\24\1\30\1\55\1\5\1\31\1\13\1\55\1"+
        "\24\1\30\1\22\1\24\1\13\1\55\1\57\1\13\1\22\1\24\1\22\1\57\1\13"+
        "\1\57\1\22\1\57";
    static final String DFA20_maxS =
        "\1\56\1\35\1\22\2\uffff\1\23\1\24\1\46\7\27\1\20\1\25\1\20\1\25"+
        "\1\20\1\25\1\20\1\25\1\20\1\25\1\31\1\25\1\20\1\25\1\7\1\30\1\24"+
        "\1\7\1\31\1\24\1\7\1\30\1\24\1\7\1\30\1\24\1\7\1\31\1\24\1\22\1"+
        "\24\1\7\1\30\1\24\1\20\1\13\1\22\1\13\1\20\1\13\1\20\1\13\1\22\1"+
        "\13\1\25\1\13\1\20\1\13\1\7\1\30\1\22\1\25\1\22\1\7\1\30\1\22\1"+
        "\7\1\30\1\22\1\25\1\22\1\24\1\22\1\7\1\30\1\22\1\20\1\60\1\24\1"+
        "\60\1\20\1\60\1\20\1\60\1\24\1\60\1\13\1\60\1\20\1\60\1\7\1\30\2"+
        "\uffff\1\13\1\7\1\30\1\7\1\31\1\13\1\22\1\7\1\30\1\20\1\22\1\20"+
        "\2\22\1\37\1\20\1\7\1\31\1\37\1\7\1\30\1\25\1\37\1\40\1\7\1\31\1"+
        "\22\1\40\1\20\1\24\1\40\1\25\1\22\2\25\1\7\1\31\1\13\1\25\1\24\1"+
        "\25\2\24\2\22\1\24\1\13\1\24\2\13\1\25\1\37\1\13\1\22\1\13\2\22"+
        "\1\24\1\40\1\22\1\60\1\22\1\37\1\60\1\13\1\25\1\60\1\27\1\37\1\40"+
        "\1\27\1\22\1\24\1\27\1\20\1\40\1\25\1\20\1\37\1\13\1\20\1\7\1\30"+
        "\1\25\1\24\1\7\1\30\1\40\1\22\1\7\1\30\1\20\1\24\1\13\1\20\1\25"+
        "\1\60\1\20\1\7\1\30\1\13\1\22\1\7\1\30\1\24\1\27\1\7\1\30\1\20\1"+
        "\22\1\60\1\20\1\13\2\20\1\7\1\31\1\60\1\27\1\7\1\31\1\22\1\7\1\30"+
        "\1\7\1\31\1\30\1\27\1\20\1\30\1\60\1\20\1\30\1\50\1\20\1\7\1\30"+
        "\1\50\1\27\1\7\1\30\1\50\1\27\1\7\1\30\1\20\1\27\2\20\1\27\2\20"+
        "\1\7\1\30\1\20\1\7\1\30\1\7\1\31\1\20\1\7\1\30\1\7\1\30\1\20\1\7"+
        "\1\30\1\20\1\30\1\7\1\30\2\20\1\7\1\31\1\20\1\7\1\30\1\50\1\20\1"+
        "\7\1\30\1\7\1\31\1\30\1\7\1\30\1\20\1\27\1\7\1\30\1\20\1\30\1\50"+
        "\1\20\1\7\1\31\2\20\1\7\1\31\1\50\1\27\1\7\1\31\1\30\1\7\1\30\1"+
        "\7\1\31\1\30\1\27\1\20\1\30\1\50\1\20\1\30\1\51\1\20\1\7\1\30\1"+
        "\51\1\27\1\7\1\30\1\51\1\27\1\7\1\30\1\20\1\27\2\20\1\27\2\20\1"+
        "\7\1\30\1\20\1\7\1\30\1\7\1\31\1\20\1\7\1\30\1\7\1\30\1\20\1\7\1"+
        "\30\1\20\1\30\1\7\1\30\2\20\1\7\1\31\1\20\1\7\1\30\1\51\1\20\1\7"+
        "\1\30\1\7\1\31\1\30\1\7\1\30\1\20\1\27\1\7\1\30\1\20\1\30\1\51\1"+
        "\20\1\7\1\31\2\20\1\7\1\31\1\51\1\27\1\7\1\31\1\30\1\7\1\30\1\7"+
        "\1\31\1\30\1\27\1\20\1\30\1\51\1\20\1\30\1\52\1\20\1\7\1\30\1\52"+
        "\1\27\1\7\1\30\1\52\1\24\1\7\1\30\1\20\1\24\2\20\1\24\2\20\1\7\1"+
        "\30\1\20\1\7\1\30\1\7\1\31\1\20\1\7\1\30\1\7\1\30\1\20\1\7\1\30"+
        "\1\20\1\30\1\7\1\30\1\53\1\20\1\7\1\31\1\53\1\7\1\30\1\52\1\53\1"+
        "\24\1\7\1\31\1\30\1\24\1\20\2\24\1\20\1\30\1\52\1\20\1\7\1\31\2"+
        "\20\1\7\1\30\1\52\1\24\1\7\2\30\1\7\1\30\1\7\1\30\1\54\1\24\1\20"+
        "\1\54\1\52\1\53\1\54\1\27\1\20\1\7\1\30\1\27\2\24\1\27\1\20\1\7"+
        "\1\30\1\53\4\20\1\7\1\30\1\53\1\24\1\7\1\30\1\7\1\30\1\7\1\30\1"+
        "\7\1\30\1\20\1\24\2\20\1\53\1\54\1\20\1\7\1\31\1\20\1\7\1\30\1\7"+
        "\1\31\1\24\1\27\1\7\1\31\1\30\1\7\1\30\1\54\1\30\2\20\1\30\1\55"+
        "\1\54\1\27\1\55\1\7\1\30\1\7\1\30\1\55\1\24\1\27\1\20\1\24\1\54"+
        "\1\20\1\24\1\13\1\20\1\7\1\30\1\13\1\27\1\7\1\31\1\13\1\22\1\7\1"+
        "\30\1\20\1\22\1\20\1\30\1\22\1\60\1\20\1\7\1\31\1\60\1\7\1\30\1"+
        "\55\1\60\1\7\1\31\1\30\1\20\1\24\1\30\1\55\1\7\1\31\1\13\1\55\1"+
        "\24\1\30\1\22\1\24\1\13\1\55\1\60\1\13\1\22\1\24\1\22\1\60\1\13"+
        "\1\60\1\22\1\60";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\1\4\134\uffff\1\1\1\2\u01f9\uffff";
    static final String DFA20_specialS =
        "\u025c\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\3\12\uffff\1\4\1\2",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10\2\uffff\1\13\1\12\1\11\1\14\1\15\1\16",
            "\1\20\4\uffff\1\17",
            "\1\22\4\uffff\1\21",
            "\1\24\4\uffff\1\23",
            "\1\26\4\uffff\1\25",
            "\1\30\4\uffff\1\27",
            "\1\32\4\uffff\1\31",
            "\1\34\4\uffff\1\33",
            "\1\36\1\uffff\1\36\10\uffff\1\35",
            "\1\37",
            "\1\41\1\uffff\1\41\10\uffff\1\40",
            "\1\42",
            "\1\44\1\uffff\1\44\10\uffff\1\43",
            "\1\45",
            "\1\47\1\uffff\1\47\10\uffff\1\46",
            "\1\50",
            "\1\52\1\uffff\1\52\10\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\1\uffff\1\57\10\uffff\1\56",
            "\1\60",
            "\1\36\1\uffff\1\36",
            "\1\61",
            "\1\62",
            "\1\41\1\uffff\1\41",
            "\1\63",
            "\1\64",
            "\1\44\1\uffff\1\44",
            "\1\65",
            "\1\66",
            "\1\47\1\uffff\1\47",
            "\1\67",
            "\1\70",
            "\1\52\1\uffff\1\52",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\57\1\uffff\1\57",
            "\1\75",
            "\1\76",
            "\1\100\1\uffff\1\100\10\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\105\1\uffff\1\105\10\uffff\1\104",
            "\1\106",
            "\1\110\1\uffff\1\110\10\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\1\uffff\1\117\10\uffff\1\116",
            "\1\120",
            "\1\100\1\uffff\1\100",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\105\1\uffff\1\105",
            "\1\125",
            "\1\126",
            "\1\110\1\uffff\1\110",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\117\1\uffff\1\117",
            "\1\135",
            "\1\136",
            "\1\140\1\uffff\1\140\10\uffff\1\137",
            "\1\141\1\142",
            "\1\143",
            "\1\141\1\142",
            "\1\145\1\uffff\1\145\10\uffff\1\144",
            "\1\141\1\142",
            "\1\147\1\uffff\1\147\10\uffff\1\146",
            "\1\141\1\142",
            "\1\150",
            "\1\141\1\142",
            "\1\151",
            "\1\141\1\142",
            "\1\153\1\uffff\1\153\10\uffff\1\152",
            "\1\141\1\142",
            "\1\140\1\uffff\1\140",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\145\1\uffff\1\145",
            "\1\156",
            "\1\147\1\uffff\1\147",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\153\1\uffff\1\153",
            "\1\162",
            "\1\164\1\uffff\1\164\10\uffff\1\163",
            "\1\165",
            "\1\167\1\uffff\1\167\10\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\174\1\uffff\1\174\10\uffff\1\173",
            "\1\164\1\uffff\1\164",
            "\1\175",
            "\1\176",
            "\1\167\1\uffff\1\167",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\174\1\uffff\1\174",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\1\uffff\1\u0087\10\uffff\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u0087\1\uffff\1\u0087",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\7\uffff\1\141\1\142",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\7\uffff\1\141\1\142",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\7\uffff\1\141\1\142",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b5\1\uffff\1\u00b5\10\uffff\1\u00b4",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b9\1\uffff\1\u00b9\10\uffff\1\u00b8",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bd\1\uffff\1\u00bd\10\uffff\1\u00bc",
            "\1\u00b5\1\uffff\1\u00b5",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00b9\1\uffff\1\u00b9",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00bd\1\uffff\1\u00bd",
            "\1\u00c4",
            "\1\u00c6\1\uffff\1\u00c6\10\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00ca\1\uffff\1\u00ca\10\uffff\1\u00c9",
            "\1\u00cb",
            "\1\u00cc\7\uffff\1\141\1\142",
            "\1\u00ce\1\uffff\1\u00ce\10\uffff\1\u00cd",
            "\1\u00c6\1\uffff\1\u00c6",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00ca\1\uffff\1\u00ca",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00ce\1\uffff\1\u00ce",
            "\1\u00d5",
            "\1\u00d7\1\uffff\1\u00d7\10\uffff\1\u00d6",
            "\1\u00d8",
            "\1\u00d9\7\uffff\1\141\1\142",
            "\1\u00db\1\uffff\1\u00db\10\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00de\1\uffff\1\u00de\10\uffff\1\u00dd",
            "\1\u00e0\1\uffff\1\u00e0\10\uffff\1\u00df",
            "\1\u00d7\1\uffff\1\u00d7",
            "\1\u00e1",
            "\1\u00e2\7\uffff\1\141\1\142",
            "\1\u00e3",
            "\1\u00db\1\uffff\1\u00db",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00de\1\uffff\1\u00de",
            "\1\u00e6",
            "\1\u00e0\1\uffff\1\u00e0",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00eb\1\uffff\1\u00eb\10\uffff\1\u00ea",
            "\1\u00ec",
            "\1\u00ed\7\uffff\1\141\1\142",
            "\1\u00ef\1\uffff\1\u00ef\10\uffff\1\u00ee",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f3\1\uffff\1\u00f3\10\uffff\1\u00f2",
            "\1\u00eb\1\uffff\1\u00eb",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00ef\1\uffff\1\u00ef",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00f3\1\uffff\1\u00f3",
            "\1\u00fa",
            "\1\u00fc\1\uffff\1\u00fc\10\uffff\1\u00fb",
            "\1\u00fd",
            "\1\u00ff\1\uffff\1\u00ff\10\uffff\1\u00fe",
            "\1\u0101\1\uffff\1\u0101\10\uffff\1\u0100",
            "\1\u0102",
            "\1\u0104\1\uffff\1\u0104\10\uffff\1\u0103",
            "\1\u0106\1\uffff\1\u0106\10\uffff\1\u0105",
            "\1\u00fc\1\uffff\1\u00fc",
            "\1\u0107",
            "\1\u0109\1\uffff\1\u0109\10\uffff\1\u0108",
            "\1\u00ff\1\uffff\1\u00ff",
            "\1\u010a",
            "\1\u0101\1\uffff\1\u0101",
            "\1\u010b",
            "\1\u010d\1\uffff\1\u010d\10\uffff\1\u010c",
            "\1\u0104\1\uffff\1\u0104",
            "\1\u010e",
            "\1\u0106\1\uffff\1\u0106",
            "\1\u010f",
            "\1\u0111\1\uffff\1\u0111\10\uffff\1\u0110",
            "\1\u0109\1\uffff\1\u0109",
            "\1\u0112",
            "\1\u0114\1\uffff\1\u0114\10\uffff\1\u0113",
            "\1\u0115",
            "\1\u010d\1\uffff\1\u010d",
            "\1\u0116",
            "\1\u0118\1\uffff\1\u0118\10\uffff\1\u0117",
            "\1\u011a\1\uffff\1\u011a\10\uffff\1\u0119",
            "\1\u0111\1\uffff\1\u0111",
            "\1\u011b",
            "\1\u011d\1\uffff\1\u011d\10\uffff\1\u011c",
            "\1\u0114\1\uffff\1\u0114",
            "\1\u011e",
            "\1\u011f",
            "\1\u0121\1\uffff\1\u0121\10\uffff\1\u0120",
            "\1\u0118\1\uffff\1\u0118",
            "\1\u0122",
            "\1\u011a\1\uffff\1\u011a",
            "\1\u0123",
            "\1\u0124",
            "\1\u011d\1\uffff\1\u011d",
            "\1\u0125",
            "\1\u0127\1\uffff\1\u0127\10\uffff\1\u0126",
            "\1\u0128",
            "\1\u0121\1\uffff\1\u0121",
            "\1\u0129",
            "\1\u012b\1\uffff\1\u012b\10\uffff\1\u012a",
            "\1\u012c",
            "\1\u012d",
            "\1\u012f\1\uffff\1\u012f\10\uffff\1\u012e",
            "\1\u0127\1\uffff\1\u0127",
            "\1\u0130",
            "\1\u0132\1\uffff\1\u0132\10\uffff\1\u0131",
            "\1\u0134\1\uffff\1\u0134\10\uffff\1\u0133",
            "\1\u012b\1\uffff\1\u012b",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u012f\1\uffff\1\u012f",
            "\1\u0138",
            "\1\u0139",
            "\1\u0132\1\uffff\1\u0132",
            "\1\u013a",
            "\1\u0134\1\uffff\1\u0134",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013f\1\uffff\1\u013f\10\uffff\1\u013e",
            "\1\u0140",
            "\1\u0141",
            "\1\u0143\1\uffff\1\u0143\10\uffff\1\u0142",
            "\1\u0144",
            "\1\u0145",
            "\1\u0147\1\uffff\1\u0147\10\uffff\1\u0146",
            "\1\u013f\1\uffff\1\u013f",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u0143\1\uffff\1\u0143",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u0147\1\uffff\1\u0147",
            "\1\u014e",
            "\1\u0150\1\uffff\1\u0150\10\uffff\1\u014f",
            "\1\u0151",
            "\1\u0153\1\uffff\1\u0153\10\uffff\1\u0152",
            "\1\u0155\1\uffff\1\u0155\10\uffff\1\u0154",
            "\1\u0156",
            "\1\u0158\1\uffff\1\u0158\10\uffff\1\u0157",
            "\1\u015a\1\uffff\1\u015a\10\uffff\1\u0159",
            "\1\u0150\1\uffff\1\u0150",
            "\1\u015b",
            "\1\u015d\1\uffff\1\u015d\10\uffff\1\u015c",
            "\1\u0153\1\uffff\1\u0153",
            "\1\u015e",
            "\1\u0155\1\uffff\1\u0155",
            "\1\u015f",
            "\1\u0161\1\uffff\1\u0161\10\uffff\1\u0160",
            "\1\u0158\1\uffff\1\u0158",
            "\1\u0162",
            "\1\u015a\1\uffff\1\u015a",
            "\1\u0163",
            "\1\u0165\1\uffff\1\u0165\10\uffff\1\u0164",
            "\1\u015d\1\uffff\1\u015d",
            "\1\u0166",
            "\1\u0168\1\uffff\1\u0168\10\uffff\1\u0167",
            "\1\u0169",
            "\1\u0161\1\uffff\1\u0161",
            "\1\u016a",
            "\1\u016c\1\uffff\1\u016c\10\uffff\1\u016b",
            "\1\u016e\1\uffff\1\u016e\10\uffff\1\u016d",
            "\1\u0165\1\uffff\1\u0165",
            "\1\u016f",
            "\1\u0171\1\uffff\1\u0171\10\uffff\1\u0170",
            "\1\u0168\1\uffff\1\u0168",
            "\1\u0172",
            "\1\u0173",
            "\1\u0175\1\uffff\1\u0175\10\uffff\1\u0174",
            "\1\u016c\1\uffff\1\u016c",
            "\1\u0176",
            "\1\u016e\1\uffff\1\u016e",
            "\1\u0177",
            "\1\u0178",
            "\1\u0171\1\uffff\1\u0171",
            "\1\u0179",
            "\1\u017b\1\uffff\1\u017b\10\uffff\1\u017a",
            "\1\u017c",
            "\1\u0175\1\uffff\1\u0175",
            "\1\u017d",
            "\1\u017f\1\uffff\1\u017f\10\uffff\1\u017e",
            "\1\u0180",
            "\1\u0181",
            "\1\u0183\1\uffff\1\u0183\10\uffff\1\u0182",
            "\1\u017b\1\uffff\1\u017b",
            "\1\u0184",
            "\1\u0186\1\uffff\1\u0186\10\uffff\1\u0185",
            "\1\u0188\1\uffff\1\u0188\10\uffff\1\u0187",
            "\1\u017f\1\uffff\1\u017f",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u0183\1\uffff\1\u0183",
            "\1\u018c",
            "\1\u018d",
            "\1\u0186\1\uffff\1\u0186",
            "\1\u018e",
            "\1\u0188\1\uffff\1\u0188",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0193\1\uffff\1\u0193\10\uffff\1\u0192",
            "\1\u0194",
            "\1\u0195",
            "\1\u0197\1\uffff\1\u0197\10\uffff\1\u0196",
            "\1\u0198",
            "\1\u0199",
            "\1\u019b\1\uffff\1\u019b\10\uffff\1\u019a",
            "\1\u0193\1\uffff\1\u0193",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u0197\1\uffff\1\u0197",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u019b\1\uffff\1\u019b",
            "\1\u01a2",
            "\1\u01a4\1\uffff\1\u01a4\10\uffff\1\u01a3",
            "\1\u01a5",
            "\1\u01a7\1\uffff\1\u01a7\10\uffff\1\u01a6",
            "\1\u01a9\1\uffff\1\u01a9\10\uffff\1\u01a8",
            "\1\u01aa",
            "\1\u01ac\1\uffff\1\u01ac\10\uffff\1\u01ab",
            "\1\u01ae\1\uffff\1\u01ae\10\uffff\1\u01ad",
            "\1\u01a4\1\uffff\1\u01a4",
            "\1\u01af",
            "\1\u01b1\1\uffff\1\u01b1\10\uffff\1\u01b0",
            "\1\u01a7\1\uffff\1\u01a7",
            "\1\u01b2",
            "\1\u01a9\1\uffff\1\u01a9",
            "\1\u01b3",
            "\1\u01b5\1\uffff\1\u01b5\10\uffff\1\u01b4",
            "\1\u01ac\1\uffff\1\u01ac",
            "\1\u01b6",
            "\1\u01ae\1\uffff\1\u01ae",
            "\1\u01b7",
            "\1\u01b9\1\uffff\1\u01b9\10\uffff\1\u01b8",
            "\1\u01b1\1\uffff\1\u01b1",
            "\1\u01ba",
            "\1\u01bc\1\uffff\1\u01bc\10\uffff\1\u01bb",
            "\1\u01bd",
            "\1\u01b5\1\uffff\1\u01b5",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c1\1\uffff\1\u01c1\10\uffff\1\u01c0",
            "\1\u01b9\1\uffff\1\u01b9",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01bc\1\uffff\1\u01bc",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c1\1\uffff\1\u01c1",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cc\1\uffff\1\u01cc\10\uffff\1\u01cb",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01d0\1\uffff\1\u01d0\10\uffff\1\u01cf",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d4\1\uffff\1\u01d4\10\uffff\1\u01d3",
            "\1\u01cc\1\uffff\1\u01cc",
            "\1\u01d5",
            "\1\u01d7\1\uffff\1\u01d7\10\uffff\1\u01d6",
            "\1\u01d9\1\uffff\1\u01d9\10\uffff\1\u01d8",
            "\1\u01d0\1\uffff\1\u01d0",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01d4\1\uffff\1\u01d4",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01d7\1\uffff\1\u01d7",
            "\1\u01df",
            "\1\u01d9\1\uffff\1\u01d9",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e4\1\uffff\1\u01e4\10\uffff\1\u01e3",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01eb\1\uffff\1\u01eb\10\uffff\1\u01ea",
            "\1\u01e4\1\uffff\1\u01e4",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f2\1\uffff\1\u01f2\10\uffff\1\u01f1",
            "\1\u01eb\1\uffff\1\u01eb",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f6\1\uffff\1\u01f6\10\uffff\1\u01f5",
            "\1\u01f8\1\uffff\1\u01f8\10\uffff\1\u01f7",
            "\1\u01fa\1\uffff\1\u01fa\10\uffff\1\u01f9",
            "\1\u01fc\1\uffff\1\u01fc\10\uffff\1\u01fb",
            "\1\u01f2\1\uffff\1\u01f2",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u01f6\1\uffff\1\u01f6",
            "\1\u0200",
            "\1\u01f8\1\uffff\1\u01f8",
            "\1\u0201",
            "\1\u01fa\1\uffff\1\u01fa",
            "\1\u0202",
            "\1\u01fc\1\uffff\1\u01fc",
            "\1\u0203",
            "\1\u0205\1\uffff\1\u0205\10\uffff\1\u0204",
            "\1\u0206",
            "\1\u0208\1\uffff\1\u0208\10\uffff\1\u0207",
            "\1\u020a\1\uffff\1\u020a\10\uffff\1\u0209",
            "\1\u020b",
            "\1\u020c",
            "\1\u020e\1\uffff\1\u020e\10\uffff\1\u020d",
            "\1\u0205\1\uffff\1\u0205",
            "\1\u020f",
            "\1\u0211\1\uffff\1\u0211\10\uffff\1\u0210",
            "\1\u0208\1\uffff\1\u0208",
            "\1\u0212",
            "\1\u020a\1\uffff\1\u020a",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u020e\1\uffff\1\u020e",
            "\1\u0216",
            "\1\u0217",
            "\1\u0211\1\uffff\1\u0211",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021c\1\uffff\1\u021c\10\uffff\1\u021b",
            "\1\u021e\1\uffff\1\u021e\10\uffff\1\u021d",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u021c\1\uffff\1\u021c",
            "\1\u0224",
            "\1\u021e\1\uffff\1\u021e",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u022a\1\uffff\1\u022a\10\uffff\1\u0229",
            "\1\u022b",
            "\1\u022c",
            "\1\u022e\1\uffff\1\u022e\10\uffff\1\u022d",
            "\1\u022f",
            "\1\u0230",
            "\1\u0232\1\uffff\1\u0232\10\uffff\1\u0231",
            "\1\u022a\1\uffff\1\u022a",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u022e\1\uffff\1\u022e",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0232\1\uffff\1\u0232",
            "\1\u0239",
            "\1\u023b\1\uffff\1\u023b\10\uffff\1\u023a",
            "\1\u023c",
            "\1\u023e\1\uffff\1\u023e\10\uffff\1\u023d",
            "\1\u023f",
            "\1\u0240",
            "\1\141\1\142",
            "\1\u0242\1\uffff\1\u0242\10\uffff\1\u0241",
            "\1\u023b\1\uffff\1\u023b",
            "\1\u0243",
            "\1\141\1\142",
            "\1\u023e\1\uffff\1\u023e",
            "\1\u0244",
            "\1\u0245",
            "\1\141\1\142",
            "\1\u0242\1\uffff\1\u0242",
            "\1\u0246",
            "\1\u0247",
            "\1\u0249\1\uffff\1\u0249\10\uffff\1\u0248",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u0249\1\uffff\1\u0249",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\141\1\142",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\141\1\142",
            "\1\u025a",
            "\1\141\1\142",
            "\1\u025b",
            "\1\141\1\142"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "320:1: syntaxe : ( ( ( '<' ( geometry ) '>' ) ( '<' '/' ( 'Geometry' ) '>' ) ) | ( '<' ( geometry ) '/' '>' ) | ( ( '<' ( transform ) '>' ) ( syntaxe )* ( '<' '/' 'Transform' '>' ) ) | ( ( '<' ( group ) '>' ) ( syntaxe )* ( '<' '/' ( 'Group' ) '>' ) ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_16_in_nombre569 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_set_in_nombre571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_transform589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_transform590 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_transform591 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_transform592 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_translation_in_transform595 = new BitSet(new long[]{0x000000000C440000L});
    public static final BitSet FOLLOW_rotation_in_transform599 = new BitSet(new long[]{0x000000000C440000L});
    public static final BitSet FOLLOW_scale_in_transform603 = new BitSet(new long[]{0x000000000C440000L});
    public static final BitSet FOLLOW_18_in_transform607 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_transform608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_transform609 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_transform611 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_transform613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_translation625 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_translation626 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_translation629 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_translation641 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_translation644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_translation656 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_translation659 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_translation671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rotation680 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rotation683 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_rotation686 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rotation698 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_rotation701 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rotation713 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_rotation716 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rotation728 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_rotation731 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rotation743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_scale754 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_scale755 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_scale764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_scale776 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_scale779 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_scale791 = new BitSet(new long[]{0x00400000000100A0L});
    public static final BitSet FOLLOW_animation_in_scale794 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_scale806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_group819 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_group820 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_group823 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_group824 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_group833 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_group835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_geometry843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_geometry844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_geometry845 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_geometry846 = new BitSet(new long[]{0x0000007E40000000L});
    public static final BitSet FOLLOW_cone_in_geometry849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cube_in_geometry851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cylinder_in_geometry853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sphere_in_geometry855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_teapot_in_geometry857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tetrahedron_in_geometry859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_torus_in_geometry861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_cone876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_cone877 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cone883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cone888 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cone891 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cone896 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cone900 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cone905 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cone909 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cone911 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cone916 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cone917 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cone918 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cone922 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cone928 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_cone929 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cone930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cone935 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cone936 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cone939 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cone940 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_cone942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_cone959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cone961 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cone964 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cone965 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cone969 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cone974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_sphere993 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_sphere994 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_sphere999 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_sphere1003 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_sphere1007 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_sphere1011 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_sphere1015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_sphere1017 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sphere1022 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_sphere1025 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_sphere1026 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_sphere1030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sphere1034 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_sphere1035 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_sphere1036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_sphere1039 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_sphere1040 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_sphere1043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sphere1044 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_sphere1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_sphere1064 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sphere1066 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_sphere1069 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_sphere1070 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_sphere1074 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_sphere1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_cylinder1094 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_cylinder1095 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cylinder1098 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cylinder1102 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cylinder1105 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cylinder1109 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cylinder1112 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cylinder1116 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cylinder1120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_cylinder1124 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cylinder1128 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cylinder1130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cylinder1133 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cylinder1136 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cylinder1137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cylinder1141 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cylinder1145 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_cylinder1146 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cylinder1147 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cylinder1150 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cylinder1151 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cylinder1154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cylinder1155 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_cylinder1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_cylinder1175 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cylinder1177 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cylinder1180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cylinder1181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cylinder1185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cylinder1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_cube1208 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_cube1209 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_cube1212 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_cube1214 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cube1218 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cube1221 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cube1222 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cube1226 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cube1231 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_cube1232 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cube1233 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cube1237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cube1238 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cube1241 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cube1242 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_cube1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_cube1261 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cube1263 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_cube1266 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_cube1267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_cube1271 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_cube1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_teapot1292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_teapot1293 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_teapot1296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_teapot1298 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_teapot1302 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_teapot1304 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_teapot1305 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_teapot1309 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_teapot1314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_teapot1315 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_teapot1316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_teapot1320 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_teapot1321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_teapot1324 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_teapot1325 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_teapot1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_teapot1344 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_teapot1346 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_teapot1349 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_teapot1350 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_teapot1354 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_teapot1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_tetrahedron1372 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_tetrahedron1373 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_tetrahedron1374 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tetrahedron1378 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_tetrahedron1380 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_tetrahedron1381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_tetrahedron1385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tetrahedron1390 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_tetrahedron1391 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_tetrahedron1392 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_tetrahedron1396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_tetrahedron1397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_tetrahedron1400 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tetrahedron1401 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_tetrahedron1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_tetrahedron1421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tetrahedron1423 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_tetrahedron1426 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_tetrahedron1427 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_tetrahedron1431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_tetrahedron1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_torus1454 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_torus1455 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_torus1458 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_torus1462 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_torus1466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_torus1470 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_torus1474 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_torus1478 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_torus1482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_torus1484 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_torus1487 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_torus1489 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_torus1490 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_torus1494 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_torus1498 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_torus1499 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_torus1500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_torus1503 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_torus1504 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_torus1507 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_torus1508 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_couleur_in_torus1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_torus1527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_torus1529 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_torus1532 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_torus1533 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_torus1537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_torus1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_couleur1562 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_couleur1563 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1566 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1567 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1571 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1575 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_couleur1576 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1579 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_couleur1580 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_couleur1581 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1584 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1585 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1588 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1589 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1592 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_couleur1593 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1596 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_couleur1597 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_couleur1598 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1602 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1605 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1606 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1610 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_couleur1611 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1614 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_couleur1615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_couleur1616 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1620 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1624 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_couleur1625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_couleur1626 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1630 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1634 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_couleur1635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_couleur1636 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1640 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1641 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_nombre_in_couleur1645 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_couleur1647 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_couleur1650 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_couleur1651 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_couleur1652 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_couleur1656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_couleur1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_syntaxe1676 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_geometry_in_syntaxe1679 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1682 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_syntaxe1685 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_syntaxe1687 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_syntaxe1690 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_syntaxe1701 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_geometry_in_syntaxe1704 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_syntaxe1707 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_syntaxe1718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_transform_in_syntaxe1721 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1724 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_syntaxe_in_syntaxe1727 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_syntaxe1731 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_syntaxe1733 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_syntaxe1735 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_syntaxe1747 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_group_in_syntaxe1750 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1753 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_syntaxe_in_syntaxe1756 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_syntaxe1760 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_syntaxe1762 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_syntaxe1765 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_syntaxe1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_root1784 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_root1786 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_root1788 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_syntaxe_in_root1793 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_root1797 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_root1799 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_root1801 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_root1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_operande1827 = new BitSet(new long[]{0x00040000000000B0L});
    public static final BitSet FOLLOW_ID_in_operande1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operande1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operande1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_operande1870 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_expMult_in_operande1878 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_operande1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operande_in_expMult1905 = new BitSet(new long[]{0x0011000000000002L});
    public static final BitSet FOLLOW_52_in_expMult1911 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_operande_in_expMult1920 = new BitSet(new long[]{0x0011000000000002L});
    public static final BitSet FOLLOW_48_in_expMult1925 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_operande_in_expMult1934 = new BitSet(new long[]{0x0011000000000002L});
    public static final BitSet FOLLOW_expMult_in_expPlus1960 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_expPlus1966 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_expMult_in_expPlus1973 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expPlus1977 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_expMult_in_expPlus1985 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_expPlus_in_expre2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nombre_in_animation2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_animation2039 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_animation2040 = new BitSet(new long[]{0x00040000000100B0L});
    public static final BitSet FOLLOW_expre_in_animation2045 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_animation2047 = new BitSet(new long[]{0x0000000000000002L});

}