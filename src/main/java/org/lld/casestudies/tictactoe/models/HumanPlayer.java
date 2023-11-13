package org.lld.casestudies.tictactoe.models;

// Extrinsic State
public class HumanPlayer extends Player {
    private User user;

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }
}
