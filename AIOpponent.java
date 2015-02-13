import java.util.Random;

public class AIOpponent
{
	// 1 = X, -1 = O

	public int[] randomMove(Board boardState)
	{
		//Get the current state of the board,
		//assuming Ezra wrote the accessor (get) method
		int[] currentBoard = boardState.get(); 
		
		//Generate a random number between 0 and 8
		//and set it equal to "randomInt" 
		Random rng = new Random();
		int randomInt = rng.nextInt(9); 

		//Set a O (the letter O!) at a 
		//random position on the board 
		currentBoard[randomInt] = -1;     

		return currentBoard;
	}
}