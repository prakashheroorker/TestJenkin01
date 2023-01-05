Feature: To Verify product catalogue functionality

  Background: 
    Given User is on pre-login page

  #Test Case - Vype-3922_Prods_Catalogue_Category
  #Description - The Purpose of this test case is to verify the functionality of category titles with Anchors on Epod pods page.
  #Developed By - Harsha Kumar
  #Date - 23rd Auguest,2022
  #Modified by - Sai Sireesha
  #Date - December 15,2022
  #Modified steps -20,23,26,29,32,35,38,41
  @Catalogue01
  Scenario Outline: Vype-3922_Prods_Catalogue_Category
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify user navigates to ePod vape page and with all categories is displayed
    And User clicks on Limited edition tile
    Then Verify all limited edition flavors
    And Click on left and right corousels for limited edition and verify tiles moved accordingly
    When User clicks on Mint tile
    Then Verify all mint flavors
    And Click on left and right corousels for mint and verify tiles moved accordingly
    When User clicks on Tobacco tile
    Then Verify all Tobacco flavors
    And Click on left and right corousels for Tobacoo and verify tiles moved accordingly
    When User clicks on fruit tile
    Then Verify all fruit flavors
    And Click on left and right corousels for fruit and verify tiles moved accordingly
    When User clicks on berry tile
    Then Verify all berry flavors
    And Click on left and right corousels for berry and verify tiles moved accordingly
    When User clicks on clear and Vanilla tile
    Then User Verify all clear and vanilla flavors
    And Click on left and right corousels for clear and verify tiles moved accordingly
    When User clicks on Nicotine free tile
    Then User Verify all Nicotine free flavors
    And Click on left and right corousels for Nictoine free and verify tiles moved accordingly
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      |
      | louisa.spencer@bat.com | TEST1234 |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VYPE - 3902_Pods_Catalog_Search&Filter_Functionality_Together
  #Description - The Purpose of this test case is to Verify Filter&Sort + Search functonality  on the ePod catalog page..
  #Developed By - Harsha Kumar
  #Date - 6th sept,2022
  #Modified by - Sai Sireesha
  #Date - December 14,2022
  #Modified steps -64 to 78
  @Catalogue02
  Scenario Outline: VYPE - 3902_Pods_Catalog_Search&Filter_Functionality_Together
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify user navigates to ePod vape page and with all categories is displayed
    When User click on Filter and Sort option
    Then Verify Filter and sort menu is opened with relevant text
    When User clicks on any option from sort by
    Then Verify the hyperlinks is available
    When User clicks on clear hyperlink at the bottom
    Then Verify the filter is cleared
    And Select A to Z and verify flavors are in Assending order from A to Z
    When User click on Filter and Sort option
    And User clicks on any option from Nicotine strength
    Then Verify the hyperlinks is available
    When User clicks on clear hyperlink at the bottom
    Then Verify the filter is cleared
    And User select any NS and verify flavors displayed
    And click on Filter and sort and select Z to A and select nictoine strength
    Then verify flavors are in Decending order from Z to A are with corresponding nictoine strength
    And click on search and verify search is enabled
    When User enters required flavor "<flavor>" and verify flavor is displayed after clicking on search
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username               | password | flavor  | flavor1      |
      | louisa.spencer@bat.com | TEST1234 | Vanilla | butterscotch |
