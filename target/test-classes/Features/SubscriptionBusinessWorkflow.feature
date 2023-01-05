Feature: Subscription Business Workflow

  Background: 
    Given User is on pre-login page

  #Test Case - GVCA_Subscription_BusinessWorkflows_01_TC001
  #Description - Verify whether the VUSE user should be able to complete the subscription transaction for the ePods Pods flavours using the new cartridges page
  #Developed By - Vinod Markandan
  #Date - November 16,2021
  @GoldenRegressionSuite @GVCA_Subscription_BusinessWorkflows_01_TC001
  Scenario Outline: GVCA_Subscription_BusinessWorkflows_01_TC001
    Given user login with valid email address "<username>" and password "<password>"
    When Hower on save and click on subscribe and save under offers
    Then verify offer on subscribe and save
    When User navigates to Subscribe ePods
    And User subscribes for flavour "<flavor>" with required quantity "<quantity>" and add to the cart from Subscription page
    And User navigates to Cart page
    And User navigates to Check out page and Submits the Order with card details "<UserCardNumber>", "<UserCardExpiryDate>", "<UserCardCVV>", "<UserCardFullName>"
    Then Order should be Submitted and Subscription should be added
    Then verify Active subscription and cancel the subscription
    Then verify existing payment method and delete the payment method

    Examples: 
      | username               | password | flavor| quantity | UserCardNumber      | UserCardExpiryDate | UserCardCVV | UserCardFullName |
      | jack.daniel@bat.com | TEST1234 | Clear |        4 | 5555 5555 5555 4444 |               1024 |         190 | CANADA VYPE USER |

      
      
      
      