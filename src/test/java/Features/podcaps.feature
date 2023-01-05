@newfunctionalitysuiteBDD
@podCaps
Feature: pod Caps

  Background: 
    Given User is on pre-login page

  #Developed By - Bhavitha
  #Date - January 28,2022
  #Description - The purpose of the test case is to verify the accessories landing page for 2 pack of Pod caps
  #Test Case - VYPE-3733_2PodCaps_TC001
  @VYPE-3733_2PodCaps_TC001
  Scenario Outline: VYPE-3733_2PodCaps_TC001
    Given User enters email "<UN>" and password "<pwd>"
    Then user navigates to epod accessories page
    Then Verify ePod caps
    When Click plus and minus buttons
    Then Verify clear Indigo and Red yellow variants are present in drop down

    Examples: 
      | UN                       | pwd      |
      | jonathan.thebault@bat.com| TEST1234 |

  #-------------------------------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - January 28,2022
  #Description - The purpose of the test case is to verify the product details page for 2 pack of Pod caps
  #Test Case - VYPE-3733_2PodCaps_TC002
  @VYPE-3733_2PodCaps_TC002
  Scenario Outline: VYPE-3733_2PodCaps_TC002
    Given User enters email "<UN>" and password "<pwd>"
    Then user navigates to epod accessories page
    Then Verify ePod caps
    When Click plus and minus buttons
    Then Verify clear Indigo and Red yellow variants are present in drop down
    When click on ePod caps
    #Then Verify Epod caps page
    When Click any variant clear Indigo or Red yellow"<colour>"
    Then Verify respective colour is displayed on device or not"<colour>"

    Examples: 
      | UN                       | pwd      | colour       |
      | annil.ramroop@bat.com | TEST1234 | Red & Yellow |

      
   #-------------------------------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - February 02,2022
  #Description - The purpose of the test case is to verify the E2E order placement for 2 pack of Pod caps 
  #Test Case - VYPE-3733_2PodCaps_TC003
  @VYPE-3733_2PodCaps_TC003
  Scenario Outline: VYPE-3733_2PodCaps_TC003
    Given User enters email "<UN>" and password "<pwd>"
    Then user navigates to epod accessories page
    Then Verify ePod caps
    When Click plus and minus buttons
    Then Verify clear Indigo and Red yellow variants are present in drop down
    When click on ePod caps
   # Then Verify Epod caps page
    When Click any variant clear Indigo or Red yellow"<colour>"
    Then Verify respective colour is displayed on device or not"<colour>" 
    When Add the device to cart
    And navigate to Cart and verify the items in Cart
    When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
		Then verify order confirmation page
    
    Examples: 
      | UN                        | pwd      | colour       |UserCardNumber   |UserCardExpiryDate   |UserCardCVV |UserCardFullName   |
      | annil.ramroop@bat.com | TEST1234 | Red & Yellow |5555555555554444 |               0923 |         123  | CANADA VYPE USER  |
    