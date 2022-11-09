package Creational.prototypes.academic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private String name;
    private  UserType type;

   // public abstract Integer getPsp();

    public User(String name,UserType type) {
        this.name = name;
        this.type = type;
    }

    public abstract User Clone();
}
