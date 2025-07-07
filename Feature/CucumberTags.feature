@FunctionalTest 
Feature: ECommerce Application

@SmokeTest @RegressionTest 
Scenario: Successful Login 
Given This is a blank test for Successful Login

@RegressionTest 
Scenario: UnSuccessful Login 
Given This is a blank test for Unsuccessful Login

@SmokeTest 
Scenario: Add a product to bag 
Given This is a blank test for Add Product to Bag

Scenario: Add multiple products to bag 
Given This is a blank test for Add Multiple Products to Bag

@SmokeTest @RegressionTest 
Scenario: Remove a product from bag 
Given This is a blank test for Remove Product from Bag

@RegressionTest 
Scenario: Remove all products from bag 
Given This is a blank test for Remove All Products from Bag

@SmokeTest 
Scenario: Increase product quantity from bag page 
Given This is a blank test for Increase Product Quantity

Scenario: Decrease product quantity from bag page 
Given This is a blank test for Decrease Product Quantity

@SmokeTest @End2End 
Scenario: Buy a product with cash payment 
Given This is a blank test for Buy a Product with Cash Payment

@SmokeTest @End2End 
Scenario: Buy a product with CC payment 
Given This is a blank test for Buy a Product with CC Payment

@End2End 
Scenario Outline: Payment declined 
Given This is a blank test for Payment Declined with {string}

Examples: 
| Payment Method | 
| CC Card | 
| DD Card | 
| Bank Transfer | 
| PayPal | 
| Cash |
