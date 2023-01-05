$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CancelOrderMobile.feature");
formatter.feature({
  "line": 2,
  "name": "Cancelling the Order",
  "description": "",
  "id": "cancelling-the-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@vuse"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 8,
      "value": "#Test Case -  VYPE_4392_CancelOrder_TC001"
    },
    {
      "line": 9,
      "value": "#Description -  The purpose of this test case is to verify the points in the history are deducted after cancelling the Order"
    },
    {
      "line": 10,
      "value": "#Developed By - Harsha Kumar"
    },
    {
      "line": 11,
      "value": "#Date - 1st July,2022"
    }
  ],
  "line": 13,
  "name": "VYPE_4392_CancelOrder_TC001",
  "description": "",
  "id": "cancelling-the-order;vype-4392-cancelorder-tc001",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@cancelOrder"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User enters valid email address \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\" and clicks on login in Mobile",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on hamberger menu and clicks on My Rewards",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify the status of the tier for the user",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User clicks on hamberger menu and clicks on Shop",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on Device, Pods and Accessories and clicks on pods",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verifies pods page and selects flavor \"\u003cflavor\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on one time purchase add quantity \"\u003ccount\u003e\" and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Hower on cart icon and click on view cart",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on checkout and verify checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on go to delivary and verify shipping options",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on go to billing and enter card details UserCardNumber \"\u003cUserCardNumber\u003e\", UserCardExpiryDate \"\u003cUserCardExpiryDate\u003e\", UserCardCVV \"\u003cUserCardCVV\u003e\",UserCardFullName \"\u003cUserCardFullName\u003e\" to submit order",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "verify order confirmation and order number",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify blue banner in Order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user clicks on hamberger menu and clicks on My orders and cancel the order",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click on hamberger menu and clicks on My Rewards",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Verify points history and current points in Rewards page",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "cancelling-the-order;vype-4392-cancelorder-tc001;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "flavor",
        "count",
        "UserCardNumber",
        "UserCardExpiryDate",
        "UserCardCVV",
        "UserCardFullName"
      ],
      "line": 32,
      "id": "cancelling-the-order;vype-4392-cancelorder-tc001;;1"
    },
    {
      "cells": [
        "bhavitha.nune@bat.com",
        "TEST1234",
        "Mango",
        "3",
        "4111111111111111",
        "1024",
        "190",
        "charlie"
      ],
      "line": 33,
      "id": "cancelling-the-order;vype-4392-cancelorder-tc001;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 23978262900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on pre-login page in mobile",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on hamberger menu and click on login or register",
  "keyword": "And "
});
formatter.match({
  "location": "Common.user_is_on_pre_login_page_in_mobile()"
});
formatter.result({
  "duration": 39635079200,
  "status": "passed"
});
formatter.match({
  "location": "Common.user_clicks_on_hamberger_menu_and_click_on_login_or_register()"
});
formatter.result({
  "duration": 9933045400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "VYPE_4392_CancelOrder_TC001",
  "description": "",
  "id": "cancelling-the-order;vype-4392-cancelorder-tc001;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@vuse"
    },
    {
      "line": 12,
      "name": "@cancelOrder"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User enters valid email address \"bhavitha.nune@bat.com\" and password \"TEST1234\" and clicks on login in Mobile",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on hamberger menu and clicks on My Rewards",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify the status of the tier for the user",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User clicks on hamberger menu and clicks on Shop",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on Device, Pods and Accessories and clicks on pods",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user verifies pods page and selects flavor \"Mango\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click on one time purchase add quantity \"3\" and add to cart",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Hower on cart icon and click on view cart",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on checkout and verify checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on go to delivary and verify shipping options",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "click on go to billing and enter card details UserCardNumber \"4111111111111111\", UserCardExpiryDate \"1024\", UserCardCVV \"190\",UserCardFullName \"charlie\" to submit order",
  "matchedColumns": [
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "verify order confirmation and order number",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify blue banner in Order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user clicks on hamberger menu and clicks on My orders and cancel the order",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click on hamberger menu and clicks on My Rewards",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Verify points history and current points in Rewards page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "bhavitha.nune@bat.com",
      "offset": 33
    },
    {
      "val": "TEST1234",
      "offset": 70
    }
  ],
  "location": "Common.user_enters_valid_email_address_and_password_and_clicks_on_login_in_Mobile(String,String)"
});
formatter.result({
  "duration": 9371372300,
  "status": "passed"
});
formatter.match({
  "location": "Benefits.user_click_on_hamberger_menu_and_clicks_on_My_Rewards()"
});
formatter.result({
  "duration": 10053530700,
  "status": "passed"
});
formatter.match({
  "location": "CancelOrderMobile.verify_the_status_of_the_tier_for_the_user()"
});
formatter.result({
  "duration": 8905502400,
  "status": "passed"
});
formatter.match({
  "location": "Common.user_clicks_on_hamberger_menu_and_clicks_on_Shop()"
});
formatter.result({
  "duration": 11852607400,
  "status": "passed"
});
formatter.match({
  "location": "Common.user_clicks_on_Device_Pods_and_Accessories_and_clicks_on_pods()"
});
formatter.result({
  "duration": 13720965900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mango",
      "offset": 44
    }
  ],
  "location": "OneTimePurchase_BusinessWorkflows.user_verifies_pods_page_and_selects_flavor(String)"
});
formatter.result({
  "duration": 2491278200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 41
    }
  ],
  "location": "OneTimePurchase_BusinessWorkflows.click_on_one_time_purchase_add_quantity_and_add_to_cart(String)"
});
formatter.result({
  "duration": 19809922000,
  "status": "passed"
});
formatter.match({
  "location": "Common.hower_on_cart_icon_and_click_on_view_cart()"
});
formatter.result({
  "duration": 23986365800,
  "status": "passed"
});
formatter.match({
  "location": "Delivarytype_Mobile.click_on_checkout_and_verify_checkout_page()"
});
formatter.result({
  "duration": 28065498200,
  "status": "passed"
});
formatter.match({
  "location": "OneTimePurchase_BusinessWorkflows.click_on_go_to_delivary_and_verify_shipping_options()"
});
formatter.result({
  "duration": 19314359800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4111111111111111",
      "offset": 62
    },
    {
      "val": "1024",
      "offset": 101
    },
    {
      "val": "190",
      "offset": 121
    },
    {
      "val": "charlie",
      "offset": 144
    }
  ],
  "location": "Delivarytype_Mobile.click_on_go_to_billing_and_enter_card_details_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName_to_submit_order(String,String,String,String)"
});
formatter.result({
  "duration": 64538993500,
  "status": "passed"
});
formatter.match({
  "location": "Common.verify_order_confirmation_and_order_number()"
});
formatter.result({
  "duration": 25606202100,
  "status": "passed"
});
formatter.match({
  "location": "CancelOrderMobile.verify_blue_banner_in_order_confirmation_page()"
});
formatter.result({
  "duration": 6501961300,
  "status": "passed"
});
formatter.match({
  "location": "profiletrigger.user_clicks_on_hamberger_menu_and_clicks_on_My_orders_and_cancel_the_order()"
});
formatter.result({
  "duration": 18230135400,
  "status": "passed"
});
formatter.match({
  "location": "Benefits.user_click_on_hamberger_menu_and_clicks_on_My_Rewards()"
});
formatter.result({
  "duration": 9411963700,
  "status": "passed"
});
formatter.match({
  "location": "CancelOrderMobile.verify_points_history_and_current_points()"
});
formatter.result({
  "duration": 10482715900,
  "status": "passed"
});
formatter.after({
  "duration": 16086535500,
  "status": "passed"
});
});