Feature: Verifing VuseStore page

  Background: 
    Given User is on pre-login page in mobile
   When User clicks on hamburger menu and Verify Login/Register link

  #Test Case : BAT Canada_Vuse Store screen_1_Mobile
  #Objectives: The purpose of this Test Case is to verify the UI and functionality of Vuse store page.
  #Author:Sandeepa S
  #Date: 18 Feb 2022
  #Modified By- Sai Sireesha
  #Date - December 15, 2022
  #Modified steps - 20 to 25
  @VuseStoreMobile
  Scenario Outline: BAT Canada_Vuse Store screen_1_Mobile
   And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Store
    Then Verify Vuse store page  and with relevant content is displayed
    When User swipe up and  click on BritishColoumbia Province Link
    Then verify the BritishColoumbia province related Content is displayed
    When User swipe up and click on Alberta province link
    Then Verify Alberta province related Content is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                   | pwd      |
      | bhavitha.nune@bat.com | TEST1234 |
