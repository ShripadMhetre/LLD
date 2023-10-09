package org.example.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// Step 1: Intrinsic State
@AllArgsConstructor
@Getter
@ToString
public class Bullet {
    private String image;
    private Double radius;
    private Double weight;
    private BulletType type;
}
