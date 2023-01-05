Feature: To verify the Anniversary Boxset Landing page

Background: 
Given User is on pre-login page in mobile
And user clicks on hamberger menu and click on login or register

#Test Case - BATCanada_AnniversaryBoxset_TC001
#Description - The purpose of this test case is to validate the E2E flow for the annivarsaryboxset, skins, Charging cable, ePod flavours in one order.
#Developed By - Harika
#Date - March 10,2022

@AnniversaryBoxset
Scenario Outline: BATCanada_AnniversaryBoxset_TC001
When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
Then User clicks on hamberger menu and clicks on Shop
And user clicks on Device, Pods and Accessories and clicks on epodtwo device
Then navigate to device and select boxset 
Then Scroll to skins and select skin "<skinindex>" and add to cart
Then Add charging cable and charging case and add to cart
And click on explore and select epod "<flavour>" and add to cart
Then Hower on cart icon and click on view cart
Then click on checkout and verify checkout page
Then click on go to delivary and verify shipping options 
Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
#And verify order confirmation and order number


Examples:

  |UN                       |pwd       |skinindex|flavour     |UserCardNumber  |UserCardExpiryDate|UserCardCVV  |UserCardFullName|
  |jonathan.thebault@bat.com|TEST1234  |  1      |Lemon Berry |4444333322221111|0723              |123          |brayan hartmann |
  


   





  