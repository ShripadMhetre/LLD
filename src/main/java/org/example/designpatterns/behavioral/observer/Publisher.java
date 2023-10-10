package org.example.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/* Step 1: Create an interface for publisher + Registry to maintain observers
            (here, we use abstract class since we need attributes)
 */
public abstract class Publisher {
    private List<Consumer> consumers = new ArrayList<>();

    // Pushing the updates from observable to all the subscribed consumers
    public void publish(Double price) {
        consumers.forEach(consumer -> consumer.consume(price));
    }

    // Adding new consumer to subscribers registry
    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    // Removing subscribed consumer
    public void removeConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }
}
