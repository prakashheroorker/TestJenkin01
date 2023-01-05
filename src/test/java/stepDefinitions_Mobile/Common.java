package stepDefinitions_Mobile;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;


import goVype_Properties_mobile.*;

public class Common extends BaseClass {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@Given("^User is on pre-login page in mobile$")
	public void user_is_on_pre_login_page_in_mobile() throws Throwable {

		Thread.sleep(3000);
		function.launchApplication("https:vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
		Thread.sleep(3000);
		//rai.ClickUsingOCR("Accept All Cookies");
		//rai.clickbutton(Vype_CommonXpath.AcceptAllCookies, "Cookies");
	}

	@And("^user clicks on hamberger menu and click on login or register$")
	public void user_clicks_on_hamberger_menu_and_click_on_login_or_register() throws Throwable {


		// Clicking on Menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

		// rai.VerifyTextUsingOCR("Login/Register","Login/Register");
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkLoginOrRgstr, "Login/Register");


		// Clicking on Login/Register link
		rai.clickbutton(Vype_CommonXpath.lnkLoginOrRgstr, "Login button");
		// rai.ClickUsingOCR("Login/Register");

		// Verify login modal is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login Modal");

	}

	/*@Then("^User clicks on hamberger menu and clicks on Shop$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Shop() throws Throwable {

		rai.SwipeUpSmallerUnits(1);
		// Clicking on Menu and navigate to Shop
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		// Click on Shop link
		//rai.clickbutton(Vype_CommonXpath.lnkShop, "Shop ");

		rai.ClickUsingOCR("Shop");
	}*/

	@Then("^Then User clicks on hamberger menu and clicks on Save$")
	public void then_User_clicks_on_hamberger_menu_and_clicks_on_Save() throws Throwable {


		// Clicking on Menu and navigate to save
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		//click on Save link
		rai.ClickUsingOCR("Save");
	}


	@And("^User clicks on Device, Pods and Accessories and clicks on pods$")
	public void user_clicks_on_Device_Pods_and_Accessories_and_clicks_on_pods() throws Throwable {

		//click on Device, Pods & Accessories
		rai.clickbutton(Vype_CommonXpath.lnkdeviceandpods, "Device, Pods & Accessories ");
		Thread.sleep(3000);
		// Click on pods link
		rai.clickLink(Vype_CommonXpath.LnkePod, "pods ");

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//rai.ClickUsingOCR("Not Now");

	}
	@When("^User chooses the flavour \"([^\"]*)\" with quantity \"([^\"]*)\" and add to the cart$")
	public void user_chooses_the_flavour_and_adds_it_to_the_subscription(String flavor_Additional, int quantity)
			throws Throwable {



		// click on flavor
		rai.clickbutton(Vype_CommonXpath.txtFlavor(flavor_Additional), flavor_Additional);



		rai.ScrollByxpath(Vype_CommonXpath.btnSubscribeandSave);



		for (int i = 0; i < quantity; i++) {

			//rai.waitTillElementEnable(Vype_CommonXpath.btnstrength);



			// click on
			rai.clickbutton(Vype_CommonXpath.btnstrength, "+ ");
		}



		rai.clickbutton(Vype_CommonXpath.txtSubsandSave1, "Subscribe and save");

		rai.SwipeDownSmallerUnits(2);

		// click on subscribe and save
		rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");


		function.navigatetoViewCart();
		rai.clickbutton(Vype_Cart.btnCheckOut, "Cart Page - Check Out");



	}

	@When("^User enters valid email address \"([^\"]*)\" and password \"([^\"]*)\" and clicks on login in Mobile$")
	public void user_enters_valid_email_address_and_password_and_clicks_on_login_in_Mobile(String UN, String pwd) throws Throwable {
		//login to the application

		function.loginApplication(UN, pwd);
		//rai.ClickUsingOCR("Accept All Cookies");
	}

