package org.example.designpatterns.creational.singleton;

public class ConnectionPool {
    // Step 1: Maintaining the singleton instance
    // Initially null - "Lazy initialization" (Can do "Eager Initialization" as well)
    private static ConnectionPool INSTANCE = null;

    // Step 2: Constructor hiding
    private ConnectionPool() {}

    // Step 3: Global access point - static initializer
    public static ConnectionPool getINSTANCE() {
        // synchronization with "double-checked locking"
        if (INSTANCE == null) {
            synchronized (ConnectionPool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }

        return INSTANCE;
    }
}
