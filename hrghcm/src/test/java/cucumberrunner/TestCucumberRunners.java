package cucumberrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature", 
		glue = "stepdefinition",dryRun = true)
//feature
//stepDefinition location to feature file
public class TestCucumberRunners {

}
