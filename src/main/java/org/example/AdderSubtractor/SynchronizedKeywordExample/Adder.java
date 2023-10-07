package org.example.AdderSubtractor.SynchronizedKeywordExample;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Adder implements Runnable {
    private Count count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count.incrementCount(i);    // incrementCount is synchronized
        }
    }
}
