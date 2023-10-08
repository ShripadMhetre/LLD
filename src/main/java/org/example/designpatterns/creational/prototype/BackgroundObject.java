package org.example.designpatterns.creational.prototype;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Step 2: Implement the clonable interface created in Step 1
@Setter
@Getter
public class BackgroundObject implements GraphicalObject {
    private Double x;
    private Double y;
    private Double width;
    private Double height;
    private BackgroundType type;

    @Setter(AccessLevel.NONE)   // Do not allow setter creation
    private List<Double> pixels = new ArrayList<>();

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = generatePixels();
    }

    // Expensive operation we are trying to avoid by cloning from prototype object
    private List<Double> generatePixels() {
        return Collections.emptyList();
    }

    // Copy constructor
    public BackgroundObject(BackgroundObject ref) {
        this.x = ref.x;
        this.y = ref.y;
        this.width = ref.width;
        this.height = ref.height;
        this.type = ref.type;
        this.pixels = ref.pixels;
    }

    @Override
    public BackgroundObject cloneObject() {
        return new BackgroundObject(this);
    }
}
