Feature: To Verify the Delivery Options are available for Non-Vuse + user for diffrent Tires in the Delivery option Page 

  Background: 
    Given User is on pre-login page

  #Test Case - VYPE_4392_Non Vuse+ User_DeliveryOptions_TC001
  #Description -The purpose of this test case is to Verify the Delivery Options are available for Non Vuse+ user in the Delivery Page and to Verify the Delivery Option is Chargable or not
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*- User ID should be a Non Vuse+ member
  @NonVuse+Delivery
   Scenario Outline: VYPE_4392_NonVuse+User_DeliveryOptions_TC001
  Given User login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
  Examples: 
      |UN                          | pwd           | flavor         | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName | 
      |mohammedsu@bat.com             | TEST1234      | Mango          | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
  
 ## ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  #Test Case - VYPE_4392_Silver User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Silver user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*- #  User should be in Silver Tier
            #  User should have *Free Express shipping* badge in the rewards section
  @SilverDelivery
   Scenario Outline: VYPE_4392_Silver User_DeliveryOptions_TC001
  Given user login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
 
  Examples: 
      | UN             | pwd      | flavor   | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName |
      | honey.h015@bat.com| TEST1234 | Clear    | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
  
  ## ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  #Test Case - VYPE_4392_Gold User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*-  #   User should be in Gold Tier
             #  User should have *Free Express shipping* badge in the rewards section
  @GoldDelivery
   Scenario Outline: VYPE_4392_Gold User_DeliveryOptions_TC001
  Given user login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
 
  Examples: 
      | UN                        | pwd         | flavor   | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName |
      |vireddy@bat.com       | TEST1234  | Clear    | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
 
   
  ## ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  #Test Case - VYPE_4392_Platinum User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*-  User should have valid credentials.
          #   User should be in Platinum Tier
          #  User should have *Free Express shipping* badge in the rewards section
  @PlatinumDelivery
   Scenario Outline: VYPE_4392_Platinum User_DeliveryOptions_TC001
  Given user login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
 
  Examples: 
      | UN                        | pwd       | flavor   | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName |
      |shouiabshoyo@bat.com      | TEST1234  | Mango    | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
 
   
  ## ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  #Test Case - VYPE_4392_Premium User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Gold user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*- #   User should be in Premium Tier
            #  User should have *Free Express shipping* badge in the rewards section
  @PremiumDelivery
   Scenario Outline: VYPE_4392_Premium User_DeliveryOptions_TC001
  Given user login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
 
  Examples: 
      |UN                 |pwd         | flavor  | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName |
      |sarah.nilan@bat.com|TEST1234    | Mango   | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
 
 ##--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
  #Test Case - VYPE_4392_Supreme User_DeliveryOptions_TC001
  #Description -   To Verify the Delivery Options are available for Supreme user in the Delivery Page
  #Developed By - Mohammed Shouiab
  #Date - June 2022
  # *Note*- #   User should be in Supreme Tier
            #  User should have *Free Express shipping* badge in the rewards section
  @SupremeDelivery
   Scenario Outline: VYPE_4392_Supreme User_DeliveryOptions_TC001
  Given user login with valid email address "<UN>" and password "<pwd>"
  When Hower on Shop and click on ePodtwo pods
  And User selects required product "<flavor>" with required quantity "<quantity>" for one time purchase and add to the cart
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is less than $ Twenty five
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is in between $ Twenty Five && $ Fourty Nine
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal in between $ fifty &&  $ Seventy Five "
  Then navigate to Cart and verify the items in Cart
  Then Verifying shipping options when subtotal is above $ Seventy Five
  Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
 
  Examples: 
      | UN                        | pwd      | flavor   | quantity | UserCardNumber   | UserCardExpiryDate | UserCardCVV  | UserCardFullName |
      | ashley.ledo@bat.com      | TEST1234  | Mango    | 1        | 4444333322221111    | 1024             |        1901  | CANADA          |
 