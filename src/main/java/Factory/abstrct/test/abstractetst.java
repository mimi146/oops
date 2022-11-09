package Factory.abstrct.test;

import Factory.abstrct.BiologyStudent;
import Factory.abstrct.Factory.BiologyClassroomFactory;
import Factory.abstrct.Factory.ClassromFactory;
import Factory.abstrct.Student;
import Factory.abstrct.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class abstractetst {

    @Test
    public void testabastrctFactory() {
        ClassromFactory factory = new BiologyClassroomFactory();
        Student student = factory.createStudent("milan","xi");
        Teacher teacher = factory.createTeacher("john","B+");

        assertNotNull(student,"check if not null");
        assertNotNull(teacher,"check if not null");
        assertEquals("milan",student.getName());

    }
}
