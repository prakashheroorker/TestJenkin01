package stepDefinitions_Mobile;

import java.util.HashMap;
import java.util.Map;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties_mobile.*;


public class Subscription extends BaseClass {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@When("^User chooses the flavour \"([^\"]*)\" with quantity \"([^\"]*)\" and add to the Cart$")
	public void user_chooses_the_flavour_and_adds_it_to_the_subscription(String flavor_Additional, int quantity)
			throws Throwable {

		// click on flavor
		rai.clickUsingJs(Vype_CommonXpath.txtFlavor(flavor_Additional), flavor_Additional);

		//rai.ScrollByxpath(Vype_CommonXpath.pgsubscribandsave);

		for (int i = 0; i < 5; i++) {

			// click on
			rai.clickUsingJs(Vype_CommonXpath.btnstrength, "+ ");
		}

		rai.clickUsingJs(Vype_CommonXpath.txtSubsandSave1, "Subscribe and save");

		// click on subscribe and save
		rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

		function.navigatetoViewCart();
		rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

	}
	@When("^User again enters valid email address \"([^\"]*)\" and password \"([^\"]*)\" and clicks on login in Mobile$")
	public void user_again_enters_valid_email_address_and_password_and_clicks_on_login_in_Mobile(String UN, String pwd) throws Throwable 
	{
		function.loginApplication(UN, pwd);
	}

	@When("^Draft Subscription Order should be displayed upon clicking on Go to Account link$")
	public void draft_Subscription_Order_should_be_displayed() throws Throwable {

		rai.VerifyElementVisible(Vype_CommonXpath.txtDraftModal, "Draft Subscription modal at checkout");
		rai.VerifyElementVisible(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
		rai.clickbutton(Vype_CommonXpath.btnGotoAccount, "Go to Account button");

		Thread.sleep(1000);
		// For Feedback pop-up
		rai.ClickUsingOCR("Not Now");

		rai.VerifyElementVisible(Vype_CommonXpath.txtDraftsub, "Draft subscription order");
		rai.ScrollByxpath(Vype_CommonXpath.lnkDiscard);
		Thread.sleep(1000);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");
		rai.VerifyElementVisible(Vype_CommonXpath.btnSubmitUpdate, "Submit update button");
		rai.VerifyElementVisible(Vype_CommonXpath.btnContinueModification, "Continue Modification button");

		rai.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription");

	}

	@When("^User clicks on Continue Modification link$")
	public void user_clicks_on_Continue_Modification_link() throws Throwable {

		rai.clickbutton(Vype_CommonXpath.btnContinueModification, "Continue Modification button");

	}

	@Then("^Draft order should be displayed$")
	public void draft_order_should_be_displayed() throws Throwable {

		rai.VerifyElementVisible(Vype_CommonXpath.txtDraftOrder, "Draft order text");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkBack, "Back link");
		rai.VerifyElementVisible(Vype_CommonXpath.txtDraftOrderSummary, "Order summary section");

	}

	@When("^User click on remove link to remove the newly added product$")
	public void user_click_on_remove_link_to_remove_the_newly_added_product() throws Throwable {

		rai.clickbutton(Vype_CommonXpath.btnRemove, "remove button");

	}

	@When("^User adds another Flavor \"([^\"]*)\" using filter by option$")
	public void user_adds_a_product_using_filter_by_option(String flavor_nicfree) throws Throwable {

		rai.ScrolltoTopofthepage();
		Thread.sleep(2000);
		rai.ScrollByxpath(Vype_CommonXpath.txtflavor2(flavor_nicfree));
		Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_CommonXpath.txtflavor2(flavor_nicfree), "flavor - " + flavor_nicfree);
		rai.clickUsingJs(Vype_CommonXpath.txtflavor(flavor_nicfree), "Added flavor - " + flavor_nicfree);
		rai.VerifyElementVisible(Vype_CommonXpath.txtPackQuantity, flavor_nicfree + " - Add modal");
		rai.clickUsingJs(Vype_CommonXpath.btnQtyIncrement, "Added quantity");
		rai.clickUsingJs(Vype_CommonXpath.btnADD, "Add button in modal");
		rai.VerifyElementVisible(Vype_CommonXpath.txtflavorInOrderSummary(flavor_nicfree),
				"Flavour Added in Order Summary - " + flavor_nicfree);

	}

	@And("^User clicks on Submit Updates link$")
	public void user_clicks_on_Submit_Updates_link() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.btnSubmitupdates);
		rai.clickbutton(Vype_CommonXpath.btnSubmitupdates, "Click on Submit updates button");

	}

	@Then("^verify Subscription is modified with the newly added product$")
	public void subscription_should_be_modified_with_the_newly_added_product() throws Throwable {

		rai.waitTillElementPresenceLocated(Vype_CommonXpath.txtSubUpdate);
		rai.VerifyElementVisible(Vype_CommonXpath.txtSubUpdate, "Subscription update message");
		Thread.sleep(2000);

	}

	@When("^User Confirms if user has active subscription$")
	public void user_Confirms_if_user_has_active_subscription() throws Throwable {

		// Clicking on Menu and navigate to save
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

		// click on My Subscription
		rai.clickUsingJs(Vype_CommonXpath.btnmysubscription, "My Subscription");

		Thread.sleep(2000);

		rai.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription");
		Thread.sleep(1000);
	}

	@When("^Draft Subscription Order should be discarded upon clicking on Discard link$")
	public void draft_Subscription_Order_should_be_discarded_upon_clicking_on_Discard_link() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.lnkDiscard);

		Thread.sleep(1000);

		rai.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");

		rai.clickbutton(Vype_CommonXpath.lnkDiscard, "Link discard");

		rai.VerifyElementVisible(Vype_CommonXpath.txt1InDiscardSubModal, "Discard Subscription Modal");

		rai.VerifyElementVisible(Vype_CommonXpath.txt2InDiscardSubModal, "Discard Subscription Modal text");

		rai.VerifyElementVisible(Vype_CommonXpath.btnYesDiscard,
				"yes, discard button is displayed in Discard Subscription Modal");

		rai.VerifyElementVisible(Vype_CommonXpath.btnNoReturn,
				"No, return button is displayed in Discard Subscription Modal");

		rai.clickbutton(Vype_CommonXpath.btnNoReturn, "No, return button is clicked");

		rai.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");

		rai.clickbutton(Vype_CommonXpath.lnkDiscard, "Link discard");

		rai.VerifyElementVisible(Vype_CommonXpath.txt1InDiscardSubModal, "Discard Subscription Modal");

		rai.VerifyElementVisible(Vype_CommonXpath.txt2InDiscardSubModal, "Discard Subscription Modal text");

		rai.VerifyElementVisible(Vype_CommonXpath.btnYesDiscard,
				"yes, discard button is displayed in Discard Subscription Modal");

		rai.VerifyElementVisible(Vype_CommonXpath.btnNoReturn,
				"No, return button is displayed in Discard Subscription Modal");

		rai.clickbutton(Vype_CommonXpath.btnYesDiscard, "yes, discard button is clicked");

		Thread.sleep(4000);

		// rai.ScrolltoTopofthepage();

	}

	@When("^User close the login modal$")
	public void user_close_the_login_modal() throws Throwable {

		rai.clickbutton(Vype_CommonXpath.btnCloselogin, "Close login modal");
	//	Thread.sleep(4000);
		/*Map<String, Object> params = new HashMap<>();params.put("label", "PRIVATE:1661341267841_closeicon.PNG");
		params.put("timeout", "4");
		params.put("measurement", "accurate");
		params.put("match", "Similar");
		params.put("screen.top", "30%");
		params.put("screen.left", "83%");
		params.put("screen.width", "14%");
		params.put("screen.height", "8%");
		rdriver.executeScript("mobile:button-image:click", params);*/
		
	}

	@Then("^User is prompted to Login to the application$")
	public void user_is_prompted_to_Login_to_the_application() throws Throwable {

		rai.ScrollByxpath(Vype_Cart.btnCheckOut);
		rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(2000);
		rai.waitTillElementPresenceLocated(Vype_CommonXpath.pgloginModal);
		rai.VerifyElementVisible(Vype_CommonXpath.pgloginModal, "Login Modal");
		rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Username textfield on Login Modal");
		rai.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot link on Login Modal ");
		rai.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button ");

	}

	@When("^user Login with same email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_Login_with_same_email_address_and_password(String username, String password) throws Throwable {

		function.loginApplication(username, password);

	//	rai.clickbutton(Vype_CommonXpath.btnLogin, "Login button");


	}

	@When("^Draft Subscription Order should be submitted upon clicking on Submit Update link$")
	public void draft_Subscription_Order_should_be_submitted_upon_clicking_on_Submit_Update_link() throws Throwable {

		rai.clickbutton(Vype_CommonXpath.btnSubmitUpdate, "Click on Submit update button");
		Thread.sleep(4000);
		rai.VerifyElementVisible(Vype_CommonXpath.txtSubUpdate, "Subscription update message");

	}

	@When("^User add product \"([^\"]*)\" to cart for one time purchase$")
	public void user_add_product_to_cart_for_one_time_purchase(String flavor_Onetime) throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtFlavor(flavor_Onetime));
		// click on flavor
		rai.clickUsingJs(Vype_CommonXpath.txtFlavor(flavor_Onetime), flavor_Onetime);

		rai.ScrollByxpath(Vype_CommonXpath.txtPack);
		rai.clickUsingJs(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");
		Thread.sleep(2000);
		rai.clickbutton(Vype_CommonXpath.btnAddtoCart, "Add to cart Button");
		Thread.sleep(4000);
		function.navigatetoViewCart();
		Thread.sleep(2000);
	}

	@When("^User select additional product \"([^\"]*)\" for subscription and add to the cart$")
	public void user_select_additional_product_for_subscription_and_add_to_the_cart(String flavor_additional)
			throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtFlavor(flavor_additional));
		
		// click on flavor
		rai.clickUsingJs(Vype_CommonXpath.txtFlavor(flavor_additional), flavor_additional);
		rai.clickUsingJs(Vype_CommonXpath.btnSubscribeAndSave, "SubSubscribe & Save");
		rai.ScrollByxpath(Vype_CommonXpath.txtPack);
		rai.clickbutton(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		rai.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		Thread.sleep(4000);
		function.navigatetoViewCart();
		Thread.sleep(2000);
		rai.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(2000);

	}

}
