Feature: To verify Otp In Out functionalities

  Background: 
    Given User is on pre-login page

  #Test Case -   VYPE_4392_Opt_In_PopUp_Validation
  #Description - The purpose of this test case is To verify optin model after login
  #PreCondition - User should already opted out
  #Developed By - Sai Manaswini
  #Date - 23/6/2022
  #Updated By - Bhavitha - Dec 16th, 2022
  #Updated lines - 24,25
  @VYPE_4392_Opt_In_PopUp_Validation
  Scenario Outline: VYPE_4392_Opt_In_PopUp_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section
    Then All the Account options will be displayed
    When User clicks on My Rewards link
    #Then Verify the Rewards Page
    #Then Scroll down to the opt out content
    Then Verify user is already opt out
    When Scroll down to the opt out content and Click on join button
    Then Verify user is opt in
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                   | pwd      |
      | titus.pouros@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -   VYPE_4392_NewUser_ Opt-In_Validation
  #Description - The purpose of this test case is To verify the New User on or after June 14th is able to
  #Opt-In to the Vuse + Rewards
  #User should hava valid address to create a new user
  #Developed By - Sai Manaswini
  #Date - 24/6/2022
  #Updated By - Bhavitha - Dec 16th, 2022
  #Updated lines - 55 to 66
  @VYPE_4392_NewUser_Opt-In_Validation
  Scenario Outline: VYPE_4392_NewUser_ Opt-In_Validation
    When Clicked on Login or Sign up
    Then Verify and click on login elements
    When Click on signup for registration process
    #When Signing with new email address Email and password "<pwd>"
    #And Entering "<FN>" and "<LN>"
    #Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    #And Checking the conditions
    #Then Clicking on Register
    #Then Scroll down to the opt out content
    And Entering with new email address Email and password "<pwd>" and verify next button is enabled
    And Click on next button and verify register signup page is displayed
    And Enter "<FN>" and "<LN>" in signup page
    And Enter dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>" in signup page
    Then Checking the conditions and verify the register button
    When User clicks on register button and verify the user is logged in
    And User hovers on Profile section
    Then All the Account options will be displayed
    When User clicks on My Rewards link
    Then Verify the Rewards Page
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | pwd       | FN  | LN  | DOB      | ADD                                    | PhNo           |
      | Test@1234 | Abc | def | 19960921 | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 1-888-420-1620 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -  VYPE_4392_NewUser_ Opt-Out_Validation
  #Description - The purpose of this test case is to verify the New User on or after June 14th is able to Opt-Out from the
  #Vuse + Rewards
  #User should hava valid address to create a new user
  #Developed By - Sai Manaswini
  #Date - 28/6/2022
  #Updated By - Bhavitha - Dec 16th, 2022
  #Updated lines - 90 to 99, 101 to 104
  @NewUser_Opt-Out
  Scenario Outline: VYPE_4392_NewUser_Opt-Out_Validation
    When Clicked on Login or Sign up
    Then Verify and click on login elements
    When Click on signup for registration process
    #When Signing with new email address Email and password "<pwd>"
    #And Entering "<FN>" and "<LN>"
    #Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    #And Checking the conditions
    #Then Clicking on Register
    And Entering with new email address Email and password "<pwd>" and verify next button is enabled
    And Click on next button and verify register signup page is displayed
    And Enter "<FN>" and "<LN>" in signup page
    And Enter dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>" in signup page
    Then Checking the conditions and verify the register button
    When User clicks on register button and verify the user is logged in
    And User hovers on Profile section
    Then All the Account options will be displayed
    When User clicks on My Rewards link
    Then Verify the Rewards Page
    #Then Scroll down to the opt out content
    And Scroll down and Verify opt out content
    When Select on opt out from rewards loyalty program
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | pwd       | FN   | LN  | DOB      | ADD                                    | PhNo           |
      | Test@1234 | Tsvt | Per | 19960603 | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 1-015-424-4893 |

  #---------------------------------------------------------------------------------------------------------------------------
  # TestCase Name : VYPE_4567_Vuse_Post Login Opt-In_Validation
  # Description : The purpose of this test case is
  #- To Verify the User is able to see the Opt - In modal after Login, if the user has not Opt - In during Sign Up process
  #- Verify the News letter subscription reward Points and Opt-in Offer points in the Your History section of Rewards Tab
  #User should hava valid address to create a new user
  # Developed by : Honey Hari
  # Date : 24/06/2022
  #Updated By - Bhavitha - Dec 16th, 2022
  #Updated lines - 132 to 143
  @VYPE_4567_Vuse_PostLoginOpt-In_Validation
  Scenario Outline: VYPE_4567_Vuse_Post Login Opt-In_Validation
    When Clicked on Login or Sign up
    Then Verify and click on login elements
    When Click on signup for registration process
    #When Signing with new email address Email and password "<pwd>"
    #And Entering "<FN>" and "<LN>"
    #Then Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    #And Checking the conditions
    And Entering with new email address Email and password "<pwd>" and verify next button is enabled
    And Click on next button and verify register signup page is displayed
    And Enter "<FN>" and "<LN>" in signup page
    And Enter dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>" in signup page
    Then Checking the conditions and verify the register button
    When User unselect the checkbox for vuse+ opt in
    And User navigate to Rewards section
    And User accept the opt-in modal when logged in
    Then Verify user is already opt out
    When Scroll down to the opt out content and Click on join button
    And Scroll down to History section
    Then Verify the points for new user
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | pwd       | FN  | LN  | ADD                                    | DOB      | PhNo           |
      | Test@1234 | gdk | jim | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 19970213 | 1-828-420-0021 |
