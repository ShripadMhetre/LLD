package org.lld.designpatterns.creational.abstractfactory;

// Step 3: Factory interface
public interface ThemeFactory {
    Button createButton(Double border, Double radius);
    Radio createRadio();
}
