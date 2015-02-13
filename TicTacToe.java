import java.util.*;

public class TicTacToe
{
    public static void main(String[] args)
    {
        int gameMode;
        int spaceInput;
    
        //Prompts the user to play tic-tac-toe
        UserPrompt userInput = new UserPrompt();

        // Outer while loop to keep the game going

        //Returns 1 (Player vs Computer) or 2 (Player vs Player)
        gameMode = userInput.input();
        
        // Reset the board / Display blank board
        Board b = new Board();
        b.printBoard();
        
        //Execute Player vs Computer class
        if(gameMode == 1)
        {
            System.out.println("Execute Player vs Computer class!");
            // Prompt player for their move / scan in position
            // Inner while loop to keep player vs AI running until winner
               while(!b.checkWin() && !b.checkTie())
               {
                 b.displayBoard();
                 
                 spaceInput = userInput.moveInput();
                 
                 while(!b.isValidMove(spaceInput))
                 {
                     spaceInput = userInput.moveInput();
                 }
                 
                 b.setMove(spaceInput);
                 b.checkWin();
                 b.checkTie();
                 b.endTurn();
                 b.displayBoard();
                 
                 if(!b.checkWin() && !b.checkTie())
                 {
                    System.out.println("Computer is making move...");
                    AIOpponent ai = new AIOpponent();
                    spaceInput = ai.randomMove(b);
                    b.setMove(spaceInput);
                    b.endTurn();
                 }
                 
               }
            // Check that the input is correctly formatted and space is not already occupied
               //Logic logic = new Logic(); 
               //logic.isValidMove();
            // Fill the space with the player's move
               //b.setMove();
            // Print the new board
               //b.displayBoard();
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
               // If winner, display message
               // If no winner, prompt the player for a new move / scan in position
        }
        //Execute Player vs Player class
        else if(gameMode == 2)
        {
            System.out.println("Execute Player vs Player class!");
            // Prompt player 1 for their move / scan in position
            // Another inner while loop to make sure game doesn't terminate until winner/tie
            // Check that the input is correctly formatted and space is not already occupied
            // Fill the space with the player's move
            // Print the new board
            // Check to see if there is a winner or a tie
               // If winner, display message and exit loop
               // If no winner, prompt player 2 for their move / scan in position
            
            
        }
        
        // Prompt user to play another game
    }
}
