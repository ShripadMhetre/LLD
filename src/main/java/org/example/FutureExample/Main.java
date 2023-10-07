package org.example.FutureExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Future<Integer>> results;
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        results = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            NumPrinter currPrinter = new NumPrinter(i);
            Future<Integer> future = executorService.submit(currPrinter);
            results.add(future);
        }

        for (Future<Integer> future: results) {
            System.out.println(future.isDone());
            System.out.println("The square is: " + future.get());
        }
    }
}
