/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author a.ballagan
 */
public class TileClickHandler implements ActionListener {
//ActionListener is an interface which means it has abstract methods
    // and can't be used to make objects. basically we are telling what the
    //action should be since there is no default action for that
    Sudoku game;
    
    public TileClickHandler(Sudoku game){
        this.game = game;
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
         Button button = (Button)ae.getSource();
         button.display(game.getCurrentNumber());
         System.out.println("click");
    }
    
}
