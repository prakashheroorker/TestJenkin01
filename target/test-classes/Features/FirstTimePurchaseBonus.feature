Feature: To verify First Purchase Bonus Points are added to the Your History section

Background: 
    Given User is on pre-login page
    
    # TestCase Name : VYPE_4418_FirstPuchase_Bonus Points_Validation
   # Description : To Verify that the First Purchase Bonus Points are added to the Your History section of the Rewards Tab.
   # Developed by : Honey Hari
   # Date : 28/06/2022
   # Updated by :Harsha Kumar
   #Date: 21/12/2022
    @firsttimebonus
    Scenario Outline: VYPE_4418_FirstPuchase_Bonus Points_Validation
    # --------Registering new user--------
    When Clicked on Login or Sign up
    Then Verify and click on login elements
    When Click on signup for registration process
    And Entering with new email address Email and password "<pwd>" and verify next button is enabled
    And Click on next button and verify register signup page is displayed
    And Enter "<FN>" and "<LN>" in signup page
    And Enter dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>" in signup page
    Then Checking the conditions and verify the register button
    When User clicks on register button and verify the user is logged in
    #----------Making first purchase with new user---------
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    And Navigate to Cart and verify the items in Cart
    When Click on Checkout button
    And Click on No Thanks link
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    When Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When User hovers on Profile section and click on My rewards link
    Then Verify first time bonus purchase points and bonus points under history
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page
    
    
     Examples: 
      | pwd      | FN     | LN  | DOB         | ADD                                        | PhNo           |flavor|quantity| delivery             | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |Test@1234 | Acjdji | defg | 19960921 | 106-5095 Newton St Burnaby British Columbia| 1-888-420-1620 |Clear |5       | Canada Post (Express) | 5555555555554444 |               1024 |         190 | CANADA VYPE USER |
 
