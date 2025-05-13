package org.lld.basics.ProducerConsumer.good_synchronized;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue<Integer> buffer;
    private final int capacity;

    public SharedBuffer(int capacity) {
        buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full.. Producer is waiting...");
            wait();
        }

        buffer.add(item);
        System.out.println("Produced: " + item + " by thread: " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty.. Consumer waiting...");
            wait();
        }

        int item = buffer.poll();
        System.out.println("Consumed: " + item + " by thread: " + Thread.currentThread().getName());

        notifyAll();

        return item;
    }
}
