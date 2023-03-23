package StepObject;

import PageObject.SearchBarPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchBarSteps extends SearchBarPage {
    @Step("fill search bar by input {barinput}")

    public SearchBarSteps Searchbarinput(String name) {
        searchbarinput.setValue(name).click();
        sleep(5000);
        return this;
    }
}
