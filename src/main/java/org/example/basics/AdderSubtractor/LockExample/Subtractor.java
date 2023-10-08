package org.example.basics.AdderSubtractor.LockExample;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Subtractor implements Runnable {
    private Value count;
    Lock lock;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // lock the critical section
            lock.lock();

            int value = count.getValue();
            value = value - i;
            count.setValue(value);

            // unlock once operation done
            lock.unlock();
        }
    }
}
