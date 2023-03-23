package StepObject;

import PageObject.BuyTicketPage;

import static com.codeborne.selenide.Selenide.sleep;

public class BuyTicketSteps extends BuyTicketPage {
    public BuyTicketSteps Searchbarinput(String buyticketinput) {
        searchbarinput.setValue(buyticketinput);
        return this;
    }

    public BuyTicketSteps ChooseEvent() {
        chooseevent.click();
        return this;
    }

    public BuyTicketSteps BuyEvent() {
        buyevent.click();
        return this;
    }

    public BuyTicketSteps EmailInput(String email) {
        emailinput.setValue(email);
        return this;
    }

    public BuyTicketSteps PasswordInput(String password) {
        passwordinput.setValue(password);
        return this;
    }

    public BuyTicketSteps LoginBtn() {
        loginBtn.click();

        return this;
    }

    public BuyTicketSteps BuyButton() {
        buybutton.click();

        return this;
    }

    public BuyTicketSteps CHooseVip() {
        choosevip.click();

        return this;
    }

    public BuyTicketSteps CHooseVipQuantity() {
        choosevipquantity.click();

        return this;
    }

    public BuyTicketSteps ChooseVipValue() {
        choosevipvalue.click();

        return this;
    }

    public BuyTicketSteps ContinueBuy() {
        continuebuy.click();

        return this;
    }

    public BuyTicketSteps ContinueBuy1() {
        continuebuy1.click();

        return this;
    }

    public BuyTicketSteps MobNumber(String mobnumber) {
        mobileinput.setValue(mobnumber);

        return this;
    }

    public BuyTicketSteps CheckBox1() {
        checkbox1.click();

        return this;
    }

    public BuyTicketSteps CheckBox2() {
        checkbox2.click();

        return this;
    }

    public BuyTicketSteps PayButton() {
        payButton.click();
        sleep(5000);

        return this;
    }

    public BuyTicketSteps AgreeCookie() {
        agreecookie.click();

        return this;
    }

    public BuyTicketSteps LastPayment() {
        lastpayment.click();

        return this;
    }
}
