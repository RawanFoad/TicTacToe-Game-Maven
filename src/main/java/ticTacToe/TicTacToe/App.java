package ticTacToe.TicTacToe;

import ticTacToe.TicTacToeController.TicTacToeController;

/**
 * Hello TicTacToe!
 * 
 */
public class App {
	private static TicTacToeController ticTacToeControllerInstance = null;

	public static void main(String[] args) {
		if (ticTacToeControllerInstance == null) {
			ticTacToeControllerInstance = new TicTacToeController();
		}
	}
}
