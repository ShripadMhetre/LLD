package org.lld.casestudies.tictactoe;

import org.junit.jupiter.api.Test;
import org.lld.casestudies.tictactoe.models.Board;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {

    @Test
    public void TestCreateGame() {

    }

    @Test
    public void testCreateBoard() {
        Board board = new Board(3);
        int rowSize = board.getCells().get(0).size();

        assertEquals(3, rowSize,
                "if the constructor of board called with size n, it should create n rows.");
    }
}
