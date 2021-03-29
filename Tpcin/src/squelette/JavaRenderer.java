package squelette;

import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import Lib3d.* ;
import Lib3d.Loader.*;

import java.util.*;

import java.io.IOException;
import java.nio.FloatBuffer ;

import parser.XGDLexer;
import parser.XGDParser;

public class JavaRenderer implements GLEventListener, KeyListener, MouseMotionListener, MouseListener
{
	/** Camera rotation step (in degree) */
	static final float rotationAngle = 0.5f ;
	/** Camera translation step */
	static final float translationStep = 2.0f ;
	   
	/** OpenGL utilities */
   private static final GLU glu = new GLU();
   
   /** Scene graph root */
   private Lib3d.SceneGraph.Group m_root = XGDParser.root; //new Lib3d.GlSceneGraph.Group() ;

   /** Materials library */
   private MaterialLib materialLib = new MaterialLib() ;
   
   /** Loaded 3D objects */
   private Vector<Object3d> objects = new Vector<Object3d>() ;
  
   /** Camera position */
   Lib3d.Vector3d m_cameraPosition  = new Vector3d(0.0f, 100.0f, 800.0f); 
   /** Camera angle around Y axis */
   float m_cameraAngleY = 0.0f ;
   /** Camera angle around X axis */
   float m_cameraAngleX = 0.0f ;
   /** Last mouse position on X axis */
   float m_lastMouseX = 0.0f ;
   /** Last mouse position on Y axis */
   float m_lastMouseY = 0.0f ;
   
   // Canvas
   GLCanvas m_canvas ;
   
   JavaRenderer(GLCanvas canvas)
   {
	   m_canvas = canvas ;
   }
   
   /**
    * Display method 
    */
   public void display(GLAutoDrawable glDrawable) 
   {
	   // display callback
       final GL2 gl = glDrawable.getGL().getGL2();
       
       // clear color and depth buffer
       gl.glClear(GL.GL_COLOR_BUFFER_BIT);
       gl.glClear(GL.GL_DEPTH_BUFFER_BIT);
       
       // Transformations (Èquivalent ‡ une translation de 300cm de la camÈra suivant l'axe Z et une translation de 100cm suivant l'axe Y)
       gl.glLoadIdentity();
       
       // Camera transformations 
       gl.glRotatef(-m_cameraAngleX, 1.0f, 0.0f, 0.0f) ;
       gl.glRotatef(-m_cameraAngleY, 0.0f, 1.0f, 0.0f) ;
       gl.glTranslatef(-m_cameraPosition.get(0), -m_cameraPosition.get(1), -m_cameraPosition.get(2)) ;
       
       // Draws world coordinate system
       Draw.drawAxis(glDrawable, 400.0f) ;       
       // Draws loaded objects
       for(int cpt=0 ; cpt<objects.size() ; ++cpt)
       {
    	   Draw.draw(glDrawable, objects.get(cpt), materialLib) ;
       }
       m_root.draw(glDrawable);
   }

   public void displayChanged(GLAutoDrawable glDrawable, boolean modeChanged, boolean deviceChanged) 
   {}

   /** 
    * Initialisation method
    */
   public void init(GLAutoDrawable glDrawable) 
   {	   
       final GL2 gl = glDrawable.getGL().getGL2();

       // --------------------------
       // Initialisation de la scËne
       // --------------------------
       
       // Charge les fichiers correspondant ‡ la gÈomÈtrie et aux matÈriaux
       materialLib.setTexturePath("data") ;
	   try
	   {
		   //ObjLoader.load("data/test01mat.obj", objects) ;
		   ObjLoader.load("data/test01mat_02.mtl", materialLib) ;
//		   ObjLoader.load("data/sapin02.obj", objects) ;
		  // ObjLoader.load("data/sapin02.mtl", materialLib) ;
		   materialLib.registerTextures(gl) ; // Charge et enregistre les textures au niveau d'OpenGL
	   }
	   catch(IOException e)
	   {
		   System.out.print("Load error!") ;
		   System.exit(-1) ;
	   }
	   
	

	   //-----------------------
	   // Initialisations OpenGL
	   //-----------------------

       gl.glShadeModel(GL2.GL_SMOOTH); // Shading mode
       gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // Frame buffer clear color
       // init z-buffer
       gl.glClearDepth(1.0f);
       gl.glEnable(GL2.GL_DEPTH_TEST);
       gl.glDepthFunc(GL2.GL_LEQUAL);
       gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);
       // Enalbles textures
       gl.glEnable(GL2.GL_TEXTURE_2D);     
       // Enables lights
       gl.glEnable(GL2.GL_LIGHTING) ;
       // Enables light 0
       gl.glEnable(GL2.GL_LIGHT0) ;
       float[] lightColor = {0.3f, 0.3f, 0.3f} ;	// Couleur de la lumiËre
       float[] lightPosition = {0.0f, 0.0f, 0.0f} ; // Position de la lumiËre
       // Initializes light 0
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, FloatBuffer.wrap(lightColor)) ;
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, FloatBuffer.wrap(lightColor)) ;
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, FloatBuffer.wrap(lightColor)) ;
       // Light positionning
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, FloatBuffer.wrap(lightPosition)) ;
       
       // Keyboard listener
