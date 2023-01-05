@Buisness01
Feature: If there is an existing subscription, user can click on Add/Modify subscription

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_Subscription_Account_BusinessWorkflows_01_TC001
  #Description - The pupose of this testcase is if there is an existing subscription, user can click on Add/Modify subscription  with the ability to choose choose pods, add the flavours to the existing Active subscription
  #Developed By - Harsha Kumar
  #Date - September 22,2021
  @Account01 @GoldenRegressionSuite
  Scenario Outline: GVCA_Subscription_Account_BusinessWorkflows_01_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    Then verify subscribe and save option
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    And navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page and verify subscription details
    And click on Add or modify button and select flavour "<flavour>" with Nicotine strength and click on Add
    Then Verify order summary and click on submit update
    And verify subscription update message
    Then verify Active subscription and cancel the subscription
    And Navigate to profile and Delete card present in profile page

    Examples: 
      | UN                  | pwd      | flavor  | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavour      |
      | jack.daniel@bat.com | TEST1234 | Clear   | 4444333322221111 |               0723 |         123 | jamie kulas      | Mango |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Subscription_Account_BusinessWorkflows_01_TC002
  #Description - The purpose of this testcase If there is no existing subscription, use can click on "Browse Cartridges" link to start the new subscription User should be presented with the Subscribe & Save page, with the ability choose pods, complete the Subscription Order
  #Developed By - Harsha Kumar
  #Date - September 22,2021
  @Account02
  Scenario Outline: GVCA_Subscription_Account_BusinessWorkflows_01_TC002
    Given user login with valid email address "<UN>" and password "<pwd>"
    When user Howers on profile icon and navigates to subscription in MyAccount page
    And verify user does not have active subscription and click on browse cartridges
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    And navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify subscription confirmation page and verify subscription details
    Then verify Active subscription and cancel the subscription
    And Navigate to profile and Delete card present in profile page

    Examples: 
      | UN                  | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Mango  | 4444333322221111 |               0723 |         123 | julian kunde     |
