package org.lld.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConnectionPool cp1 = ConnectionPool.getINSTANCE();
        ConnectionPool cp2 = ConnectionPool.getINSTANCE();

        // both should be same objects
        System.out.println(cp1.equals(cp2));
    }
}
