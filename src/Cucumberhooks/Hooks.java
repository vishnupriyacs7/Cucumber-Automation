package Cucumberhooks;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
	public static WebDriver driver; 
	@BeforeAll
    public static void beforeAll() {
    	   driver = new ChromeDriver();
    	   driver.manage().window().maximize(); 
    	   System.out.println("beforeall");
    }

    // Global hook to run after all scenarios
    @AfterAll
    public static void afterAll() {
    	System.out.println("afterall");
    	driver.quit();
    }

    // Scenario hook to run before each scenario
    @Before
    public static void beforeScenario() {
        System.out.println("Running setup before each scenario...");
    }

    // Scenario hook to run after each scenario
    @After
    public void afterScenario() throws InterruptedException {
    	Thread.sleep(2000);
        System.out.println("Running cleanup after each scenario...");
    }

    // Step hook to run before each step
    @BeforeStep
    public void beforeStep() {
        System.out.println("Running actions before each step...");
    }

    // Step hook to run after each step
    @AfterStep
    public void afterStep() {
        System.out.println("Running actions after each step...");
    }

}



