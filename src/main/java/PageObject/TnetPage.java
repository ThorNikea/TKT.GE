package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TnetPage {
    public SelenideElement
            tnetlogo = $(".styles_dropdownContainer__2Pj9E"),
            myauto = $((".styles_listingItemContainer__20CbL"), 0),
            myhome = $((".styles_listingItemContainer__20CbL"), 1),
            mymarket = $((".styles_listingItemContainer__20CbL"), 2),
            myparts = $((".styles_listingItemContainer__20CbL"), 3),
            vendoo = $((".styles_listingItemContainer__20CbL"), 4),
            swoop = $((".styles_listingItemContainer__20CbL"), 5),
            tkt = $((".styles_listingItemContainer__20CbL"), 6),
            livo = $((".styles_listingItemContainer__20CbL"), 7),
            saba = $((".styles_listingItemContainer__20CbL"), 8);
    public ElementsCollection TnetLoop = $$(".styles_listingItemContainer__20CbL");
    public static SelenideElement
            sabapage = $(".gSlider-Title");

}
