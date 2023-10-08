package org.example.designpatterns.creational.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        ButtonFactory roundBtnFactory = new RoundButtonFactory();
        Button roundBtn = roundBtnFactory.createButton(3.0, 5.0, null);

        ButtonFactory sqaureBtnFactory = new SquareButtonFactory();
        Button squareBtn = sqaureBtnFactory.createButton(3.0, null, 10.0);

        System.out.println(roundBtn);
        System.out.println(squareBtn);
    }
}
