import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;

public class LoginPageTest extends ChromeRunner {
    @Test
    @Description("Check Login")
    @Severity(SeverityLevel.BLOCKER)
    public void Logintest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.AuthorizationBtn()
                .EmailInput(email)
                .PasswordInput(password)
                .LoginBtn();
        Assert.assertTrue(loginPageSteps.loginSuccess.is(Condition.visible), "ავტორიზაციის შემოწმება");


    }

}



