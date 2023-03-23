package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            authorizationBtn = $("#continueButton2"),
            emailinput = $(byClassName("style__InputElement-gqso6m-2"), 0),
            passwordinput = $(byClassName("style__InputElement-gqso6m-2"), 1),
            loginBtn = $(byText("შესვლა"));
    public static SelenideElement loginSuccess = $(byClassName("profile__DropdownClickArea-sc-1ba70ir-0"));
}
