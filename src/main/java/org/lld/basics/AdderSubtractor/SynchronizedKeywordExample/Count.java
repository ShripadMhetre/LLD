package org.lld.basics.AdderSubtractor.SynchronizedKeywordExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Count {
    private int value;

    // synchronized keyword on method makes sure only one thread can access any synchronized method
    // on the same object.
    public synchronized void incrementCount(int offset) {
        this.value += offset;
    }

    public synchronized void decrementCount(int offset) {
        this.value -= offset;
    }
}
