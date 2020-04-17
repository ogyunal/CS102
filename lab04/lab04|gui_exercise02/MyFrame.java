import java.awt.*; 
import java.awt.event.*; 
 
/** 
 *   
 * @author  
 * @version  
 */  
public class MyFrame extends Frame // implements WindowListener 
{ 
   // properties 
 
   // constructors 
   public MyFrame() 
   { 
      Button b; 
      Panel  p; 
       
      setLocation( 350, 250); 
      setLayout( new FlowLayout() ); 
       
      addWindowListener( new MyWindowListener() ); 
       
      p = new MyPanel(); 
      add( p); 
       
      pack(); 
      setVisible( true );       
   } 
 
   // methods 
 
   public class MyWindowListener extends WindowAdapter // MyWindowAdapter 
   { 
      @Override 
      public void windowClosing( WindowEvent e) { 
         System.out.println( "Window closing" ); 
         // dispose(); 
         System.exit( 0 ); 
      }             
   } 
    
//   public class MyWindowAdapter implements WindowListener 
//   { 
//      public void windowClosing( WindowEvent e) {} 
//      public void windowActivated( WindowEvent e) {} 
//      public void windowClosed( WindowEvent e) {}    
//      public void windowDeactivated( WindowEvent e) {} 
//      public void windowDeiconified( WindowEvent e) {} 
//      public void windowIconified( WindowEvent e) {} 
//      public void windowOpened( WindowEvent e) {}       
//   } 
      
}