Feature: To verify cancel and pause subscription

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_CancelSubscription_01_TC001
  #Description - The Purpose of this test case is To verify Cancel  subscription.
  #Developed By - Harsha Kumar
  #Date - September 20,2021
  ##* if you want to reexecute kindly execute GVCA_CreateSubscription_01_TC001 in CreateSubscription.feature
  @Cancel01
  Scenario Outline: GVCA_CancelSubscription_01_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    Then verify Active subscription and cancel the subscription
    And Navigate to profile and Delete card present in profile page

    Examples: 
      | UN                      | pwd      |
      | jack.daniel@bat.com| TEST1234 |

  #----------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CancelSubscription_02_TC001
  #Description - The Purpose of this test case is To verify pause  subscription.
  #Developed By - Harsha Kumar
  #Date - September 20,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_02_TC001 in CreateSubscription.feature
  @Cancel02
  Scenario Outline: GVCA_CancelSubscription_02_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user Howers on profile icon and navigates to subscription in MyAccount page
    Then verify Active subscription and pause the subscription
    And Resume the paused subscription
    Then cancel the subscription
    And Navigate to profile and Delete card present in profile page

    Examples: 
      | UN                   | pwd      |
      | titus.pouros@bat.com | TEST1234 |
