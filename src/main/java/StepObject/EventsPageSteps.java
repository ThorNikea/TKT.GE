package StepObject;

import PageObject.EventsPage;
import io.qameta.allure.Step;

public class EventsPageSteps extends EventsPage {
    @Step("click under21")
    public EventsPageSteps Under21() {
        under21.click();
        return this;
    }

    @Step("click concerts")
    public EventsPageSteps Concerts() {
        concerts.click();
        return this;
    }

    @Step("click transport")
    public EventsPageSteps Transport() {
        transport.click();
        return this;
    }

    @Step("click theatre")
    public EventsPageSteps Theatre() {
        theatre.click();
        return this;
    }

    @Step("click opera")
    public EventsPageSteps Opera() {
        opera.click();
        return this;
    }

    @Step("click sport")

    public EventsPageSteps Sport() {
        sport.click();
        return this;
    }

    @Step("click other")
    public EventsPageSteps Other() {
        other.click();
        return this;
    }
}
