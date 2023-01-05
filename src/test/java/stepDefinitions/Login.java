package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties.*;


public class Login extends BaseClass{
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


//	@When("^Clicked on Login or Sign up$")
//	public void clicked_on_Login_or_Sign_up() throws Throwable {
//
//		//Click on "Login/Register" button 
//		gl.clickbutton(Vype_CommonXpath.btnLoginorRegister,"Login or Register");
//
//		//Verify that Register modal is displayed
//		gl.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registrationModal");
//
//		//Click on Login button
//		gl.clickbutton(Vype_CommonXpath.btnLoginRegisterModal, "Registration modal login");
//
//		//Verify that Login modal is displayed.
//		gl.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Username textfield on Login Modal");
//
//
//	}	

//	@Then("^verify and click on login elements$")
//	public void verify_and_click_on_login_elements() throws Throwable {
//
//		//Validate Registration Page Is Displayed
//		gl.VerifyObjectDisplayed(Vype_Common.btnLoginRegisterModal,"Register Page");
//
//		//Click Login Button
//		gl.clickElement(Vype_Common.btnLoginRegisterModal, "Login Button In Registration Page");						
//
//		//Verify Email Address Field
//		gl.VerifyElementVisible(Vype_Common.txtUsername, "Email Address Present");
//
//		//Verify Password Field
//		gl.VerifyElementVisible(Vype_Common.txtPassword, "Password Present");
//
//		//Verify Forgot? Link
//		gl.VerifyElementVisible(Vype_ConditionsOfSale.lnkForgot, "Forgot Present");
//
//		//Validate x to close browser
//		gl.VerifyElementVisible(Vype_PlatinumProfileTrigger.btnCloseRegistrationPage, "Close Button For Registration Page");
//
//		//Validate Login Button
//		gl.VerifyElementVisible(Vype_Common.btnLogin, "Login Button Present");
//
//	}

//	@Then("^Verify the current url from current pages$")
//	public void verify_the_current_url_from_current_pages() throws Throwable {
//
//		//printing the url 
//		System.out.println("current url"+rdriver.getCurrentUrl());	
//
//		//
//		gl.verifyCurrentURLInPage("https://vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
//	}

//	@When("^Entering \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void entering_and(String FN, String LN) throws Throwable {
//		//Enter the First Name
//		function.fnln(FN,LN);
//
//	}
//	@Then("^checking the conditions$")
//	public void checking_the_conditions() throws Throwable {
//		//Scroll down
//		//gl.fnScrollToView(Vype_Registration.txtRentalPin);
//		gl.ScrollPageDown();
//
//		//Check the Yes I want to receive information check box
//		gl.clickbutton(Vype_Registration.chkBoxYesIWantToReceiveInformation,"Yes I want to receive information check box");
//
//		//Check I acknowledge that i read and understood Terms and Condition check box
//		gl.clickUsingJs(Vype_Registration.chkBoxIAcknowledgeThatIRead,"I acknowledge that i read and understood Terms and Condition check box");
//		Thread.sleep(5000);	
//		
//		gl.VerifyElementVisible(Vype_Registration.vuserewardsloyaltyprogram,"Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards");
//
//	}
//	
//	@Then("^click on signup for registration process$")
//	public void click_on_signup_for_registration_process() throws Throwable {
//		//Sign Up Link
//		gl.clickbutton(Vype_PlatinumProfileTrigger.btnSignUpInLoginPage, "Sign Up Button");
//	}
//	
//	@When("^Signing with new email address Email and password \"([^\"]*)\"$")
//	public void signing_with_new_email_address_and_password(String pwd) throws Throwable {
//		  int length = 8;
//	        boolean useLetters = true;
//	        boolean useNumbers = false;
//	        String EmailID = RandomStringUtils.random(length, useLetters, useNumbers)+"@bat.com";
//
//	        System.out.println(EmailID);
//		//Enter New Email ID
//		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", EmailID);
//
//		// Enter Password in the password text field
//		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd);

