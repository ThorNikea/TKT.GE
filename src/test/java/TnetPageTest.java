import StepObject.TnetPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TnetPageTest extends ChromeRunner {
    @Test
    @Description("Check Tnet URL Redirection")
    @Severity(SeverityLevel.CRITICAL)
    public void TnetPageTest() {
        TnetPageSteps tnetPageSteps = new TnetPageSteps();
        tnetPageSteps.TnetUrls()
                .loop_sites()
                        .BackToSabaTab();
        Assert.assertTrue(TnetPageSteps.sabapage.is(Condition.visible));
    }
}
