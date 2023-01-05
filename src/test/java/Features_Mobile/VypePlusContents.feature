Feature: to verify the UI of Vype plus page.

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - GVPCA_VypePlusContents_01_TC001
  #Description - The purpose of this Test Case is to verify the UI of Vype plus page.
  #Developed By - Bhavitha
  #Date - January 21,2022
  @GVPCA_VypePlusContents_01_TC001
  Scenario Outline: GVPCA_VypePlusContents_01_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Vuse+ Rewards
    Then Verify vuse+ rewards page and verify joining is easy content
    Then Verify how to maintan your status content
    Then Verify perks of vuseplus and benfits
    And Verify video below rewards program
    Then Verify faqs present in vuseplus rewards page
    Then Verify all footer links
    And Verify footer content present in vuseplus rewards page

    Examples: 
      | UN                     | pwd      |
      | mark.jacob@yopmail.com | TEST1234 |

 

  #Test Case - GVPCA_VypePlusContents_03_TC001
  #Description - The purpose of this Test Case is to verify the Footer Section in VypePlus page
  #Developed By - Bhavitha
  #Date - January 21,2022
  @GVPCA_VypePlusContents_03_TC001
  Scenario Outline: GVPCA_VypePlusContents_03_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Vuse+ Rewards
    Then Verify vuse+ rewards page and verify joining is easy content
    And Verify all footer links in Vuse+ Rewards page

    Examples: 
      | UN                       | pwd      |
      | kareem.hegmann43@bat.com | TEST1234 |
      
      
#Test Case - GVPCA_VypePlusContents_06_TC001
#Description - TThe purpose of this Test Case is to verify the Questions section in VypePlus page.
#Developed By - Bhavitha
#Date - January 28,2022
@GVPCA_VypePlusContents_06_TC001
Scenario Outline: GVPCA_VypePlusContents_06_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Vuse+ Rewards
    Then Verify vuse+ rewards page and verify joining is easy content
    Then Scroll to any question and type keywords to find a topic in vuseplus rewards page "<Question>"
    And Click and verify all frequently asked questions

Examples:

   |UN                       |pwd       |Question                          |
   |mark.jacob@yopmail.com   |TEST1234  |Does Vuse Plus have an expiry date|