package org.lld.basics.ProducerConsumer.good_synchronized;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Producer p = new Producer(buffer);
            Thread pThread = new Thread(p);
            pThread.start();

            threads.add(pThread);
        }

        for (int i = 0; i < 2; i++) {
            Consumer c = new Consumer(buffer);
            Thread cThread = new Thread(c);
            cThread.start();

            threads.add(cThread);
        }

        // Join all threads after they are started for Main thread to not terminate
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
