import StepObject.BuyTicketSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.BuyTicketData.*;

public class BuyTicketTest extends ChromeRunner {

    @Test
    public void Buyticket() {
        BuyTicketSteps buyTicketSteps = new BuyTicketSteps();
        buyTicketSteps.searchbarinput.setValue(buyticketinput).pressEnter();
        buyTicketSteps.AgreeCookie();
        buyTicketSteps.ChooseEvent();
        buyTicketSteps.BuyEvent();
        buyTicketSteps.EmailInput(email);
        buyTicketSteps.PasswordInput(password);
        buyTicketSteps.LoginBtn();
        buyTicketSteps.BuyButton();
        buyTicketSteps.CHooseVip();
        buyTicketSteps.CHooseVipQuantity();
        buyTicketSteps.ChooseVipValue();
        buyTicketSteps.ContinueBuy();
        buyTicketSteps.ContinueBuy1();
        buyTicketSteps.CheckBox1();
        buyTicketSteps.CheckBox2();
        buyTicketSteps.MobNumber(mobnumber);
        buyTicketSteps.PayButton();
        Assert.assertTrue(buyTicketSteps.lastpayment.is(Condition.visible), "concert ticket payment check");


    }
}
