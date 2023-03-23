package StepObject;

import PageObject.TnetPage;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class TnetPageSteps extends TnetPage {
    public TnetPageSteps TnetUrls() {
        tnetlogo.click();
        return this;
    }

    public TnetPageSteps loop_sites() {
        int count = TnetLoop.size();
        for (int i = 0; i < count; i++) {
            TnetLoop.get(i).click();
            switchTo().window(0);
            tnetlogo.click();
        }
        return this;
    }
    public TnetPageSteps BackToSabaTab() {
        switchTo().window(9);
        sleep(7000);
        return this;
    }

}


