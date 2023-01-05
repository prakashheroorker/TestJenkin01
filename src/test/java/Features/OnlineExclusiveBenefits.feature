@newfunctionalitysuite
Feature: To verify Online Exclusive Benefits section

  Background: 
    Given User is on pre-login page

  #Test Case - BatCanada_OnlineExclusiveBenefits
  #Description - This Test is to validate the Online Exclusive Benefits
  #Developed By - Harika K
  #Date - 2/4/2022
  #Modified By- Sai Sireesha
  #Date - December 16,2022
  #Modified steps - 21 to 35 , 37 to 43
  @Onlineexclusivebenefits
  Scenario Outline: BatCanada_OnlineExclusiveBenefits
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User howers on About and click on online exclusive benefits and verifies page
    And Scroll to vape products we want section
    Then Verify tiles are displayed
    When Click on All New Epod2 Tile
    Then Verify All ePod Device Page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User scroll down and clicks on Vape pods tile
    Then Verify ePod Vape Pods Page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User  scroll down and clicks on Vuse XU tile
    Then Verify the Vuse Xu Page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User scroll down  to vuseplus rewards tile and click on Letsgo button
    Then Verify the Vuse Rewards page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User  scroll down to Subscribe and save tile and click on Subscribe now button
    Then Verify Subscribe and Save page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User scroll down to Mix and Match bundle and  click on shop now button
    Then Verify ePod Vape Pods Page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And User scroll down to pass on the savings tile and clicks on Get started button
    Then Verify Vuse pass on Savings  page is displayed
    When User click on browse back and verify the Exclusive benefits page
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN            | pwd      |
      | siri7@bat.com | TEST1234 |
