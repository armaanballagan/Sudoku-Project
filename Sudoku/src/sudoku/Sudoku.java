/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author a.ballagan
 */
public class Sudoku extends JFrame {
    //TicTacToe "is a" JFrame
    static int numberPadNumber = 9;
    static int Rows = 9;
    static int Cols = 9;
    static Button[][] buttonGrid = new Button[Rows][Cols];
    static int squareRows = 3;
    static int squareCols = 3;
    boolean gameOver;
    int currentNumber;
    JLabel message;
    JLabel squareMessage;
    static boolean t = true;
    static boolean f = false;
    static int[][] allValues = {{7,5,3,2,8,4,1,6,9},
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
    public Sudoku() {
        //current values grid = given values grid?
    
        //JFrame frame = new JFrame("Sudoku");
        super("Sudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        JPanel messagePanel = new JPanel();
        message = new JLabel("Sudoku");
        message.setFont(new Font(Font.SERIF, Font.ITALIC, 36));
        messagePanel.add(message, BorderLayout.NORTH);
        this.add(messagePanel);
        
        GridLayout numberPadLayoutManager = new GridLayout(squareRows,squareCols);
        JPanel numberPadPanel = new JPanel(numberPadLayoutManager);
        for(int n = 1; n <= numberPadNumber; n++){
            //NumberPadButton b = new NumberPadButton(n);
            TileClickHandler tch = new TileClickHandler(this);
            //b.addActionListener(tch);
        }
        
        
        GridLayout sudokuBoardLayoutManager = new GridLayout(squareRows,squareCols);
        JPanel sudokuBoardPanel = new JPanel(sudokuBoardLayoutManager);
        
        GridLayout squareLayoutManager = new GridLayout(squareRows,squareCols);
        for(int r = 0; r < squareRows; r++) {
            for(int c = 0; c < squareCols; c++) {
            JPanel squarePanel = new JPanel(squareLayoutManager);
            
            javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
            squarePanel.setBorder(blackline);
            
            /*squareMessage = new JLabel("hi");
            squareMessage.setFont(new Font(Font.SERIF, Font.ITALIC, 36));
            squarePanel.add(squareMessage);
            */
            for (int i = 0; i < squareRows; i++){
                for(int j = 0; j < squareCols; j++){
                    Button b = new Button();
                    int rowNum = r*3 + i;
                    int colNum = c*3 + j;
                    b.actualNumber = allValues[rowNum][colNum];
                    b.showNumber = givenValues[rowNum][colNum];
                    TileClickHandler tch = new TileClickHandler(this);
                    b.addActionListener(tch);
                    buttonGrid[rowNum][colNum] = b;
                    squarePanel.add(b);
                }
            }
            sudokuBoardPanel.add(squarePanel);
            }
        }
        this.add(sudokuBoardPanel, BorderLayout.WEST);
        this.add(numberPadPanel, BorderLayout.EAST);
        this.pack();
        gameOver = false;
    }

    
    public int getCurrentNumber(){
        currentNumber = 99;
        return currentNumber;
            }
        

        
    /*
    public int checkWin() {
        int winner = -1;
        //horizontal wins. Check each row for 3 of the same thing
         
        for(int r = 0; r < Rows; r++) {
            for(int c = 0; c < Cols; c++) {
            boolean cond1 = buttonGrid[r][0].owner == buttonGrid[r][1].owner;
            boolean cond2 = buttonGrid[r][0].owner == buttonGrid[r][2].owner;
            boolean cond3 = buttonGrid[r][0].owner != -1;
            if ((cond1) && (cond2) && (cond3)) {
                winner = buttonGrid[r][0].owner;
                
            }
            
            
        }
                     
        }
        
        
       // vertical wins
        for (int c = 0; c < Cols; c++) {
            boolean cond1 = buttonGrid[0][c].owner == buttonGrid[1][c].owner;
            boolean cond2 = buttonGrid[0][c].owner == buttonGrid[2][c].owner;
            boolean cond3 = buttonGrid[0][c].owner != -1;
            if ((cond1) && (cond2) && (cond3)) {
                winner = buttonGrid[0][c].owner;
        }
                    
        }
        
          
       //diagonal wins
       boolean cond1 = buttonGrid[0][0].owner == buttonGrid[1][1].owner;
       boolean cond2 = buttonGrid[0][0].owner == buttonGrid[2][2].owner;
       boolean cond3 = buttonGrid[0][0].owner != -1;
       if (cond1 && cond2 && cond3) {
           winner = buttonGrid[0][0].owner;
           
       }
        
       
       cond1 = buttonGrid[2][0].owner == buttonGrid[1][1].owner;
       cond2 = buttonGrid[2][0].owner == buttonGrid[0][2].owner;
       cond3 = buttonGrid[2][0].owner != -1;
       if (cond1 && cond2 && cond3) {
           winner = buttonGrid[0][0].owner;
           
       }
       
       return winner;
       
       
    }
    */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Sudoku game = new Sudoku();
        /*for (int r=0; r < Rows; r++) {
            for (int c=0; c< Cols; c++) {
                
            if (buttonGrid[r][c].showNumber == true) {
                        System.out.print(buttonGrid[r][c].actualNumber);
            } else{
                    System.out.print(" ");
                    }
            }
            System.out.println();
        }*/
        
    }
    
}
