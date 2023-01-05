Feature: epod2+Reflekta

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Developed By - Leela Venkata Bhavani
  #Date - September 28,2022
  #Description - The Purpose of the test case is to verify the epod2+Reflekta Tile Validation and Place order for epod2+Reflekta device
  #Test Case - VYPE-4742_epod2+Reflekta_TC002
  @VYPE-4742_epod2+Reflekta_Mobile_TC002
  Scenario Outline: VYPE-4742_epod2+Reflekta_Mobile_TC002
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then click on hamburger menu and click shop and click on all epod devices
    Then Click on the ePodtwoplus Reflekta Tile
    And verify ePodtwoPlus Reflekta device page
    Then Click on Add To Cart button
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                      | pwd      | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | 5555555555554444 |               1124 |         389 | alberta USER     |
