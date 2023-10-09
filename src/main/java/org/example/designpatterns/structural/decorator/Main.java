package org.example.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Datasource db = new FileDatabase();

        Datasource encryptedDB = new EncryptionDecorator(db);
        Datasource compressedEncryptedDB = new CompressionDecorator(encryptedDB);

        // with both decorators applied
        compressedEncryptedDB.write("Hello World!");
        System.out.println(compressedEncryptedDB.read());

        System.out.println("---------------------------------");

        // without any decorator
        db.write("Hello World...");
        System.out.println(db.read());
    }
}
