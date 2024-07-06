package qa.demo.jankinsTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("simple")
public class DisabledTests {

    @Test
    @Disabled
    public void test1(){
        assertTrue(false);
    }

    @Test
    @Disabled
    public void test2(){
        assertTrue(false);
    }

    @Test
    @Disabled
    public void test3(){
        assertTrue(false);
    }
}
