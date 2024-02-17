package org.lld.solidprinciples.OCP;

public class SubstractOperation implements Operation {
    @Override
    public int perform(int num1, int num2) {
        return num1 - num2;
    }
}
