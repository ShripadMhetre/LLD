package org.example.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;

// Step 3: Creating manager class with strategy context
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
