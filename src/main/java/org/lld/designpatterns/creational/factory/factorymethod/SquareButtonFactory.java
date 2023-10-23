package org.lld.designpatterns.creational.factory.factorymethod;

// Concrete factory
public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareButton(border, length);
    }
}
