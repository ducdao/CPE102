import java.util.*;

public class UserPrompt
{
    public int input()
    {
        System.out.print("\nWelcome to Tic Tac Toe! Would you like to play (Y/N)?  ");
        Scanner in = new Scanner(System.in);
        String user = in.next();
        
        while(!user.equals("y") && !user.equals("Y") && !user.equals("n") && !user.equals("N"))
        {
            System.out.println("ERROR: Please enter a valid input (Y/N)!");
            System.out.print(" Would you like to play (Y/N)? ");
            user = in.next();
        }
        
        if(user.equals("y") || user.equals("Y")) //If the user wants to play a game...
        {
            System.out.print("1. Player vs Computer \n2. Player vs Player\nOption 1 or 2? ");
            return in.nextInt();
        }
        else //If user doesn't want to play...
        {
            System.out.println("Thanks for running the program! :^)");
            return 0;
        }
    }
}
