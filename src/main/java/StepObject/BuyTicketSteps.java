package StepObject;

import PageObject.BuyTicketPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class BuyTicketSteps extends BuyTicketPage {
    @Step("fill searchbar input by value: {barinput")
    public BuyTicketSteps Searchbarinput(String buyticketinput) {
        searchbarinput.setValue(buyticketinput);
        return this;
    }

    @Step("click event")

    public BuyTicketSteps ChooseEvent() {
        chooseevent.click();
        return this;
    }

    @Step("buy event")

    public BuyTicketSteps BuyEvent() {
        buyevent.click();
        return this;
    }

    @Step("fill email intput by value {email}")

    public BuyTicketSteps EmailInput(String email) {
        emailinput.setValue(email);
        return this;
    }

    @Step("fill email intput by value {email}")

    public BuyTicketSteps PasswordInput(String password) {
        passwordinput.setValue(password);
        return this;
    }

    @Step("click login button")

    public BuyTicketSteps LoginBtn() {
        loginBtn.click();

        return this;
    }

    @Step("click buy button")

    public BuyTicketSteps BuyButton() {
        buybutton.click();

        return this;
    }

    @Step("choose seat")

    public BuyTicketSteps CHooseVip() {
        choosevip.click();

        return this;
    }

    @Step("choose seat quantity")

    public BuyTicketSteps CHooseVipQuantity() {
        choosevipquantity.click();

        return this;
    }

    @Step("choose vip value")

    public BuyTicketSteps ChooseVipValue() {
        choosevipvalue.click();

        return this;
    }

    @Step("continue buy")

    public BuyTicketSteps ContinueBuy() {
        continuebuy.click();

        return this;
    }

    @Step("continue buy1")

    public BuyTicketSteps ContinueBuy1() {
        continuebuy1.click();

        return this;
    }

    @Step("fill mobile input by value {mobile}")

    public BuyTicketSteps MobNumber(String mobnumber) {
        mobileinput.setValue(mobnumber);

        return this;
    }

    @Step("on checkbox1")

    public BuyTicketSteps CheckBox1() {
        checkbox1.click();

        return this;
    }

    @Step("on checkbox2")

    public BuyTicketSteps CheckBox2() {
        checkbox2.click();

        return this;
    }

    @Step("click pay button")

    public BuyTicketSteps PayButton() {
        payButton.click();
        sleep(5000);

        return this;
    }

    @Step("agree coockies")

    public BuyTicketSteps AgreeCookie() {
        agreecookie.click();

        return this;
    }

    @Step("click last pay button")

    public BuyTicketSteps LastPayment() {
        lastpayment.click();

        return this;
    }
}
