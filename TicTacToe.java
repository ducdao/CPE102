import java.util.*;

public class TicTacToe
{
    public static void main(String[] args)
    {
        int gameMode;
    
        //Prompts the user to play tic-tac-toe
        UserPrompt userInput = new UserPrompt();

        //Returns 1 (Player vs Computer) or 2 (Player vs Player)
        gameMode = userInput.input();
        
        Board b = new Board();
        b.printBoard();
        
        //Execute Player vs Computer class
        if(gameMode == 1)
        {
            System.out.println("Execute Player vs Computer class!");
            // Reset the board / Display blank board
            // Prompt player for their move / scan in position
            // While loop to keep program running until winner
            // Check that the input is correctly formatted and space is not already occupied
            // Fill the space with the player's move
            // Print the new board
            // Check to see if there is a winner or a tie
               // If winner, display message
               // Prompt user to play another game
                  // If yes, return to top of program and play again
                  // If no, quit the program
            // Let the computer make it's move
            // Make sure move is valid (nonempty, etc)
            // Fill the space with the computer's move
            // Print the new board
            // Check to see if winner 
               // If winner, display message and prompt to play another game
               // If no winner, prompt the player for a new move / scan in position
        }
        //Execute Player vs Player class
        else if(gameMode == 2)
        {
            System.out.println("Execute Player vs Player class!");
            // Reset the board / Display blank board
            // Prompt player 1 for their move / scan in position
            // While loop to make sure game doesn't terminate until winner/tie
            // Check that the input is correctly formatted and space is not already occupied
            // Fill the space with the player's move
            // Print the new board
            // Check to see if there is a winner or a tie
               // If winner, display message and return to top of program
                  // Prompt user to play another game
                     // If yes, return to top of program
                     // If no, exit the program
            // Prompt player 2 for their move / scan in position (if no winner)
            
            
        }
    }
}
