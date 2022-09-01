package StepDefinitions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(features ={"src/test/Features/search.feature"}, glue = {"StepDefinitions"}, tags = "@AddProduct or @GuestUser")
public class TestRunner {
    private static TestNGCucumberRunner testNGCucumberRunner;

    @DataProvider
    public static Object[][] features() {
        return testNGCucumberRunner.provideScenarios();

    }

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(groups = "cucumber",description = "Runs Cucumber Features",dataProvider = "features")
    public void feature(PickleWrapper pickle, FeatureWrapper cucumberFeature)
    {
     testNGCucumberRunner.runScenario(pickle.getPickle());
    }
}
