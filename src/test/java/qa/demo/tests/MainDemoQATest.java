package qa.demo.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainDemoQATest extends BaseTest{

    @Test
    public void firstDemoQaTest() {



        practiceForm.openPage();
        practiceForm.setFirstName("testFirstName");
        practiceForm.setLastName("testLastName");
        practiceForm.setUserEmail("test@user.email");
        practiceForm.setGender("Male");
        practiceForm.setUserPhoneNumber("0123456789");
        practiceForm.setUserBirthDate("05 June 1991");
        practiceForm.addUserSubject("English");
        practiceForm.setUserHobbies("Reading");
        practiceForm.uploadUserPicture("image/1.png");
        practiceForm.setCurrentAddress("Test current address");
        practiceForm.selectFirstState();
        practiceForm.selectFirstCity();
        practiceForm.clickSubmitBtn();

        practiceForm.checkModalFormIsPresent();

        sleep(3000);
    }
}
