Feature: Epod Accessories

  Background: 
    Given User is on pre-login page

  
  #Test Case - GVCA_epodaccessories_PhoneHolder
  #Description - The purpose of this test case is to verify E2E order placement for  Phone Holder.
  #Developed By - Harika
  #Date - January 28,2022
  #Updated By:Sasikala
  #Date - December 08,2022
  #Updated lines:69,70
  @GVCA_epodaccessories_PhoneHolder
  Scenario Outline: GVCA_epodaccessories_PhoneHolder
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on accessories
    Then Verify user navigated to accessories page
    When User click on Phone holder with pod cap
    Then Verify User is navigated to Product Details Page of Phone Holder with pod cap
    When User click on right and left corousal and verify the different images
    When Click on add to cart and verify the mini cart is updated
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
      | UN                  | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | alix.malkin@bat.com | TEST1234 | Fedex    | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case - GVCA_epodaccessories_DeviceCase
  #Description - The purpose of this test case is to verify E2E order placement for  Device Case.
  #Developed By - Harika
  #Date - February 2,2022
  #Updated By:Sasikala
  #Date - December 08,2022
  #Updated lines:128,129
  @GVCA_epodaccessories_DeviceCase
  Scenario Outline: GVCA_epodaccessories_DeviceCase
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on accessories
    Then Verify user navigated to accessories page
    When User click on Device Case
    Then Verify User is navigated to Product Details Page of device case
    When User click on right and left corousal and verify the different images
    When Click on add to cart and verify the mini cart is updated
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
      | UN                     | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | louisa.spencer@bat.com | TEST1234 | Fedex    | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case - GVCA_epodaccessories_Travelcase
  #Description - The purpose of this Test Case is to verify the following:
  #verify the UI of the ePod Accessories  page
  #verify the E2E order placement for Travel Case displayed with quantity
  #Developed By - Harika
  #Updated By:Sasikala
  #Date - December 08,2022
  #Updated Lines: 188 TO 192
  @GVCA_epodaccessories_Travelcase @GVCA_epodaccessories_DeviceCase
  Scenario Outline: GVCA_epodaccessories_Travelcase
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on accessories
    Then Verify Accessories page with relevent content is displayed
    When User click on travel case
    Then Verify User is navigated to Product Details Page of travel case
    When User click on right and left corousal and verify the different images
    And User clicks on plus button and verify quantity is increased
    When Click on add to cart and verify the mini cart is updated
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
      | UN                  | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | alix.malkin@bat.com | TEST1234 | Fedex    | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
 