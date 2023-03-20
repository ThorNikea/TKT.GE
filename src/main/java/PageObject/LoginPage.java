package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            authorizationBtn = $("#continueButton2");
    public SelenideElement emailinput = $(byClassName("style__ModalContainer-sc-1hmnbwr-1")).$(byText("ელ-ფოსტა"));
    public SelenideElement passwordinput = $(byClassName("style__ModalContainer-sc-1hmnbwr-1")).$(byText("პაროლი"));

    public SelenideElement LoginBtn = $(byClassName("style__GenericButton-nm7nxs-0")).$(byText("შესვლა"));
    public static SelenideElement loginSuccess = $(byClassName("_s_btn")).$(byText("შევსება"));
}
