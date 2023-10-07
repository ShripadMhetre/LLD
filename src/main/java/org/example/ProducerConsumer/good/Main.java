package org.example.ProducerConsumer.good;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Main {
    private static final Set<String> producerNames = Set.of("p1", "p2", "p3");
    private static final Set<String> consumerNames = Set.of("c1", "c2", "c3");

    public static void main(String[] args) {
        Queue<UnitOfWork> buffer = new ConcurrentLinkedDeque<>();   // ConcurrentDeque instead of ArrayDeque since former being thread safe
        int maxSize = 10;

        Semaphore pSema = new Semaphore(maxSize);  // 10 since buffer maxSize is 10.

        // consumer count should start from 0 since it's not allowed to enter unless someone produces
        Semaphore cSema = new Semaphore(0);

        Set<Producer> producers = producerNames
                .stream()
                .map(p -> new Producer(p, buffer, maxSize, pSema, cSema))
                .collect(Collectors.toSet());

        Set<Consumer> consumers = consumerNames
                .stream()
                .map(c -> new Consumer(c, buffer, pSema, cSema))
                .collect(Collectors.toSet());

        producers.forEach(producer -> new Thread(producer).start());
        consumers.forEach(consumer -> new Thread(consumer).start());
    }
}
