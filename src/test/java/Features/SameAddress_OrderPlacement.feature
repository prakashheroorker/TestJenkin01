# TestCase Name : VYPE_4498_SameAddress_OrderPlacement_Validation_TC001
# Description : The purpose of this test case is to verify the end to end Order Placement flow
#								by using same registered address for shipping
# Developed by : Harris
# Date : 28/09/2022
Feature: To verify SameAddress OrderPlacement Validation

  Background: 
    Given User is on pre-login page of boost plan

  Scenario Outline: VYPE_4498_SameAddress_OrderPlacement_Validation_TC001
    When User Clicks on Get your Kit and Verify Create Account Pop-Up page is displayed
    And User Create Account with valid email address "<UN>" and password "<pwd>"
    And Entering "<FN>" and "<LN>"
    Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions and click on Register and verify order place Pop-Up is displayed
    Then Click on choose a pod Dropdown and selects Flavour "<flavor>" in ePod Pod pack section
    And Click on Choose a Nicotine Strength Dropdown"<strength>"and selects Strength in ePod Pod section
    And Verify Same as residentail address is selected and Click on Submit

    Examples: 
      | UN              | pwd      | FN  | LN  | ADD  | DOB      | PhNo           | flavor | strength |
      | KKDK.LP@bat.com | TEST1234 | LSA | LDM | 1260 | 19911020 | 1-828-520-4565 | Peach  | 1.6 %    |
