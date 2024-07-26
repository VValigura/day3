package qa.demo.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("Temporary")
public class Temp extends BaseRemoteTest{

    @Test
    public void tempTest(){
//        System.setProperty("prop", "new");


        System.out.println("hello WORLD");
        System.out.println("hello WORLD");
        System.out.println("hello WORLD");
        System.out.println("hello WORLD");
        System.out.println("hello WORLD");
        open("https://www.google.com/");

    }

}
