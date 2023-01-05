@CreateSubscription
Feature: To verify Create a subscription from Pods

  Background: 
    Given User is on pre-login page in mobile

  #Test Case - GVCA_Create Subscription _Validation_01_Mobile
  #Description - The purpose of this test case is to verify the E2E order placement by adding one time purchase and
  #subscription for pods
  #User should not have active subscription
  #Developed By - Mohammed Shouiab
  #Date - August 12th 2022
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_01_TC001 in cancelsubscription.feature
  #Updated By - Bhavitha - Dec 15th, 2022
  #Line Number updated
  @CreateSub_CancelSub01 @GVCA_CreateSubscription_Validation_01_Mobile
  Scenario Outline: GVCA_Create Subscription _Validation_01_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>"
    When add quantity click on Subscribe and Save and add to cart
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>"
    When Click on one time purchase add quantity "<count>" and add to cart
    And Navigate to cart page and verify the cart page
    And Click on checkout
    Then Verify shipping page and One time Purchase details and subscription details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery page and One Time Purchase details and subscription details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery1>" option for One Time Purchase and "<delivery2>" and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase Details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When Click on hamberger menu and click on My Subscription
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and Verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      | count | flavor  | delivery1 | delivery2              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 |     1 | Vanilla | Fedex     | Canada Post (Standard) | 5555555555554444 |               0826 |         197 | Mark jacob       |


 #Test Case : GVCA_CancelSubscription_01_TC001
  #Objectives: Objectives: The Purpose of this test case is To verify Cancel  subscription.
  #Author:Mohammed Shouiab
  ##* if you want to execute Cancel Subscription kindly First execute GVCA_Create Subscription_01_TC001 in cancelsubscription.feature
  #Date: 12/08/2022
  @CancelSub_01s @CreateSub_CancelSub01
  Scenario Outline: GVCA_CancelSubscription_01_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And Click on hamberger menu and click on My Subscription
    Then Verify Subscription page
    When Cancel subscription
    Then Verify that there is no subscription
    And Delete card present in Profile
    When User clicks on hamburger menu and verify logout link is displayed
    Then Click on logout link and Verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      |
      | bhavitha.nune@bat.com | TEST1234 |
  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CreateSubscription_Validation_02_Mobile
  #Description - The Purpose of this test case is to verify Create a subscription from pods.
  #User should not have active subscription
  #Developed By - Mohammed Shouiab
  #Date - August 12th 2022
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_02_TC001 in cancelsubscription.feature
  #Updated By - Bhavitha - Dec 15th, 2022
  #Update line number
  @CreateSub_CancelSub02 @GVCA_CreateSubscription_Validation_02_Mobile
  Scenario Outline: GVCA_CreateSubscription_Validation_02_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>"
    When Add quantity"<quantity>" click on Subscribe and Save and add to cart
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>"
    When Click on one time purchase add quantity "<count>" and add to cart
    And Navigate to cart page and verify the cart page
    And Click on checkout
    Then Verify shipping page and One time Purchase details and subscription details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery page and One Time Purchase details and subscription details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery1>" option for One Time Purchase and "<delivery2>" and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase Details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    When Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When Click on hamberger menu and click on My Subscription
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and Verify the prelogin page is displayed

    Examples: 
      | UN                   | pwd      | quantity | count | flavor    | delivery1 | delivery2              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | titus.pouros@bat.com | TEST1234 |        6 |     1 | Cucumber | Fedex     | Canada Post (Standard) | 5555555555554444 |               0826 |         197 | Mark jacob       |

     

  #----------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CancelSubscription_Validation_02_Mobile
  #Description - The Purpose of this test case is To verify pause  subscription.
  #Developed By - Mohammed Shouiab
  ##* if you want to execute Cancel Subscription kindly First execute GVCA_Create Subscription_02_TC001 in cancelsubscription.feature
  #Date - 12/08/2022
  @CancelSub_02s @CreateSub_CancelSub02
  Scenario Outline: GVCA_CancelSubscription_Validation_02_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And Click on hamberger menu and click on My Subscription
    Then verify active subscription and pause the subscription
    And resume the paused subscription
    When Cancel subscription
    Then Verify that there is no subscription
    And Delete card present in Profile
    When User clicks on hamburger menu and verify logout link is displayed
    Then Click on logout link and Verify the prelogin page is displayed

    Examples: 
      | UN                           | pwd      |
      | titus.pouros@bat.com | TEST1234 |