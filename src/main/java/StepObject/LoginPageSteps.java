package StepObject;

import PageObject.LoginPage;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps  AuthorizationBtn () {
        authorizationBtn.click();
        return this;
    }
    public LoginPageSteps EmailInput(String email) {
        emailinput.setValue(email);
        return this;
    }
    public LoginPageSteps PasswordInput(String password) {
        passwordinput.setValue(password);
        return this;
    }

    public LoginPageSteps LoginBtn() {
        loginBtn.click();
        sleep(5000);

        return this;
    }

}
