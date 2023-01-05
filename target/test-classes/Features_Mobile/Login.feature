Feature: Login

  Background: 
    Given User is on pre-login page in mobile

  #Test Case - GVCA_Login_01_TC001
  #Description - The purpose of this Test Case is to verify the UI of Login dialog box
  #Developed By - Sasikala
  #Date - 10/08/2022
  #Modified by -Sai Sireesha
  #Modified Date-December 13,2022
  #Modified steps-15,16
  @FooterSectionSuite @login
  Scenario: GVCA_Login_01_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed

  #-----------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_03_TC001
  #Description - The purpose of this Test Case is to register new member to the website
  #Developed By - Sasikala
  #Date - 10/08/2022
  #Modified by -Sai Sireesha
  #Pre condition - Before executing change the FN and LN in the examples
  #Modified Date-December 13,2022
  #Modified steps-33,35,36,39,40
  @GVCA_Login_03_TC001
  Scenario Outline: GVCA_Login_03_TC001
    When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    And click on signup for registration process in mobile
    Then Verify Password rules are displayed
    When Signing with new email address Email and password "<pwd>" by generating Email
    Then Verify Password rules are marked in green color and verify next button
    When User clicks on Next button and verify user redrictes to signup form
    And Entering "<FN>" and "<LN>" for creating profile
    And Entering dob "<DOB>" and address "<ADD>" and Phone number "<PhNo>"
    Then Checking the conditions checkbox and verify the Register button is enabled
    When User clicks on Register button and verify the user is logged in
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | pwd       | FN     | LN       | DOB      | ADD                   | PhNo           |
      | Test1234$ | Lukyme | Dunphyel | 19961020 | O-4386 Sheppard Ave E | 1-888-424-4620 |

  #------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_05_TC001
  #Description - The purpose of this Test Case is to verify the different validations on Password field on the Login dialog box
  #Developed By - Sasikala
  #Date - 10/08/2022
  #Modified by -Sai Sireesha
  #Modified Date-December 13,2022
  #Modified steps-59,60,62,63,66,67
  @GVCA_Login_05_TC001
  Scenario Outline: GVCA_Login_05_TC001
   When User clicks on hamburger menu and Verify Login/Register link
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address in email field "<UN>" and Password field as blank and click on Login
    Then Verify the error message as Password is required
    When Clear the Email text area
    And User enter valid email address in email field "<UN>" invalid "<password>"  in Password field and click on Login
    Then Verify the error message as email or Password incorrect
    When Clear the Email text area
    And Clear the Password text area
    And User enter vaild email address "<UN>" less characters in Password "<pwd1>" and click on login
    Then Verify the Error message as Must be atleast eight characters

    Examples: 
      | UN                      | password  | pwd1    | UN1                 |
      | sahar.nasrallah@bat.com | TEST12345 | TEST123 | nayeli.kass@bat.com |
  #-----------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_10_TC001
  #Description - The purpose of this Test Case is to verify the following:Passthrough Link Access to goVype.ca:- access to goVype.ca from link embedded in email- access to goVype.ca from link embedded in other websites
  #Developed By - Sasikala
  #Date - 11/08/2022
  #@GVCA_Login_10_TC001
  #Scenario Outline: GVCA_Login_10_TC001
    #And user clicks on hamberger menu and click on login or register
    #When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then verify the flavors page
    #And using flavour URL to new page in mobile
    #Then verify the flavors page
    #And user clicks on hamberger menu and click on login or register
    #When login from flavor page with email address "<UN1>" and password "<pwd1>"
    #Then User clicks on hamberger menu and clicks on Shop
    #And user clicks on Device, Pods and Accessories and clicks on pods
    #Then user verifies pods page and selects flavor "<flavor>"
    #Then verify the flavors page
#
    #Examples: 
      #| UN                 | pwd      | flavor      | UN1                  | pwd1     |
      #| akhila.cha@bat.com | TEST1234 | Lemon Berry | titus.pouros@bat.com | TEST1234 |
