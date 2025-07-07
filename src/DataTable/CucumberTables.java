package DataTable;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTables {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    System.out.println("home");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("login");
	}
	@When("^User enters Credentials to LogIn$")
	public void user_enters_credentials_to_log_in(DataTable usercredentials) {
		List<List<String>> data = usercredentials.asLists();
		System.out.println("first data "+data.get(0).get(0));
		System.out.println("second data 	"+data.get(1).get(1));
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("success");
	}

}
