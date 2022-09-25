package singleton;

public class Runner {
    public static void main(String[] args) {

       ConnectionPool instance = ConnectionPool.getInstance();
       ConnectionPool instance1 = ConnectionPool.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
