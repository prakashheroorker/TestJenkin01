

Feature: To verify opt-in modal after login
# TestCase Name : VYPE_4567_Vuse_Post Login Opt-In_Mobile_TC002
# Description : 1) To Verify the User is able to see the Opt - In modal after Login, if the user has not Opt - In during Sign Up process
#               2) and Verify the News letter subscription reward Points and  Opt-in Offer points in the Your History section of Rewards Tab
# Developed by : Honey Hari
# Date : 01/07/2022


  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  @VYPE_4567_Vuse_PostLoginOpt-In_Mobile_TC002
  Scenario Outline: VYPE_4567_Vuse_Post Login Opt-In_Mobile_TC002
    Then verify and click on login element
    And click on sign up for registration process
    When Signing with new email address EmailID and password "<pwd>"
    And Enter "<FN>" and "<LN>" in Register page
    Then Entering dob "<DOB>" ,address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions checkbox
    And User unselect the checkbox for vuse+ optin
    Then user Clicks on hamberger menu and verify links in Account section
    And user clicks on My Reward
    Then user accept the opt-in modal after logged in
    When user navigate to my rewards section
    Then scroll down to history section
    And verify the points for newuser

    Examples: 
      | pwd      | FN  | LN | ADD                                    | DOB      | PhNo           |
      | Test@1234 | Over | to | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 19970618 | 1-828-420-9025 |
