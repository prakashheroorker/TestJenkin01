#Feature: Platinum Profile Trigger
#
  #Background: 
    #Given User is on pre-login page
#
  #Test Case - GVPCA_PlatinumProfileTrigger_01_TC001
  #Description - Verify the following:User eligibility requirements for the Platinum Profile are triggered (achieved) by:- lifetime spend of $400 or more- subscription to newsletter- minimum of 1 (one) order per monthVype Plus status is confirmed / checked in the My Profile page, by directly clicking on Find out your status button
  #Developed By - Vinod Markandan
  #Date - November 19,2021
  #Pre-Requisite - Need a Vuse+ Gold user
  #@GVPCA_PlatinumProfileTrigger_01_TC001
  #Scenario Outline: GVPCA_PlatinumProfileTrigger_01_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to Rewards page
    #Then verifies the amount to be spend to upgrade to Platinum status
    #When User navigates to ePod pods page
    #And User selects required product "<flavor>" for one time purchase and add to the cart
    #And User navigates to Cart page and adds required quantities to upgrade to Platinum status
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is updated as Platinum "<RewardStatus>"
    #And Order is Cancelled successfully
#
    #Examples: 
      #| username               | password | flavor | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| mallory.stokes@bat.com | TEST1234 | Lychee | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Platinum     |
#
  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVPCA_PlatinumProfileTrigger_03_TC001
  #Description - The purpose of this Test case is to verify user cannot achieve Platinum Vype Plus eligibility status when the purchase is less than $400
  #Developed By - Vinod Markandan
  #Date - November 25,2021
  #Pre-Requisite - Need a Vuse+ Gold User or a New User
  #@GVPCA_PlatinumProfileTrigger_03_TC001
  #Scenario Outline: GVPCA_PlatinumProfileTrigger_03_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to Rewards page
    #Then verifies the amount to be spend to upgrade to Platinum status
    #When User navigates to ePod pods page
    #Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    #Then Add quantity for onetime purchase and click on add to cart
    #And User navigates to Cart page and purchases below the Platinum benefits spend value
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is NOT updated as Platinum and remains as "<RewardStatus>"
#
    #Examples: 
      #| username              | password | flavor | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| abigale.hoppe@bat.com | TEST1234 | Lychee | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Gold         |
