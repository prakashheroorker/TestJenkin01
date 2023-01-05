@QAbatch01
Feature: Profile

  Background: 
    Given User is on pre-login page

  #Test Case - BatCanada_Account_Section_UI
  #Description - The purpose of this test case is to verify the UI of User
  #Developed By - Vinod Markandan
  #Date - September 3,2021
  #@Account
  #Scenario Outline: BatCanada_Account_Section_UI
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Account link
  #Then My Account section should be displayed
  #And Navigate back to Home page
  #When User clicks on My Rewards link
  #Then My Rewards section should be displayed
  #And Navigate back to Home page
  #When User clicks on My Savings link
  #Then My Savings section should be displayed
  #And Navigate back to Home page
  #When User clicks on My Orders link
  #Then My Orders section should be displayed
  #And Navigate back to Home page
  #When User clicks on My Subscription link
  #Then My Subscription section should be displayed
  #And Navigate back to Home page
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #
  #| username              | password |
  #| abigale.hoppe@bat.com | TEST1234 |
  #----------------------------------------------------------------------------------------
  #Test Case - BatCanada_Account_Section_UI
  #Description - The purpose of this test case is to verify the UI of User AccountSection
  #Developed By - Vinod Markandan
  #Date - September 3,2021
  #Modified By- SaiSireesha
  #Date - Decemeber 8,2022
  #Modified steps:56 to 63
  @Account
  Scenario Outline: BatCanada_Account_Section_UI
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User clicks on My Account link
    Then My Account section should be displayed
    When User hovers on Profile icon and click on My rewards link
    Then My Rewards section should be displayed
    When User hovers on Profile icon and  clicks on My Savings link
    Then My Savings section should be displayed
    When User hovers on Profile icon clicks on My Orders link
    Then My Orders section should be displayed
    When User hovers on Profile icon clicks on My Subscription link
    Then My Subscription section should be displayed
    And Navigate back to Home page
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username              | password |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyAccount
  #Description - The purpose of this test case is to verify the landing page of My Account
  #Developed By - Vinod Markandan
  #Date - September 6,2021
  #@MyAccount
  #Scenario Outline: BatCanada_MyAccount
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Account link
  #Then My Account section should be displayed
  #And contents in Account section is validated
  #When User clicks on Edit button in the User Name
  #Then Edit Your Information pop up modal should be displayed
  #When User clicks on close button in Edit Your Information modal
  #Then My Account section should be displayed
  #When User clicks on Add Payment Method link
  #Then Add payment Method modal should be displayed
  #When User clicks on close button in Add Payment Method modal
  #Then My Account section should be displayed
  #When User clicks on Delete button for saved cards
  #Then Delete payment method modal should be displayed
  #When User clicks on No return button in Delete payment method modal
  #Then My Account section should be displayed
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| username              | password |
  #| abigale.hoppe@bat.com | TEST1234 |
  #-------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyAccount
  #Description - The purpose of this test case is to verify the landing page of My Account
  #Pre Condition: User should have saved card under Payment method section of the My account page
  #Developed By - Vinod Markandan
  #Date - September 6,2021
  #Modified By- SaiSireesha
  #Date - Decemeber 8,2022
  #Modifed steps:114 to 121
  @MyAccount
  Scenario Outline: BatCanada_MyAccount
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User clicks on My Account link
    Then Verify profile section with relevant content is displayed
    When User clicks on Edit button in the User Name
    Then Edit Your Information pop up modal should be displayed
    When User clicks on close button in Edit Your Information modal
    Then My Account section should be displayed
    When User clicks on Add Payment Method link
    Then Add payment Method modal should be displayed
    When User clicks on close button in Add Payment Method modal
    Then My Account section should be displayed
    When User clicks on Delete button for saved cards
    Then Delete payment method modal should be displayed
    When User clicks on No return button in Delete payment method modal
    Then My Account section should be displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username              | password |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyOrder
  #Description - The purpose of this test case is to verify the landing page of My Order.
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #@MyOrder
  #Scenario Outline: BatCanada_MyOrder
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Orders link
  #Then My Orders section should be displayed
  #And contents in Orders section is validated
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| username              | password |
  #| abigale.hoppe@bat.com | TEST1234 |
  #-------------------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyOrder
  #Description - The purpose of this test case is to verify the landing page of My Order.
  #Pre Condition :User must have one order in the My Orders Section
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #Modified By - Sai Sireesha
  #Date-December 8,2022
  #Modified Steps:177, 178
  @MyOrder
  Scenario Outline: BatCanada_MyOrder
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User clicks on My Orders link
    Then Verify order section with relevant content is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username              | password |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyRewards
  #Description - The purpose of this test case is to verify the landing page of My Rewards.
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #@MyRewards
  #Scenario Outline: BatCanada_MyRewards
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Rewards link
  #Then My Rewards section should be displayed
  #And contents in Rewards section is validated
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| username              | password |
  #| abigale.hoppe@bat.com | TEST1234 |
  #-----------------------------------------------------------------------------------------
  #Test Case - BatCanada_MyRewards
  #Description - The purpose of this test case is to verify the landing page of My Rewards.
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #Modified By- SaiSireesha
  #Date - Decemeber 8,2022
  #Modified steps- 221,222
  @MyRewards
  Scenario Outline: BatCanada_MyRewards
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User click on My Rewards link
    Then Verify reward section with relevant content is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username              | password |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MySavings
  #Description - The purpose of this test case is to verify the landing page of My Savings.
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #@MySavings
  #Scenario Outline: BatCanada_MySavings
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Savings link
  #Then My Savings section should be displayed
  #And contents in Savings section is validated
  #When User clicks on Terms and Condition link
  #Then Terms and Conditions should be displayed
  #When User clicks on Back button in the browser
  #Then My Savings section should be displayed
  #When User clicks on Learn More link
  #Then user is navigated to PASS ON THE SAVINGS page
  #When User clicks on Back button in the browser
  #Then My Savings section should be displayed
  #And copy the invite link should be displayed
  #And validate the savings information icon
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| username              | password |
  #| abigale.hoppe@bat.com | TEST1234 |
  #------------------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MySavings
  #Description - The purpose of this test case is to verify the landing page of My Savings.
  #Developed By - Vinod Markandan
  #Date - September 7,2021
  #Modified By- SaiSireesha
  #Date - Decemeber 8,2022
  #Modified steps :276,279,282
  @MySavings
  Scenario Outline: BatCanada_MySavings
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User clicks on My Savings link
    Then Verify savings sections with relevant content is displayed
    When User clicks on Terms and Condition link
    Then Terms and Conditions should be displayed
    When User click on browse back and verify savings section should be displayed
    And User clicks on Learn More link
    Then User is navigated to PASS ON THE SAVINGS page
    When User click on browse back and verify savings section should be displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username              | password |
      | abigale.hoppe@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case - BatCanada_MySubscription
  #Description - The purpose of this test case is to verify the landing page of My Subscription.
  #Developed By - Vinod Markandan
  #Date - September 8,2021
  #@MySubscription
  #Scenario Outline: BatCanada_MySubscription
  #Given user login with valid email address "<username>" and password "<password>"
  #When User hovers on Profile section
  #Then all the Account options will be displayed
  #When User clicks on My Subscription link
  #Then My Subscription section should be displayed
  #And contents in Subscription section is validated
  #When User clicks on Edit details button for Shipping
  #Then User is navigated to Edit Details page
  #When User clicks on Back button in the browser
  #Then My Subscription section should be displayed
  #When User clicks on Cancel Subscription link
  #Then Cancel Subscription modal should be displayed
  #When User clicks on No return button in Cancel Subscription modal
  #Then My Subscription section should be displayed
  #When User clicks on Logout link
  #Then User should be logged out
  #
  #Examples:
  #| username           | password |
  #| niloy.reza@bat.com | TEST1234 |
  #------------------------------------------------------------------------------------
  #Test Case - BatCanada_MySubscription
  #Description - The purpose of this test case is to verify the landing page of My Subscription.
  #Pre Condition: The User must have Existing Subscription
  #Developed By - Vinod Markandan
  #Date - September 8,2021
  #Modified By- SaiSireesha
  #Date - Decemeber 8,2022
  #Modified Steps:328,335,338
  @MySubscription
  Scenario Outline: BatCanada_MySubscription
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<username>" and Password "<password>" and click on login
    Then Verify home page is displayed
    When User hovers on Profile Icon
    Then All the Account options will be displayed
    When User clicks on My Subscription link
    Then Verify subscription section with relevant content is displayed
    When User clicks on Edit details button for Shipping
    Then User is navigated to Edit Details page
    When User click on browser back and verify subscription page is displayed
    When User clicks on pause Subscription link
    Then Pause Subscription modal should be displayed
    When User clicks on No return button in pause Subscription modal
    Then My Subscription section should be displayed
    When User clicks on Cancel Subscription link
    Then Cancel Subscription modal should be displayed
    When User clicks on No return button in Cancel Subscription modal
    Then My Subscription section should be displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | username                | password |
      | sahar.nasrallah@bat.com | TEST1234 |
