package Creational.prototypes.games;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<graphicalObjectType,Background> object = new HashMap<>();

    public void addobject(Background obj) {
        object.put(obj.getType(),obj);
    }
    public Background getobject(graphicalObjectType type) {

        return object.get(type);
    }
}
