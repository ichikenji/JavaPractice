package TicTacToe;

public interface TTTInterface {
    void InitialiseBoard();
	void DisplayBoard();
	boolean PlayerMove(int row, int col);
	boolean IsGameFinished();
    char GetCurrentPlayer();
    void SwitchPlayer();
}
