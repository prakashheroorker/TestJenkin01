Feature: Store Name

  Background: 
    Given User is on pre-login page in mobile
    
  #Description - Verify Google API is used to search the Store name(Pre-Login)
  #Developed By - Harris
  #Date - March 30,2022
  #Test Case - GVCA_StoreName_01_TC001
  @Storename1 
  Scenario: StoreName_01_TC001
    When Click on the Store Locator present in the Home Page
    Then Verify the Google API page is displayed in the same page

  #----------------------------------------------------------------------------
  
  #Description - Verify Google API is used to search the Store name(Post Login)
  #Developed By - Harris
  #Date - March 30,2022
  #Test Case - GVCA_StoreName_01_TC002
  @Storename2 
  Scenario Outline: StoreName_01_TC002
  	And user clicks on hamberger menu and click on login or register 	
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When Click on the Store Locator present in the Home Page
    Then Verify the Google API page is displayed in the same page

    
     Examples:
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |
  #-------------------------------------------------------------------------------------
  #Test Case: GVCA_StoreName_02_TC002
  #Objective:Store can be searched by Name or location (Post Login)
  #Author: Harsha Kumar
  #Date: 25/11/2021
  @storename
  Scenario Outline: GVCA_StoreName_02_TC002
  	And user clicks on hamberger menu and click on login or register 	
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And user scrolls to store locator footer link and store locator
    Then Verify Store Locator page and verify Name and location fields
    Then Enter Location "<location>" and verify all results
    And Verify store name "<storename>"
    Then click on name and enter store name "<name>" and verify "<storename>"

    Examples: 
      | UN                        | pwd      | location                 | storename  | name       |
      | jonathan.thebault@bat.com | TEST1234 | Toranto  Ontario, Canada | ELM BASKET | ELM BASKET |
  