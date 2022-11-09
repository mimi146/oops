package Factory.FactoryMethod.Users.Factories;

import Factory.FactoryMethod.Users.Teachers;
import Factory.FactoryMethod.Users.Users;

public class TeacherFactory implements Factory{
    @Override
    public Users createUser() {
        return new Teachers();
    }
}
