Feature: verify the Social Media Ribbon footer links

  #Test Case: GCVA_SocialMediaRibbonFooter_02_TC001
  #Description: To verify Social Media Ribbon: Instagram (Pre-Login)
  #Author: Sasikala
  #Date: 10/08/2022
  @FooterSectionSuite2 @instagrampre
  Scenario: GCVA_SocialMediaRibbonFooter_02_TC001
    Given User is on pre-login page in mobile
    Then user scrolls down and clicks Instagram link

  #-------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_01_TC001
  #Objective:The purpose of the test case is to verify the Social Media Link/Logo Instagram (Post-Login)
  #Author: Harsha Kumar
  #Date: 09/11/2021
  @FooterSectionSuite1 @instagram
  Scenario Outline: GCVA_SocialMediaRibbonFooter_01_TC001
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then user scrolls down and clicks Instagram link

    #And verify instagram page
    Examples: 
      | UN                        | pwd      |
      |bhavitha.nune@bat.com| TEST1234 |

  #------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_03_TC001
  #Description: To verify Social Media Ribbon: Facebook (Pre-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite @facebookpre
  Scenario: GCVA_SocialMediaRibbonFooter_03_TC001
    Given User is on pre-login page in mobile
    Then scroll down in mobile and verify Facebook link

  #--------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_04_TC001
  #Description: To verify Social Media Ribbon: Facebook (Post-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite4 @facebook
  Scenario Outline: GCVA_SocialMediaRibbonFooter_04_TC001
    Given User is on pre-login page in mobile
    When user clicks on hamberger menu and click on login or register
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then scroll down in mobile and verify Facebook link

    Examples: 
      | UN                     | pwd      |
      | tate.wilkinson@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_05_TC001
  #Description: To verify Social Media Ribbon: Youtube (Pre-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite @youtubepre
  Scenario: GCVA_SocialMediaRibbonFooter_05_TC001
    Given User is on pre-login page in mobile
    Then scroll down in mobile and verify Youtube link

  #-----------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_06_TC001
  #Description: To verify Social Media Ribbon: Youtube (Post-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite6 @youtube
  Scenario Outline: GCVA_SocialMediaRibbonFooter_06_TC001
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then scroll down in mobile and verify Youtube link

    Examples: 
      | UN                     | pwd      |
      | tate.wilkinson@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_07_TC001
  #Description: To verify Social Media Ribbon: Twitter (Pre-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite @twitterpre
  Scenario: GCVA_SocialMediaRibbonFooter_07_TC001
    Given User is on pre-login page in mobile
    Then scroll down in mobile and verify Twitter link

  #-----------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_08_TC001
  #Description: To verify Social Media Ribbon: Twitter (Post-Login)
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite8 @twitter
  Scenario Outline: GCVA_SocialMediaRibbonFooter_08_TC001
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then scroll down in mobile and verify Twitter link

    Examples: 
      | UN                     | pwd      |
      | tate.wilkinson@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_09_TC001
  #Description: To verify the user under 18 is not able to access the Social media links present in the footer
  #Author: sasikala
  #Date: 10/08/2022
  @FooterSectionSuite09
  Scenario: GCVA_SocialMediaRibbonFooter_09_TC001
    Given user navigates to application in mobile
    When user click on i am not eighteen plus button
    Then verify user is not able to access social media links
