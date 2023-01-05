package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;


public class BusinessWorkflows {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^User clicks on hamberger menu and clicks on Save and clicks on subscribe and save under programs$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Save_and_clicks_on_subscribe_and_save_under_programs() throws Throwable {

		function.navigateToeProgramSubscribeandsave();
	}

	@Then("^user scrolls to subscribe now and clicks on subscribe now and verify ePod Vape Pod Subscription page$")
	public void user_scrolls_to_subscribe_now_and_clicks_on_subscribe_now_and_verify_ePod_Vape_Pod_Subscription_page() throws Throwable {

		//scroll to subscribe now
		rai.ScrollByxpath(Vype_CommonXpath.btnsubscribenow);

		//click on subscribe now
		rai.clickUsingJs(Vype_CommonXpath.btnsubscribenow, "Subscribe now ");

		//Verify the user is navigated to the new cartridge page i.e,, VUSE PODS Page
		rai.VerifyElementsVisible(Vype_CommonXpath.txtVusePodsubscription,"Vuse Pods ");


	}

	@Then("^add quantity click on Subscribe and save and click on subscribe and save$")
	public void add_quantity_click_on_Subscribe_and_save_and_click_on_subscribe_and_save() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.btnsubscribeSave);
		
		rai.VerifyElementsVisible(Vype_CommonXpath.btnsubscribeSave, "Subscribe and save");
		
		//rai.ScrollByxpath(Vype_CommonXpath.btnstrength);

		for(int i=0;i<5;i++)
		{
			rai.clickUsingJs(Vype_CommonXpath.btnstrength, "+ ");
		}


		String total = rai.getText(Vype_CommonXpath.wetxtTotalvalue1);
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtTotalvalue1, "Total value is " + total +" after adding nicotine strength");

		//Verify subscribe and Save button should enabled
		rai.isEnabled(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and Save");

		//click on subscribe and save
		rai.clickbutton(Vype_CommonXpath.btnSubscribeandSave, "Subscribe and save");

		Thread.sleep(5000);

		//Verify Cart is updated
		String num = rai.getText(Vype_CommonXpath.quantity);

		//verify total after items add to cart
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtTotalvalue1, "Total value is " + num +" after adding nicotine strength");

	}
	
	
	@Then("^User click on hamberger menu and clicks on My Subscription$")
	public void user_click_on_hamberger_menu_and_clicks_on_My_Subscription() throws Throwable {
	    
		function.navigateToMysubsription();
	}

	@Then("^verify user has no active subscription and click on browse catridges$")
	public void verify_user_has_no_active_subscription_and_click_on_browse_catridges() throws Throwable {
	    
		 // verify there are no existing subscriptions
        rai.VerifyElementVisible(Vype_CommonXpath.txtnosubscription, "You have no subscription plan yet");
        //click on browse catridges
        rai.clickbutton(Vype_CommonXpath.lnkBrowseCartridges, "Browse Cartridges");
	}

	@And("^verify epod pods subscription page$")
	public void verify_epod_pods_subscription_page() throws Throwable {
	    
		//Verify the user is navigated to the new cartridge page i.e,, VUSE PODS Page
		rai.VerifyElementsVisible(Vype_CommonXpath.txtVusePodsubscription,"Vuse Pods ");
	}
}
