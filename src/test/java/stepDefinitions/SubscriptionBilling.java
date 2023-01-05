package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.GenericLib;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Subscription;

public class SubscriptionBilling {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	GenericLib gL = new GenericLib();
	
	@Then("^Creating subscription$")
	public void createing_subscription() throws Throwable {
		gl.clickbutton(Vype_Subscription.pgeSubscribeAndSave, "SubSubscribe & Save");
		//Scroll to view quality
		gl.fnScrollToView(Vype_Subscription.txtPack);
		//click on plus button Nicotine strength 0mg/ml
		for(int i=0; i<2; i++)
			gl.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Add Button");

		//verify subscribe and save option is enabled.
		gl.VerifyElementPresent(Vype_Subscription.lnkSubscribeAndSave, "Subscribe & Save");
		//click on subscribe & save.
		gl.clickUsingJs(Vype_Subscription.lnkSubscribeAndSave, "Subscribe & Save");
	}

	@Then("^Verify Subscription page and Cancle the order$")
	public void verify_Subscription_page_and_Cancle_the_order() throws Throwable {
		gl.VerifyPageDisplayed(Vype_Subscription.txtActiveSubscription, "Subscription");
		//gl.ScrollPageDown();
		//Verify user can see date Date,Payment,Address,Your Selection,"Edit" link is present.
		gl.VerifyElementPresent(Vype_Subscription.txtSubscriptionDetails, "Subscription details");

		//Verify under the "Your selection" , user is able to add/remove the quantity of the items by clicking on "+" or "-" buttons
		//gl.clickbutton(Vype_Subscription.btnPlusSubscription, "Add/Modify Items");
		Thread.sleep(5000);

		//Click on save button.
		//gl.clickbutton(Vype_Subscription.txtsubmitupdates, "Submit updates");

		//Scroll to view edit button
		gl.fnScrollToView(Vype_Subscription.btnPlusSubscription);

		//Verify the links for Pause or stop Subscription is displayed.
		gl.VerifyObjectDisplayed(Vype_Subscription.txtPauseAndStop, "Pause or Stop");

		//Click on Pause link
		gl.clickbutton(Vype_Subscription.lnkPause, "Pause");

		//Verify "Pause subscription" pop up modal with the text "Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.
		gl.VerifyObjectDisplayed(Vype_Subscription.txtPauseMessage, "Are you sure you want to pause");

		//Verify yes pause subscription link.
		gl.VerifyElementPresent(Vype_Subscription.lnkYesPauseSubscription, "Yes Pause Subscription");

		//Verify no return link
		gl.VerifyElementVisible(Vype_Subscription.lnkNoReturn, "No Return");

		//click on 'x' or no return
		gl.clickbutton(Vype_Subscription.lnkNoReturn, "No return");

		//Verify pop up is closed.

		//Click on cancel link.
		gl.clickbutton(Vype_Subscription.lnkCancel, "Cancel");

		//Verify cancel subscription pop up modal is displayed.
		gl.VerifyObjectDisplayed(Vype_Subscription.txtCancelSubscription, "Cancel Subscription");

		//Verify text "are you sure you want to cancel your recurring subscription".
		gl.VerifyElementPresent(Vype_Subscription.txtCancelMessage, "Are you sure want to cancel");
		//Verify yes cancel button.
		gl.VerifyElementVisible(Vype_Subscription.lnkYesCancel, "Yes Cancel");

		//Verify no return button.
		gl.VerifyElementVisible(Vype_Subscription.lnkNoreturn, "No return");

		//Click on 'x' or no return
		gl.clickbutton(Vype_Subscription.lnkNoreturn, "No return");
	}
}
