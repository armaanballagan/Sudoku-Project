package sudoku;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
* <h1>Sudoku!</h1>
*This Program generates a playable Sudoku Board
 * 
 * @author a.ballagan
 */
public class Sudoku extends JFrame {
    //TicTacToe "is a" JFrame
    private static int numberPadNumbers = 9;
    private static int Rows = 9;
    private static int Cols = 9;
    private static Button[][] buttonGrid = new Button[Rows][Cols];
    private static int squareRows = 3;
    private static int squareCols = 3;
    private int currentNumber;
    boolean gameOver;
    JLabel titleMessage;
    JLabel winMessage;
    JPanel gameScreen;
    JPanel winScreen;
    private static boolean t = true;
    private static boolean f = false;
    private static int[][] actualValues = {{7,5,3,2,8,4,1,6,9},
                                {2,1,8,3,9,6,7,5,4},
                                {4,9,6,1,5,7,8,2,3},
                                {6,4,9,8,3,1,2,7,5},
                                {8,2,7,5,4,9,6,3,1},
                                {5,3,1,6,7,2,9,4,8},
                                {9,6,2,4,1,5,3,8,7},
                                {1,8,5,7,6,3,4,9,2},
                                {3,7,4,9,2,8,5,1,6}};
            
    static boolean[][] givenValues =  {{t,t,f,t,f,f,f,f,f},
                                {f,t,f,f,t,t,f,f,t},
                                {t,f,f,f,t,f,f,f,t},
                                {f,f,f,f,t,f,f,f,t},
                                {f,f,t,f,t,f,f,t,f},
                                {t,f,t,f,f,t,t,f,f},
                                {t,f,f,f,f,f,t,t,t},
                                {f,f,f,f,t,f,f,f,f},
                                {f,f,t,f,f,t,t,t,f}};
    static boolean[][] givenValuestest =  {{t,t,t,t,t,t,f,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t},
                                {t,t,t,t,t,t,t,t,t}};
    
    /**
   * The Sudoku constructer organizes the Sudoku board into panels and also defines
   * properties of the Sudoku object such as the 
   * game screen(what the board looks like) and win screen
   */
    
    public Sudoku() {
        //current values grid = given values grid?
    
        //JFrame frame = new JFrame("Sudoku");
        super("Sudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        gameScreen = new JPanel();
        winScreen = new JPanel();        
        
        //sudoku title
        JPanel messagePanel = new JPanel();
        titleMessage = new JLabel("Sudoku");
        titleMessage.setFont(new Font(Font.SERIF, Font.ITALIC, 60));
        messagePanel.add(titleMessage);
        javax.swing.border.Border titleBorder = BorderFactory.createMatteBorder(0, 0, 5, 0, Color.black); //border
        javax.swing.border.Border padding = BorderFactory.createEmptyBorder(0, 0, 20, 0); //padding
        javax.swing.border.Border compound = BorderFactory.createCompoundBorder(padding, titleBorder);
        messagePanel.setBorder(compound);
        this.add(messagePanel, BorderLayout.NORTH);

        
        //win screen
        winMessage = new JLabel("You Win!");
        winMessage.setFont(new Font(Font.SERIF, Font.ITALIC, 300));
        winScreen.add(winMessage, BorderLayout.SOUTH);
        winScreen.setBorder(BorderFactory.createEmptyBorder(250, 100, 250, 100)); //padding
         
       //game screen
        GridLayout numberPadLayoutManager = new GridLayout(squareRows,squareCols);
        JPanel numberPadPanel = new JPanel(numberPadLayoutManager);
        numberPadPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0)); //padding
        for(int n = 1; n <= numberPadNumbers; n++){
            NumberPadButton b = new NumberPadButton();
            b.setNumberPadNumber(n);
            b.setText(Integer.toString(b.getNumberPadNumber()));
            TileClickHandler tch = new TileClickHandler(this);
            b.addActionListener(tch);
            b.setBorder(BorderFactory.createLineBorder(Color.black));
            numberPadPanel.add(b);
        }
        
        GridLayout sudokuBoardLayoutManager = new GridLayout(squareRows,squareCols);
        JPanel sudokuBoardPanel = new JPanel(sudokuBoardLayoutManager);
        
        GridLayout squareLayoutManager = new GridLayout(squareRows,squareCols);
        for(int r = 0; r < squareRows; r++) {
            for(int c = 0; c < squareCols; c++) {
            JPanel squarePanel = new JPanel(squareLayoutManager);
            squarePanel.setBorder(BorderFactory.createLineBorder(Color.black));
            
                for (int i = 0; i < squareRows; i++){
                    for(int j = 0; j < squareCols; j++){
                        Button b = new Button();
                        int rowNum = r*3 + i;
                        int colNum = c*3 + j;
                        b.setActualNumber(actualValues[rowNum][colNum]);
                        b.isInitialValue = givenValues[rowNum][colNum]; //remove "test"
                        b.showInitialValues();
                        TileClickHandler tch = new TileClickHandler(this);
                        b.addActionListener(tch);
                        buttonGrid[rowNum][colNum] = b;
                        squarePanel.add(b);
                    }
                }
            sudokuBoardPanel.add(squarePanel);
            }
        }
        
        
        gameScreen.add(sudokuBoardPanel, BorderLayout.WEST);
        gameScreen.add(numberPadPanel, BorderLayout.EAST);
        this.add(gameScreen);
        this.pack();
        gameOver = false;
    }

     /**
   * Returns currentNumber attribute of a Sudoku object
   * @return integer. returns a integer value from 1-9
   */
    public int getCurrentNumber(){
        return currentNumber;
            }
    
    /**
   * sets currentNumber attribute of a Sudoku object
   * @param num. sets currentNumber to an integer value from 1-9
   */
    public void setCurrentNumber(int num){
        currentNumber = num;
            }
    
     /**
   * Cycles through each button to check if the number
   * shown matches the actual number of the Sudoku board at that point. 
   * Returns true if all shown numbers match the actual numbers.
   * Else returns false
   * @return boolean. returns a true of false value
   */
    
    public boolean checkWin(){
        boolean gameWin = true; //true until proven false
         for(int r = 0; r < Rows; r++) {
             for(int c = 0; c < Cols; c++) {
                if (buttonGrid[r][c].displayNumber != actualValues[r][c]){
                    gameWin = false;
                    return gameWin;
                } 
            }
         }
        return gameWin;
    }
    
    
     /**
   * Changes from gameScreen to winScreen
   * @param game. takes the specific Sudoku game being referenced as input
   */
    public void gameWin(Sudoku game){
        game.remove(gameScreen);
        game.add(winScreen, BorderLayout.CENTER);
        game.revalidate();
        game.repaint();
     }
    
    
     /**
   * This is the main method which runs the command to generate a new Sudoku game
   */
    public static void main(String[] args) {

        Sudoku game = new Sudoku();
        
    }
    
}
