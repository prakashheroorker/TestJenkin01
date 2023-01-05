Feature: AllePodDevice

  Background: 
    Given User is on pre-login page in mobile

  #Description - The purpose of This Test is to validate the ePod2 FAQs content in All Epod device page (Post-login)
  #Test Case - AllePodDevice_FAQ's_Validation_Mobile
  #Modified By- Sai Sireesha
  #Date - December 15,2022
  @AllePodDevice_FAQs_Validation
  Scenario Outline: AllePodDevice_FAQs_Validation_Mobile
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify AllePoddevice page is displayed
    Then User swipe down to faq and verify the no of faqs
    When User click on Each question and verify the answer displayed
    And Click on SEE ALL Faqs
    Then Verify the Bat support page and with some sections are displayed
    And User click on browse back and verify the all ePod device page displayed
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                           | pwd      |
      | christine.mulholland@bat.com | TEST1234 |

  #--------------------------------------------------------------------------------------------------------
  #Description - This purpose of this Test case is to validate the All ePod devices landing page
  #Test Case -All_ePodDevice_ProductCatalogue_Validation_Mobile
  #Modified By- Sai Sireesha
  #Date - December 14,2022
  @All_ePodDevice_ProductCatalogue_Validation_Mobile
  Scenario: All_ePodDevice_ProductCatalogue_Validation_Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify AllePoddevice page is displayed
    When User click on Learn More link
    Then Verify New Era Page is displayed
    When User click on browse back and verify the all ePod device page displayed
    And Click on ePod2 Tab and verify ePod2 device tiles are displayed
    And Click on ePod2Plus Tab and verify ePod2+ device tiles are displayed
    Then Verify the AllePoddevice page and with content is displayed
    When User Swipe down and click on ONE FOR ALL under featured Accessories
    Then Verify Travel Case PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User swipe down and click on JUST IN CASE under featured Accessories
    Then Verify Device Case PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User Swipe down and click on redmeans go under featured Accessories
    Then Verify charging Cable PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User swipe down and click on power on and keep charging under featured Accessories
    Then Verify charging Case PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User swipe down and Click on PUT A RING ON IT Under  Vuse personalisation
    Then Verify ePodRings  PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User swipe down and Click on Engravings Under  Vuse personalisation
    Then Verify Engraving  PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
    When User swipe down and Click on SkinCollection Under  Vuse personalisation
    Then Verify Skin PDP page is displayed
    And User click on browse back and verify the all ePod device page displayed
