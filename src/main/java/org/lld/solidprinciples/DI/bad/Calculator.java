package org.lld.solidprinciples.DI.bad;

/**
 * Dependency Inversion Principle :-
 *  "high-level modules should not depend on low-level modules; both should depend on abstractions.
 *      Abstractions should not depend on details. Details should depend upon abstractions."
 *
 * Here, Parent module (i.e. High level module) is Calculator class is directly dependent on
 * Low level modules (i.e. AddOperation, SubtractOperation, etc.).
 * Also, Details are dependent on actual classes (which as per principle should depend on abstraction)
 *
 * Hence, DI Principle is broken here.
 */
public class Calculator {
    public int calculate(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(num1, num2);
                break;
            case "sub":
                SubtractOperation subtractOperation = new SubtractOperation();
                result = subtractOperation.subtract(num1, num2);
                break;
        }

        return result;
    }
}
