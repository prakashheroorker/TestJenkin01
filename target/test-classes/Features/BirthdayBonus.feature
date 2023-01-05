Feature: BirthdayBonus

  Background: 
    Given User is on pre-login page

  #Test Case -  VYPE_4392_BirthdayBonus_Silver_Validation
  #Description - The purpose of this test case is verify 500 bonus points are added in your history for silver user.
  #Precondition- Take silver user's birthday falling in the same month
  #Updated 12-18 lines by - Akhila
  #Date -Dec 09,2022
  @SilverBirthdayBonuss
  Scenario Outline: VYPE_4392_BirthdayBonus_Silver_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify Birthday Badge in Your Perks section
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And User navigates to Cart page
    And Verify Birthday bonus in cart summary for silver user
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And  Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify birthday perk is disabled and points are added in your history section
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavor     |quantity |delivery|
      |Jordan.Silverdec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |Vibrant Mix|1       |Canada Post (Express)|

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
   #Test Case -   VYPE_4392_BirthdayBonus_Gold_Validation
  #Description - The purpose of this test case is verify 1000 bonus points are added in your history for gold user.
  #Precondition- Take Gold user's birthday falling in the same month
  #Updated 65 line by - Akhila
  #Date -Dec 09,2022
  @GoldBirthdayBonuss
  Scenario Outline: VYPE_4392_BirthdayBonus_Gold_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify Birthday Badge in Your Perks section
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And User navigates to Cart page
    And Verify Birthday bonus in cart summary for Gold user
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And  Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify birthday perk is disabled and points are added in your history section
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavor     |quantity |delivery|
      |Afinch.GoldDec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |Vibrant Mix|1       |Canada Post (Express)|

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case -    VYPE_4392_BirthdayBonus_Platinum_Validation
  #Description - The purpose of this test case is verify 2000  bonus points are added in your history for Platinum user.
  #Precondition- Take Platinum user's birthday falling in the same month
  #Updated 106 line by - Akhila
  #Date -Dec 09,2022
  @PlatinumBirthdayBonuss
  Scenario Outline:  VYPE_4392_BirthdayBonus_Platinum_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify Birthday Badge in Your Perks section
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And User navigates to Cart page
    And Verify Birthday bonus in cart summary for Platinum user
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And  Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify birthday perk is disabled and points are added in your history section
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavor     |quantity |delivery|
      |Milan.Platnmdec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |Vibrant Mix|1       |Canada Post (Express)|

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Test Case -     VYPE_4392_BirthdayBonus_Premium_Validation
  #Description - The purpose of this test case is verify 3000 bonus points are added in your history for Premium user.
  #Precondition- Take Premium user's birthday falling in the same month
  #Updated 147 line by - Akhila
  #Date -Dec 09,2022
  @PremiumBirthdayBonuss
  Scenario Outline:  VYPE_4392_BirthdayBonus_Premium_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify Birthday Badge in Your Perks section
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And User navigates to Cart page
    And Verify Birthday bonus in cart summary for Premium user
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And  Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify birthday perk is disabled and points are added in your history section
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavor     |quantity |delivery|
      |Chrisis.Premiumdec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |Vibrant Mix|1       |Canada Post (Express)|

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
  #Test Case -     VYPE_4392_BirthdayBonus_Supreme_Validation
  #Description -  The purpose of this test case is verify 5000 bonus points are added in your history for Supreme user
  #Precondition- Take Supreme user's birthday falling in the same month
  #Updated 189 line by - Akhila
  #Date -Dec 09,2022
  @SupremeBirthdayBonuss
  Scenario Outline:   VYPE_4392_BirthdayBonus_Supreme_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify Birthday Badge in Your Perks section
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And User navigates to Cart page
    And Verify Birthday bonus in cart summary for Supreme user
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And  Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify birthday perk is disabled and points are added in your history section
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |flavor     |quantity |delivery|
      |Aeon.Supremedec@bat.com | Test1234$ | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |Vibrant Mix|1       |Canada Post (Express)|

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  #Description - Verify 500 birthday bonus points are added in your history for silver user.
  #Developed By - Harris
  #Date - June 24,2022
  #Test Case - GVPCA_SilverBirthdayBonus_01_TC001
  #@SilverBirthdayBonus
  #Scenario Outline: GVPCA_SilverBirthdayBonus_01_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on Profile icon and Verify Birthday Badge in Your Perks section
    #Then user navigates to epod accessories page
    #And user navigates to Phone Holder with Pod Cap Accessory page
    #And user verifies the content and adds product
    #And User navigates to Cart page
    #Then verify Birthday bonus in cart summary
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #Then click on my rewards page and verify birthday point in your history section
#
    #Examples: 
      #| UN                 | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| honey.h024@bat.com | TEST1234 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 1000 birthday bonus points are added in your history for gold user.
  #Developed By - Harris
  #Date - June 24,2022
  #Test Case - GVPCA_GoldBirthdayBonus_01_TC002
  #@GoldBirthdayBonus
  #Scenario Outline: GVPCA_GoldBirthdayBonus_01_TC002
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on Profile icon and Verify Birthday Badge in Your Perks section
    #When User navigates to ePod pods page
    #And User selects required product "<flavor>" for one time purchase and add to the cart
    #And User navigates to Cart page
    #Then verify Birthday bonus in cart summary
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #Then click on my rewards page and verify birthday point in your history section
#
    #Examples: 
      #| UN                 | pwd      | flavor       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| mollyholly@bat.com | TEST1234 | Passionfruit | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 2000 birthday bonus points are added in your history for platinum user.
  #Developed By - Harris
  #Date - June 24,2022
  #Test Case - GVPCA_PlatinumBirthdayBonus_01_TC003
  #@PlatinumBirthdayBonus @ReRun
  #Scenario Outline: GVPCA_PlatinumBirthdayBonus_01_TC003
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on Profile icon and Verify Birthday Badge in Your Perks section
    #Then user navigates to epod accessories page
    #And user navigates to Phone Holder with Pod Cap Accessory page
    #And user verifies the content and adds product
    #And User navigates to Cart page
    #Then verify Birthday bonus in cart summary
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #Then click on my rewards page and verify birthday point in your history section
#
    #Examples: 
      #| UN                   | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| Hollyjohnson@bat.com | TEST1234 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 3000 birthday bonus points are added in your history for premium user.
  #Developed By - Harris
  #Date - June 24,2022
  #Test Case - GVPCA_PremiumBirthdayBonus_01_TC004
  #@PremiumBirthdayBonus @ReRun
  #Scenario Outline: GVPCA_PremiumBirthdayBonus_01_TC004
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on Profile icon and Verify Birthday Badge in Your Perks section
    #Then user navigates to epod accessories page
    #And user navigates to device case page
    #And user verifies the content and adds product
    #And User navigates to Cart page
    #Then verify Birthday bonus in cart summary
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #Then click on my rewards page and verify birthday point in your history section
#
    #Examples: 
      #| UN                   | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| chris.jordan@bat.com | TEST1234 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - Verify 5000 birthday bonus points are added in your history for supreme user.
  #Developed By - Harris
  #Date - June 24,2022
  #Test Case - GVPCA_SupremeBirthdayBonus_01_TC005
  #@SupremeBirthdayBonus @ReRun
  #Scenario Outline: GVPCA_SupremeBirthdayBonus_01_TC005
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on Profile icon and Verify Birthday Badge in Your Perks section
    #Then user navigates to epod accessories page
    #And user navigates to Phone Holder with Pod Cap Accessory page
    #And user verifies the content and adds product
    #And User navigates to Cart page
    #Then verify Birthday bonus in cart summary
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #Then click on my rewards page and verify birthday point in your history section
#
    #Examples: 
      #| UN                      | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| supremeuseraug1@bat.com | TEST1234 | 4444333322221111 |               1024 |         190 | CANADA VYPE USER |
