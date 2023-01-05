Feature: VYPE_4401_NewDimensionCollection_TC001

  Background: 
    Given User is on pre-login page in mobile
   When User clicks on hamburger menu and Verify Login/Register link

  
  #Test Case: VYPE_4401_New Dimension Collection_E2EValidationMobile
  #Description:The purpose of this testcase is to verify the E2E flow for New Dimension Collection
  #Author:Anisha Nandagavali
  #Date:24/08/2022
  #Updated By: Harris
  #Updated Date:15-12-2022
  #Updated Line:24 to 26
  @NewDimensionCollection_Mobile
  Scenario Outline: VYPE_4401_New Dimension Collection_E2EValidationMobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When Click on ePod2 tab and verify ePod2 device tiles are displayed
    And Click on New Dimension collection
    Then Verify New Dimension Collection page is displayed with relevant content
    When User select on any of the "<Device>" and verify the product detail page
    And User click on Exit
    Then Verify user navigated to ePod Devices page
    When Click on ePod2 tab and verify ePod2 device tiles are displayed
    And Click on New Dimension collection
    Then Verify New Dimension Collection page is displayed with relevant content
    When User select on any of the "<Device>" and verify the page
    And Click on add to cart then verify the mini cart is updated and added to cart is displayed
    And Hower on cart icon and click on view cart
    And Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
     When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    

    Examples: 
      | UN               | pwd      | Device      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Matypots@bat.com | TEST1234 | Orange Rise | Fedex    | 5555555555554444 |               1024 |         190 | Mallary stokes   |
