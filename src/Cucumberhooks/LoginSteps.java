package Cucumberhooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = Hooks.driver;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	    System.out.println("Navigated to login page");
	}
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		 WebElement usernameField = driver.findElement(By.id("username"));
		 WebElement passwordField = driver.findElement(By.id("password"));
		 WebElement submitButton = driver.findElement(By.id("submit"));
		    
		    usernameField.sendKeys("student");
		    passwordField.sendKeys("Password123");
		    submitButton.click();
		    
		    System.out.println("Entered valid credentials and submitted");
	}
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		  WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]"));
		    if (successMessage.isDisplayed()) {
		        System.out.println("Login successful");
		    } else {
		        System.out.println("Login failed");
		    }
	}
	
	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		   WebElement usernameField = driver.findElement(By.id("username"));
		   WebElement passwordField = driver.findElement(By.id("password"));
		   WebElement submitButton = driver.findElement(By.id("submit"));
		    
		    
		    usernameField.sendKeys("invalidUser");
		    passwordField.sendKeys("invalidPassword");
		    submitButton.click();
		    
		    System.out.println("Entered invalid credentials and submitted");
	}
	
	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
		WebElement errorMessage = driver.findElement(By.id("error"));
	    if (errorMessage.isDisplayed()) {
	        System.out.println("Error message displayed: " + errorMessage.getText());
	    } else {
	        System.out.println("No error message displayed");
	    }
	}

}


