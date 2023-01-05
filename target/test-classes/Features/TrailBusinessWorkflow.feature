@epod2skinsTARL
Feature: This test case is to add StarterKit and flavors

  Background: 
    Given User is on pre-login page

 
  #Test Case - #Test Case - GVCA_Trial2_BusinessWorkflows_01_E2E_Validation
  #Description - The Purpose of this test case is verify the E2E workflow for the Starter Kit Page ePod device and Flavour Order Placement.
  #Developed By - Harsha Kumar
  #Date - September 9,2021
  #Updated by:Sasikala
  #date:dec 14,2022
  #Updated lines:24,27,31
  @Trial2034 @GoldenRegressionSuite
  Scenario Outline: GVCA_Trial2_BusinessWorkflows_01_E2E_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on save and click on starter bundle under offers
    Then Verify choose your device colour page is displayed
    When User click on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your pods page
    And Click on any flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on proceed to checkout and verify your cart page is displayed
    Then Verify the cart page
    And Verify discount applied
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
      | UN                     | pwd      | device colour | flavor | Nicotine Strength | delivery | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Pink          | Mango  |               1.6 | Fedex    | 5555 5555 5555 4444 |               1024 |         190 | nayeli kassulke  |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Trial2_BusinessWorkflows_02_E2E_Validation
  #Description - The Purpose of this test case is to verify the Startrer Bundle discount should not be calculated on the extra added flavours into the cart
  #Developed By - Harsha Kumar
  #Date - September 9,2021
  #Updated by:Sasikala
  #date:dec 14,2022
  #Updated lines:76,80
  @Trial201 @GoldenRegressionSuite
  Scenario Outline: GVCA_Trial2_BusinessWorkflows_02_E2E_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on save and click on starter bundle under offers
    Then Verify choose your device colour page is displayed
    When User click on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your pods page
    And Click on any flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on proceed to checkout and verify your cart page is displayed
    Then Verify discount applied
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any flavor "<Podflavour>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When Hover on cart and click on view cart
    Then Verify the cart page
    And Verify cart page check whether any extra discount is applied or not
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    

    
    Examples: 
      | UN                     | pwd      | device colour | flavor | Nicotine Strength | Podflavour | quantity |
      | brandon.huynen@bat.com | TEST1234 | Gold          | Berry  |               1.6 | Mango      |        1 |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case - GVCA_Trial2_JIRACardBusinessWorkflowDefinitions_E2E_Validation
  #Description - The Purpose of this test case is to verify the user should not be able to get the EPOD STARTER BUNDLE discount when the minimum requirement is not met i.e., (ePod Device + Favoured Cartridge).
  #Developed By - Harsha Kumar
  #Date - September 9,2021
  #Updated by:Sasikala
  #date:dec 14,2022
  #Updated lines:
  @Trial101
  Scenario Outline: GVCA_Trial2_JIRACardBusinessWorkflowDefinitions_E2E_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on save and click on starter bundle under offers
    Then Verify choose your device colour page is displayed
    When User click on start customizing and verify the choose your device colour page
    And Click on device color "<device colour>" and verify the image displayed
    And Click on choose this color and verify choose your pods page
    And Click on any flavor "<flavor>" with "<Nicotine Strength>"
    Then Verify the flavour "<flavor>" image
    When User click on choose pod pack and verify starter kit page
    And Click on proceed to checkout and verify your cart page is displayed
    Then Verify the cart page
    Then Verify discount applied
    Then Verify discount is not there after removing product
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | device colour | flavor  | Nicotine Strength |
      | brandon.huynen@bat.com | TEST1234 | Aqua          | Vanilla |               1.6 |
