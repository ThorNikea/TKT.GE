package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MoviePage {
    public SelenideElement
            moviebutton = $((".icon-movie"), 1),
            checkboxnight = $(byText("ღამე (20:00 - 00:00)")),
            choosemovie = $(".dRbwPj"),
            choosecinema = $(".bvTkYN"),
            caveaeastpoint = $(byText("კავეა ისთ ფოინთი")),
            nightsession = $((".style__MoviesSessionListItem-sc-46qb8y-1"), 0),
            chooseseat = $(byId("XMLID_421_")),
            continuebuy = $(byId("continueButton1"));


    public static SelenideElement johnwick = $(byText("ჯონი უიკი ნაწილი 4"));
}
