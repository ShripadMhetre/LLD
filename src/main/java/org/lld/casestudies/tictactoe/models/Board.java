package org.lld.casestudies.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class Board {
    private final int size;
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int size) {
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
//        List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());
//        return Collections.nCopies(size, firstRow);

        List<List<BoardCell>> cells = new ArrayList<>();
        IntStream.range(0, size).forEach(row -> {
            List<BoardCell> rowCells = new ArrayList<>();
            IntStream.range(0, size).forEach(column -> rowCells.add(new BoardCell(row, column)));
            cells.add(rowCells);
        });
        return cells;
    }

    public boolean isEmpty(int row, int col) {
        return cells.get(row).get(col).getSymbol() == null;
    }

    public void update(BoardCell move) {
        cells.get(move.getRow()).get(move.getCol()).setSymbol(move.getSymbol());
    }

    public void printBoard() {
        for (int i = 0; i < cells.size(); ++i) {
            for (int j = 0; j < cells.size(); ++j) {
                GameSymbol symbol = cells.get(i).get(j).getSymbol();

                if (symbol == null) {
                    System.out.print(" | - | ");
                } else {
                    System.out.printf(" | " + symbol + " | ");
                }
            }
            System.out.print("\n");
        }
    }

    public List<BoardCell> getEmptyCells() {
        // Iterate over the cells
        // Flatten the array 2D => 1D
        // Filter out cells where symbol != null

        // Get a list of streams and combine it into one
        return cells.stream()
                .flatMap(List::stream) // Gets the stream for each array and then combines it
                .filter(cell -> cell.getSymbol() == null)
                .toList();
    }
}
