@QAbatch01
Feature:  GVCA_ePod_Pods_OneTimePurchase_BusinessWorkflows_TC002
  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_ePod_Pods_OneTimePurchase_BusinessWorkflows_TC002
  #Description - The purpose of this test case is used to VUSE user must be able to submit and accomplish ePod pods One-Time purchase from the product's detail page. 
  #Developed By - Harika
  #Date - Novomber 12,2021
  
  @OneTimePurchase
  Scenario Outline: GVCA_ePod_Pods_OneTimePurchase_BusinessWorkflows_TC002 
    Given user login with valid email address "<UN>" and password "<pwd>"
    When User navigates to ePod pods page 
    Then  Verify product added is displayed in the page
    Then navigate to Cart and verify the items in Cart 
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
      Examples: 
      | UN                    | pwd      |UserCardNumber  |UserCardExpiryDate|UserCardCVV|UserCardFullName|
      |johnholland@bat.com    | TEST1234 |5555555555554444|1024              |190        |CANADA VYPE USER| 
 