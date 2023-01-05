Feature: Discounts

  Background: 
    Given User is on pre-login page

  #Description - "The purpose of this test case is to verify discount on devices for Gold User- Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 24,2022
  #Test Case -  VYPE_4346_Gold_Discount_Devices_TC002
  @GoldDiscountDevices
  Scenario Outline: VYPE_4346_Gold_Discount_Devices_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When User clicks on My Rewards link
    Then verify MyRewards page is displyed with golden user
    Then hower on shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then verify the price in cart
    Then add device discount badge for add promotions option in checkout page
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                   | pwd      | DeviceColour|UserCardNumber    |UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |turner.legros@bat.com   | TEST1234 | Pink        |5555555555554444  |0923               |         123 | CANADA VYPE USER |
      
      
#-----------------------------------------------------------------------  
  #Description - ""The purpose of this test case is to verify discount on devices for Platinum User Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 27,2022
  #Test Case -  VYPE_4346_Platinum_Discount_Devices_TC003
  @PlatinumDiscountDevices
  Scenario Outline: VYPE_4346_Platinum_Discount_Devices_TC003
    Given User enters email "<UN>" and password "<pwd>"
    When User clicks on My Rewards link
    Then rewards page should be displyed with platinum user
    Then hower on shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then verify the price in cart
    Then add device discount badge in checkout page for platinum user
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                   | pwd      | DeviceColour|UserCardNumber    |UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |telvi@bat.com  | TEST1234 | Pink        |5555555555554444  |0923               |         123 | CANADA VYPE USER |
      
   
   #-----------------------------------------------------------------------  
  #Description - "The purpose of this test case is to verify discount on devices for Premium User,Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 28,2022
  #Test Case -  VYPE_4346_Premium_Discount_Devices_TC004
  #Note: For supreme user also same following steps
  @PremiumDiscountDevices @SupremeDiscountDevices
  Scenario Outline: VYPE_4346_Premium_Discount_Devices_TC004
    Given User enters email "<UN>" and password "<pwd>"
    When User clicks on My Rewards link
    Then rewards page should be displyed with premium user
    Then hower on shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then verify the price in cart
    Then add device discount badge in checkout page for premium user
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                   | pwd      | DeviceColour|UserCardNumber    |UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |doll@bat.com  | TEST1234 | Pink        |5555555555554444  |0923               |         123 | CANADA VYPE USER |
      
      
   #-----------------------------------------------------------------------  
  #Description - "The purpose of this test case is to verify discount on devices for Premium User,Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 28,2022
  #Test Case -  VYPE_4346_Supreme_Discount_Devices_TC004
  #Note: For supreme user also same following steps
  @SupremeDiscountDevices
  Scenario Outline: VYPE_4346_Premium_Discount_Devices_TC004
    Given User enters email "<UN>" and password "<pwd>"
    When User clicks on My Rewards link
    Then rewards page should be displyed with premium user
    Then hower on shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then verify the price in cart
    Then add device discount badge in checkout page for premium user
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page

    Examples: 
      | UN                   | pwd      | DeviceColour|UserCardNumber    |UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |stokes@bat.com  | TEST1234 | Pink        |5555555555554444  |0923               |         123 | CANADA VYPE USER |
  
  #-----------------------------------------------------------------------  
  #Description - "The purpose of this test case is to verify discount on devices for Silver User.- Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 28,2022
  #Test Case -  VYPE_4346_Silver_Discount_ Devices_TC001
  @SilverDiscountDevices
  Scenario Outline: VYPE_4346_Silver_Discount_ Devices_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User clicks on My Rewards link
    Then rewards page should be displyed with platinum user
    Then hower on shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart
    Then verify the price in cart
    Then verify discount on device badge is not displayed
   

    Examples: 
      | UN                   | pwd      | DeviceColour|
      |paris@bat.com         | TEST1234 | Pink |
      
   