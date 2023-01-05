@personalizeyourepod
Feature: Personalize your ePod

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Developed By - Bhavitha
  #Date - February 10,2022
  #Description -  The purpose of this Test Case is to verify the End to End Order placed for 'Engravable Epod' Via  personalized epod' by selectng the Mini Icon  as "Yin Hu"
  #Test Case - VYPE3737_E2E_Engrave your epod_TC002
  @VYPE3737_E2E_Engrave_your_epod_TC002
  Scenario Outline: VYPE3737_E2E_Engrave_your_epod_TC002
    Given User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User clicks on hamberger menu and clicks on Shop
    And user clicks on Personalize your ePod and clicks on Engrave Your ePod
    Then Verify Engrave Your ePod landing page is displayed
    When Click on OUR CORE COLLECTION
    Then Verify CORE COLLECTION landing page is displayed
    When Select colour under Element Collection"<color>"
    Then Verify that the device colour changes"<color>"
    When click on mini icon and select New"<MiniIcon>"
    Then Verify the user is navigated to next Step
    Then click on Text and click on text direction "<direction>" and enters text "<text>" and select font "<fontstyle>"
    Then Add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation and order number

    Examples: 
      | UN                        | pwd      | color            | MiniIcon | TextDirection | FontStyle | Text    | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jonathan.thebault@bat.com | TEST1234 | Pink Salt (pink) | Costo    | Vertical      | Monument  | Mallary | 4444333322221111 |               1024 |         190 | mallory stokes   |
#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#Test Case: VYPE3737_E2E_Engrave your epod_TC001_Mobile
#Objective:The purpose of this Test Case is to verify the End to End Order placed for 'Engravable Epod' Via personalized epod' by selectng the Pattern as "Tu An"
#Author: Sandeepa S
#Date: 4th Feb 2022

@Engrave
Scenario Outline: VYPE3737_E2E_Engrave your epod_TC001_Mobile
When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
Then User clicks on hamberger menu and clicks on Shop
Then click on Personalize your ePod and click on Engrave your ePod2
Then Verify the user is redirected to Engravings Landing Page
And Click on Explore Now Button
Then Verify the user is redirected to Pick Device Color and Design StylePage
And Select the Colour from the Core Collection Section
Then Verifiy that the device colour changes based on the selection made.
And Select the New Pattern "<Pattern>"and click on "<TuAnPattern>"add patern Button
When Verify the user is navigated to Step2: Now customize the Back
Then click on Text and select the text direction (Hortizontal /Vertical) 
And Enter the Text "<Text>" by selecting the font style from available styles
And Click on Add Text Button
And Verfiy the user is redirected to Engraving Summary Page
Then Verify the image on the left is as per the customizations added
And verify the Engraving Summary
When Click on "Add to Cart" Button
Then click on checkout and verify checkout page
Then click on go to delivary and verify shipping options 
Then click on go to billing and enter card details UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order 
And verify order confirmation and order number


Examples:
	| UN                        | pwd      | Pattern     |  TuAnPattern|Text  |UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
	| jonathan.thebault@bat.com | TEST1234 | Pattern     |TuAnPattern  | 	sai |4444333322221111 | 1024		           |      190   |CANADA VYPE USER   |
		