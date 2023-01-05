
@Savings
Feature: Savings

  Background: 
    Given User is on pre-login page

  #Developed By - Bhavitha
  #Date - February 04,2022
  #Description - The purpose of the test case is to verify the "Pass On The Savings(Up to $200)" landing page Under 'Save'
  #Test Case - Vuse_pass_on_the_savings_TC001
  #Modified By- Sai Sireesha
  #Date - December 14,2022
  #Modified steps-22,25 to 30, 33
  @Vuse_pass_on_the_savings_Validation
  Scenario Outline: Vuse_pass_on_the_savings_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on save and click on Pass On The Savings under Save
    Then Verify Pass On The Savings page and with relevant text is displayed
    When Click on GET STARTED
    Then Verify it will scroll upto START PASSING ON THE SAVINGS
    When User click on copy link and verify invite link is copied
    And User click on browse back and verify Pass On The Savings page is displayed
    When User scroll down and click on Track your savings
    Then Verify My savings page is displayed
    And User click on browse back and verify Pass On The Savings page is displayed
    When User scrolls to faqs click on each question and verify the answers
    And Click on click here  under faqs
    Then Verify it will navigate to Vuse Pass on the Savings Program Terms and Conditions
    And User click on browse back and verify Pass On The Savings page is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                           | pwd      |
      | christine.mulholland@bat.com | TEST1234 |
