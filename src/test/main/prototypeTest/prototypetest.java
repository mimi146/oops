package Creational.prototypeTest;

import org.junit.jupiter.api.Test;
import Creational.prototypes.games.Background;
import Creational.prototypes.games.Foreground;
import Creational.prototypes.games.Registry;
import Creational.prototypes.games.graphicalObjectType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class prototypetest {

    @Test
    public void graphicalUserTest() {
        Background prototypeB = new Background(12,23,"green",graphicalObjectType.BACKGROUND);
        Foreground prototypeF = new Foreground(12,23,"red",graphicalObjectType.BACKGROUND);
        Background clone = prototypeB.clone();

        assertNotNull(clone,"check");

    }
    @Test
    public void graphicaltest1() {
        Registry registry = new Registry();
        Background prootypeB = new Background();
        registry.addobject(prootypeB);

        Background clone = registry.getobject(prootypeB.getType()).clone();
            clone.setWidth(99); // i can now change the clone object state
        assertEquals(99,clone.getWidth());
        assertEquals(clone.getHeight(),clone.getHeight());

        clone.setWidth(23);
    }
}
