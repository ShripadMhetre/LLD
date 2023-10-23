package org.lld.casestudies.snakesladder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Player {
    private final String name;
    @Setter
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }
}
