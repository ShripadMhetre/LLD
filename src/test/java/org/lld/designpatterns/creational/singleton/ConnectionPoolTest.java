package org.lld.designpatterns.creational.singleton;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConnectionPoolTest {

    @Test
    public void testConstructor() {
        ConnectionPool connectionPool = ConnectionPool.getINSTANCE();

        Assertions.assertNotNull(connectionPool, "if constructor is called then non-null object should be created");
    }
}
