package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* The tile click handler detects when a button is clicked and
* performs the consequent action

 *
 * @author a.ballagan
 */
public class TileClickHandler implements ActionListener {
//ActionListener is an interface which means it has abstract methods
    // and can't be used to make objects. basically we are telling what the
    //action should be since there is no default action for that
    Sudoku game;
    
    /**
* The tile click handler constructor refrences the Sudoku game
* it's getting inputs from
* @param game refrences the specific Sudoku game for which the 
* handler is detecting inputs
 */
    public TileClickHandler(Sudoku game){
        this.game = game;
    }
    
    
    /**
* The actionPerformed method differentiates the input clicks on a button object
* on the Sudoku board from the clicks on a number pad button. after identifying
* which class the object clicked belongs to the method then
* performs the subsequent action
* @param ae The Action Event paramater is needed so the actionPerformed 
* method can access properties of the action event class
* */
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
            if (ae.getSource() instanceof Button){
            Button button = (Button)ae.getSource();
             button.display(game.getCurrentNumber());
             if (game.checkWin() == true){
                 game.gameOver = true;
                 game.gameWin(game);
                }
            }
            
            if (ae.getSource() instanceof NumberPadButton){
            NumberPadButton button = (NumberPadButton)ae.getSource();
             game.currentNumber = button.numberPadNumber;
             
            }
        }
}
