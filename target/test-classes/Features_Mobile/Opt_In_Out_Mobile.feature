@Otpin
Feature: verify Otp In Out functionalities

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case -  VYPE_4392_Opt_In_PopUp_Mobile_TC001
  #Description - This Test is to verify Toggle button in the Profile tab and verify whether the  content of the toggle button is displayed as per Figma Diagram.
  #Developed By - Sai Manaswini
  #Date - 01/7/2022
  @VYPE_4392_Opt_In_PopUp_Mobile_TC001
  Scenario Outline: VYPE_4392_Opt_In_PopUp_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the Rewards Page
    Then Scroll down to the opt out content

    Examples: 
      | UN                        | pwd      |
      |bhavitha.nune@bat.com| TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -  VYPE_4392_NewUser_Opt-In_Mobile_TC001
  #Description - The purpose of this test case is to verify the New User on or after June 14th is able to Opt-In to the Vuse + Rewards
  #Developed By - Sai Manaswini
  #Date - 04/7/2022
  @VYPE_4392_NewUser_Opt-In_Mobile_TC001
  Scenario Outline: VYPE_4392_NewUser_Opt-In_Mobile_TC001
    Then verify and click on login element
    And click on sign up for registration process
    When Signing with new email address EmailID and password "<pwd>"
    And Enter "<FN>" and "<LN>" in Register page
    Then Entering dob "<DOB>" ,address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions checkbox
    Then User clicks on Register button
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the Rewards Page
    Then Scroll down to the opt out content

    Examples: 
      | pwd      | FN   | LN       | DOB      | ADD                                    | PhNo           |
      | Test@1234 | ju | st | 19960720 | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 1-888-424-4620 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -   VYPE_4392_NewUser_ Opt-Out_Mobile_TC001
  #Description - The purpose of this test case is to verify the New User on or after June 14th is able to Opt-Out from the Vuse + Rewards
  #Developed By - Sai Manaswini
  #Date - 06/07/2022
  @VYPE_4392_NewUser_Opt-Out_Mobile_TC001
  Scenario Outline: VYPE_4392_NewUser_Opt-Out_Mobile_TC001
    Then verify and click on login element
    And click on sign up for registration process
    When Signing with new email address EmailID and password "<pwd>"
    And Enter "<FN>" and "<LN>" in Register page
    Then Entering dob "<DOB>" ,address "<ADD>" and Phone number "<PhNo>"
    And checking the conditions checkbox
    Then User clicks on Register button
    Then User click on hamberger menu and clicks on My Rewards
    Then Verify the Rewards Page
    Then Scroll down to the opt out content
    Then Select on opt out from rewards loyalty program
    Examples: 
      | pwd      | FN  | LN  | DOB      | ADD                                    | PhNo           |
      | Test@1234 | me | me | 19980721 | 1281 WOODBINE AVE TORONTO, ON, M4C 4E5 | 1-888-424-4620 |
