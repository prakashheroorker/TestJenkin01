package stepDefinitions_Mobile;



import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.Vype_CommonXpath;

public class CancelSubscription {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@Then("^verify active subscription and pause the subscription$")
	public void verify_active_subscription_and_pause_the_subscription() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Thread.sleep(3000);
		// Click on Subscription
		rai.clickbutton(Vype_CommonXpath.lblSubscription, "Subscription");

		 // Subscription page is opened.
		rai.VerifyElementsVisible(Vype_CommonXpath.txtActiveSubscription, "Subscription");

		// Click on Edit
		// gl.clickbutton(Vype_CommonXpath.txtEdit, "Edit");

		rai.SwipeDownSmallerUnits(2);
		// Click on Pause link
	    rai.clickbutton(Vype_CommonXpath.lnkPause, "Pause");

					
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPauseMessage, "Are you sure you want to pause");

		// Verify yes pause subscription link.
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

		// Verify no return link
		rai.VerifyElementVisible(Vype_CommonXpath.lnkNoReturn, "No Return");

		// click on 'x' or no return
		rai.clickbutton(Vype_CommonXpath.lnkNoReturn, "No return");

					
		// Click on Pause link
		rai.clickbutton(Vype_CommonXpath.lnkPause, "Pause");

					
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPausePopupModal,"Are you sure you want to pause recurring subscription");

		// Verify yes pause subscription.
		rai.VerifyElementVisible(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

		// Verify no, return.
		rai.VerifyElementsVisible(Vype_CommonXpath.lnkNoReturn, "No Return");

		// Click on link YesPauseSubscription
		rai.clickbutton(Vype_CommonXpath.lnkYesPauseSubscription, "Yes Pause Subscription");

		// Confirmation of the subscription Pause displayed.
		//rai.VerifyElementsVisible(Vype_CommonXpath.txtPauseConformation, "Paused subscription");

	}

	@Then("^resume the paused subscription$")
	public void resume_the_paused_subscription() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Verify paused subscription
		rai.VerifyElementsVisible(Vype_CommonXpath.btnresume, "Resume");
				
		rai.clickUsingJs(Vype_CommonXpath.btnresume, "Resume ");
				
		//Verify Subscription is successfully updated message is displayed
		//rai.VerifyElementVisible(Vype_CommonXpath.weSubscriptionUpdated,"Subscription updated");
				
	}
	
	
	//Updated Bhavitha
	
	@Then("^Verify Subscription page$")
	public void verify_Subscription_page() throws Throwable {
		function.verifySubscriptionConfirmationPage();
	}

	@Then("^Verify that there is no subscription$")
	public void verify_that_there_is_no_subscription() throws Throwable {
		rai.VerifyElementVisible(Vype_CommonXpath.txtSubscriptionCancelInfo, "You have no subscription plan yet");
	}
	
	
	
	
}	
	

	
	
	
	
	
	
	
