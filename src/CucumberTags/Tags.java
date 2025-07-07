package CucumberTags;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags {
	// Step for Successful Login Scenario
    @Given("This is a blank test for Successful Login")
    public void givenThisIsABlankTestForSuccessfulLogin() {
        System.out.println("Executing blank test for Successful Login scenario");
    }

    // Step for Unsuccessful Login Scenario
    @Given("This is a blank test for Unsuccessful Login")
    public void givenThisIsABlankTestForUnsuccessfulLogin() {
        System.out.println("Executing blank test for Unsuccessful Login scenario");
    }

    // Step for Add Product to Bag Scenario
    @Given("This is a blank test for Add Product to Bag")
    public void givenThisIsABlankTestForAddProductToBag() {
        System.out.println("Executing blank test for Add Product to Bag scenario");
    }

    // Step for Add Multiple Products to Bag Scenario
    @Given("This is a blank test for Add Multiple Products to Bag")
    public void givenThisIsABlankTestForAddMultipleProductsToBag() {
        System.out.println("Executing blank test for Add Multiple Products to Bag scenario");
    }

    // Step for Remove Product from Bag Scenario
    @Given("This is a blank test for Remove Product from Bag")
    public void givenThisIsABlankTestForRemoveProductFromBag() {
        System.out.println("Executing blank test for Remove Product from Bag scenario");
    }

    // Step for Remove All Products from Bag Scenario
    @Given("This is a blank test for Remove All Products from Bag")
    public void givenThisIsABlankTestForRemoveAllProductsFromBag() {
        System.out.println("Executing blank test for Remove All Products from Bag scenario");
    }

    // Step for Increase Product Quantity from Bag Page Scenario
    @Given("This is a blank test for Increase Product Quantity")
    public void givenThisIsABlankTestForIncreaseProductQuantity() {
        System.out.println("Executing blank test for Increase Product Quantity scenario");
    }

    // Step for Decrease Product Quantity from Bag Page Scenario
    @Given("This is a blank test for Decrease Product Quantity")
    public void givenThisIsABlankTestForDecreaseProductQuantity() {
        System.out.println("Executing blank test for Decrease Product Quantity scenario");
    }

    // Step for Buy a Product with Cash Payment Scenario
    @Given("This is a blank test for Buy a Product with Cash Payment")
    public void givenThisIsABlankTestForCashPayment() {
        System.out.println("Executing blank test for Buy a Product with Cash Payment scenario");
    }

    // Step for Buy a Product with CC Payment Scenario
    @Given("This is a blank test for Buy a Product with CC Payment")
    public void givenThisIsABlankTestForCCPayment() {
        System.out.println("Executing blank test for Buy a Product with CC Payment scenario");
    }

    // Step for Payment Declined Scenario Outline
    @Given("This is a blank test for Payment Declined with {string}")
    public void givenThisIsABlankTestForPaymentDeclined(String paymentMethod) {
        System.out.println("Executing blank test for Payment Declined scenario with payment method: " + paymentMethod);
    }
    
    @When("Payment is declined for {string}")
    public void whenPaymentIsDeclinedFor(String paymentMethod) {
        System.out.println("Payment declined for method: " + paymentMethod);
    }
    
    @Then("Payment should be declined for {string}")
    public void thenPaymentShouldBeDeclinedFor(String paymentMethod) {
        System.out.println("Verifying payment declined for method: " + paymentMethod);
    }
	 
	
}


