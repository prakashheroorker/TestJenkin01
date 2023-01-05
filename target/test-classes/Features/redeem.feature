@REDEEM_PointsNew
Feature: REDEEM_Points as a DISCOUNT

  Background: 
    Given User is on pre-login page

  #Test Case - VYPE_4072_REDEEM_Points as a DISCOUNT_Validation
  #Description - The purpose of this test case is to Verify the user is able to redeem the earned points as discount to
  #make a purchase - User should be able to redeem Minimum worth of $5 i.e, 1000 points.
  #Developed By - Bhavitha
  #Date - June 27, 2022
  #Updated By - Bhavitha - Dec 12th, 2022
  #updated lines - 26 to 27
  @VYPE_4072_REDEEM_PointsasaDISCOUNT_Validation
  Scenario Outline: VYPE_4072_REDEEM_PointsasaDISCOUNT_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When Click on view cart button
    Then Verify the cart page
    When Redeem the points to get discount"<Points>"
    Then Verify the Cart page is updated with the redeemed points
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify points got redeemed
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | flavor       | quantity | Points | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | honey.h017@bat.com | TEST1234 | Clear |        1 |   1000         | Fedex    | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #Test Case - VYPE_4072_REDEEM_Max_Points as a Discount_Validation
  #Description - The purpose of this test case is
  #				- To Verify that Only shipping charges are applicable, if the user Redeem all the points hence making the
  # Order for free
  #				- User should be able to redeem maximum of the points he has
  #Precondition - User should have minimum 10000 points in the Rewards Tab
  #Developed By - Bhavitha
  #Date - June 27, 2022
  #Updated By - Bhavitha - Dec 12th, 2022
  #updated lines - 66 TO 73
  @VYPE_4072_REDEEM_Max_PointsDiscount_Validation
  Scenario Outline: VYPE_4072_REDEEM_Max_PointsasaDiscount_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When Click on view cart button
    Then Verify the cart page
    When Redeem the "<GraterPoints>"
    Then Verify the warning message for grater points
    When Redeem the points upto max points to get discount"<Points>"
    Then Verify the Cart page is updated with the Max redeemed points
    When Click on Checkout button
    Then Verify Congratulations pop up will get and close it
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify points got redeemed
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | flavor       | quantity | Points | GraterPoints | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | titus.pouros@bat.com | TEST1234 | Clear |        5 |  10998 |        10999 | Fedex    | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
