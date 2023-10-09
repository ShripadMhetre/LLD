package org.example.designpatterns.structural.decorator;

// Step 2: Concrete product implementation
public class FileDatabase implements Datasource {
    private String data;
    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        System.out.println("Writing: " + data);
        this.data = data;
    }
}
