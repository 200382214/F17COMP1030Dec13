package f17comp1030dec13;

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
        
    //    do
    //    {
    //        displayGameBoard();
    //        makeMove();
    //    } while (!gameWon());
        
    } //end of main method
    
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
