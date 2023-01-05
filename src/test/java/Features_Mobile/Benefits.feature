Feature: Verifing Benefits for each type of user

  Background: 
    Given User is on pre-login page in mobile
    And user clicks on hamberger menu and click on login or register

  #Test Case : GVPCA_PlatinumBenefits_02_TC001
  #Objectives: The purpose of this Test Case is Verify the Platinum User will have a free shipping in the checkout page .
  #Author: Harsha Kumar
  #Date: 19/11/2021
  @platinum
  Scenario Outline: GVPCA_PlatinumBenefits_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify platinum status and other benefits in rewards page
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and verify shipping is free

    Examples: 
      | UN                      | pwd      | flavor       | count |
      | gillian.johnson@bat.com | TEST1234 | Passionfruit |     5 |

  #-----------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Platinum Vype Plus status, is presented with a birthday gift on the date of birthday
  #Developed By - Mohammed Shouiab
  #Date - 21 April,2022
  #Test Case - GVPCA_PlatinumBenefits_03_TC001
  @Benefits03
  Scenario Outline: GVPCA_PlatinumBenefits_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify platinum status and other "<Benefits>"

    Examples: 
      | UN                  | pwd      | Benifits                                                                         |
      | alix.malkin@bat.com | TEST1234 | YourotherGoldbenefitsFreeshippingonallordersBirthdaygiftEarlyaccesstonewflavours |

  #-----------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Platinum Vype Plus status, is allowed early access to new flavours
  #Developed By - Mohammed Shouiab
  #Date - 21 April,2022
  #Test Case - GVPCA_PlatinumBenefits_04_TC001
  @Benefits04
  Scenario Outline: GVPCA_PlatinumBenefits_04_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify platinum status and other benefits in rewards page

    Examples: 
      | UN                  | pwd      |
      | alix.malkin@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : GVPCA_GoldBenefits_02_TC001
  #Objectives: The purpose of this testcase is user who achieved Gold Vype Plus status, is allowed early access to new flavours.
  #Author: Harsha Kumar
  #Date: 19/11/2021
  @Gold
  Scenario Outline: GVPCA_GoldBenefits_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify Gold status and other benefits in rewards page
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and verify shipping is free

    Examples: 
      | UN                       | pwd      | flavor      | count |
      | matthew.pickford@bat.com | TEST1234 | Velvety Mix |     5 |

  #---------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Gold Vype Plus status, is presented with a birthday gift on the date of birthday
  #Developed By - Harris Christopher
  #Date - 21/4/2022
  #Test Case - GVPCA_GoldBenefits_04_TC001
  @Benefits2
  Scenario Outline: GVPCA_GoldBenefits_04_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify Gold status and other benefits in rewards page

    Examples: 
      | UN                  | pwd      |
      | allison.lai@bat.com | TEST1234 |

  #---------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Gold Vype Plus status, is presented with a birthday gift on the date of birthday.
  #Developed By - Harris Christopher
  #Date - 21/4/2022
  #Test Case - GVPCA_GoldBenefits_03_TC001
  @Benefits3
  Scenario Outline: GVPCA_GoldBenefits_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    And verify Gold status and other benefits in rewards page

    Examples: 
      | UN                  | pwd      |
      | allison.lai@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : GVPCA_SilverBenefits_01_TC002
  #Objectives: The purpose of this testcase is to  Verify the following coupon codes : This discount is applied once per month.
  #Author: Harsha Kumar
  #Date: 26/11/2021
  @silver
  Scenario Outline: GVPCA_SilverBenefits_01_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify silver status and other benefits in rewards page
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    And verify discount is not applied

    Examples: 
      | UN                    | pwd      | flavor | count |
      | roxie.sanford@bat.com | TEST1234 | Lychee |     1 |

  #------------------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Silver Vype Plus status, is shown free shipping on checkout.
  #Developed By - Chandini
  #Date - apr 21,2022
  #Test Case - GVPCA_SilverBenefits_02_TC001
  @Silver1
  Scenario Outline: GVPCA_SilverBenefits_02_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify silver status and other benefits in rewards page
    Then User clicks on hamberger menu and clicks on Shop
    And user clicks on Device, Pods and Accessories and clicks on pods
    Then user verifies pods page and selects flavor "<flavor>"
    Then click on one time purchase add quantity "<count>" and add to cart
    Then Hower on cart icon and click on view cart
    Then click on checkout and verify checkout page
    Then click on go to delivary and verify shipping options
    Then click on go to billing and verify shipping is free

    Examples: 
      | UN                    | pwd      | flavor            | count |
      | kareem.hegman@bat.com | TEST1234 | Mandarin Cinnamon |     1 |

  #------------------------------------------------------------------------------------------------
  #Description - Verify the following goVype.ca user who achieved Silver Vype Plus status, is shown 15% discount on checkout.
  #Developed By - chandini
  #Date - apr 21,2022
  #Test Case - GVPCA_SilverBenefits_03_TC001
  @Silver2
  Scenario Outline: GVPCA_SilverBenefits_03_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    Then User click on hamberger menu and clicks on My Rewards
    Then verify silver status and other benefits in rewards page
    And Verify Green tick is displayed in front of birthday gift

    Examples: 
      | UN                    | pwd      |
      | roxie.sanford@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------
  #Description - Verify 'Rewards' page shows information on the account and rewards status.'Lifetime spend' status shown, User can examine current status in the 'Your status progress' bar, User can review orders history on the 'Orders' page, User can review following details on the Orders page:Order No, Date Order Completed, Total $ amount paid for the order, number and type of products purchased, User can re-order same product, User can review subscriptions on the 'Subscriptions'page, User can review profile information on the 'Profile'page.
  #Developed By - vidya
  #Date - March 28,2022
  #Test Case - GVPCA_StatusOfBenefits_01_TC002
  @StatusOfBenefits02
  Scenario Outline: GVPCA_StatusOfBenefits_01_TC002
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User click on hamberger menu and clicks on My Rewards
    Then User Verifies Your Status
    Then User click on hamberger menu and clicks on Save
    Then User click on Vuse+ Rewards under Programs
    Then User Verifies Vuse+ Rewards page is Displayed
    When User Click on find your status button
    Then User Verify Reward page is displayed with relevent content
    When Click on orders and Verify order Page Content
    And Click on profile and enter details and verify unsubscribe text

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------
  #Test Case : GVPCA_StatusOfBenefits_01_TC001
  #Objectives: Verify 'Registered users' status can be reviewed at the Rewards page and Rewards page can be accessed via My Account link on the main page or vype+ page or, via click on Find out your status from the vype+ page.
  #Author: Mohammed Shouiab
  #Date: 28/03/2022
  @StatusOfBenefits1
  Scenario Outline: GVPCA_StatusOfBenefits_01_TC001
    When User enters valid email address "<UN>" and password "<pwd>" and clicks on login in Mobile
    When User click on hamberger menu and clicks on My Rewards
    Then User Verifies Your Status
    Then User click on hamberger menu and clicks on Save
    Then User click on Vuse+ Rewards under Programs
    Then User Verifies Vuse+ Rewards page is Displayed
    When User Click on find your status button
    Then User Verify Reward page is displayed with relevent content

    Examples: 
      | UN                       | pwd      |
      | matthew.pickford@bat.com | TEST1234 |
