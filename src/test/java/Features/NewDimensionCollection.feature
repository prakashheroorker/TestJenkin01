Feature: VYPE_4401_NewDimensionCollection_TC001

  Background: 
    Given User is on pre-login page

  #Test Case: VYPE_4401_New Dimension Collection_ValidationE2E 
  #Description:Description: The Purpose of Test Case
  #- To verify E2E Order Placement flow of the New Dimension Collection in the Epod Page
  #Author:Anisha
  #Date:
  #Updated By: Harris
  #Updated Date:13-12-2022
  #Updated Line:23 to 25
  @NewDimensionCollection
  Scenario Outline: VYPE_4401_New Dimension Collection_ValidationE2E 
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page and verify relevant content
    When Click on ePod2 button and verify ePod2 device tiles are displayed
    And Click on New Dimension Collection 
    Then Verify New dimension Collection page is displayed with relevant content
    When User Select on any of the "<Device>" and verify the product detail page
    And Click on add to cart then Verify the mini cart is updated and added to cart is displayed
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | Device      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Matypots@bat.com | TEST1234 | Orange Rise | Fedex    | 5555555555554444 |               1024 |         190 | Mallary stokes   |
