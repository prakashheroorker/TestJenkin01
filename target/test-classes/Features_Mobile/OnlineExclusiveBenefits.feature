@newfunctionalitysuite
Feature: To verify Online Exclusive Benefits section

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - BatCanada_OnlineExclusiveBenefits_Mobile
  #Description - The purpose of the test case is to verify the "Online Exclusive Benefits" under 'About' menu
  #Developed By - Harika K
  #Date - 4,2022
  #Modified By - Sai Sireesha
  #Date - December 16,2022
  #Added steps-21 to 44
  @Onlineexclusivebenefits
  Scenario Outline: BatCanada_OnlineExclusiveBenefits_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamburger menu and clicks on About
    And User clicks on online exclusive benefits and verifies exclusive benefits page
    And Swipe to vape products we want section
    Then Verify Exclusive page and with some of the tiles is displayed
    And Click on All New Epod2 tile
    Then Verify All ePod Device page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User Swipe down and clicks on Vape pods tile
    Then Verify ePod Vape Pods page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User  Swipe down and clicks on Vuse XU tile
    Then Verify the Vuse Xu page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User Swipe down  to vuseplus rewards tile and click on Letsgo button
    Then Verify the Vuse rewards page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User  Swipe down to Subscribe and save tile and click on Subscribe now button
    Then Verify Subscribe and save page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User Swipe down to Mix and Match bundle and  click on shop now button
    Then Verify ePod Vape Pods page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User Swipe down to pass on the savings tile and clicks on Get started button
    Then Verify Vuse pass on savings  page is displayed
    And User click on browse back and verify the exclusive benefits page
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      |
      | jedidiah.ratke@bat.com | TEST1234 |
