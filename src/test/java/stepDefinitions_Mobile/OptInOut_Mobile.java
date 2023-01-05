package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties.Vype_Registration;
import goVype_Properties_mobile.Vype_RevampRewards_Mobile;

public class OptInOut_Mobile {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	@Then("^Scroll down to the opt out content$")
	public void scroll_down_to_the_opt_out_content() throws Throwable {
		//Scrolling to view opt out toggle
		rai.ScrollByxpath(Vype_RevampRewards_Mobile.optouttoggle);
	   //rai.SwipeDownSmallerUnits(13);
	   //Verifying the opt out content
	   rai.VerifyElementVisible(Vype_RevampRewards_Mobile.optoutcontent,"Opt out content");
	}
	@Then("^Verify the Rewards Page$")
	public void verify_the_Rewards_Page() throws Throwable {
		//Verifying the current tier
		 rai.VerifyElementVisible(Vype_RevampRewards_Mobile.currenttier,"Current Tier");
		 //Verifying the benefits
		 rai.VerifyElementVisible(Vype_RevampRewards_Mobile.benefits,"Benefits");
		//Verifying the perks
		 rai.VerifyElementVisible(Vype_RevampRewards_Mobile.perks,"Perks");
		//Verifying the achievements
		 rai.VerifyElementVisible(Vype_RevampRewards_Mobile.achievements,"Achievements");
		//Verifying the History
		 rai.VerifyElementVisible(Vype_RevampRewards_Mobile.history,"History");
	}
	@Then("^Clicking on Register$")
	public void clicking_on_Register() throws Throwable {
		rai.SwipeDownSmallerUnits(3);
		//Verifying the register
		rai.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");
		//Clicking register
		rai.clickbutton(Vype_Registration.btnRegister, "Registration button");
		
	}
	@Then("^Select on opt out from rewards loyalty program$")
	public void select_on_opt_out_from_rewards_loyalty_program() throws Throwable {
		rai.clickbutton(Vype_RevampRewards_Mobile.optouttoggle,"Opt out toggle");
		Thread.sleep(5000);
		//Verifying the join now button
		/*rai.VerifyElementVisible(Vype_RevampRewards_Mobile.btnremindlater, "Remind Me Later");
		//click on close for the pop uo
		rai.clickbutton(Vype_RevampRewards_Mobile.btnClose,"Close");*/
		rai.SwipeUpSmallerUnits(3);
		//Verifying the join now button
		rai.VerifyElementVisible(Vype_RevampRewards_Mobile.btnJoinnow, "Join button");
		//Verifying optin banner
		rai.VerifyElementVisible(Vype_RevampRewards_Mobile.optincontent, "Optin Content");
	
		
	}
	@Then("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		
		//Scroll
		rai.ScrollByxpath(Vype_Registration.btnRegister);

		// Verifying the register
		rai.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");

		// Clicking register
		rai.clickbutton(Vype_Registration.btnRegister, "Registration button");
	}

}
	
