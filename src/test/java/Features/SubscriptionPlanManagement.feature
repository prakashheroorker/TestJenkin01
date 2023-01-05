Feature: GVCA_SubscriptionsPlanManagement_01_TC001

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_SubscriptionsPlanManagement_01_TC001
  #Description - The purpose of this test case is to Verify the Subscription page components in My account section in the subscription tab of the users.
  #Developed By - Harika
  #Date - November 18,2021
  @GVCA_SubscriptionsPlanManagement_01_TC001
  Scenario Outline: GVCA_SubscriptionsPlanManagement_01_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When User navigates to my account from home page
    When User clicks on My Subscription and verifies details
    Then user Verifies UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And user Verifies the links for Pause or stop Subscription is displayed
    Then user Clicks on cancel link

    Examples: 
      | UN                      | pwd      | UserCardNumber     | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER |
