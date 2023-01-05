@batch03 @DeliveryOptions
Feature: Verifying  Delivery Options

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - VYPE_4392_Non Vuse+ User_DeliveryOptions_TC001
  #Description -The purpose of this test case is to Verify the Delivery Options are available for Non Vuse+ user in the Delivery Page and to Verify the Delivery Option is Chargable or not
  #Developed By - Mohammed Shouiab
  #Date - 01 July 2022
  # *Note*- User ID should be a Non Vuse+ member
  #@NonVuse+Delivery
  #Scenario Outline: VYPE_4392_NonVuse+User_DeliveryOptions_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User clicks on hamberger menu and clicks on Shop for NonVuse+member
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then click on one time purchase add quantity "<count>" and add to cart
    #Then Hower on cart icon and click on view cart
    #Then verifying shipping options when subtotal is less than $ Twenty five
    #Then Hower on cart icon and click on view cart
    #Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    #Then Hower on cart icon and click on view cart
    #Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    #Then Hower on cart icon and click on view cart
    #Then verifying shipping options when subtotal is above $ Seventy Five
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                 | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| mohammedsu@bat.com | TEST1234 | Mango  |     1 | 4444333322221111 |               1123 |         190 | ALBERTA USER     |

  ##-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_Silver User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Silver user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - 01 July 2022
  # *Note*- #  User should be in Silver Tier
  #  User should have *Free Express shipping* badge in the rewards section
  @SilverDelivery
  Scenario Outline: VYPE_4392_Silver User_DeliveryOptions_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is less than $ Twenty five
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is above $ Seventy Five
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN              | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jody.sewell@bat.com | TEST1234 | Clear  |     1 | 5555555555554444 |               1127 |         190 | ALBERTA USER     |

  ##---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_Gold User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - 04 July 2022
  # *Note*-  #   User should be in Gold Tier
  #  User should have *Free Express shipping* badge in the rewards section
  @GoldDelivery
  Scenario Outline: VYPE_4392_Gold User_DeliveryOptions_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is less than $ Twenty five
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is above $ Seventy Five
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                  | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha01@bat.com | TEST1234 | Mango  |     1 | 5555555555554444 |               1123 |         196 | ALBERTA USER     |

  ##--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_Platinum User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - 04 July 2022
  # *Note*-  User should have valid credentials.
  #   User should be in Platinum Tier
  #  User should have *Free Express shipping* badge in the rewards section
  @PlatinumDelivery
  Scenario Outline: VYPE_4392_Platinum User_DeliveryOptions_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is less than $ Twenty five
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is above $ Seventy Five
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                   | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha02@bat.com | TEST1234 | Mango  |     1 | 5555555555554444 |               1123 |         197 | ALBERTA USER     |

  ##------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_Premium User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - 04 July 2022
  # *Note*- #   User should be in Premium Tier
  #  User should have *Free Express shipping* badge in the rewards section
  @PremiumDelivery
  Scenario Outline: VYPE_4392_Premium User_DeliveryOptions_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is less than $ Twenty five
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is above $ Seventy Five
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                      | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | deb.dumas@bat.com | TEST1234 | Mango  |     1 | 5555555555554444 |               1123 |         190 | ALBERTA USER     |

  ##---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_Supreme User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Supreme user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - 04 July 2022
  # *Note*- #   User should be in Supreme Tier
  #  User should have *Free Express shipping* badge in the rewards section
  @SupremeDelivery
  Scenario Outline: VYPE_4392_Supreme User_DeliveryOptions_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is less than $ Twenty five
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
    Then Hower on cart icon and click on view cart
    Then verifying shipping options when subtotal is above $ Seventy Five
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                  | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Clear  |     1 | 5555555555554444 |               1123 |         190 | ALBERTA USER     |
