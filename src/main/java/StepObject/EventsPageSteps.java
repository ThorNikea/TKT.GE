package StepObject;

import PageObject.EventsPage;

public class EventsPageSteps extends EventsPage {
    public EventsPage Under21() {
        Under21.click();
        return this;

    }
}
