import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;

public class LoginPageTest extends ChromeRunner {
    @Test
    public void Logintest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.authorizationBtn()
                .emailInput(email)
                .PasswordInput(password)
                .LoginBtn();
        Assert.assertTrue(LoginPageSteps.loginSuccess.is(Condition.visible));


    }

}



