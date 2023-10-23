package org.lld.designpatterns.structural.decorator;

// Step 4: Create concrete decorators
public class CompressionDecorator extends BaseDecorator{

    public CompressionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String compressedData = nextLayer.read();
        return uncompress(compressedData);
    }

    @Override
    public void write(String data) {
        String compressed = compress(data);
        nextLayer.write(compressed);
    }

    private String compress(String data) {
        return data + " - Compressed";
    }

    private String uncompress(String compressedData) {
        return compressedData + " - Uncompressed";
    }
}
