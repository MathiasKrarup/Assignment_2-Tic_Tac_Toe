package tictactoe.bll;

import tictactoe.gui.controller.TicTacViewController;

/**
 * The GameBoardSinglePlayer class is the optional and advanced implementation for the TicTacToe assignment.
 * It is used for games where there are one human player vs. a computer player.
 */
public class GameBoardSinglePlayer implements IGameModel {

    public int playerturn = 0;

    protected GameBoardSinglePlayer()
    {

    }

    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    @Override
    public int getNextPlayer()
    {
        if (playerturn % 2 == 0)
        {
            playerturn = 1;
            return 1;

        }
        else
        {
            playerturn = 2;
            return 0;

        }
    }

    @Override
    public void incrementPlayer() {

    }

    @Override
    public void setGrid(int col, int row, String text) {

    }

    @Override
    public void resetBoard() {

    }


    /**
     * Attempts to let the current player play at the given coordinates. If the
     * attempt is successful the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */
    @Override
    public boolean play(int col, int row)
    {

        //TODO Implement this method
        return true;
    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */
    @Override
    public boolean isGameOver()
    {
        //TODO Implement this method
        return false;
    }

    /**
     * Gets the id of the winner, -1 if its a draw or if the game is still running.
     *
     * @return int id of winner, or -1 if draw or if gameOver() == false.
     */
    @Override
    public int getWinner()
    {
        //TODO Implement this method
        return 0;
    }

    /**
     * Resets the game to a new game state.
     */
    @Override
    public void newGame()
    {
        //TODO Implement this method
    }

    /**
     * Returns the value representing which players has played the given field.
     *
     * @param col The column to look at.
     * @param row The row to look at.
     * @return Will return 0 if player 0 has played the field, 1 for player one, and -1 if no player has played the field.
     */
    @Override
    public int getPlayerAt(int col, int row) {
        //TODO Implement this method
        return 1;
    }
}
