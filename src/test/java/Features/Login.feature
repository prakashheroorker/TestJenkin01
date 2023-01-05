Feature: Login

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_Login_01_TC001
  #Description - The purpose of this Test Case is to verify the UI of Login dialog box
  #Developed By - Sai Manaswini
  #Date - September 8,2021
  #Modified by- Sai Sireesha
  #Date - December 12,2022
  #Modified steps - 15,16
  @Login_01_TC001
  Scenario: GVCA_Login_01_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_03_TC001
  #Description -  The purpose of this Test Case is to verify the "Sign Up" link functionality on the Login dialog box.
  #Developed By - Sai Manaswini
  #Date - October 5,2021
  #Modified by- Sai Sireesha
  #Pre condition - Before executing change the FN and LN in the examples
  #Date - December 12,2022
  #Modified steps - 27,28,30,31,34,35
  @GVCA_Login_03_TC001
  Scenario Outline: GVCA_Login_03_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    And Click on signup for registration process
    Then Verify password rules are displayed
    When Signing with new email address Email and password "<pwd>"
    Then Verify password rules are marked in green color and verify next button
    When User clicks on next button and verify user redrictes to signup form
    And Entering "<FN>" and "<LN>"
    And Entering dob "<DOB>" , address "<ADD>" and Phone number "<PhNo>"
    Then Checking the conditions and verify the register button
    When User clicks on register button and verify the user is logged in
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | pwd       | FN  | LN    | DOB      | ADD                                         | PhNo           |
      | Test1234$ | Luke | Dunph | 19961020 | O-4386 Sheppard Ave E | 1-888-424-4620 |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_05_TC001
  #Description - The purpose of this Test Case is to verify the different validations on Password field on the Login dialog box
  #Developed By - Sai Manaswini
  #Date - November 26,2021
  #Modified by- Sai Sireesha
  #Date - December 12,2022
  #Modified steps - 45 to 54
  @GVCA_Login_05_TC001
  Scenario Outline: GVCA_Login_05_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enter valid email address in email field "<UN>" and password field as blank and click on Login
    Then Verify the error message as password is required
    When User Clear the email text area
    And User enter valid email address in email field "<UN>" invalid "<pwd>"  in password field and click on Login
    Then Verify the error message as email or password incorrect
    When User Clear the email text area
    And Clear the password text area
    And User enter vaild email address "<UN>" less characters in password "<pwd1>" and click on login
    Then Verify the error message as Must be atleast eight characters

    Examples: 
      | UN                      | pwd       | pwd1    |
      | sahar.nasrallah@bat.com | TEST12345 | TEST123 |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_09_TC001
  #Description - The purpose of this Test Case is to verify Session is transferred  automatically from http to https after Login validation.
  #Developed By - Sai Manaswini
  #Date - September 9,2021
  #@FooterSectionSuite
  #Scenario: GVCA_Login_09_TC001
    #Then Verify the current url from current pages

  #----------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_Login_10_TC001
  #Description - The purpose of this Test Case is to verify the following:Passthrough Link Access to goVype.ca:- access to goVype.ca from link embedded in email- access to goVype.ca from link embedded in other websites
  #Developed By - Sai Manaswini
  #Date - September 15,2021
  #@GVCA_Login_10_TC001
  #Scenario Outline: GVCA_Login_10_TC001
    #When Clicked on Login or Sign up
    #When user login with valid email address "<UN>" and password "<pwd>"
    #And navigate to epod page
    #Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    #And using flavour URL to new page
    #Then verify the flavor page
    #When login from flavor page email address "<UN1>" and password "<pwd1>"
    #Then verify the flavor page
#
    #Examples: 
      #| UN                      | pwd      | flavor      | UN1                      | pwd1     |
      #| sahar.nasrallah@bat.com | TEST1234 | Lemon Berry | jedidiah.ratke11@bat.com | TEST1234 |
