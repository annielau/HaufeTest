package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/haufe", plugin = {"pretty"}, glue = "com.haufe.Steps")
public class RunCucumberTest {

}
