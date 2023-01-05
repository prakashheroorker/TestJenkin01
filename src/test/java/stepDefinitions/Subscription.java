package stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Subscription;
import goVype_Properties.Vype_SubscriptionLanding;

public class Subscription extends BaseClass{

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^User navigates to ePod pods page$")
	public void user_navigates_to_ePod_pods_page() throws Throwable {

		function.navigateToePodPods();

	}

	@When("^User subscribes for flavour \"([^\"]*)\" with required quantity \"([^\"]*)\" and add to the cart$")
	public void user_subscribes_for_the_flavour_and_selects_the_quantity(String flavor, int quantity) throws Throwable {

		function.selectFlavorandQuantity(flavor, quantity);

	}

	@When("^User scrolls down to choose desired flavors \"([^\"]*)\" with required quantity \"([^\"]*)\" and Add as Subscription$")
	public void user_scrolls_down_to_choose_desired_flavors_with_required_quantity_and_Add_as_Subscription(String Flavors, String quantity) throws Throwable {


        int Count=Integer.parseInt(quantity);
		

		String S = Flavors;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 


		for (String flavor : myList) {  
			//Scroll to the flavor
			gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor));

			gl.clickUsingJs(Vype_CommonXpath.btnqtydecrement(flavor), "Decrement Quantity");

			for (int i = 0; i < Count; i++) {

				gl.clickUsingJs(Vype_CommonXpath.btnqtyincrement(flavor), "Increment Quantity");
				Thread.sleep(1000);

			}

			//Add to subscription Subscription option
			gl.clickbutton(Vype_CommonXpath.btnaddtoSubscription(flavor), "Add as subscription");

