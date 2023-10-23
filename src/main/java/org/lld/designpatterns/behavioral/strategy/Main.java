package org.lld.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        // Create strategies
        NavigationStrategy FourWheeler = new FourWheelerStrategy();
        NavigationStrategy TwoWheeler = new TwoWheelerStrategy();

        // Plug the strategy into navigator
        Navigator navigator = new Navigator(FourWheeler);
        navigator.navigate("Domlur", "HSR");

        // Changing the strategy at runtime
        navigator.setStrategy(TwoWheeler);
        navigator.navigate("Domlur", "HSR");
    }

    /*
        Uses of Strategy Pattern :-
            - Abstraction of algorithms
            - i.e. we can decide the algorithms to follow at runtime
            - SRP & OCP compliance
     */
}
