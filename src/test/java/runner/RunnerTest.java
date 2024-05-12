package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/CucumberTrivagoReport"},
        features = "classpath:features",
        glue = "steps"
)
public class RunnerTest extends RunBase {
}
