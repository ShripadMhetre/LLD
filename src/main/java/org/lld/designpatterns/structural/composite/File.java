package org.lld.designpatterns.structural.composite;

// Step 2: Concrete FileSystem type implementation ("leaf component")
public class File implements FileSystem{
    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("filename is: " + fileName);
    }
}
