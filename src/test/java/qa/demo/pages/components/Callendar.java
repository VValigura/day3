package qa.demo.pages.components;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class Callendar {

    public Callendar setDate(String value){
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "A");
        $("#dateOfBirthInput").sendKeys(value);
        return this;
    }
}
