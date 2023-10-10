package org.example.designpatterns.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BitcoinTest {
    private BitcoinManager bitcoinManager;

    // Setup => create the dependencies
    @BeforeEach
    public void setup() {
        // creating observable
        Bitcoin bitcoin = new Bitcoin(100.0);

        // Creating publisher
        bitcoinManager = new BitcoinManager(bitcoin);

        // adding consumers to registry
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SMSConsumer());
    }

    // Teardown => Destroy the dependencies



    @Test
    public void updatePrice() {
        bitcoinManager.setPrice(120.0);
        /*
            Doesn't return anything to assert equality but the test should pass
            with EmailConsumer & SMSConsumer logs printed from consume() method.
         */
    }
}
