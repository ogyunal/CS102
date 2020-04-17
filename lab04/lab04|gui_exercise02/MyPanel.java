import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;


/**
 *  
 * @author Ogulcan Unal
 * @version 01.04.2020
 */ 
public class MyPanel extends Panel implements ActionListener
{
   // properties
   Label label;
   TextField tf;
   Panel p;
   Button b;
   
   
   // constructors
   public MyPanel()
   {
      
      setSize( 200, 200);
      setLayout( new FlowLayout() );
      
      add( new Label( "Welcome to ZOOM") );
      
      b = new Button( "OK");
      add( b);
      add( new Button( "Good luck with Maths! ") );
      b.addActionListener ( this );
      b.addActionListener ( new MyOtherActionListener() );
      b.addActionListener( new ActionListener() { 
         public void actionPerformed(ActionEvent e) 
         { 
            System.out.println( "Button pressed! ~ AL-Annon" ); 
         } 
      });   
      b.addActionListener(  
                          e -> System.out.println( "Button pressed! ~ LAMBDA" ) );
      
      
      tf = new TextField (25);
      add(tf);
      tf.addActionListener( new MyOtherTFActionListener() );
      
      p = new Panel();
      p.setBackground (Color.green);
      p.setPreferredSize (new Dimension(200, 150));
      add(p);
   }
   //methods
   public void actionPerformed (ActionEvent e) {
      if (e.getSource() != tf)
         System.out.println("Button Pressed");
      else 
         System.out.println("TextField Pressed");
      
      label.setText (tf.getText());
   }
   
   
   
   
   //inner classes
   class MyActionListener implements ActionListener 
   { 
      public void actionPerformed(ActionEvent e) 
      { 
         System.out.println( "Button pressed! ~ ALNIC" ); 
      }
      // right way is to override paint 
      
      public void paint(Graphics g) {
         //super.paint(g);
         g.drawRect(320, 120, 240, 180);
      }
      
   }
   
   class MyOtherActionListener implements ActionListener {
      int counter = 0;
      
      public void actionPerformed (ActionEvent e) {
         System.out.println("Button Pressed ~ AL-other");
         
         if  (counter % 2 == 0) {
            b.setLabel("Maybe");
         } else {
            b.setLabel("OK");
         }
         
      }
   }
   
   class MyOtherTFActionListener implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {
         System.out.println("TextField enter key pressed");
         System.out.println (tf.getText());
         label.setText (tf.getText());
      }
      
   }
   
}
