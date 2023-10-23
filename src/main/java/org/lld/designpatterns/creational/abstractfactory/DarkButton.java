package org.lld.designpatterns.creational.abstractfactory;

import lombok.Getter;

// Step 2: Create concrete product classes
@Getter
public class DarkButton extends Button{
    private Double radius;
    public DarkButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Dark button rendered...");
    }

    @Override
    public void onClick() {
        System.out.println("Dark button clicked...");
    }
}
