package Factory.abstrct.Factory;

import Factory.abstrct.BiologyStudent;
import Factory.abstrct.BiologyTeacher;
import Factory.abstrct.Student;
import Factory.abstrct.Teacher;

public class BiologyClassroomFactory implements ClassromFactory{

    @Override
    public Student createStudent(String name, String standard) {
        return new BiologyStudent(name,standard);
    }

    @Override
    public Teacher createTeacher(String name, String grade) {
        return new BiologyTeacher(name,grade);
    }
}
