package org.example.designpatterns.creational.prototype;

// Step 1: Create a clonable interface
@FunctionalInterface
public interface GraphicalObject {
    GraphicalObject cloneObject();
}
