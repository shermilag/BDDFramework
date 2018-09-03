package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\raghu\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Features\\dealsmap.feature", //the path of the feature files
		glue={"stepDefinitions"},//the path of the step definition files
		plugin = {"pretty","html:test-outout"},
		monochrome = true,
		strict = true,
		dryRun = false
			
		)





public class TestRunner {

}
