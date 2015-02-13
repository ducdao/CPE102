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

        // Outer while loop to keep the game going
        while(gameMode != 0)
        {
        //Returns 1 (Player vs Computer) or 2 (Player vs Player)
        gameMode = userInput.input();
        
           // Reset the board
           Board b = new Board();
           
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
                       
                       while(!b.isValidMove(spaceInput))
                       {
                           spaceInput = ai.randomMove(b);
                       }
                       
                       b.setMove(spaceInput);
                       b.checkWin();
                       b.checkTie();
                       b.endTurn();
                    }
                    
                  }
                  
              System.out.println("Player " + b.getCurrentPlayer() + " wins!");     
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
                  
               while(!b.checkWin() && !b.checkTie())
               {
                    b.displayBoard();
                    
                    spaceInput = userInput.moveInput();
                    
                    while(!b.isValidMove(spaceInput))
                    {
                        spaceInput = userInput.moveInput();
                    }
                    
                    b.setMove(spaceInput);
                    
                    if(b.checkWin())
                    {
                       System.out.println("Player " + b.getCurrentPlayer() + " wins!");
                       System.exit(0);   
                    }
                    if(b.checkTie())
                    {
                       System.out.println("Tie game. :^(");
                       System.exit(0);   
                    }
                    b.endTurn();
               }
               
               
           }
           
           
           // Prompt user to play another game
           gameMode = userInput.input();
         }
    }
}
