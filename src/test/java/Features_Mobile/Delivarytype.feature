@DeliveryType
Feature: Verifying  Delivery Options

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case: Fedex_VVYPE1898_Mobile
  #Objective:The purpose of this test case is to place the order by using the "Fedex" delivery option.
  #Author: Harsha Kumar
  #Date: 09/11/2021
  #Updated By:Sasikala
  #Date - December 15,2022
  #updated line:32
  @fedex
  Scenario Outline: Fedex_VVYPE1898_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    And Verify user should see Fedex Next day delivery option
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN               | pwd      | flavor | count | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Matypots@bat.com | TEST1234 | Peach  |     2 | Fedex    | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: KwikSave_MonToFri_Before11:00AM_Mobile
  #Objective:The purpose of this test case is to verify whether the option is identified at the delivery step as "SAME DAY DELIVERY" with the message "Order before 11.00 AM EST and get it by (today date) 9.00 PM" if the order the products before 11:00 AM (12:00 AM to 11:00 AM) from Monday to Friday.  #with a message "Order before 11.00AM EST and get it by (todays date) 9.00PM" if consumer order the products before 11:00AM (12:00AM to  11:00AM) from Monday to Friday
  #Author: Harsha Kumar
  #Date: 24/11/2021
  #Updated By:Sasikala
  #Date - December 09,2022
  #updated line:70
  #Note: Run this testcase in EST between (0:0AM to 11AM)
  @kwiksave
  Scenario Outline: KwikSave_MonToFri_Before11:00AM_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    And User should see Kwik Save option(Same day delivery) in the delivery page
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      | flavor | count | delivery          | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | Mango  |     2 | Same day delivery | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: KwikSave_NegativeTC_Mobile
  #Objective:The purpose of this test case is to verify the new shipping option at the delivery step "SAME/NEXT DAY DELIVERY" should not be displayed if the user is not from the GTA Area(ex: MB User)
  #Author: Vinod Markandan
  #Date: 28th Oct 21
  #Precondition: User should not be from the GTA Area(Flow validate after 4:30pm IST or before 10:00 Am IST)
  #Updated By:Sasikala
  #Date - December 08,2022
  #updated line:109
  @KwikSave_NegativeTC_Mobile
  Scenario Outline: KwikSave_NegativeTC_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    And Verify Next day delivery and Same Day delivery options are not available
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      | flavor | count | delivery              | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | brandon.huynen@bat.com | TEST1234 | Peach  |     2 | Canada Post (Express) | 5555555555554444 |               1026 |         321 | CANADA VYPE USER |
