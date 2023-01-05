# TestCase Name : VYPE_4567_Vuse_Post Login Opt-In_TC002
# Description : 1) To Verify the User is able to see the Opt - In modal after Login, if the user has not Opt - In during Sign Up process
#               2) and Verify the News letter subscription reward Points and  Opt-in Offer points in the Your History section of Rewards Tab
# Developed by : Honey Hari
# Date : 24/06/2022

Feature: To verify opt-in modal after login

  Background: 
    Given User is on pre-login page

  Scenario Outline: VYPE_4567_Vuse_Post Login Opt-In_TC002
    When Clicked on Login or Sign up
    Then verify and click on login elements
    And click on signup for registration process
    When Signing with new email address Email and password "<pwd>"
    And Entering "<FN>" and "<LN>"
    Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions
    And User unselect the checkbox for vuse+ opt in
    Then user accept the opt-in modal when logged in
    When user navigate to rewards section
    Then scroll down to History section
    And verify the points for new user

    Examples: 
      | pwd      | FN    | LN   | ADD                                                   | DOB      | PhNo           |
      | TEST1234 | jomon | tenn | 23 Beaverbrook Rd N Lethbridge Alberta T1H 5Z4 Canada | 19970913 | 1-828-420-0021 |
