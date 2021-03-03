package steps_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"steps_definitions"},
		plugin = {"pretty","html:target/cucumber-html-report","html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber.xml"})
public class RunnerTeste {
}
