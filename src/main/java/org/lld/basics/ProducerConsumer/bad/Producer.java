package org.lld.basics.ProducerConsumer.bad;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Producer implements Runnable {
    private String name;
    private Queue<UnitOfWork> bufffer;
    private int maxSize;

    @Override
    public void run() {
        while (true) {
            if (bufffer.size() < maxSize) {
                bufffer.add(new UnitOfWork());
                System.out.println(name + " produced food. Current size: " + bufffer.size());
            }
        }
    }
}
