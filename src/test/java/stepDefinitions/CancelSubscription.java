package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties.*;

public class CancelSubscription {


	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


	@When("^Howers on profile icon and navigates to subscription in MyAccount page$")
	public void Howers_on_profile_icon_and_navigates_to_subscription_in_MyAccount_page() throws Throwable {

		//Navigate to My Account page
		function.navigateToMyAccountFromHome();

		//Click on Subscription
		gl.clickbutton(Vype_CommonXpath.lblSubscription, "Subscription");
	}


	@Then("^Resume the paused subscription$")
	public void resume_the_paused_subscription() throws Throwable {

		//Verify paused bscription
		gl.VerifyElementPresent(Vype_CommonXpath.btnresume, "Resume");
		
		gl.clickUsingJs(Vype_CommonXpath.btnresume, "Resume ");
		
		//Verify Subscription is successfully updated msg is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.weSubscriptionUpdated,"Subscription updated ");
		
		

	}


	@And("^Navigate to profile and Delete card present in profile page$")
	public void navigate_to_profile_and_Delete_card_present_in_profile_page() throws Throwable {

		//Navigate to My Account page
		function.deletecard();


	}

	@Then("^Verify Active subscription and pause the subscription$")
	public void verify_Active_subscription_and_pause_the_subscription() throws Throwable {

		function.pauseActiveSubscription();
	}


	/*@Then("^Cancel the subscription$")
	public void cancel_the_subscription() throws Throwable {
	function.CancelActiveSubscription();
	}
*/

	//Updated Bhavitha
	@Then("^Verify subscription is canceled$")
	public void verify_subscription_is_canceled() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtSubscriptionCancelInfo, "You have no subscription plan yet");
	}

	@Then("^Verify Saved card is deleted$")
	public void verify_Saved_card_is_deleted() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.PaymentDeleted,"Payment card is deleted");
	}
}
