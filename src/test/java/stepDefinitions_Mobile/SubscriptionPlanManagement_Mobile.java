package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import goVype_Properties_mobile.*;

public class SubscriptionPlanManagement_Mobile {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@When("^verify subscription page in user account section$")
	public void verify_subscription_page_in_user_account_section() throws Throwable {
	
		        //current Active subscription
				rai.VerifyElementsVisible(Vype_CommonXpath.txtActiveSubscription, "Current Active subscription ");

				//your subscribed items
				String s=rai.getText(Vype_CommonXpath.txtsubscribeditems);
				rai.VerifyElementsVisible(Vype_CommonXpath.txtsubscribeditems, s);

				//subscription total
				String s1=rai.getText(Vype_CommonXpath.subscriptiontotal);
				rai.VerifyElementsVisible(Vype_CommonXpath.subscriptiontotal, s1);

				//shipping date
				String s2=rai.getText(Vype_CommonXpath.txtshippingdate);
				rai.VerifyElementsVisible(Vype_CommonXpath.txtshippingdate, s2);
				
				rai.clickbutton(Vype_CommonXpath.btneditdetails, "edit details");

			

	}
	@Then("^user Verify UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\"$")
	public void user_Verify_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		rai.isEnabled(Vype_CommonXpath.txtDatePayemtAndShipping, "Date,Payment,And Shipping");
		
		//Click on save button.
		rai.VerifyElementVisible(Vype_CommonXpath.btnupdate, "update");

		//verify edit page
		rai.clickbutton(Vype_CommonXpath.btncancel, "cancel");
		
     

	}

	@Then("^user Verify the links for Pause or stop Subscription is displayed$")
	public void user_Verify_the_links_for_Pause_or_stop_Subscription_is_displayed() throws Throwable {
		rai.VerifyElementVisible(Vype_CommonXpath.btnPauseSubscription, "Pause or Stop");

		//Click on Pause link
		rai.clickbutton(Vype_CommonXpath.btnPauseSubscription, "Pause");
		
		//gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");

		//Verify "Pause subscription" pop up modal with the text "Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.
		rai.VerifyElementVisible(Vype_CommonXpath.txtPauseMessage, "Are you sure you want to pause");

		//Verify yes pause subscription link.
		rai.VerifyElementVisible(Vype_CommonXpath.btnYesPause, "Yes Pause Subscription");    

		//Verify no return link
		rai.VerifyElementVisible(Vype_CommonXpath.lnkNoReturn, "No Return");

		//click on 'x' or no return
		rai.clickbutton(Vype_CommonXpath.lnkNoReturn, "No return");

	}

	@Then("^user clicks on cancel link$")
	public void user_clicks_on_cancel_link() throws Throwable {
		//Click on cancel link.
		rai.clickbutton(Vype_CommonXpath.lnkCancel, "Cancel");
		
		//For Feedback pop-up
		rai.ClickUsingOCR("No, return");
		

		//Verify cancel subscription pop up modal is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.txtCancelSubscription, "Cancel Subscription");

		rai.clickbutton(Vype_CommonXpath.lnkCancel, "Cancel");
		//Verify text "are you sure you want to cancel your recurring subscription".
		rai.VerifyElementVisible(Vype_CommonXpath.txtCancelMessage, "Are you sure want to cancel");

		//Verify yes cancel button.
		rai.VerifyElementVisible(Vype_CommonXpath.lnkYesCancel, "Yes Cancel");

		//Verify no return button.
		rai.VerifyElementVisible(Vype_CommonXpath.lnkNoreturn, "No return");

		//Click on 'x' or no return
		rai.clickbutton(Vype_CommonXpath.lnkNoreturn, "No return");


		
	}
	
	


}
