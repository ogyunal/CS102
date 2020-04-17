package hangmangame.extras;
/**
 * NewGameButtonControl class
 * @author Oğulcan Ünal
 * @version 1.00, 15 April 2020
 */
import cs102.hangman.*;
import java.awt.event.*;
import javax.swing.*;

public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView {
  
  private Hangman hangman;
  
  public NewGameButtonControl(Hangman hangman) {
    super("New Game");
    this.hangman = hangman;
    this.addActionListener(this);
    this.setEnabled(false);
  }
  
  public void actionPerformed(ActionEvent event) {
    hangman.initNewGame();
    this.setEnabled(false); 
  }
  
  public void updateView(Hangman hangman) {
    if ( hangman.isGameOver()) {
      this.setEnabled(true);
    }
  }
}