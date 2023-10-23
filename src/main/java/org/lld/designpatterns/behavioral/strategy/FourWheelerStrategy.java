package org.lld.designpatterns.behavioral.strategy;

// Step 2: Creating concrete Strategies
public class FourWheelerStrategy implements NavigationStrategy {
    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigation for Four Wheeler Vehicle....");
    }
}
