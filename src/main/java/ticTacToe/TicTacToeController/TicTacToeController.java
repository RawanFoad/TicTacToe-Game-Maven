package ticTacToe.TicTacToeController;

import ticTacToe.TicTacToeEngine.TicTacToeEngine;
import ticTacToe.TicTacToeModel.TicTacToeGame;

public class TicTacToeController {

	public TicTacToeController() {
		TicTacToeEngine ticTacToeEngine = new TicTacToeEngine();

		TicTacToeGame ticTacToeGame = ticTacToeEngine.prepareGame();
		ticTacToeEngine.startOrContinueGame(ticTacToeGame);
	}

}
