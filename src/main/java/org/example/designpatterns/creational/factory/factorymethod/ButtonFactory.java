package org.example.designpatterns.creational.factory.factorymethod;

// Just define contract/interface of ButtonFactory
// For Round Button & Square Buttons to implement their own factories
public interface ButtonFactory {
    Button createButton(Double border, Double radius, Double length);
}
