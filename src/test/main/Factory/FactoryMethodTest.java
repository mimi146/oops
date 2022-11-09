package Factory;

import Factory.FactoryMethod.Buttons.Buttons;
import Factory.FactoryMethod.Buttons.Factory.RoundButtonFactory;
import Factory.FactoryMethod.Buttons.Factory.primaryButtonFactory;
import Factory.FactoryMethod.Buttons.primaryBuuton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryMethodTest {

//    @Test
//    public void TestSimpleFactory() {   // simple factory
//        Button roundbutton = simplefactory.createButton("Round");
//        Button primaryButton = simplefactory.createButton("Primary");
//       assertTrue(roundbutton instanceof Round);
//       assertTrue(primaryButton instanceof primary);
//    }

    @Test
    public void TestFactoryMethod() {
       //Buttons Rbuttons = new RoundButtonFactory().createButton();
       RoundButtonFactory roundbittonfactory = new RoundButtonFactory(); // step 1
       Buttons Rbuttons = roundbittonfactory.createButton(); // step 2

       Buttons Pbuttons = new primaryButtonFactory().createButton(); // step 1 and 2 in single line

//        Factory rfactory = Factory.getfactory("round");
//        Buttons Rbuttons = rfactory.createButton();

//      assertTrue(Rbuttons instanceof RoundButton);
//      assertEquals(27, ((RoundButton) Rbuttons).getRadius());

      assertTrue(Pbuttons instanceof primaryBuuton );
      assertEquals(20,((primaryBuuton) Pbuttons).getWidth());
    }
}
