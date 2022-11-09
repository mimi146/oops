package Creational.builder.Database;

import lombok.Getter;
@Getter
public class Database {
    private String name;
    private String host;
    private String  password;
    private Integer port;
    private type db;

    public  String toString() {
        return (this.host + ":"+ this.port +"?"+ this.name);
    }
    private Database() {}

    public static DatabaseBuilder builder() {

        return  new DatabaseBuilder();
    }

    public static class DatabaseBuilder {
        private Database database;
        public  DatabaseBuilder() {  //ctor

            database = new Database();
        }
        public DatabaseBuilder withName(String name) {
            database.name = name;
            return this;
        }

        public DatabaseBuilder withHost(String host) {
            database.host = host;
            return this;
        }

        public DatabaseBuilder withPassword(String password) {
            database.password = password;
            return this;
        }
        public DatabaseBuilder withPort(Integer port) {
            database.port = port;
            return this;
        }
        public DatabaseBuilder mysql() {
            database.db = type.MYSQL;
            return this;
        }


//        private String name;
//        private String host;
//        private String  password;
//        private  Integer port;
//        private type db;

        public boolean validate(){

            if(database.name == null ||database.password ==null) return  false;
            return true;
        }
        public Database build() {

            if(!validate()) throw new IllegalArgumentException("missing filed");

            Database Adatabase = new Database();
            Adatabase.name = database.name;
            Adatabase.host = database.host;
            Adatabase.port = database.port;
            Adatabase.password = database.password;
            Adatabase.db = database.db;
            return Adatabase;

        }
    }
}
