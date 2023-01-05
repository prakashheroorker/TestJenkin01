
Feature: Bottom Contents

  Background: 
    Given User is on pre-login page

 
  #Developed By - Bhavitha
  #Date - September 15,2021
  #Description - The purpose of this test case is to verify the Condition of Sale
  #Test Case - GVCA_ConditionsOfSale_01_TC001
  @Condition1 
  Scenario: GVCA_ConditionsOfSale_01_TC001
    When Scroll Down and click on conditions of sale
    Then Verify Whether User Is Navigated To Conditions Of Sale Page
    And Verify Display Content Is Same As Production URL
    When click SubLinks Content - TermsAndConditions
    Then Verify SubLinks Content - Contact Us

  #------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_ConditionsOfSale_02_TC001
  @Condition2, @GoldenRegressionSuite
  Scenario Outline: GVCA_ConditionsOfSale_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Scroll Down and click on conditions of sale
    Then Verify Whether User Is Navigated To Conditions Of Sale Page
    And Verify Display Content Is Same As Production URL
    When click SubLinks Content - TermsAndConditions
    Then Verify SubLinks Content - Contact Us

    Examples: 
      | UN               | pwd      |
      |jooeun.bae@bat.com| TEST1234 |

  #-----------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Description - The purpose of this test case is to verify the CookiePolicy
  #Test Case - GVCA_CookiePolicy_01_TC001
  @FooterSectionSuite @CookiePolicy1
  Scenario: GVCA_CookiePolicy_01_TC001
    When Click on Cookie Policy link
    Then Verify Cookie Policy content
    When Click on Terms and Conditions link
    Then Verify that Terms and Conditions page is displayed
    When Click on Privacy Policy link
    Then Verify that Privacy Policy page is displayed
    When Click on http://www.allaboutcookies.org/ link
    And Navigate back to the Cookie Policy page
    Then Verify that Cookie Policy page is displayed
    When Click on policies/privacy/partners link
    Then Verify page Privacy & Terms
    When Navigate back to the Cookie Policy page
    

  #----------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_CookiePolicy_02_TC001
  @CookiePolicy2 @AfterLogin, @GoldenRegressionSuite
  Scenario Outline: GVCA_CookiePolicy_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click on Cookie Policy link
    Then Verify Cookie Policy content
    When Click on Terms and Conditions link
    Then Verify that Cookie Policy page is displayed
    When Click on Privacy Policy link
    Then Verify that Cookie Policy page is displayed
    When Click on http://www.allaboutcookies.org/ link
    And Navigate back to the Cookie Policy page
    Then Verify that Cookie Policy page is displayed
    When Click on policies/privacy/partners link
    Then Verify page Privacy & Terms
    When Navigate back to the Cookie Policy page
    

    Examples: 
     | UN               | pwd      |
     |jooeun.bae@bat.com| TEST1234 |

  #------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to verify the Terms And Conditions
  #Developed By - Bhavitha
  #Date - September 21,2021
  #Test Case - GVCA_TermsAndConditionsFooter_01_TC001
  @TermsAndConditions1 
  Scenario: GVCA_TermsAndConditionsFooter_01_TC001
    When Scroll down to footer page and click on the web element
    And Click on Terms And Conditions
    Then Verify that Terms & Conditions page displayed
   # Then Verify that Conditions of Sale content present in the Terms & Condition page
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page

  #------------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_TermsAndConditionsFooter_02_TC001
  @TermsAndConditions2  @FooterSectionSuite
  Scenario Outline: GVCA_TermsAndConditionsFooter_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    Then Scroll down to footer page and click on the web element
    When Click on Terms And Conditions
    Then Verify that Terms & Conditions page displayed
    #Then Verify that Conditions of Sale content present in the Terms & Condition page
    And Verify the Support email Id support@govype.ca content present in the Terms & Condition page

    Examples: 
      | UN               | pwd      |
      |jooeun.bae@bat.com| TEST1234 |

  #------------------------------------------------------------------------------------
  #Description - The purpose of this test case is to verify the Privacy policy
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Test Case - GVCA_PrivacyPolicy_01_TC001
  @PrivacyPolicy1 @FooterSectionSuite 
  Scenario: GVCA_PrivacyPolicy_01_TC001
    When Scroll Down and Click on  Privacy Policy text
    Then Verify privacy policy page is displayed
    Then Verify Privacy Policy page content
    And Verify the Support Email ID: support@govype.ca(New id:  info.ca@vuse.com)
    Then Verify Terms and Conditions page is opened in same tab
    When Click on Conditions of Sales sublink
    Then Verify Conditions of Sales page is opened in same tab
    
#-----------------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 17,2021
  #Test Case - GVCA_PrivacyPolicy_02_TC001
  @PrivacyPolicy2
  Scenario Outline: GVCA_PrivacyPolicy_02_TC001
  	Given User enters email "<UN>" and password "<pwd>"
    When Scroll Down and Click on  Privacy Policy text
    Then Verify privacy policy page is displayed
    Then Verify Privacy Policy page content
    And Verify the Support Email ID: support@govype.ca(New id:  info.ca@vuse.com)
    Then Verify Terms and Conditions page is opened in same tab
    When Click on Conditions of Sales sublink
    Then Verify Conditions of Sales page is opened in same tab

       Examples: 
      | UN               | pwd      |
      |jooeun.bae@bat.com| TEST1234 |
      