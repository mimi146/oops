package main.flyweight;

import Creational.prototypes.games.Background;
import Structural.flyweight.Bulletingame.Bullet;
import Structural.flyweight.Bulletingame.BulletType;
import Structural.flyweight.Bulletingame.flyweight;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class flyweighttest {

    @Test
  public void flyweighTest() {
        flyweight bulletflyweight = new flyweight("blood red", 14.50, new byte[100], BulletType.MM_9);
        Bullet bulletflying = Bullet.builder().angle(45)
                .velocity(20)
                .bullet(bulletflyweight)
                .x_cordinate(30)
                .build();
        Bullet bulletflying1 = Bullet.builder().angle(45)
                .velocity(20)
                .bullet(bulletflyweight)
                .x_cordinate(30)
                .build();

        assertEquals(bulletflying1.getBullet(),bulletflying.getBullet(),"check if both share sane ref to " +
                "flyweight");

  }
}
