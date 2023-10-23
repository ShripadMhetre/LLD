package org.lld.designpatterns.creational.abstractfactory;

// Step 4: Create concrete factory classes
public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton(Double border, Double radius) {
        return new LightButton(border, radius);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}
