package org.lld.casestudies.tictactoe.strategies.winning;

import org.lld.casestudies.tictactoe.models.Board;
import org.lld.casestudies.tictactoe.models.GameSymbol;

public interface WinningStrategy {
    boolean checkWinner(Board board, GameSymbol symbol);
}
