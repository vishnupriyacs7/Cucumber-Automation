package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Feature\\DataDriven.feature",
		glue = "DataDrivenCucumber",
		plugin={"pretty","html:destt/result.html","json:destt/result.json"}
		)
public class Datadriven {

}
