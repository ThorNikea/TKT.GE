import StepObject.EventsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventsPageTest extends ChromeRunner {
    @Test
    @Description("Check events page redirection")
    @Severity(SeverityLevel.CRITICAL)
    public void EventsPage() {
        EventsPageSteps eventsPageSteps = new EventsPageSteps();
        eventsPageSteps.Under21()
                .Concerts()
                .Transport()
                .Theatre()
                .Opera()
                .Sport()
                .Other();
        Assert.assertTrue(EventsPageSteps.forassertother.is(Condition.visible));

    }

}
