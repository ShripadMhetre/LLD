package org.example.designpatterns.creational.factory.factorymethod;

import lombok.Getter;
import lombok.ToString;
import org.example.designpatterns.creational.factory.simplefactory.Squarebutton;

@Getter
@ToString
public class SquareButton extends Button{
    private Double length;

    public SquareButton(Double border, Double length) {
        super(border);
        this.length = length;
    }


    @Override
    public void render() {

    }

    @Override
    public void onClick() {

    }
}
