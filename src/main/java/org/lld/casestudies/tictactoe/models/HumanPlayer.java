package org.lld.casestudies.tictactoe.models;

import lombok.Builder;

import java.util.Scanner;

// Extrinsic State
//@Builder
public class HumanPlayer extends Player {
    private User user;

    @Builder.Default
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell makeMove(Board board) {
        System.out.println("Enter row and column: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        return new BoardCell(row, col, getSymbol());
    }
}
