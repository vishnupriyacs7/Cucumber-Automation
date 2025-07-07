package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dataexample {
	WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	   
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		WebElement usernameField = driver.findElement(By.id("user-name")); 
        WebElement passwordField = driver.findElement(By.id("password"));  
        WebElement loginButton = driver.findElement(By.id("login-button")); 

        // Enter username and password
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

	}
	@Then("Login Successful")
	public void login_successful() throws InterruptedException {
//		WebElement messageElement = driver.findElement(By.xpath("//h3[@data-test='error']"));
//
//        
//        String actualMessage = messageElement.getText();
//        
//        expectedMessage.equals(actualMessage);
        
        // Close the browser after the test
		WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div"));
        System.out.println("Login success ? " + element.isDisplayed());
        Thread.sleep(2000);
		driver.quit();

	}

}
