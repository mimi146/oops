package Factory.simpleFactory;

public class simplefactory  {

    public static Button createButton(String type) {

        if(type == "Round") {
            System.out.printf("round class instanced");
            return  new Round();
        }
        if(type == "Primary") {
            System.out.printf("primary class instanced");

            return  new primary();
        }
        throw new IllegalArgumentException("invalid button type");
    }

}
