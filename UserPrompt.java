import java.util.*;

public class UserPrompt
{
    public int input()
    {
        System.out.println("CPE 102 - Project 1 - Alex Deany, Duc Dao, Erza Bertuccelli, and Leticia Esparza\n")
        System.out.print("Welcome to Tic Tac Toe! Would you like to play (Y/N)?  ");
        Scanner in = new Scanner(System.in);
        String user = in.next();
        
        while(!user.equals("y") && !user.equals("Y") && !user.equals("n") && !user.equals("N"))
        {
            System.out.println("ERROR: Please enter a valid input (Y or N)!");
            System.out.print("Would you like to play (Y/N)? ");
            user = in.next();
        }
        
        if(user.equals("n") || user.equals("N")) //If user doesn't want to play...
        {
            System.out.println("Thanks for running the program! :^)");
            return 0;
        }

        System.out.print("1. Player vs Computer \n2. Player vs Player\nOption 1 or 2? ");
        int gameMode = in.nextInt();

        while(gameMode != 1 && gameMode != 2) //If the user wants to play a game...
        {
            System.out.println("ERROR: Please enter a valid input (1 or 2)!");
            System.out.print("1. Player vs Computer \n2. Player vs Player\nOption 1 or 2? ");
            gameMode = in.nextInt();
        }
        
        return gameMode;
    }
}
