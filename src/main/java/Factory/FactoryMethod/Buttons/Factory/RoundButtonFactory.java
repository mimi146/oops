package Factory.FactoryMethod.Buttons.Factory;

import Factory.FactoryMethod.Buttons.Buttons;
import Factory.FactoryMethod.Buttons.RoundButton;

public class RoundButtonFactory extends Factory {
    @Override
    public Buttons createButton() {
        return new RoundButton();
    }
}
