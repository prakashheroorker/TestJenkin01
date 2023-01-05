Feature: Next Tier Perks in Rewards Section

  Background: 
    Given User is on pre-login page in mobile
    
    
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Gold_Mobile
  #Description - Objective: Description: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Silver User Profile
  #Precondition - User should be in Silver Tier & User should be < 1000 Points away to the Next Tier
  #Updated 12-22 lines  By - Akhila
  #Date - DEC 13,2022
  @Gold_Perksm
  Scenario Outline: VYPE_4477 & 4035_Next Tier's Perks_Gold_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify that user is navigated to Rewards page with relevant information in mobile
    And Scroll down the Rewards Page to see the Next Tier Gold Perks and its content in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    
		Examples:

    |UN              |pwd       |
    |joncris@bat.com |TEST1234  |
   
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Platinum_Mobile_TC001
   #Description - Objective: Description: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Gold User Profile
  #Precondition- User should be in Gold Tier & User should be < 1000 Points away to the Next Tier
  #Updated 42 line by - Akhila
  #Date -Dec 13,2022
  @Platinum_Perks
  Scenario Outline: VYPE_4477 & 4035_Next Tier's Perks_Platinum_Mobile_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify that user is navigated to Rewards page with relevant information in mobile
    And Scroll down the Rewards Page to see the Next Tier Platinum Perks and its content in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    
		Examples:

    |UN                |pwd       |
    |Silver+001@bat.com |TEST1234  |
   
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Premium_Mobile_TC001
  #Description - Objective:The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Premium User Profile
  #Precondition- User should be in Platinum Tier & User should be < 1000 Points away to the Next Tier
  #Updated 64 line by - Akhila
  #Date -Dec 13,2022
  @Premium_Perks
  Scenario Outline: VYPE_4477 & 4035_Next Tier's Perks_Premium_Mobile_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify that user is navigated to Rewards page with relevant information in mobile
    And Scroll down the Rewards Page to see the Next Tier Premium Perks and its content in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    
		Examples:

    |UN                    |pwd       |
    |Sri@bat.com           |TEST1234  |
   
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Supreme_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Supreme User Profile
  #Precondition- User should be in Premium Tier & User should be < 1000 Points away to the Next Tier
  #Updated 86 line by - Akhila
  #Date -Dec 09,2022
  @Supreme_Perks
  Scenario Outline: VYPE_4477 & 4035_Next Tier's Perks_Supreme_Mobile_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When User click on hamberger menu and clicks on My Rewards
    Then Verify that user is navigated to Rewards page with relevant information in mobile
    And Scroll down the Rewards Page to see the Next Tier Supreme Perks and its content in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    
		Examples:

    |UN                     |pwd       |
    |jaime.hood@bat.com     |TEST1234  |
    
    
    
  #=======================================================================================  
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Gold_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Silver User Profile
  #Author - Leela Venkata Bhavani
  #Date -July 1,2022
  #@Gold_Perks
  #Scenario Outline: Silver_User_NextTierPerk_Mobile_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and clicks on My Rewards
    #Then Verify that user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see the Next Tier Gold Perks
    #
#Examples:
#
   #|UN              |pwd       |
   #|joncris@bat.com |TEST1234  |
   #
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Platinum_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify the UI of the Next Tier's Perks  in the Rewards Tab for Gold User Profile
  #Author - Leela Venkata Bhavani
  #Date -July 1,2022
  #@Platinum_Perks
  #Scenario Outline: Gold_User_NextTierPerk_Mobile_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and clicks on My Rewards
    #Then Verify that user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see the Next Tier Platinum Perks
    #
#Examples:
#
   #|UN                |pwd       |
   #|davidhong@bat.com |TEST1234  |
   #
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Premium_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Platinum User Profile
  #Author - Leela Venkata Bhavani
  #Date -July 1,2022
  #@Premium_Perks
  #Scenario Outline: Platinum_User_NextTierPerk_Mobile_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and clicks on My Rewards
    #Then Verify that user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see the Next Tier Premium Perks
    #
#Examples:
#
   #|UN                    |pwd       |
   #|Ronolds.Rocky@bat.com |TEST1234  |
   #
  #Test Case - VYPE_4477 & 4035_Next Tier's Perks_Supreme_Mobile_TC001
  #Description - Objective: The purpose of this test case is to verify the UI of Next Tier's Perks in the Rewards Tab for Premium User Profile
  #Author - Leela Venkata Bhavani
  #Date -July 1,2022
  #@Supreme_Perks
  #Scenario Outline: Premium_User_NextTierPerk_Mobile_TC001
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User click on hamberger menu and clicks on My Rewards
    #Then Verify that user is navigated to Rewards page
    #Then Scroll down the Rewards Page to see the Next Tier Supreme Perks
    #
#Examples:
#
   #|UN                     |pwd       |
   #|christin.messi@bat.com |TEST1234  |
   #
   #
    
    