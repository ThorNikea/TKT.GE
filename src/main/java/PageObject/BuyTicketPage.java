package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BuyTicketPage {
    public static SelenideElement
            agreecookie = $(byText("ვეთანხმები")),
            searchbarinput = $("#desktop-search-input"),
            chooseevent = $(byText("Bob Sinclar - Powered By Mono Hall")),
            buyevent = $("#continueButton2"),
            emailinput = $(byClassName("style__InputElement-gqso6m-2"), 0),
            passwordinput = $(byClassName("style__InputElement-gqso6m-2"), 1),
            loginBtn = $(byText("შესვლა")),
            buybutton = $(byText("ყიდვა"), 1),
            choosevip = $(byClassName("style__SelectWrapper-bsssz3-0")),
            choosevipquantity = $(byText("2")),
            choosevipvalue = $(byClassName("hwZnpM"), 5),
            continuebuy = $(byText("გაგრძელება")),
            continuebuy1 = $(byId("continueButton2")),
            mobileinput = $(byName("tel")),
            checkbox1 = $(byClassName("style__CheckboxCheckmark-sc-732ke0-1"), 0),
            checkbox2 = $(byClassName("style__CheckboxCheckmark-sc-732ke0-1"), 1),
            payButton = $(byId("payButton"));
    public static SelenideElement lastpayment = $(byText("გადახდა"));


}
