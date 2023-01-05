Feature: Vuse News

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case 		- BatCanada_Vusenews_Mobile
  #Description 	- Objective: The purpose of the test case is to verify the BatCanada_Vusenews landing screen Under 'About' menu
  #Developed By - Harika
  #Date				  - February 25,2022
  #Updated By	  - Shaik Bandagi
  #Date 				- Dec-15-2022
  #Modified lines-20 to 23
  @VuseNews
  Scenario Outline: BatCanada_Vusenews_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    And User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamburger menu and clicks on About
    And User clicks on Vuse news and verify respective page is displayed
    Then Verify tiles in vuse news landing page
    When Click on Read More Link on any of the Blog Post
    Then Verify the user is redirected to the corresponding Blog Post to read the content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      |
      | louisa.spencer@bat.com | TEST1234 |
