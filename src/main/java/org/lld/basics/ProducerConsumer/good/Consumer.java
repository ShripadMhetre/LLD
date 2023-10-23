package org.lld.basics.ProducerConsumer.good;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Consumer implements Runnable {
    private String name;
    private Queue<UnitOfWork> buffer;
    Semaphore pSema;
    Semaphore cSema;

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            // critical section starts
            cSema.acquire();

            buffer.remove();
            System.out.println(name + " consumed food. Current size: " + buffer.size());

            // critical section ends
            pSema.release();

        }
    }
}
