package squelette;

//import com.jogamp.opengl.GLCanvas;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;

import Lib3d.Vector3d;
import Lib3d.GlSceneGraph.Rotation;
import Lib3d.GlSceneGraph.Scale;
import Lib3d.GlSceneGraph.Translation;
import parser.XGDLexer;
import parser.XGDParser;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Set;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class JavaMain implements Runnable 
{
	//Creation d'un animator qui nous permettra d'appeler en boucle la méthode display() cad afficher la nouvelle image sur l'écran
    static Thread displayT = new Thread(new JavaMain());
    static boolean bQuit = false;
    
    public static void main(String[] args) {
        displayT.start();
    }
    public static XGDLexer lex;
    public static float t = 0.0f;
   
    public void run() {
    	  try {
			lex = new XGDLexer(new ANTLRFileStream("C:\\Users\\quent\\Desktop\\TPcin\\TP2\\fichiers_test\\test1.txt", "UTF8"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
          CommonTokenStream tokens = new CommonTokenStream(lex);
          
          XGDParser g = new XGDParser(tokens, 49100, null);
          XGDParser.expressmap.put("t",t);
          try {
              g.root();
          } catch (RecognitionException e) {
              e.printStackTrace();
          }
          
        //Création d'une fenêtre
        Frame frame = new Frame("Compilation pour l'image");
        
        //Création d'un canvas pour pouvoir dessiner sur la fenêtre
        GLCanvas canvas = new GLCanvas();
        
        //On attache le mécanisme de callback sur notre canvas pour nous permettre d'utiliser OpenGl avec notre surface de dessin
        canvas.addGLEventListener(new JavaRenderer(canvas));
        
        //On attache notre surface dessinable à notre fenetre
        frame.add(canvas);
        
        //taille fenêtre
        frame.setSize(640, 480);
        //frame.setUndecorated(false);
        //frame.setUndecorated(true); // fullscreen
        int size = frame.getExtendedState();
        //size |= Frame.MAXIMIZED_BOTH;
        frame.setExtendedState(size);
        
        
       //Creation d'un Timer, t incrémente toutes les 10 ms
       /* java.util.Timer timer = new java.util.Timer();
 		timer.schedule(new java.util.TimerTask() {
 		    @Override
 		    public void run() {
 		    		t = t + 0.01f;
 	
 		        }	
 		    }
 		}, 0, 10);*/
        //Gerer la fermeture de la fenêtre par l'utilisateur
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                bQuit = true;
                displayT.stop();
                System.exit(0);
            }
        });
        frame.setVisible(true);
        canvas.requestFocus();
       
        while( !bQuit ) {
            
            //on update la racine afin de changer la racine prise dans les calculs de display et ainsi faire l'animation
		    	canvas.display();
		    	//updateRoot();
		    		
        }
    }
}


//On récupère nos expressions stockées dans les maps et nous changeons les noeuds correspondants aux transformations
/*
private void updateRoot() throws RecognitionException {
	//3 maps contenant les transformations associé à un tableau de String (expression des coordonnées)
 	Set<Translation> Trans = XGDParser.transmap.keySet();
	Set<Rotation> Rota = XGDParser.rotamap.keySet();
	Set<Scale> Scale = XGDParser.scamap.keySet();
	for(Translation t : Trans) {
		String[] tab = XGDParser.transmap.get(t);
		float x = Calcul(tab[0]);
		float y = Calcul(tab[1]);
		float z = Calcul(tab[2]);
		t.setTranslation(new Vector3d(x,y,z));
	}
	for(Rotation rot : Rota) {
		String[] tab = XGDParser.rotamap.get(rot);
		float x = Calcul(tab[0]);
		float y = Calcul(tab[1]);
		float z = Calcul(tab[2]);
		float angle = Calcul(tab[3]);
		rot.setAxis(new Vector3d(x,y,z));
		rot.setAngle(angle);
	}
	for(Scale sca : Scale) {
		String[] tab = XGDParser.scamap.get(sca);
		float x = Calcul(tab[0]);
		float y = Calcul(tab[1]);
		float z = Calcul(tab[2]);
		sca.setScale(new Vector3d(x,y,z));
	}
}
//Calcul de l'expression pour les coordonnées / Autre possibilité: passer par le parser de la pile.

private float Calcul(String str) throws RecognitionException {
	calcLexer lex = new calcLexer(new ANTLRStringStream(str));
	CommonTokenStream tokens = new CommonTokenStream(lex);
	XGDParser g = new XGDParser(tokens, 49100, null);
	XGDParser.expressmap.put("t", t);
	g.expre();
	return (float) g.resultat;
}
}*/

