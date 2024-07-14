package org.lld.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Step 2: Concrete FileSystem type implementation ("Composite component")
public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;    // directory contains files as well as directories

    public Directory(String name) {
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + directoryName);

        for (FileSystem fileSystemObj: fileSystemList) {
            fileSystemObj.ls();
        }
    }
}