			Thread.sleep(1000);

		}



	}

	@And("^User navigates to Cart page$")
	public void user_navigates_to_Cart_page() throws Throwable {

		function.hoverCartAndClickViewCart();

	}

	@And("^User navigates to Check out page and Submits the Order with card details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_navigates_to_Check_out_page_and_Submits_the_Order(String UserCardNumber, String UserCardExpiryDate,
			String UserCardCVV, String UserCardFullName) throws Throwable {

		function.checkoutAndSubmitOrder(UserCardNumber, UserCardExpiryDate, UserCardCVV, UserCardFullName);

	}

	@Then("^Order should be Submitted and Subscription should be added$")
	public void order_should_be_Submitted_and_Subscription_should_be_added() throws Throwable {

		gl.waitTillElementVisible(Vype_Subscription.txtSubscriptionUpdated);
		gl.VerifyElementVisible(Vype_Subscription.txtSubscriptionUpdated, "Order Successfully created");


	}


	@When("^User logs in with same email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logs_in_with_same_email_address_and_password(String username, String password) throws Throwable {

		function.loginApplication(username, password);
	}

	@When("^User chooses the flavour \"([^\"]*)\" with required quantity \"([^\"]*)\" and add to the cart$")
	public void user_chooses_the_flavour_and_adds_it_to_the_subscription(String flavor_Additional, int quantity)
			throws Throwable {

		function.selectFlavorandQuantity(flavor_Additional, quantity);
		function.hoverCartAndClickViewCart();
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

	}

	@When("^Draft Subscription Order should be displayed upon clicking on Go to Account button$")
	public void draft_Subscription_Order_should_be_displayed() throws Throwable {

		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftModal, "Draft Subscription modal at checkout");
		gl.VerifyElementVisible(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
		gl.clickbutton(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftsub, "Draft subscription order");
		gl.ScrollPageDown();
		Thread.sleep(1000);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");
		gl.VerifyElementVisible(Vype_CommonXpath.btnSubmitUpdate, "Submit update button");
		gl.VerifyElementVisible(Vype_CommonXpath.btnContinueModification, "Continue Modification button");
		gl.ScrollPageDown();
		gl.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription");
		gl.ScrollPageUp();
	}
	@Then("^Verify Looks like you already have an active Subscription displays with proceed to Checkout and Go To Account buttons$")
	public void verify_Looks_like_you_already_have_an_active_Subscription_displays_with_proceed_to_Checkout_and_Go_To_Account_buttons() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftModal, "Draft Subscription modal at checkout");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
	}
	
	@Then("^Verify Looks like you already have an active Subscription Pop up displays$")
	public void verify_Looks_like_you_already_have_an_active_Subscription_Pop_up_displays() throws Throwable {
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftModal, "Draft Subscription modal at checkout");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnProceedtoCheckout, "Proceed to Checkout");
		
		String str=gl.getText(Vype_CommonXpath.txtotpsubscription);
		System.out.println(str);
		gl.VerifyElementVisible(Vype_CommonXpath.txtotpsubscription, str);
	}
	
	@When("^Click on Proceed to Checkout$")
	public void click_on_Proceed_to_Checkout() throws Throwable {
		gl.clickbutton(Vype_CommonXpath.btnProceedtoCheckout, "Proceed to Checkout");   
	}
	
	@When("^Click on on Go to Account button$")
	public void click_on_on_Go_to_Account_button() throws Throwable {
	    
		gl.clickbutton(Vype_CommonXpath.btnGotoAccount, "Go to Account button");
	}
	@Then("^Verify user navigates to subscription page containing two tiles one with Draft Subscription Order and another with Current Active Subscription$")
	public void verify_user_navigates_to_subscription_page_containing_two_tiles_one_with_Draft_Subscription_Order_and_another_with_Current_Active_Subscription() throws Throwable {
	   
		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftsub, "Draft subscription order");
		String str=gl.getText(Vype_CommonXpath.txtnewaddons);
		System.out.println(str);
		gl.VerifyElementVisible(Vype_CommonXpath.txtnewaddons, str);
		
		String str1=gl.getText(Vype_CommonXpath.txtcurrentsubscriptionitems);
		gl.VerifyElementVisible(Vype_CommonXpath.txtcurrentsubscriptionitems, str1);
		
		gl.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");
		gl.VerifyElementVisible(Vype_CommonXpath.btnSubmitUpdate, "Submit update button");
		gl.VerifyElementVisible(Vype_CommonXpath.btnContinueModification, "Continue Modification button");
		
	}
	

	@When("^User clicks on Continue Modification button$")
	public void user_clicks_on_Continue_Modification_button() throws Throwable {

		gl.clickbutton(Vype_CommonXpath.btnContinueModification, "Continue Modification button");

	}
	
	@When("^Click on Submit update button$")
	public void click_on_Submit_update_button() throws Throwable {
	    gl.clickbutton(Vype_CommonXpath.btnSubmitUpdate, "Submit update ");
	}

	@Then("^Draft Order page should be displayed$")
	public void draft_Order_should_be_displayed() throws Throwable {

		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftOrder, "Draft order text");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkBack, "Back link");
		gl.VerifyElementVisible(Vype_CommonXpath.txtDraftOrderSummary, "Order summary section");

	}

	@When("^User clicks on remove link to remove the newly added products$")
	public void user_clicks_on_remove_link_to_remove_the_newly_added_product() throws Throwable {

		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.btnRemove);
		
		for(int i=0;i<list.size();i++)
		{
			gl.clickbutton(Vype_CommonXpath.btnRemove, "remove button");
		}
		
		}
	
	@When("^Click on filter by button$")
	public void click_on_filter_by_button() throws Throwable {
	    gl.clickbutton(Vype_CommonXpath.lnkfilter, "Filter BY");
	}

	@Then("^Verify all available flavors list should be displayed$")
	public void verify_all_available_flavors_list_should_be_displayed() throws Throwable {
	 
		List<WebElement> list=gl.findElementsList(Vype_CommonXpath.txtflavortypes);
		System.out.println("----Filter by types---");
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println((i+1)+":"+str);
			gl.VerifyElementPresent(Vype_CommonXpath.txtflavortypes, str);
		}
		
		gl.clickbutton(Vype_CommonXpath.lnkfilter, "Filter BY");
		
	}
		
		
		

	@When("^User adds another flavor \"([^\"]*)\" using filter by option$")
	public void user_adds_a_product_using_filter_by_option(String flavor_nicfree) throws Throwable {

		gl.VerifyElementVisible(Vype_CommonXpath.txtFilterby, "Filter by option");
		gl.clickbutton(Vype_CommonXpath.txtFilterby, "Filter by option");
		gl.VerifyElementVisible(Vype_CommonXpath.wePodsFilterlist, "Filter by list");
		gl.fnScrollToView(Vype_CommonXpath.txtTobaccoMints);
		gl.clickbutton(Vype_CommonXpath.txtTobaccoMints, "Tobacco & Mints from Filter by option");
		//gl.fnScrollToView(Vype_CommonXpath.txtGoldenTobacco);
		//gl.VerifyElementVisible(Vype_CommonXpath.txtGoldenTobacco, "Golden Tobacco Flavour");
		gl.VerifyElementVisible(Vype_CommonXpath.txtflavor(flavor_nicfree), "flavor - " + flavor_nicfree);
		gl.clickbutton(Vype_CommonXpath.txtflavor(flavor_nicfree), "Added flavor - " + flavor_nicfree);
		gl.VerifyElementVisible(Vype_CommonXpath.txtPackQuantity, flavor_nicfree + " - Add modal");
		gl.clickbutton(Vype_CommonXpath.btnQtyIncrement, "Added quantity");
		gl.clickbutton(Vype_CommonXpath.btnADD, "Add button in modal");
		gl.VerifyElementVisible(Vype_CommonXpath.txtflavorInOrderSummary(flavor_nicfree),
				"Flavour Added in Order Summary - " + flavor_nicfree);

	}

	@And("^User clicks on Submit Updates button$")
	public void user_clicks_on_Submit_Updates_button() throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.btnSubmitupdates);
		gl.clickbutton(Vype_CommonXpath.btnSubmitupdates, "Click on Submit updates button");

	}

	@Then("^Subscription should be modified with the newly added product$")
	public void subscription_should_be_modified_with_the_newly_added_product() throws Throwable {

		gl.waitTillElementVisible(Vype_CommonXpath.txtSubUpdate);
		gl.VerifyElementVisible(Vype_CommonXpath.txtSubUpdate, "Subscription update message");
		Thread.sleep(2000);

	}



	@When("^User confirms if user has active subscription$")
	public void user_confirms_if_user_has_active_subscription() throws Throwable {

		gl.HowerMouse(Vype_CommonXpath.btnAccount, "User Account");
		gl.VerifyElementVisible(Vype_CommonXpath.btnMySub, "Drop down displayed");
		gl.clickbutton(Vype_CommonXpath.btnMySub, "My Subscription button");
		Thread.sleep(2000);
		gl.VerifyElementVisible(Vype_CommonXpath.txtActiveSubscription, "Active Subscription");
		Thread.sleep(1000);
	}

	@When("^User selects additional product \"([^\"]*)\" for subscription and add to the cart$")
	public void user_selects_additional_product_for_subscription_and_add_to_the_cart(String flavor_additional)
			throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor_additional));
		function.chooseFlavourInePodPodsPage(flavor_additional);
		gl.clickUsingJs(Vype_CommonXpath.btnSubscribeAndSave, "SubSubscribe & Save");
		gl.fnScrollToView(Vype_CommonXpath.txtPack);
		gl.clickbutton(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");
		gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		Thread.sleep(2000);
		function.hoverCartAndClickViewCart();
		Thread.sleep(2000);
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(2000);

	}

	@When("^Draft Subscription Order should be discarded upon clicking on Discard button$")
	public void draft_Subscription_Order_should_be_discarded_upon_clicking_on_Discard_button() throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.lnkDiscard);

		Thread.sleep(1000);

		gl.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");

		gl.clickbutton(Vype_CommonXpath.lnkDiscard, "Link discard");

		gl.VerifyElementVisible(Vype_CommonXpath.txt1InDiscardSubModal, "Discard Subscription Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.txt2InDiscardSubModal, "Discard Subscription Modal text");

		gl.VerifyElementVisible(Vype_CommonXpath.btnYesDiscard,
				"yes, discard button is displayed in Discard Subscription Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.btnNoReturn,
				"No, return button is displayed in Discard Subscription Modal");

		gl.clickbutton(Vype_CommonXpath.btnNoReturn, "No, return button is clicked");
 
		gl.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");

		gl.clickbutton(Vype_CommonXpath.lnkDiscard, "Link discard");

		gl.VerifyElementVisible(Vype_CommonXpath.txt1InDiscardSubModal, "Discard Subscription Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.txt2InDiscardSubModal, "Discard Subscription Modal text");

		gl.VerifyElementVisible(Vype_CommonXpath.btnYesDiscard,
				"yes, discard button is displayed in Discard Subscription Modal");

		gl.VerifyElementVisible(Vype_CommonXpath.btnNoReturn,
				"No, return button is displayed in Discard Subscription Modal");

		gl.clickbutton(Vype_CommonXpath.btnYesDiscard, "yes, discard button is clicked");

		Thread.sleep(4000);

		gl.ScrollPageUp();

	}
	
	@When("^Click on Discard link$")
	public void click_on_Discard_link() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.lnkDiscard, "Link discard");

		gl.clickbutton(Vype_CommonXpath.lnkDiscard, "Link discard");
	}

	@Then("^Verify Discard Draft Subscription Order Pop Up displays$")
	public void verify_Discard_Draft_Subscription_Order_Pop_Up_displayes() throws Throwable {
	 
		gl.VerifyElementPresent(Vype_CommonXpath.txtdiscardpopup, "Discard pop up");
		
		gl.VerifyElementVisible(Vype_CommonXpath.txt2InDiscardSubModal, "Discard Subscription Modal text");

		gl.VerifyElementVisible(Vype_CommonXpath.btnYesDiscard,"yes, discard");

		gl.VerifyElementVisible(Vype_CommonXpath.btnNoReturn,"No, return button ");
	}

	@When("^Click on No Return Discard Draft Subscription Order Pop Up is closed$")
	public void click_on_No_Return_Discard_Draft_Subscription_Order_Pop_Up_is_closed() throws Throwable {
		
		gl.clickbutton(Vype_CommonXpath.btnNoReturn,"No, return button ");
		
		
	}
	
	@When("^Click on Yes, Discard button Draft subscription Order tile should be deleted and only Current Active subscription Tile should be present in the Subscription Page$")
	public void click_on_Yes_Discard_button_Draft_subscription_Order_tile_should_be_deleted_and_only_Current_Active_subscription_Tile_should_be_present_in_the_Subscription_Page() throws Throwable {
	    
		gl.clickbutton(Vype_CommonXpath.btnYesDiscard,"yes, discard");
		
		List<WebElement> list;
		String str="";
		String str1;
		
		//Verify that Active Subscription page displayed
		gl.VerifyElementPresent(Vype_SubscriptionLanding.txtActiveSubscription, "Active Subscription ");

		//Verify the user is able to see the Active Subscriptions with date,payment,address,selection
		list = gl.findElementsList(Vype_SubscriptionLanding.txtDatePayment);
		for(int i=0;i<list.size();i++){
			str = list.get(i).getText();
			str = str.replaceAll("[\\n\\t]", " ");
			gl.VerifyElementVisible(Vype_SubscriptionLanding.txtDatePayment,str+ " ");
		}
		List<WebElement> list2;
		list2 = gl.findElementsList(Vype_CommonXpath.txtsubscribeditems);
		System.out.println("Subscription includes: "+list2.size());
		for(int i=0;i<list2.size();i++){
			str1 = list2.get(i).getText();
			str1 = str1.replaceAll("[\\n\\t]", " ");
			gl.VerifyElementVisible(Vype_CommonXpath.txtsubscribeditems,str1+ " ");
		}

		String total=gl.getText(Vype_CommonXpath.subscriptiontotal);
		gl.VerifyElementPresent(Vype_CommonXpath.subscriptiontotal, total);

	}

	@When("^Draft Subscription Order should be submitted upon clicking on Submit Update button$")
	public void draft_Subscription_Order_should_be_submitted_upon_clicking_on_Submit_Update_button() throws Throwable {

		gl.clickbutton(Vype_CommonXpath.btnSubmitUpdate, "Click on Submit update button");
		Thread.sleep(4000);
		gl.VerifyElementVisible(Vype_CommonXpath.txtSubUpdate, "Subscription update message");

	}

	@And("^User closes the login modal$")
	public void user_closes_the_login_modal() throws Throwable {

		gl.clickUsingJs(Vype_CommonXpath.btnCloselogin, "Close login modal");
		Thread.sleep(2000);

	}

	@Then("^User is prompted to login to the application$")
	public void user_is_prompted_to_login_to_the_application() throws Throwable {

		
		Thread.sleep(2000);
		gl.waitTillElementVisible(Vype_CommonXpath.pgloginModal);
		gl.VerifyElementVisible(Vype_CommonXpath.pgloginModal, "Login Modal");
		gl.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Username textfield on Login Modal");
		gl.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot link on Login Modal ");
		gl.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button ");

	}

	@When("^user login with same email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_same_email_address_and_password(String username, String password) throws Throwable {

		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", username);

		gl.inputTextjavaScripfnPasswordencryption(rdriver,Vype_CommonXpath.txtPassword,  password);

		gl.clickbutton(Vype_CommonXpath.btnLogin, "Login button");

		Thread.sleep(2000);

		/*gl.fnScrollToView(Vype_Cart.pgCart);

		gl.VerifyPageDisplayed(Vype_Cart.pgCart, "Shipping Cart");

		gl.fnScrollToView(Vype_Cart.btnCheckOut);

		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");

		Thread.sleep(2000);*/

	}



	@When("^User adds product \"([^\"]*)\" to cart for one time purchase$")
	public void user_adds_product_to_cart_for_one_time_purchase(String flavor_Onetime) throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor_Onetime));
		function.chooseFlavourInePodPodsPage(flavor_Onetime);
		gl.fnScrollToView(Vype_CommonXpath.txtPack);
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnQtyIncrement, "Quantity Increment");
		Thread.sleep(2000);
		gl.clickbutton(Vype_CommonXpath.btnAddToCart,"Add to cart Button");
		function.hoverCartAndClickViewCart();
		Thread.sleep(2000);
	}

	

	@When("^User navigates to Cart page and verify Subscription discliamer message$")
	public void user_navigates_to_Cart_page_and_verify_Subscription_error_message() throws Throwable {

		function.hoverCartAndClickViewCart();

		Thread.sleep(2000);

		gl.ScrolltoTopofthepage();

		Thread.sleep(2000);

		//Verify Subscription Disclaimer message
		//gl.VerifyElementVisible(Vype_Common.weSubDisclaimer, "Sub Discliamer");

		Thread.sleep(2000);

	}

	@When("^User adds required flavor \"([^\\\"]*)\" and quantity \"([^\"]*)\" by continue shopping and add to the cart$")
	public void user_adds_required_quantity_by_continue_shopping_and_add_to_the_cart(String flavor_add, int quantity_add) throws Throwable {

		//Click on "Continue shopping" link in the "your cart" page.
		gl.clickbutton(Vype_Subscription.lnkContinueShopping, "Continue shopping");
		Thread.sleep(3000);

		//navigate to ePods page
		function.navigateToePodPods();

		gl.ScrollPageDown();

		//Verify subscribe and save section is displayed
		//gl.VerifyElementVisible(Vype_SubscriptionLanding.txtSubsandSave, "Subscribe and Save section");

		//Add required flavor and quantity
		//gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor_add));
		Thread.sleep(2000);
		function.chooseFlavourInePodPodsPage(flavor_add);

		gl.ScrolltoTopofthepage();

		//verify Subscribe and One time Purchase buttons
		function.verifyOneTimeAndSubscribeButtonforePenPodPage();

		//Click Subscribe and Save option
		gl.clickUsingJs(Vype_CommonXpath.btnSubscribeAndSave, "SubSubscribe & Save");
		gl.fnScrollToView(Vype_CommonXpath.txtPack);

		//Add required quantity
		gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnQtyIncrement, quantity_add, "Add Quantity");

		//Click on Subscribe and Save
		gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");

	}

	@When("^User navigates from Cart page and verify Subscription Start Date in Checkout$")
	public void user_navigates_to_Cart_page_and_verify_Subscription_Start_Date() throws Throwable {

		//Verify mini cart is updated
		String str = gl.getText(Vype_CommonXpath.txtnumber);
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtnumber, "Cart is updated with "+ str+" number ");

		//navigate to Cart page
		function.hoverCartAndClickViewCart();

		//verify the "Select your Subscription start day" with the day selection field is displayed
		//gl.VerifyObjectDisplayed(Vype_Cart.txtSelectYourSubscription,"Select your Subscription start day: ");
		//gl.VerifyElementVisible(Vype_Cart.weDateField, "Date Field ");



	}

	@When("^User navigates to ePod page and adds a product \"([^\\\"]*)\" for one time purchase$")
	public void user_navigates_to_ePod_page_and_adds_a_product_for_one_time_purchase(String flavor_onetime) throws Throwable {

		//Click on "Continue shopping" link in the "your cart" page.
		gl.clickbutton(Vype_Subscription.lnkContinueShopping, "Continue shopping");
		Thread.sleep(3000);

		//navigate to ePods page
		function.navigateToePodPods();

		gl.ScrollPageDown();

		//Verify subscribe and save section is displayed
		//gl.VerifyElementVisible(Vype_SubscriptionLanding.txtSubsandSave, "Subscribe and Save section");

		//navigate to flavor page
		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor_onetime));
		function.chooseFlavourInePodPodsPage(flavor_onetime);

		//Add a flavor for one time purchase
		function.addQuantityForOneTimePurchaseforePodPods();


	}

	@When("^User navigates to Cart page and verify Cart Summary page with Subscription and one time purchase$")
	public void user_navigates_to_Cart_page_and_verify_Cart_Summary_page_with_Subscription_and_one_time_purchase() throws Throwable {

		function.hoverCartAndClickViewCart();

		//	function.verifyItemsInCartPage();

		//	function.verifyCartSummaryforSubscriptionAndOneTimeOrders();

	}

	@Then("^Order should be submitted and Subscription should be created newly$")
	public void Order_should_be_submitted_and_Subscription_should_be_created_newly() throws Throwable {

		gl.waitTillElementVisible(Vype_CommonXpath.weOrderConfirmation);
		gl.VerifyElementVisible(Vype_CommonXpath.weOrderConfirmation, "Order Successfully created");

	}

	@Then("^Verify various Subscription Discounts offered when quantity is increased$")
	public void verify_various_Subscription_Discounts_offered_when_quantity_is_increased() throws Throwable {

		gl.ScrolltoTopofthepage();

		Thread.sleep(2000);

		gl.ScrollPageDown();

		function.verifyQuantityandSubDiscount(Vype_CommonXpath.btnQtyIncrement, 18, "Add Quantity");

	}

	@When("^User selects required product \"([^\"]*)\" with required quantity \"([^\"]*)\" for subscription and add to the cart$")
	public void user_selects_required_product_with_required_quantity_for_subscription_and_add_to_the_cart(String flavor, int quantity) throws Throwable {


		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor));
		function.chooseFlavourInePodPodsPage(flavor);
		gl.ScrolltoTopofthepage();
		gl.ScrollPageDown();
		gl.clickUsingJs(Vype_CommonXpath.btnSubscribeAndSave, "SubSubscribe & Save");
		gl.fnScrollToView(Vype_CommonXpath.txtPack);
		gl.clickbuttonTillElementValueReaches(Vype_CommonXpath.btnQtyIncrement, quantity, "Add Button");
		gl.VerifyElementPresent(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		gl.clickbutton(Vype_CommonXpath.lnkSubscribeAndSave, "Subscribe & Save");
		Thread.sleep(2000);

	}




}
