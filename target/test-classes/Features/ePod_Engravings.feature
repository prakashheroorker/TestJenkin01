Feature: Epod_Engravings

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_ePod2+Engraving_AllProducts1_E2E
  #Description -  The purpose of this test case is to validate E2E flow of adding different epod2+ products to the cart and placing the order (Epod2+ Engraving - pattern, text-horizontal, skin - Collection X, flavour, Accessory - charging cable) through All pod devices.
  #Developed By - Sasikala
  #Date: 16 dec ,2022
  @Engraving_AllProducts1_E2E
  Scenario Outline: GVCA_ePod2+Engraving_AllProducts1_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page and verify relevant content
    When User clicks on epod2+ engraving tile
    Then Verify the engravings page with relevent content
    When Select any device colour "<DeviceColour>" and click on add pattern
    Then Verify the choose the pattern page is displayed
    When Select any pattern "<PatternName>" and click on add pattern
    Then Verify text tile is displayed
    When User clicks on text  and verify add text to your device page
    And Click on direction "<TextDirection>" and enter the "<Text>"
    And Select the font style "<FontStyle>" and click on add text
    Then Verify engraving summary page with relevent content
    When Click on add to cart and verify cart page is displayed
    And User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When User clicks on Skins and verify Device Skins  page is displayed
    And User select any Epod2 plus collection X "<Skin>" and click on buy now then verify it added to cart
    And User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When User clicks on pods and verify ePod Pods page is displayed
    And Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When User click on accessories
    Then Verify Accessories page with relevent content is displayed
    When User click on add to cart under chargingcable accessories
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text    | flavor      | quantity | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Gold         | Arid        | Horizontal    | Ahamono   | Engrave | Lemon Berry |        1 | twilight | Fedex    | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2EngravingE2E_AllProducts1_E2E
  #Description -  The purpose of this test case is to validate E2E flow of adding different epod2 products to the cart and placing the order (Epod2 Engraving - pattern, text-horizontal, skin - Collection X, flavour, Accessory - pod Caps) through header navigation.
  #Developed By - Sasikala
  #Date: 16 dec ,2022
  @GVCA_ePod2EngravingE2E_AllProducts1_E2E
  Scenario Outline: GVCA_ePod2EngravingE2E_AllProducts1_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on engrave your devices
    Then Verify the engravings page with relevent content
    When User clicks on ePod2 button and verify the relevent content
    And Select any device colour "<DeviceColour>" and click on add pattern
    Then Verify the choose the pattern page is displayed
    When Select any pattern "<PatternName>" and click on add pattern
    Then Verify text tile is displayed
    When User clicks on text  and verify add text to your device page
     And Click on direction "<TextDirection>" and enter the "<Text>"
    And Select the font style "<FontStyle>" and click on add text
    Then Verify engraving summary page with relevent content
    When Click on add to cart and verify cart page is displayed
    And Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on Epod 2 collections X then Verify the epod2 collection X skin options are displayed
    And User select any collection X "<Skin>" and click on buy now and verify it added to cart
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User hover on shop and clicks on accessories
    Then Verify Accessories page with relevent content is displayed
    When User click on add to cart under podcaps accessories
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | DeviceColour | PatternName | TextDirection | FontStyle | Text    | flavor      | quantity | Skin     | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Gold         | Arid        | Horizontal    | Ahamono   | Engrave | Lemon Berry |        1 | twilight | Fedex    | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod2+Engraving_AllProducts2_E2E
  #Description -   The purpose of this test case is to validate E2E flow of adding different epod2+ products to the cart and placing the order (Epod2+ Engraving -mini icon, text-vertical, skin - Core Collection, flavour, Accessory - rings) through header navigation.
  #Developed By - Sasikala
  #Date: 16 dec ,2022
  @Engraving_AllProducts2_E2E2
  Scenario Outline: GVCA_ePod2+Engraving_AllProducts2_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on engrave your devices
    Then Verify the engravings page with relevent content
    When User selects device color as "<DeviceColour>"
    And User select device design style as Mini Icon to select "<Miniicon>"
    Then Verify text tile is displayed
    When User clicks on text  and verify add text to your device page
     And Click on direction "<TextDirection>" and enter the "<Text>"
    And Select the font style "<FontStyle>" and click on add text
    Then Verify engraving summary page with relevent content
    When Click on add to cart and verify cart page is displayed
    And Hover on shop and click on Shop device skins under the Personalize your ePod submenu
    Then Verify Device Skins  page is displayed
    When Click on core collection dropdown then verify it is expanded
    And click on Epod2 plus core collections then Verify the epod2 plus core collection skin options are displayed
    And User select any Epod2 pluscore collection "<Skin>" and click on buy now and verify it added to cart
    And User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User hover on shop and clicks on accessories
    Then Verify Accessories page with relevent content is displayed
    When User select the design "<design>" and click on add
    And Hover on cart and click on view cart
    Then Verify the cart page
    #When Click on Checkout button
    #Then Verify shipping page and One time Purchase details are dispalyed
    #When Click on Go TO Delivery button
    #Then Verify Delivery and One time Purchase details are dispalyed
    #And Verify all delivery options are dispalyed
    #When Select "<delivery>" option and Click on Go To Billing button
    #Then Verify Billing Page and One time Purchase details dispalyed
    #When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    #And Click on terms and conditions check box and verify submit order button is enabled
    #And Click on Submit Order button
    #Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | DeviceColour | Miniicon | PatternName | TextDirection | FontStyle | Text | flavor | quantity | Skin  | delivery | design | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mallory.stokes@bat.com | TEST1234 | Red          | Arro     | Dash        | Vertical      | Fusterd   | abc  | Mango  |        1 | amber | Fedex    | leaf   | 5555555555554444 |               1024 |        1901 | CANADA VYPE USER |

      
 #--------------------------------------------------------------------------------------------------------------
 #Test Case - GVCA_ePod2Engraving_AllProducts2_E2E
  #Description - The purpose of this test case is to validate E2E flow of adding different epod2 products to the cart and placing the order (Epod2 Engraving - Mini icon, text-Vertical, skin - Core Collection, flavour, Accessory - Rings) through All pod devices.
  #Updated by - Harika
  #lines added: 17 to28,
  #Date: 15 dec ,2022
  @GVCA_ePod2Engraving_AllProducts2_E2E
  Scenario Outline: GVCA_ePod2Engraving_AllProducts2_E2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page and verify relevant content
    And Click on ePod2 button and verify ePod2 device tiles are displayed
    And Click on engraving tile and verify engraving page is displayed
    When User selects device color as "<DeviceColour>"
    And User select device design style as Mini Icon to select "<Miniicon>"
    And User customize back by selecting TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>"
    Then Verify engraving summary page with relevent content
    When Click on add to cart and verify cart page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    And Click on ePod2 button and verify ePod2 device tiles are displayed
     When User clicks on Skins and verify Device Skins  page is displayed
    And Click on core collection dropdown then verify it is expanded
    And click on Epod 2  core collections then Verify the epod2 core collection skin options are displayed
    And User select any Core collection "<Skin>" and click on buy now and verify it added to cart
    And User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When Click on ePod2 button and verify ePod2 devices are displayed
    When User clicks on pods and verify ePod Pods page is displayed
    And Click on add button for any "<flavor>" with required quantity "<quantity>"
    And User hover on shop and clicks on All ePod Devices
    And Click on ePod2 button and verify ePod2 devices are displayed
    When User click on accessories
    Then Verify Accessories page with relevent content is displayed
    And User selects epod rings with "<ring>" design and click on add from Acccessories page
    And Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    #core collection skins are currently unavailable
    #Then Verify order confirmation page is displayed with relevent content
    # And Hover on Account icon and Click on Logout option
    # Then Verify the user is in Pre login home page
    Examples: 
      | UN               | pwd      | DeviceColour | Miniicon | TextDirection | FontStyle | Text    | flavor      | quantity | Skin  | ring   | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | yeswanth@bat.com | TEST1234 | Black        | Glow     | Vertical      | Monument  | Mallary | Forest Mint |        1 | amber | x-ring | Fedex    | 5555555555554444 |               1024 |         197 | keon auer        |