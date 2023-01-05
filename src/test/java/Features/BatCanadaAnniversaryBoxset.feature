#This funtionality does not exsist now-Blocked
#Feature: To verify the Anniversary Boxset Landing page
#
  #Background: 
    #Given User is on pre-login page
#
  #Test Case - BATCanada_AnniversaryBoxset_TC001
  #Description - The purpose of this test case is to validate the E2E flow for the annivarsaryboxset, skins, Charging cable, ePod flavours in one order.
  #Developed By - Harika
  #Date - March 10,2022
  #@AnniversaryBoxset
  #Scenario Outline: BATCanada_AnniversaryBoxset_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #Then Hower on shop and navigate to device and select boxset
    #And add skin and charging cabel to cart "<skinindex>"
    #And add charging case to cart
    #And add flavor in epod to cart "<Flavour>"
    #And navigate to Cart and verify the items in Cart
    #Then verify the price in cart
    #When user Enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
#
    #And verify order confirmation page
    #Examples: 
      #| UN                        | pwd      | skinindex | Flavour     | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      #| jonathan.thebault@bat.com | TEST1234 |         1 | Lemon Berry | 4444333322221111 |               0723 |         123 | brayan hartmann  |
      