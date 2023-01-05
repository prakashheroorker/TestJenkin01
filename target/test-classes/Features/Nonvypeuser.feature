#Feature: Nonvype user
#
  #Background: 
    #Given User is on pre-login page
#
  #Description - verify the Amount left to next tier for vype + members - to push them to level up and Show how you will benefiis displayed for the non-vype+ users to reach to SILVER PROFILE
  #Developed By - Bhavitha
  #Date - November 26,2021
  #Test Case - GVCA_nonvypeuser_01_TC001
  #@GVCA_nonvypeuser_01_TC001
  #Scenario Outline: GVCA_nonvypeuser_01_TC001
    #Given User enters email "<UN>" and password "<pwd>"
    #When Hower on Shop and click on ePodtwo pods
    #Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    #And Add quantity for onetime purchase and click on add to cart
    #When Navigate to cart page
    #Then Verify how you will benefit
    #And Add quantity to reach sliver profile
    #When User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then verify order confirmation page
    #When Click Rewards Page Is
    #Then Verify silver status progress and Check Discount,other benefits displayed
    #And Verify the progress bar
    #And verify existing payment method and delete the payment method
#
    #Examples: 
      #| UN                    | pwd      | flavor       | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| breanne.betts@bat.com | TEST1234 | Passionfruit | 4444333322221111 |               0723 |         123 | jamie kulas      |
#
  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_Nonvype+Newuser_03_TC001
  #Objectives: The Purpose of this test case is to verify the vype + benefits are displayed
  # in the cart page for consumers who are not active members i.e,, Nonvpe+ New users (show what is need for them to become Vype + members)
  #Note -Shop only for epod pods as the epen products are delisting.
  #Author: Harika
  #Date: 01/12/2021
  #@GoldenRegressionSuite @GVCA_NonVype_NewUser_03_TC001
  #Scenario Outline: GVCA_NonVype_NewUser_03_TC001
    #Given user login with valid email address "<username>" and password "<password>"
    #When User navigates to ePod pods page
    #And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
    #And User navigates to Cart page and verifies the Order details
    #And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted successfully
    #And User verifies the submitted order in Orders page and reward category is updated as "<RewardStatus>"
#
    #Examples: 
      #| username              | password | flavor | quantity | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | RewardStatus |
      #| garett.martin@bat.com | TEST1234 | Lychee |        8 | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | Silver       |
