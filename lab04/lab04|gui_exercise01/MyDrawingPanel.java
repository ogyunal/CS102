import java.awt.*;
import javax.swing.*;

/**
 *  
 * @author 
 * @version 
 */ 
public class MyDrawingPanel extends JPanel
{
   
   public MyDrawingPanel() {
      JFrame f= new JFrame("Panel Example");    
      JPanel panel=new JPanel();  
      panel.setBounds(0,0,300,300);    
      panel.setBackground(Color.yellow);  
      JButton b1=new JButton("Button 1");     
      b1.setBounds(50,100,80,30);    
      b1.setBackground(Color.yellow);   
      JButton b2=new JButton("Button 2");   
      b2.setBounds(100,100,80,30);    
      b2.setBackground(Color.green);   
      panel.add(b1);
      panel.add(b2);  
      f.add(panel);  
      f.setSize(300,250);    
      f.setLayout(new BorderLayout());    
      f.setVisible(true);
   }
   
   public MyDrawingPanel (int x, int y) {
      JFrame f= new JFrame("Panel Example");    
      JPanel panel=new JPanel();  
      panel.setBounds(0,0,300,300);    
      panel.setBackground(Color.yellow);  
      JButton b1=new JButton("Button 1");     
      b1.setBounds(50,100,80,30);    
      b1.setBackground(Color.yellow);   
      JButton b2=new JButton("Button 2");   
      b2.setBounds(100,100,80,30);    
      b2.setBackground(Color.green);   
      panel.add(b1);
      panel.add(b2);  
      f.add(panel);  
      f.setSize(x,y);    
      f.setLayout(new BorderLayout());    
      f.setVisible(true);
   }
   
   public void changeColorTo (Color x) {
     setBackground(Color.yellow);
   }
   
   @Override
   public void paintComponent (Graphics g) {
      super.paintComponent(g); 
   }
}
