package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Feature\\loginTask.feature",
		glue = "LoginTask",
		plugin={"pretty","html:target/cucumber-reports.html"}
		)

public class LoginTaskRunner {

}
