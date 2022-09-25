package buiilderTest;

import builder.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testbuilder {

    @Test
    public void testBuilder() {

        Student.StudentBuilder builder = Student.Builder();

        builder.setName("Milan")
        .setRollno(12)
        .setMotherName("meena")
                .setAge(12);

        Student student = builder.build();

        assertEquals("Milan",student.Name,"checking equality" );


    }


}
