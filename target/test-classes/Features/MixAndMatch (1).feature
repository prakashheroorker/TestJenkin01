@mixandmatch
Feature: to verify the UI of Vype plus page.

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_Add_2Packs_RegularFLow_Multipack
  #Description - The purpose of this testcase is to verify 18% discount is applied when any user selects 2 pods
  #Updated 19-22 lines by - Akhila
  #Date -Dec 13,2022
  @mix02
  Scenario Outline: GVCA_Add_2Packs_RegularFLow_Multipack
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on multipack2
    Then Verify the ePod Vape pods page is displayed
    When Add any two LEP flavors "<flavors>" from epod vape pods page
    And Add any two Non LEP Flavors "<Flavors>" from epod vape pods page
    And User navigates to Cart page
    Then Verify the MultiPack2 and LEP MultiPack2  discount is applied
    When Click on Checkout button
    Then Verify Congratulations pop up will get and close it
    And Verify Shipping page is and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    

    Examples: 
      | UN                  | pwd      | flavors                       |Flavors                           | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |delivery             |
      | ashley.ledo@bat.com | TEST1234 | Clear,Peach                  | Iced Cherry,Iced Pineapple Peach |5555 5555 5555 4444 |               1024 |         190 | mallory Stokes   |Canada Post (Express)|

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -GVCA_Add_5Packs_RegularFLow_Multipack
  #Description - The purpose of this testcase is to verify 21% discount is applied when any user selects 5 pods
  #Updated 12-35 lines by - Akhila
  #Date -Dec 13,2022
  @mix03
  Scenario Outline: GVCA_Add_5Packs_RegularFLow_Multipack
   When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Save and click on multipack2
    Then Verify the ePod Vape pods page is displayed
    When Add any five LEP flavors "<flavors>" from epod vape pods page
    And Add any five Non LEP Flavors "<Flavors>" from epod vape pods page
    And User navigates to Cart page
    Then Verify the MultiPackFive and LEP MultiPackFive discount is applied
    When Click on Checkout button
    Then Verify Congratulations pop up will get and close it
    And Verify Shipping page is and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    

    Examples: 
      | UN                  | pwd      | flavors                                       |Flavors                                                                                     | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |delivery             |
      | ashley.ledo@bat.com | TEST1234 | Clear,Peach,Blueberry,Smooth Mint,Vibrant Mix |Iced Cherry,Iced Pineapple Peach,Iced Watermelon Berry,Mandarin Cinnamon,Strawberry Rhubarb | 5555 5555 5555 4444 |               1024 |         190 | mallory Stokes   |Canada Post (Express)|
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
