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
 *
 * @author a.ballagan
 */
public class Button extends JButton{
    boolean isInitialValue;
    int actualNumber;
    int displayNumber;
            
    public Button() {
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
       Dimension dmnsn = new Dimension(100,100);
       this.setPreferredSize(dmnsn);
       
       Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 48);
       this.setFont(font);
       isInitialValue = false;
       actualNumber = 0;
       displayNumber = 0;
       
       
    }
    
    public void showInitialValues() {
        if (isInitialValue == true){ // maybe replace showNumber entirely since it's useless
            displayNumber = actualNumber;
            
            Font font = new Font(Font.SANS_SERIF, Font.BOLD, 60);
            this.setFont(font);
            
            this.setText(Integer.toString(displayNumber));
    }
        
    }
    
    public void display(int currentNumber) {
        
        if (currentNumber != 0) {
            if (isInitialValue == false){
                displayNumber = currentNumber;
                this.setText(Integer.toString(displayNumber));
                
                }
            }
    }
}