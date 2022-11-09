package Creational.prototypes.games;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Foreground implements GraphicalUser{
private Integer length;
private Integer breadth;
private String color;
private  graphicalObjectType type;
    public Foreground(Integer length, Integer breadth,String color, graphicalObjectType type){
        this.length = length;
        this.breadth = breadth;
        this.type = type;
        this.color = color;
    }

    @Override
    public Foreground clone() {
        return new Foreground();
    }
}
