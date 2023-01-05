Feature: ExperiencevuseXuLanding test case

  Background: 
    Given User is on pre-login page

  #Test Case   : Experience_vuseXu_LandingPage_TC001
  #Description : The purpose of this Test Case is to verify to validate the Experience vuseXu Landing page.
  #Author      : Shaik
  #Date        : 09-AUG-2022
  #Modified By-Sai Sireesha
  #Date:December 13,2022
  #Modified steps -20 to 25,27,28,30,31,33,34,36 to 41
  @vuseXuLanding
  Scenario Outline: Experience_vuseXu_LandingPage_TC001
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When Hower on Shop and click on Experience VUSE x U link under Personalize your ePod
    Then Verify Experience VUSE x U page and with relevant content is displayed
    When User scroll down and clicks on ePodtwo under ENDLESS WAYS TO CUSTOMIZE
    Then Verify the epodtwo tile highlighted and verify the content
    And Click on ePod twoplus under ENDLESS WAYS TO CUSTOMIZE
    Then Verify the ePod twoplus tile highlighted and verify the content
    When User scrolls down and click on Discover more button under ENGRAVING tile
    Then Verify Engrave Your Devices page is displayed
    And User click on browse back and verify the Experience VUSE x U page is displayed
    When User scrolls down and click on BuyNow button under PUT A RING ON IT
    Then Verify ePod Rings page is displayed
    And User click on browse back and verify the Experience VUSE x U page is displayed
    When User scrolls down and click on Discover more button under YOUR DEVICE ELEVATED tile
    Then Verify the skins page is displayed
    And User click on browse back and verify the Experience VUSE x U page is displayed
    When User scrolls down and click on Start now button under AUDIO SIGNATURE tile
    Then Verify AUDIO SIGNATURE page is displayed
    And User click on browse back and verify the Experience VUSE x U page is displayed
    When User scrolls down and click on Toronto under Vuse X U WHERE TO FIND US
    Then Verify selected province address and visit store page link is displayed
    When User click on visit store page link
    Then Verify related store page is opened in the new tab
    When User close the new and verify the Experience VUSE x U page is displayed
    And Hover on Account icon and Click on Logout option
    Then Verify the user is in Pre login home page

    Examples: 
      | UN            | pwd      |
      | siri7@bat.com | TEST1234 |
