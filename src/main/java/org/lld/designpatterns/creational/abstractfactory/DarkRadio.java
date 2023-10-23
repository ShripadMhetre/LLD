package org.lld.designpatterns.creational.abstractfactory;

// Step 2: Create concrete product classes
public class DarkRadio extends Radio {
    @Override
    public void onSelect() {
        System.out.println("Dark Radio option selected...");
    }

    @Override
    public void render() {
        System.out.println("Dark radio rendered...");
    }
}
