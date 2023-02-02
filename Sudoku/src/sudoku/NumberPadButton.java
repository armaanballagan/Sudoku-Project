package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
* Creates number pad buttons on the number pad
 *
 */
public class NumberPadButton extends JButton{
    private int numberPadNumber;
    
    /**
* The numberpadButton constructor defines what the number pad buttons look like
*/
    
    public NumberPadButton(){
     this.setBackground(Color.WHITE);
       this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       Dimension dmnsn = new Dimension(90,90);
       this.setPreferredSize(dmnsn);
       Font font = new Font(Font.SANS_SERIF, Font.BOLD, 48);
       this.setFont(font);
       
       numberPadNumber = 0;
    }

    /**
   * Returns numberPadNumber attribute of a numberPadButton object
   * @return numberPadNumber. returns an integer value from 1-9
   */
    public int getNumberPadNumber(){
        return numberPadNumber;
            }

     /**
   * sets the numberPadNumber attribute of a NumberPadButton
   * @param num. sets numberPadNumber to an integer value from 1-9
   */
    public void setNumberPadNumber(int num){
        numberPadNumber = num;
            }
    
    
}
