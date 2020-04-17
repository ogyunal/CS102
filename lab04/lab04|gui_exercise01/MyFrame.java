import java.awt.*;
import javax.swing.*;

/**
 *  
 * @author 
 * @version 
 */ 
public class MyFrame extends JFrame
{
   // properties
   
   // constructors
   public MyFrame()
   {
      
      setBounds( 350, 250, 400, 300);
      //setSize(x,y);
      JButton b = new JButton("Fine");
      JLabel l = new JLabel("Whats up");
      JTextField t = new JTextField("Enter your name here");
      
      add(b);
      add(l);
      add(t);
      
      b.setBounds(130,100,100, 40);
      l.setBounds(150,70, 200,20);  
      t.setBounds(80,150, 200,20);  
 
      setLayout( new BorderLayout() );
      setVisible( true );      
   }
}