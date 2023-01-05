Feature: AllepodDevice

  Background: 
    Given User is on pre-login page

  #Description - The purpose of This Test is to validate the ePod2 FAQs content in All Epod device page (Post-login)
  #Test Case - AllePodDevice_FAQ's_Validation
  #Modified By- Sai Sireesha
  #Date - December 14,2022
  @AllePodDevice_FAQ's_Validation
  Scenario Outline: AllePodDevice_FAQ_Validation
   When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and click on AllePodDevice
    Then Verify AllePodDevice page is displayed
    When User scrolls down to faq and verify the no of faqs
    And User click on each question and verify the answer displayed
    And Click on SEE ALL FAQS
    Then Verify the bat support page and with some sections are displayed
    When User click on browse back and verify the all epod device page displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                           | pwd      |
      | christine.mulholland@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------------------------------
  #Description - This purpose of this Test case is to validate the All ePod devices landing page
  #Test Case -All_ePodDevice_ProductCatalogue_Validation
  #Modified By- Sai Sireesha
  #Date - December 14,2022
  @All_ePodDevice_ProductCatalogue_Validation
  Scenario: All_ePodDevice_ProductCatalogue_Validation
    When User hover on shop and click on AllePodDevice
    Then Verify AllePodDevice page is displayed
    When User click on Learn more link
    Then Verify New Era page is displayed
    When User click on browse back and verify the all epod device page displayed
    And Click on ePod2 tab and verify ePod2 device tiles are displayed
    And Click on ePod2Plus tab and verify ePod2+ device tiles are displayed
    Then Verify the AllePodDevice page and with content is displayed
    When User scrolls down and click on ONE FOR ALL under featured Accessories
    Then Verify Travel case PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and click on JUST IN CASE under featured Accessories
    Then Verify Device case PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and click on redmeans go under featured Accessories
    Then Verify charging cable PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and click on power on and keep charging under featured Accessories
    Then Verify charging case PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and Click on PUT A RING ON IT Under  Vuse personalisation
    Then Verify ePodrings  PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and Click on Engravings Under  Vuse personalisation
    Then Verify Engravings  PDP page is displayed
    And User click on browse back and verify the all epod device page displayed
    When User scrolls down and Click on SkinCollection Under  Vuse personalisation
    Then Verify skin PDP page is displayed
    And User click on browse back and verify the all epod device page displayed

