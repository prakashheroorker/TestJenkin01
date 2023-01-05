Feature: Health Warning Message in Application

  Background: 
    Given User is on pre-login page in mobile

  #Test Case - HW_message_in_all_Post_Login_Pages
  #Description: To validate that HW message is displayed in all Post Login Pages
  #Author: Bhavitha
  #Date - 19/01/2022
  @HW_message_in_all_Post_Login_Pages
  Scenario Outline: HW_message_in_all_Post_Login_Pages
    Given user clicks on hamberger menu and click on login or register
    And User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on epodtwo device
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Experience vuseXu
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Shop ePod Skins
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Engrave Your ePod
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Starter Bundle
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on "2" for $"22" ePod Pods
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on "5" for $"54" ePod Pods
    Then Verify the health warning message
    #When User clicks on hamberger menu and clicks on Save
    When User clicks on hamberger menu
    And user clicks on Subscribe & Save
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Pass On The Savings
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Vuse+ Rewards
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Know your Vape
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Vuse News
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Online Exclusive Benefits
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Help
    And user clicks on Shipping & Delivery
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Help
    #And user clicks on Store Locator
    #Then Verify the health warning message

    Examples: 
      | UN                    | pwd      |
      | suzanne.serby@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------------------------------
  #Test Case - HW_message_in_all_Pre_Login_Pages
  #Description: To validate that HW message is displayed in all Pre Login Pages
  #Author: Bhavitha
  #Date - 20/01/2022
  @HW_message_in_all_Pre_Login_Pages
  Scenario: HW_message_in_all_Pre_Login_Pages
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on epodtwo device
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on Accessories
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Experience vuseXu
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Shop ePod Skins
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Engrave Your ePod
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Starter Bundle
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on "2" for $"22" ePod Pods
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on "5" for $"54" ePod Pods
    Then Verify the health warning message
    #When User clicks on hamberger menu and clicks on Save
    When User clicks on hamberger menu
    And user clicks on Subscribe & Save
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Pass On The Savings
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Save
    And user clicks on Vuse+ Rewards
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Know your Vape
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Vuse News
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on About
    And user clicks on Online Exclusive Benefits
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Help
    And user clicks on Shipping & Delivery
    Then Verify the health warning message
    When User clicks on hamberger menu and clicks on Help
    #And user clicks on store Locator
    #Then Verify the health warning message

  # -------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - HWmessageinallPreLoginFooterLinks
  #Description: The purpose of this test case is to Validate that HW message is displayed in all Pre Login Footer Link pages
  #Author: Bhavitha
  #Date: 20/01/2022
  @HWmessageinallPreLoginFooterLinks
  Scenario: HWmessageinallPreLoginFooterLinks
    When user scroll down and click on Store Locator
    Then Verify the health warning message
    When Go to Home page and scroll down
    And click on Condition of sale
    Then Verify the health warning message
    When Go to Home page and scroll down
    And click on Privacy Policy page
    Then Verify the health warning message
    When Go to Home page and scroll down
    And click on Terms and conditions
    Then Verify the health warning message
    When Go to Home page and scroll down
    And click on Cookie Policy page
    Then Verify the health warning message
    When Go to Home page and scroll down
    And click on Contact Us page
    Then Verify the health warning message
    When Go to Home page and scroll down
    #And click on FAQ page
    #Then Verify the health warning message
