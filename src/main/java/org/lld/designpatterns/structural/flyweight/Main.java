package org.lld.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        BulletRegistry registry = new BulletRegistry();

        // Intrinsic bullet objects
        Bullet bullet1 = new Bullet("image1", 0.9, 10.0, BulletType.NINE_MM);
        Bullet bullet2 = new Bullet("image2", 1.1, 20.0, BulletType.ELEVEN_MM);

        // Add to registry
        registry.addBullet(bullet1);
        registry.addBullet(bullet2);

        // Create Extrinsic objects by reusing intrinsic objects from registry
        FlyingBullet fb1 = new FlyingBullet(0.0, 0.0, 0.0, -10.0, registry.getBullet(BulletType.NINE_MM));
        FlyingBullet fb2 = new FlyingBullet(1.0, 1.0, 1.0, 10.0, registry.getBullet(BulletType.ELEVEN_MM));

        System.out.println(fb1);
        System.out.println(fb2);
    }


    /*
        Flyweight Pattern Usage :-
            - Helps with scalability of application
            - Focuses on reusing the intrinsic objects (i.e. which are constant)
                rather than creating it newly whenever needed
            - Majorly used in gaming industry
     */
}
