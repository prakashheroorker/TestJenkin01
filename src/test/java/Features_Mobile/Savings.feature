Feature: Savings

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Developed By - Bhavitha
  #Date - February 18,2022
  #Description - The purpose of the test case is to verify the "Pass On The Savings(Up to $200)" landing page Under 'Save'
  #Test Case - Vuse_pass_on_the_savings_1_Mobile
  #Modified By- saisireesha
  #Date - December 15,2022
  #Modified steps-18 to 32
  @Vuse_pass_on_the_savings_1_Mobile
  Scenario Outline: Vuse_pass_on_the_savings_1_Mobile
     And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Pass On The Savings
    Then Verify Pass On The Savings Page and with relevant text is displayed
    When Click On GET STARTED
    Then Verify it will swipe upto START PASSING ON THE SAVINGS
    When User click on Copy link and verify invite link is copied
    And User click on browse back and verify Pass On The Savings Page is displayed
    When User swipe down and click on Track your savings
    Then Verify My savings Page is displayed
    And User click on browse back and verify Pass On The Savings Page is displayed
    When User swipe to faqs click on each question and verify the answers
    And Click on click Here  under faqs
    Then Verify it will Navigate to Vuse Pass on the Savings Program Terms and Conditions
    And User click on browse back and verify Pass On The Savings Page is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                           | pwd      |
      | christine.mulholland@bat.com | TEST1234 |
