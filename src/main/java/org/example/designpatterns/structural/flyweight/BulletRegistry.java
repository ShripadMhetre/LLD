package org.example.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Step 3: Registry to store intrinsic state objects
public class BulletRegistry {
    private final Map<BulletType, Bullet> bulletMap = new HashMap<>();
    void addBullet(Bullet bullet) {
        bulletMap.put(bullet.getType(), bullet);
    }

    Bullet getBullet(BulletType type) {
        return bulletMap.get(type);
    }
}
