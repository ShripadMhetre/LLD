package org.lld.designpatterns.behavioral.observer;

import lombok.AllArgsConstructor;

/* Step 2: Extend the publisher class (Concrete publisher implementation)
        - works as manager service for the observable entity
        - Here, BitcoinManager tracks realtime bitcoin details
 */
@AllArgsConstructor
public class BitcoinManager extends Publisher {
    private Bitcoin bitcoin;

    public void setPrice(Double price) {
        bitcoin.setPrice(price);
        publish(price);
    }
}
