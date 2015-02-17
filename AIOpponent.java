import java.util.Random;

public class AIOpponent
{
	// 1 = X, -1 = O

	public int randomMove()
	{
		//Get the current state of the board,
		//assuming Ezra wrote the accessor (get) method 
		
		//Generate a random number between 0 and 8
		//and set it equal to "randomInt" 
		Random rng = new Random();
		int randomInt = rng.nextInt(9);    

		return randomInt;
	}
}