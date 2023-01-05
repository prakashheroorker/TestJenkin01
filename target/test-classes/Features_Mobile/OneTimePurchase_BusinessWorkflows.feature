
Feature: One time purchase flow

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case: GVCA_ePod_Pods_OneTimePurchase_BusinessWorkflows_TC002
  #Objective:The purpose of this test case is used to VUSE user must be able to submit and accomplish ePod pods One-Time purchase from the product's detail page.
  #From the ePod Pods page, click on the icon box set and click on the See Details link.
  #From the product details page, select the One-time purchase option, nicotine strength, and volume, and click 'Add to cart' button.
  #Author: Harsha Kumar
  #Date: 16/11/2021
  @onetime
  Scenario Outline: GVCA_ePod_Pods_OneTimePurchase_BusinessWorkflows_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                    | pwd      | flavor      | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | annil.ramroop@bat.com | TEST1234 | Smooth Mint |     5 | 4444333322221111 |               1123 |         190 | alberta USER     |
