package org.lld.solidprinciples.OCP;

public class Main {
    public static void main(String[] args) {
        AddOperation add = new AddOperation();
        GoodCalculator calculator = new GoodCalculator();
        int addition = calculator.calculate(100, 100, add);
        System.out.println("Answer: " + addition);
    }
}
