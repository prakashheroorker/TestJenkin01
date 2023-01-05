@newfunctionalitysuite
Feature: To verify product catalogue section

Background: 
Given User is on pre-login page in mobile


#Test Case - ePod2_ProductCatalogue_HeroSlide
#Description - This Test is to validate the ePod2 Product Catalogue Page - Hero Slide.
#Developed By - Harika
#Date - January 21,2022
@catalogue01 @GoldenRegressionSuite
Scenario Outline:ePod2_ProductCatalogue_HeroSlide
And user clicks on hamberger menu and click on login or register
When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
When User howers on shop and click on epodtwo device and verify device page
Then Click on epodtwo elements collections and verify all device colours present
And Check navigation dots and check next is disabled or not
Then Scroll to compare and contrast and verify all markercontainers
Then scroll to faqs and verify all faqs
And scroll to choose your colour and choose device colour "<devicecolour>"
Then Verify device images and elements present in the page
Then Scroll to back button and verify back button 
And verify next button is enabled or not and click on Exit
Then verify all product slides and verify respective pages

Examples:

   |UN                       |pwd       |devicecolour|
   |bhavitha.nune@bat.com|TEST1234  |Emerald     |
   
   
   
#Test Case - ePod2_ProductCatalogue_Hero_Slide_tilesValidation
#Description - This Test is to validate the ePod2 Product Catalogue Page - Hero Slide - validate the tiles (Pods, skins, All Accessories, Charging cases, Engraving
#Developed By - Harika
#Date - January 21,2022
@calalogue02
Scenario Outline:ePod2_ProductCatalogue_Hero_Slide_tilesValidation
And user clicks on hamberger menu and click on login or register
When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
When User howers on shop and click on epodtwo device and verify device page
Then Verify all product slides and verify respective pages


  Examples: 
      | UN                   | pwd      |
      | bertha.von44@bat.com | TEST1234 |
 
#Test Case -GVCA_ePod2_FAQs_Validation2
#Description - The purpose of this Test case is to verify the Cookie Policy contents from the page footer(Pre-Login)
#Developed By - Harika
#Date - January 21,2022
@calalogue03FAQs
Scenario Outline:GVCA_ePod2_FAQs_Validation2

#When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
When User howers on shop and click on epodtwo device and verify device page
Then Click on epodtwo elements collections and verify all device colours present
Then scroll to faqs and click and verify all faqs

  Examples: 
      | UN                   | pwd      |
      | bertha.von44@bat.com | TEST1234 |
   

#Test Case - ePod2-Product Catalogue- Why Choose VUSE ePod 2 section
#Description - The purpose of this Test case is to verify the Cookie Policy contents from the page footer(Pre-Login)
#Developed By - Harika
#Date - January 21,2022
@calalogue04
Scenario: ePod2-Product Catalogue- Why Choose VUSE ePodtwo section
When User howers on shop and click on epodtwo device and verify device page
Then verify all type of products present in site in device page
And verify why choose epodtwo content present in device page


 
   
   

     
   