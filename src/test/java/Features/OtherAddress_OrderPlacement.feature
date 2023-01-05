# TestCase Name : VYPE_4498_OtherAddress_OrderPlacement_Validation_TC002
# Description : The purpose of this test case is to verify the end to end Order Placement flow
#								by using Other registered address for shipping
# Developed by : Harris
# Date : 29/09/2022
Feature: To verify OtherAddress OrderPlacement Validation

  Background: 
    Given User is on pre-login page of boost plan

  Scenario Outline: VYPE_4498_OtherAddress_OrderPlacement_Validation_TC002
    When User Clicks on Get your Kit and Verify Create Account Pop-Up page is displayed
    And User Create Account with valid email address "<UN>" and password "<pwd>"
    And Entering "<FN>" and "<LN>"
    Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions and click on Register and verify order place Pop-Up is displayed
    Then Click on choose a pod Dropdown and selects Flavour "<flavor>" in ePod Pod pack section
    And Click on Choose a Nicotine Strength Dropdown"<strength>"and selects Strength in ePod Pod section
    Then Click on Other Address and verify Address field is displayed below
    Then Entering  valid Address "<Address>"and click on submit and verify Almost There page is displayed

    Examples: 
      | UN              | pwd      | FN   | LN    | ADD  | DOB      | PhNo           | flavor | strength | Address                                    |
      | KHS.YUT@bat.com | TEST1234 | ADSF | QWRTE | 1260 | 19901027 | 1-740-134-6685 | Peach  | 1.6 %    | 001-46005 Bole Ave Chilliwack, BC, V2P 7W7 |
