package StepObject;

import PageObject.SearchBarPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchBarSteps extends SearchBarPage {
    public SearchBarSteps Searchbarinput(String name) {
        searchbarinput.setValue(name).click();
        sleep(5000);
        return this;
    }
}
