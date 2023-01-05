@SubscriptionProducts
Feature: Add and modify products in subscription

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_SubscriptionProducts_01_TC001
  #Description - Add more than one product for subscription.
  #Developed By - Divya Kumari
  #Date - October 7,2021
  @SubscriptionProducts_TC001
  Scenario Outline: GVCA_SubscriptionProducts_01_TC001
    When user navigates to ePod pods page
    And choose Flavour "<flavor1>" in Pod Pods Page and verify flavortext
    And click on subscribe and save and add quantity and click on add to cart
    And user navigates to ePod pods page
    And choose Flavour "<flavor2>" in Pod Pods Page and verify flavortext
    And Add quantity for onetime purchase and click on add to cart
    Then navigate to Cart and verify the items in Cart
    When user clicks on checkout button from cart page and enter Username as "<UN>" and password as "<pwd>" to login
    And user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then verify subscription confirmation page and verify subscription details
    #And verify Active subscription and cancel the subscription
    #And verify existing payment method and delete the payment method

    Examples: 
      | UN                   | pwd      | flavor1        | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | flavor2      |
      | changyu.jung@bat.com | TEST1234 | Smooth Tobacco | 4444333322221111 |               0723 |         123 | jamie kulas      | Passionfruit |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionProducts_02_TC001
  #Description - Modify a subscription.
  #Developed By - Bhavitha
  #Date - November 7,2021
  @SubscriptionProducts_02
  Scenario Outline: GVCA_SubscriptionProducts_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When user Howers on profile icon and navigates to subscription in MyAccount page
    Then Edit subscription details and save
    And Modify the dispatch frequency of the product

    Examples: 
      | UN                   | pwd      |
      | changyu.jung@bat.com | TEST1234 |
