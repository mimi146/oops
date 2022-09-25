package Birds;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import java.io.IOException;

import static Birds.BirdType.*;

@AllArgsConstructor
public abstract class birds {
    String size;
    String BeakType;
    String color;
    Double weight;

    public BirdType getType() {
        System.out.println(type);

        return type;
    }

    BirdType type;

//    public birds(String size, String BeakType,String color, Double weight, BirdType type) {
//        this.size = size;
//        this.BeakType =  BeakType;
//        this.color =color;
//        this.weight = weight;
//        this.type =type;
//
//    }

   // public abstract String fly(); // {
//        if (type.equals(SPARROW)) {
//            System.out.println("fly like " + type);
//            return "nn";
//        }
//        if(type.equals(PARROT)) {
//            System.out.println("fly like a " + type);
//        }
//        if(type.equals(PENGUIN)) {
//            return ("sorry cant fly dont force " + type + " to fly");
//           // System.out.println("sorry cant fly dont force " + type + " to fly");
//        }
//        return "No birds";

   // }

        public String eat() {
            System.out.println("i love u");
            return "i love u";
        }


}
