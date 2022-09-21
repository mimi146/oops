package Birds;

import lombok.AllArgsConstructor;
public class Eagle extends birds  implements flyable {
    private flyingbehaviour glide;
    public Eagle(String size, String BeakType,String color, Double weight, BirdType type) {
        super(size,BeakType,color,weight,type);
        this.glide = new glidingbehivour();

    }

    @Override
    public void fly() {
        glide.fly();
    }
}
