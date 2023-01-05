Feature: Bottom Contents

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_ConditionsOfSaleValidation
  #Description - The purpose of this Test Case is to verify the Condition of sale page content and click possible links in the content from the page footer for both Pre and Post logins.
  #Updated 12-27 lines  By - Akhila
  #Date - DEC 08,2022
  @Condition123
  Scenario Outline: GVCA_ConditionsOfSaleValidation
    When Scroll Down and click on conditions of sale in the page footer
    Then Verify Whether User Is Navigated To Conditions Of Sale Page
    And Verify Display Content Is Same As Production URL
    And Verify the Support Email ID in the content
    And Verify SubLinks Content - Cookie policy
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Scroll Down and click on conditions of sale in the page footer
    Then Verify Whether User Is Navigated To Conditions Of Sale Page
    And Verify Display Content Is Same As Production URL
    And Verify the Support Email ID in the content
    And Verify SubLinks Content - Cookie policy
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------
  #Test Case - GVCA_CookiePolicyValidation
  #Description - The purpose of this Test Case is to verify the Cookie policy page content and click possible links in the content from the page footer for both Pre and Post logins
  # Updated 40-70 By - Akhila
  #Date - DEC 08 2022
  @CookiePolicy123
  Scenario Outline: GVCA_CookiePolicyValidation
    When Scroll down and click on cookie policy in the page footer
    Then Verify whether user is navigated to cookie policy page
    And Verify Cookie Policy content should be same as Production environment.
    And Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed.
    And Verify the  website, delete and Control cookies and partners or site urls are displayed
    When Click on Terms and Conditions link in the content
    Then Verify the user navigates to  terms and condition page in the new tab
    When Close the current tab
    Then Verify whether user is navigated to cookie policy page
    When Click on policies/privacy/partners link
    Then Verify the user navigates to Google Privacy terms page in the same tab
    When Navigate back to the Cookie Policy page
    Then Verify the user is in Pre login home page
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Scroll down and click on cookie policy in the page footer
    Then Verify whether user is navigated to cookie policy page
    And Verify Cookie Policy content should be same as Production environment.
    And Verify the terms and conditions ,privacy policy and contact us links in the page content are displayed.
    And Verify the  website, delete and Control cookies and partners or site urls are displayed
    When Click on Terms and Conditions link in the content
    Then Verify the user navigates to  terms and condition page in the new tab
    When Close the current tab
    Then Verify whether user is navigated to cookie policy page
    When Click on policies/privacy/partners link
    Then Verify the user navigates to Google Privacy terms page in the same tab
    When Navigate back to the Cookie Policy page
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #----------------------------------------------------------------------------
  #Test Case - GVCA_TermsAndConditionsFooterValidation
  #Description - The purpose of this Test Case is to verify the TermsAndConditions page content and click possible links in the content from the page footer for both Pre and Post logins
  #Updated 83-100 lines By - Akhila
  #Date - DEC 08,2022
  @TermsAndConditions
  Scenario Outline: GVCA_TermsAndConditionsFooterValidation
    When Scroll down and click on Terms & Conditions in the page footer
    Then Verify that Terms & Conditions page displayed
    And Verify TermsAndConditions content should be same as Production environment.
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page
    And Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content
    Then Verify the user is in Pre login home page
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Scroll down and click on Terms & Conditions in the page footer
    Then Verify that Terms & Conditions page displayed
    And Verify TermsAndConditions content should be same as Production environment.
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page
    And Verify the Sub-Links Conditions Of Sale, Privacy policy,Cookiepolicy and Contact us are displayed in the content
    Then Navigate back to home page
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------
  #Test Case - GVCA_PrivacyPolicyFooterValidation
  #Description - The purpose of this Test Case is to verify the Privacy Policy page content and click possible links in the content from the page footer for both Pre and Post logins
  #Updated 114-145 By - Akhila
  #Date - DEC 08,2022
  @PrivacyPolicy123
  Scenario Outline: GVCA_PrivacyPolicy_01_TC001
    When Scroll Down and Click on  Privacy Policy in the page footer
    Then Verify privacy policy page is displayed 
    And Verify Privacy Policy page content should be same as Production environment.
    And Verify the Support Email ID: support@govype.ca and website url is displayed
    And Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content
    When Click on Terms and Conditions link in the content
    Then Verify the user navigates to  terms and condition page in the new tab
    When Close the current tab
    Then Verify privacy policy page is displayed
    When Click on policies/privacy/partners link
    Then Verify the user navigates to Google Privacy terms page in the same tab
    When Navigate back to privacy policy page
    Then Verify privacy policy page is displayed
 	  Then Verify the user is in Pre login home page
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Scroll Down and Click on  Privacy Policy in the page footer
    Then Verify privacy policy page is displayed
    And Verify Privacy Policy page content should be same as Production environment.
    And Verify the Support Email ID: support@govype.ca and website url is displayed
    And Verify the Sub-Links Conditions Of Sale, Terms and Condition ,Cookiepolicy,Account details page and Contact us in the content
    When Click on Terms and Conditions link in the content
    Then Verify the user navigates to  terms and condition page in the new tab
    When Close the current tab
    Then Verify privacy policy page is displayed
    When Click on policies/privacy/partners link
    Then Verify the user navigates to Google Privacy terms page in the same tab
    When Navigate back to privacy policy page
    Then Verify privacy policy page is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                 | pwd      |
      | jooeun.bae@bat.com | TEST1234 |
      
   #------------------------------------------------------------------------------------------    
        
  #Developed By - Bhavitha
  #Date - September 15,2021
  #Description - The purpose of this test case is to verify the Condition of Sale
  #Test Case - GVCA_ConditionsOfSale_01_TC001
  #@Condition1 
  #Scenario: GVCA_ConditionsOfSale_01_TC001
    #When Scroll Down and click on conditions of sale
    #Then Verify Whether User Is Navigated To Conditions Of Sale Page
    #And Verify Display Content Is Same As Production URL
    #When click SubLinks Content - TermsAndConditions
    #Then Verify SubLinks Content - Contact Us
