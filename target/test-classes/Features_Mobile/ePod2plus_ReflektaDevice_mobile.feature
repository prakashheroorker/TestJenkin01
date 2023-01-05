Feature: epod2+Reflekta

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Developed By - Leela Venkata Bhavani
  #Date - September 28,2022
  #Description - The Purpose of the test case is to verify the epod2+Reflekta Tile Validation and Place order for epod2+Reflekta device
  #Test Case -VYPE-4742_epod2+Reflekta_Mobile
  #Updated By - Sasikala
  #Date: 15 dec ,2022
  # Updated lines: 24 to 26
  
  @VYPE-4742_epod2+Reflekta_Mobile
  Scenario Outline: VYPE-4742_epod2+Reflekta_Mobile
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And User clicks on ePod Vaping Products and clicks on All ePod devices
    Then Verify user navigated to ePod devices screen and verify relevant content
    When User clicks on the ePodtwoplus Reflekta tile
    Then Verify the product detail page of Reflecta with relevent content
     When User click on right and left corousal and verify the different images are displayed
    And User click on Exit
    Then Verify user navigated to ePod Devices page
    When User clicks on ePodtwoplus Reflekta tile and verify product detail page of reflecta
    And Click on Add To Cart button
    Then Verify mini cart is updated and Added to cart is displayed
    When Click on mini cart icon and verify checkout page
    Then Verify the Cart page
    When Click on checkout
    Then Verify Shipping Page is and One time Purchase details are dispalyed
    When Click on Go to Delivery button
    Then Verify Delivery and One Time Purchase details are dispalyed
    And Verify all delivery Options are dispalyed
    When Select "<delivery>" Option and Click on Go To Billing button
    Then Verify Billing Page and One Time Purchase details dispalyed
    When User Enters card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>"
    And Click On terms and conditions check box and verify submit order button is enabled
    And Click On Submit Order button 
    Then Verify Order confirmation page is displayed with relevent content
    When User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed
    
    
    
    
    
    

    Examples: 
      | UN                     | pwd      | delivery | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | louisa.spencer@bat.com | TEST1234 | Fedex    | 5555555555554444 |               0925 |         348 | CANADA VYPE USER |
    