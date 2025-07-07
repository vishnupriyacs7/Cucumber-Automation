package testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Features\\Login .feature",
   //path of step definition file
   glue = "testing30"
   )


public class LoginRunner {

}
