package qa.demo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import qa.demo.pages.PracticeForm;

public class BaseTest {
    PracticeForm practiceForm = new PracticeForm();


    @BeforeEach
    public void beforeEach(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
