package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Feature\\CucumberTags.feature",
		glue="CucumberTags",
		tags = "@FunctionalTest and not @RegressionTest"
//		tags = "@FunctionalTest"
			
		)

public class TagsRunner {

}
