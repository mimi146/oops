package Creational.prototypes.academic;

import java.util.HashMap;
import java.util.Map;

public class Registry implements stored {
    private Map<UserType,User> objects = new HashMap<>();

    @Override
    public void registerobj(UserType type,User obj) {

        objects.put(type,obj);
    }
    @Override
    public User getObjects(UserType Type){
        return  objects.get(Type).Clone();
    }
}
