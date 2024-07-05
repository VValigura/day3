package qa.demo.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
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

    @Step("Открываем страницу /automation-practice-form")
    public PracticeForm openPage(){
        open("/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        return this;
    }

    @Step("Вводим имя пользователя \"{value}\"}")
    public PracticeForm setFirstName(String value){
        firstName.setValue(value);
        return this;
    }

    @Step("Вводим фамилию пользователя \"{value}\"}")
    public PracticeForm setLastName(String value){
        lastName.setValue(value);
        return this;
    }

    @Step("Вводим почту пользователя \"{value}\"}")
    public PracticeForm setUserEmail(String value){
        userEmail.setValue(value);
        return this;
    }

    @Step("Выбирает гендер пользователя \"{value}\"}")
    public PracticeForm setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    @Step("Вводим номер пользователя \"{value}\"}")
    public PracticeForm setUserPhoneNumber(String value){
        userPhoneNumber.setValue(value);
        return this;
    }

    @Step("Указываем дату рождения пользователя \"{value}\"}")
    public PracticeForm setUserBirthDate(String value){
        callendar.setDate(value);
        return this;
    }

    @Step("Вводим знания  пользователя \"{value}\"}")
    public PracticeForm addUserSubject(String value){
        userSubjects.setValue(value).pressEnter();
        return this;
    }

    @Step("Указываем хобби пользователя \"{value}\"}")
    public PracticeForm setUserHobbies(String value){
        userHobbies.$(byText(value)).click();
        return this;
    }

    @Step("Загружаем аватарку пользователя")
    public PracticeForm uploadUserPicture(String classpath){
        userPictureUpload.uploadFromClasspath(classpath);
        return this;
    }

    @Step("Указываем адрасс пользователя \"{value}\"}")
    public PracticeForm setCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }

    @Step("Выбирает город пользователя")
    public PracticeForm selectFirstState(){
        $("#state").click();
        $("#react-select-3-option-0").click();
        return this;
    }

    @Step("Выбираем город пользователя")
    public PracticeForm selectFirstCity(){
        $("#city").click();
        $("#react-select-4-option-0").click();
        return this;
    }

    @Step("Кликаем кнопку подтвеждения формы")
    public PracticeForm clickSubmitBtn(){
        submitBtn.click();
        return this;
    }

    @Step("Проверяем что данные пользователя сохранились")
    public PracticeForm checkModalFormIsPresent(){
        $("#example-modal-sizes-title-lg").isEnabled();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }
}
