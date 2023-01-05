Feature: This Test is to validate the ePod2 Skins Screen page

  Background: 
    Given User is on pre-login page in mobile

  #Test Case - ePod2_Skins_CoreCollection_E2E_and_UI_Validation_Mobile
  #Description - The purpose of this test case is to validate the UI of the Skins main page and the E2E order placement for epod2 core collection skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - DEC 01,2022
  #Updated_line -16,17,18,19,20,21
  @ePod2_Skins_CoreCollection
  Scenario Outline: ePod2_Skins_CoreCollection_E2E_and_UI_Validation_Mobile
  
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    When Click on Core collection dropdown then verify it is expanded
    And Click on Collection x  dropdown then verify it is expanded
    And Click on Epod2 core collections then Verify the epod2 core collection skin options are displayed
    When User select any core collection "<Skin>" and click on buy now and verify it added to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
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
      | UN                      | pwd      | Skin  | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | gillian.johnson@bat.com | TEST1234 | amber | Fedex    | 5555555555554444 |               0923 |         123 | mallory Stokes   |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2_Skins_CollectionX_E2E_Mobile
  #Description -  The purpose of this test case is to validate the E2E order placement for epod2  collection X skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - DEC 01,2022
  #Updated_line -43,44,50,51
  @ePod2_Skins_CollectionX
  Scenario Outline: ePod2_Skins_CollectionX_E2E_Mobile
  
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    And Click on Core collection dropdown then verify it is expanded
    And Click on Collection x  dropdown then verify it is expanded
    And Click on Epod2 Collections X then Verify the epod2 Collection X skin options are displayed
    When User select any Collection X "<Skin>" and click on buy now and verify it added to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
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
      | UN               | pwd      | Skin     |delivery| UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | twilight | Fedex|5555555555554444 |               0927 |         123 | cecelia koch     |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2+_Skins_CoreCollection_E2E_Mobile
  #Description - The purpose of this test case is to validate the E2E order placement for epod2+ core collection skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - DEC 01,2022
  #Updated_line -69,70,77,78
  @ePod2+_Skins_CoreCollection
  Scenario Outline: ePod2+_Skins_CoreCollection_E2E_Mobile
  
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    And Click on Core collection dropdown then verify it is expanded
    And Click on Collection x  dropdown then verify it is expanded
    And Click on Epod2 plus Core collections then Verify the epod2 plus Core collection skin options are displayed
    When User select any Epod2 pluscore Collection "<Skin>" and click on buy now and verify it added to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
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
      | UN               | pwd      | Skin  | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | amber | 5555555555554444 |               0923 |         123 | cecelia koch     |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2+_Skins_CollectionX_E2E_Mobile
  #Description - The purpose of this test case is to validate the E2E order placement for epod2+ collection X skin.
  #Author - vidya.a
  #Updated Date - DEC 01,2022
  #Updated_line -94,95,102,103
  @ePod2+_Skins_CollectionX
  Scenario Outline: ePod2+_Skins_CollectionX_E2E_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    And Click on Core collection dropdown then verify it is expanded
    And Click on Collection x  dropdown then verify it is expanded
    And Click on Epod2 plus Collections X then Verify the epod2 plus Collection X skin options are displayed
    When User select any Epod2 plus Collection X "<Skin>" and click on buy now and verify it added to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
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
      | UN               | pwd      | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Titanium | Fedex    | 5555555555554444 |               0923 |         123 | cecelia koch     |
