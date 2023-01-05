#@FooterSectionSuite
#Feature: to verify the UI of Vype plus page.
#
  #Background: 
    #Given User is on pre-login page
#
  #Test Case - GVPCA_VypePlusContents_01_TC001
  #Description - The purpose of this Test Case is to verify the UI of Vype plus page.
  #Developed By - Harsha Kumar
  #Date - October 1,2021
  #@vype01
  #Scenario Outline: GVPCA_VypePlusContents_01_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When hower on save and click on vuseplus rewards
    #Then verify vuseplus rewards page and verify joining is easy content
    #Then verify how to maintan your status content
    #Then verify perks of vuseplus and benfits
    #And verify video below rewards program
    #Then verify faqs present in vuseplus rewards page
    #Then verify all footer links
    #And verify footer content present in vuseplus rewards page
#
    #Examples: 
      #| UN                   | pwd      |
      #| titus.pouros@bat.com | TEST1234 |
#
  #-----------------------------------------------------------------------------------------
  #Test Case - GVPCA_VypePlusContents_02_TC001
  #Description - The purpose of this Test Case is to verify the Video in VypePlus page.
  #Developed By - Harsha Kumar
  #Date - October 5,2021
  #@vype02
  #Scenario Outline: GVPCA_VypePlusContents_02_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When hower on save and click on vuseplus rewards
    #Then verify vuseplus rewards page and verify joining is easy content
    #Then verify how to maintan your status content
    #And verify video below rewards program
    #Then verify play and pause functionalities in the video
#
    #Then verify settings functionality in video
    #Examples: 
      #| UN                   | pwd      |
      #| titus.pouros@bat.com | TEST1234 |
#
  #----------------------------------------------------------------------------------------------
  #Test Case - GVPCA_VypePlusContents_03_TC001
  #Description - The purpose of this Test Case is to verify the Footer Section in VypePlus page
  #Developed By - Harsha Kumar
  #Date - October 5,2021
  #@vype03
  #Scenario Outline: GVPCA_VypePlusContents_03_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When hower on save and click on vuseplus rewards
    #Then verify vuseplus rewards page and verify joining is easy content
    #And click and verify all footer links
#
    #Examples: 
      #| UN                   | pwd      |
      #| titus.pouros@bat.com | TEST1234 |
#
  #--------------------------------------------------------------------------------------------------
  #Test Case - GVPCA_VypePlusContents_06_TC001
  #Description - TThe purpose of this Test Case is to verify the Questions section in VypePlus page.
  #Developed By - Harsha Kumar
  #Date - October 5,2021
  #@vype06
  #Scenario Outline: GVPCA_VypePlusContents_06_TC001
    #Given user login with valid email address "<UN>" and password "<pwd>"
    #When hower on save and click on vuseplus rewards
    #Then verify vuseplus rewards page and verify joining is easy content
    #Then scroll to any question and type keywords to find a topic in vuseplus rewards page "<Question>"
    #Then click and verify all frequently asked questions
#
    #Examples: 
      #| UN                   | pwd      | Question                           |
      #| titus.pouros@bat.com | TEST1234 | Does Vuse Plus have an expiry date |
