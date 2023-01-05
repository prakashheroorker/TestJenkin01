@newfunctionalitysuite
Feature: Subscription

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_Add_New_Subscription_And_Modify_Subscription
  #Description - The purpose of this testcase is to verify when user adds a subscription and then Modify the order in Subscription Page
  #Developed By - Vinod Markandan
  #Updated By - Harsha Kumar
  #Date - December 20,2022
  #Pre condition - Take user which doesn't have subscription
  @ModifySubscription 
  Scenario Outline: GVCA_Add_New_Subscription_And_Modify_Subscription
  #---------------Creating a new subscription-------------------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on Subscribe and save
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and subscription details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total
    When Hover on Account icon and Click on Logout option
    #---------------Modifying the above created subscription-------------------------
    And User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When User scrolls down to choose desired flavors "<flavors>" with required quantity "<quantity1>" and Add as Subscription
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify Looks like you already have an active Subscription Pop up displays
    When Click on on Go to Account button
    Then Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription
    When User clicks on Continue Modification button
    Then Draft Order page should be displayed
    When User clicks on remove link to remove the newly added products
    And Click on filter by button
    Then Verify all available flavors list should be displayed
    When Choose flavors "<flavors1>" by clicking on the Add button for any desired flavors and verify selected flavour pop up opens and Flavour name,Nicotine strength,Quantity with "<count>",Add button 
    Then Verify order summary and click on submit update
    And verify subscription update message
    When Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 |pwd       | flavor      | quantity | flavors       | quantity1|delivery  |UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavors1    |count|
      | jack.daniel@bat.com| TEST1234 | Lemon Berry |        5 | Clear,Vanilla | 4        |Fedex     |5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |Blood Orange|2     |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Subscription_Add_New_Subscription_And_Discard
  #Description - The purpose of this test case is To validate the scenario when a user is already having a subscription and tries to add a new subscription to cart and discard the newly added subscription
  #Developed By - Vinod Markandan
  #Date - September 22,2021
  #Updated By - Harsha Kumar
  #Date - December 20,2022
  #Pre condition - Take user which doesn't have subscription
  @DiscardSubscription 
  Scenario Outline: GVCA_Subscription_Add_New_Subscription_And_Discard
   #---------------Creating a new subscription-------------------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
     When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on Subscribe and save
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and subscription details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total
    When Hover on Account icon and Click on Logout option
     #---------------Discarding the above created subscription-------------------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When User scrolls down to choose desired flavors "<flavors>" with required quantity "<quantity1>" and Add as Subscription
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify Looks like you already have an active Subscription Pop up displays
    When Click on on Go to Account button
    Then Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription
    When Click on Discard link
    Then Verify Discard Draft Subscription Order Pop Up displays
    When Click on No Return Discard Draft Subscription Order Pop Up is closed
    And Click on Discard link
    Then Verify Discard Draft Subscription Order Pop Up displays
    When Click on Yes, Discard button Draft subscription Order tile should be deleted and only Current Active subscription Tile should be present in the Subscription Page
    And Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    
   

    Examples: 
      | UN                   | pwd      | flavor     |quantity|delivery| flavors|quantity1|UserCardNumber      | UserCardExpiryDate   | UserCardCVV | UserCardFullName |
      |louisa.spencer@bat.com| TEST1234 |Lemon Berry |5       |Fedex   | Clear  | 2       |5555 5555 5555 4444 |               1023 |         190 | louisa spencer |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Add_New subscription_For_Existing_Subscription_User
  #Description - The purpose of this testcase to verify when a user is already having a subscription and tries to add a new subscription to cart
  #Developed By - Vinod Markandan
  #Date - September 22,2021
  #Updated By - Harsha Kumar
  #Date - December 20,2022
  #Pre condition - Take user which doesn't have subscription
  @AddSubscription
  Scenario Outline: GVCA_Add_New subscription_For_Existing_Subscription_User
  #---------------Creating a new subscription-------------------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
     When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on Subscribe and save
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and subscription details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total
    When Hover on Account icon and Click on Logout option
    #---------Submiting the newly added subscription products in subscription page-------
     And User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When User scrolls down to choose desired flavors "<flavors>" with required quantity "<quantity1>" and Add as Subscription
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify Looks like you already have an active Subscription Pop up displays
    When Click on on Go to Account button
    Then Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription
    When Click on Submit update button
    And verify subscription update message
    When Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      |UN                  | pwd      | flavor | quantity| flavors|quantity1|delivery             | UserCardNumber     | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jack.daniel@bat.com | TEST1234 | Mango  |        5| Clear  | 2       |Canada Post (Express)|5555 5555 5555 4444 |               0923 |         190 | jack.daniel      |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Add_Subscription_In_Pre_Login
  #Description - The purpose of this testcase when user is already having an active subscription and tries to add another product to subscription in Pre Login Page.
  #Developed By - Vinod Markandan
  #Date - September 23,2021
  #Updated By - Harsha Kumar
  #Date - December 20,2022
  #Pre condition - Take user which doesn't have subscription
  @AddSubscriptionPrelogin
  Scenario Outline: GVCA_Add_Subscription_In_Pre_Login
  #---------------Creating a new subscription-------------------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on Subscribe and save
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and subscription details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total
    When Hover on Account icon and Click on Logout option
    And User closes the login modal
    #---------------Adding  the subscription from prelogin page and logging in with same user-------------------------
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When User scrolls down to choose desired flavors "<flavors>" with required quantity "<quantity1>" and Add as Subscription
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then User is prompted to login to the application
    When user login with same email address "<username>" and password "<password>"
    And Click on Checkout button
    When Click on on Go to Account button
    Then Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription
    When Click on Submit update button
    And verify subscription update message
    When Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username        | password | flavor | quantity | flavors  |quantity1 |delivery| UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |Matypots@bat.com | TEST1234 | Mango  |        5 | Clear| 5         | Fedex  |5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Add_New_Subscription_OTP_For_Active_Subscription
  #Description - The purpose of this test case is To validate the scenario when a user is already having a subscription and tries to add a new subscription & One Time Purchase to cart
  #Developed By - Vinod Markandan
  #Date - September 24,2021
  #Updated By - Harsha Kumar
  #Date - December 20,2022
  #Pre condition - Take user which doesn't have subscription
  @AddSubscriptionandOneTimePurchase
  Scenario Outline: GVCA_Add_New_Subscription_OTP_For_Active_Subscription
  #----creating the subscription-----------------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on Subscribe and save
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and subscription details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify subscription confirmation page and subscription details like subscription date,subscribed items and subscription total
    When Hover on Account icon and Click on Logout option
    #----------------------Add both OTP and subscription to above subscribed user---------
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on add to cart
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When User scrolls down to choose desired flavors "<flavors>" with required quantity "<quantity1>" and Add as Subscription
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify Looks like you already have an active Subscription displays with proceed to Checkout and Go To Account buttons
    When Click on Proceed to Checkout
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My Subscription link
    Then Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription
    When Click on Submit update button
    And verify subscription update message
    When Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    
    

    Examples: 
      | UN                  | pwd | flavor | quantity | flavors    | quantity1 | delivery|UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Clear  |        5 | Mango      |5          | Fedex   |5555 5555 5555 4444 |               0823 |         190 | jack daniel      |
