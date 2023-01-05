@epod2skins
Feature: This test case is to add StarterBundle and flavors

  Background: 
    Given User is on pre-login page in mobile
    When user clicks on hamberger menu and click on login or register

  #Test Case - GVCA_Trial2_BusinessWorkflows_01_Mobile
  #Description - The Purpose of this test case is verify the E2E workflow for the Starter Kit Page ePod device and Flavour Order Placement.
  #Developed By - Harsha Kumar
  #Date - January 18,2022
  #Updated by:Sasikala
  #date:dec 19,2022
  #Updated lines:27,31
  @Trial201
  Scenario Outline: GVCA_Trial2_BusinessWorkflows_01_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Save
    And Click on Starter bundle and verify start cutomizing screen
    And User clicks on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your Pods page
    And Click on any of the flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the Flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on Proceed to checkout and verify your cart page is displayed
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    And Verify the discount applied
    When Click on checkout
    And Verify Shipping Page is and One time Purchase details are dispalyed
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
      | UN                    | pwd      | device colour | flavor | Nicotine Strength | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | annil.ramroop@bat.com | TEST1234 | Aqua          | Mango  |               1.6 | Fedex    | 4444333322221111 |               0723 |         186 | nayeli kassulke  |

  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Trial2_BusinessWorkflows_02_Mobile
  #Description - The Purpose of this test case is to verify the discount should not be calculated on the extra added flavours into the cart
  #Developed By - Harsha Kumar
  #Date - jan 19,2022
  #Updated by:Sasikala
  #date:dec 19,2022
  #Updated lines:24,27,31
  @Trial202
  Scenario Outline: GVCA_Trial2_BusinessWorkflows_02_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Save
    And Click on Starter bundle and verify start cutomizing screen
    And User clicks on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your Pods page
    And Click on any of the flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the Flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on Proceed to checkout and verify your cart page is displayed
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    And Verify the discount applied
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects the flavor "<Podflavour>" with desired count "<count>" and add to cart
    And Click on mini cart icon and verify checkout page
    And Verify the cart page check whether any extra discount is applied or not
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      | device colour | flavor | Podflavour | count | Nicotine Strength |
      | brandon.huynen@bat.com | TEST1234 | Blue          | Berry  | Mango      |     1 |               1.6 |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Trial2_BusinessWorkflows_02_TC001
  #Description - The Objective of this test case is to verify the user should not be able to get the EPOD STARTERKIT discount when the minimum requirement is not met i.e., (ePod Device + Favoured Cartridge).
  #Developed By - Harsha Kumar
  #Date -  January 19,2022
  @Trial101
  Scenario Outline: GVCA_Trial2_JIRACardBusinessWorkflowDefinitions_01_TC001
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Save
    And Click on Starter bundle and verify start cutomizing screen
    And User clicks on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your Pods page
    And Click on any of the flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the Flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on Proceed to checkout and verify your cart page is displayed
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    And Verify the discount applied
    And verify whether discount is still there after removing product
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      | device colour | flavor  | Nicotine Strength |
      | annil.ramroop@bat.com | TEST1234 | Blue          | Vanilla |               1.6 |
