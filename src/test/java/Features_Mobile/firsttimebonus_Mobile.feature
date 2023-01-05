# TestCase Name :VYPE_4418_FirstPuchase_Bonus Points_Mobile_TC001
# Description : To Verify that the First Purchase Bonus Points are added to the Your History section of the Rewards Tab.
# Developed by : Honey Hari
# Date : 01/07/2022
Feature: To verify First Purchase Bonus Points are added to the Your History section

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  @firsttimebonus
  Scenario Outline: VYPE_4418_FirstPuchase_Bonus Points_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When user navigate to my rewards section
    Then scroll down to history section
    And verify the points for newuser
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify awarded points in blue banner
    When user navigate to my rewards section
    Then Verify My Rewards page for updated current points
    Then scroll down to history section
    And verify the points for first time purchase

    Examples: 
      Examples:

      | UN                 | pwd      | flavor       | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | LitQxwfe@bat.com | TEST1234 | Passionfruit |     1 | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |
