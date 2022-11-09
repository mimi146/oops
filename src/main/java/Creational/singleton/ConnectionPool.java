package Creational.singleton;

public class ConnectionPool {
    static  ConnectionPool instance =null;
   private ConnectionPool(){

    }
    public static ConnectionPool getInstance(){
       if(instance == null) {
           synchronized (ConnectionPool.class) {  // for thread safety
               if(instance == null) {
                   instance =  new ConnectionPool();
               }

           }

       }
       return instance;
    }

}
