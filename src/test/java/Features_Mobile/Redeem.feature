@REDEEM
Feature: Verifying engraving and device flow

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - VYPE_4072_REDEEM_Points as a DISCOUNT_Validation_Mobile
  #Description - The purpose of this test case is to Verify the user is able to redeem the earned points as
  #discount to make a purchase
  #- User should be able to redeem Minimum worth of $5 i.e, 1000 points.
  #Developed By - Manasa
  #Date - July 05,2022
  #Updated By - Bhavitha - Dec 12th, 2022
  @VYPE_4072_REDEEM_PointsDISCOUNT_Validation_Mobile
  Scenario Outline: VYPE_4072_REDEEM_PointsasaDISCOUNT_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    When User clicks on hamberger menu and clicks on Shop
    Then User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page
    When Redeem the points to get discount "<Points>"
    Then Verify the cart page is updated with the redeemed points
    Then Hower on cart icon and click on view cart
    When click on checkout
    And Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase Details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    When Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    Then User click on hamberger menu and clicks on My Rewards
    Then Scroll down to your History and Verify Reward Redemption points are dedected
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      | flavor | count | Points | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |delivery|
      | bhavitha.nune@bat.com | TEST1234 | Mango  |     1 |   1000 | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |Fedex|

  #-------------------------------------------------------------------------------------------
  #Test Case - VYPE_4072_REDEEM_Points as a DISCOUNT_TC002
  #Description - Description: The purpose of this test case is
  #							-  To Verify that Only shipping charges are applicable, if the user Redeem all the points hence making the Order for free
  #							- User should be able to redeem Maximum of 250$ i.e, 50,000 points
  #Developed By - Chandini
  #Date - July 04 , 2022
  @VYPE_4072_REDEEM_PointsAsADISCOUNT_TC002
  Scenario Outline: VYPE_4072_REDEEM_Points as a DISCOUNT_Mobile_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    When Click on Promotion Dropdown in Cart summary page
    And verify the vuse reward points
    When Verify the worning message desplayed when redeem is grater than fifty thousand points"<GraterPoints>"
    And Redeem  points"<Points>"
    Then Verify the Cart page is updated with the  redeemed point
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then Scroll down to your History and Verify Reward Redemption points are dedected

    Examples: 
      | UN                    | pwd      | flavor | count | Points | GraterPoints | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | curtis.brooks@bat.com | TEST1234 | Mango  |    25 |  50000 |        51000 | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
