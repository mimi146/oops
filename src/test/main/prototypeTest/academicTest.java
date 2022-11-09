package Creational.prototypeTest;

import org.junit.jupiter.api.Test;
import Creational.prototypes.academic.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static Creational.prototypes.academic.UserType.*;

public class academicTest {

    @Test
    public void academictest() {
        student prototype = new student("milan",12,67, STUDENT);
        Intructor prototype1 = new Intructor("Ramesh",12,INSTRUCTOR);
        User clone = prototype.Clone();
        assertEquals(prototype1.getType(),INSTRUCTOR);
        assertEquals("milan",clone.getName(),"checking if equal");
    }
    @Test
    public void checkRegistry() {
        stored registry = new Registry();
        //student prototype = new student("Milan",13,55, STUDENT);
       // Intructor prototype1 = new Intructor("Ram",12, INSTRUCTOR);
        registry.registerobj(UserType.STUDENT,new student("Milan",13,55, STUDENT));
        User user = registry.getObjects(STUDENT);
        User user1 =  registry.getObjects(STUDENT);  // clone method is called in registry
        user.setName("miki");
        //registry.registerobj(prototype1);
       // student s1 = (student) registry.getObjects(prototype.getType()).Clone();
//        s1.setName("kiran");
//        assertEquals("kiran",s1.getName());
        assertEquals("miki",user.getName());


    }

}
