package org.lld.designpatterns.creational.factory.simplefactory;

public class ButtonFactory {
    // IF ScreenSize == Desktop THEN create SquareButton
    // ELSE IF ScreenSize == MOBILE || TABLET THEN create RoundButton
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {
            case MOBILE:
            case TABLET:
                return new RoundButton(radius, border);
            case DESKTOP:
                return new Squarebutton(length, border);
        }

        throw new IllegalArgumentException("Invalid screenSize: " + screenSize);
    }

    /*
        Cons :- Switch or If else statements - violates OCP
            Hence check "Factory Method"
     */
}
