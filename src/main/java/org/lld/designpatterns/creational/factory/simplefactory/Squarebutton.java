package org.lld.designpatterns.creational.factory.simplefactory;

import lombok.Getter;
import lombok.ToString;

// Step 2: Create concrete product classes
@Getter
@ToString
public class Squarebutton extends Button {
    private Double length;

    public Squarebutton(Double length, Double border) {
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Square button rendered...");
    }

    @Override
    public void onClick() {
        System.out.println("Square button clicked...");
    }
}
