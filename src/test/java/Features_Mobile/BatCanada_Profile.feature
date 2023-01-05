@ProfileMobile
Feature: Verifing profile pages

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #----------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyAccount
  #Description - The purpose of this test case is to verify the landing page of My Account
  #Developed By - Harika
  #Date - January 21,2022
  #@MyAccount
  #Scenario Outline: BatCanada_MyAccount
  #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
  #Then user Clicks on hamberger menu and verify links in Account section
  #When user clicks on My Account link
  #When user clicks on Edit button in the User Name
  #When user clicks on Add Payment Method link
  #When User clicks on No return button in Delete payment method modal
  #
  #Examples:
  #| UN                           | pwd      |
  #| christine.mulholland@bat.com | TEST1234 |
  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyAccount
  #Description - The purpose of this test case is to verify the landing page of My Account
  #Pre Condition: User should have saved card under Payment method section of the My account page
  #Developed By - Harika
  #Date - January 21,2022
  #Modified - saisireesha
  #Date - December 08,2022
  #Modified Steps-38 to 53
  @MyAccount
  Scenario Outline: BatCanada_MyAccount
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And Clicks on hamberger menu and verify links in Account section
    When User clicks on My Account link
    Then Verify account section with relevant content is displayed
    When User clicks on Edit button in the User Name
    Then Verify the  Edit your information pop up modal is displayed
    And User clicks on close button of the information pop up
    Then Verify account section should be displayed
    When User swipe down and clicks on Add Payment Method link
    Then Verify the Add payment pop model displays
    And User clicks on close button of the add payment menthod
    Then Verify account section should be displayed
    When User swipe down and click on delete button of one of the saved cards
    Then Verify delete payment model should be displayed
    And User clicks on No return button in Delete payment method modal
    Then Verify account section should be displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_Account_Section_UI
  #Description - The purpose of this test case is to verify the UI of User
  #Developed By - Harika
  #Date - January 21,2022
  #@Accountsection
  #Scenario Outline: BatCanada_Account_Section_UI
  #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
  #Then user Clicks on hamberger menu and verify links in Account section
  #When user clicks on My Account link
  #And Navigate back to Home page
  #And user clicks on My Reward and verify Rewards Section is displayed with relavent Content
  #And Navigate back to Home page
  #And user clicks on My Savings and verify Savings Section is displayed with relavent Content
  #And Navigate back to Home page
  #And user clicks on My Orders and verify Orders Section is displayed with relavent Content
  #And Navigate back to Home page
  #Then user clicks on My Subscription and verify Subscription Section is displayed with relavent Content
  #And Navigate back to Home page
  #
  #Examples:
  #| UN                    | pwd      |
  #| bhavitha.nune@bat.com | TEST1234 |
  #------------------------------------------------------------------------------------------
  #Test Case - BatCanada_Account_Section_UI
  #Description - The purpose of this test case is to verify the UI of User
  #Developed By - Harika
  #Date - January 21,2022
  #Modified - saisireesha
  #Date - December 08,2022
  #Modified steps-100 to 106
  @Accountsection
  Scenario Outline: BatCanada_Account_Section_UI
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User Clicks on hamberger menu and verify links in Account section
    When User clicks on My Account link
    Then Verify account section with relevant content is displayed
    When User clicks on hamberger menu swipe down and click on My rewards link
    Then Verify rewards section is displayed
    When User clicks on hamberger menu swipe down and click on My savings link
    Then Verify Savings Section  is displayed
    When User clicks on hamberger menu swipe down and click on My Orders link
    Then Verify Orders Section  is displayed
    When User clicks on hamberger menu swipe down and click on My Subscription link
    Then Verify Subscription Section is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : BatCanada_MyOrder
  #Objectives: The purpose of this test case is to verify the my orders landing page
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #@myorder
  #Scenario Outline: BatCanada_MyOrder
  #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
  #Then user Clicks on hamberger menu and verify links in Account section
  #And user clicks on My Orders and verify Orders Section is displayed with relavent Content
  #And verify Top footer and bottom footer
  #
  #Examples:
  #| UN                           | pwd      |
  #| christine.mulholland@bat.com | TEST1234 |
  #-------------------------------------------------------------------------------------------
  #Test Case : BatCanada_MyOrder
  #Objectives: The purpose of this test case is to verify the my orders landing page
  #Pre Condition :User must have atleast one order in the My Orders Section
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #Modified By-Sai sireesha
  #Date- December 9,2022
  #Modified Steps:144,145
  @myorder
  Scenario Outline: BatCanada_MyOrder
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu swipe down and click on My Orders link
    Then Verify my order with relevant content is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : BatCanada_MyReward
  #Objectives: The purpose of this test case is to verify the my rewards landing page
  #Author: Harika
  #Date - January 19,2022
  #Modified By-Sai sireesha
  #Date- December 9,2022
  #Modified Steps:166,167
  @MyRewards
  Scenario Outline: BatCanada_MyRewards
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu swipe down and click on My rewards link
    Then Verify rewards page with relevant content is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : BatCanada_MySavings
  #Objectives: The purpose of this test case is to verify the my Savings landing page
  #Author: Harika
  #Date - January 20,2022
  #Modified By-Sai sireesha
  #Date- December 9,2022
  #Modified Steps:188 to 195
  @MySavings
  Scenario Outline: BatCanada_MySavings
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu swipe down and click on My savings link
    Then Verify the savings page with relevant content is displayed
    When User swipe down and  click on Terms and Condition link
    Then Verify  user navigated to terms and condition page
    And User navigate back and verify my savings page is displayed
    When User  swipe down and clicks on Learn More link
    Then Verify user navigated to the pass on savings page
    And User navigate back and verify my savings page is displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : BatCanada_MySubscription
  #Objectives: The purpose of this test case is to verify the my Subscription landing page
  #Pre Condition: The User must have Existing Subscription
  #Author: Harika
  #Date - January 20,2022
  #Modified By-Sai sireesha
  #Date- December 9,2022
  #Modified Steps:217 to 225
  @MySubscription
  Scenario Outline: BatCanada_MySubscription
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu swipe down and click on My Subscription link
    Then Verify subscription page with relevant content is displayed
    When User swipe down and clicks on editdetails button
    Then Verify user navigates to the edit details page is displayed
    When User click on back button and verify the subscription page is displayed
    And User swipe down and clicks on pause link
    Then Verify pause subscription model is displayed
    When User cliks on no return from the model and verify the subscription page displayed
    And User swipe down and clicks on cancel link
    Then Verify cancel subscription model is displayed
    When User cliks on no return from the model and verify the subscription page displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |
