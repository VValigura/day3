package qa.demo.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import qa.demo.utils.RandomData;

import static com.codeborne.selenide.Selenide.sleep;

public class MainDemoQATest extends BaseTest{



    @Test
    @DisplayName("Тестирование формы для практики")
    @Tags({
            @Tag("BLOCKER"),
            @Tag("WEB")
    })
//    @ValueSource(strings = {
//            "Selenide"
//    })
//    @ParameterizedTest(name = "скать значение {0}")
//    allureTags
    @Feature("Issue в репозитории")
    @Story("Создание Issue")
    @Owner("Valigura")



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
    }


    @Disabled("Почемуто задизейблели")
    @Test
    public void disableTest(){
        //doNothing
    }
}
