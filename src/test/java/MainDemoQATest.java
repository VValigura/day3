import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainDemoQATest {

    @Test
    public void firstDemoQaTest() {
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");

        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("testFirstName");
        $("#lastName").setValue("testLastName");
        $("#userEmail").setValue("test@user.email");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber-wrapper input").setValue("0123456789");
        //dateOfBirthInput
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "A");
        $("#dateOfBirthInput").sendKeys("05 June 1991");

        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("image/1.png");
        $("#currentAddress").setValue("Test current address");
        $("#currentAddress").setValue("Test current address");

        //selectStateAndCity
        $("#state").click();
        $("#react-select-3-option-0").click();
        $("#city").click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").isEnabled();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));











        sleep(3000);
    }
}
