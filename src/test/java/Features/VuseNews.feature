Feature: Vuse News

  Background: 
    Given User is on pre-login page

  #Test Case 		- BatCanada_Vusenews_Validation
  #Description 	- The purpose of the test case is to verify the BatCanada_Vusenews landing page Under 'About' menu
  #Developed By - Harika
  #Date				  - February 18,2022
  #Updated By	  - Shaik Bandagi
  #Updated lines-
  #Date 				- Dec-14-2022
  @VuseNews
  Scenario Outline: BatCanada_Vusenews_Validation
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User Hovers on About and clicks Vuse news
    Then Verify tiles in vuse news landing page
    When Click on Read More link on any of the Blog Post
    Then Verify the user is redirected to the corresponding Blog post to read the content
    When Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                     | pwd      |
      | louisa.spencer@bat.com | TEST1234 |
