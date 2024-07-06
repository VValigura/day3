package qa.demo.jankinsTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("simple")
public class NegativeTests {

    @Test
    public void test1(){
        assertTrue(false);
    }

    @Test
    public void test2(){
        assertTrue(false);
    }

    @Test
    public void test3(){
        assertTrue(false);
    }
}
