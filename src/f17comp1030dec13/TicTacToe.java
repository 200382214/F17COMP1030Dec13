package f17comp1030dec13;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class TicTacToe {
    private static String[][] gameBoard;
    private static String currentPlayer;
    
    public static void main(String[] args)
    {
        gameBoard = new String[3][3];
        currentPlayer = "X";
        
        initializeGameBoard();
        
        do
        {
            displayGameBoard();
            makeMove();
        } while (true);
        
    } //end of main method
    
    /**
     * This method will prompt the user to enter row and column
     * positions, check if the space is in the grid and available, then
     * make the move
     */
    public static void makeMove()
    {
        int row, col;
        do
        {
            Scanner keyboard = new Scanner(System.in);
            //prompt the user for a row
            System.out.printf("Player %s, enter a row (1-3): ", currentPlayer);
            row = keyboard.nextInt();
            
            //prompt the user for a col
            System.out.printf("Player %s, enter a col (1-3): ", currentPlayer);
            col = keyboard.nextInt();
            
        } while (!validMove(--row, --col));
        
        //add the move to the gameBoard
        gameBoard[row][col]=currentPlayer;
        
        //change the current player the other player
        if (currentPlayer.equals("X"))
            currentPlayer="O";
        else
            currentPlayer="X";
    } //end of makeMove() 
    
    /**
     * This method will validate the following:
     * -row is in the range 0-2
     * -col is in the range 0-2
     * -if there is a " " character, the position is available
     */
    public static boolean validMove(int row, int col)
    {
        if (row<0 || row>2 || col<0 || col>2)
        {
            System.out.println("Sorry, row and columns must be in the range 1-3");
            return false;
        }
        
        //we know that it is a position inside the gameBoard
        if (gameBoard[row][col].equals(" "))
            return true;
        else
        {
            System.out.println("Sorry that position is already taken.");
            return false;
        }
            
    }
    
    /**
     * This method will display the gameBoard to the console as characters
     */
    public static void displayGameBoard()
    {
        for (int row=0; row<gameBoard.length; row++)
        {
            for (int col=0; col<gameBoard[row].length; col++)
            {
                if (col < 2)
                    System.out.printf(" %s |", gameBoard[row][col]);
                else
                    System.out.printf(" %s %n", gameBoard[row][col]);
            }
            if (row <2)
                System.out.println("------------");
        }
    }
    
    /**
     * This method will put a space character " " in every
     * position of the gameboard
     */
    public static void initializeGameBoard()
    {
        for (int row=0; row<gameBoard.length; row++)
        {
            for (int col=0; col<gameBoard[row].length; col++)
                gameBoard[row][col]=" ";
        }
    }
}
