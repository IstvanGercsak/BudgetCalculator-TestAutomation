package Cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Cucumber/Features",
        glue = "Cucumber/Steps"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
