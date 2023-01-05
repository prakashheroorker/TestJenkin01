Feature: To verify Know your page UI

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - Vuse- Know Your Vape Landing Page - Post Login
  #Description - The purpose of this Test Case is to verify the UI of Know Your Vape Landing Page - Post Login
  #Developed By - Sai Manaswini
  #Date - February 11,2022
  #@knowyourvape01
  #Scenario Outline: Vuse-KnowYourVapeLandingPage-PostLogin
  #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
  #Then User clicks on hamberger menu and clicks on About
  #And Clicks on Know your vape and verifies the watch and Learn more
  #And Click on Watch video play button
  #Then Verify the video model popup contents
  #And Click on play and pause buttons
  #Then Close the video model pop up
  #And Click on Learn more button
  #And Verify the Contents of Learn more page
  #Then Scroll down to verify the UI contents
  #
  #Examples:
  #| UN                     | pwd      |
  #| louisa.spencer@bat.com | TEST1234 |
  #----------------------------------------------------------------------------------------------------------------------------
  #Test Case - Vuse- Know Your Vape Landing Page - Learn More
  #Description - The purpose of this Test Case is to verify the UI of Know Your Vape Landing Page - Learn More
  #Developed By - Sai Manaswini
  #Date - February 11,2022
  #Modified By-Sai Sireesha
  #Date - December 12,2022
  #Modified steps:38 to 79
  @knowyourvape3
  Scenario Outline: Vuse-KnowYourVapeLandingPage-LearnMore
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and verify the links
    And Click on About and verify the links
    And Clicks on Know your vape page and verify the relevant content is displayed
    When Click on Learn more button
    Then Verify the Contents of Learn more page
    When Clicked on watch video of learn more page
    And Close the video model pop up and verify the learn more page
    Then Swipe down to next tile and verify the content
    And User swipe down clicks on each question and verify related answer is displayed
    When User swipe up and clicks on raw material in clock wise
    Then Verify the content of raw material
    When Clicked on watch video of raw material page
    And Close the video model pop up and verify the raw material page
    Then Swipe down to next tile and verify the content of raw material
    And User swipe down clicks on each question and verify related answer is displayed
    When User swipe up and clicks on Testing in clock wise
    Then Verify the content of Testing
    When Clicked on watch video of Testing page
    And Close the video model pop up and verify the Testing page
    Then Swipe down to next tile and verify the content of Testing
    When User swipe down clicks on each question and verify related answer is displayed
    And User swipe up and clicks on Manufacturing in clock wise
    Then Verify the content of Manufacturing
    When Clicked on watch video of Manufacturing page
    And Close the video model pop up and verify the Manufacturing page
    Then Swipe down to next tile and verify the content of Manufacturing
    And User swipe down clicks on each question and verify related answer is displayed
    When User swipe up and clicks on supply chain in clock wise
    Then Verify the content of Supply chain
    When Clicked on watch video of Supply chain page
    And Close the video model pop up and verify the Supply chain page
    Then Swipe down to next tile and verify the content of Supply chain
    And User swipe down clicks on each question and verify related answer is displayed
    When User swipe up and clicks on Brand in hand in clock wise
    Then Verify the content of Brand in hand
    When Clicked on watch video of Brand in hand page
    And Close the video model pop up and verify the Brand in hand page
    Then Swipe down to next tile and verify the content of Brand in hand
    And User swipe down clicks on each question and verify related answer is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |
