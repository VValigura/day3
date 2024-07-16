package qa.demo.api;

import org.junit.jupiter.api.Test;
import qa.demo.api.lombok.LoginBodyLombokModel;
import qa.demo.api.lombok.LoginResponseLombokModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static qa.demo.api.specs.LoginSpec.loginRequestSpec;
import static qa.demo.api.specs.LoginSpec.loginResponseSpec;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class mainApiTest {

    @Test
    void successfulLoginTest() {
        LoginBodyLombokModel loginBody = new LoginBodyLombokModel();
        loginBody.setEmail("eve.holt@reqres.in");
        loginBody.setPassword("cityslicka");

        LoginResponseLombokModel response = step("Make request", () ->
                given(loginRequestSpec)
                        .body(loginBody)
                        .when()
                        .post("/api/login")
                        .then()
                        .spec(loginResponseSpec)
                        .extract().as(LoginResponseLombokModel.class));

        step("Verify response", () ->
                assertThat(response.getToken()).isEqualTo("QpwL5tke4Pnpja7X4"));

    }
}
