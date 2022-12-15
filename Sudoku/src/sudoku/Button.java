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
    boolean showNumber;
    int number;
            
    public Button() {
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
       Dimension dmnsn = new Dimension(100,100);
       this.setPreferredSize(dmnsn);
       
       Font font = new Font(Font.SANS_SERIF, Font.BOLD, 48);
       this.setFont(font);
       
       showNumber = false;
       
    }
    
    public void claim(int player) {
        if (player == Sudoku.X){
            this.setText("X");
        } else {
            this.setText("O");
        }
        
        this.claimed = true;
        this.owner = player;
    }
}