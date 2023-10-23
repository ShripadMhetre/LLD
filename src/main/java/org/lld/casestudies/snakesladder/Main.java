package org.lld.casestudies.snakesladder;

import org.lld.casestudies.snakesladder.Exceptions.GameAlreadyStartedException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpecialEntity snake1 = new Snake(28, 12);
        SpecialEntity snake2 = new Snake(78, 34);
        SpecialEntity snake3 = new Snake(69, 6);
        SpecialEntity snake4 = new Snake(84, 65);

        SpecialEntity ladder1 = new Ladder(24, 56);
        SpecialEntity ladder2 = new Ladder(43, 83);
        SpecialEntity ladder3 = new Ladder(3, 31);
        SpecialEntity ladder4 = new Ladder(72, 91);

        Board board = new Board(10);
        board.addSpecialEntity(snake1);
        board.addSpecialEntity(snake2);
        board.addSpecialEntity(snake3);
        board.addSpecialEntity(snake4);

        board.addSpecialEntity(ladder1);
        board.addSpecialEntity(ladder2);
        board.addSpecialEntity(ladder3);
        board.addSpecialEntity(ladder4);

        // creating dice object
        Dice dice = new Dice(6);

        // creating game
        Game game = new Game(board, dice);

        // creating players
        Player player1 = new Player("p1");
        Player player2 = new Player("p2");
        Player player3 = new Player("p3");

        // adding players to the game
        List<Player> players = List.of(player1, player2, player3);
        try {
            game.addPlayers(players);
        } catch (GameAlreadyStartedException e) {
            throw new RuntimeException(e);
        }

        game.startGame();
    }
}
