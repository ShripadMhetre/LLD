package org.lld.casestudies.tictactoe;

import org.junit.jupiter.api.Test;
import org.lld.casestudies.tictactoe.models.*;
import org.lld.casestudies.tictactoe.strategies.playing.RandomPlayingStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {

    private static final int BOARD_SIZE = 3;

    @Test
    public void TestCreateGame() {
        Game game = Game.builder()
                .withSize(3)
                .withPlayer(new HumanPlayer(GameSymbol.O, new User()))
                .withPlayer(new BotPlayer(GameSymbol.X, GameLevel.EASY, new RandomPlayingStrategy()))
                .build();
    }

    @Test
    public void testCreateBoard() {
        Board board = new Board(3);
        int rowSize = board.getCells().get(0).size();

        assertEquals(3, rowSize,
                "if the constructor of board called with size n, it should create n rows.");
    }
}
