package org.lld.designpatterns.behavioral.observer;

// Step 4: Creating concrete consumer implementations
public class EmailConsumer implements Consumer {

    @Override
    public void consume(Double price) {
        System.out.println("Sending email for updated bitcoin price: " + price);
    }
}
