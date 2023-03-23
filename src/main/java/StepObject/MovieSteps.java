package StepObject;

import PageObject.MoviePage;

import static com.codeborne.selenide.Selenide.sleep;

public class MovieSteps extends MoviePage {
    public MovieSteps MovieButton() {
        moviebutton.click();

        return this;
    }

    public MovieSteps CheckBoxNight() {
        checkboxnight.click();

        return this;
    }

    public MovieSteps ChooseMovie() {
        choosemovie.click();
        sleep(10000);

        return this;
    }

    public MovieSteps ChooseCinema() {
        choosecinema.click();

        return this;
    }
    public MovieSteps CaveaEastPoint() {
        caveaeastpoint.click();

        return this;
    }
    public MovieSteps NightSession() {
        nightsession.click();
        return this;
    }
    public MovieSteps ChooseSeat() {
        chooseseat.click();
        sleep(5000);
        return this;
    }
    public MovieSteps ContinueBuy() {
        continuebuy.click();
        return this;
    }
}
