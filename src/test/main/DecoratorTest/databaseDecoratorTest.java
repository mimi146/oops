package DecoratorTest;

import Structural.Decorator.Database;
import Structural.Decorator.DecoratorCompressor;
import Structural.Decorator.DecoratorEncryppt;
import Structural.Decorator.FileDatabase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class databaseDecoratorTest {
    Database db ;

    @Before
    public void setup() {
        db = new FileDatabase();
    }

    @Test
    public void decoratorTest(){
        Database encyption = new DecoratorEncryppt(db);
        Database compressor = new DecoratorCompressor(db);


       assertEquals("read-value",db.Read()); // without decorator
       assertEquals("test",db.write("test")); // without decorator

       assertEquals("read-value--decrypted",encyption.Read()); // using decorator encryt
       assertEquals("input--encrypted",encyption.write("input")); // using decorator encryt

        assertEquals("input--compressed",compressor.write("input")); // using decorator compressor
        assertEquals("read-value--uncompressed",compressor.Read()); // using decorator compressor
    }


}

