package Factory.abstrct.Factory;

import Factory.abstrct.Student;
import Factory.abstrct.Teacher;

public interface ClassromFactory {
   public Student createStudent(String name,String standard);
   public Teacher createTeacher(String name, String grade);
}
