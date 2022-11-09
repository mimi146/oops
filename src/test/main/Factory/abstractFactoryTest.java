package Factory;

import Factory.FactoryMethod.Users.Factories.StudentFactory;
import Factory.FactoryMethod.Users.Factories.TeacherFactory;
import Factory.FactoryMethod.Users.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class abstractFactoryTest {


    @Test
    public void testUsers() {
        StudentFactory studentFactory = new StudentFactory();
        Users student = studentFactory.createUser();

        TeacherFactory teacherFactory = new TeacherFactory();
        Users teacher = teacherFactory.createUser();


        assertNotNull(student,"chech if not null");
        assertNotNull(teacher,"chech if not null");
    }
}
