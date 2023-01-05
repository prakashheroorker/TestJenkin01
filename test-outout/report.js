$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/TaxBreakDown.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate Tax breakdown for all the Provinces",
  "description": "",
  "id": "calculate-tax-breakdown-for-all-the-provinces",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#Test Case: GVCA_Taxbreakdown_02_TC001"
    },
    {
      "line": 7,
      "value": "#Objective:To verify the Tax breakdown for all the Provinces(BC, AB, ON, PEI, SK, NB, MB, NFLD) and to verify the applied discount code"
    },
    {
      "line": 8,
      "value": "#Author: Divya Kumari"
    },
    {
      "line": 9,
      "value": "#Date: 17th Sep 21"
    }
  ],
  "line": 12,
  "name": "GVCA_Taxbreakdown_02_TC001",
  "description": "",
  "id": "calculate-tax-breakdown-for-all-the-provinces;gvca-taxbreakdown-02-tc001",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@GoldenRegressionSuite"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user login with valid email address \"\u003cUN\u003e\" and password \"\u003cpwd\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user navigates to account page to get the address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user navigates to epod pods page and select flavor as flavorcolor \"\u003cFlavourColour\u003e\" and flavorname \"\u003cFlavourText\u003e\" and add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "navigate to Cart and verify the items in Cart",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Calculate tax breakdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters UserCardNumber \"\u003cUserCardNumber\u003e\", UserCardExpiryDate \"\u003cUserCardExpiryDate\u003e\", UserCardCVV \"\u003cUserCardCVV\u003e\",UserCardFullName \"\u003cUserCardFullName\u003e\" to submit order",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify order confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "calculate-tax-breakdown-for-all-the-provinces;gvca-taxbreakdown-02-tc001;",
  "rows": [
    {
      "cells": [
        "UN",
        "pwd",
        "FlavourColour",
        "FlavourText",
        "UserCardNumber",
        "UserCardExpiryDate",
        "UserCardCVV",
        "UserCardFullName"
      ],
      "line": 22,
      "id": "calculate-tax-breakdown-for-all-the-provinces;gvca-taxbreakdown-02-tc001;;1"
    },
    {
      "cells": [
        "brandon.huynen@bat.com",
        "TEST1234",
        "Blood Orange",
        "Blood Orange",
        "4444333322221111",
        "1024",
        "190",
        "CANADA VYPE USER"
      ],
      "line": 23,
      "id": "calculate-tax-breakdown-for-all-the-provinces;gvca-taxbreakdown-02-tc001;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on pre-login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Common.user_is_on_pre_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "GVCA_Taxbreakdown_02_TC001",
  "description": "",
  "id": "calculate-tax-breakdown-for-all-the-provinces;gvca-taxbreakdown-02-tc001;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@GoldenRegressionSuite"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user login with valid email address \"brandon.huynen@bat.com\" and password \"TEST1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user navigates to account page to get the address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user navigates to epod pods page and select flavor as flavorcolor \"Blood Orange\" and flavorname \"Blood Orange\" and add to cart",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "navigate to Cart and verify the items in Cart",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Calculate tax breakdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters UserCardNumber \"4444333322221111\", UserCardExpiryDate \"1024\", UserCardCVV \"190\",UserCardFullName \"CANADA VYPE USER\" to submit order",
  "matchedColumns": [
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify order confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "brandon.huynen@bat.com",
      "offset": 37
    },
    {
      "val": "TEST1234",
      "offset": 75
    }
  ],
  "location": "Common.user_login_with_valid_email_address_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaxBreakDown.user_navigates_to_account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Blood Orange",
      "offset": 67
    },
    {
      "val": "Blood Orange",
      "offset": 97
    }
  ],
  "location": "TaxBreakDown.user_navigates_to_epod_pods_page_and_select_flavor_and_add_to_cart(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Common.navigate_to_Cart_and_verify_the_items_in_Cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaxBreakDown.calculate_tax_breakdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4444333322221111",
      "offset": 28
    },
    {
      "val": "1024",
      "offset": 67
    },
    {
      "val": "190",
      "offset": 87
    },
    {
      "val": "CANADA VYPE USER",
      "offset": 110
    }
  ],
  "location": "TaxBreakDown.user_enters_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName_to_submit_order(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Common.verify_order_confirmation_page()"
});
formatter.result({
  "status": "skipped"
});
});