package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue="StepDefinitions", 
		tags= "@SanityTest",
		plugin= {"pretty","html:target/reportC","json:target/cucumber.json","junit: target/cucu.xml"})
public class TestRunner 
{
	

}
//classpath:src/test/java/Features/LoginFeature.feature
// tags >>> @tes1 and @test2 ===runs which has both @test1 and also test2
// tags >>> @tes1 or @test2 ===runs which   @test1 and  test2 scenarios
