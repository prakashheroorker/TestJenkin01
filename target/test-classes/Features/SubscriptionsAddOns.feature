Feature: Subscriptions AddOns

  Background: 
    Given User is on pre-login page

  #Description - The purpose of the test case is to verify the User is able to add more products to an existing subscription
  #Developed By - Bhavitha
  #Date - November 25,2021
  #Test Case - GVCA_Subscriptions_AddOns_E2E_Validation
  @GVCA_Subscriptions_AddOns_01_TC001
  Scenario Outline: GVCA_Subscriptions_AddOns_E2E_Validation
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
    When Click on Add or modify button
    Then Verify PICK YOUR PODS page displays.
    When Choose flavors "<flavors>" by clicking on the Add button for any desired flavors and verify selected flavour pop up opens and Flavour name,Nicotine strength,Quantity with "<count>",Add button 
    Then Verify order summary and click on submit update
    And verify subscription update message
    When Cancel the subscription
    Then verify existing payment method and delete the payment method
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    Examples: 
      | UN              | pwd      | flavor | quantity|delivery  |UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavors                            | count|
      | stokes@bat.com  | TEST1234 | Vanilla  | 5       | Fedex    |5555555555554444 |               0923 |         123 | jamie kulas    | Blood Orange,Lemon Berry,Smooth Mint| 2     |
