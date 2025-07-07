package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = {"C:\\Users\\HP\\eclipse-workspace\\CucumberProject\\Feature\\login.feature"},
   glue = {"stepdefinition"},
   dryRun = false,
   monochrome = true,
   plugin= {"pretty","html:result/report.html","json:result/report.json","junit:result/report.xml"}
   
   )


public class LoginRunner {

}
