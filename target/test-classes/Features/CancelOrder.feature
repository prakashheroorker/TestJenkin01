Feature: Cancelling the Order

  Background: 
    Given User is on pre-login page

  #Test Case -  VYPE_4392_CancelOrder_TC001
  #Description -  The purpose of this test case is to verify the points in the history are deducted after cancelling the Order
  #Developed By - Harsha Kumar
  #Date - 23rd June,2022
  @cancelOrder
  Scenario Outline: VYPE_4392_CancelOrder_TC001
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to Rewards page
    Then verify the status of the tier of the user
    When User navigates to ePod pods page
    And User selects required flavor "<flavor>" with required quantity "<quantity>" add to the cart
    And navigate to Cart and verify the items in Cart
    And click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page
    Then Verify blue banner in order confirmation page
    And navigate to orders page and cancel the order that is placed
    When User navigates to Rewards page
    Then Verify points history and current points in Rewards page

    Examples: 
      | username           | password | flavor | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | honey.h017@bat.com | TEST1234 | Mango  |        3 | 4111111111111111 |               1024 |         190 | CANADA VYPE USER |
