Feature: To verify Subscription Landing page

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_SubscriptionLandingpage_09_TC001
  #Description - Objective: This purpose of this test case is to verify the UI of Subscription landing Screen
  #Developed By - Harsha Kumar
  #Date - September 24,2021
  #Modified By- Sai Sireesha
  #Date-December 12,2022
  #Modified steps-20 to 27
  @SubscriptionLandingPage
  Scenario Outline: GVCA_SubscriptionLandingpage_09_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on save and click on subscribe and save under programs
    Then Verify user redirected to the Subscription page and relevant content is displayed
    When User scrolls down and click on subscribe now button
    Then Verify ePod Vape Pod Subscription page is displayed
    And Click on browser back and verify the Suscription page displayed
    Then Scroll to How it works section and verify the content
    When User click on Subscribe now under how it works
    Then Verify ePod Vape Pod Subscription page is displayed
    When Click on browser back and verify the Suscription page displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                  | pwd      |
      | sarah.nilan@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionLandingpage_FAQs_Validation
  #Description - This purpose of this test case is to verify theFAQ's in  Subscribe&Save landing page
  #Modified By- Sai Sireesha
  #Date-December 12,2022
  @SubscriptionFaq
  Scenario Outline: GVCA_SubscriptionLandingpage_FAQs_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on save and click on subscribe and save under programs
    Then Verify redricted to the Subscription page is displayed
    And User scroll to Any questions section
    When User type keywords to find a topic "<Question>" and verify relevant pop displayed
    Then User scroll down to Freuently Asked questions and verify no of faqs
    When User click on each question adjacent drop down and verify the related answer
    And User scrolls down and click on Click here link
    Then Verify the user redirects to the susbcription terms page
    When Click on browser back and verify the Suscription page displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                  | pwd      | Question               |
      | sarah.nilan@bat.com | TEST1234 | When will I be charged |
