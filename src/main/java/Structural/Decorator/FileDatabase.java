package Structural.Decorator;

public class FileDatabase implements Database{
    @Override
    public String Read() {
        return "read-value";
    }

    @Override
    public String write(String input) {
        return input ;
    }
}
