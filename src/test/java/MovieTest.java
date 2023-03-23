import StepObject.MovieSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieTest extends ChromeRunner {
    @Test
    @Description("check movie tiket buy flow")
    @Severity(SeverityLevel.NORMAL)
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
