package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
* creates buttons on the Sudoku board

 *
 * @author a.ballagan
 *
 */
public class Button extends JButton{
    private int actualNumber;
    boolean isInitialValue;
    int displayNumber;
    
    
 /**
* The buttons constructor defines the properties of the buttons as well as 
* what the buttons on the Sudoku board look like
*/
    public Button() {
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
       Dimension dmnsn = new Dimension(90,90);
       this.setPreferredSize(dmnsn);
       
       Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 48);
       this.setFont(font);
       isInitialValue = false;
       actualNumber = 0;
       displayNumber = 0;
       
       
    }
    
        /**
   * Checks to see if a button contains a starting value (given value) on
   * the Sudoku board.
   */
    public void showInitialValues() {
        if (isInitialValue == true){ // maybe replace showNumber entirely since it's useless
            displayNumber = actualNumber;
            
            Font font = new Font(Font.SANS_SERIF, Font.BOLD, 60);
            this.setFont(font);
            this.setText(Integer.toString(displayNumber));
            this.setBackground(Color.decode("#cffff8"));
    }
        
    }
    
        /**
   * This method is triggered when a button is clicked.
   * If the button wasn't a starting value then it changes the display value
   * to the value that the user inputs
   * @param currentNumber this is the number a user tries to input
   */
    public void display(int currentNumber) {
        if (isInitialValue == false){
            displayNumber = currentNumber;
            
            if (currentNumber == 0) {
                this.setText("");
            }else {
                    this.setText(Integer.toString(displayNumber));
            }
        }
    }
    
    /**
   * Returns actualNumber attribute of a button object
   * @return actualNumber. returns a integer value from 1-9
   */
    public int getActualNumber(){
        return actualNumber;
            }
    
    /**
   * sets actualNumber attribute of a button object
   * @param num. sets actualNumber to an integer value from 1-9
   */
    public void setActualNumber(int num){
        actualNumber = num;
            }
    
    
    
}