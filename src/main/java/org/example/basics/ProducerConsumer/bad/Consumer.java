package org.example.basics.ProducerConsumer.bad;

import lombok.AllArgsConstructor;

import java.util.Queue;

@AllArgsConstructor
public class Consumer implements Runnable {
    private String name;
    private Queue<UnitOfWork> bufffer;

    @Override
    public void run() {
        while (true) {
            if (!bufffer.isEmpty()) {
                bufffer.remove();
                System.out.println(name + " consumed food. Current size: " + bufffer.size());
            }
        }
    }
}
