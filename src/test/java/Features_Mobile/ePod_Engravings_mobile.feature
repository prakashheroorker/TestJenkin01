Feature: ePod_Engravings_mobile

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - GVCA_ePod2+Engraving_AllProducts1_E2E_Mobile
  #Description -  The purpose of this test case is to validate E2E flow of adding different epod2+ products to the cart and placing the order (Epod2+ Engraving - pattern, text-horizontal, skin - Collection X, flavour, Accessory - charging cable) through All pod devices.
  #Developed By - Sasikala
  #Date: 19 dec ,2022
  @Engraving_AllProducts1_E2E
  Scenario Outline: GVCA_ePod2+Engraving_AllProducts1_E2E_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When Swipe to engraving and click on engraving
    Then Verify the engravings page with the relevent content
    When Select device colour "<devicecolour>" and click on pattern
    Then Verify the choose the pattern page
    When Select pattern "<pattern>" and click on Add pattern
    Then Verify text tile is displayed
    When User click on text  and verify add text to your device page
    And Click on Direction "<TextDirection>" and enter the "<Text>"
    And Select the Font style "<FontStyle>" and click on add text
    Then Verify Engraving summary page
    When Click on add to cart and verify Cart page is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigate to ePod Devices page
    When User clicks on skins then verify Device Skins screen is displayed
    And Click on Epod2 plus Collections X then Verify the epod2 plus Collection X skin options are displayed
    And User select any Epod2 plus Collection X "<Skin>" and click on buy now and verify it added to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When User clicks on pods and verify ePod Pods screen is displayed
    And User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When scroll to Accessories and click on Accessories
    Then Verify accessories page with relevent content is displayed
    When User click on add to cart under charging cable accessories
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    And Verify Shipping Page is and One time Purchase details are dispalyed
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
      | UN                     | pwd      | devicecolour | pattern | TextDirection | FontStyle | Text    | flavor      | count | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Gold         | Arid    | Horizontal    | Ahamono   | Engrave | Lemon Berry |     1 | twilight | Fedex    | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

  #------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2EngravingE2E_AllProducts1_E2E_Mobile
  #Description -  The purpose of this test case is to validate E2E flow of adding different epod2 products to the cart and placing the order (Epod2 Engraving - pattern, text-horizontal, skin - Collection X, flavour, Accessory - pod Caps) through header navigation.
  #Developed By - Sasikala
  #Date: 16 dec ,2022
  @GVCA_ePod2EngravingE2E_AllProducts1_E2E
  Scenario Outline: GVCA_ePod2EngravingE2E_AllProducts1_E2E_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on personalize your epod and clicks on engravings
    Then Verify the engravings page with the relevent content
    When User click on ePod2 button and verify the relevent content
    And Select device colour "<devicecolour>" and click on pattern
    Then Verify the choose the pattern page
    When Select pattern "<pattern>" and click on Add pattern
    Then Verify text tile is displayed
    When User click on text  and verify add text to your device page
    And Click on Direction "<TextDirection>" and enter the "<Text>"
    And Select the Font style "<FontStyle>" and click on add text
    Then Verify Engraving summary page
    When Click on add to cart and verify Cart page is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    When Click on Epod2 Collections X then Verify the epod2 Collection X skin options are displayed
    And User select any Collection X "<Skin>" and click on buy now and verify it added to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on Accessories
    Then Verify accessories page with relevent content is displayed
    When User click on add to cart under Podcaps accessories
    And User click on add to cart under charging cable accessories
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
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
      | UN                     | pwd      | devicecolour | pattern | TextDirection | FontStyle | Text    | flavor      | count | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Gold         | Arid    | Horizontal    | Ahamono   | Engrave | Lemon Berry |     1 | twilight | Fedex    | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2+Engraving_AllProducts2_E2E_mobile
  #Description -   The purpose of this test case is to validate E2E flow of adding different epod2+ products to the cart and placing the order (Epod2+ Engraving -mini icon, text-vertical, skin - Core Collection, flavour, Accessory - rings) through header navigation.
  #Developed By - Sasikala
  #Date: 16 dec ,2022
  @Engraving_AllProducts2_E2E2_mobile
  Scenario Outline: GVCA_ePod2+Engraving_AllProducts2_E2E_mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on personalize your epod and clicks on engravings
    Then Verify the engravings page with the relevent content
    When Select device colour "<devicecolour>" and click on mini icon
    And user select device design style as Mini Icon to select "<Miniicon>"in mobile
    Then Verify text tile is displayed
    When User click on text  and verify add text to your device page
    And Click on Direction "<TextDirection>" and enter the "<Text>"
    And Select the Font style "<FontStyle>" and click on add text
    Then Verify Engraving summary page
    When Click on add to cart and verify Cart page is displayed
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on personalize your epod and click on Shop device skin
    Then Verify device skins  page is displayed
    When Click on Core collection dropdown then verify it is expanded
    And Click on Collection x  dropdown then verify it is expanded
    And Click on Epod2 plus Core collections then Verify the epod2 plus Core collection skin options are displayed
    And User select any Epod2 pluscore Collection "<Skin>" and click on buy now and verify it added to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on epod vaping products and clicks on pods
    Then Verify pods page is displayed
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on Accessories
    Then Verify accessories page with relevent content is displayed
    When User select the Design "<ring>" and click on add
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    #When Click on checkout
    #And Verify Shipping Page is and One time Purchase details are dispalyed
    #When Click on Go to Delivery button
    #Then Verify Delivery and One Time Purchase details are dispalyed
    #And Verify all delivery Options are dispalyed
    #When Select "<delivery>" Option and Click on Go To Billing button
    #Then Verify Billing Page and One Time Purchase details dispalyed
    #When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    #And Click On terms and conditions check box and verify submit order button is enabled
    #And Click On Submit Order button
    #Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      | devicecolour | Miniicon | PatternName | TextDirection | FontStyle | Text | flavor | count | Skin  | delivery | ring | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Red          | Arro     | Dash        | Vertical      | Fusterd   | abc  | Mango  |     1 | amber | Fedex    | leaf   | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

      
      #--------------------------------------------------------------------------------------------------------------
      #Test Case - GVCA_ePod2Engraving_AllProducts2_E2E_Mobile
  #Description - The purpose of this test case is to validate E2E flow of adding different epod2 products to the cart and placing the order (Epod2 Engraving - Mini icon, text-Vertical, skin - Core Collection, flavour, Accessory - Rings) through All pod devices.
  #Updated by - Harika
  #lines added: 17 to28,36 to 40
  #Date: 15 dec ,2022
  @GVCA_ePod2Engraving_AllProducts2_E2E_Mobile
  Scenario Outline: GVCA_ePod2Engraving_AllProducts2_E2E_Mobile
   
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    And Click on ePod2 button and verify ePod2 devices are displayed
    And Swipe to click on engraving tile
    Then Verify the engravings page with the relevent content
    When User selects device colour as "<DeviceColour>"
    And User select device design style as Mini Icon to select "<Miniicon>"
    And User customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then Verify Engraving summary and Add to cart
    When User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    And Swipe to click on skins tile and verify skins screen
    And Click on core collection dropdown then verify it is expanded
    And User select any core collection "<Skin>" and click on buy now and verify it added to cart
    And User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    And Click on ePod2 button and verify ePod2 devices are displayed
    And Swipe to click on pods tile and verify pods screen
    When User swipe down and selects flavor "<flavor>" with desired count "<count>" and add to cart
    When User clicks on hamburger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    And Click on ePod2 button and verify ePod2 devices are displayed
    And scroll to Accessories and click on Accessories
    When Click on epodtwo rings select "<ring>" design and click on add from Acccessories page
    And Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    And Verify Shipping Page is and One time Purchase details are dispalyed
    And Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    When Click On Submit Order button
    #Then Verify Order confirmation page is displayed with relevent content
    #When User clicks on hamburger menu and verify logout link is displayed
    #And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN               | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text | flavor      | count | Skin  | ring   | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Black        | Glow     | Vertical      | Ahamono   | Mal  | Forest Mint |     1 | amber | x-ring | Fedex    | 5555555555554444 |               1024 |         197 | keon auer        |