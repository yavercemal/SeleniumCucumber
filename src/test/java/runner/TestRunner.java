package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src\\test\\java\\Features", glue = {"pageSteps"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
