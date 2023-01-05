Feature: Subscription Billing

  Background: 
    Given User is on pre-login page

  #Description - Verify the Billing process for Subscription.
  #Developed By - Bhavitha
  #Date - November 12,2021
  #Test Case - GVCA_SubscriptionBilling_01_TC001
  @SubscriptionBilling
  Scenario Outline: GVCA_SubscriptionBilling_01_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    And Navigate to cart page
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Creating subscription
    When navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page
    When user Howers on profile icon and navigates to subscription in MyAccount page
    Then Verify Subscription page and Cancle the order

    Examples: 
      | UN                      | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nilan@bat.com | TEST1234 | Mango  | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
