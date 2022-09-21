package Birds;

import org.w3c.dom.ls.LSOutput;

public class Penguin  extends birds implements swimable {
    private  swimable swim;

    public Penguin(String size, String BeakType, String color, Double weight, BirdType type) {
        super(size, BeakType, color, weight, type);
        this.swim = new swimmer();

    }

    @Override
    public void swim() {
        swim.swim();

    }
}
