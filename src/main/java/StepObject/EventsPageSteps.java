package StepObject;

import PageObject.EventsPage;

public class EventsPageSteps extends EventsPage {
    public EventsPageSteps Under21() {
        under21.click();
        return this;
    }

    public EventsPageSteps Concerts() {
        concerts.click();
        return this;
    }

    public EventsPageSteps Transport() {
        transport.click();
        return this;
    }

    public EventsPageSteps Theatre() {
        theatre.click();
        return this;
    }

    public EventsPageSteps Opera() {
        opera.click();
        return this;
    }

    public EventsPageSteps Sport() {
        sport.click();
        return this;
    }

    public EventsPageSteps Other() {
        other.click();
        return this;
    }
}