		// Click on Next button
		//gl.clickUsingJs(Vype_CommonXpath.btnNext, "Next button");
//		gl.clickbuttonUsingSelenium(Vype_CommonXpath.txtSignUp, "Sign up text");
//		Thread.sleep(2000);
//		gl.HowerMouse(Vype_CommonXpath.btnNext, "Next button");
//		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnNext, "Next button");

	
//	@Then("^Entering dob \"([^\"]*)\" , address \"([^\"]*)\" and Phone number \"([^\"]*)\"$")
//	public void entering_dob_address_and_Phone_number(String DOB, String ADD, String PhNo) throws Throwable {
//		
//		gl.inputText(Vype_Registration.txtDateOfBirth, "Date Of Birth text field", DOB);
//
//		//Enter Valid Address 
//		gl.inputText(Vype_Registration.txtAddress, "Address text field", ADD);
//		
//		//Enter Valid Phone Number
//		gl.inputText(Vype_Registration.txtPhoneNumber, "Phone Number Text Field", PhNo);
//
//	}

//	@Then("^Verifying Register$")
//	public void verifying_Register() throws Throwable {
//		gl.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");
//	}
//	@Then("^using flavour URL to new page$")
//	public void using_flavour_URL_to_new_page() throws Throwable {
//		System.out.println("url  -"+gl.getCurrentUrl());
//		String FlavourURL = gl.getCurrentUrl();
//		gl.HowerMouse(Vype_Common.btnAccount, "Home page");
//		
//		//Click on logout button
//		gl.clickUsingJs(Vype_CommonXpath.lnkLogout, "Logout");
//		
//		((JavascriptExecutor) rdriver).executeScript("window.open()");
//		ArrayList<String> tabs = new ArrayList<String>(rdriver.getWindowHandles());
//		rdriver.switchTo().window(tabs.get(1));
//		gl.launchUrl(FlavourURL);
//		
//	    
//	}
//	@Then("^verify the flavor page$")
//	public void verify_the_flavor_page() throws Throwable {
//
//		// Verify Lemon Berry Header is displayed.
//		gl.VerifyElementVisible(Vype_CommonXpath.LemonBerry, "Lemon Berry");
//		// Verify Lemon Berry Content
//		gl.VerifyElementVisible(Vype_CommonXpath.LemonBerryCnt, "Lemon Berry");
//		//Subscribe & Save
//		gl.VerifyElementVisible(Vype_PlatinumProfileTrigger.btnSubscribeAndSaveFlavourEpodPods, "Subscribe & Save");
//	}
//
//	@When("^login from flavor page email address \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void login_from_flavor_page_email_address_and_password(String UN1, String pwd1) throws Throwable {
//		
//	/*	String accountName = gl.getText(Vype_Common.btnAccount);
//		if(UN1.contains(accountName))
//		{
//			gl.VerifyElementPresent(Vype_Common.btnLoginorRegister, "User Is Logged In");
//		}
//		*/
//		gl.clickbutton(Vype_CommonXpath.btnLoginorRegister, "Login or Register");
//
//		// Verify that Login modal is displayed.
//		gl.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registration Modal");
//
//		// Verify log in button in login model
//		gl.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login button ");
//
//		// Enter User name in the user name text field
//		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", UN1);
//
//		// Enter Password in the password text field
//		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd1);
//
//		// Click on Login button
//		gl.clickbutton(Vype_CommonXpath.btnLogin, "Login button");
//
//	}
	
	
	/// Modified by sireesha
	
	
	@When("^Entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void entering_and(String FN, String LN) throws Throwable {
		//Enter the First Name
		function.fnln(FN,LN);

	}
	@Then("^Entering dob \"([^\"]*)\" , address \"([^\"]*)\" and Phone number \"([^\"]*)\"$")
	public void entering_dob_address_and_Phone_number(String DOB, String ADD, String PhNo) throws Throwable {
		
		gl.inputText(Vype_Registration.txtDateOfBirth, "Date Of Birth text field", DOB);

		//Enter Valid Address 
		gl.inputText(Vype_Registration.txtAddress, "Address text field", ADD);
		
		//Enter Valid Phone Number
		gl.inputText(Vype_Registration.txtPhoneNumber, "Phone Number Text Field", PhNo);

	}
	
	@When("^User Clear the email text area$")
	public void user_clear_the_text_area() throws Throwable {
	    gl.ClearText(Vype_CommonXpath.txtUsername, "Cleared");
	}
	@When("^Logging only with username \"([^\"]*)\" ,verifying the error message$")
	public void logging_only_with_username_and_verifying_the_error_message(String UN) throws Throwable {
		gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN);
		
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
		
