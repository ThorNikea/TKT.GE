import StepObject.SearchBarSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.SearchBarData.barinput;

public class SearchBarTest extends ChromeRunner {
    @Test
    @Description("Check searchbar validation")
    @Severity(SeverityLevel.MINOR)
    public void Searchbar() {
        SearchBarSteps searchBarSteps = new SearchBarSteps();
        SearchBarSteps.searchbarinput.setValue(barinput);
        Assert.assertTrue(SearchBarSteps.threepig.is(Condition.visible));


    }
}
