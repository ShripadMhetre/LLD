package org.example.designpatterns.structural.decorator;

// Step 1: Product Interface
public interface Datasource {
    public String read();
    public void write(String data);
}
