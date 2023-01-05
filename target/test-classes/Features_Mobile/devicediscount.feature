@Discount_Devices
Feature: Discounts

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Description - "The purpose of this test case is to verify discount on devices for Gold User- Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - July 01,2022
  #Test Case -  VYPE_4346_Gold_Discount_Devices_Mobile_TC002
  #@GoldDiscountDevices
  Scenario Outline: VYPE_4346_Gold_Discount_Devices_Mobile_TC002
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify MyRewards page is displyed with golden user in mobile
    Then click on hamburger menu and click shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart in mobile
    Then Hower on cart icon and click on view cart
    Then add device discount badge for add promotions option in checkout page in mobile
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN           | pwd      | DeviceColour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha01@bat.com | TEST1234 | Pink         | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |

  #-----------------------------------------------------------------------
  #Description - ""The purpose of this test case is to verify discount on devices for Platinum User Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 27,2022
  #Test Case -  VYPE_4346_Platinum_Discount_Devices_Mobile_TC003
  @PlatinumDiscountDevices
  Scenario Outline: VYPE_4346_Platinum_Discount_Devices_Mobile_TC003
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify MyRewards page is displyed with golden user in mobile
    Then click on hamburger menu and click shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart in mobile
    Then Hower on cart icon and click on view cart
    Then add device discount badge for add promotions option in checkout page for platinum user in mobile
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN            | pwd      | DeviceColour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha02@bat.com | TEST1234 | Pink         | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |

  #-----------------------------------------------------------------------
  #Description - "The purpose of this test case is to verify discount on devices for Premium User,Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 28,2022
  #Test Case -  VYPE_4346_Premium_Discount_Devices_Mobile_TC004
  #Note: For supreme user also same following steps
 @pls @PremiumDiscountDevices
  Scenario Outline: VYPE_4346_Premium_Discount_Devices_Mobile_TC004
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify MyRewards page is displyed with golden user in mobile
    Then click on hamburger menu and click shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart in mobile
    Then Hower on cart icon and click on view cart
    Then add device discount badge for add promotions option in checkout page for premium user in mobile
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                      | pwd      | DeviceColour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | deb.dumas@bat.com | TEST1234 | Pink         | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |

  #-----------------------------------------------------------------------
  #Description - "The purpose of this test case is to verify discount on devices for Supreme User,Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - June 28,2022
  #Test Case -  VYPE_4346_Supreme_Discount_Devices_TC005
  #Note: For supreme user also same following steps
  @pls @SupremeDiscountDevices
  Scenario Outline: VYPE_4346_Supreme_Discount_Devices_TC005
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify MyRewards page is displyed with golden user in mobile
    Then click on hamburger menu and click shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart in mobile
    Then Hower on cart icon and click on view cart
    Then add device discount badge for add promotions option in checkout page for premium user in mobile
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN             | pwd      | DeviceColour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Pink         | 5555555555554444 |               0923 |         123 | CANADA VYPE USER |

  #premium@bat.com
  #-----------------------------------------------------------------------
  #Description - "The purpose of this test case is to verify discount on devices for Silver User.- Applying the badge in Cart summary Page manually and checking for discount."
  #Developed By - Akhila
  #Date - July 01,2022
  #Test Case -  VYPE_4346_Silver_Discount_ Devices_Mobile_TC001
  @pls @SilverDiscountDevices
  Scenario Outline: VYPE_4346_Silver_Discount_ Devices_Mobile_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify MyRewards page is displyed with golden user in mobile
    Then click on hamburger menu and click shop and click on all epod devices
    And user engrave the device by selecting DeviceColour "<DeviceColour>" and add to cart in mobile
    Then Hower on cart icon and click on view cart
    Then verify discount on device badge is not displayed in mobile

    Examples: 
      | UN              | pwd      | DeviceColour |
      | jody.sewell@bat.com | TEST1234 | Pink         |
