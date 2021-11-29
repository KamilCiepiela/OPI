package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectFeatures", glue = "stepDefinitions", plugin = {"pretty", "html:out"})
public class Runner {


}