#
  #------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_ConditionsOfSale_02_TC001
  #@Condition2, @GoldenRegressionSuite
  #Scenario Outline: GVCA_ConditionsOfSale_02_TC001
    #Given User enters email "<UN>" and password "<pwd>"
    #When Scroll Down and click on conditions of sale
    #Then Verify Whether User Is Navigated To Conditions Of Sale Page
    #And Verify Display Content Is Same As Production URL
    #When click SubLinks Content - TermsAndConditions
    #Then Verify SubLinks Content - Contact Us
#
    #Examples: 
      #| UN               | pwd      |
      #|jooeun.bae@bat.com| TEST1234 |
#
  #-----------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Description - The purpose of this test case is to verify the CookiePolicy
  #Test Case - GVCA_CookiePolicy_01_TC001
  #@FooterSectionSuite @CookiePolicy1
  #Scenario: GVCA_CookiePolicy_01_TC001
    #When Click on Cookie Policy link
    #Then Verify Cookie Policy content
    #When Click on Terms and Conditions link
    #Then Verify that Terms and Conditions page is displayed
    #When Click on Privacy Policy link
    #Then Verify that Privacy Policy page is displayed
    #When Click on http://www.allaboutcookies.org/ link
    #And Navigate back to the Cookie Policy page
    #Then Verify that Cookie Policy page is displayed
    #When Click on policies/privacy/partners link
    #Then Verify page Privacy & Terms
    #When Navigate back to the Cookie Policy page
    #
#
  #----------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_CookiePolicy_02_TC001
  #@CookiePolicy2 @AfterLogin, @GoldenRegressionSuite
  #Scenario Outline: GVCA_CookiePolicy_02_TC001
    #Given User enters email "<UN>" and password "<pwd>"
    #When Click on Cookie Policy link
    #Then Verify Cookie Policy content
    #When Click on Terms and Conditions link
    #Then Verify that Cookie Policy page is displayed
    #When Click on Privacy Policy link
    #Then Verify that Cookie Policy page is displayed
    #When Click on http://www.allaboutcookies.org/ link
    #And Navigate back to the Cookie Policy page
    #Then Verify that Cookie Policy page is displayed
    #When Click on policies/privacy/partners link
    #Then Verify page Privacy & Terms
    #When Navigate back to the Cookie Policy page
    #
#
    #Examples: 
     #| UN               | pwd      |
     #|jooeun.bae@bat.com| TEST1234 |
#
  #------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to verify the Terms And Conditions
  #Developed By - Bhavitha
  #Date - September 21,2021
  #Test Case - GVCA_TermsAndConditionsFooter_01_TC001
  #@TermsAndConditions1 
  #Scenario: GVCA_TermsAndConditionsFooter_01_TC001
    #When Scroll down to footer page and click on the web element
    #And Click on Terms And Conditions
    #Then Verify that Terms & Conditions page displayed
   # Then Verify that Conditions of Sale content present in the Terms & Condition page
    #And Verify the Support email Id support@govype.ca content present in the Terms & Condition page
#
  #------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_TermsAndConditionsFooter_02_TC001
  #@TermsAndConditions2  @FooterSectionSuite
  #Scenario Outline: GVCA_TermsAndConditionsFooter_02_TC001
    #Given User enters email "<UN>" and password "<pwd>"
    #Then Scroll down to footer page and click on the web element
    #When Click on Terms And Conditions
    #Then Verify that Terms & Conditions page displayed
    #Then Verify that Conditions of Sale content present in the Terms & Condition page
    #And Verify the Support email Id support@govype.ca content present in the Terms & Condition page
#
    #Examples: 
      #| UN               | pwd      |
      #|jooeun.bae@bat.com| TEST1234 |
#
  #------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to verify the Privacy policy
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Test Case - GVCA_PrivacyPolicy_01_TC001
  #@PrivacyPolicy1 @FooterSectionSuite 
  #Scenario: GVCA_PrivacyPolicy_01_TC001
    #When Scroll Down and Click on  Privacy Policy text
    #Then Verify privacy policy page is displayed
    #Then Verify Privacy Policy page content
    #And Verify the Support Email ID: support@govype.ca(New id:  info.ca@vuse.com)
    #Then Verify Terms and Conditions page is opened in same tab
    #When Click on Conditions of Sales sublink
    #Then Verify Conditions of Sales page is opened in same tab
    #
#-----------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_PrivacyPolicy_02_TC001
  #@PrivacyPolicy2
  #Scenario Outline: GVCA_PrivacyPolicy_02_TC001
  #	Given User enters email "<UN>" and password "<pwd>"
    #When Scroll Down and Click on  Privacy Policy text
    #Then Verify privacy policy page is displayed
    #Then Verify Privacy Policy page content
    #And Verify the Support Email ID: support@govype.ca(New id:  info.ca@vuse.com)
    #Then Verify Terms and Conditions page is opened in same tab
    #When Click on Conditions of Sales sublink
    #Then Verify Conditions of Sales page is opened in same tab
#
       #Examples: 
      #| UN               | pwd      |
      #|jooeun.bae@bat.com| TEST1234 |
      #
