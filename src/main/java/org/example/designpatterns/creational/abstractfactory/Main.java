package org.example.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Dark Theme Components
        ThemeFactory darkFactory = new DarkThemeFactory();
        Button darkBtn = darkFactory.createButton(3.0, 5.0);
        Radio darkRadio = darkFactory.createRadio();

        darkBtn.render();
        darkRadio.render();

        // Light Theme Components
        ThemeFactory lightFactory = new LightThemeFactory();
        Button lightBtn = lightFactory.createButton(3.0, 5.0);
        Radio lightRadio = lightFactory.createRadio();

        lightBtn.render();
        lightRadio.render();


        /*
            Abstract Factory Uses :- Factory of factory
                - Create family of products
                - Eliminates tight coupling between product classes and client classes
                    e.g. (directly calling lightButton constructor for object creation introducing tight coupling
                            and suppose we change the name of lightButton class then client code breaks)
                - SRP & OCP principle followed
         */
    }
}
