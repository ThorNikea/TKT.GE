package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageSteps extends LoginPage {
    @Step("click authorizationbtn")
    public LoginPageSteps AuthorizationBtn() {
        authorizationBtn.click();
        return this;
    }

    @Step("fill email input by value {email}")
    public LoginPageSteps EmailInput(String email) {
        emailinput.setValue(email);
        return this;
    }

    @Step("fill password input by value {password}")

    public LoginPageSteps PasswordInput(String password) {
        passwordinput.setValue(password);
        return this;
    }

    @Step("click login button")
    public LoginPageSteps LoginBtn() {
        loginBtn.click();
        sleep(5000);

        return this;
    }

}
