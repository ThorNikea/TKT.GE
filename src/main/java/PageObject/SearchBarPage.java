package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchBarPage {
    public static SelenideElement
            searchbarinput = $("#desktop-search-input");
    public static SelenideElement threepig = $((".dhclPd"),1);


}
