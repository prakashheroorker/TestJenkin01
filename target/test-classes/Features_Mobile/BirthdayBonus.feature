Feature: Verifing Birthday Bonus

  Background: 
    Given User is on pre-login page in mobile

  #Test Case -   VYPE_4392_BirthdayBonus_Silver_Validation_Mobile
  #Description - The purpose of this test case is verify 500 bonus points are added in your history for silver user.
  #Precondition- Take silver user's birthday falling in the same month
  #Updated 19,20,26 lines by - Akhila
  #Date -Dec 15,2022
  @Birthday
  Scenario Outline: VYPE_4392_BirthdayBonus_Silver_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify Birthday Badge in Your Perks section in mobile
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page 
    Then Verify Birthday bonus in cart summary for silver user in mobile
    When Hower on cart icon and click on view cart
    And Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User click on hamberger menu and clicks on My Rewards
    Then Verify birthday perk is disabled and points are added in your history section in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor      | count | delivery              |
      | silverbir@bat.com  | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER | Vibrant Mix |     1 | Canada Post (Express) |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -   VYPE_4392_BirthdayBonus_Gold_Validation_Mobile
  #Description - The purpose of this test case is verify 1000 bonus points are added in your history for gold user.
  #Precondition- Take Gold user's birthday falling in the same month
  #Updated 57,58,64 line by - Akhila
  #Date -Dec 15,2022
  @Birthday1
  Scenario Outline: VYPE_4392_BirthdayBonus_Gold_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify Birthday Badge in Your Perks section in mobile
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    And User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page
    And Verify Birthday bonus in cart summary for Gold user in mobile
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User click on hamberger menu and clicks on My Rewards
    Then Verify birthday perk is disabled and points are added in your history section in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                   | pwd       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor      | count | delivery              |
      | Goldbirthday@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER | Vibrant Mix |     1 | Canada Post (Express) |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -    VYPE_4392_BirthdayBonus_Platinum_Validation_Mobile
  #Description - The purpose of this test case is verify 2000  bonus points are added in your history for Platinum user.
  #Precondition- Take Platinum user's birthday falling in the same month
  #Updated 96,97,103 line by - Akhila
  #Date -Dec 15,2022
  @Birthday
  Scenario Outline: VYPE_4392_BirthdayBonus_Platinum_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify Birthday Badge in Your Perks section in mobile
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page
    And Verify Birthday bonus in cart summary for Platinum user in mobile
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User click on hamberger menu and clicks on My Rewards
    Then Verify birthday perk is disabled and points are added in your history section in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor      | count | delivery              |
      | Sub.Platidec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER | Vibrant Mix |     1 | Canada Post (Express) |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4392_BirthdayBonus_Premium_Validation_Mobile
  #Description - The purpose of this test case is verify 3000 bonus points are added in your history for Premium user.
  #Precondition- Take Premium user's birthday falling in the same month
  #Updated 147 line by - Akhila
  #Date -Dec 15,2022
  @Birthday
  Scenario Outline: VYPE_4392_BirthdayBonus_Premium_Validation
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify Birthday Badge in Your Perks section in mobile
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page
    Then Verify Birthday bonus in cart summary for Premium user in mobile
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User click on hamberger menu and clicks on My Rewards
    Then Verify birthday perk is disabled and points are added in your history section in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor      | count | delivery              |
      | Ashu.Premiumdec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER | Vibrant Mix |     1 | Canada Post (Express) |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -  VYPE_4392_BirthdayBonus_Supreme_Validation_Mobile
  #Description -  The purpose of this test case is verify 5000 bonus points are added in your history for Supreme user
  #Precondition- Take Supreme user's birthday falling in the same month
  #Updated 189 line by - Akhila
  #Date -Dec 15,2022
  @Birthday3
  Scenario Outline: VYPE_4392_BirthdayBonus_Supreme_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify Birthday Badge in Your Perks section in mobile
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then User verifies pods page and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When Navigate to cart page and verify the cart page
    Then Verify Birthday bonus in cart summary for Supreme user in mobile
    And Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User click on hamberger menu and clicks on My Rewards
    Then Verify birthday perk is disabled and points are added in your history section in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor      | count | delivery              |
      | Jose.Supremedec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER | Vibrant Mix |     1 | Canada Post (Express) |
  #Description - Verify 500 birthday bonus points are added in your history for silver user mobile.
  #Developed By - Harris
  #Date - July 01,2022
  #Test Case - GVCA_SilverBirthdayBonus_Mobile_01_TC001
  #@SilverBirthdayBonusMobile
  #Scenario Outline: GVCA_SilverBirthdayBonus_Mobile_01_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and Verify Birthday Badge in My Rewards page
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then click on one time purchase add quantity "<count>" and add to cart
    #Then Hower on cart icon and click on view cart and verify Birthday bonus in cart summary
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
    #Then User click on hamberger menu and verify birthday point in your history section
    #Examples: 
      #| UN             | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| trysam@bat.com | TEST1234 | Clear  |     3 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 1000 birthday bonus points are added in your history for gold user mobile.
  #Developed By - Harris
  #Date - July 01,2022
  #Test Case - GVCA_GoldBirthdayBonus_Mobile_01_TC001
  #@GoldBirthdayBonusMobile
  #Scenario Outline: GVCA_GoldBirthdayBonus_Mobile_01_TC002
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and Verify Birthday Badge in My Rewards page
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on Accessories
    #And user navigates to phone holder with pod cap accessory page
    #And user verifies the content and adds product
    #Then Hower on cart icon and click on view cart and verify Birthday bonus in cart summary
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                 | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| aaronfinch@bat.com | TEST1234 | Clear  |     3 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 2000 birthday bonus points are added in your history for platinum user mobile.
  #Developed By - Harris
  #Date - July 01,2022
  #Test Case - GVCA_PlatinumBirthdayBonus_Mobile_01_TC001
  #@PlatinumBirthdayBonusMobile
  #Scenario Outline: GVCA_PlatinumBirthdayBonus_Mobile_01_TC003
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and Verify Birthday Badge in My Rewards page
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then click on one time purchase add quantity "<count>" and add to cart
    #Then Hower on cart icon and click on view cart and verify Birthday bonus in cart summary
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                | pwd      | flavor       | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| mary.jane@bat.com | TEST1234 | passionfruit |     1 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 3000 birthday bonus points are added in your history for premium user mobile.
  #Developed By - Harris
  #Date - July 01,2022
  #Test Case - GVCA_PremiumBirthdayBonus_Mobile_01_TC001
  #@PremiumBirthdayBonusMobile
  #Scenario Outline: GVCA_PremiumBirthdayBonus_Mobile_01_TC004
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and Verify Birthday Badge in My Rewards page
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on Accessories
    #And user navigates to device case page
    #And user verifies the content and adds product
    #Then Hower on cart icon and click on view cart and verify Birthday bonus in cart summary
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN           | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| zero@bat.com | TEST1234 | Clear  |     3 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 5000 birthday bonus points are added in your history for supreme user mobile.
  #Developed By - Harris
  #Date - July 01,2022
  #Test Case - GVCA_SupremeBirthdayBonus_Mobile_01_TC001
  #@SupremeBirthdayBonusMobile
  #Scenario Outline: GVCA_SupremeBirthdayBonus_Mobile_01_TC005
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and Verify Birthday Badge in My Rewards page
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then click on one time purchase add quantity "<count>" and add to cart
    #Then Hower on cart icon and click on view cart and verify Birthday bonus in cart summary
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                    | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| karen.erika16@bat.com | TEST1234 | Peach  |     2 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
