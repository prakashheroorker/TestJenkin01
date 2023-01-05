Feature: ExperiencevuseXuLanding test case

  Background: 
    Given User is on pre-login page in mobile
    When User clicks on hamburger menu and Verify Login/Register link

  #Test Case: Experience vuseXu Landing page_Mobile
  #Description: The purpose of this Test Case is to verify To validate the Experience vuseXu Landing page.
  #Author: Sandeepa S
  #Date: 3-Feb-2022
  #Modified by - Sai Sireesha
  #Date - December 19,2022
  #Modified steps - 21 to 42
  @vuseXuLanding
  Scenario Outline: Experience vuseXu Landing page
    And Click on Login/Register button and verify login modal page with relevent content is displayed
    When User enter valid email address "<UN>" and "<pwd>" and click on Login button
    And User clicks on hamburger menu and verify my account link is displayed
    And User clicks on hamberger menu and clicks on Shop
    And click on Personalize your ePod and click on Experience vuseXu
    Then Verify Experience VUSE x U Page and with relevant content is displayed
    When User Swipe down and clicks on ePodtwo under ENDLESS WAYS TO CUSTOMIZE
    Then Verify the epodtwo tile highlighted and Verify the content
    And Click on ePod Twoplus under ENDLESS WAYS TO CUSTOMIZE
    Then Verify the ePod twoplus tile highlighted and Verify the content
    When User swipe down and click on Discover more button under ENGRAVING tile
    Then Verify Engrave Your Devices Page is displayed
    And User click on browse back and Verify the Experience VUSE x U page is displayed
    When User swipe down and click on BuyNow button under PUT A RING ON IT
    Then Verify ePod Rings Page is displayed
    And User click on browse back and Verify the Experience VUSE x U page is displayed
    When User swipe down and click on Discover more button under YOUR DEVICE ELEVATED tile
    Then Verify the skins Page is displayed
    And User click on browse back and Verify the Experience VUSE x U page is displayed
    When User swipe down and click on Start now button under AUDIO SIGNATURE tile
    Then Verify AUDIO SIGNATURE Page is displayed
    And User click on browse back and Verify the Experience VUSE x U page is displayed
    When User swipe down and click on Toronto under Vuse X U WHERE TO FIND US
    Then Verify selected Province address and visit store page link is displayed
    When User click on visit Store page link
    Then Verify related store Page is opened in the new tab
    When User close the new and Verify the Experience VUSE x U page is displayed
    And User clicks on hamburger menu and verify logout link is displayed
    And Click on logout link and verify the prelogin page is displayed

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |
