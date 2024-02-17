package org.lld.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;

// Step 3: Creating manager (i.e. context) class with strategy instance
@AllArgsConstructor
public class Navigator {
    private NavigationStrategy strategy;

    // Pass-through method - just calls strategy's navigation method
    public void navigate(String from, String to) {
        strategy.navigate(from, to);
    }

    public void setStrategy(NavigationStrategy newStrategy) {
        this.strategy = newStrategy;
    }
}
