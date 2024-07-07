package qa.demo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import qa.demo.pages.PracticeForm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.impl.Cleanup.of;

public class BaseRemoteTest {
    PracticeForm practiceForm = new PracticeForm();

    @BeforeAll
    static public void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

        Configuration.browser = "chrome";
        Configuration.browserVersion = "122.0";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

    }


    @BeforeEach
    public void beforeEach(){

        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
