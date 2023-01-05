Feature: Benefits

  Background: 
    Given User is on pre-login page

  #Description - Verify the goVype.ca user who achieved Gold Vype Plus status, is shown free shipping on checkout.
  #Developed By - Bhavitha
  #Date - October 13,2021
  #Test Case - GVPCA_GoldBenefits_02_TC001
  @Benefits1
  Scenario Outline: GVPCA_GoldBenefits_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Gold Card Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    Then Navigate to cart page
    And Verify Whether Shipping Is Free

    Examples: 
      | UN                   | pwd      | flavor       |
      | brandon.huynen@bat.com | TEST1234 | Passionfruit |

  #---------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Gold Vype Plus status, is presented with a birthday gift on the date of birthday.
  #Developed By - Bhavitha
  #Date - October 8,2021
  #Test Case - GVPCA_GoldBenefits_03_TC001
  @Benefits3
  Scenario Outline: GVPCA_GoldBenefits_03_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Gold Card Is Displayed
    And Verify Whether Benifits Are Displayed "<Benifits>"

    Examples: 
      | UN                       | pwd      | Benifits                                                                         |
      | matthew.pickford@bat.com | TEST1234 | YourotherGoldbenefitsFreeshippingonallordersBirthdaygiftEarlyaccesstonewflavours |

  #---------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Gold Vype Plus status, is presented with a birthday gift on the date of birthday
  #Developed By - Bhavitha
  #Date - October 8,2021
  #Test Case - GVPCA_GoldBenefits_04_TC001
  @Benefits2
  Scenario Outline: GVPCA_GoldBenefits_04_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Gold Card Is Displayed

    Examples: 
      | UN                       | pwd      |
      | matthew.pickford@bat.com | TEST1234 |

  #-----------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Platinum Vype Plus status, is shown free shipping on checkout.
  #Developed By - Bhavitha
  #Date - October 13,2021
  #Test Case - GVPCA_PlatinumBenefits_02_TC001
  @Benefits4
  Scenario Outline: GVPCA_PlatinumBenefits_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Platinum Card Is Displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    Then navigate to cart page and click on checkout and navigate to delivary page
    And Verify Whether Shipping Is Free

    Examples: 
      | UN                      | pwd      | flavor     |
      | gillian.johnson@bat.com | TEST1234 | Watermelon |

  #-----------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Platinum Vype Plus status, is presented with a birthday gift on the date of birthday
  #Developed By - Bhavitha
  #Date - October 8,2021
  #Test Case - GVPCA_PlatinumBenefits_03_TC001
  @Benefits5
  Scenario Outline: GVPCA_PlatinumBenefits_03_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Platinum Card Is Displayed
    And Verify Whether Benifits Are Displayed "<Benifits>"

    Examples: 
      | UN                    | pwd      | Benifits                                                                                                             |
      | annil.ramroop@bat.com | TEST1234 | Your other platinum benefitsFree express shipping on all ordersBirthday giftEarly access to new product and flavours |

  #-----------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Platinum Vype Plus status, is allowed early access to new flavours
  #Developed By - Bhavitha
  #Date - October 8,2021
  #Test Case - GVPCA_PlatinumBenefits_04_TC001
  @Benefits6
  Scenario Outline: GVPCA_PlatinumBenefits_04_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Whether Platinum Card Is Displayed

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |

  #-------------------------------------------------------------------------------------------------
  #Description - Verify the following goVype.ca user who achieved Silver Vype Plus status, is shown 15% discount on checkout.
  #Developed By - Bhavitha
  #Date - November 8,2021
  #Test Case - GVPCA_SilverBenefits_01_TC001
  @SilverBenefits1
  Scenario Outline: GVPCA_SilverBenefits_01_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Silver tier card and couponCode is displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And Navigate to cart page
    When click on promotion and Enter discount code "<UserCardNumber>" "<UserCardExpiryDate>" "<UserCardCVV>" "<UserCardFullName>"
    Then Verify applied discount is displayed

    Examples: 
      | UN                      | pwd      | flavor       | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | sahar.nasrallah@bat.com | TEST1234 | Passionfruit | 3434 3434 3434 3434 |               1024 |         190 | CANADA VYPE USER |

  #------------------------------------------------------------------------------------------------
  #Description - Verify the following This discount is applied once per month.
  #Developed By - Bhavitha
  #Date - October 21,2021
  #Test Case - GVPCA_SilverBenefits_01_TC002
  @SilverBenefits2
  Scenario Outline: GVPCA_SilverBenefits_01_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Silver tier card is displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    Then navigate to cart page and click on checkout and navigate to delivary page

    Examples: 
      | UN                      | pwd      | flavor       |
      | sahar.nasrallah@bat.com | TEST1234 | Passionfruit |

  #------------------------------------------------------------------------------------------------
  #Description - Verify the goVype.ca user who achieved Silver Vype Plus status, is shown free shipping on checkout.
  #Developed By - Bhavitha
  #Date - October 22,2021
  #Test Case - GVPCA_SilverBenefits_02_TC001
  @SilverBenefits3
  Scenario Outline: GVPCA_SilverBenefits_02_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Silver tier card is displayed
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    Then navigate to cart page and click on checkout and navigate to delivary page
    And Verify Whether Shipping Is Free

    Examples: 
      | UN                    | pwd      | flavor       |
      | lindsay.davis@bat.com | TEST1234 | Passionfruit |

  #------------------------------------------------------------------------------------------------
  #Description - Verify the following goVype.ca user who achieved Silver Vype Plus status, is shown 15% discount on checkout.
  #Developed By - Bhavitha
  #Date - October 22,2021
  #Test Case - GVPCA_SilverBenefits_03_TC001
  @SilverBenefits4
  Scenario Outline: GVPCA_SilverBenefits_03_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify Silver tier card is displayed
    And Verify Green tick is displayed in front of birthday gift

    Examples: 
      | UN                    | pwd      |
      | lindsay.davis@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------
  #Description - Verify 'Registered users' status can be reviewed at the Rewards page and Rewards page can be accessed via My Account link on the main page or vype+ page or, via click on Find out your status from the vype+ page.
  #Developed By - Bhavitha
  #Date - October 22,2021
  #Test Case - GVPCA_StatusOfBenefits_01_TC001
  @StatusOfBenefits1
  Scenario Outline: GVPCA_StatusOfBenefits_01_TC001
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify statues
    When Hower on Save and Click on Vuse+ Rewards under Programs
    Then Validate Whether Vuse + Page Is Displayed
    When Click on find your status button
    Then Verify Reward page is displayed with relevent content

    Examples: 
      | UN                      | pwd      |
      | sahar.nasrallah@bat.com | TEST1234 |

  #------------------------------------------------------------------------------------------------
  #Description - Verify 'Rewards' page shows information on the account and rewards status.'Lifetime spend' status shown, User can examine current status in the 'Your status progress' bar, User can review orders history on the 'Orders' page, User can review following details on the Orders page:Order No, Date Order Completed, Total $ amount paid for the order, number and type of products purchased, User can re-order same product, User can review subscriptions on the 'Subscriptions'page, User can review profile information on the 'Profile'page.
  #Developed By - Bhavitha
  #Date - October 22,2021
  #Test Case - GVPCA_StatusOfBenefits_01_TC002
  @StatusOfBenefits2 @FooterSectionSuite
  Scenario Outline: GVPCA_StatusOfBenefits_01_TC002
    Given User enters email "<UN>" and password "<pwd>"
    When Click Rewards Page Is
    Then Verify statues
    When Hower on Save and Click on Vuse+ Rewards under Programs
    Then Validate Whether Vuse + Page Is Displayed
    When Click on find your status button
    Then Verify Reward page is displayed with relevent content
    Then Verify the Content is dispalyed on Rewards Section
    When Click on orders
    Then Verify order Page Content
    And Click on profile and enter details and verify unsubscribe text

    Examples: 
      | UN                    | pwd      |
      | annil.ramroop@bat.com | TEST1234 |
