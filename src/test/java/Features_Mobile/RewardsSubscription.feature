
Feature: Verifying new Subscription points in Rewards Page

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case   - VYPE_4043_Pod Subscription_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify bonus points are added in the Rewards tab for New Subscription Order.
  #Author      - Shaik
  #Date        - July 04,2022
  @NewSubscription
  Scenario Outline: VYPE_4043_Pod Subscription_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the current points of the user in Rewards page
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then Verify the cart summary and Subscription discount is applied in the Cart Summary Page
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the Current Points are updated in the Rewards page
    And Verify first subscription order user will receive '2000' points for one time per user

    Examples: 
      | UN                    | pwd      | flavor | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | annil.ramroop@bat.com | TEST1234 | Mango  | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |
