package org.example.designpatterns.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 1: Create common product interface
@AllArgsConstructor
@Getter
public abstract class Radio {
    public abstract void onSelect();
    public abstract void render();
}
