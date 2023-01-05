@VUSEREWARDSUI
Feature: Verifing VUSe rewards page

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : VYPE_4503_ VUSE REWARDS FAQ_TC001_Mobile
  #Objectives:The purpose of this test case is To verify FAQ's in the VUSE Rewards Page.
  #Author: Sai sireesha
  #Date: 01/07/2022
  @FAQsMobile
  Scenario Outline: VYPE_4503_ VUSE REWARDS FAQ_TC001_Mobile
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User click on hamberger menu and clicks on Save
    And user clicks on Vuse Rewards
    Then Verify the Vuse rewards page
    And scrolls to faqs and verify all the faqs
    Then click on click here link under fqas
    Then verify the terms and conditions as per the production site

    Examples: 
      | UN                  | pwd      |
      | saisireesha@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------------------
  #Test Case : VYPE_4053_Vuse_plus_Rewards_TC001_Mobile
  #Objectives:The purpose of this test case is to verify all UI of Vuse + Rewards section in Rewards Landing page.
  #Author: Sai sireesha
  #Date: 01/07/2022
  @plusrewards
  Scenario Outline: VYPE_4053_Vuse_plus_Rewards_TC001_Mobile
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User click on hamberger menu and clicks on Save
    And user clicks on Vuse Rewards
    Then Verify the Vuse rewards page
    Then Verify the contents in the vuse rewards page
    When user clicks on join now in the vuse rewards page
    Then verify the user redirects to the rewards section in the profile page

    Examples: 
      | UN                  | pwd      |
      | saisireesha@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------------------------
  #Test Case : VYPE_4053_Vuse_Rewards_Benefits_TC002
  #Objectives:The purpose of this test case is to verify all UI of Vuse + Rewards section in Rewards Landing page.
  #Author: Sai sireesha
  #Date: 04/07/2022
  @rewardsbenefits
  Scenario Outline: VYPE_4053_Vuse_Rewards_Benefits_TC002
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User click on hamberger menu and clicks on Save
    And user clicks on Vuse Rewards
    Then verify the vuse rewards benefits content rewards page
    Then verify the unlock your vuse badges content rewards page
    Then verify the page break down content in rewards page
    When user clicks on join now button in the vuse rewards page
    Then verify the user redirects to the rewards section in the profile page

    Examples: 
      | UN                  | pwd      |
      | saisireesha@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------
  #Description - The Purpose of this test case is to verify the UI of Rewards Page
  #Developed By - Sasikala
  #Date - July  1,2022
  #Test Case - VYPE_4346_Rewards UI_TC001
  @VYPE_4346_Rewards_UI
  Scenario Outline: VYPE_4346_Rewards UI_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And user verify the Rewards page with relevent information
    And verify the content  displayed and toggle button in the rewards page
    

    Examples: 
      | UN                   | pwd      |
      | changyu.jung@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to the following.*Verify the ePod2+ badge is achieved on purchase of ePod2+ device*Verify the rewards points added on purchase of ePod2+
  #Developed By - Sasikala
  #Date - July  4,2022
  #Test Case - VYPE_4203_ePod2+_Badge_TC001
  @VYPE_4203_ePod2+_Badge
  Scenario Outline: VYPE_4203_ePod2+_Badge_TC001
    Then verify the username, password, login button fields in the login page
    And click on signup for registration process in mobile
    When Signing with new email address Email and password "<pwd>" by generating Email
    And Entering "<FN>" and "<LN>" for creating profile
    Then Entering dob "<DOB>" and address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions at end of the page
    Then Clicking on Register button
    Then User clicks on hamberger menu and clicks on Shop
    Then user clicks on epod2 vaping products and clicks on ePod2+ devices
    And verify epod2+ device page and click on BUY NOW
    Then Select device colour "<devicecolour>" and verify device images and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    Then User click on hamberger menu and clicks on My Rewards
    And user verify the Rewards page with relevent information
    Then Verify the newly added points in the history for epod purchase and epod2+ badges under Your Achievements

    Examples: 
      | pwd      | FN   | LN    | DOB      | ADD                                    | PhNo           | devicecolour | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | Test@1234 | sree | N | 19921020 | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 1-899-424-9220 | Black        | 4444333322221111 |               1024 |         190 | keon auor        |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - The purpose of this Test Case is to verify the VUSE+ Rewards Banner on the Order Confirmation Page
  #Developed By - Sasikala
  #Date - July  4,2022
  #Test Case - VYPE_4040_VUSE+Rewards_OrderConfirmation
  @VYPE_4040_VUSE+Rewards_OrderConfirmation
  Scenario Outline: VYPE_4040_VUSE+Rewards_OrderConfirmation
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the rewards Page wih current points
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number
    And Verify the Vuse+ Rewards banner with earned points and balance points in order confirmation page

    Examples: 
      | UN                  | pwd      | flavor | count | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | ester.sarah@bat.com | TEST1234 | Mango  |     1 | 4444333322221111 |               0425 |         123 | CANADA VYPE USER |
