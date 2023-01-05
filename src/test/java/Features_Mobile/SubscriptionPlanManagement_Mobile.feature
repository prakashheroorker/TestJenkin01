Feature: GVCA_SubscriptionsPlanManagement_01_TC001_Mobile

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case - GVCA_SubscriptionsPlanManagement_01_TC001_Mobile
  #Description - The purpose of this test case is to Verify the Subscription page components in My account section in the subscription tab of the users.
  #Developed By - Honey Hari
  #Date - August 9,2022
  #Pre-condition - User should already have subscription.
  @GVCA_SubscriptionsPlanManagement_01_TC001_Mobile
  Scenario Outline: GVCA_SubscriptionsPlanManagement_01_TC001_Mobile
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    And click on hamberger menu and click on My Subscription
    And verify subscription page in user account section
    Then user Verify UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And user Verify the links for Pause or stop Subscription is displayed
   # Then user clicks on cancel link

    Examples: 
      | UN                | pwd      | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | bhavitha.nune@bat.com | TEST1234 | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER |
