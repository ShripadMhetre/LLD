package org.example.designpatterns.creational.factory.factorymethod;

import org.example.designpatterns.creational.factory.simplefactory.Squarebutton;

// Concrete factory
public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareButton(border, length);
    }
}
