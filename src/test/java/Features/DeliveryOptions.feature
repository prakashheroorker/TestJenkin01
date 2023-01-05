Feature: Different Delivery Options

  Background: 
    Given User is on pre-login page

  #Test Case: Fedex_VVYPE1898_E2E_Validation
  #Objective:The purpose of this test case is to place the order by using the "Fedex" delivery option.
  #Author: Divya Kumari
  #Date: 22nd Sep 21
  #Updated By:Sasikala
  #Date - December 09,2022
  #updated line:32
  @Fedex
  Scenario Outline: Fedex_VVYPE1898_E2E_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    And Verify user should see Fedex Next Day delivery option
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN               | pwd      | flavor | quantity | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Matypots@bat.com | TEST1234 | Peach  |        2 | Fedex    | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |

  ##-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: KwikSave_MonToFri_Before11:00AM_E2E_Validation
  #Objective:The purpose of this test case is to verify whether the option is identified at the delivery step as "SAME DAY DELIVERY" with the message "Order before 11.00 AM EST and get it by (today date) 9.00 PM" if the order the products before 11:00 AM (12:00 AM to 11:00 AM) from Monday to Friday.
  #Author: Divya Kumari
  #Date: 27th Sep 21
  #Updated By:Sasikala
  #Date - December 09,2022
  #updated line:70
  #Note: Run this testcase in EST between (12 to 11AM)
  @KwikSave 
  Scenario Outline: KwikSave_MonToFri_Before11:00AM_E2E_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    And User should see Kwik Save option(Same day delivery) in the Delivery page
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                      | pwd      | flavor | quantity | delivery          | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | Peach  |        2 | Same day delivery | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |

  ##-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: KwikSave_NegativeTC_Validation
  #Objective:The purpose of this test case is to verify the new shipping option at the delivery step "SAME/NEXT DAY DELIVERY" should not be displayed if the user is not from the GTA Area(ex: MB User)
  #Author: Vinod Markandan
  #Date: 28th Oct 21
  #Precondition: User should not be from the GTA Area(Flow validate after 4:30pm IST or before 10:00 Am IST)
  #Updated By:Sasikala
  #Date - December 08,2022
  #updated line:110
  @KwikSave_NegativeTC_Validation
  Scenario Outline: KwikSave_NegativeTC_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    And Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    And Verify Next day delivery and Same day delivery options are not available
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | flavor | quantity | delivery              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Peach  |        2 | Canada Post (Express) | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |
