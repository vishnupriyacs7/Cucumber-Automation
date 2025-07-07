package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Feature\\Table.feature",
    glue = {"DataTable"}
)

public class TableRunner {

}
