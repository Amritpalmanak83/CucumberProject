package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java"}, 
					glue = {"StepDefination"},
					tags = {"@tag"},
					plugin = {"pretty",
							"html:target/cucumber", "json:target_jason/cucumberjson.json","junit:target_json/Cucumber_junit.xml"}
					//dryRun= true
					//strict = false,
					//monochrome = true
				)
public class TestRunner {

}
