package Structural.Decorator;

public class DecoratorEncryppt extends Decorator_base{
    public DecoratorEncryppt(Database db) {
        super(db);
    }

    @Override
    public String Read() {
        String plain = db.Read();

        return decypt(plain);
    }

    private String decypt(String plain) {
        return plain + "--decrypted";
    }

    private String encrpy(String plain) {
        return plain+ "--encrypted";
    }
    @Override
    public String write(String input) {
        String encypted = encrpy(input);
            return  db.write(encypted);
    }
}
