package org.lld.designpatterns.creational.abstractfactory;

import lombok.Getter;

// Step 2: Create concrete product classes
@Getter
public class LightButton extends Button {
    private Double radius;
    public LightButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Light button rendered...");
    }

    @Override
    public void onClick() {
        System.out.println("Light button clicked...");
    }
}
