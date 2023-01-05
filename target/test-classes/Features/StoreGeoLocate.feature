@FooterSectionSuite
Feature: Store Geo Locate

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_StoreGeoLocate_01_TC001
  #Description - The purpose of this test case is to verify the Store Location
  #Developed By - Harika
  #Date - September 21,2021
  @storegeolocate_1
  Scenario Outline: GVCA_StoreGeoLocate_01_TC001
    When User enters email "<UN>" and password "<pwd>"
    And clicking on Store Locator
    Then Google API page should be displayed in the same tab

    Examples: 
      | UN                     | pwd      |
      | louisa.spencer@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_StoreGeoLocate_02_TC001
  #Description - The purpose of this Test Case is to verify when user enters address in store locater page then store names must be displayed
  #Developed By - Harika
  #Date - September 21,2021
  #@storegeolocate_2
  #Scenario Outline: GVCA_StoreGeoLocate_02_TC001
    #When User enters email "<UN>" and password "<pwd>"
    #And clicking on Store Locator
    #Then Google API page should be displayed in the same tab
    #And User clicks on search bar and types location "<address>"
#
    #Examples: 
      #| UN                      | pwd      | address                                         |
      #| louisa.spencer@bat.com  | TEST1234 | 4901 Yonge Street, Old Toronto, Ontario, Canada |
#
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case -GVCA_StoreGeoLocate_03_TC001
  #Description - The purpose of this Test Case is to verify when user enters zipcode in serach bar of store locator page then store names should be displayed
  #Developed By - Harika
  #Date - September 29,2021
  #@storegeolocate_3
  #Scenario Outline: GVCA_StoreGeoLocate_03_TC001
    #When User enters email "<UN>" and password "<pwd>"
    #And clicking on Store Locator
    #Then Google API page should be displayed in the same tab
    #And user clicks on search bar and types zipcode "<zipcode>"
#
    #Examples: 
      #| UN                     | pwd      | zipcode |
      #| louisa.spencer@bat.com | TEST1234 | M2N     |
#
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_StoreGeoLocate_04_TC001
  #Description - The purpose of this Test Case is to verify FAQs is displayed and also store locater page should be displayed
  #Developed By - Harika
  #Date - September 30,2021
  #@storegeolocate_4
  #Scenario Outline: GVCA_StoreGeoLocate_04_TC001
    #When User enters email "<UN>" and password "<pwd>"
    #Then Verify FAQs is displayed
    #When clicking on Store Locator
    #Then Google API page should be displayed in the same tab
#
    #Examples: 
      #| UN                     | pwd      |
      #| louisa.spencer@bat.com | TEST1234 |
#
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_StoreGeoLocate_06_TC001
  #Description - The purpose of this Test Case is to verify FAQs is displayed and also in store locater page when given location live object, call popuo and directions should be displayed
  #Developed By - Harika
  #Date - September 30,2021
  #@storegeolocate_6
  #Scenario Outline: GVCA_StoreGeoLocate_06_TC001
    #When User enters email "<UN>" and password "<pwd>"
    #Then Verify FAQs is displayed
    #When clicking on Store Locator
    #Then Google API page should be displayed in the same tab
    #When User types location and verifies whether live objects is displayed"<location>"
    #And User verifies whether call popup and directions are displayed"<addressInMap>"
#
    #Examples: 
      #| UN                     | pwd      | location                   | addressInMap                                  |
      #| louisa.spencer@bat.com | TEST1234 | East York, Ontario, Canada | 667 Sammon Ave, East York, ON M4C 2E2, Canada |
#
  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_StoreGeoLocate_07_TC001
  #Description - The purpose of this Test Case is to verify when user enters location in serach bar of store locator page then store names should be displayed
  #Developed By - Harika
  #Date - September 30,2021
  #@storegeolocate_7
  #Scenario Outline: GVCA_StoreGeoLocate_07_TC001
    #When User enters email "<UN>" and password "<pwd>"
    #And clicking on Store Locator
    #Then Google API page should be displayed in the same tab
    #And User types location and verifies whether live objects is displayed"<location>"
#
    #Examples: 
      #| UN                      | pwd      | location                   |
      #| louisa.spencer@bat.com  | TEST1234 | East York, Ontario, Canada |
