package CalculatorRohan;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {
	int result ; 
	@Given("I Have a calculator")
	public void i_have_a_calculator() {
	    
	}
	
	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	  result = int1 + int2 ;
	}

	
	@Then("The result should be {int}")
	public void the_result_should_be(Integer res) {
		if(res==result) {
			  System.out.println("success - Result :" + result);
		  }else {
			  System.out.println("incorrect - Result :" + result);
		  }
	}

}
