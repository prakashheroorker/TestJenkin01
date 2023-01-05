package stepDefinitions_Mobile;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties_mobile.Vype_Common;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_ConditionsOfSale;
import goVype_Properties_mobile.Vype_PlatinumProfileTrigger;
import goVype_Properties_mobile.Vype_Registration;
import goVype_Properties_mobile.Vype_VuseplusRewards_Opt_in;

public class VuseplusRewards_Opt_in {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	  //****************Registration*************************//


	@When("^Clicked on Login or Signup$")
	public void clicked_on_Login_or_Sign_up() throws Throwable {

		// Click on "Login/Register" button
		//rai.clickbutton(Vype_CommonXpath.btnLoginorRegister, "Login or Register");

		// Verify that Register modal is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registrationModal");

		// Click on Login button
		rai.clickbutton(Vype_CommonXpath.btnLoginRegisterModal, "Registration modal login");

		// Verify that Login modal is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Username textfield on Login Modal");

	}

	@Then("^verify and click on login element$")
	public void verify_and_click_on_login_elements() throws Throwable {

		// Validate Registration Page Is Displayed
		rai.VerifyElementVisible(Vype_Common.btnLoginRegisterModal, "Register Page");

		// Click Login Button
		rai.clickbutton(Vype_Common.btnLoginRegisterModal, "Login Button In Registration Page");

		// Verify Email Address Field
		rai.VerifyElementVisible(Vype_Common.txtUsername, "Email Address Present");

		// Verify Password Field
		rai.VerifyElementVisible(Vype_Common.txtPassword, "Password Present");

		// Verify Forgot? Link
		rai.VerifyElementVisible(Vype_ConditionsOfSale.lnkForgot, "Forgot Present");

		// Validate x to close browser
		//rai.VerifyElementVisible(Vype_PlatinumProfileTrigger.btnCloseRegistrationPage,
	  //"Close Button For Registration Page");

		// Validate Login Button
		rai.VerifyElementVisible(Vype_Common.btnLogin, "Login Button Present");

	}

	@Then("^Entering dob \"([^\"]*)\" ,address \"([^\"]*)\" and Phone number \"([^\"]*)\"$")
	public void entering_dob_address_and_Phone_number(String DOB, String ADD, String PhNo) throws Throwable {

	 function.EnterDOB_ADD_Phno(DOB, ADD, PhNo);

	}

	@Then("^click on sign up for registration process$")
	public void click_on_signup_for_registration_process() throws Throwable {
		// Sign Up Link
		rai.clickbutton(Vype_PlatinumProfileTrigger.btnSignUpInLoginPage, "Sign Up Button");
	}

	@When("^Signing with new email address EmailID and password \"([^\"]*)\"$")
	public void signing_with_new_email_address_and_password(String pwd) throws Throwable {
		int length = 8;
		boolean useLetters = true;
		boolean useNumbers = false;
		String EmailID = RandomStringUtils.random(length, useLetters, useNumbers) + "@bat.com";

		System.out.println(EmailID);
		
		
		function.signup(EmailID, pwd);
		Thread.sleep(2000);
		//rai.HowerMouse(Vype_CommonXpath.btnNext, "Next button");
		rai.clickUsingJs(Vype_CommonXpath.btnNext,"Next btn");
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" in Register page$")
	public void entering_and(String FN, String LN) throws Throwable {
		
		function.EnterFirst_Last_Name(FN, LN);
	}

