/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author a.ballagan
 */
public class Sudoku extends JFrame {
    //TicTacToe "is a" JFrame
    Button[][] buttonGrid;
    static int Rows = 9;
    static int Cols = 9;
    boolean gameOver;
    JLabel message;
    static boolean t = true;
    static boolean f = false;
    int[][] allValues = {{7,5,3,2,8,4,1,6,9},
                        {2,1,8,3,9,6,7,5,4},
                        {4,9,6,1,5,7,8,2,3},
                        {6,4,9,8,3,1,2,7,5},
                        {8,2,7,5,4,9,6,3,1},
                        {5,3,1,6,7,2,9,4,8},
                        {9,6,2,4,1,5,3,8,7},
                        {1,8,5,7,6,3,4,9,2},
                        {3,7,4,9,2,8,5,1,6]};
    
    boolean[][] givenValues = {{t,t,f,t,f,f,t,f,t}};
            
    boolean[][] givenValues =  {[t,t,f,t,f,4,1,6,9],
                                [2,t,8,3,t,t,7,5,t],
                                [t,9,6,1,t,7,8,2,t],
                                [6,4,9,8,t,1,2,7,t],
                                [8,2,t,5,t,9,6,t,1],
                                [t,3,t,6,7,t,t,4,8],
                                [t,6,2,4,1,5,t,t,t],
                                [1,8,5,7,t,3,4,9,2],
                                [3,7,t,9,2,t,t,t,6]};
 /*   public Sudoku() {
        
        //JFrame frame = new JFrame("Tic Tac Toe");
        super("Sudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        JPanel messagePanel = new JPanel();
        message = new JLabel("X's turn!");
        message.setFont(new Font(Font.SERIF, Font.ITALIC, 36));
        
        messagePanel.add(message, BorderLayout.NORTH);
        this.add(messagePanel);
        
        GridLayout lm = new GridLayout(Rows,Cols);
        JPanel buttonPanel = new JPanel(lm);
        buttonGrid = new Button[Rows][Cols];
        
        for (int i = 0; i< Rows; i++){
            for(int j=0; j< Cols; j++){
                Button b = new Button();
                TileClickHandler tch = new TileClickHandler(this);
                b.addActionListener(tch);
                buttonGrid[i][j] = b;
                buttonPanel.add(b);
                
            }
        }
        this.add(buttonPanel, BorderLayout.SOUTH );
        this.pack();
        gameOver = false;
    }
}
/*    
    public void Move(Button tile){
        if (!tile.claimed && !gameOver) {
            tile.claim(currentPlayer);           
            
            int winner = checkWin();
            System.out.println(winner);
            if (winner != -1) {
                gameOver = true;
                System.out.println(gameOver);
        
                if (winner == X){
                message.setText("X Won!");
                } else {
                message.setText("O Won!");
            }
        }
        }
    }

        
    
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
    }
    
}
