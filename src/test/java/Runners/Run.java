package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature.feature",
        glue = {"stepDefinitions"},
        tags="@First"
)
public class Run extends AbstractTestNGCucumberTests {
}
