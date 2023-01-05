@Prods_Catalogue
Feature: To Verify product catalogue functionality

  Background: 
    Given User is on pre-login page in mobile
   When User clicks on hamburger menu and Verify Login/Register link

  #Test Case - Vype-3922_Prods_Catalogue_Category_Mobile
  #Description - The Purpose of this test case is to verify the functionality of category titles with Anchors on Epod pods page in prelogin.
  #Developed By - Harsha Kumar
  #Date - 24th Auguest,2022
  #@Catalogue01
  #Scenario: Vype-3922_Prods_Catalogue_Category_PreLogin_Mobile
  #When User clicks on hamberger menu and clicks on Shop
  #And user clicks on Device, Pods and Accessories and clicks on pods
  #And User clicks on Limited edition tile then verifies all limited edition flavors in pods page
  #When User clicks on Mint tile in pods page then verifies all mint flavors in pods page
  #And User clicks on Tobacco tile in pods page then verifies all Tobacco flavors in pods page
  #When User clicks on fruit tile in pods page then verifies all fruit flavors in pods page
  #And User clicks on berry tile in pods page then verifies all berry flavors in pods page
  #When User clicks on clear and Vanilla tile then User verifies all clear and vanilla flavors in pods page
  #And User clicks on Nicotine free tile then User verifies on Nicotine free flavors in pods page
  #------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - Vype-3922_Prods_Catalogue_Category_Mobile
  #Description - The Purpose of this test case is to verify the functionality of category titles with Anchors on Epod pods Screen
  #Developed By - Harsha Kumar
  #Date - 25th Auguest,2022
  #Modified By - Sai Sireesha
  #Date - December 15,2022
  #Modified steps-38
  @Catalogue02
  Scenario Outline: Vype-3922_Prods_Catalogue_Category_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    When User clicks on hamberger menu and clicks on Shop
    And User clicks on Device, Pods and Accessories and clicks on pods
    Then Verify user navigates to ePod Vape page and with all categories is displayed
    When User clicks on Limited edition tile 
    Then verifies all limited edition flavors in pods page
    When User clicks on Mint tile in pods page 
    Then verifies all mint flavors in pods page
    When User clicks on Tobacco tile in pods page 
    Then verifies all Tobacco flavors in pods page
    When User clicks on fruit tile in pods page 
    Then verifies all fruit flavors in pods page
    When User clicks on berry tile in pods page
    Then verifies all berry flavors in pods page
    When User clicks on Clear and Vanilla tile 
    Then User verifies all clear and vanilla flavors in pods page
    When User clicks on Nicotine Free tile 
    Then User verifies on Nicotine free flavors in pods page
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                 | pwd      |
      | akhila.cha@bat.com | TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE - 3902_Pods_Catalog_Search&Filter_Functionality_Together_Mobile
  #Description - The Purpose of this test case is to Verify Filter&Sort + Search functonality  on the ePod catalog page..
  #Developed By - Harsha Kumar
  #Date - 7th sept,2022
  #modified By - sai sireesha
  #modified date - December 20,2022
  #modified steps -68 to 82
  @Catalogue03
  Scenario Outline: VYPE - 3902_Pods_Catalog_Search&Filter_Functionality_Together_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on Device, Pods and Accessories and clicks on pods
    And User click on Filter and Sort Option
    Then Verify Filter and Sort menu is opened with relevant test
    When User clicks on any option from Sort by
    Then Verify the Hyperlinks is available beside the sort
    When User clicks on Clear hyperlink beside the sort
    Then Verify the Filter is cleared
    And Select A to Z and verify Flavors are in Assending order from A to Z
    When User click on Filter and Sort Option
    And User clicks on any option from Nicotine Strength
    Then Verify the Hyperlinks is available beside the Nictoine strength
    When User clicks on Clear hyperlink beside the nictoine strength
    Then Verify the Filter is cleared
    When User select any NS and verify Flavors displayed
    And click on Filter and Sort and select Z to A and select nictoine strength
    Then verify flavors are in Decending Order from Z to A are with corresponding nictoine strength
    When User clicks on search and verify search is enabled
    And User enters required flavor "<flavor>" and verify flavor is displayed after clicking on search link
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                     | pwd      | flavor | 
      | louisa.spencer@bat.com | TEST1234 | Clear  | 
