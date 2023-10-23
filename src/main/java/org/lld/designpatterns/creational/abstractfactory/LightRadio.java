package org.lld.designpatterns.creational.abstractfactory;

// Step 2: Create concrete product classes
public class LightRadio extends Radio {
    @Override
    public void onSelect() {
        System.out.println("Light Radio option selected...");
    }

    @Override
    public void render() {
        System.out.println("Light Radio rendered...");
    }
}
