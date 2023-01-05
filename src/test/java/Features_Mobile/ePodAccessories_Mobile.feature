@ACCEESORIES_MOBILE
Feature: Verifing Accessories page

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

 
  #Test Case - GVCA_epodaccessories_PhoneHolder_Mobile
  #Description - The purpose of this test case is to verify E2E order placement for  Phone Holder.
  #Developed By - Harika
  #Date - January 28,2022
  #Updated By:Sasikala
  #Date - December 08,2022
  @GVCA_epodaccessories_PhoneHolder_Mobile
  Scenario Outline: GVCA_epodaccessories_PhoneHolder_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on Accessories
    Then Verify user navigates to Accessories page
    When User click on Phone holder with pod cap
    Then Verify User is navigated to Product Details Page of Phone holder with pod cap
    When User click on right and left corousal and verify the different images are displayed
    And User click on plus button and verify quantity is increased
    And User click on add to cart and  Verify the mini cart is updated
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
      | UN                     | pwd      | UserCardNumber   | delivery | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | 4444333322221111 | Fedex    |               1123 |         190 | Canada Vype User |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case - GVCA_epodaccessories_DeviceCase_Mobile
  #Description - The purpose of this test case is to verify E2E order placement for  Device Case.
  #Developed By - Harika
  #Date - February 2,2022
  #Updated By:Sasikala
  #Date - December 08,2022
  @GVCA_epodaccessories_DeviceCase_Mobile
  Scenario Outline: GVCA_epodaccessories_DeviceCase_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    Then User clicks on hamberger menu and clicks on Shop
    When User clicks on ePod Vaping Products and clicks on Accessories
    Then Verify user navigates to Accessories page
    When User click on device case
    Then Verify User is navigated to Product Details Page of device case
    When User click on right and left corousal and verify the different images are displayed
    When User click on plus button and verify quantity is increased
    And User click on add to cart and  Verify the mini cart is updated
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
      | UN                      | pwd      | UserCardNumber   | delivery | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | 4444333322221111 | Fedex    |               1124 |         190 | Canada Vype User |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_epodaccessories_Travelcase_Mobile
  #Description - The purpose of this Test Case is to verify the following:
  #verify the UI of the ePod Accessories  page
  #verify the E2E order placement for Travel Casedisplayed with quantity
  #Developed By - Harika
  #Updated By:Sasikala
  #Date - December 08,2022
  @GVCA_epodaccessories_Travelcase_Mobile
  Scenario Outline: GVCA_epodaccessories_Travelcase_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    Then User clicks on hamberger menu and clicks on Shop
    When User clicks on ePod Vaping Products and clicks on Accessories
    Then Verify accessories page with relevent content is displayed
    When User click on travel case
    Then Verify User is navigated to Product Details Page of travel case
    When User click on right and left corousal and verify the different images are displayed
    When User click on plus button and verify quantity is increased
    And User click on add to cart and  Verify the mini cart is updated
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
      | UN                       | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | alix.malkin@bat.com | TEST1234 | Fedex    | 4444333322221111 |               1123 |         190 | Canada Vype User |
  #-------------------------------------------------------------------------------------------------------------------------------------------------------------
 