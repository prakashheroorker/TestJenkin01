Feature: Store Geo Locate

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register
    

  #Test Case - StoreGeoLocate_01_TC001
  #Description - The purpose of this test case is to verify the Store Location in the mobile
  #Developed By - Harris 
  #Date - March 31,2022
  @StoreGeoLocate_1
  Scenario Outline: StoreGeoLocate_01_TC001
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When Click on the Store Locator
    Then Google API page should be displayed in the same page

    Examples: 
      | UN                     | pwd      |
      | louisa.spencer@bat.com | TEST1234 |

#----------------------------------------------------------------------------------------------------------------

	#Test Case - GVCA_StoreGeoLocate_02_TC001
  #Description - The purpose of this Test Case is to verify when user enters address in store locater page then store names must be displayed in mobile
  #Developed By - Harris
  #Date - Apr 1,2022
  @StoreGeoLocate_2
  Scenario Outline: StoreGeoLocate_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And Click on the Store Locator
    Then Google API page should be displayed in the same page
    And user clicks on search bar and types location "<address>"
    
    Examples: 
    | UN                     | pwd      | address                                         |
    | louisa.spencer@bat.com | TEST1234 | 4901 Yonge Street, Old Toronto, Ontario, Canada |
#---------------------------------------------------------------------------------------------------
  @Geolocate
  Scenario Outline: GVCA_StoreGeoLocate_06_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And user scrolls to store locator footer link and store locator
    Then Verify Store Locator page and verify Name and location fields
    Then Enter Location "<location>" and verify all results
    And Verify Live objects present on storemap page
    Then switch to list view and click on phone icon
    Then swich to list view and click on directions icon
    And verify direction details and navigate back to store locator page

    Examples: 
      | UN                        | pwd      | location                 |
      | jonathan.thebault@bat.com | TEST1234 | Toranto  Ontario, Canada |