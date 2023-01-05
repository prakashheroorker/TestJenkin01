Feature: Calculate Tax breakdown for all the Provinces

  Background: 
    Given User is on pre-login page

  #Test Case: GVCA_Taxbreakdown_02_TC001
  #Objective:To verify the Tax breakdown for all the Provinces(BC, AB, ON, SK) and to verify the applied discount code
  #Author: Divya Kumari
  #Date: 17th Sep 21
  @GoldenRegressionSuite
  Scenario Outline: GVCA_Taxbreakdown_02_TC001
  When 	User click on login/register button
  Then Verify the login modal is displayed with relevent content
  When User enters email "<UN>" and Password "<pwd>" and click on login
  Then Verify home page is displayed
  And User hovers on Account icon and click on MY Account
  Then Verify user belongs to which province
  When User hovers on shop and click on pods
  Then Verify navigates to ePod Vape Pods page
  And Scroll to choose Flavour "<flavor>" and click on flavor image
  Then Verify respective flavor PDP is opened
  And Add required quantity "<quantity>" and click on add to cart
  And Navigate to Cart and verify the items in Cart
  When Click on Checkout button
  Then Verify shipping page and One time Purchase details are dispalyed
  And Validate tax applied correct or not 
  And Hover on Account icon and Click on Logout option
  When User click on login/register button
  Then Verify the login modal is displayed with relevent content
  When User enters email "<UN1>" and Password "<pwd>" and click on login
  And User hovers on Account icon and click on MY Account
  Then Verify user belongs to which province
  When User hovers on shop and click on pods
  Then Verify navigates to ePod Vape Pods page
  And Scroll to choose Flavour "<flavor1>" and click on flavor image
  Then Verify respective flavor PDP is opened
  And Add required quantity "<quantity1>" and click on add to cart
  And Navigate to Cart and verify the items in Cart
  When Click on Checkout button
  Then Verify shipping page and One time Purchase details are dispalyed
  And Validate tax applied correct or not 
  And Hover on Account icon and Click on Logout option
  Then Verify the user is in Pre login home page
  
  

    Examples: 
      | UN              | pwd      | flavor |quantity|UN1                 |flavor1 |quantity1| 
      |Matypots@bat.com | TEST1234 | Clear  |2       |paul.talbot@bat.com | Vanilla |1        |
     