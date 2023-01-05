@store
Feature: Verifying Store Locator Options

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case: GVCA_StoreName_02_TC002
  #Objective:Store can be searched by Name or location (Post Login)
  #Author: Harsha Kumar
  #Date: 25/11/2021
  @storename
  Scenario Outline: GVCA_StoreName_02_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And user scrolls to store locator footer link and store locator
    Then Verify Store Locator page and verify Name and location fields
    Then Enter Location "<location>" and verify all results
    And Verify store name "<storename>"
    Then click on name and enter store name "<name>" and verify "<storename>"

    Examples: 
      | UN                        | pwd      | location                 | storename  | name       |
      | jonathan.thebault@bat.com | TEST1234 | Toranto  Ontario, Canada | ELM BASKET | ELM BASKET |

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
