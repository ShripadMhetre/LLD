package org.lld.casestudies.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.lld.casestudies.tictactoe.exceptions.InvalidMoveException;
import org.lld.casestudies.tictactoe.exceptions.InvalidPlayersException;
import org.lld.casestudies.tictactoe.strategies.winning.RowWinningStrategy;
import org.lld.casestudies.tictactoe.strategies.winning.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Game {
    private static final GameStatus DEFAULT_STATUS = GameStatus.IN_PROGRESS;
    private static final int PLAYER_COUNT = 2;

    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;
    private int nextPlayerIndex = 0;
    private List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy());
    private Player winner;

    private Game() {
    }

    public void start() {
        // Assign a random value to the nextPlayerIndex
        nextPlayerIndex =  (int) (Math.random() * players.size());
        // Set the GameStatus to IN_PROGRESS
        status = GameStatus.IN_PROGRESS;
    }

    public void makeMove() {
        // Get next move
        BoardCell move = getNextMove();

        // Update the board
        board.update(move);

        // Check for a winner
        if (checkWinner(move.getSymbol())) {
            status = GameStatus.FINISHED;
            winner = getNextPlayer();
            return;
        }
        // Check for a draw
        if (checkDraw()) {
            status = GameStatus.DRAW;
            return;
        }

        // Update the next player
        nextPlayerIndex =  (nextPlayerIndex + 1) % players.size();
    }

    private void validateMove(BoardCell move) {
        if (!board.isEmpty(move.getRow(), move.getCol())) {
            throw new InvalidMoveException();
        }
    }

    public Player getNextPlayer() {
        return players.get(nextPlayerIndex);
    }

    private BoardCell getNextMove() {
        // Get the next player
        Player nextPlayer = players.get(nextPlayerIndex);

        // Get the next move from player makeMove -
        // Bot -> PlayingStrategy
        // User -> Input from Scanner
        BoardCell move = nextPlayer.makeMove(board);

        // Validate the user move - i.e. if cell already filled
        validateMove(move);

        return move;
    }


    private boolean checkWinner(GameSymbol gameSymbol) {
        for (WinningStrategy strategy : winningStrategies) {
            boolean hasWinner = strategy.checkWinner(getBoard(), gameSymbol);
            if (hasWinner) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDraw() {
        // Task 4 - Implement the check draw method
        // If no cell is empty and there is no winner
        return false;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Game game;

        private Builder() {
            game = new Game();
        }

        public Builder withSize(int size) {
            this.game.board = new Board(size);
            return this;
        }

        public Builder withPlayer(Player player) {
            this.game.players.add(player);
            return this;
        }

        public Game build() {
            boolean isValid = validate();

            if (!isValid) throw new InvalidPlayersException();

            Game newGame = new Game();
            newGame.board = game.board;
            newGame.players = game.players;
            newGame.status = DEFAULT_STATUS;

            return newGame;
        }

        private boolean validate() {
            if (game.players.size() < 2) {
                return false;
            }

            Set<GameSymbol> symbols = game.players.stream().
                    map(Player::getSymbol)
                    .collect(Collectors.toSet());

            return symbols.size() ==  PLAYER_COUNT;
        }


    }
}
