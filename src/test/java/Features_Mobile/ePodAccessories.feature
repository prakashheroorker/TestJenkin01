Feature: Verifing Accessories page

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVCA_ePodAccessories_01_TC001
  #Objectives: The purpose of this Test Case is to verify the UI of the Vype ePod Accessories page.
  #Author: Harsha Kumar
  #Date: 17/11/2021
  @Accessories
  Scenario Outline: GVCA_ePodAccessories_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then verify Vuse logo and cart icon in accessories page
    Then verify all Accessories present in Accessories page
    And verify Top footer and bottom footer

    Examples: 
      | UN                     | pwd      |
      | jedidiah.ratke@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_epodaccessories_04_TC001
  #Description - The purpose of this test case is to verify in epodaccesssories page when added Phone Holder with Pod Cap Accessory then added to cart should be displayed with quantity
  #Developed By - Harika
  #Date - January 28,2022
  @epodaccessories_04
  Scenario Outline: GVCA_epodaccessories_04_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    And user navigates to phone holder with pod cap accessory page
    And user verifies the content and adds product
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                     | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jedidiah.ratke@bat.com | TEST1234 | 4444333322221111 |               1123 |         190 | Canada Vype User |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePodAccessories_TC005
  #Description - The purpose of this test case is to verify in epod accesssories page when added device case then added to cart should be displayed with quantity
  #Developed By - Harika
  #Date - January 28,2022
  @epodaccessories_05
  Scenario Outline: GVCA_ePodAccessories_TC005
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    And user navigates to device case page
    And user verifies the content and adds product
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                    | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | 4444333322221111 |               1123 |         190 | Canada Vype User |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePodAccessories_TC006
  #Description - The purpose of this test case is to verify in epodaccesssories page when added travel case then added to cart should be displayed with quantity
  #Developed By - Harika
  #Date - January 28,2022
  @epodaccessories_05
  Scenario Outline: GVCA_ePodAccessories_TC006
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    And user navigates to device case page
    And user verifies the content and adds product
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                    | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | 4444333322221111 |               1123 |         190 | Canada Vype User |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_epodaccessories_03_TC001
  #Description - The purpose of this test case is to verify in epodaccesssories page when added epod charger then added to cart should be displayed with quantity
  #Developed By - Akhila
  #Date - Augus 10,2022
  @epodaccessories_03 @epodaccessories
  Scenario Outline: GVCA_epodaccessories_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    And user navigates to charging cable page in mobile
    And user verifies the content and adds product
    Then Hower on cart icon and click on view cart

    Examples: 
      | UN                 | pwd      |
      | akhila.cha@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePodContents_01_TC001
  #Description - The purpose of this Test Case is to verify flow epods adding and removing into the cart and verifying the page
  #Developed By - Akhila
  #Date - Augus 10,2022
  @GVCA_ePodContents_01_TC001 @epodsuitesuite @epoppods02
  Scenario Outline: GVCA_ePodContents_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify Headers, Top footers "<txtTopFooter>" and bottom "<txtBottomFooter>" in mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on epodtwo device
    Then Verify Headers, Top footers "<txtTopFooter>" and bottom "<txtBottomFooter>" in mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then Verify Headers, Top footers "<txtTopFooter>" and bottom "<txtBottomFooter>" in mobile

    Examples: 
      | UN                           | pwd      | txtTopFooter                                                    | txtBottomFooter                                           |
      | christine.mulholland@bat.com | TEST1234 | CONTACTUSFAQSSTORELOCATORSITEMAPINSTAGRAMFACEBOOKTWITTERYOUTUBE | CONDITIONSOFSALEPRIVACYPOLICYTERMS&CONDITIONSCOOKIEPOLICY |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePodPods_03_TC001
  #Description - The purpose of this Test Case is to verify flow epods adding into the cart and verifying the page
  #Developed By - Akhila
  #Date - Augus 24,2022
  @GVCA_ePodPods_03_TC001 @epodsuitesuite @epoppods
  Scenario Outline: GVCA_ePodPods_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart

    Examples: 
      | UN                           | pwd      | flavor     | count |
      | christine.mulholland@bat.com | TEST1234 | Polar Mint |     1 |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePodPods_04_TC001
  #Description - The purpose of this Test Case is to verify flow epods adding and removing into the cart and verifying the page
  #Developed By - Sai Manaswini
  #Date - November 9,2021
  @GVCA_ePodPods_04_TC001 @epodsuitesuite @epoppods02
  Scenario Outline: GVCA_ePodPods_04_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    When Clicking buttons plus and minus in mobile
    And Verifying the amount in mobile
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    And verify price greater than previous price in mobile

    Examples: 
      | UN                           | pwd      | flavor       | count |
      | christine.mulholland@bat.com | TEST1234 | Passionfruit |     0 |
