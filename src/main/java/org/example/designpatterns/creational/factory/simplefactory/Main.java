package org.example.designpatterns.creational.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Button desktopBtn = ButtonFactory.createButton(ScreenSize.DESKTOP, 3.0, null, 10.0);
        Button mobileBtn = ButtonFactory.createButton(ScreenSize.MOBILE, 3.0, 5.0, null);

        System.out.println(desktopBtn);
        System.out.println(mobileBtn);
    }
}
