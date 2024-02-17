package org.lld.solidprinciples.OCP;

public interface Operation {
    int perform(int num1, int num2);
}

/*
    Note:
    Q. How to choose between interface & abstract class while following OCP?
    Ans:- If 2 or more classes have -
        1. Common behaviour - Choose interface (like our example)
        2. Common behaviour + attributes - Choose abstract class
 */
