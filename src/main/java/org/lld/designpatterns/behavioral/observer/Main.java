package org.lld.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        // creating observable
        Bitcoin bitcoin = new Bitcoin(100.0);

        // Creating publisher
        BitcoinManager bitcoinManager = new BitcoinManager(bitcoin);

        // adding consumers to registry
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SMSConsumer());

        // update bitcoin price
        bitcoinManager.setPrice(120.0);
    }


    /*
        Uses of Observer pattern :-
            - Loose coupling between upstream & downstream services
            - consumers don't need to continuously keep polling the updates from observable
            - SRP & OCP compliant
     */
}
