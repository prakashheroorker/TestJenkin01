Feature: Benefits_Rewards

  Background: 
    Given User is on pre-login page

  #Description - "Description: The purpose of this test case is To verify Current Points in Rewards tab,To verify Points earned by silver user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 23,2022
  #Test Case -  VYPE_4346_Silver Benefits_TC001
  @Benefits11 
  Scenario Outline: VYPE_4346_Silver_Benefits_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify Whether Silver graph Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted successfully
    And verify the purchase points in the rewards page

    Examples: 
      | UN               | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | BHrIkBjc@bat.com | TEST1234 | Passionfruit | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------
  #Description - "Description:"1. User should have valid credentials (Gold user Credentials)2. User should be already Opted - In for Vuse+ Rewards Program."
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 23,2022
  #Test Case -   VYPE_4346_ Gold  Benefits_TC001
  @Benefits12  @batchrun18July
  Scenario Outline: VYPE_4346_Gold_Benefits_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify Whether gold graph Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted successfully
    And verify the purchase points in the rewards page

    Examples: 
      | UN               | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | FYTcHmUX@bat.com | TEST1234 | Passionfruit | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #-------------------------------------------------------------------------------------------------------------------
  #Description - "Description: The purpose of this test case is  To verify Current Points in the Rewards tab,To verify Points earned by Platinum user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 24,2022
  #Test Case -    VYPE_4346_Platinum_Benefits_TC001
  @Benefits13  @batchrun18July
  Scenario Outline: VYPE_4346_Platinum_Benefits_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify Whether Platinum graph Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted successfully
    And verify the purchase points in the rewards page

    Examples: 
      | UN            | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | paris@bat.com | TEST1234 | Passionfruit | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------------
  #Description - "Description: The purpose of this test case is To verify Current Points in the Rewards tab, To verify Points earned by Premium user for the purchased item."
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 24,2022
  #Test Case -    VYPE_4346_Premium_Benefits_TC001
  @Benefits14  
  Scenario Outline: VYPE_4346_Premium_Benefits_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify Whether Premium graph Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted successfully
    And verify the purchase points in the rewards page

    Examples: 
      | UN            | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | linyi@bat.com | TEST1234 | Passionfruit | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |

  #------------------------------------------------------------------------------------------------------------------------------------------
  #Description - "1. User should have valid credentials (Supreme user Credentials), User should be already Opted - In for Vuse+ Rewards Program.
  #Developed By - Vishnu Vardhan Reddy
  #Date - june 24,2022
  #Test Case -     VYPE_4346_Supreme_Benefits_TC001
  @Benefits15  
  Scenario Outline: VYPE_4346_Supreme_Benefits_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When User navigates to Rewards page
    Then Verify Whether Supreme graph Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted successfully
    And verify the purchase points in the rewards page

    Examples: 
      | UN              | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | charlie@bat.com | TEST1234 | Passionfruit | 5555 5555 5555 4444 |               0326 |         159 | CANADA VYPE USER |
