@QAbatch01
Feature: Social Media Ribbon

  #Test Case: GCVA_SocialMediaRibbonFooter_01_TC001
  #Description: To verify Social Media Ribbon: Instagram (Post-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario Outline: GCVA_SocialMediaRibbonFooter_01_TC001
    Given User is on pre-login page
    When user login with valid email address "<UN>" and password "<pwd>"
    Then scroll down and verify Instagram link

    Examples: 
      | UN                        | pwd      |
      | jonathan.thebault@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_02_TC001
  #Description: To verify Social Media Ribbon: Instagram (Pre-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @GoldenRegressionSuite
  Scenario: GCVA_SocialMediaRibbonFooter_02_TC001
    Given User is on pre-login page
    Then scroll down and verify Instagram link

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_04_TC001
  #Description: To verify Social Media Ribbon: Facebook (Post-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario Outline: GCVA_SocialMediaRibbonFooter_04_TC001
    Given User is on pre-login page
    When user login with valid email address "<UN>" and password "<pwd>"
    Then scroll down and verify Facebook link

    Examples: 
      | UN                        | pwd      |
      | jonathan.thebault@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_03_TC001
  #Description: To verify Social Media Ribbon: Facebook (Pre-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario: GCVA_SocialMediaRibbonFooter_03_TC001
    Given User is on pre-login page
    Then scroll down and verify Facebook link

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_06_TC001
  #Description: To verify Social Media Ribbon: Youtube (Post-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario Outline: GCVA_SocialMediaRibbonFooter_06_TC001
    Given User is on pre-login page
    When user login with valid email address "<UN>" and password "<pwd>"
    Then scroll down and verify Youtube link

    Examples: 
      | UN                        | pwd      |
      | jonathan.thebault@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_05_TC001
  #Description: To verify Social Media Ribbon: Youtube (Pre-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario: GCVA_SocialMediaRibbonFooter_05_TC001
    Given User is on pre-login page
    Then scroll down and verify Youtube link

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_08_TC001
  #Description: To verify Social Media Ribbon: Twitter (Post-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario Outline: GCVA_SocialMediaRibbonFooter_08_TC001
    Given User is on pre-login page
    When user login with valid email address "<UN>" and password "<pwd>"
    Then scroll down and verify Twitter link

    Examples: 
      | UN                        | pwd      |
      | jonathan.thebault@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_07_TC001
  #Description: To verify Social Media Ribbon: Twitter (Pre-Login)
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite
  Scenario: GCVA_SocialMediaRibbonFooter_07_TC001
    Given User is on pre-login page
    Then scroll down and verify Twitter link

  #----------------------------------------------------------------------------------------------------------------------------------------
  #Test Case: GCVA_SocialMediaRibbonFooter_09_TC001
  #Description: To verify the user under 18 is not able to access the Social media links present in the footer
  #Author: Divya
  #Date: 2-sep-2021
  @FooterSectionSuite09
  Scenario: GCVA_SocialMediaRibbonFooter_09_TC001
    Given user navigates to application
    When user clicks on i am not eighteen plus button
    Then user is not able to access social media links
