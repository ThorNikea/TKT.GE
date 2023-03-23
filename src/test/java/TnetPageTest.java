import StepObject.TnetPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TnetPageTest extends ChromeRunner {
    @Test
    public void TnetPageTest() {
        TnetPageSteps tnetPageSteps = new TnetPageSteps();
        tnetPageSteps.TnetUrls()
                .loop_sites()
                        .BackToSabaTab();
        Assert.assertTrue(TnetPageSteps.sabapage.is(Condition.visible));
    }
}
