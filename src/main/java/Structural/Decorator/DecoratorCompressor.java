package Structural.Decorator;

public class DecoratorCompressor extends Decorator_base{
    public DecoratorCompressor(Database db) {
        super(db);
    }

    @Override
    public String Read() {
        String data = db.Read();
        return  uncompressor(data);
    }

    private String uncompressor(String data) {
        return data + "--uncompressed";
    }

    @Override
    public String write(String input) {
            String compressd = compresser(input);
        return db.write(compressd);
    }

    private String compresser(String input) {
        return input + "--compressed";
    }
}
