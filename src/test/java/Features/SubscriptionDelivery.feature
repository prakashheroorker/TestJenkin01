Feature: Subscription Delivery

  Background: 
    Given User is on pre-login page

  #Description - Verify the Delivery process for Subscription
  #Developed By - Bhavitha
  #Date - November 18,2021
  #Test Case - GVCA_SubscriptionBilling&Delivery_Validation
  @SubscriptionDelivery
  Scenario Outline: GVCA_SubscriptionBilling&Delivery_Validation
    Given User enters email "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    Then Navigate to cart page
    And Verify subscription is added to cart
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    Then Navigate to cart page
    And Verify subscription is added to cart
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    Then Navigate to cart page
    When navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page details

    Examples: 
      | UN                      | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |sahar.nilan@bat.com        |TEST1234 | Mango  | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
