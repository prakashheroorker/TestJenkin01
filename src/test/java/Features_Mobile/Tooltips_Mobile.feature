Feature: Verifying Tooltips

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case: GVCA_Tooltips_05_TC001
  #Objective: The Purpose of this test case is to verify the Tool tips and messages in a new custom Checkout
  #Author: Sai Manaswini
  #Date: 23/08/2022
  @tooltipsMobile
  Scenario Outline: GVCA_Tooltips_05_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
   # Then user Clicks on hamberger menu and verify links in Account section
    #Then Hower on cart icon and click on view cart
    Then user navigates to checkout page to verify tooltips present
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                 | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | lukedunphy@bat.com | TEST1234 | Clear  |     1 | 4444333322221111 |               1123 |         190 | CANADA VYPE USER |
