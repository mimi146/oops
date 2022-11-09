package Structural.Decorator;

public abstract class  Decorator_base implements Database {
    Database db;

    public Decorator_base(Database db) {
        this.db = db;
    }

}
