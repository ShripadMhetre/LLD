package org.lld.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.ToString;

// Step 2: Extrinsic State
@AllArgsConstructor
@ToString
public class FlyingBullet {
    private Double x, y, z;
    private Double direction;

    // Step 3: Add a "has-a" relationship with intrinsic state
    private Bullet bullet;
}
