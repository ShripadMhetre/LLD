package org.lld.casestudies.tictactoe.strategies.playing;

import org.lld.casestudies.tictactoe.models.Board;
import org.lld.casestudies.tictactoe.models.BoardCell;

public interface PlayingStrategy {
    BoardCell makeMove(Board board);
}
