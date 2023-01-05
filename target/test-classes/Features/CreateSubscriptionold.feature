@QAbatch01
Feature: To verify Create a subscription from Pods

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_CreateSubscription_01_TC001
  #Description - The Purpose of this test case is to verify Create a subscription from pods.
  #Developed By - Harsha Kumar
  #Date - September 15,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_01_TC001 in cancelsubscription.feature
  @Create01
  Scenario Outline: GVCA_CreateSubscription_01_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    #Then verify subscribe and save option
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page
    When user Howers on profile icon and navigates to subscription in MyAccount page
    And verify subscription confirmation page and verify subscription details

    Examples: 
      | UN                      | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | matthew.pickford@bat.com | TEST1234 | Mango  | 5555555555554444 |               0723 |         123 | mark jacob       |

  #--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  #Test Case - GVCA_CreateSubscription_02_TC001
  #Description - The Purpose of this test case is to verify Create a subscription from pods.
  #Developed By - Harsha Kumar
  #Date - September 15,2021
  ##* if you want to reexecute kindly execute GVCA_CancelSubscription_02_TC001 in cancelsubscription.feature
  @Create02
  Scenario Outline: GVCA_CreateSubscription_02_TC001
    Given user login with valid email address "<UN>" and password "<pwd>"
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then click on subscribe and save and add quantity and click on add to cart
    When Hower on Shop and click on ePodtwo pods
    Then choose Flavour "<flavor>" in Pod Pods Page and verify flavortext
    Then Add quantity for onetime purchase and click on add to cart
    And navigate to cart page and click on checkout and navigate to delivary page
    Then user enters UserCardNumber "<UserCardNumber>", UserCardExpiryDate "<UserCardExpiryDate>", UserCardCVV "<UserCardCVV>",UserCardFullName "<UserCardFullName>" to submit order
    And verify order confirmation page
    When user Howers on profile icon and navigates to subscription in MyAccount page
    And verify subscription confirmation page and verify subscription details

    Examples: 
      | UN                   | pwd      | flavor | UserCardNumber   | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | padmini.persaud@bat.com | TEST1234 | Clear  | 5555555555554444 |               0723 |         123 | elliot corkery   |
