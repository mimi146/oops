package buiilderTest;
import Creational.builder.Database.Database;
import org.junit.jupiter.api.Test;

import static Creational.builder.Database.type.MYSQL;
import static org.junit.jupiter.api.Assertions.*;


public class testbuilder {

//    @Test
//    public void testBuilder() {
//
//       Student student =  Student.Builder()
//        .setRollno(12)
//                .setName("Milan")
//        .setMotherName("meena")
//                .setAge(12)
//        .build();
//
//       assertNotNull(student,"checking if studnt is created or not");
//
//        assertEquals("Milan",student.Name,"checking equality" );
//
//    }
    @Test
    public void databasebuilder() {
       Database database = Database.builder()
               .withName("test")
               .withPassword("abc")
               .withHost("admin")
               .withPort(3600)
               .mysql()
               .build();
        System.out.println(database.toString()); ;
       assertNotNull(database,"check if not noll");
       assertEquals(MYSQL,database.getDb(),"check equality");

    }


}
