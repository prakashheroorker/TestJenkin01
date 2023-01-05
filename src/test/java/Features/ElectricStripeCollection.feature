Feature: 

  Background: 
    Given User is on pre-login page

  #Test Case - VYPE_4401_Electric_Stripe_Collection
  #Description - The Purpose of Test Case is to verify the Electric Stripe Collection in Epod Page and submit Order flow
  #Updated 16-18 lines by - Akhila
  #Date -Dec 14,2022 
  @Electricstripe
  Scenario Outline: VYPE_4401_Electric_Stripe_Collection
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hover on shop and click on All Epod Devices
    And Click on Epodtwo and verify the page is displayed
    And Click on Electric Shop collection and select "<Stripe>"
    And User navigates to Cart page
    And Click on Checkout button
    Then Verify Shipping page is and One time Purchase details are dispalyed
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    And Verify all delivery options are dispalyed
    When Select "<delivery>" option and Click on Go To Billing button
    Then Verify Billing Page and One time Purchase details dispalyed
    When User enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click on terms and conditions check box and verify submit order button is enabled
    And Click on Submit Order button
    Then Verify order confirmation page is displayed with relevent content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                      | pwd      | Stripe    | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName | delivery              |
      | gillian.johnson@bat.com | TEST1234 | Bolt Grey | 5555555555554444 |               1024 |         190 | Mallary stokes   | Canada Post (Express) |
