Feature: Subscription flows in mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVCA_Subscription_BusinessWorkflows_01_TC002
  #Objectives:Verify whether the VUSE user should be able to complete the subscription transaction for the ePod Pods flavours using the new cartridges page
  #Author:N.Harsha Kumar
  #Date: 24/11/2021
  @BusinessWorkflows01
  Scenario Outline: GVCA_Subscription_BusinessWorkflows_01_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    And user scrolls to subscribe now and clicks on subscribe now and verify ePod Vape Pod Subscription page
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and click on subscribe and save
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                     | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Berry  | 4444333322221111 |               1124 |         190 | mallory stokes   |

  #-------------------------------------------------------------------------------------------
  #Test Case : GVCA_ePod_Pods_SubscriptionsPurchase_BusinessWorkflows_TC001
  #Objectives:The purpose of this Test case is to verify following:"
  # 1. User eligibility requirements for the Gold Profile are triggered (achieved) by:-lifetime spend of $250 or more,subscription to newsletter,minimum of 1 (one) order per month. "
  # 2.Vype Plus status is confirmed / checked in the My Profile page, by directly clicking on Find out your status button"
  #Author:N.Harsha Kumar
  #Date: 24/11/2021
  @BusinessWorkflows02
  Scenario Outline: GVCA_ePod_Pods_SubscriptionsPurchase_BusinessWorkflows_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify user status in rewards page
    Then User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    And user scrolls to subscribe now and clicks on subscribe now and verify ePod Vape Pod Subscription page
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and click on subscribe and save
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor1>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                     | pwd      | flavor | flavor1 | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Mango  | Berry   | 4444333322221111 |               1124 |         190 | ronaldo conroy   |

  #-------------------------------------------------------------------------------------------
  #Test Case :  GVCA_Subscription_Account_BusinessWorkflows_01_TC002
  #Objectives:The purpose of this Test case is to verify following:"
  # Verify If there is no existing subscription, use can click on Browse Cartridges link to start the new subscription User should be presented with the Subscribe & Save page,"
  #" with the ability choose the needed device and choose pods, complete the Subscription Order";
  #Author:N.Harsha Kumar
  #Date: 26/11/2021
  @BusinessWorkflows03
  Scenario Outline: GVCA_Subscription_Account_BusinessWorkflows_01_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Subscription
    Then verify user has no active subscription and click on browse catridges
    And verify epod pods subscription page
    Then user verifies pods page and selects flavor "<flavor>"
    Then add quantity click on Subscribe and save and click on subscribe and save
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor1>"
    Then add quantity click on Subscribe and save and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                     | pwd      | flavor      | flavor1      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Lemon Berry | Blood Orange | 4444333322221111 |               1124 |         190 | ronaldo conroy   |
