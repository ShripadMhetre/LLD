package org.example.casestudies.snakesladder;

import lombok.Getter;
import org.example.casestudies.snakesladder.Exceptions.GameAlreadyStartedException;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

@Getter
public class Game {
    private Board board;
    private Dice dice;
    private Queue<Player> players;
    private GameStatus status;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.players = new LinkedList<>();
        this.status = GameStatus.NON_STARTED;
    }

    public void startGame() {
        this.status = GameStatus.IN_PROGRESS;
        board.printBoard();

        // Play only until no. of players is more than 1
        while (players.size() > 1) {
            Player currPlayer = players.poll();
            // play the move
            makeMove(currPlayer);

            // check for results
            if (currPlayer.getPosition() == board.getTotalCells()) {
                System.out.println(currPlayer.getName() + " has won the game!");
            } else {
                players.add(currPlayer);
            }
        }

        // Finally, set the game status as "FINISHED"
        this.status = GameStatus.FINISHED;
    }

    private void makeMove(Player currPlayer) {
        System.out.println(currPlayer.getName() + "'s turn.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Press anything to roll the dice:");
        sc.next().charAt(0);

        int currPosition = currPlayer.getPosition();
        // roll the dice
        int rolledValue = dice.roll();

        // calculate next position for curr player
        int nextPosition = currPosition + rolledValue;

        if (nextPosition > board.getTotalCells()) {
            System.out.println("Invalid Move.");
        } else {
            // check for snake/ladder at next position
            if (board.hasSpecialEntity(nextPosition)) {
                // if special entity present then whatever end position of the SpecialEntity set that.
                nextPosition = board.getSpecialEntity(nextPosition).getEnd();
            }
        }

        currPlayer.setPosition(nextPosition);
    }

    public void addPlayers(List<Player> players) throws GameAlreadyStartedException {
        if (this.status == GameStatus.NON_STARTED) {
            this.players.addAll(players);
        } else {
            throw new GameAlreadyStartedException("Can't add players. Game already started...");
        }
    }
}
