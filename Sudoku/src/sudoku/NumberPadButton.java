/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
* This method is used to add two integers. This is
* a the simplest form of a class method, just to
* show the usage of various javadoc Tags.
 *
 * @author balla
 */
public class NumberPadButton extends JButton{
    int numberPadNumber;
    
    /**
* This method is used to add two integers. This is
* a the simplest form of a class method, just to
* show the usage of various javadoc Tags.
*/
    
    public NumberPadButton(){
     this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
       Dimension dmnsn = new Dimension(100,100);
       this.setPreferredSize(dmnsn);
       
       Font font = new Font(Font.SANS_SERIF, Font.BOLD, 48);
       this.setFont(font);
       
       numberPadNumber = 0;
    }

    
}
