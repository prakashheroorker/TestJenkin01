Feature: Verifying the Silver User Next Tier Perks in Rewards Section

  Background: 
    Given User is on pre-login page

  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Gold_Validation
  #Description - Objective: Description: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Silver User Profile
  #Precondition - User should be in Silver Tier & User should be < 1000 Points away to the Next Tier
  #Updated 12-18 lines by - Akhila
  #Date -Dec 09,2022
  @Gold_Perks
  Scenario Outline: Silver_User_NextTierPerk
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify the user is navigated to Rewards page with relevant information
    And Scroll down the Rewards Page to see Next Tier Gold Perks and its content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN              | pwd      |
      | joncris@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Platinum_Validation
  #Description - Objective: Description: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Gold User Profile
  #Precondition- User should be in Gold Tier & User should be < 1000 Points away to the Next Tier
  #Updated 38 line by - Akhila
  #Date -Dec 09,2022
  @Platinum_Perks
  Scenario Outline: Gold_User_NextTierPerk
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify the user is navigated to Rewards page with relevant information
    And Scroll down the Rewards Page to see Next Tier Platinum Perks and its content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      |
      | Silver+001@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4477 & 4035_Next Tier's_Perks_Premium_Validation
  #Description - Objective:The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Premium User Profile
  #Precondition- User should be in Platinum Tier & User should be < 1000 Points away to the Next Tier
  #Updated 59 line by - Akhila
  #Date -Dec 09,2022
  @Premium_Perkss
  Scenario Outline: Platinum_User_NextTierPerk
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify the user is navigated to Rewards page with relevant information
    And Scroll down the Rewards Page to see Next Tier Premium Perks and its content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN          | pwd      |
      | Sri@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4477 & 4035_Next Tier's_Perks_Supreme_Validation
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Supreme User Profile
  #Precondition- User should be in Premium Tier & User should be < 1000 Points away to the Next Tier
  #Updated 79 line by - Akhila
  #Date -Dec 09,2022
  @Premium_Perkss
  Scenario Outline: Premium_User_NextTierPerk
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile section and click on My rewards link
    Then Verify the user is navigated to Rewards page with relevant information
    And Scroll down the Rewards Page to see Next Tier Supreme Perks and its content
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      |
      | jaime.hood@bat.com     | TEST1234 |
  #----------------------------------------------------------------------------------------------------------------------------------------------------------
 #
 #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Platinum_TC002
  #Description - Objective: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Gold User Profile
  #Author - Leela Venkata Bhavani
  #Date -June 24,2022 
  #@Platinum_Perks
  #Scenario Outline:  Gold_User_NextTierPerk
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When User navigates to Rewards page
    #Then Verify the user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see Next Tier Platinum Perks
   #
#Examples:
#
   #|UN                |pwd       |
   #|davidhong@bat.com |TEST1234  |
   #
    #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4477 & 4035_Next Tier's_Perks_Premium_TC003
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Platinum User Profile
  #Author - Leela Venkata Bhavani
  #Date -June 24,2022 
  #@Premium_Perks
  #Scenario Outline:  Platinum_User_NextTierPerk
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When User navigates to Rewards page
    #Then Verify the user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see Next Tier Premium Perks
   #
#Examples:
#
   #|UN                    |pwd       |
   #|Ronolds.Rocky@bat.com |TEST1234  |
   #
   #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE_4477 & 4035_Next Tier's_Perks_Supreme_TC004
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Premium User Profile
  #Author - Leela Venkata Bhavani
  #Date -June 24,2022 
  #@Supreme_Perks
  #Scenario Outline:  Premium_User_NextTierPerk
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When User navigates to Rewards page
    #Then Verify the user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see Next Tier Supreme Perks
   #
#Examples:
#
   #|UN                     |pwd       |
   #|christin.messi@bat.com |TEST1234  |
   #
   #
 #
 #
