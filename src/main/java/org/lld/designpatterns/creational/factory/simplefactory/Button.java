package org.lld.designpatterns.creational.factory.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 1: Create common product interface
@AllArgsConstructor
@Getter
public abstract class Button {
    private Double border;

    public abstract void render();
    public abstract void onClick();

}
