package qa.demo.jankinsTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("simple")
public class PositiveTests {

    @Test
    public void test1(){
        assertTrue(true);
    }

    @Test
    public void test2(){
        assertTrue(true);
    }

    @Test
    public void test3(){
        assertTrue(true);
    }
}
