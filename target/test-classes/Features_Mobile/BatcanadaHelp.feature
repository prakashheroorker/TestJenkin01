Feature: Bat Canada Help

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - BatCanada_Help_Mobile
  #Description - The purpose of this test case is to verify the Help UI
  #Author - Harsha
  #Date -Feb 03,2022
  #Updated by - Shaik
  #Updated lines - 21 to 25
  #Date - 15/12/22
  @BatHelp
  Scenario Outline: BatCanada_Help_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Help and verify links under help
    And User clicks on Shipping and delivery link 
    Then Verify Shipping and delivery page
    When User clicks on hamberger menu and clicks on Help
    And User click on Contact Us and verify Contact Us screen
    When User clicks on hamberger menu and clicks on Help
    And User clicks on FAQs and verify FAQs screen
    When User clicks on hamberger menu 
    And User click on StoreLocator and verify StoreLocator screen
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_Help_Shipping&Delivery_Page_Mobile
  #Description - Objective: The purpose of this test case is to verify the Shipping and delivary page and content
  #Author - Harsha
  #Date -January 28,2022
  #Modified by - Sai Sireesha
  #Modified Date- December 19,2022
  #Modified steps-52 to 57
  @Shipping
  Scenario Outline: BatCanada_Help_Shipping&Delivery_Page_Mobile
     And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Help and verify links under help
    And User clicks on Shipping and delivery and verify shipping and delivery screen
    When Click on scroller icon and verify all shipping options
    Then Validate content of all shipping options
    And User enters "<Zipcode>" and clicks on submit
    Then Verify Tick Mark is displayed
    When User swipe to ready to shop and clicks on shop devices 
    Then Verify Epod2 Page is displayed
    When Switch to default and verify shipping and delivery Page is displayed
    And User swipe to ready to shop and clicks on shop pods 
    Then Verify ePod Vape Pods page is Displayed 
    When Switch to default and verify shipping and delivery Page is displayed
    And User enters question "<question>" and verifies the auto suggesion
    Then Swipe to questions and validate content for all question
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
   

    Examples: 
      | UN                      | pwd      | Zipcode | question                     |
      | sahar.nasrallah@bat.com | TEST1234 | V5L0A0  | What is Vuse Click & Collect |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_Help_ContactUs_page
  #Description -Objective: The purpose of this test case is to verify the submit request page UI
  #Author - Harsha
  #Date -February 11,2022
  #@ContactUs
  #Scenario Outline: BatCanada_Help_ContactUs_page
    #And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #When User clicks on hamberger menu and clicks on Help and verify links under help
    #And click on Contact Us and verify Contact Us screen
    #Then verify options under Contact Us
    #And Click on LIVE CHAT and verify bot is opened and close the bot
    #And Click on cobrowse and verify model is opened and close the pop up
    #Then verify all footer links and Legal Advisory HeadQuarters text
#
    #Examples: 
      #| UN                      | pwd      |
      #| sahar.nasrallah@bat.com | TEST1234 |
