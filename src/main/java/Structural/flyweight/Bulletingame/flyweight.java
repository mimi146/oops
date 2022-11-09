package Structural.flyweight.Bulletingame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
        // step 1 creating flyweight Intrinsic and immutable
@Getter
@AllArgsConstructor
public class flyweight {
    private  String color;
    private  double weight;
    private byte[] image;
    private BulletType type;
}
