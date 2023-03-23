package StepObject;

import PageObject.MoviePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class MovieSteps extends MoviePage {
    @Step("click movie button")
    public MovieSteps MovieButton() {
        moviebutton.click();

        return this;
    }

    @Step("click checkboxnight")
    public MovieSteps CheckBoxNight() {
        checkboxnight.click();
        return this;
    }

    @Step("click choosemovie")
    public MovieSteps ChooseMovie() {
        choosemovie.click();
        sleep(10000);
        return this;
    }

    @Step("click choosecinema")
    public MovieSteps ChooseCinema() {
        choosecinema.click();

        return this;
    }

    @Step("click cavea east point")
    public MovieSteps CaveaEastPoint() {
        caveaeastpoint.click();
        return this;
    }

    @Step("click night session")
    public MovieSteps NightSession() {
        nightsession.click();
        return this;
    }

    @Step("click choose seat")
    public MovieSteps ChooseSeat() {
        chooseseat.click();
        sleep(5000);
        return this;
    }

    @Step("click continue buy")

    public MovieSteps ContinueBuy() {
        continuebuy.click();
        return this;
    }
}
