package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.*;

public class Benefits {

	String couponCodeTxt =""; 
	int cnt=0; 
	boolean couponHit = false;


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^User click on hamberger menu and clicks on My Rewards$")
	public void user_click_on_hamberger_menu_and_clicks_on_My_Rewards() throws Throwable {

		//Navigate to rewards page
		function.viewRewardspage();

	}
	@Then("^verify platinum status and other \"([^\"]*)\"$")
	public void verify_platinum_status_and_other(String Benefits) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	//verify Platinum benefits
	rai.ScrollByxpath(Vype_PlatinumProfileTrigger.platniumbenfits);
	rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.platniumbenfits, "Platinum Benfits displaye");
	

	}
	@And("^verify platinum status and other benefits in rewards page$")
	public void verify_platinum_status_and_other_benefits_in_rewards_page() throws Throwable {

		//verify congrats message
		String s=rai.getText(Vype_CommonXpath.txtcongrats);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtcongrats, s);

		//Verify Whether Platinum Card Is Displayed
		String platinumText = rai.getText(Vype_PlatinumProfileTrigger.wePlatinumCard);

		//verify platinum card
		if(platinumText.equalsIgnoreCase("platinum")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.wePlatinumCard, "Platinum Card Is Displayed");

		}

		//scroll to discounts
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.discounts);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.discounts, "Platinum discounts");

		//Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

	}
	@Then("^click on go to billing and verify shipping is free$")
	public void click_on_go_to_billing_and_verify_shipping_is_free() throws Throwable {

		//Click on Go to Billing button
		rai.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.lnkShowOrderSummary);

		//Show order summary
		rai.clickUsingJs(Vype_PlatinumProfileTrigger.lnkShowOrderSummary, "Show Order Summary");

		//Scroll by Shipping value
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.shippingValue);

		//Verify Whether Shipping Is Free
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.shippingValue, "Shipping Is Free");

	}



	@Then("^verify Gold status and other benefits in rewards page$")
	public void verify_Gold_status_and_other_benefits_in_rewards_page() throws Throwable {

		//Verify congrats message
		String s=rai.getText(Vype_CommonXpath.txtcongrats);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtcongrats, s );

		//verify gold card
		rai.VerifyElementsVisible(Vype_CommonXpath.txtgoldcard, "Gold card ");

		//scroll to discounts
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.discounts);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.discounts, "Platinum discounts");

		//Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		//Status progress
		rai.ScrollByxpath(Vype_CommonXpath.txtstatus);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtstatus, "Status bar ");




	}

	@Then("^verify user status in rewards page$")
	public void verify_user_status_in_rewards_page() throws Throwable {

		//Verify congrats message
		String s=rai.getText(Vype_CommonXpath.txtcongrats);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtcongrats, s );


		//Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		//Status progress
		rai.ScrollByxpath(Vype_CommonXpath.txtstatus);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtstatus, "Status bar ");
	}

	@Then("^verify silver status and other benefits in rewards page$")
	public void verify_silver_status_and_other_benefits_in_rewards_page() throws Throwable {

		//Verify congrats message
		String s=rai.getText(Vype_CommonXpath.txtcongrats);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtcongrats, s );

		//verify gold card
		rai.VerifyElementsVisible(Vype_CommonXpath.txtsilvercard, "Gold card ");

		//scroll to discounts
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.discounts);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.discounts, "Platinum discounts");

		//Other benefits
		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.txtBenifits);
		rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.txtBenifits, "Your Other benefits ");

		//Status progress
		rai.VerifyElementsVisible(Vype_CommonXpath.txtstatus, "status bar ");
	}


	@Then("^verify discount is not applied$")
	public void verify_discount_is_not_applied() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtcartsummary);

		
		//verify discount is not visible
		boolean b=rai.verifyobjectisnotavailable(Vype_CheckOut.txtDiscount);
		
		if(b==true)
		{
			System.out.println("Discount is not present  ");
			rai.VerifyElementsVisible(Vype_CommonXpath.txtcartsummary, "Discount is not present ");
		}
		if(b==false)
		{
			System.out.println("Discount is present  ");
			rai.VerifyElementsVisible(Vype_CommonXpath.txtcartsummary, "Discount is present ");
		}
		
	}

	
	
	//Benefits of status2
	
	
	@Then("^User Verifies Your Status$")
	public void user_Verifies_Your_Status() throws Throwable {
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Click on Menu");
		
		//click on rewards
		rai.clickLink(Vype_CommonXpath.pgRewards, "Rewards Page");

	    }

	@Then("^User click on hamberger menu and clicks on Save$")
	public void user_click_on_hamberger_menu_and_clicks_on_Save() throws Throwable {
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Click on Menu");
		//Hover the mouse on Products link
		rai.clickLink(Vype_CommonXpath.lnkSave, "Saves link from the main menu navigation");
		//rai.ClickUsingOCR("Save");
		//Verify the Submenu  Programs is loaded
		rai.VerifyPageObject(Vype_CommonXpath.lnkPrograms, "Programs ");

			
	    
	}

	@Then("^User click on Vuse\\+ Rewards under Programs$")
	public void user_click_on_Vuse_Rewards_under_Programs() throws Throwable {
	   rai.clickbutton(Vype_CommonXpath.lnkrewards,"rewards");
	   
	}

	@Then("^User Verifies Vuse\\+ Rewards page is Displayed$")
	public void user_Verifies_Vuse_Rewards_page_is_Displayed() throws Throwable {
	    rai.VerifyPageObject(Vype_CommonXpath.txtvuserewards,"content");
	    
	}

	@When("^User Click on find your status button$")
	public void user_Click_on_find_your_status_button() throws Throwable {
	    
		rai.ScrollByxpath(Vype_CommonXpath.lnkcheckstatus);
		
		rai.clickbutton(Vype_CommonXpath.lnkcheckstatus,"check status" );
	    
	}

	@Then("^User Verify Reward page is displayed with relevent content$")
	public void user_Verify_Reward_page_is_displayed_with_relevent_content() throws Throwable {
	   
		rai.VerifyPageObject(Vype_CommonXpath.txtcheckstatus,"content");
	}


	@When("^Click on orders and Verify order Page Content$")
	public void click_on_orders_and_verify_order_Page_Content() throws Throwable {
	    
	   rai.clickbutton(Vype_CommonXpath.btnorders, "orders"); 
	   rai.VerifyElementVisible(Vype_CommonXpath.txtOrderNumber, "Order Page");
	   rai.VerifyElementVisible(Vype_CommonXpath.txtOrderNumber, "Order Number");
	   rai.VerifyElementVisible(Vype_CommonXpath.txtOrderDate, "Order Date");
	   rai.VerifyElementVisible(Vype_CommonXpath.txtTotalDollarValue, "Total $ Value");
	   rai.VerifyElementVisible(Vype_CommonXpath.lnkReOrder, "Re-Order");
	}

	

	@Then("^Click on profile and enter details and verify unsubscribe text$")
	public void click_on_profile_and_enter_details_and_verify_unsubscribe_text() throws Throwable {
		rai.clickbutton(Vype_CommonXpath.btnprofile, "Profile");
		rai.VerifyElementVisible(Vype_CommonXpath.txtEmailAddress, "Emailaddress");
		rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Password");
		rai.VerifyElementVisible(Vype_CommonXpath.txtIfUnSubscribe, "content");
		rai.clickbutton(Vype_CommonXpath.btnUnSubscribe, "If You UnSubscribe");
		
	    
	}

	
	
}
