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
 * @author a.ballagan
 *
 */
public class Button extends JButton{
    boolean isInitialValue;
    int actualNumber;
    int displayNumber;
    
    
 /**
* This method is used to add two integers. This is
* a the simplest form of a class method, just to
* show the usage of various javadoc Tags.
*/
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
    
        /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
    public void showInitialValues() {
        if (isInitialValue == true){ // maybe replace showNumber entirely since it's useless
            displayNumber = actualNumber;
            
            Font font = new Font(Font.SANS_SERIF, Font.BOLD, 60);
            this.setFont(font);
            
            this.setText(Integer.toString(displayNumber));
    }
        
    }
    
        /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
    public void display(int currentNumber) {
        if (currentNumber != 0) {
            if (isInitialValue == false){
                displayNumber = currentNumber;
                this.setText(Integer.toString(displayNumber));
                
                }
            }
    }
}