package org.example.basics.ProducerConsumer.bad;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    private static final Set<String> producerNames = Set.of("p1", "p2", "p3");
    private static final Set<String> consumerNames = Set.of("c1", "c2", "c3");

    public static void main(String[] args) {
        Queue<UnitOfWork> buffer = new ArrayDeque<>();
        int maxSize = 10;

        Set<Producer> producers = producerNames
                .stream()
                .map(p -> new Producer(p, buffer, maxSize))
                .collect(Collectors.toSet());

        Set<Consumer> consumers = consumerNames
                .stream()
                .map(c -> new Consumer(c, buffer))
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
