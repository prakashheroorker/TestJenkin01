Feature: Electric Stripe Collection test case

  Background: 
    Given User is on pre-login page in mobile
   

  #Test Case: VYPE_4401_Electric_Stripe_Collection_mobile
  #Description: The purpose of this Test Case is to place the order for Electric Stripe Collection
  #Updated 16-18 lines by - Akhila
  #Date -Dec 14,2022 
  @Strip
  Scenario Outline: VYPE_4401_Electric_Stripe_Collection_mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on EpodVaping products and clicks on Allepod devices
    When Click on Electric Stripe Collection and select the"<Stripe>"
    Then Hower on cart icon and click on view cart
    When Click on checkout
    And Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    When Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      | Stripe    | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | delivery              |
      | gillian.johnson@bat.com | TEST1234 | Bolt Grey | 5555555555554444 |               1024 |         190 | Mallary stokes   | Canada Post (Express) |
