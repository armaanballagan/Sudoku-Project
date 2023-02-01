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
    int numberPadNumber;
    
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

    
}
