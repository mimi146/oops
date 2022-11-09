package Structural.flyweight.Bulletingame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
// step 2 creating extrinsic object

@AllArgsConstructor
@Getter
@Builder
public class Bullet {
    private  Integer x_cordinate;
    private  Integer y_cordinate;
    private Integer velocity;
    private  Integer angle;
    private flyweight bullet;



}
