package org.example.designpatterns.creational.factory.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Button {
    private Double border;

    public abstract void render();
    public abstract void onClick();
}
