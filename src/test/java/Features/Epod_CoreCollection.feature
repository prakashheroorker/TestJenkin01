Feature: Epod_CoreCollection

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_ePod2Device_CoreCollection_E2E
  #Description - The purpose of this test case is to verify the E2E order placement for ePod2 core collection device by adding flavour and skin for the order
  #Developed By - Sasikala
  #Date: 09 dec ,2022
  @GVCA_ePod2Device_CoreCollection_E2E
  Scenario Outline: GVCA_ePod2Device_CoreCollection_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page and verify relevant content
    And Click on ePod2 button and verify ePod2 device tiles are displayed
    When User clicks on ePod2 Core Collection
    Then Verify ePod2 Core Collection page is displayed with relevant content
    And Click on select for any color "<devicecolour>"
    Then Verify product detail page is displayed with relevant content
    And Click on add to cart then Verify the mini cart is updated and added to cart is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When Click on ePod2 button and verify ePod2 devices are displayed
    And User clicks on pods and verify ePod Pods page is displayed
    And Scroll down and click on flavor image "<flavor>" and verify the product detail page of flavor
    When User clicks on plus button and verify quantity is increased
    And Click on add to cart and verify the mini cart is updated
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When Click on ePod2 button and verify ePod2 devices are displayed
    And User clicks on Skins then verify Device Skins  page is displayed
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
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | devicecolour | flavor | Skin     | UserCardNumber   | delivery | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Red          | Mango  | mystique | 5555555555554444 | Fedex    |               1024 |         190 | keon auor        |

  #-----------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2+Device_CoreCollection_E2E
  #Description - The purpose of this test case is to verify the E2E order placement for ePod2+ core collection device by adding flavour and skin for the order
  #Developed By - Sasikala
  #Date: 09 dec ,2022
  @GVCA_ePod2+Device_CoreCollection_E2E
  Scenario Outline: GVCA_ePod2+Device_CoreCollection_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hower on shop and click on epod2 plus Devices
    Then Verify epod2+ device page
    When Click on buy now and verify the ePod2+ Device Page with relevent content
    And Click on select for any color "<devicecolour>"
    Then Verify product detail page for ePod2 plus is displayed with relevant content
    When Click on add to cart then Verify the mini cart is updated and added to cart is displayed
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Scroll down and click on flavor image "<flavor>" and verify the product detail page of flavor
    And User clicks on plus button and verify quantity is increased
    And Click on add to cart and verify the mini cart is updated
    When Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    And Click on Epod2 plus collections X then Verify the epod2 plus collection X skin options are displayed
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
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | devicecolour | flavor | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Red          | Mango  | titanium | Fedex    | 5555555555554444 |               1024 |         190 | keon auor        |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - ePod2 + Device_LandingPage_Validation
  #Description - The purpose of this test case is to verify the UI of ePod2+ device landing page
  #Developed By - Sasikala
  #Date: 12 dec ,2022
  #Note: Download the APP Functionality is not added because it taking us to prod site
  @Device_LandingPage_Validation
  Scenario Outline: GVCA_ePod2+Device_LandingPage_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hower on shop and click on epod2 plus Devices
    Then Verify the epod2+ device page with relevent content
    When User click on watch vedio and verify anew tab with youtube is displayed
    And Close the current tab and verify epod2+ device page is displayed in previous tab
    When User click on overview button and verify the relevent content
    When User clicks on features button
    Then Verify device lock tile is displayed with relevent content
    And Scroll down and verify cloud control tile is displayed with relevent content
    And Scroll down and verify recharge reminder tile is displayed with relevent content
    And Scroll down and verify find my vape tile is displayed with relevent content
    And Scroll down and verify shop online tile is displayed with relevent content
    And Scroll down and verify enjoy haptics tile is displayed with relevent content
    And Scroll down and verify power button tile is displayed with relevent content
    And Scroll down and verify LED Indicator tile is displayed with relevent content
    When User clicks on download button
    Then Verify myvuse myway tile is displayed with relevent content
    And Scroll down and verify App Features tile is displayed with relevent content
    When User clicks on buynow button and verify epod2+ device page is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      |
      | yeswanth@bat.com | TEST1234 |
