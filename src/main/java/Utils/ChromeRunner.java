package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeMethod (description = "configure browser before tests")
    public void setUp(){
        open("https://tkt.ge/");
        System.setProperty("selenide.browserSize","1980x1080");
    }
    @AfterMethod (description = "Close browser and clear cookies")
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}