		//Verify that the error message "Password is required"  is displayed below the password field
		String errorPwd = gl.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField);
		if(errorPwd.equalsIgnoreCase("Password is required")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField,"Password Is Required Error Message");
		}
	}
	@Then("^Logging only with password \"([^\"]*)\"> ,verifying the error message$")
	public void logging_only_with_password_verifying_the_error_message(String pwd) throws Throwable {
		//Enter Password
		gl.inputText(Vype_Common.txtPassword, "Password Entered", pwd);
		
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
		
		//Verify that the error message "Password is required"  is displayed below the password field
		String errorPwd = gl.getText(Vype_PlatinumProfileTrigger.weErrorMsgEmailFeild);
		
		if(errorPwd.equalsIgnoreCase("Email address is required")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weErrorMsgEmailFeild,"Email Is Required Error Message");
		}
		
	}
	@When("^Logging with \"([^\"]*)\" less characters in password \"([^\"]*)\",verifying the error message$")
	public void logging_with_less_characters_in_password_verifying_the_error_message(String UN, String pwd1) throws Throwable 
	{
			//Enter Email
			gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN);
			//Enter Password
			gl.inputText(Vype_Common.txtPassword, "Password Entered", pwd1);
				
			//Click Login Button
			gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
		
		String errorPwd2 = gl.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength);
		if(errorPwd2.equalsIgnoreCase("Must be at least 8 characters")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength,"Password length error message");
		}
	}

	@Then("^Clear the password text area$")
	public void clear_the_password_text_area() throws Throwable {
		 gl.ClearText(Vype_CommonXpath.txtPassword, "Cleared");
	}
	@Then("^Logging with invalid username \"([^\"]*)\" and \"([^\"]*)\", verifying the error message$")
	public void logging_with_invalid_username_and_verifying_the_error_message(String UN1, String pwd) throws Throwable {
		//Enter Email
		gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN1);
		//Enter Password
		gl.inputText(Vype_Common.txtPassword, "Password Entered", pwd);
			
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
		String errorPwd1 = gl.getText(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect);
		if(errorPwd1.equalsIgnoreCase("Email or password incorrect")){	
			gl.VerifyPageDisplayed(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect,"Email Or Password Is Incorrect");
		}
	}
	
	/// Modified by sireesha
	
	
	@When("^Signing with new email address Email and password \"([^\"]*)\"$")
	public void signing_with_new_email_address_and_password(String pwd) throws Throwable {
		  int length = 8;
	        boolean useLetters = true;
	        boolean useNumbers = false;
	        String EmailID = RandomStringUtils.random(length, useLetters, useNumbers)+"@bat.com";

	        System.out.println(EmailID);
		//Enter New Email ID
		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", EmailID);

		// Enter Password in the password text field
		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd);
	}

	@When("^User enter valid email address in email field \"([^\"]*)\" and password field as blank and click on Login$")
	public void user_enter_valid_email_address_in_email_field_and_password_field_as_blank_and_click_on_Login(String UN) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
     gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN);
		
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the error message as password is required$")
	public void verify_the_error_message_as_password_is_required() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd = gl.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField);
		if(errorPwd.equalsIgnoreCase("Password is required")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField,"Password Is Required Error Message");
		}
	}

	@When("^User enter valid email address in email field \"([^\"]*)\" invalid \"([^\"]*)\"  in password field and click on Login$")
	public void user_enter_valid_email_address_in_email_field_invalid_in_password_field_and_click_on_Login(String UN, String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN);
		//Enter Password
		gl.inputText(Vype_Common.txtPassword, "Password Entered", pwd);
			
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the error message as email or password incorrect$")
	public void verify_the_error_message_as_email_or_password_incorrect() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd1 = gl.getText(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect);
		if(errorPwd1.equalsIgnoreCase("Email or password incorrect")){	
			gl.VerifyPageDisplayed(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect,"Email Or Password Is Incorrect");
		}
	}

	@When("^User enter vaild email address \"([^\"]*)\" less characters in password \"([^\"]*)\" and click on login$")
	public void user_enter_vaild_email_address_less_characters_in_password_and_click_on_login(String UN, String pwd1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.inputText(Vype_Common.txtUsername, "Email address Should Be Entered", UN);
		//Enter Password
		gl.inputText(Vype_Common.txtPassword, "Password Entered", pwd1);
			
		//Click Login Button
		gl.clickElement(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the error message as Must be atleast eight characters$")
	public void verify_the_error_message_as_Must_be_atleast_eight_characters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd2 = gl.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength);
		if(errorPwd2.equalsIgnoreCase("Must be at least 8 characters")){
			gl.VerifyObjectDisplayed(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength,"Password length error message");
		}
	   
	}
	@Then("^Click on signup for registration process$")
	public void click_on_signup_for_registration_process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_PlatinumProfileTrigger.btnSignUpInLoginPage, "Sign Up Button");
	}

	@Then("^Verify password rules are displayed$")
	public void verify_password_rules_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_Common.txtpwdrules, "pwdrules");
	}

	@Then("^Verify password rules are marked in green color and verify next button$")
	public void verify_password_rules_are_marked_in_green_color_and_verify_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_Common.txtpwdrules, "greenflags");
	    gl.isEnabled(Vype_Common.btnnext, "Next button");
	    Thread.sleep(2000);
	}

	@When("^User clicks on next button and verify user redrictes to signup form$")
	public void user_clicks_on_next_button_and_verify_user_redrictes_to_signup_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_Common.btnnext, "Next button");
		Thread.sleep(2000);
		gl.VerifyElementVisible(Vype_Common.pgsignup, "sign up");
		Thread.sleep(2000);
	}

	
	
	
	
	
	
	
	
	
	
	
}