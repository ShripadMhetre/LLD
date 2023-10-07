package org.example.ProducerConsumer.notsogood;

import lombok.AllArgsConstructor;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Producer implements Runnable {
    private String name;
    private Queue<UnitOfWork> buffer;
    private int maxSize;
    Lock lock;

    @Override
    public void run() {
        while (true) {
            // critical section starts
            lock.lock();

            if (buffer.size() < maxSize) {
                buffer.add(new UnitOfWork());
                System.out.println(name + " produced food. Current size: " + buffer.size());
            }

            // critical section ends
            lock.unlock();
        }
    }
}
