package org.lld.casestudies.tictactoe.exceptions;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException() {
        super("The move was invalid...");
    }
}
