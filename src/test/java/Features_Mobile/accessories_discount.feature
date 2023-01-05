@Accessories_discount
Feature: Accessories_discount

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - VYPE_4346_Sliver_Accessories_Discount_Mobile_TC001
  #Description - The purpose of this Test Case is to verify the UI of silver Accessories discount
  #Developed By - Vidya
  #Date - july 01,2022
  @silver_accessories
  Scenario Outline: VYPE_4346_Sliver_Accessories_Discount_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify silver user status
    Then User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epodtwo and clicks on shop epodtwo skins
    Then verify epodtwo skins page is Displayed
    Then select "<Skin>" and click on buynow
    Then Hower on cart icon and click on view cart
    Then Click on Add promotion dropdown and select discount on skin badge on Silver
    Then click on checkout and verify checkout page
    And click on go to delivary
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the badge

    Examples: 
      | UN              | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jody.sewell@bat.com | TEST1234 | Twilight | 5555555555554444 |               1230 |         123 | mallory Stokes   |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Gold_Accessories_Discount_Mobile_TC001
  #Description - The purpose of this Test Case is to verify the UI of Gold Accessories discount
  #Developed By - Vidya
  #Date - july 01,2022
  @Gold_accessories
  Scenario Outline: VYPE_4346_Gold_Accessories_Discount_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify Gold user status
    Then User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epodtwo and clicks on shop epodtwo skins
    Then verify epodtwo skins page is Displayed
    Then select "<Skin>" and click on buynow
    Then Hower on cart icon and click on view cart
    Then Click on Add promotion dropdown and select discount on skin badge on Gold
    Then click on checkout and verify checkout page
    And click on go to delivary
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the badge

    Examples: 
      | UN           | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha01@bat.com | TEST1234 | Twilight | 5555555555554444 |               1230 |         123 | mallory Stokes   |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_platinum_Accessories_Discount_Mobile_TC001
  #Description - The purpose of this Test Case is to verify the UI of platinum Accessories discount
  #Developed By - Vidya
  #Date - july 04,2022
  @platinum_accessories
  Scenario Outline: VYPE_4346_platinum_Accessories_Discount_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify platinum user status
    Then User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epodtwo and clicks on shop epodtwo skins
    Then verify epodtwo skins page is Displayed
    Then select "<Skin>" and click on buynow
    Then Hower on cart icon and click on view cart
    Then Click on Add promotion dropdown and select discount on skin badge on platinum
    Then click on checkout and verify checkout page
    And click on go to delivary
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the badge

    Examples: 
      | UN                | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha02@bat.com | TEST1234 | Twilight | 5555555555554444 |               1230 |         123 | mallory Stokes   |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Premium_Accessories_Discount_Mobile_TC001
  #Description - The purpose of this Test Case is to verify the UI of Premium Accessories discount
  #Developed By - Vidya
  #Date - july 04,2022
  @Premium_accessories
  Scenario Outline: VYPE_4346_Premium_Accessories_Discount_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify Premium user status
    Then User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epodtwo and clicks on shop epodtwo skins
    Then verify epodtwo skins page is Displayed
    Then select "<Skin>" and click on buynow
    Then Hower on cart icon and click on view cart
    Then Click on Add promotion dropdown and select discount on skin badge on premium
    Then click on checkout and verify checkout page
    And click on go to delivary
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the badge

    Examples: 
      | UN                      | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | deb.dumas@bat.com | TEST1234 | Mystique | 5555555555554444 |               1230 |         123 | mallory Stokes   |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Supreme_Accessories_Discount_Mobile_TC001
  #Description - The purpose of this Test Case is to verify the UI of Supreme Accessories discount
  #Developed By - Vidya
  #Date - july 04,2022
  @Supreme_accessories
  Scenario Outline: VYPE_4346_Supreme_Accessories_Discount_Mobile_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify Supreme user status
    Then User clicks on hamberger menu and clicks on Shop
    And User clicks on personalize your epodtwo and clicks on shop epodtwo skins
    Then verify epodtwo skins page is Displayed
    Then select "<Skin>" and click on buynow
    Then Hower on cart icon and click on view cart
    Then Click on Add promotion dropdown and select discount on skin badge on supreme
    Then click on checkout and verify checkout page
    And click on go to delivary
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    Then verify the badge

    Examples: 
      | UN             | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Twilight | 5555555555554444 |               1230 |         123 | mallory Stokes   |
