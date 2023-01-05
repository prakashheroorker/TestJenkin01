package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Subscription;


public class SubscriptionPlanManagement {



	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@When("^User navigates to my account from home page$")
	public void user_navigates_to_my_account_from_home_page() throws Throwable {
		gl.clickbutton(goVype_Properties.Vype_CommonXpath.btnAccount, "My account");

		//Verify user is redirected to user account page, by default in Rewards tab.
	    //gl.clickElement(goVype_Properties.Vype_SubscriptionLanding.txtRewards, "Rewards");

	}
	
	@When("^User clicks on My Subscription and verifies details$")
	public void user_clicks_on_My_Subscription_and_verifies_details() throws Throwable {
		//Click on subscription section.
		gl.clickbutton(Vype_Subscription.lblSubscription, "Subscription");

	
		//Subscription page is opened.
		gl.VerifyPageDisplayed(Vype_Subscription.txtActiveSubscription, "Subscription");
		
		//Verify user can see date Date,Payment,Address,Your Selection,"Edit" link is present.
		//gl.VerifyElementPresent(Vype_Subscription.txtSubscriptionDetails, "Subscription details");

		//Click on Edit
		gl.clickbutton(Vype_Subscription.btnEdit, "Edit");

	}
	@Then("^user Verifies UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\"$")
	public void user_Verifies_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		gl.isEnabled(Vype_Subscription.txtDatePayemtAndShipping, "Date,Payment,And Shipping");
		
		
		//Click on save button.
		gl.VerifyPageDisplayed(Vype_Subscription.btnupdate, "update");

		
		//verify edit page
        gl.clickbutton(Vype_Subscription.btncancel, "cancel");
		
      //Verify the Date, Payment, Shipping Address are editable and allow the user to edit the fields.
       /* gl.isEnabled(Vype_Subscription.txtDatePayemtAndShipping, "Date,Payment,And Shipping");

		 //verify edit page
       gl.VerifyPageDisplayed(Vype_Subscription.btncancel, "Details Page");
      
     
        //Verify under the "Your selection" , user is able to add/remove the quantity of the items by clicking on "+" or "-" buttons
        gl.clickbutton(Vype_Subscription.btnPlusSubscription, "Add");
       
        //Click on save button.
        gl.clickbutton(Vype_Subscription.txtsubmitupdates, "Submit update");*/
		

	}

	@Then("^user Verifies the links for Pause or stop Subscription is displayed$")
	public void user_Verifies_the_links_for_Pause_or_stop_Subscription_is_displayed() throws Throwable {
		gl.VerifyObjectDisplayed(Vype_Subscription.txtPauseAndStop, "Pause or Stop");

		//Click on Pause link
		gl.clickbutton(Vype_Subscription.lnkPause, "Pause");
		
		//gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");

		//Verify "Pause subscription" pop up modal with the text "Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.
		gl.VerifyObjectDisplayed(Vype_Subscription.txtPauseMessage, "Are you sure you want to pause");

		//Verify yes pause subscription link.
		gl.VerifyElementPresent(Vype_Subscription.lnkYesPauseSubscription, "Yes Pause Subscription");    

		//Verify no return link
		gl.VerifyElementVisible(Vype_Subscription.lnkNoReturn, "No Return");

		//click on 'x' or no return
		gl.clickbutton(Vype_Subscription.lnkNoReturn, "No return");

	}

	@Then("^user Clicks on cancel link$")
	public void user_Clicks_on_cancel_link() throws Throwable {
		//Click on cancel link.
		gl.clickbutton(Vype_Subscription.lnkCancel, "Cancel");
		gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");

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