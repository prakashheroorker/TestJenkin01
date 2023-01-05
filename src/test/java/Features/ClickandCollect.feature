Feature: Click and collect Feature

  Background: 
    Given User is on pre-login page

  #Test Case - GVPCA_ClickandCollect_E2E_Collected_Flow1
  #Description - The purpose of this Test Case is to select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 17-48 lines by - Akhila
  #Date -Dec 16,2022
  @clickandcollect01
  Scenario Outline: GVPCA_ClickandCollect_E2E_Collected_Flow1
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
    Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    Then Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations
    When Click on arrow button
    Then Verify Order Number,Customer Name ,Products Quantity "<quantity>"
    When Click on accept order to change the status to accepted
    And Click on close button and verify status changed to ready to pick and verify time remaining
    And Click on arrow button
    And Click on Ready to pickup and verify status as Ready to pickup
    And Click on arrow button
    And Click on Mark as Collected and verify status as Collected
    And Click on close
    Then Verify order no is not displayed under under pending tab
    When Click on collected tab
    Then Verify Order No ,Status and Customer Name
    When Click on Profile icon and then click on logout

    Examples: 
      | UN                           | pwd      | flavor  | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla |        1 | M5V 2A4    | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |

  #Test Case - GVPCA_ClickandCollect_E2E_Reject_Flow1
  #Description - The purpose of this Test Case is to select click and collect delivery option and place order in vuse website ,and reject the order from C&C retailer app
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 67-92 lines by - Akhila
  #Date -Dec 16,2022
  @clickandcollect02
  Scenario Outline: GVPCA_ClickandCollect_E2E_Reject_Flow1
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
    Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    Then Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations
    And Click on arrow button
    Then Verify Order Number,Customer Name ,Products Quantity "<quantity>"
    And Click on Reject button
    Then Verify Rejection confirmation popup is displayed and text box asking for a reason
    When Click on submit button without entering reason and verify error message is displayed
    And Enter Reason "<reason>" and click on submit button and verify rejected text
    And Click on close
    Then Verify order no is not displayed under under pending tab
    And Click on Rejected tab
    Then Verify Order No ,Status and Customer Name
    When Click on Profile icon and then click on logout

    Examples: 
      | UN              | pwd | flavor   | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     | reason       |
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla |        1 | M5V 2A4    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast | Out of stock |

  
  #Test Case - GVPCA_ClickandCollect_E2E_Reorder_Flow
  #Description - The purpose of this Test Case is to when user select click and collect delivery option and place through reorder in vuse website ,and change order status to collected in C&C retailer app
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 114-155 lines by - Akhila
  #Date -Dec 20,2022
  @clickandcollect03 
  Scenario Outline: GVPCA_ClickandCollect_E2E_Reorder_Flow
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
    Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When Hover on profile and click on My Orders
    And Click on Reorder button of above placed order to redirect to cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
    Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    Then Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations
    When Click on arrow button
   Then Verify Order Number,Customer Name ,Products Quantity "<quantity>"
    When Click on accept order to change the status to accepted
    And Click on close button and verify status changed to ready to pick and verify time remaining
    And Click on arrow button
    And Click on Ready to pickup and verify status as Ready to pickup
    And Click on arrow button
    And Click on Mark as Collected and verify status as Collected
    And Click on close
    Then Verify order no is not displayed under under pending tab
    When Click on collected tab
    Then Verify Order No ,Status and Customer Name
    When Click on Profile icon and then click on logout

    Examples: 
       | UN                           | pwd      | flavor  | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla |        1 | M5V 2A4    | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |

	#Test Case - GVPCA_ClickandCollect_E2E_Cancel
  #Description - The purpose of this Test Case is to select click and collect delivery option and place order in vuse website ,and cancel the order from vuse site
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 175-197 lines by - Akhila
  #Date -Dec 20,2022
  @clickandcollect08
  Scenario Outline: GVPCA_ClickandCollect_E2E_Cancel
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
    Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When Navigate to orders page and cancel the order that is placed
    And User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    Then Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations
    And Verify order no is not displayed under under pending tab
    When Click on Rejected tab
    Then Verify Order No ,Status and Customer Name and cancelled status
    When Click on Profile icon and then click on logout

    Examples:  
      | UN                           | pwd | flavor   | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     | reason       |
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla |        1 | M5V 2A4    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast | Out of stock |

  #Test Case - GVPCA_ClickandCollect_E2E_Collected_Flow2
  #Description - The purpose of this Test Case is to select click and collect delivery option and place a combination of flavours order in vuse website ,and change order status to collected in C&C retailer app#Developed By - Harsha Kumar
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 216-245 lines by - Akhila
  #Date -Dec 20,2022
  @clickandcollect10 
  Scenario Outline: GVPCA_ClickandCollect_E2E_Collected_Flow2
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Add any two LEP flavors "<flavors>" from epod vape pods page
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    And Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
   Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    Then Verify Order Number,Type,Customer,Status,Time Remaining,Status and Actions navigations
    And Click on arrow button
    Then Verify Order Number,Customer Name ,Products Quantity "<quantity>"
    When Click on accept order to change the status to accepted
    And Click on close button and verify status changed to ready to pick and verify time remaining
    And Click on arrow button
    And Click on Ready to pickup and verify status as Ready to pickup
    And Click on arrow button
    And Click on Mark as Collected and verify status as Collected
    When Click on close
    Then Verify order no is not displayed under under pending tab
    And Click on collected tab
    Then Verify Order No ,Status and Customer Name
		When Click on Profile icon and then click on logout

      Examples: 
      | UN                           | pwd      | flavors  | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla,Berry| M5V 2A4    | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |

  #Test Case - GVPCA_ClickandCollect_E2E_Collected_Flow3
  #Description - The purpose of this Test Case is to select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app from pending tab itself
  #PreCondition - User sould have a valid postal code of the Retail store where pick up is available
  #Updated 264-286 lines by - Akhila
  #Date -Dec 20,2022
  @clickandcollect11
  Scenario Outline: GVPCA_ClickandCollect_E2E_Collected_Flow3
    When User click on login/register button
    Then Verify the login modal is displayed with relevent content
    When User enters email "<UN>" and Password "<pwd>" and click on login
    Then Verify home page is displayed
    When User hovers on shop and click on pods
    Then Verify navigates to ePod Vape Pods page
    When Click on add button for any "<flavor>" with required quantity "<quantity>"
    Then Verify pod is added to the cart
    When User navigates to Cart page
    And Click on Checkout button
    Then Verify shipping page and One time Purchase details are dispalyed
    When Click on click and Collect option
    Then Verify postal code text box is displayed
    When Enter postal code "<postalcode>" and click on search button
   Then Verify retail stores addresses and distances
    When Click on Go TO Delivery button
    Then Verify Delivery and One time Purchase details are dispalyed
    When User enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    Then Verify order confirmation page for click and collect
    When User launches click and collect url "<url>" in new tab
    And Enters username "<un>" and password "<pass>" and click on login in C&C retailer app
    And Click on orders and verify orders screen
    And Click on Accept order and verify status updated to Accepted
    And Click on Ready For Pickup and verify status updated to Ready For Pickup
    And Click on Mark as Collected
    Then Verify order no is not displayed under under pending tab
    When Click on collected tab
    Then Verify Order No ,Status and Customer Name
    When Click on Profile icon and then click on logout

    Examples: 
      | UN                           | pwd      | flavor  | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |store|
      | akhila.chakilam+05@gmail.com | TEST1234 | Vanilla |        1 | M5V 2A4    | 5555 5555 5555 4444 |               0923 |         123 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |CONSIGNMENT - VUSE TORONTO ? CLICK & COLLECT|

  #Test Case - GVPCA_ClickandCollect_E2E_starter_bundle_02_TC001
  #Description - The purpose of this Test Case is to add starter bundle and select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #Developed By - Harsha Kumar
  #Date - Feb 22,2022
  #Pre-Requisite - Use ontario province user
  #@clickandcollect04 @ReRun
  #Scenario Outline: GVPCA_ClickandCollect_E2E_starter_bundle_02_TC001
  #Given user login with valid email address "<username>" and password "<password>"
  #When Hower on save and click on Starter Bundle and start customising
  #Then select device with "<device colour>" and pods with "<flavor>" with "<Nicotine Strength>"
  #And verify discount and promocode applied
  #When Click on checkout and verify checkoutpage
  #And click on click and Collect option
  #Then verify postal code text box is displayed
  #And enter postal code "<postalcode>" and click on search button
  #Then verify retail stores addresses and distances
  #And click on go to delivery and verify delivery option
  #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
  #Then verify order confirmation page for click and collect
  #When user launches click and collect url "<url>" in new tab
  #And enters username "<un>" and password "<pass>" and click on login in C&C retailer app
  #And click on orders and verify orders screen
  #Then verify Order Number,Name of Customer,Status,Timesince Order,Time Remaining and Status
  #And click on arrow button
  #Then verify Order Number,Customer Name ,Products "<device colour>" and Flavor "<flavor>"
  #And click on accept order
  #And click on close button and verify status changed to ready to pick and verify time remaining
  #And click on arrow button
  #And click on Ready to pickup and verify status as Ready to pickup
  #And click on arrow button
  #And click on Mark as Collected and verify status as Collected
  #When click on close
  #Then verify order no is not displayed under under pending tab
  #And click on collected tab
  #Then verify Order No ,Status and Customer Name
  #
  #Examples:
  #| username               | password | device colour | flavor | Nicotine Strength | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
  #| louisa.spencer@bat.com | TEST1234 | Blue          | Clear  |               1.6 | M9W 0A1    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |
  # Charing case is not available for click & collect
  #Test Case - GVPCA_ClickandCollect_E2E_Accessory_03_TC001
  #Description - The purpose of this Test Case is to add Accessory and select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #Developed By - Harsha Kumar
  #Date - Feb 22,2022
  #Pre-Requisite - Use ontario province user
  #@clickandcollect05 @ReRun
  #Scenario Outline: GVPCA_ClickandCollect_E2E_Accessory_03_TC001
  #Given user login with valid email address "<username>" and password "<password>"
  #Then user navigates to epod accessories page
  #When select Accessory with type "<accessory>" and colour with "<colour>" and "<quantity>"
  #And navigate to Cart and verify the items in Cart
  #When Click on checkout and verify checkoutpage
  #And click on click and Collect option
  #Then verify postal code text box is displayed
  #And enter postal code "<postalcode>" and click on search button
  #Then verify retail stores addresses and distances
  #And click on go to delivery and verify delivery option
  #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
  #Then verify order confirmation page for click and collect
  #When user launches click and collect url "<url>" in new tab
  #And enters username "<un>" and password "<pass>" and click on login in C&C retailer app
  #And click on orders and verify orders screen
  #Then verify Order Number,Name of Customer,Status,Timesince Order,Time Remaining and Status
  #And click on arrow button
  #Then verify Order Number,Customer Name ,Products "<accessory>" and Quantity "<quantity>"
  #
  #And click on accept order
  #And click on close button and verify status changed to ready to pick and verify time remaining
  #And click on arrow button
  #And click on Ready to pickup and verify status as Ready to pickup
  #And click on arrow button
  #And click on Mark as Collected and verify status as Collected
  #When click on close
  #Then verify order no is not displayed under under pending tab
  #And click on collected tab
  #Then verify Order No ,Status and Customer Name
  #Examples:
  #| username               | password | accessory     | colour    | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
  #| louisa.spencer@bat.com | TEST1234 | Charging Case | Rose Gold |        2 | M9W 0A1    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |
  #Test Case - GVPCA_ClickandCollect_E2E_Device_04_TC001
  #Description - The purpose of this Test Case is to add device core collection or limited collection and select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #Developed By - Harsha Kumar
  #Date - Feb 22,2022
  #Pre-Requisite - Use ontario province user
  #@clickandcollect06 @ReRun
  #Scenario Outline: GVPCA_ClickandCollect_E2E_Device_04_TC001
  #Given user login with valid email address "<username>" and password "<password>"
  #When user navigates to ePod Device
  #And user selects device "<devicecolour>" from either Core Collections or elements and add to cart
  #And navigate to Cart and verify the items in Cart
  #When Click on checkout and verify checkoutpage
  #And click on click and Collect option
  #Then verify postal code text box is displayed
  #And enter postal code "<postalcode>" and click on search button
  #Then verify retail stores addresses and distances
  #And click on go to delivery and verify delivery option
  #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
  #Then verify order confirmation page for click and collect
  #When user launches click and collect url "<url>" in new tab
  #And enters username "<un>" and password "<pass>" and click on login in C&C retailer app
  #And click on orders and verify orders screen
  #Then verify Order Number,Name of Customer,Status,Timesince Order,Time Remaining and Status
  #And click on arrow button
  #Then verify Order Number,Customer Name ,Products
  #And click on accept order
  #And click on close button and verify status changed to ready to pick and verify time remaining
  #And click on arrow button
  #And click on Ready to pickup and verify status as Ready to pickup
  #And click on arrow button
  #And click on Mark as Collected and verify status as Collected
  #When click on close
  #Then verify order no is not displayed under under pending tab
  #And click on collected tab
  #Then verify Order No ,Status and Customer Name
  #Examples:
  #| username               | password | devicecolour | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
  #| louisa.spencer@bat.com | TEST1234 | Aqua         | M9W 0A1    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |
  #
  #Test Case - GVPCA_ClickandCollect_E2E_Skin_05_TC001
  #Description - The purpose of this Test Case is to add Skin and select click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #Developed By - Harsha Kumar
  #Date - Feb 22,2022
  #Pre-Requisite - Use ontario province user
  #@clickandcollect07 @ReRun
  #Scenario Outline: GVPCA_ClickandCollect_E2E_Skin_05_TC001
  #Given user login with valid email address "<username>" and password "<password>"
  #When Hower on shop and click on Shop ePodtwo skins
  #Then Scroll to our core collections and click on Shopnow
  #When click on Buynow in skins page and select desired "<Skin>"
  #And select desired quantity "<quantity>" and click on add to cart
  #And navigate to Cart and verify the items in Cart
  #When Click on checkout and verify checkoutpage
  #And click on click and Collect option
  #Then verify postal code text box is displayed
  #And enter postal code "<postalcode>" and click on search button
  #Then verify retail stores addresses and distances
  #And click on go to delivery and verify delivery option
  #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
  #Then verify order confirmation page for click and collect
  #When user launches click and collect url "<url>" in new tab
  #And enters username "<un>" and password "<pass>" and click on login in C&C retailer app
  #And click on orders and verify orders screen
  #Then verify Order Number,Name of Customer,Status,Timesince Order,Time Remaining and Status
  #And click on arrow button
  #Then verify Order Number,Customer Name ,Products "<Skin>" and Quantity "<quantity>"
  #And click on accept order
  #And click on close button and verify status changed to ready to pick and verify time remaining
  #And click on arrow button
  #And click on Ready to pickup and verify status as Ready to pickup
  #And click on arrow button
  #And click on Mark as Collected and verify status as Collected
  #When click on close
  #Then verify order no is not displayed under under pending tab
  #And click on collected tab
  #Then verify Order No ,Status and Customer Name
  #
  #Examples:
  #| username               | password | Skin  | quantity | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
  #| louisa.spencer@bat.com | TEST1234 | Vasco |        2 | M9W 0A1    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |
  #
  
  #Test Case - GVPCA_ClickandCollect_E2E_Engraving_01_TC001
  #Description - The purpose of this Test Case is to select engraving device and use click and collect delivery option and place order in vuse website ,and change order status to collected in C&C retailer app
  #Developed By - Harsha Kumar
  #Date - Feb 17,2022
  #Pre-Requisite - Use ontario province user
  #@clickandcollect09  @reRun
  #Scenario Outline: GVPCA_ClickandCollect_E2E_Engraving_01_TC001
  #Given user login with valid email address "<username>" and password "<password>"
  #When user navigates to ePod Device
  #When user engrave the device by selecting DeviceColour "<DeviceColour>", PatternName "<Patternname>",TextDirection"<TextDirection>",FontStyle "<FontStyle>",Text"<Text>" from engraving
  #When Click on checkout and verify checkoutpage
  #And click on click and Collect option
  #Then verify postal code text box is displayed
  #And enter postal code "<postalcode>" and click on search button
  #Then verify retail stores addresses and distances
  #And click on go to delivery and verify delivery option
  #Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
  #Then verify order confirmation page for click and collect
  #When user launches click and collect url "<url>" in new tab
  #And enters username "<un>" and password "<pass>" and click on login in C&C retailer app
  #And click on orders and verify orders screen
  #Then verify Order Number,Name of Customer,Status,Timesince Order,Time Remaining and Status
  #And click on arrow button
  #Then verify Order Number,Customer Name ,Products
  #And click on accept order
  #And click on close button and verify status changed to ready to pick and verify time remaining
  #And click on arrow button
  #And click on Ready to pickup and verify status as Ready to pickup
  #And click on arrow button
  #And click on Mark as Collected and verify status as Collected
  #When click on close
  #Then verify order no is not displayed under under pending tab
  #And click on collected tab
  #Then verify Order No ,Status and Customer Name
  #Examples:
  #| username               | password | DeviceColour    | Patternname | TextDirection | FontStyle   | Text   | postalcode | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName | url                                    | un                       | pass     |
  #| louisa.spencer@bat.com | TEST1234 | Black | Lilac       | Vertical      | Honeyscript | louisa | M9W 0A1    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER | https://next-staging.netlify.app/login | demo+53965021@volume7.io | holdfast |
  #
  