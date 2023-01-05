Feature: Accessories_discount

  Background: 
    Given User is on pre-login page

  #Test Case - VYPE_4346_Sliver_Accessories_Discount_TC001
  #Description - The purpose of this Test Case is to verify the UI of silver Accessories discount
  #Developed By - Vidya
  #Date - june 23,2022
  @silver_accessories
  Scenario Outline: VYPE_4346_Sliver_Accessories_Discount_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Click Rewards Page Is and verify silver user status
    When Hower on shop and click on All_ePod and click on skins
    Then select "<Skin>" and click on buy now
    And Navigate to Cart and verify the items in Cart
    Then Click on Add promotion dropdown and select discount on skin badge on silver
    And Verify the cart summary and click on checkout
    Then Click on go to delivary and verify shipping options
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When User navigates to Rewards page
    Then verify the badge

    Examples: 
      | UN                 | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jaime.hood@bat.com | TEST1234 | mystique | 5555555555554444 |               1235 |         123 | CANADA VYPE USER |

  #---------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Gold_Accessories_Discount_TC001
  #Description - The purpose of this Test Case is to verify the UI of Gold Accessories discount
  #Developed By - Vidya
  #Date - june 23,2022
  @Gold_accessories
  Scenario Outline: VYPE_4346_Gold_Accessories_Discount_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Click Rewards Page Is and verify Gold user status
    When Hower on shop and click on All_ePod and click on skins
    Then select "<Skin>" and click on buy now
    And Navigate to Cart and verify the items in Cart
    Then Click on Add promotion dropdown and select discount on skin badge on Gold
    And Verify the cart summary and click on checkout
    Then Click on go to delivary and verify shipping options
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When Click Rewards Page Is
    Then verify the badge

    Examples: 
      | UN                 | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mollyholly@bat.com | TEST1234 | mystique | 5555555555554444 |               1235 |         123 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #---------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_platinum_Accessories_Discount_TC001
  #Description - The purpose of this Test Case is to verify the UI of platinum Accessories discount
  #Developed By - Vidya
  #Date - june 24,2022
  @platinum_accessories
  Scenario Outline: VYPE_4346_platinum_Accessories_Discount_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Click Rewards Page Is and verify platinum user status
    When Hower on shop and click on All_ePod and click on skins
    Then select "<Skin>" and click on buy now
    And Navigate to Cart and verify the items in Cart
    Then Click on Add promotion dropdown and select discount on skin badge on platinum
    And Verify the cart summary and click on checkout
    Then Click on go to delivary and verify shipping options
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When Click Rewards Page Is
    Then verify the badge

    Examples: 
      | UN             | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | manasa@bat.com | TEST1234 | mystique | 5555555555554444 |               1235 |         123 | CANADA VYPE USER |

  #---------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Premium_Accessories_Discount_TC001
  #Description - The purpose of this Test Case is to verify the UI of Premium Accessories discount
  #Developed By - Vidya
  #Date - june 27,2022
  @Premium_accessories @ReRUN1Aug
  Scenario Outline: VYPE_4346_Premium_Accessories_Discount_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Click Rewards Page Is and verify Premium user status
    When Hower on shop and click on All_ePod and click on skins
    Then select "<Skin>" and click on buy now
    And Navigate to Cart and verify the items in Cart
    Then Click on Add promotion dropdown and select discount on skin badge on Premium
    And Verify the cart summary and click on checkout
    Then Click on go to delivary and verify shipping options
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When Click Rewards Page Is
    Then verify the badge

    Examples: 
      | UN                 | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | honey.h017@bat.com | TEST1234 | mystique | 5555555555554444 |               1235 |         123 | CANADA VYPE USER |

  #---------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4346_Supreme_Accessories_Discount_TC001
  #Description - The purpose of this Test Case is to verify the UI of Supreme Accessories discount
  #Developed By - Vidya
  #Date - june 27,2022
  @Supreme_accessories
  Scenario Outline: VYPE_4346_Supreme_Accessories_Discount_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Click Rewards Page Is and verify Supreme user status
    When Hower on shop and click on All_ePod and click on skins
    Then select "<Skin>" and click on buy now
    And Navigate to Cart and verify the items in Cart
    Then Click on Add promotion dropdown and select discount on skin badge on Supreme
    And Verify the cart summary and click on checkout
    Then Click on go to delivary and verify shipping options
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When Click Rewards Page Is
    Then verify the badge

    Examples: 
      | UN              | pwd      | Skin     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | charlie@bat.com | TEST1234 | mystique | 5555555555554444 |               1235 |         123 | CANADA VYPE USER |
