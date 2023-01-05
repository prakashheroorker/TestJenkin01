@newfunctionalitysuite
Feature: Health Warning Message in Application

  Background: 
    Given User is on pre-login page

  #Test Case - HW_message_in_all_Post_Login_Pages
  #Description: To validate that HW message is displayed in all Post Login Pages
  #Author: Divya Kumari
  #Date - September 6,2021
  @GoldenRegressionSuite
  Scenario Outline: HW_message_in_all_Post_Login_Pages
    When user login with valid email address "<UN>" and password "<pwd>"
    And user navigates to ePod pods page and verify the health warning message
    Then user navigates to ePod Device page and verify the health warning message
    And user navigates to ePod Accessories page and verify the health warning message
    And user navigates to Experience vuseXu page and verify the health warning message
    And user navigates to shop ePod skins page and verify the health warning message
    And user navigates to Engrave Your ePod page and verify the health warning message
    #Then user navigates to New launches Skins Page and verify the health warning message
    #And user navigates to New launches Pod Caps and verify the health warning message
    #Then user navigates to New launches ePod two and verify the health warning message
    #And user navigates to New launches Engraving and verify the health warning message
    And user navigates to Offers Starter Bundle and verify the health warning message
    And user navigates to Offers "2" for "22" ePod Pods and verify the health warning message
    And user navigates to Save Offers "5" for "54" ePod Pods and verify the health warning message
    And user navigates to Programs Subscribe & Save and verify the health warning message
    And user navigates to Programs Pass On The Savings and verify the health warning message
    And user navigates to Programs Vuse plus Rewards and verify the health warning message
    And user navigates to Help Shipping & Delivery link and verify the health warning message
    And user navigates to Help Store Locator link and verify the health warning message
    And user navigates to About Vuse News link and verify the health warning message
    And user navigates to About Online Exclusive Benefits and verify the health warning message

    # And user navigates to About The Vuse Store link and verify the health warning message
    Examples: 
      | UN                 | pwd      |
      | tracycrewe@bat.com | TEST1234 |

  # -------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - HW_message_in_all_Pre_Login_Pages
  #Description: To validate that HW message is displayed in all Pre Login Pages
  #Author: Divya Kumari
  #Date: September 7, 2021
  @hwprelogin
  Scenario: HW_message_in_all_Pre_Login_Pages
    Then user navigates to ePod Device page and verify the health warning message
    And user navigates to ePod pods page and verify the health warning message
    And user navigates to ePod Accessories page and verify the health warning message
    And user navigates to Experience vuseXu page and verify the health warning message
    # And user navigates to shop ePod skins page and verify the health warning message
    And user navigates to Engrave Your ePod page and verify the health warning message
    #Then user navigates to New launches Skins Page and verify the health warning message
    # And user navigates to New launches Pod Caps and verify the health warning message
    #Then user navigates to New launches ePod two and verify the health warning message
    # And user navigates to New launches Engraving and verify the health warning message
    #And user navigates to Offers Starter Bundle and verify the health warning message
    And user navigates to Offers "2" for "22" ePod Pods and verify the health warning message
    And user navigates to Save Offers "5" for "54" ePod Pods and verify the health warning message
    And user navigates to Programs Subscribe & Save and verify the health warning message
    And user navigates to Programs Pass On The Savings and verify the health warning message
    And user navigates to Programs Vuse plus Rewards and verify the health warning message
    And user navigates to Help Shipping & Delivery link and verify the health warning message
    And user navigates to Help Store Locator link and verify the health warning message
    And user navigates to About Vuse News link and verify the health warning message
    And user navigates to About Online Exclusive Benefits and verify the health warning message

  # And user navigates to About The Vuse Store link and verify the health warning message
  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - HWmessageinallPreLoginFooterLinks
  #Description: The purpose of this test case is to Validate that HW message is displayed in all Pre Login Footer Link pages
  #Author: Divya Kumari
  #Date: September 13,2021
  @tag2
  Scenario: HWmessageinallPreLoginFooterLinks
    Then user scroll down and verify health warning message in Store Locator page
    And user scroll down and verify health warning message in Condition of sale page
    And user scroll down and verify health warning message in Privacy Policy page
    And user scroll down and verify health warning message in Terms and conditions page
    And user scroll down and verify health warning message in Cookie Policy page
    And user scroll down and verify health warning message in Contact Us page
