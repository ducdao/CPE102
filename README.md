# CPE102 - Tic Tac Toe Project Notes

Notes for all the classes, methods, and varaibles we're using for Project 1. Feel free to edit this as needed. Markdown cheat sheet [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet).

##Classes
Classes for the project.
####TicTacToe
* Coordinates other classes
* Creates a Board object
* Contains main game loop

####UserPrompt
* **Methods**
    * Input: Welcomes user and prompts for input; returns an int: 1 for a Player vs Computer game, 2 for Player vs          Player, and 0 to exit

####Board
* **Variables**
    * int array boardState: represents positions on the board
    * int currentPlayer: 1 for X, 0 for O, maybe?
    “victory conditions”: a way to keep track of possible ways to win (for the checkWinner method) [might not need        this]
* **Methods**
    * display: prints the current board state
    * reset: resets all values in the array to 0
    * endTurn: swaps the currentPlayer
    * checkTie: determines whether or not the game is a tie (by seeing if there are any spaces left open: checkWinner       should run after each move is made, so if it doesn’t see a winner, checkTie will run and report a tie if there        are no more open spaces)
    * checkWinner: checks whether or not the active player won after a play is made
    * move: sends an X or an O to a spot on the board
        * Parameters: int spot
          make sure the move is valid/spot is unoccupied

####AIOpponent
* **Variables**
* **Methods**
    * bestMove: calculates the best move on the board and returns the corresponding spot (can be fed into Board.move         method)
        * Parameters: Board board
          should check the current board state and recognize whether the move to be made is for X or O
          make sure the move is valid/spot is unoccupied
    * randomMove: alternatively, the AI could just move randomly
        * Parameters: Board board
          make sure the move is valid/spot is unoccupied


#Sample Program
1. User starts program
2. Welcome screen displayed, asks if user wants to play a game
3. Takes either y or n as input
  1. If n, exit program
  2. If y, continue
4. Ask if user would like to play vs AI or vs another player
  1. Possibly ask for 1 or 2 players to simplify input, while noting that if user picks 1 player, they will play           against the AI
  2. If player picks 1 player, ask if they would like to go first or second
5. Begin game, display blank board
  1. Prompt player for their move
  2. If the AI is going first, just make the AI’s move, then prompt player
6. Ensure that the appropriate functionality is present:
  1.print an error if user inputs an invalid move:
    1.  incorrect input format (e.g. @!, c8)
    2.  non-empty space (e.g. b2 when b2 is filled)
  2. make sure the AI works properly (e.g. doesn’t cheat or break)
  3. check to see if the active player has won after turn is taken
  4. check to see if it’s a tie game
7. Once game is finished, display an appropriate message and prompt if user wants to play again
  1. if n, exit program
  2. if y, go back to step 4
