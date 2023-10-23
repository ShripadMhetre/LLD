package org.lld.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        BackgroundObject prototype = new BackgroundObject(0.0, 0.0, 10.0, 10.0, BackgroundType.TREE);
        BackgroundObject clonedObj = prototype.cloneObject();   // we are saved from expensive pixel generation

        // pixels should be same, since we cloned it
        System.out.println(prototype.getPixels().equals(clonedObj.getPixels()));
    }
}
