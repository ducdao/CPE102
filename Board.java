public class Board 
{
	//Instance variables
	
	/*
	 * The current board state. 0 represents unoccupied, 1 represents an X, and -1 represents an O.
	 */
	private int[] boardState = {
			0, 0, 0,
			0, 0, 0,
			0, 0, 0 };
	
	/*
	 * The current player. 1 represents X's turn, and -1 represents O's turn.
	 */
	private int currentPlayer = 1;

	//Constructors - none!
	
	//Methods

	/*
	 * Standard boardState accessor. Returns an int array.
	 */
	public int[] getBoardState()
	{
		return boardState;
	}

	/*
	 * boardState element accessor. Takes an int (0-8) as a parameter and
	 * returns an int corresponding to the element in that index of the array.
	 * @param index The index of the boardState array to be accessed.
	 */
	public int getBoardPosition(int index)
	{
		return boardState[index];
	}

	/*
	 * boardState element mutator. Takes two ints as parameters and
	 * modifies an element of the boardState array.
	 * @param index The index of the boardState array to be accessed.
	 */
	public void setBoardPosition(int index, int newValue)
	{
		boardState[index] = newValue;
	}

	/*
	 * Standard currentPlayer accessor. Returns a string containing 1 or 2
	 */
	public String getCurrentPlayer()
	{
		String player = "1";
		if (currentPlayer == 1)
			player = "1";
		else
			player = "2"

		return player;

	}

	/*
	 * Standard currentPlayer mutator.
	 */
	public void setCurrentPlayer(int somePlayer)
	{
		currentPlayer = somePlayer;
	}

	/*
	 * Resets boardState and currentPlayer to values suitable for starting a new game.
	 * In other words, sets all boardState elements to 0 (unoccupied) and crrentPlayer
	 * to 1 (X's turn)
	 */
	public void resetGame() 
    {
		for(int i =0; i < boardState.length; i++) 
		{
			boardState[i] = 0;
			currentPlayer = 1;
		}
	}
	
	/*
	 * Swaps the currentPlayer from X's to O's or vice versa, signifying that the turn is over.
	 */
	public void endTurn() 
    {
		currentPlayer *= -1;
	}
	
	/*
	 * Inputs a move to the board. Does not check if the move is legal.
	 * Sends a 1 when it's X's turn and a -1 when it's O's turn.
	 * @param space The space (0-8) a player has selected for their move.
	 */
	public void setMove(int space) 
        {
		boardState[space] = currentPlayer;
	}
	
	public boolean isValidMove(int space)
    {
        if(boardState[space] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	/*
	 * Checks to see if the current player has won the game. If so,
	 * returns true, else returns false.
	 */
	public boolean checkWin() 
    {
		
		for(int i = 0; i < 6; i++) 
        {
			
			//Make sure we're checking for the current player
			if(boardState[i] == currentPlayer) 
            {
			
				//Checks the columns
				if(i == 0 || i == 1 || i == 2) 
                {
					if(boardState[i] == boardState[i+3] && boardState[i+3] == boardState[i+6]) 
                    {
						return true;
					}
				}
				
				//Checks the rows
				if(i == 0 || i == 3 || i == 6) 
                {
					if(boardState[i] == boardState[i+1] && boardState[i+1] == boardState[i+2]) 
                    {
						return true;
					}
				}
				
				//Checks the top-left to bottom-right diagonal
				if(i == 0) 
                {
					if(boardState[i] == boardState[i+4] && boardState[i+4] == boardState[i+8]) 
                    {
						return true;
					}
				}
				
				//Checks the top-right to bottom-left diagonal
				if(i == 2) 
                {
					if(boardState[i] == boardState[i+2] && boardState[i+2] == boardState[i+4]) 
                    {
						return true;
					}
				}
			}
		}
		
		//If all the checks fail...
		return false;
	}
	
	/*
	 * Run this after running checkWin. Returns true if there are no open
	 * spaces left and false otherwise.
	 */
	public boolean checkTie() 
    {
		for(int i = 0; i < boardState.length; i++) 
        {
			if(boardState[i] == 0) 
            {
				return false;
			}
		}
			
		return true;
	}
	
	/*
	 * Prints out what the game board currently looks like.
	 * Elements of boardState with a value of 0 are unoccupied,
	 * with 1 are X's, and with -1 are O's.
	 */
	public void displayBoard() 
    {
		
		String[] e = new String[9]; //This string array will populate the board
		for(int i = 0; i < boardState.length; i++) 
        {
			if(boardState[i] == 0)
			{
				e[i] = " ";
			}
			if(boardState[i] == 1)
			{
				e[i] = "X";
			}
			if(boardState[i] == -1)
			{
				e[i] = "O";
			}
		}
		
		System.out.println(" -------");
		System.out.println(" |" + e[0] + "|" + e[1] + "|" + e[2] + "|");
		System.out.println(" |-+-+-|");
		System.out.println(" |" + e[3] + "|" + e[4] + "|" + e[5] + "|");
		System.out.println(" |-+-+-|");
		System.out.println(" |" + e[6] + "|" + e[7] + "|" + e[8] + "|");
		System.out.println(" -------");
	}

	public void displayDummyBoard()
	{
		System.out.println(" -------");
		System.out.println(" |0|1|2|");
		System.out.println(" -------");
		System.out.println(" |3|4|5|");
		System.out.println(" -------");
		System.out.println(" |6|7|8|");
		System.out.println(" -------");
	}
}
