package org.lld.basics.ProducerConsumer.good;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Producer implements Runnable {
    private String name;
    private Queue<UnitOfWork> buffer;
    private int maxSize;
    Semaphore pSema;
    Semaphore cSema;

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            // critical section starts
            pSema.acquire();

            buffer.add(new UnitOfWork());
            System.out.println(name + " produced food. Current size: " + buffer.size());

            // critical section ends
            cSema.release();

        }
    }
}
