package org.lld.casestudies.tictactoe.strategies.winning;

import org.lld.casestudies.tictactoe.models.Board;
import org.lld.casestudies.tictactoe.models.BoardCell;
import org.lld.casestudies.tictactoe.models.GameSymbol;

import java.util.List;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, GameSymbol symbol) {
        // Check if all the symbols in the same row are the same
        for (List<BoardCell> rows : board.getCells()) {
            boolean isWinner = true;
            for (BoardCell cell : rows) {
                if (cell.getSymbol() != symbol) {
                    isWinner = false;
                    break;
                }
            }

            if (isWinner) {
                return true;
            }
        }

        return false;
    }
}
