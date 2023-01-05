@QAbatch01
Feature: To verify Create a subscription from Pods

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_CreateSubscription_Validation_01
  #Description -   The purpose of this test case is to verify the E2E order placement by adding one time purchase and
  #subscription for pods
  #User should not have active subscription
  #Developed By - Harsha Kumar
  #Date - September 15,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_01_TC001 in cancelsubscription.feature
  #Updated By - Bhavitha - Dec 13th, 2022
  #updated lines - 24 to 48
  @CreateSubscription01
  Scenario Outline: GVCA_CreateSubscription_Validation_01
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    When Click on subscribe and save and add quantity and click on add to cart
    And Navigate to Cart and verify the items in Cart
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    When Add required quantity "<quantity>" and click on add to cart
    Then Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and One time Purchase details and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery1>" option for one time purchase and "<delivery2>" and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Howers on profile icon and navigates to subscription in MyAccount page
    Then Verify subscription confirmation page and verify subscription details
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                       | pwd      | flavor  | quantity |delivery1 | delivery2               | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | matthew.pickford@bat.com | TEST1234 | Vanilla |        2 |  Fedex     | Canada Post (Standard)     | 5555555555554444 |               0723 |         123 | mark jacob       |

  #Test Case - GVCA_CancelSubscription_Validation_01
  #Description - The Purpose of this test case is To verify Cancel  subscription.
  #Developed By - Harsha Kumar
  #Date - September 20,2021
  ##* if you want to execute kindly execute GVCA_CreateSubscription_01_TC001 in CreateSubscription.feature
  #Updated By - Bhavitha - Dec 13th, 2022
  #updated lines - 67 TO 74
  @CreateSubscription01 @GVCA_CancelSubscription_Validation_01
  Scenario Outline: GVCA_CancelSubscription_Validation_01
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Howers on profile icon and navigates to subscription in MyAccount page
    Then Verify subscription confirmation page and verify subscription details
    When Cancel the subscription
    Then Verify subscription is canceled
    When Navigate to profile and Delete card present in profile page
    Then Verify Saved card is deleted
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                       | pwd      |
      | matthew.pickford@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CreateSubscription_Validation_02
  #Description -  The purpose of this test case is to Create E2E Order placement by adding subscription from
  		#Subscription Landing Page and one time purchage from epods page
  		#User should not have active subscription
  #Developed By - Harsha Kumar
  #Date - September 15,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_02_TC001 in cancelsubscription.feature
  #Updated By - Bhavitha - Dec 14th, 2022
  #updated lines - 99 TO 107
  @CreateSubscription02
  Scenario Outline: GVCA_CreateSubscription_Validation_02
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on Subscribe and Save
    And Click on Subscribe now button from subscription landing page
    Then Verify ePod Vape Pod Subscription page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<Squantity>" and click on Subscribe and save
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Scroll to choose Flavour "<flavor>" and click on flavor image
    Then Verify respective flavor PDP is opened
    And Add required quantity "<quantity>" and click on add to cart
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details and subscription details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery page and One time Purchase details and subscription details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery1>" option for one time purchase and "<delivery2>" and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    And Verify order confirmation page
    When Howers on profile icon and navigates to subscription in MyAccount page
    And Verify subscription confirmation page and verify subscription details
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    Examples: 
      | UN               | pwd      | flavor | Squantity | quantity | delivery1 | delivery2              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Matypots@bat.com | TEST1234 | Clear  |         5 |        2 | Fedex     | Canada Post (Standard) | 5555555555554444 |               0728 |         123 | elliot corkery   |

  #----------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CancelSubscription_Validation_02
  #Description - The purpose of this test case is to verify  pause  subscription functionality
  	#User should have an active subscription
  #Developed By - Harsha Kumar
  #Date - September 20,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_02_TC001 in CreateSubscription.feature
  #Updated By - Bhavitha - Dec 14th, 2022
  #updated lines - 143 TO 146
  @CreateSubscription02 @CancelSubscription_02
  Scenario Outline: GVCA_CancelSubscription_Validation_02
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Howers on profile icon and navigates to subscription in MyAccount page
    Then Verify Active subscription and pause the subscription
    And Resume the paused subscription
    Then Cancel the subscription
    And Navigate to profile and Delete card present in profile page
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      |
      | Matypots@bat.com | TEST1234 |
