import java.util.*;

public class TicTacToe
{
    public static void main(String[] args)
    {
        int gameMode = 100;
        int spaceInput;

        System.out.println("CPE 102 - Project 1 - Alex Deany, Duc Dao, Erza Bertuccelli, and Leticia Esparza\n");

        //Prompts the user to play tic-tac-toe
        UserPrompt userInput = new UserPrompt();

        //Returns 1 (Player vs Computer) or 2 (Player vs Player)
        gameMode = userInput.input();

        // Outer while loop to keep the game going
        while(gameMode != 0)
        {
            // Reset the board
            Board b = new Board();

            b.displayDummyBoard();

            //Execute Player vs Computer class
            if(gameMode == 1)
            {
                // Prompt player for their move / scan in position
                // Inner while loop to keep player vs AI running until winner
                while(!b.checkWin() && !b.checkTie())
                {
                    b.displayBoard();

                    if(b.getCurrentPlayer() == 1)
                    {
                        spaceInput = userInput.moveInput(b);
                    }
                    else
                    {
                        AIOpponent ai = new AIOpponent();
                        spaceInput = ai.randomMove();
                    }

                    //Checks if it's a valid input, if not ask again
                    while(!b.isValidMove(spaceInput))
                    {
                        if(b.getCurrentPlayer() == 1)
                        {
                            spaceInput = userInput.moveInput(b);
                        }
                        else
                        {
                            AIOpponent ai = new AIOpponent();
                            spaceInput = ai.randomMove();
                        }
                    }

                    if(b.getCurrentPlayer() == -1)
                    {
                        System.out.println("Computer is making move...");
                    }

                    b.setMove(spaceInput);

                    if(b.checkWin())
                    {
                        if(b.getCurrentPlayer() == 1)
                        {
                            b.displayBoard();
                            System.out.println("You won! Congrats!");
                            break;
                        }
                        else
                        {
                            b.displayBoard();
                            System.out.println("Computer won. :^(");
                            break;
                        }
                    }

                    b.endTurn();    
                }
            }   
            //Execute Player vs Player class
            else if(gameMode == 2)
            {
                // Prompt player 1 for their move / scan in position
                // Another inner while loop to make sure game doesn't terminate until winner/tie
                // Check that the input is correctly formatted and space is not already occupied
                // Fill the space with the player's move
                // Print the new board
                // Check to see if there is a winner or a tie
                // If winner, display message and exit loop
                // If no winner, prompt player 2 for their move / scan in position

                while(!b.checkWin() && !b.checkTie())
                {
                    b.displayBoard();

                    spaceInput = userInput.moveInput(b);

                    while(!b.isValidMove(spaceInput))
                    {
                        spaceInput = userInput.moveInput(b);
                    }

                    b.setMove(spaceInput);

                    if(b.checkWin())
                    {
                        b.displayBoard();
                        System.out.println("Player " + b.getCurrentPlayer() + " wins!");
                        break;
                    }
                    else if(b.checkTie())
                    {
                        System.out.println("Tie game. :^(");
                        break;  
                    }

                    b.endTurn();  
                }
            }

            b.resetGame();
            // Prompt user to play another game
            gameMode = userInput.input();
        }
    }
}
