Feature: Subscription Billing

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Description - Verify the Billing process for Subscription.
  #Developed By - Honey Hari
  #Date - August 10, 2022
  #Test Case - GVCA_SubscriptionBilling_01_TC001_Mobile
  #Pre-condition - User should not have subscription.
  @SubscriptionBillingMobile
  Scenario Outline: GVCA_SubscriptionBilling_01_TC001_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then creating subscription
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And click on hamberger menu and click on My Subscription
    And verify subscription confirmation page
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                  | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nilan@bat.com | TEST1234 | Mango  |     2 | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
