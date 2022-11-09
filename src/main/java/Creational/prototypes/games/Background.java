package Creational.prototypes.games;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
public class Background implements GraphicalUser{
    private Integer height;
    private Integer width;
    private  String color;
    private  graphicalObjectType type;

    @Getter(AccessLevel.NONE)
    private Map<Integer, String> pixel = new HashMap<>();

    public Background(Integer height, Integer width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
    public Background(Integer height, Integer width, String color,graphicalObjectType type) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.type = type;
    }

    @Override
    public Background clone() {
        return  new Background(height,width,color,type);

    }
}
