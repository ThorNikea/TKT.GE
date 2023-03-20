package PageObject;

import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class EventsPage {
    public SelenideElement
            Under21 = $(".iCRHhi").$(byText("UNDER 21")),
            Concerts = $(".iCRHhi").$(new ByText("ღონისძიებები"));

}


