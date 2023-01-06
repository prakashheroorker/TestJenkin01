Feature: Bat Canada Help

  Background: 
    Given User is on pre-login page

  #Test Case - BatCanada_Help
  #Description - The purpose of this test case is to verify the Help UI
  #Author - Harsha
  #Date -Feb 02,2022
  #Updated by - Updated PRH - First - DXC Github
  #Updated by 
  #Updated lines -18 to 22
  #Date - 15/12/22
  @BatHelp
  Scenario Outline: BatCanada_Help
   When User click on login/register button
   Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User Hover on Help and verify links under help
    And User clicks on Shipping and delivery and verify shipping and delivery page
    And User Hover on Help and click on Contact us and verify Contact Us page
    And User Hover on Help and click on Faq and verify Faq page
  And User Hover on Help and click on StoreLocator and verify StoreLocator page
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN                  | pwd      |
      | alix.malkin@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------
  #Test Case - BatCanada_Help_Shipping&Delivery_Page
  #Description - The purpose of this test case is to verify the Shipping and delivary page and content
  #Author - Harsha
  #Date -January 28,2022
  #Updated by - shaik
  #Updated lines - 50 to 56
  #Date - 15/12/22
  
  
#  @Shipping
#  Scenario Outline: BatCanada_Help_Shipping&Delivery_Page
  #// When User click on login/register button
 #  //Then Verify the login modal is displayed with relevent content
 #  // When User enters email "<UN>" and Password "<pwd>" and click on login
 #   Then Verify home page is displayed
 #   When User Hover on Help and verify links under help
 #   And User clicks on Shipping and delivery 
 #   Then verify shipping and delivery page is displayed
 #   When click on scroller icon and verify shipping options
 #   And User enters "<Zipcode>" and click on submit
  #  Then Verify click mark is displayed
  #  When User scrolls to ready to shop and clicks on shop devices 
  #  Then Verify Epod2 page is displayed
  #  And Switch to default and verify shipping and delivery page is displayed
 #   When User scrolls to ready to shop and clicks on shop pods 
 #   Then Verify ePod Vape Pods page is displayed 
 #   And Switch to default and verify shipping and delivery page is displayed 
 #   When user enter question "<question>" and verifies the auto suggesion
  #  And User clicks on each question and verify the answer displayed
  #  And Hover on Account icon and Click on Logout option
  #  Then Verify the user is in Pre login home page

   # Examples: 
  #    | UN                  | pwd      | Zipcode | question                     |
  #    | alix.malkin@bat.com | TEST1234 | V5L0A0  | What is Vuse Click & Collect |

     
