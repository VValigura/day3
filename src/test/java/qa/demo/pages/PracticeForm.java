package qa.demo.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import qa.demo.pages.components.Callendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    private Callendar callendar = new Callendar();
    private SelenideElement firstName = $("#firstName"),
                            lastName = $("#lastName"),
                            userEmail = $("#userEmail"),
                            userPhoneNumber =  $("#userNumber-wrapper input"),
                            userSubjects = $("#subjectsInput"),
                            userHobbies = $("#hobbiesWrapper"),
                            userPictureUpload = $("#uploadPicture"),
                            currentAddress =  $("#currentAddress"),
                            submitBtn =  $("#submit");

    public PracticeForm openPage(){
        open("/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        return this;
    }

    public PracticeForm setFirstName(String value){
        firstName.setValue(value);
        return this;
    }

    public PracticeForm setLastName(String value){
        lastName.setValue(value);
        return this;
    }

    public PracticeForm setUserEmail(String value){
        userEmail.setValue(value);
        return this;
    }

    public PracticeForm setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public PracticeForm setUserPhoneNumber(String value){
        userPhoneNumber.setValue(value);
        return this;
    }

    public PracticeForm setUserBirthDate(String value){
        callendar.setDate(value);
        return this;
    }

    public PracticeForm addUserSubject(String value){
        userSubjects.setValue(value).pressEnter();
        return this;
    }

    public PracticeForm setUserHobbies(String value){
        userHobbies.$(byText(value)).click();
        return this;
    }

    public PracticeForm uploadUserPicture(String classpath){
        userPictureUpload.uploadFromClasspath(classpath);
        return this;
    }

    public PracticeForm setCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }

    public PracticeForm selectFirstState(){
        $("#state").click();
        $("#react-select-3-option-0").click();
        return this;
    }

    public PracticeForm selectFirstCity(){
        $("#city").click();
        $("#react-select-4-option-0").click();
        return this;
    }

    public PracticeForm clickSubmitBtn(){
        submitBtn.click();
        return this;
    }

    public PracticeForm checkModalFormIsPresent(){
        $("#example-modal-sizes-title-lg").isEnabled();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }
}
