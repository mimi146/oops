//package main.test;
//import Birds.birds;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.jupiter.api.Test;
//
//import javax.xml.transform.Result;
//
//import static Birds.BirdType.PENGUIN;
//import static Birds.BirdType.SPARROW;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class birdsTest {
//
//    birds sparrow = new birds("small","short","red",20.1,SPARROW);
//    birds penguin = new birds("small","short","red",20.1,PENGUIN);
//    @Test
//    public  void eat_test() {
//        String message = "i love u";
//        assertEquals(message,sparrow.eat());
//    }
//    @Test
//    public void fly_test(){
//        String message ="sorry cant fly dont force PENGUIN to fly";
//        assertEquals(message,penguin.fly());
//    }
//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("In beforeClass method.");
//    }
//    @AfterClass
//    public static void  afterClass() {
//        System.out.println("In afterClass method");
//    }
//}
