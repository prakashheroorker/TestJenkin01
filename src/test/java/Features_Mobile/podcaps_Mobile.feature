@PodCapsMobile
Feature: pod Caps

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Developed By - Bhavitha
  #Date - February 03,2022
  #Description - The purpose of the test case is to verify the accessories landing page for 2 pack of Pod caps
  #Test Case - VYPE-3733_2PodCaps_TC001
  @VYPE-3733_2PodCaps_TC001
  Scenario Outline: VYPE-3733_2PodCaps_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify ePod caps in Accessories page
    When Click plus and minus buttons under ePod caps
    Then Verify clear Indigo and Red yellow variants are present in drop down of ePod caps

    Examples: 
      | UN                    | pwd      |
      | bhavitha.nune@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - February 03,2022
  #Description - The purpose of the test case is to verify the product details page for 2 pack of Pod caps
  #Test Case - VYPE-3733_2PodCaps_TC002
  @VYPE-3733_2PodCaps_TC002
  Scenario Outline: VYPE-3733_2PodCaps_TC002
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify ePod caps in Accessories page
    When Click plus and minus buttons under ePod caps
    Then Verify clear Indigo and Red yellow variants are present in drop down of ePod caps
    When Click on ePod caps
    Then verify Epod caps page
    When Click any variant "<colour>" clear Indigo or Red yellow
    Then Verify respective colour "<colour>" is displayed on device or not

    Examples: 
      | UN                    | pwd      | colour         |
      | bhavitha.nune@bat.com | TEST1234 | Clear & Indigo |

  #---------------------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - February 03,2022
  #Description - The purpose of the test case is to verify the E2E order placement for 2 pack of Pod caps
  #Test Case - VYPE-3733_2PodCaps_TC003
  @VYPE-3733_2PodCaps_TC003
  Scenario Outline: VYPE-3733_2PodCaps_TC003
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify ePod caps in Accessories page
    When Click plus and minus buttons under ePod caps
    Then Verify clear Indigo and Red yellow variants are present in drop down of ePod caps
    When Click on ePod caps
    Then verify Epod caps page
    When Click any variant "<colour>" clear Indigo or Red yellow
    Then Verify respective colour "<colour>" is displayed on device or not
    When Add Device to the cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                    | pwd      | colour         | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | Clear & Indigo | 4444333322221111 |               1123 |         190 | alberta USER     |
