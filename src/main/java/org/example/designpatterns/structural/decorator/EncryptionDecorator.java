package org.example.designpatterns.structural.decorator;

// Step 4: Create concrete decorators
public class EncryptionDecorator extends BaseDecorator {

    public EncryptionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String encryptedData = nextLayer.read();
        return decrypt(encryptedData);
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        nextLayer.write(encrypted);
    }

    private String encrypt(String data) {
        return data + " - Encrypted";
    }

    private String decrypt(String encryptedData) {
        return encryptedData + " - Decrypted";
    }
}
