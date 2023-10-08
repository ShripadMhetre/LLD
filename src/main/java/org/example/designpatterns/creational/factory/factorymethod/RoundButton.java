package org.example.designpatterns.creational.factory.factorymethod;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double border, Double radius) {
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
