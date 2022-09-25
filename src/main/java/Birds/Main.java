package Birds;

import static Birds.BirdType.*;

public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("small","short","red",20.1,SPARROW);
        parrot Parrot = new parrot("small","short","red",20.1, PARROT);
        Eagle eagle = new Eagle("small","short","red",20.1, EAGLE);
        Penguin penguin = new Penguin("small","short","red",20.1, PENGUIN);
       // sparrow.fly();
        Parrot.fly();
        eagle.fly();
        penguin.swim();
        penguin.getType();
        eagle.getType();
       // System.out.println(Parrot.fly());
       // System.out.println(sparrow.fly());
       // penguin.fly();

        // birds parrot = new
    }
}
