@SubscriptionProducts
Feature: Subscription flows in mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVCA_SubscriptionProducts_01_TC001
  #Objectives:Add one time purchase and subscription
  #Author:N.Harsha Kumar
  #Date: 21/01/2021
  @products01
  Scenario Outline: GVCA_SubscriptionProducts_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    And user scrolls to subscribe now and clicks on subscribe now and verify ePod Vape Pod Subscription page
    Then user verifies pods page and selects flavor "<flavor1>"
    Then add quantity click on Subscribe and save and click on subscribe and save
    Then Hower on cart icon and click on view cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And click on hamberger menu and click on My Subscription
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    Then Cancel subscription
    And delete card present in My Account page
    Examples: 
      | UN                     | pwd      | flavor1 | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Clear   | Mango  |     3 | 4444333322221111 |               1124 |         190 | mallory stokes   |

  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionProducts_02_TC001
  #Description - Modify a subscription.
  #Author:N.Harsha Kumar
  #Date: 21/01/2021
  @SubscriptionProducts_02
  Scenario Outline: GVCA_SubscriptionProducts_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    And user scrolls to subscribe now and clicks on subscribe now and verify ePod Vape Pod Subscription page
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and click on subscribe and save
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then User clicks on hamberger menu and click on logout
    Then clear cache and launch application
    And user clicks on hamberger menu and click on login or register
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And click on hamberger menu and click on My Subscription
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    And click on edit details and verify details and click on cancel
    And click on add or modify items and verifify pick your pods page
    And click on Submit updates and verify subscription is updated message

    Then Cancel subscription
    And delete card present in My Account page
    Examples: 
      | UN                  | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sarah.nilan@bat.com | TEST1234 | Mango  | 4444333322221111 |               1124 |         190 | Keon auor        |
