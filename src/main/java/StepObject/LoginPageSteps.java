package StepObject;

import PageObject.LoginPage;

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

        return this;
    }

}
