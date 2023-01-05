package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Opt_in;
import goVype_Properties.Vype_Registration;

public class Opt_in extends BaseClass {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^User enters email \"([^\"]*)\" and password \"([^\"]*)\" in sign up modal$")
	public void user_enters_email_and_password_in_sign_up_modal(String arg1, String arg2) throws Throwable {
		String UN = arg1;
		String pwd = arg2;

		// click on login/Register link
		gl.clickbutton(Vype_CommonXpath.btnLoginorRegister, "Login/Register link");

		// verify login in modal is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgloginModal, "Login Modal");

		// Click on sign-up link
		gl.clickbutton(Vype_CommonXpath.lnksignup, "Sign-up link");

		// Verify sign up modal is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtSignUp);

		// Enter User name in the user name text field
		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on sign-up Modal", UN);

		// Enter Password in the password text field
		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on sign-up Modal", pwd);

		// verify next button is enabled
		gl.isEnabled(Vype_CommonXpath.btnnext, "Next Button");

		// Click on next button
		gl.clickbutton(Vype_CommonXpath.btnnext, "Next button");

	}

	@And("^User unselect the checkbox for vuse\\+ opt in$")
	public void user_unselect_the_checkfor_for_vuse_opt_in() throws Throwable {
		// unselect the checkbox for Vuse+ opt-in
		gl.clickbutton(Vype_Opt_in.VusePlusCheckbox, "Checkbox for Vuse+ opt in");

		// verify the checkbox is not selected for Vuse+ opt-in
		if (false == gl.IsCheckboxSelected(Vype_Opt_in.VusePlusCheckbox, "Checkbox for Vuse+ opt in"))
			;

		// verify the register button
		// gl.VerifyObjectDisplayed(Vype_CommonXpath.btnRegister,"Register");

		// Click on register button
		// gl.clickbutton(Vype_CommonXpath.btnRegister,"Register");

		gl.fnScrollToView(Vype_Registration.btnRegister);
		// Verifying the register
		gl.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");
		// Clicking register
		gl.clickbutton(Vype_Registration.btnRegister, "Registration button");

		// refresh the page
		// gl.refresh();

	}

	@Then("^User accept the opt-in modal when logged in$")
	public void user_accept_the_opt_in_modal_when_logged_in() throws Throwable {

		// verify vuse+ rewards pop-up is displayed
		gl.VerifyObjectDisplayed(Vype_Opt_in.VuseRewardsModal, "Vuse Rewards Modal");

		// Click on join now button in vuse rewards modal
		gl.clickbutton(Vype_Opt_in.BtnJoinVuseRewards, "Join Now in Vuse Rewards");

	}

	@When("^User navigate to rewards section$")
	public void user_navigate_to_rewards_section() throws Throwable {

		// hover on profile and click on my rewards
		gl.HowerMouse(Vype_CommonXpath.btnAccount, "Profile");
		gl.clickbutton(Vype_CommonXpath.lnkMyRewards, "My Rewards");

		// verify Progression bar toward Next Tier is displayed.
		gl.VerifyObjectDisplayed(Vype_Opt_in.NextTierProgressionBar, "Progression bar toward Next Tier");

		// Verify "Lifetime earned points Eg:350 " is displayed
		gl.VerifyObjectDisplayed(Vype_Opt_in.LifetimeEarnedPoints, "Lifetime earned points Eg:350");
		
		//gl.fnScrollToView(Vype_Opt_in.CurrentPointGraph);

		// verify Current Points Graph is displayed in the Rewards page.
		gl.VerifyObjectDisplayed(Vype_Opt_in.CurrentPointGraph, "Current Points Graph ");

	}

	@Then("^Scroll down to History section$")
	public void scroll_down_to_History_section() throws Throwable {
		// Scroll down to your history section
		gl.fnScrollToView(Vype_Opt_in.RewardsHistorySection);

	}

	@And("^Verify the points for new user")
	public void verify_the_points() throws Throwable {
		// Verify the Subscribe to Newsletter Points are displayed.i.e 100 points
		gl.VerifyObjectDisplayed(Vype_Opt_in.SubscribeNewslettertxt, "Subscribe to Newsletter");
		System.out.print(gl.getText(Vype_Opt_in.SubscribeNewslettertxt, "Subscribe to Newsletter"));
		System.out.println(gl.getText(Vype_Opt_in.SubscribeNewsletterPoints, "Subscribe to Newsletter Points"));

		// Verify the Opt-in Offer Points are displayed.i.e 250 points
		gl.VerifyObjectDisplayed(Vype_Opt_in.Opt_inOfferttxt, "Opt-in Offer ");
		System.out.print(gl.getText(Vype_Opt_in.Opt_inOfferttxt, "Opt-in Offer "));
		System.out.println(gl.getText(Vype_Opt_in.Opt_inOfferPoints, "Opt-in Offer Points "));

	}

	
}
