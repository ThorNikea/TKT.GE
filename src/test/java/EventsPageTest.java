import StepObject.EventsPageSteps;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.selector.ByText;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class EventsPageTest extends ChromeRunner {
    @Test
    public void EventsPage() {
        EventsPageSteps eventsPageSteps = new EventsPageSteps();
        eventsPageSteps.Under21();


    }

    @Test
    public void test() {
        EventsPageSteps eventsPageSteps = new EventsPageSteps();
        $((".iCRHhi")).$(new ByText("UNDER 21"));
        sleep(5000);
    }
}
