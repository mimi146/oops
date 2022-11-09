package main.bird;

import org.junit.Test;
import Creational.singleton.ConnectionPool;

import static org.junit.jupiter.api.Assertions.*;

public class singletontest {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        @Test
        public void checkInstance() {
                //assertEquals(instance1, instance2);
                assertSame(instance1, instance2, "Both are equal instance");
        }



}
