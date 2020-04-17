package hangmangame.extras;
/**
 * TextFieldControlPanel class
 * @author Oğulcan Ünal
 * @version 1.00, 15 April 2020
 */
import cs102.hangman.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldControlPanel extends JPanel implements ActionListener {
  
  private JTextField textField;
  private Hangman hangman;
  
  public TextFieldControlPanel(Hangman hangman) {
    super();   
    this.hangman = hangman;
    textField = new JTextField(10);

    this.add(textField); 
    textField.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent event) {
    String letters = textField.getText();
    
    //tryThis for all characters
    for (int i = 0; i < letters.length(); i++) {
      hangman.tryThis(letters.charAt(i));
    }
    
    //changes the textfield to an empty one
    textField.setText("");
  }
}