	@Then("^user verifies pods page and selects flavor \"([^\"]*)\" with desired count \"([^\"]*)\" and add to cart$")
	public void user_verifies_pods_page_and_selects_flavor_with_desired_count_and_add_to_cart(String flavor, String count) throws Throwable {

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//Select flavor and count
		function.Addflavor(flavor, count);

		rai.clickbutton(Vype_CommonXpath.closeFlavor, "ePod Pods");

	}
	@When("^User clicks on hamburger menu and clicks on About$")
	public void user_clicks_on_hamburger_menu_and_clicks_on_About() throws Throwable {
		Thread.sleep(2000);
		// Clicking on Menu and navigate to Shop
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");
		Thread.sleep(1000);
		rai.ClickUsingOCR("About");
	}

	@When("^Click on Login/Register button and verify login modal page with relevent content is displayed$")
	public void click_on_Login_Register_button_and_verify_login_modal_page_with_relevent_content_is_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_CommonXpath.lnkLoginOrRgstr, "Login button");
		// Clicking on Login/Register link
		rai.clickUsingJs(Vype_CommonXpath.lnkLoginOrRgstr, "Login button");



		// Login modal pop up page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registration Modal");
		// Verify user text field
		rai.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");
		// Verify Password text field
		rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal");



		// Verify forgot link
		rai.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot link on Login Modal ");



		// Verify signup link
		rai.VerifyElementVisible(Vype_CommonXpath.lnksignup, "signup link on Login Modal ");
		// Verify login button
		rai.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button");
	}

	@Then("^Verify the Cart page$")
	public void verify_the_cart_page() throws Throwable {






		//Verify the Cart page is displayed
		rai.VerifyElementVisible(Vype_Cart.pgCart, "Cart page");

		//Verify the product is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);





		//Verify the Cart Summary for OneTimePurchaseTotal
		String OneTimePurchaseTotal=rai.getText(Vype_ePodStarterKit.wetxtPrice);
		float f = Float.parseFloat(OneTimePurchaseTotal.substring(1));
		rai.VerifyElementsVisible(Vype_ePodStarterKit.wetxtPrice, ">>>>>>>>One time purchase value is: " + f + ">>>>>>>>>>>>");






	}

	@Then("^Hower on cart icon and click on view cart$")
	public void hower_on_cart_icon_and_click_on_view_cart() throws Throwable {

		Thread.sleep(4000);
		function.navigatetoViewCart();
	}


	@Then("^verify order confirmation and order number$")
	public void verify_order_confirmation_and_order_number() throws Throwable {

		//verify order confirmation		
		function.verifyOrderConfirmationPage();
	}

	@Then("^verify subscription confirmation page$")
	public void verify_subscription_confirmation_page() throws Throwable {

		// verify subscription confirmation
		//rai.VerifyElementVisible(Vype_CheckOut.wetxtyoursubscription,"your subscription has been succesfully created");
		//current Active subscription
		rai.VerifyElementsVisible(Vype_CommonXpath.txtActiveSubscription, "Current Active subscription ");

		//your subscribed 
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribed, "Your subscibed ");

		//your subscribed items
		String s=rai.getText(Vype_CommonXpath.txtsubscribeditems);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribeditems, s);

		//subscription total
		String s1=rai.getText(Vype_CommonXpath.subscriptiontotal);
		rai.VerifyElementsVisible(Vype_CommonXpath.subscriptiontotal, s1);

		//shipping date
		String s2=rai.getText(Vype_CommonXpath.txtshippingdate);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingdate, s2);

		/*//edit details
		String s3=rai.getText(Vype_CommonXpath.shipping);
		rai.VerifyElementsVisible(Vype_CommonXpath.shipping, s3);*/

		//Note
		String s4=rai.getText(Vype_CommonXpath.txtshippingdate);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingdate, s4);


	}

	@Then("^Verify Active Subscription and verify subscribed items,subscription total and shipping date$")
	public void verify_Active_Subscription_and_verify_subscribed_items_subscription_total_and_shipping_date() throws Throwable {

		//current Active subscription
		rai.VerifyElementsVisible(Vype_CommonXpath.txtActiveSubscription, "Current Active subscription ");

		//your subscribed 
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribed, "Your subscibed ");

		//your subscribed items
		String s=rai.getText(Vype_CommonXpath.txtsubscribeditems);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribeditems, s);

		//subscription total
		String s1=rai.getText(Vype_CommonXpath.subscriptiontotal);
		rai.VerifyElementsVisible(Vype_CommonXpath.subscriptiontotal, s1);

		//shipping date
		String s2=rai.getText(Vype_CommonXpath.txtshippingdate);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingdate, s2);

		//Note
		String s4=rai.getText(Vype_CommonXpath.txtshippingdate);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingdate, s4);


	}



	@Then("^Cancel subscription$")
	public void cancel_subscription() throws Throwable {


		function.CancelActiveSubscription();
	}

	@Then("^delete card present in My Account page$")
	public void delete_card_present_in_My_Account_page() throws Throwable {

		function.deletecard();

	}

	@And("^Click on hamberger menu and click on My Subscription$")
	public void click_on_hamberger_menu_and_click_on_My_Subscription() throws Throwable {

		// Clicking on Menu and navigate to save
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		//click on My Subscription
		rai.clickbutton(Vype_CommonXpath.btnmysubscription, "My Subscription");

	}

	@Then("^User clicks on hamberger menu and click on logout$")
	public void user_clicks_on_hamberger_menu_and_click_on_logout() throws Throwable {

		// Clicking on Menu and navigate to save
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		rai.clickbutton(Vype_CommonXpath.btnlogout, "Log out");



	}


	@Then("^clear cache and launch application$")
	public void clear_cache_and_launch_application() throws Throwable {

		//clear cache and launch application
		function.launchApplication("https:vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
	}

	@Then("^Click on checkout$")
	public void click_on_checkout() throws Throwable {



		rai.ScrollByxpath(Vype_Cart.btnCheckOut);



		Thread.sleep(10000);



		// Click on 'Check Out' button from the Cart Page.
		rai.clickbutton(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
	}


	//Updated

	@And("^User clicks on hamburger menu and Verify Login/Register link$")
	public void user_clicks_on_hamburger_menu_and_Verify_Login_Register_link() throws Throwable {
		// Clicking on Menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

		// VerifyTextUsingOCR("Login/Register","Login/Register");
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkLoginOrRgstr, "Login/Register");
	}

	@When("^Click on Login/Register button and verify login modal page with relevant content is displayed$")
	public void click_on_Login_Register_button_and_verify_login_modal_page_with_relevant_content_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_CommonXpath.lnkLoginOrRgstr, "Login button");
		// Clicking on Login/Register link
		//rai.clickbutton(Vype_CommonXpath.lnkLoginOrRgstr, "Login button");

		//Login modal pop up page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registration Modal");
		//Verify user text field
		rai.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");
		//Verify Password text field     
		rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal");

		//Verify forgot link  
		rai.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot link on Login Modal ");

		//Verify signup link
		rai.VerifyElementVisible(Vype_CommonXpath.lnksignup, "signup link on Login Modal ");
		//Verify login button  
		rai.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button");
	}

	@When("^User enter valid email address \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
	public void user_enter_valid_email_address_and_and_click_on_Login_button(String UN, String pwd) throws Throwable {
		// Write code here that turns the phrase above into concrete action
		function.loginApplication(UN, pwd);
	}

	@When("^User clicks on hamburger menu and verify my account link is displayed$")
	public void user_clicks_on_hamburger_menu_ad_verify_my_account_link_is_displayed() throws Throwable {

		// Clicking on Menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu");

		// VerifyTextUsingOCR("My Account");

		//rai.VerifyPageByObject(Vype_CommonXpath.lnkMyAccount,"My Account", "My Account");

		//Click on close button

		rai.clickbutton(Vype_CommonXpath.closemenu,"Close hamburger menu");

	}

	@Then("^User clicks on hamberger menu and clicks on Shop$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Shop() throws Throwable {

		rai.SwipeUpSmallerUnits(1);
		// Clicking on Menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		//Verify hamburger menu is expanded
		rai.VerifyElementsVisible(Vype_CommonXpath.closemenu,"Close hamburger menu");

		//Verify shop link is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkShop,"shop");



		// Click on Shop link
		//rai.clickbutton(Vype_CommonXpath.lnkShop, "Shop ");
		rai.ClickUsingOCR("Shop");
	}
	
	
   



	@And("^User clicks on epod vaping products and clicks on pods$")
	public void User_clicks_on_epod_vaping_products_and_clicks_on_pods() throws Throwable {

		//click on epod vaping products
		rai.clickbutton(Vype_CommonXpath.lnkePodVapingProducts, "epod vaping products link ");
		Thread.sleep(3000);

		//Verify pods link is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.LnkePod,"pods");

		// Click on pods link
		rai.clickLink(Vype_CommonXpath.LnkePod, "pods");

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//rai.ClickUsingOCR("Not Now");

	}

	

	@Then("^User clicks on hamburger menu and verify logout link is displayed$")
	public void user_clicks_on_hamberger_menu_and_verify_logout_link_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Clicking on Menu and navigate to Shop
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Menu ");

		//Verifying the logout link is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.btnlogout, "Logout button");

	}

	@Then("^User verifies pods page and selects flavor \"([^\"]*)\" with desired count \"([^\"]*)\" and add to cart$")
	public void User_verifies_pods_page_and_selects_flavor_with_desired_count_and_add_to_cart(String flavor, String count) throws Throwable {
		// Verify that ePod's pods page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");

		//add flavor and count to cart
		function.AddflavorPLP(flavor, count);
		//Click on close icon for flavor pop up
		rai.clickbutton(Vype_CommonXpath.closeFlavor, "ePod Pods");
	}
	@Then("^Navigate to cart page and verify the cart page$")
	public void Navigate_to_cart_page_and_verify_the_cart_page() throws Throwable {

		//Swipe up
		rai.SwipeUpSmallerUnits(2);



		Thread.sleep(4000);
		function.navigatetoViewCart();

		//Verify the cart summary details
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------Cart Summary Details------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}

	}

	//Updated 
	String DeliveryCharge="FREE",pointsNum;
	float i, k, m;


	@When("^Verify Shipping Page is and One time Purchase details are dispalyed$")
	public void verify_Shipping_Page_is_and_One_time_Purchase_details_are_dispalyed() throws Throwable {

		Thread.sleep(2000);

		// Click on Home
		rai.clickbutton(Vype_CommonXpath.weHomeAddress, "Home");

		// Click on 'Go to delivery' button
		rai.VerifyElementsVisible(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

		rai.clickbutton(Vype_CommonXpath.showordersummary, "showordersummary");

		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}

	@When("^Click on Go to Delivery button$")
	public void click_on_Go_tO_Delivery_button() throws Throwable {
		// Click on 'Go to delivery' button
		rai.clickbutton(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

	}



	@Then("^Verify Delivery and One Time Purchase details are dispalyed$")
	public void verify_Delivery_and_One_Time_Purchase_details_are_dispalyed() throws Throwable {

		//billing 
		rai.VerifyElementVisible(Vype_CheckOut.btnGoToBilling, "Go to billing");

		System.out.println("-------------------One time purchase in delivery page-------------------");
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
	}



	@Then("^Verify all delivery Options are dispalyed$")
	public void verify_all_delivery_Options_are_dispalyed() throws Throwable {
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.txtdeliveryoptions);

		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.txtdeliveryoptions, str);
		}
	}



	@When("^Select \"([^\"]*)\" Option and Click on Go To Billing button$")
	public void select_Option_and_Click_on_Go_To_Billing_button(String delivery) throws Throwable {

		rai.clickbutton(Vype_CommonXpath.txtdelivery(delivery), delivery);

		DeliveryCharge=rai.getText(Vype_CheckOut.txtdeliverycharges(delivery));

		rai.clickbutton(Vype_CheckOut.btnGoToBilling, "Go To Billing");
	}



	@Then("^Verify Billing Page and One Time Purchase Details dispalyed$")
	public void verify_Billing_Page_and_One_Time_Purchase_Details_dispalyed() throws Throwable {

		rai.clickbutton(Vype_CommonXpath.OrderSummary, "Order summary");
		rai.VerifyElementVisible(Vype_CommonXpath.txtbillingpage, "Billing page");
		System.out.println("-------------------One time purchase in billing page-------------------");
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
		String str1=rai.getText(Vype_CheckOut.txtdeliverycharges);
		System.out.println(str1);
		if(DeliveryCharge.equals(str1)){
			reportiumClient.reportiumAssert("Shipping charge is same as per delivary", true);
		}
		else
		{
			reportiumClient.reportiumAssert("Shipping charge is not as per delivary", false);
		}
	}


	@When("^User Enters card details UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\"$")
	public void user_Enters_card_details_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV, String UserCardFullName) throws Throwable {
		/* 
		boolean b=rai.verifyobjectisnotavailable(Vype_CheckOut.txtCardNumber);

		if(b==false)
	    {
			rai.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);

			// Enter the Card Expire Date 
			rai.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

			// Enter the Card CVV 
			rai.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

			// Enter the Card Name
			rai.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);

			rai.clickbutton(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "check box Billing address is same as Shipping Address");
	    }

	    if(b==true)
	     {

	      }*/

		rai.ScrollByxpath(Vype_CheckOut.txtCardNumber);

		// Check if Card details are Not filled, Fill the card details
		if (rai.VerifyPageObject(Vype_CheckOut.txtCardNumber, "NO")) {

			Map<String, Object> params = new HashMap<>();
			params.put("label", "Card number");
			// params.put("text", "alva.white36@bat.com");
			params.put("text", UserCardNumber);
			params.put("operation", "single");
			adriver.executeScript("mobile:edit-text:set", params);

			// Enter the Card Number
			//rai.inputText(Vype_CheckOut.txtCardNumber,"Enter the Card Number", UserCardNumber);
			Map<String, Object> params1 = new HashMap<>();
			params1.put("label", "Expiry");
			params1.put("text", UserCardExpiryDate);
			params1.put("label.direction", "above");
			params1.put("label.offset", "3%");
			adriver.executeScript("mobile:edit-text:set", params1);

			int Cvv = Integer.parseInt(UserCardCVV);
			Random random = new Random();

			// generate a random integer from 0 to 899, then add 100
			Cvv = random.nextInt(900) + 100;
			Map<String, Object> params2 = new HashMap<>();
			params2.put("label", "CVV");

			params2.put("text", Cvv);
			params2.put("label.direction", "above");
			params2.put("label.offset", "3%");
			adriver.executeScript("mobile:edit-text:set", params2);

			Map<String, Object> params3 = new HashMap<>();
			params3.put("label", "Name on card");

			params3.put("text", UserCardFullName);
			params3.put("label.direction", "above");
			params3.put("label.offset", "3%");
			adriver.executeScript("mobile:edit-text:set", params3);

			// Enter the Card Expire Date
			//rai.inputText(Vype_CheckOut.txtCardExpiryDate, "Enter the Card Expiry Date", UserCardExpiryDate);

			// Enter the Card CVV
			//rai.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV",UserCardCVV);

			// Enter the Card Name
			//rai.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name",UserCardFullName);

			// Select the check box "Save credit card details for future
			// payments
			// rai.selectCheckbox(Vype_CheckOut.chkboxSaveCreditCardDetails,
			// "Select the checkbox 'Save credit card details for future
			// payments'");

		}
		rai.clickbutton(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress,
				"check box Billing address is same as Shipping Address");

	}


	@When("^Click On terms and conditions check box and verify submit order button is enabled$")
	public void click_On_terms_and_conditions_check_box_and_verify_submit_order_button_is_enabled() throws Throwable {

		rai.clickbutton(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

		//Click on "Submit Order" button 
		rai.isEnabled(Vype_CheckOut.btnsubmit, "Submit");
	}


	@When("^Click On Submit Order button$")
	public void click_On_Submit_Order_button() throws Throwable {

		rai.clickbutton(Vype_CheckOut.btnSubmitOrder,"Submit Order");
		Thread.sleep(4000);

		rai.ClickUsingOCR("No thanks");
	}


	@Then("^Verify Order confirmation page is displayed with relevent content$")
	public void verify_Order_confirmation_page_is_displayed_with_relevent_content() throws Throwable {

		rai.waitTillElementEnable(Vype_CommonXpath.weOrderConfirmation);
		//Verify order confirmation page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.weOrderConfirmation, "Order Confirmation");

		//Verify the order ID
		String OrderValue = rai.getText(Vype_CheckOut.weTxtOrderValue);
		rai.VerifyElementVisible(Vype_CheckOut.weTxtOrderValue, OrderValue);
		System.out.println(">>>>>>" + OrderValue + ">>>>>>>>>");
		System.out.println(">>>>>> Order ID is " + OrderValue.substring(1) + ">>>>>>>>>");

		Thread.sleep(1000);

		rai.clickbutton(Vype_CommonXpath.showordersummary, "showordersummary");
		//Verify the order summary
		String ordersummary = rai.getText(Vype_CheckOut.txtordersummary);
		rai.VerifyElementVisible(Vype_CheckOut.txtordersummary, ordersummary);
		System.out.println("****************Order Summary*********************");
		System.out.println(ordersummary);
		System.out.println("*************************************");

		//Vuse+ Rewards total points recieved for above order
		String str3 = rai.getText(Vype_Benefits_Rewards.TotalAmount);
		pointsNum = str3.substring(1);

		m = Float.parseFloat(pointsNum);
		m = m * 10;
		System.out.println(Math.round(m));
		m = m + i;
		System.out.println(Math.round(m));

	}

	//Updated Bhavitha
	@Then("^Delete card present in Profile$")
	public void delete_card_present_in_Profile() throws Throwable {

		function.deletecard();

	}


	@Then("^Verify Billing Page and One Time Purchase details dispalyed$")
	public void verify_Billing_Page_and_One_Time_Purchase_details_dispalyed() throws Throwable {

		rai.VerifyElementVisible(Vype_CommonXpath.txtbillingpage, "Billing page");
		System.out.println("-------------------One time purchase in billing page-------------------");
		List<WebElement> list=rai.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
			{
			 String str=list.get(i).getText();
			 System.out.println(str);
			rai.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		 }
		String str1=rai.getText(Vype_CheckOut.txtDeliverycharges);
		System.out.println(str1);
		if(DeliveryCharge.equals(str1)){
			reportiumClient.reportiumAssert("Shipping charge is same as per delivary", true);
			}
		else
		{
			reportiumClient.reportiumAssert("Shipping charge is not as per delivary", false);
		}
	
	}




	@When("^Click on logout link and verify the prelogin page is displayed$")
    public void click_on_logout_link_and_verify_the_prelogin_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions







//verify clicking on logout link       





            rai.clickUsingJs(Vype_CommonXpath.btnlogout, "Logout button");

        Thread.sleep(5000);






        // Clicking on Menu
        rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

//        VerifyText("Login/Register","Login/Register");
        rai.VerifyElementsVisible(Vype_CommonXpath.lnkLoginOrRgstr, "Login/Register");









    }

}
