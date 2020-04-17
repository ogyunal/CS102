import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PotLuck extends JFrame implements ActionListener
{
   //properties
   ArrayList<JButton> buttons;
   private int count;
   Random prize;
   private int prizeNo;
   private JLabel countLabel;
   JButton prizeButton;
   final int width = 5;
   final int height = 10; 
   final int wh = width*height;
   
   //constructor
   public PotLuck()
   {
      count = 0;
      prize = new Random();
      buttons = new ArrayList<JButton>();
      
      setLayout(new BorderLayout());
      
      //Creating and placing the count label
      countLabel = new JLabel( "Guesses: " + count );
      add(countLabel,BorderLayout.NORTH);
      
      //creating and adding the panel
      JPanel myPanel=new JPanel(new GridLayout(width, height));
      add(myPanel,BorderLayout.CENTER); 
      
      //PANEL
      setBounds( 0 , 0 , 500 , 500 );  
      setTitle( " PotLuck Game " );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      
      
      for( int i = 0; i < wh; i++ )
      {
         buttons.add( new JButton(" "+ (i+1) + " "));
         myPanel.add( buttons.get(i) );
         (buttons.get(i)).addActionListener( this ); //(the addActionListener method takes the current class object as a parameter.) 
      }
      
      prizeNo = prize.nextInt(wh) + 1; //returns the next integer number from the sequence
      prizeButton = buttons.get(prizeNo-1);
      
      setVisible( true );
   }
   
   public void actionPerformed( ActionEvent e)
   {
      count++;
      countLabel.setText("Guesses: " + count);
      
      JButton curButton = (JButton)e.getSource();
  
      
      if( prizeButton.equals( curButton ))
      {
         countLabel.setText("You got it in " + count + "attempts.");
         for( int i = 0; i < buttons.size() ; i++ )
         {
            (buttons.get(i)).disable(); // disable() method is deprecated
            (buttons.get(i)).removeActionListener( this );
         }
      }  
   }
   public static void main( String[] args)
   {
      // program code
      new PotLuck();
   }
}