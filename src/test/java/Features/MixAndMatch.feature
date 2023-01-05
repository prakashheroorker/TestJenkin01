@mixandmatch
Feature: to verify the UI of Vype plus page.

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_VypeE1793_MixAndMatch_5Pack_Bundle_E2E_FLow_TC003
  #Description - The purpose of this testcase is to verify the E2E flow for Mix & Match : 5 Pack Bundle.
  #Developed By - Harsha Kumar
  #Date - October 7,2021
  #@mix01
  #Scenario Outline: GVCA_VypeE1793_MixAndMatch_5Pack_Bundle_E2E_FLow_TC003
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    #Then click on create on Mix and Match five Pack Bundle
    #Then add any five flavors "<flavors>" in Mix and Match five Pack Bundle and click on add to cart
    #And navigate to cart page and verify Discount
    #And click on checkout and navigate to delivary page
    #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation page
#
    #Examples: 
      #| UN                   | pwd      | flavors                                       | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| titus.pouros@bat.com | TEST1234 | Blood Orange,Mango,Lychee,Cucumber,Polar Mint | 34343434343434 |               0723 |         123 | mallory Stokes   |
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_Addind_2Packs_RegularFLow_TC005
  #Description - The purpose of this testcase is to verify the discount should  work if user selects 2 random packs from the regular flow.
  #Developed By - Harsha Kumar
  #Date - October 13,2021
  @mix02
  Scenario Outline: GVCA_Vype1793_Addind_2Packs_RegularFLow_TC005
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    Then Add any two flavors "<flavors>" from epod pods page
    And navigate to cart page and verify Discount
    And click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page

    Examples: 
      | UN                   | pwd      | flavors     | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | ashley.ledo@bat.com | TEST1234 | Clear,Peach | 5555 5555 5555 4444 |               1024 |         190| mallory Stokes   |

#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_Addind_5Packs_RegularFLow_TC006
  #Description - The purpose of this testcase is to verify the discount should  work if user selects 5 random packs from the regular flow.
  #Developed By - Harsha Kumar
  #Date - October 18,2021
  @mix03
  Scenario Outline: GVCA_Vype1793_Addind_5Packs_RegularFLow_TC006
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    Then Add any five flavors "<flavors>" from epod pods page
    And navigate to cart page and verify Discount
    And click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page

    Examples: 
      | UN                   | pwd      | flavors                                            | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |ashley.ledo@bat.com | TEST1234 | Strawberry,Peach,Blueberry,Smooth Mint,Smooth Mint | 5555 5555 5555 4444 |               1024 |         190 | mallory Stokes   |
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_MixAndMatch2PackBundleE2EFLow_TC003
  #Description - The purpose of this testcase is to verify the E2E flow for Mix & Match : 2 Pack Bundle.
  #Developed By - Harsha Kumar
  #Date - October 7,2021
  #@mix04
  #Scenario Outline: GVCA_Vype1793_MixAndMatch2PackBundleE2EFLow_TC003
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    #Then click on create on Mix and Match two Pack Bundle
    #Then add any two flavors "<flavors>" in Mix and Match two Pack Bundle and click on add to cart
    #And navigate to cart page and verify Discount
    #And click on checkout and navigate to delivary page
    #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation page
#
    #Examples: 
      #| UN                   | pwd      | flavors               | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| titus.pouros@bat.com | TEST1234 | Cool Peppermint,Mango | 34343434343434 |               0723 |         123 | mallory Stokes   |
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_MixAndMatch_2Pack_Bundle_UI_TC001
  #Description - The purpose of this testcase is to verify the UI of the Mix & Match : 2Pack Bundle.
  #Developed By - Harsha Kumar
  #Date - October 26,2021
  #@mix05
  #Scenario Outline: GVCA_Vype1793_MixAndMatch_2Pack_Bundle_UI_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    #Then click on create on Mix and Match two Pack Bundle
    #Then Then verify left and right half of two pack bundle page
    #Then verify flavors present in multi pack bundle page
    #Then add any two flavors "<flavors>" in Mix and Match two Pack Bundle and click on add to cart
    #And navigate to cart page and verify Discount
    #Then remove and add product and verify discount respectively
#
    #Examples: 
      #| UN                   | pwd      | flavors                   |
      #| titus.pouros@bat.com | TEST1234 | Cool Peppermint,Blueberry |
#	#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_MixAndMatch_5Pack_Bundle_UI_TC001
  #Description - The purpose of this testcase is to verify the UI of the Mix & Match : 5Pack Bundle.
  #Developed By - Harsha Kumar
  #Date - October 26,2021
  #@mix06
  #Scenario Outline: GVCA_Vype1793_MixAndMatch5PackBundleUI_TC002
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When Hower on Shop and click on ePodtwo pods
    #Then verify mix and match bundles present in pods page
    #Then click on create on Mix and Match five Pack Bundle
    #Then verify left and right half of five pack bundle page
    #Then verify flavors present in multi pack bundle page
    #Then add any five flavors "<flavors>" in Mix and Match five Pack Bundle and click on add to cart
    #And navigate to cart page and verify Discount
    #Then remove and add product and verify discount respectively
#
    #Examples: 
      #| UN                   | pwd      | flavors                                             |
      #| titus.pouros@bat.com | TEST1234 | Cool Peppermint,Blueberry,Lychee,Blood Orange,Berry |
