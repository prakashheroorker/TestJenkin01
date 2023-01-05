#Feature: Gold Profile Trigger
#
  #Background: 
    #Given User is on pre-login page
#
  #Test Case - GVPCA_GoldProfileTrigger_01_TC001
  #Description - The purpose of this Test case is to verify following: 1. User eligibility requirements for the Gold Profile are triggered (achieved) by:-lifetime spend of $250 or more,subscription to newsletter,minimum of 1 (one) order per month. 2.Vype Plus status is confirmed / checked in the My Profile page, by directly clicking on Find out your status button
  #Developed By - Vinod Markandan
  #Date - November 19,2021
  #Pre-Requisite - Need a Vuse+ Silver User or a New User
  #@GVPCA_GoldProfileTrigger_01_TC001
  #Scenario Outline: GVPCA_GoldProfileTrigger_01_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to Rewards page
    #Then verifies the amount to be spend to upgrade to Gold status
    #When User navigates to ePod pods page
    #Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    #Then Add quantity for onetime purchase and click on add to cart
    #And User navigates to Cart page and adds required quantities to upgrade to Gold status
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is updated as Gold "<RewardStatus>"
#
    #Examples: 
      #| username              | password | flavor | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| lindsay.davis@bat.com | TEST1234 | Berry  | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Gold         |
#
  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVPCA_GoldProfileTrigger_03_TC001
  #Description - The purpose of this Test case is to verify user cannot achieve Gold Vype Plus eligibility status when the purchase is less than $250
  #Developed By - Vinod Markandan
  #Date - November 25,2021
  #Pre-Requisite - Need a Vuse+ Silver User or a New User
  #@GVPCA_GoldProfileTrigger_03_TC001
  #Scenario Outline: GVPCA_GoldProfileTrigger_03_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to Rewards page
    #Then verifies the amount to be spend to upgrade to Gold status
    #When User navigates to ePod pods page
    #Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    #Then Add quantity for onetime purchase and click on add to cart
    #And User navigates to Cart page and purchases below the Gold benefits spend value
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is NOT updated as Gold and remains as "<RewardStatus>"
#
    #Examples: 
      #| username           | password | flavor | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| ian.cabato@bat.com | TEST1234 | Berry  | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Silver       |
