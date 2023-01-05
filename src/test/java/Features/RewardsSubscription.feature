Feature: Verifying new Subscription points in Rewards Page

  Background: 
    Given User is on pre-login page

  #Test Case   - VYPE_4043_Pod Subscription_TC001
  #Description - Objective: The purpose of this test case is to verify bonus points are added in the Rewards tab for New Subscription Order.
	#Author      - Shaik
  #Date        - Jun 24,2022
  @NewSubscription
  Scenario Outline:  VYPE_4043_Pod Subscription_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When  User navigates to Rewards page
    Then  Verify the Rewards page and current points of the user
    When  User navigates to ePod pods page
    And   User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
  	And   User navigates to Cart page
  	Then  Verify the cart summary and SUBSCRIPTION discount is applied in the Cart Summary Page
  	When  click on checkout and navigate to delivary page
    Then  user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then  Order should be Submitted and Subscription should be added
    When  User navigates to Rewards page
    Then  Verify the Rewards page and verify the Current Points are updated in the Rewards page
    And   Verify for first subscription order user will receive '2000' points for one time per user
  
  Examples: 
      | UN                  | pwd      | flavor | quantity |    UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | mohan.kumar@bat.com | TEST1234 | Clear  |     5    | 5555 5555 5555 4444 |       1024         |     190     | CANADA VYPE USER |
    