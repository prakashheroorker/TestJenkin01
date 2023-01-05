#Feature: Silver Profile Trigger
#
  #Background: 
    #Given User is on pre-login page
#
  #Test Case - GVPCA_SilverProfileTrigger_01_TC001
  #Description - The purpose of this Test Case is to verify the Silver profile when user purchase more than $ 100 or equals to $100
  #Developed By - Vinod Markandan
  #Date - November 18,2021
  #Pre-Requisite - Need a new Vuse+ user
  #@GoldenRegressionSuite @GVPCA_SilverProfileTrigger_01_TC001
  #Scenario Outline: GVPCA_SilverProfileTrigger_01_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to ePod pods page
    #And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
    #And User navigates to Cart page and verifies the Order details
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is updated as "<RewardStatus>"
#
    #Examples: 
      #| username           | password | flavor | quantity | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| sana.saeed@bat.com | TEST1234 | Berry  |        8 | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Silver       |
#
  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVPCA_SilverProfileTrigger_03_TC001
  #Description - The purpose of this Test case is to verify user cannot achieve Silver Vype Plus eligibility status when the purchase is less than $100
  #Developed By - Vinod Markandan
  #Date - November 25,2021
  #Pre-Requisite - Need a New Vuse User
  #@GVPCA_SilverProfileTrigger_03_TC001
  #Scenario Outline: GVPCA_SilverProfileTrigger_03_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to Rewards page
    #Then verifies the amount to be spend to upgrade to Silver status
    #When User navigates to ePod pods page
    #And User selects required product "<flavor>" for one time purchase and add to the cart
    #And User navigates to Cart page and purchases below the Silver benefits spend value
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is NOT updated as Silver and remains as "<RewardStatus>"
#
    #Examples: 
      #| username            | password | flavor      | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| paul.talbot@bat.com | TEST1234 | Lemon Berry | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Silver       |
