package Birds;

import lombok.AllArgsConstructor;

public class parrot extends birds implements flyable{
    private flyingbehaviour flybehave;
    public parrot(String size, String BeakType, String color, Double weight, BirdType type) {
        super(size, BeakType, color, weight, type);
        this.flybehave = new flappingBehaviou();
    }

    @Override
    public void  fly() {
    flybehave.fly();
    }

}
