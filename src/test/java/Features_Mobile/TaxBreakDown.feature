@vuse
Feature: Verifying  Tax break down for the province

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case: GVCA_Taxbreakdown_02_TC001
  #Objective:The purpose of this Testcase is to verify the Tax breakdown for all the Provinces(BC, AB, ON, PEI, SK, NB, MB, NFLD) and to verify the applied discount code from "your cart" page is carry forwarded to the next steps
  #Author: Harsha Kumar
  #Date: 09/11/2021
  @taxbreakdown
  Scenario Outline: GVCA_Taxbreakdown_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then user clicks on hamberger menu and clicks on My Account and verifies province
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and calculate tax break down
    And user enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                     | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Clear  |     1 | 4444333322221111 |               1123 |         190 | CANADA VYPE USER |
