Feature: To verify Subscription Landing page

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - GVCA_SubscriptionLandingpage_09_TC001
  #Description - This purpose of this test case is to verify the UI of Subscription landing Screen 
  #Developed By - Sandeepa S
  #Date - January 21,2022
  #Modified By-Sai Sireesha
  #Date - December 12,2022
  #Modified steps:20 to 27
  @SubscriptionLandingpage
  Scenario Outline: GVCA_SubscriptionLandingpage_09_TC001
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    Then Verify Subscribe and Save page and with relevant content is displayed
    When User swipe down and click on subscribe now under subscription plans
    Then Verify ePod Vape Pod Subscription page is displayed
    When User click on browse back and verify Subscribe and Save page is displayed
    And User swipe to How it works and verify content
    And User swipe down and click on subscribe now under how it works
    Then Verify ePod Vape Pod Subscription page is displayed
    When User click on browse back and verify Subscribe and Save page is displayed
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionLandingpage_FAQs_Validation
  #Description - This purpose of this test case is to verify the FAQ's in  Subscription screen
  #Developed By - Sandeepa S
  #Date - January 21,2022
  #Modified By-Sai Sireesha
  #Date - December 12,2022
  #Modified steps:51 to 58
  @SubscriptionLandingpage1
  Scenario Outline: GVCA_SubscriptionLandingpage_FAQs_Validation
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs
    Then Verify Subscribe and Save page is displayed
    And User scroll to Any Questions section
    When User type keywords to find a topic "<Question>" and verify relevant pop displayed
    Then User swipe down to frequently asked questions and verify no of faqs
    When User click on each question adjacent drop down and verify the Related answer
    And User swipe down and click on Click here link
    Then Verify the user redirects to the Susbcription terms page
    When User click on browse back and verify Subscribe and Save page is displayed
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      | Question               |
      | annil.ramroop@bat.com | TEST1234 | When will I be charged |
