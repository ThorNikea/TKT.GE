package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class EventsPage {
    public SelenideElement
            under21 = $(byClassName("style__BurgerDropdownButton-ndz9f1-1"), 1),
            concerts = $(byClassName("icon-concerts")),
            transport = $(byClassName("icon-transport")),
            theatre = $(byClassName("icon-theatre")),
            opera = $(byClassName("icon-opera")),
            sport = $(byClassName("icon-sport")),
            other = $(byClassName("icon-other"));
    public static SelenideElement forassertother = $(byText("სხვა"));

}


