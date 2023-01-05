@newfunctionalitysuiteBDD
Feature: This Test is to validate the ePod2 Skins Screen page

  Background: 
    Given User is on pre-login page

  
  #Test Case - ePod2_Skins_CoreCollection_E2E_and_UI_Validation
  #Description - The purpose of this test case is to validate the UI of the Skins main page and the E2E order placement for epod2 core collection skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - Nov 30,2022
  #Updated_line -43,44,45,46,47,48
  
  @ePod2_Skins_CoreCollection
  Scenario Outline: ePod2_Skins_CoreCollection_E2E_and_UI_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on core collection dropdown then verify it is expanded
    And click on collection x  dropdown then verify it is expanded
    And click on Epod 2  core collections then Verify the epod2 core collection skin options are displayed
    When User select any Core collection "<Skin>" and click on buy now and verify it added to cart
    And Hover on cart and click on view cart
    Then Verify the cart page
    
    #Note: The below lines are commented due to the data issue(Core collection skins are not available)
    
    #When Click on Checkout button
    #Then Verify shipping page and One time Purchase details are dispalyed
    #When Click on Go TO Delivery button
    #Then Verify Delivery and One time Purchase details are dispalyed
    #And Verify all delivery options are dispalyed
    #When Select "<delivery>" option and Click on Go To Billing button
    #Then Verify Billing Page and One time Purchase details dispalyed
    #When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    #And Click on terms and conditions check box and verify submit order button is enabled
    #When Click on Submit Order button
    #Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    Examples: 
      | UN                    | pwd      | Skin  | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | annil.ramroop@bat.com | TEST1234 | amber | Fedex    | 5555555555554444 |               0928 |         123 | mallory Stokes   |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2_Skins_CollectionX_E2E
  #Description - The purpose of this test case is to validate the E2E order placement for epod2  collection X skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - Nov 30,2022
  #Updated_line -70,71,72,73,74,75
  @ePod2_Skins_CollectionX
  Scenario Outline: ePod2_Skins_CollectionX_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on core collection dropdown then verify it is expanded
    And click on collection x  dropdown then verify it is expanded
    And Click on Epod 2 collections X then Verify the epod2 collection X skin options are displayed
    When User select any collection X "<Skin>" and click on buy now and verify it added to cart
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
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | mystique | Fedex    | 5555555555554444 |               0923 |         123 | cecelia koch     |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2+_Skins_CoreCollection_E2E
  #Description - The purpose of this test case is to validate the E2E order placement for epod2+ core collection skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - Nov 30,2022
  #Updated_line -97,98,99,100,101,102
  @ePod2+_Skins_CoreCollection
  Scenario Outline: ePod2+_Skins_CoreCollection_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on core collection dropdown then verify it is expanded
    And click on collection x  dropdown then verify it is expanded
    And click on Epod2 plus core collections then Verify the epod2 plus core collection skin options are displayed
    When User select any Epod2 pluscore collection "<Skin>" and click on buy now and verify it added to cart
    And Hover on cart and click on view cart
    Then Verify the cart page
    
    #Note: The below lines are commented due to the data issue(Core collection skins are not available)
    
    #When Click on Checkout button
    #Then Verify shipping page and One time Purchase details are dispalyed
    #When Click on Go TO Delivery button
    #Then Verify Delivery and One time Purchase details are dispalyed
    #And Verify all delivery options are dispalyed
    #When Select "<delivery>" option and Click on Go To Billing button
    #Then Verify Billing Page and One time Purchase details dispalyed
    #When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    #And Click on terms and conditions check box and verify submit order button is enabled
    #When Click on Submit Order button
    #Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    
    Examples:
      | UN               | pwd      | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | amethyst | Fedex    | 5555555555554444 |               0923 |         123 | keon auer        |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2+_Skins_CollectionX_E2E
  #Description - The purpose of this test case is to validate the E2E order placement for epod2+ collection X skin.
  #Developed By - Harsha Kumar
  #Author - vidya.a
  #Updated Date - Nov 30,2022
  #Updated_line -123,124,125,126,127,128
  @ePod2+_Skins_CollectionX @ePod2_Skins_CollectionX
  Scenario Outline: ePod2+_Skins_CollectionX_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on core collection dropdown then verify it is expanded
    And click on collection x  dropdown then verify it is expanded
    And Click on Epod2 plus collections X then Verify the epod2 plus collection X skin options are displayed
    When User select any Epod2 plus collection X "<Skin>" and click on buy now then verify it added to cart
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
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | titanium | Fedex    | 5555555555554444 |               0923 |         123 | hugh casper      |
