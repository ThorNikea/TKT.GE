package StepObject;

import PageObject.LoginPage;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps  authorizationBtn () {
        authorizationBtn.click();
        return this;
    }
    public LoginPageSteps emailInput(String email) {
        emailinput.setValue(email);
        return this;
    }
    public LoginPageSteps PasswordInput(String password) {
        passwordinput.setValue(password);
        return this;
    }

    public LoginPageSteps LoginBtn() {
        LoginBtn.click();

        return this;
    }

}
