Feature: Epod_CoreCollection_Mobile

  Background: 
    Given User is on pre-login page in mobile
     When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - GVCA_ePod2Device_CoreCollection_E2E_Mobile
  #Description - The purpose of this test case is to verify the E2E order placement for ePod2 core collection device by adding flavour and skin for the order
  #Developed By - Sasikala
  #Date: 09 dec ,2022
  @GVCA_ePod2Device_CoreCollection_E2E_Mobile
  Scenario Outline: GVCA_ePod2Device_CoreCollection_E2E_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When Click on ePod2 tab and verify ePod2 device tiles are displayed
    And User Clicks on ePod2 Core Collection tile
    Then Verify ePod2 Core Collection screen is displayed with relevant content
    When Click on select for any of color "<devicecolour>"
    Then Verify product detail screen is displayed with relevant content
    When User click on right and left corousal and verify the different images are displayed
    And Click on add to cart then verify the mini cart is updated and added to cart is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When Click on ePod2 tab and verify ePod2 devices are displayed
    And User clicks on pods and verify ePod Pods screen is displayed
    And Swipe down and click on flavor image "<flavor>" and verify the product detail
    And User clicks on plus button and verify the quantity is increased
    And User click on add to cart and  Verify the mini cart is updated
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When Click on ePod2 tab and verify ePod2 devices are displayed
    And User clicks on Skins then verify Device Skins screen is displayed
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
      | UN               | pwd      | devicecolour | flavor | Skin     | UserCardNumber   | delivery | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Red          | Mango  | mystique | 5555555555554444 | Fedex    |               1024 |         190 | keon auor        |

  #----------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2+Device_CoreCollection_E2E_Mobile
  #Description - The purpose of this test case is to verify the E2E order placement for ePod2 core collection device by adding flavour and skin for the order
  #Developed By - Sasikala
  #Date: 09 dec ,2022
  @Device_CoreCollection_E2E_Mobile @GVCA_ePod2Device_CoreCollection_E2E_Mobile
  Scenario Outline: GVCA_ePod2+Device_CoreCollection_E2E_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And user clicks on epod2 vaping products and clicks on ePod2+ devices
    Then Verify the epod2+ device page
    When Click on buy now and verify the ePod2+ Device screen with relevent content
    And Click on select for any of color "<devicecolour>"
    Then Verify product detail screen for ePod2 plus is displayed with relevant content
    When User click on right and left corousal and verify the different images are displayed
    And Click on add to cart then verify the mini cart is updated and added to cart is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When Swipe down and click on flavor image "<flavor>" and verify the product detail
    And User clicks on plus button and verify the quantity is increased
    And User click on add to cart and  Verify the mini cart is updated
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    When Click on Epod2 plus Collections X then Verify the epod2 plus Collection X skin options are displayed
    And User select any Epod2 plus Collection X "<Skin>" and click on buy now and verify it added to cart
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
      | UN               | pwd      | devicecolour | flavor | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Red          | Mango  | titanium | Fedex    | 5555555555554444 |               1024 |         190 | keon auor        |

  #----------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2 + Device_LandingPage_Validation_Mobile
  #Description - The purpose of this test case is to verify the UI of ePod2+ device landing page
  #Developed By - Sasikala
  #Date: 12 dec ,2022
  #Note: Download the APP Functionality is not added because it taking us to prod site
  @Device_LandingPage_Validation_Mobile
  Scenario Outline: ePod2 + Device_LandingPage_Validation_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And user clicks on epod2 vaping products and clicks on ePod2+ devices
    Then Verify the epod2+ device screen with relevent content
    When User click on watch vedio and verify a new tab with youtube is displayed
    And Close the current tab and verify epod device screen is displayed in previous tab
    And User click on overview button and verify the relevent content displayed
    And User click on features button
    Then Verify device lock tile is displayed with the relevent content
    And Swipe down and verify cloud control tile is displayed with relevent content
    And Swipe down and verify recharge reminder tile is displayed with relevent content
    And Swipe down and verify find my vape tile is displayed with relevent content
    And Swipe down and verify shop online tile is displayed with relevent content
    And Swipe down and verify enjoy haptics tile is displayed with relevent content
    And Swipe down and verify power button tile is displayed with relevent content
    And Swipe down and verify LED Indicator tile is displayed with relevent content
    When User click on download button
    Then Verify myvuse myway tile is displayed with the relevent content
    And Swipe down and verify App Features tile is displayed with relevent content
    When User clicks on buynow button and verify epod2+ device screen is displayed
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN               | pwd      |
      | yeswanth@bat.com | TEST1234 |
