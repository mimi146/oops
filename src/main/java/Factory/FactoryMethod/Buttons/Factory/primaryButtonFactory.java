package Factory.FactoryMethod.Buttons.Factory;

import Factory.FactoryMethod.Buttons.Buttons;
import Factory.FactoryMethod.Buttons.primaryBuuton;

public class primaryButtonFactory extends Factory{
    @Override
    public Buttons createButton() {
        return new primaryBuuton();
    }
}

