import StepObject.MovieSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieTest extends ChromeRunner {
    @Test
    public void MovieTest() {
        MovieSteps movieSteps = new MovieSteps();
        movieSteps.MovieButton()
                .CheckBoxNight()
                .ChooseMovie()
                .CaveaEastPoint()
                .NightSession()
                .ChooseSeat()
                .ContinueBuy();
        Assert.assertTrue(MovieSteps.johnwick.is(Condition.visible), "ჯონ უიკის ღამის სეანსის შემოწმება");

    }
}
