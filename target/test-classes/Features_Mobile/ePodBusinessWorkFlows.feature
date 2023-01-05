Feature: Subscription ePod flows in mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVCA_SubscriptionsePod_BusinessWorkflows_01_TC001
  #Objectives:ePod Subscription end to end workflow for vuse+ members
  #Precondition: User should not have subscription and is a vuse + member
  #Developed:Sai Manaswini
  #Date: 24/08/2022
  @ePodBusinessWorkflows01
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    And Navigates to Cart page and verify Subscription discliamer message
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity_Additional>" and add to the cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<quantity>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    And select delivery for subscription
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user Clicks on hamberger menu and verify links in Account section
    Then user clicks on My Subscription and verify Subscription Section is displayed with relavent Content
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                     | pwd      | flavor_Additional | quantity | quantity_Additional | flavor      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | Clear             |        2 |                   2 | Lemon Berry | 4444333322221111 |               1226 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_SubscriptionsePod_BusinessWorkflows_01_TC002
  #Objectives:ePod Subscription end to end workflow for vuse+ Platinum members
  #Precondition: User should not have subscription and platinum user
  #Developed:Sai Manaswini
  #Date: 24/08/2022
  @ePodBusinessWorkflows02
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    And Navigates to Cart page and verify Subscription discliamer message
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity_Additional>" and add to the cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<quantity>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    And select delivery for subscription
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user Clicks on hamberger menu and verify links in Account section
    Then user clicks on My Subscription and verify Subscription Section is displayed with relavent Content
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor_Additional | quantity | quantity_Additional | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | lukedunphy@bat.com | TEST1234 | Clear             |        3 |                   2 | Mango  | 4444333322221111 |               1226 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_SubscriptionsePod_BusinessWorkflows_01_TC003
  #Objectives:ePod Subscription end to end workflow for non vype members
  #Precondition: User should not have subscription and is a non vype member(opted out)
  #Developed:Sai Manaswini
  #Date: 24/08/2022
  @ePodBusinessWorkflows03
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC003
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And User clicks on No thanks as user is non vype member
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    And Navigates to Cart page and verify Subscription discliamer message
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity_Additional>" and add to the cart
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<quantity>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    And select delivery for subscription
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then user Clicks on hamberger menu and verify links in Account section
    Then user clicks on My Subscription and verify Subscription Section is displayed with relavent Content
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                   | pwd      | flavor_Additional | quantity | quantity_Additional | flavor      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | titus.pouros@bat.com | TEST1234 | Clear             |        3 |                   3 | Lemon Berry | 4444333322221111 |               1226 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_SubscriptionsePod_BusinessWorkflows_01_TC004
  #Objectives:ePod Subscription end to end workflow for silver/gold
  #Precondition: User should not have subscription and is a gold/silver member
  #Developed:Sai Manaswini
  #Date: 24/08/2022
  @ePodBusinessWorkflows04
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC004
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    And User chooses the flavour "<flavor_Additional>" with quantity "<quantity>" and add to the cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page
    Then Verify Active Subscription and verify subscribed items,subscription total and shipping date
    Then Cancel subscription
    And delete card present in My Account page

    Examples: 
      | UN                 | pwd      | flavor_Additional | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | lukedunphy@bat.com | TEST1234 | Clear             |        5 | 4444333322221111 |               1226 |         190 | CANADA VYPE USER |
