package org.example.basics.AdderSubtractor.SynchronizedKeywordExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args)  {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(adder);
        executor.execute(subtractor);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final value: " + count.getValue()); // should be 0
    }
}
