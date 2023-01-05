Feature: Mix & Match : 5 & 2 Pack Bundle

  Background: 
    Given User is on pre-login page in mobile
    

  #Test Case - GVCA_Add_2Packs_RegularFLow_Multipack_Mobile
  #Description - The purpose of this testcase is to verify 18% discount is applied when any user selects 2 pods
  #Updated 19-22 lines by - Akhila
  #Date -Dec 15,2022
  @mix02
  Scenario Outline: GVCA_Add_2Packs_RegularFLow_Multipack_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on Save
    And Click on Multipack two
    Then Verify the ePod Vape pods page is displayed in mobile
    When Add any two LEP flavors "<flavors>" from epod vape pods page in mobile
    And Add any two Non LEP Flavors "<Flavors>" from epod vape pods page in mobile
    And Navigate to cart page and verify the cart page
    Then Verify the MultiPack2 and LEP MultiPack2  discount is applied in mobile
    When Click on checkout
    Then Verify Congratulations pop up will get and close it
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    

    Examples: 
      | UN                  | pwd      | flavors        |Flavors                           | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |delivery             |
      | ashley.ledo@bat.com | TEST1234 | Clear,Peach    | Iced Cherry,Iced Pineapple Peach |5555 5555 5555 4444 |               1024 |         190 | mallory Stokes   |Canada Post (Express)|

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -GVCA_Add_5Packs_RegularFLow_Multipack_Mobile
  #Description - The purpose of this testcase is to verify 21% discount is applied when any user selects 5 pods
  #Updated 12-35 lines by - Akhila
  #Date -Dec 15,2022
  @mix03
  Scenario Outline: GVCA_Add_5Packs_RegularFLow_Multipack_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on Save
    And Click on Multipack two
    Then Verify the ePod Vape pods page is displayed in mobile
    When Add any five LEP flavors "<flavors>" from epod vape pods page in mobile
    And Add any five Non LEP Flavors "<Flavors>" from epod vape pods page in mobile
    And Navigate to cart page and verify the cart page
    Then Verify the MultiPackFive and LEP MultiPackFive discount is applied in mobile
    When Click on checkout
    Then Verify Congratulations pop up will get and close it
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    

    Examples: 
      | UN                  | pwd      | flavors                                       |Flavors                                                                                     | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |delivery             |
      | ashley.ledo@bat.com | TEST1234 | Clear,Peach,Blueberry,Smooth Mint,Vibrant Mix |Iced Cherry,Iced Pineapple Peach,Iced Watermelon Berry,Mandarin Cinnamon,Strawberry Rhubarb | 5555 5555 5555 4444 |               1024 |         190 | mallory Stokes   |Canada Post (Express)|
#----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------






  #Test Case:VYPE1793_Mix & Match:5 Pack Bundle_E2E_FLow_TC003
  #Objective:The purpose of this testcase is to verify the E2E flow for Mix & Match : 5 Pack Bundle in mobile
  #Author: Harsha Kumar
  #Date: 17/11/2021
  #@mixandmatch
  #Scenario Outline: VYPE1793_MixAndMatch_5Pack_Bundle_E2E_FLow_TC003
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then click on create on mix and match five pack bundle and verify page
    #Then user selects any five flavors "<flavors>" and add to cart
    #Then Hower on cart icon and click on view cart
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                    | pwd      | flavors                                            | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| annil.ramroop@bat.com | TEST1234 | Blood Orange,Watermelon,Iced Mango,Berry,Blueberry | 4444333322221111 |               1123 |         190 | charles  stehr   |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case:GVCA_Vype1793_MixAndMatch2PackBundleE2EFLow_TC003
  #Objective:The purpose of this testcase is to verify the E2E flow for Mix & Match : 2 Pack Bundle in mobile
  #Author: Bhavitha
  #Date: 19/01/2022
  #@mixandmatch2PackBundle
  #Scenario Outline: GVCA_Vype1793_MixAndMatch2PackBundleE2EFLow_TC003
    #Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #When User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then click on create on mix and match two pack bundle and verify page
    #When user selects any two flavors "<flavors>" and add to cart
    #When Hower on cart icon and click on view cart
    #And click on checkout and verify checkout page
    #And click on go to delivary and verify shipping options
    #And click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #Then verify order confirmation and order number
#
    #Examples: 
      #| UN                    | pwd      | flavors                 | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| annil.ramroop@bat.com | TEST1234 | Blood Orange,Watermelon | 4444333322221111 |               1123 |         190 | charles  stehr   |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_Addind_2Packs_RegularFLow_TC005
  #Description - The purpose of this testcase is to verify the discount should  work if user selects 2 random packs from the regular flow.
  #Developed By - Harika K
  #Date - February 24,2022
  #@mix01
  #Scenario Outline: GVCA_Vype1793_Addind_2Packs_RegularFLow_TC005
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then verify mix and match bundles present in pods page
    #When user selects any two flavors "<flavors>" and add to cart
    #And navigate to cart page and verify Discount
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                   | pwd      | flavors          | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| titus.pouros@bat.com | TEST1234 | Clear,Strawberry | 34343434343434 |               0723 |         123 | mallory Stokes   |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Vype1793_Addind_5Packs_RegularFLow_TC006
  #Description - The purpose of this testcase is to verify the discount should  work if user selects 5 random packs from the regular flow.
  #Developed By - Harika K
  #Date - February 24,2022
  #@mix02
  #Scenario Outline: GVCA_Vype1793_Addind_5Packs_RegularFLow_TC006
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then verify mix and match bundles present in pods page
    #When user selects any five flavors "<flavors>" and add to cart
    #And navigate to cart page and verify Discount
    #Then click on checkout and verify checkout page
    #Then click on go to delivary and verify shipping options
    #Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    #And verify order confirmation and order number
#
    #Examples: 
      #| UN                   | pwd      | flavors                                            | UserCardNumber | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| titus.pouros@bat.com | TEST1234 | Forest Mint,Clear,Strawberry,Blueberry,Smooth Mint | 34343434343434 |               0723 |         123 | mallory Stokes   |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
  