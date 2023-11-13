package org.lld.casestudies.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Board {
    private final int size;
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int size) {
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
        List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());
        return Collections.nCopies(size, firstRow);
    }
}
