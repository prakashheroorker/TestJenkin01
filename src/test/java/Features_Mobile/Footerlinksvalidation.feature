@footer
Feature: Verifing footer links content

  Background: 
    Given User is on pre-login page in mobile

  #Test Case - GVCA_ConditionsOfSaleValidation_Mobile
  #Description - The purpose of this Test Case is to verify the Condition of sale page content and click possible links in the content from the page footer for both Pre and Post logins.
  #Updated 12-27 lines  By - Akhila
  #Date - DEC 08,2022
  @Condition12
  Scenario Outline: GVCA_ConditionsOfSaleValidation_Mobile
    When Swipe Down and click on conditions of sale in the page footer in mobile
    Then Verify Whether User Is Navigated To Conditions Of Sale Page in mobile
    And Verify Display Content Is Same As Production URL in mobile
    And Verify the Support Email ID in the content in mobile
    And Verify SubLinks Content - Cookie policy in mobile
    And Browser back to home page
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When Swipe Down and click on conditions of sale in the page footer in mobile
    Then Verify Whether User Is Navigated To Conditions Of Sale Page in mobile
    And Verify Display Content Is Same As Production URL in mobile
    And Verify the Support Email ID in the content in mobile
    And Verify SubLinks Content - Cookie policy in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------
  #Test Case - GVCA_CookiePolicyValidation_Mobile
  #Description - The purpose of this Test Case is to verify the Cookie policy page content and click possible links in the content from the page footer for both Pre and Post logins
  #Updated 42-70 By - Akhila
  #Date - DEC 08 2022
  @CookiePolicy12
  Scenario Outline: GVCA_CookiePolicyValidation_Mobile
    When Swipe down and click on cookie policy in the page footer in mobile
    Then Verify whether user is navigated to cookie policy page in mobile
    And Verify Cookie Policy content should be same as Production environment in mobile
    And Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed in mobile
    And Verify the  website, delete and Control cookies and partners or site urls are displayed in mobile
    When Click on Terms and Conditions link in the content in mobile
    Then Verify the user navigates to  terms and condition page and browse back
    And Verify whether user is navigated to cookie policy page in mobile
    When Click on policies/privacy/partners link in mobile
    Then Verify the user navigates to Google Privacy terms page in the same tab in mobile
    When Navigate back to the Cookie Policy page in mobile
    And User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When Swipe down and click on cookie policy in the page footer in mobile
    Then Verify whether user is navigated to cookie policy page in mobile
    And Verify Cookie Policy content should be same as Production environment in mobile
    And Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed in mobile
    And Verify the  website, delete and Control cookies and partners or site urls are displayed in mobile
    When Click on Terms and Conditions link in the content in mobile
    Then Verify the user navigates to  terms and condition page and browse back
    And Verify whether user is navigated to cookie policy page in mobile
    When Click on policies/privacy/partners link in mobile
    Then Verify the user navigates to Google Privacy terms page in the same tab in mobile
    When Navigate back to the Cookie Policy page in mobile
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------
  #Test Case - GVCA_TermsAndConditionsFooterValidation_Mobile
  #Description - The purpose of this Test Case is to verify the TermsAndConditions page content and click possible links in the content from the page footer for both Pre and Post logins
  #Updated 84-97 lines By - Akhila
  #Date - DEC 08,2022
  @TermsAndConditionss
  Scenario Outline: GVCA_TermsAndConditionsFooterValidation_Mobile
    When Swipe down and click on Terms & Conditions in the page footer in mobile
    Then Verify that Terms & Conditions page displayed in mobile
    And Verify TermsAndConditions content should be same as Production environment in mobile
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page in mobile
    And Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content in mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When Swipe down and click on Terms & Conditions in the page footer in mobile
    Then Verify that Terms & Conditions page displayed in mobile
    And Verify TermsAndConditions content should be same as Production environment in mobile
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page in mobile
    And Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------
  #Test Case - GVCA_PrivacyPolicyFooterValidation_mobile
  #Description - The purpose of this Test Case is to verify the Privacy Policy page content and click possible links in the content from the page footer for both Pre and Post logins
  #Updated 112-139 By - Akhila
  #Date - DEC 08,2022
  @PrivacyPolicy123
  Scenario Outline: GVCA_PrivacyPolicyFooterValidation_mobile
    When Swipe Down and Click on  Privacy Policy in the page footer in mobile
    Then Verify privacy policy page is displayed in mobile
    And Verify Privacy Policy page content should be same as Production environment in mobile
    And Verify the Support Email ID: support@govype.ca and website url is displayed in mobile
    And Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content in mobile
    When Click on Terms and Conditions link in the content in mobile
    Then Verify the user navigates to  terms and condition page and browse back
    And Verify privacy policy page is displayed in mobile
    When Click on policies/privacy/partners link in mobile
    Then Verify the user navigates to Google Privacy terms page in the same tab in mobile
    And Navigate back to privacy policy page in mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevant content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    Then Verify home page is displayed in mobile
    When Swipe Down and Click on  Privacy Policy in the page footer in mobile
    Then Verify privacy policy page is displayed in mobile
    And Verify Privacy Policy page content should be same as Production environment in mobile
    And Verify the Support Email ID: support@govype.ca and website url is displayed in mobile
    And Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content in mobile
    When Click on Terms and Conditions link in the content in mobile
    Then Verify the user navigates to  terms and condition page and browse back
    When Close the current tab
    Then Verify privacy policy page is displayed in mobile
    When Click on policies/privacy/partners link in mobile
    Then Verify the user navigates to Google Privacy terms page in the same tab in mobile
    When Navigate back to privacy policy page in mobile
    Then Verify privacy policy page is displayed in mobile
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |
      
      
      
      
  #Test Case : GVCA_ConditionsOfSale_01_TC001
  #Objectives: The purpose of this test case is to verify the Conditions of Sale page contents from the page footer(Pre-Login)
  #Author: sireesha
  #Date: 11/08/2022
  #@conditionsofsale1
  #Scenario: GVCA_ConditionsOfSale_01_TC001
    #Then scroll to bottom of the page and click on conditions of sale link and verify page
    #And validate conditions of sale content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on contact us link and verify contact us page
    #
