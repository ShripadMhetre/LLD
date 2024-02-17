package org.lld.casestudies.tictactoe.exceptions;

public class InvalidPlayersException extends RuntimeException {
    public InvalidPlayersException() {
        super("Invalid list of players...");
    }
}
