Feature: ePod2+ Reflekta

  Background: 
    Given User is on pre-login page

  #Developed By - Leela Venkata Bhavani
  #Date - September 28,2022
  #Description - The Purpose of the testcase is to verify the epod2+Reflekta Tile Validation and place e2e order
  #Test Case - VYPE-4742_epod2+Reflekta_ValidationE2E
  #Updated By - Sasikala
  #Date: 13 dec ,2022
  # Updated lines: 22 to 26
  @Reflekta_ValidationE2E
  Scenario Outline: VYPE-4742_epod2+Reflekta_ValidationE2E
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hover on shop and clicks on All ePod Devices
    Then Verify user navigated to ePod devices page
    When User clicks on ePodtwoplus Reflekta Tile
    Then Verify the product detail page of reflecta with relevent content
    When User click on right and left corousal and verify the different images
    And User click on exit
    Then Verify user navigated to ePod devices page
    When User clicks on ePodtwoplus Reflekta Tile and verify product detail page of reflecta
    And Click on Add to Cart button
    Then Verify mini cart is updated and added to cart is displayed
    When Hover on cart and click on view cart
    Then Verify the cart page
    When Click on Checkout button
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
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | louisa.spencer@bat.com | TEST1234 | Fedex    | 5555555555554444 |               0925 |         348 | CANADA VYPE USER |
