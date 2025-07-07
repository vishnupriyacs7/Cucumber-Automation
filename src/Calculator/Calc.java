package Calculator;

import java.util.List;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calc {

	 int number1;
	 int number2;
	 int result;
	int expected=8;

	@Given("Following numbers")
	public void following_numbers(DataTable dataTable) {
//		for (int i = 1; i < dataTable.size(); i++) {
//	//	    List<String> headers = dataTable.get(0);
//		    List<String> data = dataTable.get(i);
//		    number1 =Integer.parseInt(data.get(0));
//		    number2 =Integer.parseInt(data.get(1));  
//		}
		List<List<String>> data = dataTable.asLists();
		number1 = Integer.parseInt(data.get(1).get(0));
		number2 = Integer.parseInt(data.get(1).get(1));
	}
	
	@When("Add them")
	public void add_them() {
	    result = number1+number2;
	}
	
	@Then("The result should be {int}")
	public void the_result_should_be(Integer int1) {
		Assert.assertEquals(expected,result);
		System.out.println(result);
	}
}
