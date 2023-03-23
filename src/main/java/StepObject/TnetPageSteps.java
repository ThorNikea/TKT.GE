package StepObject;

import PageObject.TnetPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class TnetPageSteps extends TnetPage {
    @Step("click Tnet Logo")
    public TnetPageSteps TnetUrls() {
        tnetlogo.click();
        return this;
    }

    @Step("click all tabs under Tnet logo")
    public TnetPageSteps loop_sites() {
        int count = TnetLoop.size();
        for (int i = 0; i < count; i++) {
            TnetLoop.get(i).click();
            switchTo().window(0);
            tnetlogo.click();
        }
        return this;
    }

    @Step("switch window")
    public TnetPageSteps BackToSabaTab() {
        switchTo().window(9);
        sleep(7000);
        return this;
    }

}


