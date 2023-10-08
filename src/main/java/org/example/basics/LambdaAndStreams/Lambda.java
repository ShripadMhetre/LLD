package org.example.basics.LambdaAndStreams;

public class Lambda {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;

        System.out.println(add.operation(1, 2)); // returns '3'
        System.out.println(subtract.operation(10, 5)); // returns '5'

        MathOperation divide = (a, b) -> {
            if (b == 0) return 0;

            double value = (double) a /b;
            return (int) value;
        };

        System.out.println(divide.operation(100, 10));
    }
}
