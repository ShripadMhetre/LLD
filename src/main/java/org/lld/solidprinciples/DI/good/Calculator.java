package org.lld.solidprinciples.DI.good;

/** DI Principle is satisfied here -
 * 1. "High-level modules should not depend on low-level modules; both should depend on abstractions."
 * -->  so High Level Module (i.e. Calculator class) doesn't directly depend on Low level modules (i.e. AddOperation class etc.)
 *      Instead, they depend on the abstraction (i.e. CalculatorOperation interface)
 *
 * 2. "Abstractions should not depend on details. Details should depend upon abstractions."
 * --> Abstraction is achieved via Interface, through which we are entering in low level.
 */
public class Calculator {
    public int calculate(int num1, int num2, CalculatorOperation operation) {
        return operation.calculate(num1, num2);
    }
}
