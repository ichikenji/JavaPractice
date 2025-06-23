package TicTacToe;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// [Create an instance of TicTacToeGame using the Game interface]
		TTTInterface game = new TTTMethods();	 
		boolean finished = false;

		while (!finished) {
			game.DisplayBoard();
			System.out.println("===================================");
			System.out.println("[Current Player]: " + ((TTTInterface) game).GetCurrentPlayer());
			
			System.out.print("* Enter the row (0, 1 or 2): " );
			int row = input.nextInt();
			System.out.print("* Enter the column (0, 1 or 2): ");
			int col = input.nextInt();

			finished = game.PlayerMove(row, col);
			if (!finished) {
				System.out.println("\n---------------------");
				((TTTInterface) game).SwitchPlayer();
			}
		}
		game.DisplayBoard();
		input.close();
	}
}