package org.lld.basics.AdderSubtractor.SynchronizedKeywordExample;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtractor implements Runnable {
    private Count count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count.decrementCount(i);    // decrementCount is synchronized
        }
    }
}
