package org.lld.designpatterns.creational.factory.simplefactory;

import lombok.Getter;
import lombok.ToString;

// Step 2: Create concrete product classes
@Getter
@ToString
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double radius, Double border) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Round button rendered...");
    }

    @Override
    public void onClick() {
        System.out.println("Round button clicked...");
    }
}
