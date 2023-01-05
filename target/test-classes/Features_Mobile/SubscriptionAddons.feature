
Feature: Add more items to an existing subscription in mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVCA_Subscriptions_AddOns_01_TC001
  #Objectives: Objectives: Verify the User is able to add more items to an existing subscription.
  #Author:N.Harsha Kumar
  #Date: 17/11/2021
  @addons
  Scenario Outline: GVCA_Subscriptions_AddOns_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then click on Add or modify and add more flavors "<flavors>" and submit update
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                    | pwd      | flavor       | flavors                              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | annil.ramroop@bat.com | TEST1234 | Passionfruit | Blueberry,Cool Peppermint,Watermelon | 5555555555554444 |               1124 |         190 | eryn  emard      |
