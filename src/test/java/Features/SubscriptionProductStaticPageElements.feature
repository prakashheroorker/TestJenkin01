Feature: SubscriptionProductStaticPageElements

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_SubscriptionProductStaticPageElements_01_TC001
  #Description - The purpose of this test case is to Verify the Subscription information and details available at ePod pages.
  #Developed By - Harika
  #Date - November 9,2021
  @SubscriptionProduct
  Scenario Outline: GVCA_SubscriptionProductStaticPageElements_01_TC001
    When User enters email "<UN>" and password "<pwd>"
    And User navigates to ePod pods page
    Then Verify subscribe and save option is available

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |
