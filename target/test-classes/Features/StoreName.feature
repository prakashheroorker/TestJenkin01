Feature: Store Name

  Background: 
    Given User is on pre-login page

  #Description - Verify Google API is used to search the Store name(Pre-Login)
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Test Case - GVCA_StoreName_01_TC001
  @StoreName1 @FooterSectionSuite
  Scenario: GVCA_StoreName_01_TC001
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab

  #----------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Description - Verify Google API is used to search the Store name(Post Login)
  #Test Case - GVCA_StoreName_01_TC002
  @StoreName2 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_01_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab

    Examples: 
      | UN                      | pwd      |
      | louisa.spencer@bat.com  | TEST1234 |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Description - Verify Store can be serached by Name or Location(Pre Login)
  #Test Case - GVCA_StoreName_02_TC001
  @StoreName3 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_02_TC001
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab
    And Search the store by selecting the Name from the drop down list
    When Enter the Store Name in edit field "<StoreName>"
    Then Verify the Store Name results "<StoreName>"
    When Search the store by select and Clear already existing search results
    Then Enter address to search in Location field "<Location>"

    Examples: 
      | StoreName | Location |
      | BISHOP    | Quebec   |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - September 30,2021
  #Description - Verify Store can be serached by Name or Location(Post Login)
  #Test Case - GVCA_StoreName_02_TC002
  @StoreName4
  Scenario Outline: GVCA_StoreName_02_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab
    And Search the store by selecting the Name from the drop down list
    When Enter the Store Name in edit field "<StoreName>"
    Then Verify the Store Name results "<StoreName>"
    When Search the store by select and Clear already existing search results
    Then Enter address to search in Location field "<Location>"

    Examples: 
      | UN                  | pwd      | StoreName | Location |
      | louisa.spencer@bat.com  | TEST1234 | BISHOP    | Quebec   |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - October 1,2021
  #Description - Verify All links and Live objects are functional: directions, mobile call, and object indicators(Post Login)
  #Test Case - GVCA_StoreName_03_TC001
  @StoreName5 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_03_TC001
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab
    And Search the store by selecting the Name from the drop down list
    When Enter the Store Name in edit field "<StoreName>"
    Then Verify the Store Name results "<StoreName>"
    And Search the store by select and Clear already existing search results
    Then Enter address to search and Verify address is Visible "<Location>"
    And Verify live objects: directions, mobile call

    Examples: 
      | StoreName | Location                     |
      | BISHOP    | Old Toronto, Ontario, Canada |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - October 1,2021
  #Description - Verify All links and Live objects are functional: directions, mobile call, and object indicators(Post Login)
  #Test Case - GVCA_StoreName_03_TC002
  @StoreName6 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_03_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab
    And Search the store by selecting the Name from the drop down list
    When Enter the Store Name in edit field "<StoreName>"
    Then Verify the Store Name results "<StoreName>"
    And Search the store by select and Clear already existing search results
    Then Enter address to search and Verify address is Visible "<Location>"
    And Verify live objects: directions, mobile call

    Examples: 
      | UN                      | pwd      | StoreName | Location                     |
      | louisa.spencer@bat.com  | TEST1234 | BISHOP    | Old Toronto, Ontario, Canada |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - October 1,2021
  #Description - Verify All links and 'live' objects are functional: directions, mobile call, and object indicators(Pre-Login)
  #Test Case - GVCA_StoreName_06_TC001
  @StoreName7 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_06_TC001
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed and Store all window handles
    When Enter address to search in Location field "<Location>"
    Then Verify live objects: directions, mobile call

    Examples: 
      | Location                     |
      | Old Toronto, Ontario, Canada |

  #---------------------------------------------------------------------------------
  #Developed By - Bhavitha
  #Date - October 1,2021
  #Description - Verify All links and Live objects are functional: directions, mobile call, and object indicators(Post Login)
  #Test Case - GVCA_StoreName_06_TC002
  @StoreName8 @FooterSectionSuite
  Scenario Outline: GVCA_StoreName_06_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click on the Store Locator that is present in the Home Page
    Then Verify the Google API page is displayed in the same tab
    When Enter address to search in Location field "<Location>"
    Then Verify live objects: directions, mobile call

    Examples: 
      | UN                     | pwd      | Location                     |
      | louisa.spencer@bat.com | TEST1234 | Old Toronto, Ontario, Canada |
