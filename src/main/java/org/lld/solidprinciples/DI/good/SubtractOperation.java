package org.lld.solidprinciples.DI.good;

public class SubtractOperation implements CalculatorOperation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
