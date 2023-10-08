package org.example.basics.FutureExample;

import java.util.concurrent.Callable;

public class NumPrinter implements Callable<Integer> {
    int num;

    NumPrinter(int num) {
        this.num = num;
    }


    @Override
    public Integer call() throws Exception {
        return num * num;
    }
}
