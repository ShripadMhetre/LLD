package org.lld.designpatterns.creational.abstractfactory;

// Step 4: Create concrete factory classes
public class DarkThemeFactory implements ThemeFactory{

    @Override
    public Button createButton(Double border, Double radius) {
        return new DarkButton(border, radius);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
}