#----------------------------------------------------------------------------------------------  
  #Test Case : GVCA_ConditionsOfSale_02_TC001
  #Objectives: The purpose of this test case is to verify the Conditions of Sale page contents from the page footer(Post-Login)
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #@conditionsofsale
  #Scenario Outline: GVCA_ConditionsOfSale_02_TC001
    #When user clicks on hamberger menu and click on login or register
    #And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then scroll to bottom of the page and click on conditions of sale link and verify page
    #And validate conditions of sale content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on contact us link and verify contact us page
#
    #Examples: 
      #| UN                    | pwd      |
      #| annil.ramroop@bat.com | TEST1234 |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
  #
  #Test Case : GVCA_CookiePolicy_01_TC001
  #Objectives: The purpose of this Test case is to verify the Cookie Policy contents from the page footer(Pre-Login)
  #Author: Sireesha
  #Date: 19/08/2022
  #@cookiepolicy1
  #Scenario: GVCA_CookiePolicy_01_TC001
    #Then scroll to bottom of the page and click on cookiepolicy and verify page
    #And validate cookiepolicy content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on privacy policy and verify privacy policy page
    #Then close tab and click on all about cookies link
    #And navigate back and Click on policies or privacy or partners link
    #Then navigate back and click on contact us link and verify contact us page
 #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case : GVCA_CookiePolicy_02_TC001
  #Objectives: The purpose of this Test case is to verify the Cookie Policy contents from the page footer(Post-Login)
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #@cookiepolicy
  #Scenario Outline: GVCA_CookiePolicy_02_TC001
    #When user clicks on hamberger menu and click on login or register
    #And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then scroll to bottom of the page and click on cookiepolicy and verify page
    #And validate cookiepolicy content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on privacy policy and verify privacy policy page
    #Then close tab and click on all about cookies link
    #And navigate back and Click on policies or privacy or partners link
    #Then navigate back and click on contact us link and verify contact us page
#
    #Examples: 
      #| UN                    | pwd      |
      #| annil.ramroop@bat.com | TEST1234 |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
 #Test Case : GVCA_TermsAndConditionsFooter_01_TC001
  #Objectives: The purpose of this Test Case is to verify the Terms & Conditions contents from the Page Footer(Pre-Login)
  #Author: sireesha
  #Date: 11/08/2022
  #@termsandconditions1
  #Scenario: GVCA_TermsAndConditionsFooter_01_TC001
    #Then scroll to bottom of the page and click on Terms and conditions and verify page
    #And validate terms and conditions content in the page
    #---------------------------------------------------------------------------------------
#
  #Test Case : GVCA_TermsAndConditionsFooter_02_TC001
  #Objectives: The purpose of this Test Case is to verify the Terms & Conditions contents from the Page Footer(Post-Login)
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #@termsandconditions
  #Scenario Outline: GVCA_TermsAndConditionsFooter_02_TC001
    #When user clicks on hamberger menu and click on login or register
    #And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then scroll to bottom of the page and click on Terms and conditions and verify page
    #And validate terms and conditions content in the page
#
    #Examples: 
      #| UN                    | pwd      |
      #| suzanne.serby@bat.com | TEST1234 |
#
  #---------------------------------------------------------------------------------------------------------------------------------------------
 #
  #Test Case : GVCA_PrivacyPolicy_01_TC001
  #Objectives: To verify Privacy Policy footer link page and its content(Pre-Login)
  #Author: sireesha
  #Date: 12/08/2022
  #@privacypolicy1
  #Scenario: GVCA_PrivacyPolicy_01_TC001
    #Then scroll to bottom of the page and click on privacy policy and verify page
    #And validate privacy policy content in the page
    #Then validate Support Email ID content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on conditions of sale and verify page
    #And close tab and verify privacy policy page
    #
#-------------------------------------------------------------------------------------------------------------------    
#Test Case : GVCA_PrivacyPolicy_02_TC001
  #Objectives: To verify Privacy Policy footer link page and its content(Post-Login)
  #Author: Harsha Kumar
  #Date: 18/11/2021
  #@privacypolicy
  #Scenario Outline: GVCA_PrivacyPolicy_02_TC001
    #When user clicks on hamberger menu and click on login or register
    #And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then scroll to bottom of the page and click on privacy policy and verify page
    #And validate privacy policy content in the page
    #Then validate Support Email ID content in the page
    #Then click on terms and condition link and verify terms and conditions page
    #Then close tab and click on conditions of sale and verify page
    #And close tab and verify privacy policy page
#
    #Examples: 
      #| UN                    | pwd      |
      #| suzanne.serby@bat.com | TEST1234 |
      #
      #
      #
  #Test Case : GVCA_ConditionsOfSaleValidation_Mobile
  #Objectives:  Objective: The purpose of this Test Case is to verify the Condition of sale page content and click possible links in the content from the page footer for both Pre and Post logins.
  #Author: Akhila
  #Date: 12/08/2022
  #@conditionsofsale123
  #Scenario: GVCA_ConditionsOfSaleValidation_Mobile
    #When scroll to bottom of the page and click on conditions of sale link and verify page
    #And Display Content Is Same As Production URL in mobile
   #And Verify the Support Email ID in the content in mobile
    #And Verify SubLinks Content - Cookie policy in mobile
    #
#----------------------------------------------------------------------------------------------
