Feature: Tool Tips

  Background: 
    Given User is on pre-login page

  #Test Case: GVCA_Tooltips_05_TC001
  #Objective: The Purpose of this test case is to verify the Tool tips and messages in a new custom Checkout
  #Author: Divya Kumari
  #Date: 30th Sep 21
  @Tooltips
  Scenario Outline: GVCA_Tooltips_05_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    And user navigates to ePod pods page
    And choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    And Add quantity for onetime purchase and click on add to cart
    And navigate to Cart and verify the items in Cart
    And user hover the account and verify the links present
    And user hover the cart icon and click on view cart from the mini cart
    Then user navigates to checkout page to verify tooltips present there
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
   Then verify order confirmation page

    Examples: 
      | UN                   | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | ashley.ledo@bat.com | TEST1234 | Clear  | 5555555555554444 |               1026 |         190 | CANADA VYPE USER |
