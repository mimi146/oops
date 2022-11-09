package Factory.FactoryMethod.Users.Factories;

import Factory.FactoryMethod.Users.Students;
import Factory.FactoryMethod.Users.Users;

public class StudentFactory implements Factory{
    @Override
    public Users createUser() {
        return new Students();
    }
}