//       glDrawable.addKeyListener(this);
       m_canvas.addKeyListener(this);
       // Mouse listeners
//       glDrawable.addMouseMotionListener(this) ;
       m_canvas.addMouseMotionListener(this) ;
//       glDrawable.addMouseListener(this) ;
       m_canvas.addMouseListener(this) ;


   java.util.Timer timer = new java.util.Timer();
		timer.schedule(new java.util.TimerTask() {
			
			
		    @Override
		    public void run() {
		    	try {
		    		// On r√©cup√®re la main sur le display
		    		sem.acquire();
		    		// On reset le lexer pour ne pas avoir √† parcourir le fichier √† nouveau
		    		JavaMain.lex.reset();
		    		CommonTokenStream tokens = new CommonTokenStream(JavaMain.lex);
		    		XGDParser g = new XGDParser(tokens, 49100, null);
		    		// On reset le noeud root du parser
		    		XGDParser.root = new Lib3d.GlSceneGraph.Group();	// Supprime les deux premiers affichages du fichier -> pourquoi ?
		    		// On incr√©mente le t
		    		JavaMain.t = JavaMain.t+0.01f;
		    		// Que l'on ins√®re ensuite dans la map utilis√©e par le parser
		    		XGDParser.expressmap.put("t", JavaMain.t);
		    		// On parse le fichier
		    		g.root();
		    		// On remplace le root de l'affichage par le nouveau root
		    		m_root = XGDParser.root;
		    		// On rend la main au display
		    		sem.release();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }	
		    }
		}, 0, 10);
  }
   

   public static java.util.concurrent.Semaphore sem = new java.util.concurrent.Semaphore(1);
   /**
    * Reshape of the rendering window
    */
   public void reshape(GLAutoDrawable gLDrawable, int x, int y, int width, int height) 
   {
       final GL2 gl = gLDrawable.getGL().getGL2();
       if(height <= 0) { height = 1; }
       // camera and perspective
       final float aspectRatio = (float)width / (float)height;
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluPerspective(50.0f, aspectRatio, 1.0, 1000.0);
       gl.glMatrixMode(GL2.GL_MODELVIEW);
       gl.glLoadIdentity();
   }

   @Override
   public void keyPressed(KeyEvent e) 
   {
       if(e.getKeyCode() == KeyEvent.VK_ESCAPE) 
       {
           JavaMain.bQuit = true;
           System.exit(0);
       }
       else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyChar() == 'z')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
       else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyChar() == 's')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;    	   
       }
       else if(e.getKeyCode() == KeyEvent.VK_LEFT  || e.getKeyChar() == 'q')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI+Math.PI/2.0)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
       else if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyChar() == 'd')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI-Math.PI/2.0)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
   }

	@Override
   public void keyReleased(KeyEvent e) 
   {
   }

	@Override
   public void keyTyped(KeyEvent e) 
   {
   }

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		m_cameraAngleY += -(e.getX()-m_lastMouseX)*rotationAngle ;
		m_cameraAngleX += -(e.getY()-m_lastMouseY)*rotationAngle ;
		
		m_lastMouseX = e.getX() ;
		m_lastMouseY = e.getY() ;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		m_lastMouseX = e.getX() ;
		m_lastMouseY = e.getY() ;
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

  
}
