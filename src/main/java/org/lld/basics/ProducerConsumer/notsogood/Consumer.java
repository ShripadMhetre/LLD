package org.lld.basics.ProducerConsumer.notsogood;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Consumer implements Runnable {
    private String name;
    private Queue<UnitOfWork> buffer;
    Lock lock;

    @Override
    public void run() {
        while (true) {
            // critical section starts
            lock.lock();

            if (!buffer.isEmpty()) {
                buffer.remove();
                System.out.println(name + " consumed food. Current size: " + buffer.size());
            }

            // critical section ends
            lock.unlock();
        }
    }
}
