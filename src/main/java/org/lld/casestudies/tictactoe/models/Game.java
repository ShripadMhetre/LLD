package org.lld.casestudies.tictactoe.models;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    private GameStatus status;

    public void start() {}
    public void makeMove() {}

    private Player checkWinner() {
        return null;
    }

    private boolean checkDraw() {
        return false;
    }
}
