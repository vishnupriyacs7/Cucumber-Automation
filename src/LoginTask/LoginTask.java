package LoginTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTask {
	WebDriver driver;
	@Given("user on login page")
	public void user_on_login_page() {
		driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
	}
	@Then("user logs in")
	public void user_logs_in() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		   System.out.println("submit");
		   Thread.sleep(3000);
	}
	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("incorrectUser");
		driver.findElement(By.name("password")).sendKeys("Password");
	}
	@Then("unsuccessful login")
	public void unsuccessful_login() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		System.out.println("submit");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("error")).getText());
		System.out.println("error message displayed");
	}
}
