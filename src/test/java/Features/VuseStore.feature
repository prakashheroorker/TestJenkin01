@newfunctionalitysuite @vuseStoresuite
Feature: to verify the UI of Vype plus page.

  Background: 
    Given User is on pre-login page

  #Test Case - BAT Canada_Vuse Store page_Validation
  #Description - The purpose of this Test Case is to verify the UI of Vuse store page.
  #Developed By - Sandeepa S
  #Date - October 11 Feb 2022
  #Modified By- Sai Sireesha
  #Date - December 14,2022
  #Modified steps-20 to 25
  @Store
  Scenario Outline: BatCanada_Vuse_Store_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User click on Vuse store from header in home page
    Then Verify vuse store page  and with relevant content is displayed
    When User click on BritishColoumbia Province link
    Then verify the BritishColoumbia province related content is displayed
    When User click on Alberta province link
    Then Verify Alberta province related content is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    Examples: 
      | UN                           | pwd      |
      | christine.mulholland@bat.com | TEST1234 |
