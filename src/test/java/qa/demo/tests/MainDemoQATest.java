package qa.demo.tests;

import org.junit.jupiter.api.Test;
import qa.demo.utils.RandomData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainDemoQATest extends BaseTest{

    @Test
    public void firstDemoQaTest() {
        String userFirstName = RandomData.getFirstName(),
                userLastName = RandomData.getLastName(),
                userEmail = RandomData.getEmail(),
                userGender = RandomData.getGender(),
                userPhoneNumber = RandomData.getPhone(),
                userSubject = RandomData.getSubject(),
                userHobbies = RandomData.getHobbies(),
                userAddress = RandomData.getAddress();

        practiceForm.openPage();
        practiceForm.setFirstName(userFirstName);
        practiceForm.setLastName(userLastName);
        practiceForm.setUserEmail(userEmail);
        practiceForm.setGender(userGender);
        practiceForm.setUserPhoneNumber(userPhoneNumber);
        practiceForm.setUserBirthDate("05 June 1991");
        practiceForm.addUserSubject(userSubject);
        practiceForm.setUserHobbies(userHobbies);
        practiceForm.uploadUserPicture("image/1.png");
        practiceForm.setCurrentAddress(userAddress);
        practiceForm.selectFirstState();
        practiceForm.selectFirstCity();
        practiceForm.clickSubmitBtn();

        practiceForm.checkModalFormIsPresent();

        sleep(3000);
    }
}
