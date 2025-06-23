package TicTacToe;
public class TTTMethods implements TTTInterface {
	private char[][] board;		
	private char currentPlayer;
	private final int SIZE = 3;
	private final char EMPTY_CELL = '.';
	
	public TTTMethods() {
		// Create a new board of the specified size
		board = new char[SIZE][SIZE]; 
		currentPlayer = 'X';
		InitialiseBoard();	// Call the method to initialise the board
	}

	@Override
	public void InitialiseBoard() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				// [Prints each cell followed by an empty space]
				board[row][col] = EMPTY_CELL;
			}
		}
	}

	@Override
	public void DisplayBoard() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				// [Prints each cell followed by an empty space]
				System.out.print(board[row][col] + " ");
			}
			System.out.println();	// [Move to the next line after each row]
		} 
	}

    @Override
	public boolean PlayerMove(int row, int col) {
		if (IsValidMove(row, col)) {
			// [Places the current player's symbol on the cell]
			board[row][col] = currentPlayer;	
			return IsGameFinished();
		}
        return false;
	}

	private boolean IsValidMove(int row, int col) {
		return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY_CELL;
	} 

	@Override
	public boolean IsGameFinished() {
		return IsBoardFull();
	}

	private boolean IsBoardFull() {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				if (board[row][col] == EMPTY_CELL) {
					return false;
				}
			}
		}
		System.out.println("\n----- Game End! -----");
		return true;
	}

	public void SwitchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

    public char GetCurrentPlayer() {
        return currentPlayer;
    }
}