package org.lld.solidprinciples.DI.good;

public class AddOperation implements CalculatorOperation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
