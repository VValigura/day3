package qa.demo.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Temporary")
public class Temp {

    @Test
    public void tempTest(){
//        System.setProperty("prop", "new");


        String prop = System.getProperty("prop", "def");
        System.out.println(prop);

    }

}