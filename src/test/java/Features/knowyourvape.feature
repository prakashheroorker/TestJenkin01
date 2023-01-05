@newfunctionalitysuite1
Feature: To verify Know your page UI

  Background: 
    Given User is on pre-login page

  #Test Case - Vuse- Know Your Vape Landing Page - Post Login
  #Description - The purpose of this Test Case is to verify the UI of Know Your Vape Landing Page - Post Login
  #Developed By - Sai Manaswini
  #Date - January 28,2022
  #Modified By-Sai Sireesha
  #Date-December 12,2022
  #@knowyourvape01
  #Scenario Outline: Vuse-KnowYourVapeLandingPage-PostLogin
  #Given user login with valid email address "<UN>" and password "<pwd>"
  #When Hover on About and click on Know your vape
  #Then Verify the Banner and buttons Watch Video and Learn More are available
  #And Click on Watch the video button
  #Then Verify the video model pop up contents
  #And Click on play and pause buttons
  #Then Close the video model pop up
  #And Click on Learn more button
  #Then Verify the Contents of Learn more page
  #And Scroll down to verify the UI contents
  #Then Navigate to Home page by clicking Vuse Icon
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| UN                    | pwd      |
  #| annil.ramroop@bat.com | TEST1234 |
  #
  #----------------------------------------------------------------------------------------------------------------
  #Test Case - Vuse- Know Your Vape Landing Page - Watch Video
  #Description - The purpose of this Test Case is to verify the UI of Know Your Vape Landing Page - Watch Video
  #Developed By - Sai Manaswini
  #Date - February 3,2022
  #@knowyourvape02
  #Scenario Outline: Vuse-KnowYourVapeLandingPage-WatchVideo
  #Given user login with valid email address "<UN>" and password "<pwd>"
  #When Hover on About and click on Know your vape
  #Then Verify the Banner and buttons Watch Video and Learn More are available
  #And Click on Watch the video button
  #Then Verify the video model pop up contents
  #And Click on play and pause buttons
  #Then Navigate to Home page by clicking Vuse Icon
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| UN                    | pwd      |
  #| annil.ramroop@bat.com | TEST1234 |
  #-----------------------------------------------------------------------------------------------------------------------
  #Test Case - Vuse- Know Your Vape Landing Page - Learn More
  #Description - The purpose of this test case is to validate the UI of Learn more page in Know Your Vape
  #Developed By - Sai Manaswini
  #Date - February 4,2022
  #Modified By-Sai Sireesha
  #Date-December 12,2022
  #Modified steps - 75 to 111
  @knowyourvape03
  Scenario Outline: Vuse-KnowYourVapeLandingPage-LearnMore
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on About and click on Know your vape
    Then Verify the Banner and buttons Watch Video and Learn More are available
    And Click on Learn more button
    Then Verify the Contents of Learn more page
    When Clicked on watch video of learn more page
    Then Verify video model is displayed
    And Close the video model pop up and verify learn more page displayed
    Then Scroll down to next tile and verify the contents
    And User Click on each question and verify related answers is displayed
    When User scrolled up and  Clicked on raw material sourcing button in clock wise
    Then Verify the Contents of raw material sourcing page
    When Clicked on watch video of raw material sourcing page
    Then Verify video model is displayed
    And Close the video model pop up and verify raw material sourcing displayed
    Then Scroll down to next tile of raw material sourching page and verify the contents
    And User Click on each question and verify related answers is displayed
    When User scrolled up and  Clicked on Testing button in clock wise
    Then Verify the Contents of Testing process page
    And Clicked on watch video of Testing page
    Then Verify video model is displayed
    And Close the video model pop up and verify Testing page displayed
    Then Scroll down to next tile of testing and verify the contents
    When User Click on each question and verify related answers is displayed
    When User scrolled up and  Clicked on Manufacturing process button in clock wise
    Then Verify the Contents of  Manufacturing process page
    When Clicked on watch video of Manufacturing process page
    Then Verify video model is displayed
    And Close the video model pop up and verify Manufacturing process page displayed
    Then Scroll down to next tile of Manufacturing process and verify the contents
    When User Click on each question and verify related answers is displayed
    When User scrolled up and  Clicked on supply chain button in clock wise
    Then Verify the Contents of  supply chain process page
    When Clicked on watch video of supply chain  page
    Then Verify video model is displayed
    And Close the video model pop up and verify supply chain  page displayed
    Then Scroll down to next tile of supply chain and verify the contents
    When User Click on each question and verify related answers is displayed
    When User scrolled up and  Clicked on Brand in hand button in clock wise
    Then Verify the Contents of  Brand in process page
    When Clicked on watch video of Brand in hand button page
    Then Verify video model is displayed
    And Close the video model pop up and verify Brand in hand button displayed
    Then Scroll down to next tile of Brand in hand and verify the contents
    When User Click on each question and verify related answers is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |
