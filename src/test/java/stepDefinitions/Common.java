package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Benefits_Rewards;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_ClickandCollect;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_ePodStarterKit;



public class Common extends BaseClass{	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Given("^User is on pre-login page$")
	public void user_is_on_pre_login_page() throws Throwable {


		function.launchApplication();


	}
	
	


	@When("^user login with valid email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_valid_email_address_and_password(String UN, String pwd) throws Throwable {

		function.loginApplication(UN, pwd);

	}
	@When("^Hover on cart and click on view cart$")
    public void hover_on_cart_and_click_on_view_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        function.hoverCartAndClickViewCart();
    }


	@Then("^Navigate to Cart and verify the items in Cart$")
	public void navigate_to_Cart_and_verify_the_items_in_Cart() throws Throwable {
		//hower and view cart
		function.hoverCartAndClickViewCart();

		//verify cart items
		//function.verifyItemsInCartPage();

	}


	@When("^user Enters UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\" to submit order$")
	public void user_Enters_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName_to_submit_order(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV, String UserCardFullName) throws Throwable {

		function.checkoutAndSubmitOrder(UserCardNumber, UserCardExpiryDate, UserCardCVV, UserCardFullName);
	}

	@Then("^Verify order confirmation page$")
	public void verify_order_confirmation_page() throws Throwable	
	{
		Thread.sleep(10000);
		function.verifyOrderConfirmationPage();

	}

	@Then("^Cancel the subscription$")
	public void verify_Active_subscription_and_cancel_the_subscription() throws Throwable {

		//function.navigateToMyAccountFromHome();
		//gl.clickbutton(Vype_CommonXpath.lblSubscription, "Subscription");

		function.CancelActiveSubscription();

	}

	@Then("^verify existing payment method and delete the payment method$")
	public void verify_existing_payment_method_and_delete_the_payment_method() throws Throwable {

		function.deletecard();

	}

	@Given("^User is on pre-login page of boost plan$")
	public void user_is_on_pre_login_page_of_boost_plan() throws Throwable {

		function.launchApplicationBoost();
	}

	@When("^User click on login/register button$")
	public void user_click_on_login_register_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_CommonXpath.btnLoginorRegister, "Login or Register");
	}





	@When("^Verify the login modal is displayed with relevent content$")
	public void verify_the_login_modal_is_displayed_with_relevent_content() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registration Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot link on Login Modal ");


		gl.VerifyElementVisible(Vype_CommonXpath.lnksignup, "signup link on Login Modal ");

		gl.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button");


	}





	@When("^User enters email \"([^\"]*)\" and Password \"([^\"]*)\" and click on login$")
	public void user_enters_email_and_Password_and_click_on_login(String UN, String pwd) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Enter User name in the user name text field



		function.loginApplication(UN, pwd);
	}





	@Then("^Verify home page is displayed$")
	public void verify_home_page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	}

	@When("^Hover on Account icon and Click on Logout option$")
	public void Hover_on_Account_icon_and_Click_on_Logout_option() throws Throwable {

		//Hover on shop button
		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");

		//Click on logout button
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnklogout, "Logout");

	}


     @When("^User hovers on shop and click on pods$")
	public void user_hovers_on_shop_and_click_on_pods() throws Throwable {

		Thread.sleep(5000);
		// Hover the mouse on Products link
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

		// Verify the Submenu ePod is loaded
		gl.VerifyElementVisible(Vype_CommonXpath.lnkEpodPods, "ePods");

		// Click on Pods link under the ePod section
		gl.clickUsingJs(Vype_CommonXpath.lnkEpodPods, "Pods from the Epod section");



	}



	@Then("^Verify navigates to ePod Vape Pods page$")
	public void verify_navigated_to_ePod_Vape_Pods_page() throws Throwable {
		gl.waitTillElementVisible(Vype_CommonXpath.pgEpodPods);

		// Verify that ePod's pods page is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
	}


	@Then("^Verify the user is in Pre login home page$")
	public void verify_the_user_is_in_Pre_login_home_page() throws Throwable {

		//Verify the pre login page is displayed
		gl.VerifyPageDisplayed(goVype_Properties.Vype_Common.btnLoginorRegister, "Login Button");

	}

	@Then("^Click on add button for any \"([^\"]*)\" with required quantity \"([^\"]*)\"$")
	public void click_on_add_button_for_any_with_required_quantity(String flavor, String quantity) throws Throwable {



		// scroll to flavor image
		gl.fnScrollToView(Vype_ClickandCollect.imgflavor(flavor));
		int q = Integer.parseInt(quantity);



		gl.clickUsingJs(Vype_ClickandCollect.btnquantity1(flavor), " - ");
		// click on quantity picker
		for (int i = 0; i < q; i++) {
			gl.clickUsingJs(Vype_ClickandCollect.btnquantity(flavor), " + ");
		}



		// click on add button for flavor
		gl.clickUsingJs(Vype_CommonXpath.flavorAddButtonInePodVapePodsPage(flavor), "Flavor selected is: " + flavor);



	}



	@Then("^Verify pod is added to the cart$")
	public void verify_pod_is_added_to_the_cart() throws Throwable {
		// Verify pod is added to the cart.
		gl.VerifyElementVisible(Vype_CommonXpath.txtAddedtocart, "Added to cart text");
	}

	//Global variable
	String DeliveryCharge="FREE";



	@When("^Click on Checkout button$")
	public void click_on_Checkout_button() throws Throwable {




		//scroll to checkout page
		gl.fnScrollToView(Vype_Cart.txtsubTotal);

		Thread.sleep(1000);
		// Click on 'Check Out' button from the Cart Page.
		gl.clickbutton(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

	}

	@Then("^Verify shipping page and One time Purchase details are dispalyed$")
	public void verify_shipping_page_and_One_time_Purchase_details_are_dispalyed() throws Throwable {

		// Verify that Check Out Page is displayed
		//gl.VerifyElementVisible(Vype_CheckOut.pgCheckOut, "Check Out");

		Thread.sleep(2000);

		// Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");


		// Click on 'Go to delivery' button
		gl.VerifyElementPresent(Vype_CheckOut.btnGoToDelivery, "Go to delivery");


		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		System.out.println("----------------One time purchase in shipping  page------------------");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}


	}

	@When("^Click on Go TO Delivery button$")
	public void click_on_Go_TO_Delivery_button() throws Throwable {

		// Click on 'Go to delivery' button
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery, "Go to delivery");

	}

	@Then("^Verify Delivery and One time Purchase details are dispalyed$")
	public void verify_Delivery_and_One_time_Purchase_details_are_dispalyed() throws Throwable {


		//billing 
		gl.VerifyElementVisible(Vype_CheckOut.btnGoToBilling, "Go to billing");

		System.out.println("-------------------One time purchase in delivery page-------------------");
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}


	}

	@Then("^Verify all delivery options are dispalyed$")
	public void verify_all_delivery_options_are_dispalyed() throws Throwable {

		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.txtdeliveryoptions);

		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.txtdeliveryoptions, str);
		}
	}

	@When("^Select \"([^\"]*)\" option and Click on Go To Billing button$")
	public void select_option_and_Click_on_Go_To_Billing_btton(String delivery) throws Throwable {

		gl.clickUsingJs(Vype_CommonXpath.txtdelivery(delivery), delivery);

		DeliveryCharge=gl.getText(Vype_CheckOut.txtdeliverycharges(delivery));

		gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go To Billing");
	}

	@Then("^Verify Billing Page and One time Purchase details dispalyed$")
	public void verify_Billing_Page_and_One_time_Purchase_details_dispalyed() throws Throwable {

		//gl.ScrollPageUp();
		gl.VerifyElementVisible(Vype_CommonXpath.txtbillingpage, "Billing page");
		System.out.println("-------------------One time purchase in billing page-------------------");
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
		String str1=gl.getText(Vype_CheckOut.txtdeliverycharges);
		System.out.println(str1);
		if(DeliveryCharge.equals(str1)){
			reportiumClient.reportiumAssert("Shipping charge is same as per delivary", true);
		}
		else
		{
			reportiumClient.reportiumAssert("Shipping charge is not as per delivary", false);
		}
	}
	@Then("^Verify Billing Page and subscription details dispalyed$")
	public void verify_Billing_Page_and_Subscription_details_dispalyed() throws Throwable {

		//gl.ScrollPageUp();
		gl.VerifyElementVisible(Vype_CommonXpath.txtbillingpage, "Billing page");
		System.out.println("-------------------Subscription details in billing page-------------------");
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.listlines);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.listlines(i), str);
		}
		String str1=gl.getText(Vype_CheckOut.txtdeliverycharges);
		System.out.println(str1);
		if(DeliveryCharge.equals(str1)){
			reportiumClient.reportiumAssert("Shipping charge is same as per delivary", true);
		}
		else
		{
			reportiumClient.reportiumAssert("Shipping charge is not as per delivary", false);
		}
	}

	@When("^User enters card details UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\"$")
	public void user_enters_card_details_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV, String UserCardFullName) throws Throwable {

		boolean b=gl.verifyobjectisnotavailable(Vype_CheckOut.txtCardNumber);

		if(b==false)
		{
			gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);

			// Enter the Card Expire Date 
			gl.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

			// Enter the Card CVV 
			gl.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

			// Enter the Card Name
			gl.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);

			gl.selectCheckbox(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "check box Billing address is same as Shipping Address");
		}

		if(b==true)
		{

		}


	}

	@When("^Click on terms and conditions check box and verify submit order button is enabled$")
	public void click_on_terms_and_conditions_check_box_and_verify_submit_order_button_is_enabled() throws Throwable {

		gl.clickbutton(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");

		//Click on "Submit Order" button 
		gl.isEnabled(Vype_CheckOut.btnsubmit, "Submit");


	}

	@When("^Click on Submit Order button$")
	public void click_on_Submit_Order_button() throws Throwable {

		gl.clickbutton(Vype_CheckOut.btnSubmitOrder,"Submit Order");
	}




	String OrderValue = "";
	float i, k, m;
	String pointsNum;


	@Then("^Verify order confirmation page is displayed with relevent content$")
	public void verify_order_confirmation_page_is_displayed_with_relevent_content() throws Throwable {
		gl.waitTillElementVisible(Vype_CommonXpath.weOrderConfirmation);
		//Verify order confirmation page is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.weOrderConfirmation, "Order Confirmation");



		//Verify the order ID
		OrderValue = gl.getText(Vype_CheckOut.weTxtOrderValue);
		gl.VerifyElementVisible(Vype_CheckOut.weTxtOrderValue, OrderValue);
		System.out.println(">>>>>>" + OrderValue + ">>>>>>>>>");
		System.out.println(">>>>>> Order ID is " + OrderValue.substring(1) + ">>>>>>>>>");




		//Verify the order summary
		String ordersummary = gl.getText(Vype_CheckOut.txtordersummary);
		gl.VerifyElementVisible(Vype_CheckOut.txtordersummary, ordersummary);
		System.out.println("****************Order Summary*********************");
		System.out.println(ordersummary);
		System.out.println("*************************************");


		//Vuse+ Rewards total points recieved for above order
		String str3 = gl.getText(Vype_Benefits_Rewards.TotalAmount);
		pointsNum = str3.substring(1);



		m = Float.parseFloat(pointsNum);
		m = m * 10;
		System.out.println(Math.round(m));
		m = m + i;
		System.out.println(Math.round(m));

	}

	@Then("^Verify the cart page$")
	public void Verify_the_cart_page() throws Throwable {




		//Verify the Cart page is displayed
		gl.VerifyElementVisible(Vype_Cart.pgCart, "Cart page");

		//Verify the product is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);



		//Verify the Cart Summary for OneTimePurchaseTotal
		String OneTimePurchaseTotal=gl.getText(Vype_ePodStarterKit.wetxtPrice);
		float f = Float.parseFloat(OneTimePurchaseTotal.substring(1));
		gl.VerifyObjectDisplayed(Vype_ePodStarterKit.wetxtPrice, ">>>>>>>>One time purchase value is: " + f + ">>>>>>>>>>>>");


	}

	@When("^User hovers on Profile section and click on My rewards link$")
	public void user_hovers_on_Profile_section_and_click_on_My_rewards_link() throws Throwable {



		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyRewards, "My Rewards");
		Thread.sleep(3000);



	}

	@When("^User hovers on Profile section and click on My Subscription link$")
	public void user_hovers_on_Profile_section_and_click_on_My_Subscription_link() throws Throwable {



		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMySubscription, "My Subscription");
		Thread.sleep(3000);



	}
}