Feature: Subscription Mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - VUSE_Subscription_Add_new_subscription_and_Modify_the_order_in_Subscription_page_Mobile
  #Description - The purpose of this test case is to validate the scenario when user adds a subscription and then Modify the order in Subscription Page
  #Developed By - Honey Hari
  #Date - August 11,2022
  #Pre-condition - User should not have subscription.
  @ModifySubscription
  Scenario Outline: VUSE_Subscription_Add_new_subscription_and_Modify_the_order_in_Subscription_page_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>"
    When Add quantity"<quantity>" click on Subscribe and Save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    When User clicks on Hamburger menu then Logout link
    When User close the login modal
    Then User should be Logged out
    And user clicks on hamberger menu and click on login or register
    When User again enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the Cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account link
    When User clicks on Continue Modification link
    Then Draft order should be displayed
    When User click on remove link to remove the newly added product
    And User adds another Flavor "<flavor_nicfree>" using filter by option
    And User clicks on Submit Updates link
    And verify Subscription is modified with the newly added product
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor | flavor_nicfree | quantity | flavor_Additional | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Mango  | Crisp Mix      |        5 | Mango             | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_new_subscription_and_Discard_in_Subscription_page_Mobile
  #Description - The purpose of this test case is To validate the scenario when a user is already having a subscription and tries to add a new subscription to cart and discard the newly added subscription
  #Developed By - Honey Hari
  #Date - August 11,2022
  #Pre-condition - User should not have subscription.
  @DiscardSubscription
  Scenario Outline: VUSE_Subscription_Add_new_subscription_and_Discard_in_Subscription_page_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    When User clicks on Hamburger menu then Logout link
    When User close the login modal
    Then User should be Logged out
    And user clicks on hamberger menu and click on login or register
    When User again enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And User Confirms if user has active subscription
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account link
    And Draft Subscription Order should be discarded upon clicking on Discard link
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor | quantity | flavor_Additional | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Mango  |        5 | Watermelon        | 5555 5555 5555 4444 |               1023 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_subscription_Productin_PreLoginPage_Mobile
  #Description - The purpose of this test case is To validate the scenario where user is already having an active subscription and tries to add another product to subscription in Pre Login Page.
  #Developed By - Honey Hari
  #Date - August 12,2022
  #Pre-condition - User should not have subscription.
  @AddSubscriptionPrelogin123
  Scenario Outline: VUSE_Subscription_Add_subscription_Productin_PreLoginPage_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    When User clicks on Hamburger menu then Logout link
    When User close the login modal
    Then User should be Logged out
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    Then User is prompted to Login to the application
    When User again enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then click on checkout
    And Draft Subscription Order should be displayed upon clicking on Go to Account link
    And Draft Subscription Order should be submitted upon clicking on Submit Update link
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor | quantity | flavor_Additional | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |bhavitha.nune@bat.com| TEST1234 | Mango  |        5 | Watermelon        | 5555 5555 5555 4444 |               1023 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_new_subscription_and_One_Time_Purchase_to_cart_for_existing_subscription_user_E2EFlow_Mobile
  #Description - The purpose of this test case is To validate the scenario when a user is already having a subscription and tries to add a new subscription & One Time Purchase to cart
  #Developed By - Honey Hari
  #Date - August 12,2022
  #Pre-condition - User should not have subscription.
  @AddSubscriptionandOneTimePurchase123
  Scenario Outline: VUSE_Subscription_Add_new_subscription_and_One_Time_Purchase_to_cart_for_existing_subscription_user_E2EFlow_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    When User clicks on Hamburger menu then Logout link
    When User again enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And User Confirms if user has active subscription
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User add product "<flavor_Onetime>" to cart for one time purchase
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User select additional product "<flavor_Sub>" for subscription and add to the cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account link
    And Draft Subscription Order should be submitted upon clicking on Submit Update link
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor | quantity | flavor_Additional | flavor_Sub | flavor_Onetime | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |bhavitha.nune@bat.com| TEST1234 | Mango  |        5 | Watermelon        | Mango      | Mango          | 5555 5555 5555 4444 |               1023 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_new_subscription_tocart_for_existing_subscription_Mobile
  #Description - To validate the scenario when a user is already having a subscription and tries to add a new subscription to cart
  #Developed By -Honey Hari
  #Date - August 24,2022
  #Pre-condition - User should not have subscription.
  @AddSubscriptionwithExistingSub123
  Scenario Outline: VUSE_Subscription_Add_new_subscription_tocart_for_existing_subscription_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    When User clicks on Hamburger menu then Logout link
    When User close the login modal
    Then User should be Logged out
    And user clicks on hamberger menu and click on login or register
    When User again enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And User Confirms if user has active subscription
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User select additional product "<flavor_Sub>" for subscription and add to the cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account link
    And Draft Subscription Order should be submitted upon clicking on Submit Update link
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor | quantity | flavor_Sub | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |bhavitha.nune@bat.com| TEST1234 | Mango  |        5 | Watermelon | 5555 5555 5555 4444 |               1023 |         190 | CANADA VYPE USER |
