package org.example.casestudies.snakesladder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Dice {
    private int maxValue;

    public int roll() {
        return (int) Math.floor(Math.random() * this.maxValue + 1);
    }
}
