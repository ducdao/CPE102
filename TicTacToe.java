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
        }
        //Execute Player vs Player class
        else if(gameMode == 2)
        {
            System.out.println("Execute Player vs Player class!");
        }
    }
}
