@Benefits_Rewards
Feature: Benefits_Rewards

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Description - "Description: The purpose of this test case is To verify Current Points in Rewards tab,To verify Points earned by silver user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - july 01,2022
  #Test Case -  VYPE_4346_Silver Benefits_TC001
  @BenefitsmobileSilver
  Scenario Outline: VYPE_4346_Silver_Benefits_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify Whether Silver graph is Displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify the purchase points in the Rewards page
    Then user clicks on hamberger menu and clicks on My orders and cancel the order

    Examples: 
      | UN              | pwd      | flavor       | count | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jody.sewell@bat.com| TEST1234 | Clear |     1 | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------------------
  #Description - "Description:"1. User should have valid credentials (Gold user Credentials)
  #2. User should be already Opted - In for Vuse+ Rewards Program."
  #Developed By - Vishnu Vardhan Reddy
  #Date - july 01,2022
  #Test Case -   VYPE_4346_ Gold  Benefits_TC001
  @Benefitsmobile1Gold
  Scenario Outline: VYPE_4346_Gold_Benefits_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify Whether gold graph is Displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify the purchase points in the Rewards page

    Examples: 
      | UN              | pwd      | flavor       | count | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha01@bat.com | TEST1234 | Passionfruit |     1 | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #---------------------------------------------------------------------------------------------------------------------
  #Description - "Description: The purpose of this test case is  To verify Current Points in the Rewards tab,To verify Points earned by Platinum user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - july 04,2022
  #Test Case -    VYPE_4346_Platinum_Benefits_TC001
  @Benefitsmobile13
  Scenario Outline: VYPE_4346_Platinum_Benefits_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify Whether Platinum graph is Displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify the purchase points in the Rewards page
    Then user clicks on hamberger menu and clicks on My orders and cancel the order

    Examples: 
      | UN                  | pwd      | flavor       | count | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha02@bat.com | TEST1234 | Passionfruit |     1 | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------
  #Description - "Description: The purpose of this test case is To verify Current Points in the Rewards tab, To verify Points earned by Premium user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 24,2022
  #Test Case -    VYPE_4346_Premium_Benefits_TC001
  @Benefitsmobile14
  Scenario Outline: VYPE_4346_Premium_Benefits_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify Whether Premium graph is Displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify the purchase points in the Rewards page
    Then user clicks on hamberger menu and clicks on My orders and cancel the order

    Examples: 
      | UN                | pwd      | flavor       | count | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | deb.dumas@bat.com | TEST1234 | Passionfruit |     1 | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------
  #Description - "1. User should have valid credentials (Supreme user Credentials), User should be already Opted - In for Vuse+ Rewards Program.
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 24,2022
  #Test Case -     VYPE_4346_Supreme_Benefits_TC001
  @Benefitsmobile15
  Scenario Outline: VYPE_4346_Supreme_Benefits_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify Whether Supreme graph is Displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And verify the purchase points in the Rewards page
    Then user clicks on hamberger menu and clicks on My orders and cancel the order

    Examples: 
      | UN             | pwd      | flavor       | count | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | stokes@bat.com | TEST1234 | Passionfruit |     0 | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |
