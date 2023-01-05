@QAbatch01
Feature: Subscription ePod Business Workflow

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_SubscriptionsePod_BusinessWorkflows_01_TC001
  #Description - ePod Subscription end to end workflow for vuse+ members
  #Developed By - Vinod Markandan
  #Date - October 26,2021
  @GoldenRegressionSuite @GVCA_SubscriptionsePod_BusinessWorkflows_01_TC001
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC001
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page and verify Subscription discliamer message
    And User adds required flavor "<flavor_Additional>" and quantity "<quantity_Additional>" by continue shopping and add to the cart
    And User navigates from Cart page and verify Subscription Start Date in Checkout
    And User navigates to ePod page and adds a product "<flavor_onetime>" for one time purchase
    And User navigates to Cart page and verify Cart Summary page with Subscription and one time purchase
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be submitted and Subscription should be created newly
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username           | password | flavor      | quantity | quantity_Additional |flavor_Additional | flavor_onetime | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jack.daniel@bat.com | TEST1234 | Lemon Berry |        3 |                   2 |Peach            | Clear       | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionsePod_BusinessWorkflows_01_TC002
  #Description - ePod Subscription end to end workflow for vuse+ Platinum members
  #Developed By - Vinod Markandan
  #Date - September 30,2021
  @GoldenRegressionSuite @GVCA_SubscriptionsePod_BusinessWorkflows_01_TC002
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC002
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page and verify Subscription discliamer message
    And User adds required flavor "<flavor_Additional>" and quantity "<quantity_Additional>" by continue shopping and add to the cart
    And User navigates from Cart page and verify Subscription Start Date in Checkout
    And User navigates to ePod page and adds a product "<flavor_onetime>" for one time purchase
    And User navigates to Cart page and verify Cart Summary page with Subscription and one time purchase
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be submitted and Subscription should be created newly
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor      | quantity | quantity_Additional | flavor_Additional | flavor_onetime | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jack.daniel@bat.com | TEST1234 | Lemon Berry |        3 |                   2 | Passionfruit      | Clear        | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionsePod_BusinessWorkflows_01_TC003
  #Description - ePod Subscription end to end workflow for Nonvype+ user
  #Developed By - Vinod Markandan
  #Date - October 26, 2021
  @GoldenRegressionSuite @GVCA_SubscriptionsePod_BusinessWorkflows_01_TC003
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC003
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page and verify Subscription discliamer message
    And User adds required flavor "<flavor_Additional>" and quantity "<quantity_Additional>" by continue shopping and add to the cart
    And User navigates from Cart page and verify Subscription Start Date in Checkout
    And User navigates to ePod page and adds a product "<flavor_onetime>" for one time purchase
    And User navigates to Cart page and verify Cart Summary page with Subscription and one time purchase
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be submitted and Subscription should be created newly
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor   | quantity | quantity_Additional | flavor_Additional | flavor_onetime | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jack.daniel@bat.com| TEST1234 | Lemon Berry |        3 |                   2 | Blood Orange      | Clear   | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_SubscriptionsePod_BusinessWorkflows_01_TC004
  #Description - ePod Subscription end to end workflow for Nonvype+/silver/gold user
  #Developed By - Vinod Markandan
  #Date - October 5,2021
  @GVCA_SubscriptionsePod_BusinessWorkflows_01_TC004
  Scenario Outline: GVCA_SubscriptionsePod_BusinessWorkflows_01_TC004
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page
    Then Verify various Subscription Discounts offered when quantity is increased
    When User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
  And verify Active subscription and cancel the subscription
    And verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor   | quantity | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Clear |        5 | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_new_subscription_tocart_for_existing_subscription
  #Description - To validate the scenario when a user is already having a subscription and tries to add a new subscription to cart
  #Developed By - Vinod Markandan
  #Date - September 22,2021
  @AddSubscriptionwithExistingSub
  Scenario Outline: VUSE_Subscription_Add_new_subscription_tocart_for_existing_subscription
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted and Subscription should be added
    When User clicks on Logout link
    Then User should be logged out
    When User logs in with same email address "<username>" and password "<password>"
    And User confirms if user has active subscription
    And User navigates to ePod pods page
    And User selects additional product "<flavor_Additional>" for subscription and add to the cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account button
    And Draft Subscription Order should be submitted upon clicking on Submit Update button
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor | quantity | flavor_Additional | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Clear  |        5 | Mango             | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_subscription_Productin_PreLoginPage
  #Description - The purpose of this test case is To validate the scenario where user is already having an active subscription and tries to add another product to subscription in Pre Login Page.
  #Developed By - Vinod Markandan
  #Date - September 23,2021
  @AddSubscriptionPrelogin
  Scenario Outline: VUSE_Subscription_Add_subscription_Productin_PreLoginPage
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted and Subscription should be added
    When User clicks on Logout link
    Then User should be logged out
    When User closes the login modal
    And User navigates to ePod pods page
    And User subscribes for flavour "<flavor_Additional>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page
    Then User is prompted to login to the application
    When user login with same email address "<username>" and password "<password>"
    And Draft Subscription Order should be displayed upon clicking on Go to Account button
    And Draft Subscription Order should be submitted upon clicking on Submit Update button
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor | quantity | flavor_Additional | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      |jack.daniel@bat.com | TEST1234 | Lemon Berry |        5 | Clear       | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - VUSE_Subscription_Add_new_subscription_and_One_Time_Purchase_to_cart_for_existing_subscription_user_E2EFlow
  #Description - The purpose of this test case is To validate the scenario when a user is already having a subscription and tries to add a new subscription & One Time Purchase to cart
  #Developed By - Vinod Markandan
  #Date - September 24,2021
  @AddSubscriptionandOneTimePurchase
  Scenario Outline: VUSE_Subscription_Add_new_subscription_and_One_Time_Purchase_to_cart_for_existing_subscription_user_E2EFlow
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart
    And User navigates to Cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted and Subscription should be added
    When User clicks on Logout link
    Then User should be logged out
    When User logs in with same email address "<username>" and password "<password>"
    And User confirms if user has active subscription
    And User navigates to ePod pods page
    And User adds product "<flavor_Onetime>" to cart for one time purchase
    And User navigates to ePod pods page
    And User selects additional product "<flavor_Sub>" for subscription and add to the cart
    And Draft Subscription Order should be displayed upon clicking on Go to Account button
    And Draft Subscription Order should be submitted upon clicking on Submit Update button
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor | quantity | flavor_Sub | flavor_Onetime | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com| TEST1234 | Lemon Berry  |        5 | Mango      | Clear    | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_ePod_Pods_SubscriptionsPurchase_BusinessWorkflows_TC001
  #Description - Verify the VUSE user must be able to submit and accomplish ePod pods Subscription order purchase from the epod pods page.
  #Developed By - Vinod Markandan
  #Date - November 17,2021
  @GoldenRegressionSuite @GVCA_ePod_Pods_SubscriptionsPurchase_BusinessWorkflows_TC001
  Scenario Outline: GVCA_ePod_Pods_SubscriptionsPurchase_BusinessWorkflows_TC001
    Given user login with valid email address "<username>" and password "<password>"
    When User navigates to ePod pods page
    And User selects required product "<flavor>" with required quantity "<quantity>" for subscription and add to the cart
    And User navigates to Cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    #Then Order should be Submitted and Subscription should be added
   # Then verify Active subscription and cancel the subscription
    #Then verify existing payment method and delete the payment method

    Examples: 
      | username                | password | flavor         | quantity | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Mango |       10 | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |
