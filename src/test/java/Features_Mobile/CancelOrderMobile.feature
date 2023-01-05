@vuse
Feature: Cancelling the Order

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case -  VYPE_4392_CancelOrder_TC001
  #Description -  The purpose of this test case is to verify the points in the history are deducted after cancelling the Order
  #Developed By - Harsha Kumar
  #Date - 1st July,2022
  @cancelOrder
  Scenario Outline: VYPE_4392_CancelOrder_TC001
    When User enters valid email address "<username>" and password "<password>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the status of the tier for the user
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then Verify blue banner in Order confirmation page
    Then user clicks on hamberger menu and clicks on My orders and cancel the order
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify points history and current points in Rewards page

    Examples: 
      | username              | password | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Mango  |     3 | 4111111111111111 |               1024 |         190 | charlie          |
