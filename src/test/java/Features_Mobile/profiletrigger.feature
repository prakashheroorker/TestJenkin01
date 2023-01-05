Feature: Upgrading status flow

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case: GVPCA_GoldProfileTrigger_01_TC001
  #Objective://Objectives: The purpose of this Test case is to verify following: 1. User eligibility requirements for the Gold Profile are triggered (achieved) by:-
  #lifetime spend of $250 or more
  #subscription to newsletter
  #minimum of 1 (one) order per month
  #Vype Plus status is confirmed / checked in the "My Profile" page, by directly clicking on "Find out your status" button.
  #Author: Harsha Kumar
  #Date: 26/11/2021
  @gold
  Scenario Outline: GVPCA_GoldProfileTrigger_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify amount needs to be spend to be upgraded to gold status
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    And verify you are almost banner and click on benefits
    Then click add quantity untill it reaches to desired quantity
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user clicks on hamberger menu and clicks on My orders and cancel the order
    Then User click on hamberger menu and clicks on My Rewards
    And user verifies status is upgraded and verifies status bar for gold status

    Examples: 
      | UN                 | pwd      | flavor      | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | ian.cabato@bat.com | TEST1234 | Smooth Mint |     1 | 4444333322221111 |               1123 |         190 | osborne carroll  |

  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : Vype_SilverProfileTrigger_01_TC001
  #Objectives: The purpose of this Test Case is to verify the Silver profile when user purchase more than $ 100 or equals to $100.
  #Author: Harsha Kumar
  #Date: 26/11/2021
  @silver
  Scenario Outline: GVPCA_SilverProfileTrigger_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify amount needs to be spend to be upgraded to silver status
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    And verify you are almost banner and click on benefits
    Then click add quantity untill it reaches to desired quantity
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user clicks on hamberger menu and clicks on My orders and cancel the order
    Then User click on hamberger menu and clicks on My Rewards
    And user verifies status is upgraded and verifies status bar for silver status

    Examples: 
      | UN                    | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | nousherakbar@bat.com  | TEST1234 | Mango  |     1 | 4444333322221111 |               1123 |         190 | osborne carroll  |

  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_Nonvype+Newuser_03_TC001
  #Objectives: The Purpose of this test case is to verify the vype + benefits are displayed
  # in the cart page for consumers who are not active members i.e,, Nonvpe+ New users (show what is need for them to become Vype + members)
  #Note -Shop only for epod pods as the epen products are delisting.
  #Author: Harsha Kumar
  #Date: 26/11/2021
  @nonvype
  Scenario Outline: GVCA_Nonvype+Newuser_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify amount needs to be spend to be upgraded to silver status
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    And verify you are almost banner and click on benefits
    Then click add quantity untill it reaches to desired quantity
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user clicks on hamberger menu and clicks on My orders and cancel the order
    Then User click on hamberger menu and clicks on My Rewards
    And user verifies status is upgraded and verifies status bar for silver status

    Examples: 
      | UN                    | pwd      | flavor    | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | breanne.betts@bat.com | TEST1234 | Blueberry |     1 | 4444333322221111 |               1123 |         190 | osborne carroll  |
