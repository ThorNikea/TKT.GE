package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            authorizationBtn = $("#continueButton2");
    public SelenideElement emailinput = $(byClassName("style__InputElement-gqso6m-2"),0);
    public SelenideElement passwordinput = $(byClassName("style__InputElement-gqso6m-2"),1);
    public SelenideElement loginBtn = $(byText("შესვლა"));
    public static SelenideElement loginSuccess = $(byClassName("_s_btn")).$(byText("შევსება"));
}
