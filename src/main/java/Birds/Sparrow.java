package Birds;

public class Sparrow extends birds implements flyable{

    private  flyingbehaviour flap;
    public Sparrow(String size, String BeakType, String color, Double weight, BirdType type) {
        super(size, BeakType, color, weight, type);
        this.flap = new flappingBehaviou();
    }

    @Override
    public void fly() {
        flap.fly();
    }
}
