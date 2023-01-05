Feature: FAQS

  Background: 
    Given User is on pre-login page

  #Description - "The purpose of this test case is To verify FAQ's in the VUSE Rewards Page".
  #Developed By - Sireesha
  #Date - June 23,2022
  #Test Case - VYPE_4503_ VUSE REWARDS FAQ_TC001
  @VYPE_4503_VUSEREWARDSFAQ_TC001
  Scenario Outline: VYPE_4503_ VUSE REWARDS FAQ_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User Hower on save and click on Vuse+ rewards link
    Then Verify  VUSE REWARDS  Page should be displayed
    And scrolls to faqs and verify all faqs
    Then click on click here link under faqs list
    Then Verify the  Vuse+ Terms and Conditions Page is displayed as per the Production Site

    Examples: 
      | UN                 | pwd      |
      | akhila.cha@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------------------
  #Description - " The purpose of this test case is to verify all UI of Vuse + Rewards section in Rewards Landing page".
  #Developed By - Sireesha
  #Date - June 23,2022
  #Test Case - VYPE_4053_Vuse_plus_Rewards_TC001
  @VYPE_4053_Vuse_plus_Rewards_TC001
  Scenario Outline: VYPE_4053_Vuse_plus_Rewards_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User Hower on save and click on Vuse+ rewards link
    Then Verify  VUSE REWARDS  Page should be displayed
    Then verify the contents in the reward page
    When user click on join button
    Then verify the user redirects to the rewards page in the profile section

    Examples: 
      | UN               | pwd      |
      | FYTcHmUX@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------------------------------------
  #Description - " he purpose of this test case is to verify all UI of Vuse + Rewards benefits section in Rewards Landing page.".
  #Developed By - Sireesha
  #Date - June 23,2022
  #Test Case -VYPE_4053_Vuse_Rewards_Benefits_TC002
  @VYPE_4053_Vuse_Rewards_Benefits_TC002
  Scenario Outline: VYPE_4053_Vuse_Rewards_Benefits_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When User Hower on save and click on Vuse+ rewards link
    Then Verify  VUSE REWARDS  Page should be displayed
    Then verify the contents of rewards benfits in the reward page
    Then verify the contents of unlock badges in the reward page
    Then verify the contents of the page reak down  in the reward page
    When user click on join now  button
    Then verify the user redirects to the rewards page in the profile section

    Examples: 
      | UN               | pwd      |
      | FYTcHmUX@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------------
  #Description - The Purpose of this test case is to verify the UI of Rewards Page
  #Developed By - Sasikala
  #Date - June 23,2022
  #Test Case - VYPE_4346_Rewards UI_TC001
  @VYPE_4346_Rewards_UI
  Scenario Outline: VYPE_4346_Rewards UI_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify the Rewards page is displayed with relevant information
    Then verify the content and toggle in the rewards page

    Examples: 
      | UN                   | pwd      |
      | changyu.jung@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to the following.*Verify the ePod2+ badge is achieved on purchase of ePod2+ device*Verify the rewards points added on purchase of ePod2+
  #Developed By - Sasikala
  #Date - June 23,2022
  #Test Case - VYPE_4203_ePod2+_Badge_TC001
  @VYPE_4203_ePod2+_Badge 
  Scenario Outline: VYPE_4203_ePod2+_Badge_TC001
    When Clicked on Login or Sign up
    Then verify and click on login elements
    And click on signup for registration process
    When Signing with new email address Email and password "<pwd>"
    And Entering "<FN>" and "<LN>"
    Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions
    Then Clicking on Register
    When user hower on shop and click on epod2+ Devices
    Then verify the epod2+ device page and click on BUY NOW
    And user select device colour "<color>" and add to cart
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    When User navigates to Rewards page
    Then Verify the Rewards page is displayed with relevant information
    Then Verify the newly added points in the history and epod2+ badges under Your Achievements

    Examples: 
      | pwd      | FN   | LN   | DOB      | ADD                                                | PhNo           | color | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | TEST1234 | Rohan | Mathew | 19980919|29 30 Ave SW Calgary Alberta T2S 2Y4 Canada | 9-902-972-9012 | Black | 4444333322221111 |               1024 |         190 | keon auor        |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Description - The purpose of this Test Case is to verify the VUSE+ Rewards Banner on the Order Confirmation Page
  #Developed By - Sasikala
  #Date - June 24,2022
  #Test Case - VYPE_4040_VUSE+Rewards_OrderConfirmation
  @VYPE_4040_VUSE+Rewards_OrderConfirmation
  Scenario Outline: VYPE_4040_VUSE+Rewards_OrderConfirmation
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify the rewards Page
    When User navigates to ePod pods page
    And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
    And User navigates to Cart page
    Then verify the price in cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify order confirmation page
    And Verify the Vuse+ Rewards banner with earned points and balance points

    Examples: 
      | UN                  | pwd      | flavor      | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sarah.nilan@bat.com | TEST1234 | Lemon Berry |        1 | 4444333322221111 |               0425 |         123 | CANADA VYPE USER |
