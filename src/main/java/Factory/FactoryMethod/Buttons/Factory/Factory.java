package Factory.FactoryMethod.Buttons.Factory;

import Factory.FactoryMethod.Buttons.Buttons;

public abstract class Factory {

    public abstract Buttons createButton();

//    public static Factory getfactory(String type) {
//        switch (type) {
//            case "primary": return new primaryButtonFactory();  // violets ocp
//            case "round": return  new RoundButtonFactory();
//        }
//        throw new IllegalArgumentException("invalid");
//
//    }

}
