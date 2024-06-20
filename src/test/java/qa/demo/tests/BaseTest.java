package qa.demo.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import qa.demo.pages.PracticeForm;

public class BaseTest {
    PracticeForm practiceForm = new PracticeForm();


    @BeforeEach
    public void beforeEach(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
