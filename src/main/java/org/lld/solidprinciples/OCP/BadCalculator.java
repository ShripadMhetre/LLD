package org.lld.solidprinciples.OCP;

public class BadCalculator {
    /** This is a bad design where we take type of operations as parameter
     * And based on switch case perform the operations
     * But, what if we want to introduce new operation then we would need to modify our calculator
     * "Open Closed Principle" - Implementation should be open for extension and closed for modification
     */
    public int calculate(int num1, int num2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = num1 + num2;
                break;
            case  "sub":
                result = num1 - num2;
        }

        return result;
    }
}