	@Then("^checking the conditions checkbox$")
	public void checking_the_conditions() throws Throwable {
		// Scroll down
		// gl.fnScrollToView(Vype_Registration.txtRentalPin);
		rai.ScrolltoTopofthepage();

		// Check the Yes I want to receive information check box
		rai.clickbutton(Vype_Registration.chkBoxYesIWantToReceiveInformation,
				"Yes I want to receive information check box");

		// Check I acknowledge that i read and understood Terms and Condition check box
		rai.clickUsingJs(Vype_Registration.chkBoxIAcknowledgeThatIRead,
				"I acknowledge that i read and understood Terms and Condition check box");
		Thread.sleep(5000);

		rai.VerifyElementVisible(Vype_Registration.vuserewardsloyaltyprogram,
				"Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards");

	}
  //****************For Vuse+ Plus Rewards*************************//
	@And("^User unselect the checkbox for vuse\\+ optin$")
	public void user_unselect_the_checkfor_for_vuse_opt_in() throws Throwable {

		// unselect the checkbox for Vuse+ opt-in
		rai.clickbutton(Vype_VuseplusRewards_Opt_in.VusePlusCheckbox, "Checkbox for Vuse+ opt in");

		// verify the checkbox is not selected for Vuse+ opt-in
		if (false == rai.fnIsSelected(Vype_VuseplusRewards_Opt_in.VusePlusCheckbox, "Checkbox for Vuse+ opt in"));

		rai.ScrollByxpath(Vype_Registration.btnRegister);

		// Verifying the register
		rai.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");

		// Clicking register
		rai.clickbutton(Vype_Registration.btnRegister, "Registration button");

	}

	@Then("^user accept the opt-in modal after logged in$")
	public void user_accept_the_opt_in_modal_when_logged_in() throws Throwable {

		// verify vuse+ rewards pop-up is displayed
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.VuseRewardsModal, "Vuse Rewards Modal");

		// Click on join now button in vuse rewards modal
		rai.clickbutton(Vype_VuseplusRewards_Opt_in.BtnJoinVuseRewards, "Join Now in Vuse Rewards");

	}

	@When("^user navigate to my rewards section$")
	public void user_navigate_to_rewards_section() throws Throwable {

		// Click on hamberger menu
		rai.clickbutton(Vype_CommonXpath.btnmenu, "Hamburger Menu");
		Thread.sleep(6000);

		// click on myrewards link
		rai.clickbutton(Vype_CommonXpath.lnkMyRewards, "My Rewards");

		// verify Progression bar toward Next Tier is displayed.
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.NextTierProgressionBar,
				"Progression bar toward Next Tier");

		// Verify "Lifetime earned points Eg:350 " is displayed
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.LifetimeEarnedPoints, "Lifetime earned points Eg:350");

		// gl.fnScrollToView(Vype_Opt_in.CurrentPointGraph);

		// verify Current Points Graph is displayed in the Rewards page.
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.CurrentPointGraph, "Current Points Graph ");

	}

	@Then("^scroll down to history section$")
	public void scroll_down_to_History_section() throws Throwable {
		// Scroll down to your history section
		rai.ScrollByxpath(Vype_VuseplusRewards_Opt_in.RewardsHistorySection);

	}

	@And("^verify the points for newuser")
	public void verify_the_points() throws Throwable {
		// Verify the Subscribe to Newsletter Points are displayed.i.e 100 points
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.SubscribeNewslettertxt, "Subscribe to Newsletter");
		System.out.print(rai.getText(Vype_VuseplusRewards_Opt_in.SubscribeNewslettertxt));
		System.out.println(rai.getText(Vype_VuseplusRewards_Opt_in.SubscribeNewsletterPoints));

		// Verify the Opt-in Offer Points are displayed.i.e 250 points
		rai.VerifyElementVisible(Vype_VuseplusRewards_Opt_in.Opt_inOfferttxt, "Opt-in Offer ");
		System.out.print(rai.getText(Vype_VuseplusRewards_Opt_in.Opt_inOfferttxt));
		System.out.println(rai.getText(Vype_VuseplusRewards_Opt_in.Opt_inOfferPoints));

	}
	
	@And("^user clicks on My Reward$")
	public void user_clicks_on_My_Reward() throws Throwable {
		
		rai.clickUsingJs(goVype_Properties.Vype_CommonXpath.lnkMyRewards, "My Rewards");
		Thread.sleep(2000);
		
		
	}
	
}
