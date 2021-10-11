package tictactoe.bll;

/**
 * The GameBoardTwoPlayer class is the mandatory implementation for the TicTacToe assignment.
 * It is used for games where there are two human players.
 */
public class GameBoardTwoPlayer implements IGameModel
{

    public int playerturn = 0;

    private final String[][] grid;

    private int turnsLeft;

    protected GameBoardTwoPlayer()
    {
        grid = new String[3][3];
        resetBoard();
        turnsLeft = 9;
    }


    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    @Override
    public int getNextPlayer()
    {
        return playerturn % 2;

    }

    // Funktion til at reset spillet
    public void resetBoard() {
        for (int i = 0; i < grid.length;  i++) {
            for (int j = 0; j < grid.length; j++){
                grid[i][j] = "";
            }
        }
    }

    public void setGrid(int col, int row, String text){
        grid[col][row] = text;
    }
    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is successful the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */
    @Override
    public boolean play(int col, int row) {
        return (!isGameOver() && grid[col][row].matches(""));

    }

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */
    @Override
    public boolean isGameOver() {
        if (turnsLeft > 0) {
            return checkXWin() || checkOWin();
        }
        return true;
    }

    private boolean checkXWin() {
        return (grid[0][0].matches("[X]") && grid[1][0].matches("[X]") && grid[2][0].matches("[X]") ||
                grid[0][1].matches("[X]") && grid[1][1].matches("[X]") && grid[2][1].matches("[X]") ||
                grid[0][2].matches("[X]") && grid[1][2].matches("[X]") && grid[2][2].matches("[X]") ||
                //Lodret
                grid[0][0].matches("[X]") && grid[0][1].matches("[X]") && grid[0][2].matches("[X]") ||
                grid[1][0].matches("[X]") && grid[1][1].matches("[X]") && grid[1][2].matches("[X]") ||
                grid[2][0].matches("[X]") && grid[2][1].matches("[X]") && grid[2][2].matches("[X]") ||
                //kryds
                grid[0][0].matches("[X]") && grid[1][1].matches("[X]") && grid[2][2].matches("[X]") ||
                grid[0][2].matches("[X]") && grid[1][1].matches("[X]") && grid[2][0].matches("[X]"));
    }

    private boolean checkOWin() {
        return (grid[0][0].matches("[O]") && grid[1][0].matches("[O]") && grid[2][0].matches("[O]") ||
                grid[0][1].matches("[O]") && grid[1][1].matches("[O]") && grid[2][1].matches("[O]") ||
                grid[0][2].matches("[O]") && grid[1][2].matches("[O]") && grid[2][2].matches("[O]") ||
                //Lodret
                grid[0][0].matches("[O]") && grid[0][1].matches("[O]") && grid[0][2].matches("[O]") ||
                grid[1][0].matches("[O]") && grid[1][1].matches("[O]") && grid[1][2].matches("[O]") ||
                grid[2][0].matches("[O]") && grid[2][1].matches("[O]") && grid[2][2].matches("[O]") ||
                //kryds
                grid[0][0].matches("[O]") && grid[1][1].matches("[O]") && grid[2][2].matches("[O]") ||
                grid[0][2].matches("[O]") && grid[1][1].matches("[O]") && grid[2][0].matches("[O]"));
    }


    public void incrementPlayer() {
        if (playerturn == 0) {
            playerturn++;
        }
        else {
            playerturn = 0;
        }
    }
    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    @Override
    public int getWinner() {
        if (checkOWin()) {
            return 1;
        }
        else if (checkXWin()) {
            return 0;
        }
        else {
            return -1;
        }
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
    public int getPlayerAt(int col, int row)
    {
        return -1;
    }
}
        /*
        int[][] boardgame = new int[3][3];
        boardgame[0][0] = -1;
        boardgame[0][1] = -1;
        boardgame[0][2] = -1;
        boardgame[1][0] = -1;
        boardgame[1][1] = -1;
        boardgame[1][2] = -1;
        boardgame[2][0] = -1;
        boardgame[2][1] = -1;
        boardgame[2][2] = -1;

        // Her vil vi gerne kunne ændre værdierne inde i arrayet.. det er ikke gjort endnu,
        // men vi har forsøgt at gøre forskel på om det er player et eller player to
        for (int r = 0; r < boardgame.length; r++ ) {
            for (int c = 0; c < boardgame[0].length; c++) {
                if(playerturn == 0 )
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }

        }
        return -1;
    }
}

         */