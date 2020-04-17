import java.awt.*;
import javax.swing.*;

/**
 *  
 * @author 
 * @version 
 */ 
public class MyPanel extends Panel
{
   // properties

   // constructors
   public MyPanel()
   {
      Button b;
      setSize( 200, 200);
      setLayout( new GridLayout( 2, 3) );
      
      add( new Label( "Welcome to ZOOM") );
      
      b = new Button( "OK");
      add( b);
      add( new Button( "Good luck with Maths! ") );
      
      add( new TextField( 10) );      
   }

   // methods
     
}