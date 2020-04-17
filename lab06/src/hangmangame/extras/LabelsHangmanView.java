package hangmangame.extras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import cs102.hangman.*;
/**
 * LabelsHangmanView class
 * @author Oğulcan Ünal
 * @version 1.00, 15 April 2020
 */
public class LabelsHangmanView extends JPanel implements IHangmanView {
   final static int START_TIME = 1000;
   Timer timer;
   JLabel noOfTries;
   JLabel lettersUsed;
   JLabel knownSoFar;
   JLabel time;
   JPanel holder;
   int timeLeft;
   ActionListener timerListener;
   
   
   //constants
   //private static final Font font = new Font("Times New Roman", Font.BOLD, 50);
   
   //constructor
   public LabelsHangmanView() {
      super();
      this.setPreferredSize(new Dimension(400,200));
      
      //intializing properties
      noOfTries = new JLabel("");
      lettersUsed = new JLabel("");
      knownSoFar = new JLabel("");
      time = new JLabel("");
      holder = new JPanel();
      timeLeft = (START_TIME / 1000) * 5;
      
//    //Styling the lables
//    noOfTries.setFont(font);
//    lettersUsed.setFont(font);
//    knownSoFar.setFont(font);
      
      //setting layout
      this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      this.add(knownSoFar);
      this.add(noOfTries);
      this.add(lettersUsed);
      this.add(time);
      this.setBackground(Color.green);
      
   }
   
   //implementing IHangmanView
   @Override
   public void updateView(Hangman hangman) {
      
      if ( !hangman.isGameOver() ) {
         knownSoFar.setText(hangman.getKnownSoFar()); 
         noOfTries.setText("Number of tries: " + hangman.getNumOfIncorrectTries());
         lettersUsed.setText("Letters used so far: " + hangman.getUsedLetters());
         repaint();
      }
      
      else {
         if ( hangman.hasLost() ) { 
            knownSoFar.setText("You lost!");
            noOfTries.setText("Try again.");
            lettersUsed.setText("Letters used: " + hangman.getUsedLetters());
         } 
         else {
            knownSoFar.setText("Congrats, you won!");
            noOfTries.setText("Number of tries: " + hangman.getNumOfIncorrectTries());
            lettersUsed.setText("Letters used: " + hangman.getUsedLetters());
         }
         
         timer = new Timer(START_TIME, timerListener);
         time.setText("");
         timer.start();

      }
      
               
      timerListener = new ActionListener(){
         
         public void actionPerformed(ActionEvent event) {
            timeLeft -= 1;
            time.setText(timeLeft + "");
            if (timeLeft == 0) {
               timeLeft = (START_TIME / 1000) * 5;
               hangman.initNewGame();
               timer.stop();
               time.setText("");
            } 
         }
      };
      
      
      
   }
   
}