package org.lld.basics.ProducerConsumer.notsogood;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Main {
    private static final Set<String> producerNames = Set.of("p1", "p2", "p3");
    private static final Set<String> consumerNames = Set.of("c1", "c2", "c3");

    public static void main(String[] args) {
        Queue<UnitOfWork> buffer = new ArrayDeque<>();
        int maxSize = 10;

        Lock lock = new ReentrantLock();

        Set<Producer> producers = producerNames
                .stream()
                .map(p -> new Producer(p, buffer, maxSize, lock))
                .collect(Collectors.toSet());

        Set<Consumer> consumers = consumerNames
                .stream()
                .map(c -> new Consumer(c, buffer, lock))
                .collect(Collectors.toSet());

        producers.forEach(producer -> new Thread(producer).start());
        consumers.forEach(consumer -> new Thread(consumer).start());

        /*
            We can see size overflowing or underflowing once multiple threads start running.
            Also, "java.util.NoSuchElementException" being thrown sometimes if consumer tried to eat
            from empty buffer.
         */
    }
}
