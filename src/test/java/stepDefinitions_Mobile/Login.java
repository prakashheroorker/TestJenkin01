package stepDefinitions_Mobile;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_PlatinumProfileTrigger;
import goVype_Properties.Vype_Registration;
import goVype_Properties_mobile.*;


public class Login extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


//	@When("^user Logging only with username \"([^\"]*)\" ,verifying the error message$")
//	public void user_Logging_only_with_username_verifying_the_error_message(String UN) throws Throwable {
//		function.Username(UN);
//
//
//
//	}




//	@When("^Clear the Email text area$")
//	public void clear_the_Email_text_area() throws Throwable {
//
//		rai.ClearTextField((Vype_CommonXpath.txtUsername));
//
//		rai.RefreshPage();
//	}



//	@When("^Clear the Email text area in the field$")
//	public void clear_the_Email_text_area_in_the_field() throws Throwable {
//
//
//		rai.ClearTextField((Vype_CommonXpath.txtUsernamefield));
//
//	}





//	@Then("^user Logging only with password and \"([^\"]*)\", verifying the error message$")
//	public void user_Logging_only_with_password_and_verifying_the_error_message(String password) throws Throwable {
//
//		function.passworderror(password);
//	}



//	@Then("^Clear the Password text area$")
//	public void clear_the_Password_text_area() throws Throwable {
//
//		rai.ClearTextField(Vype_CommonXpath.txtPassword);
//	}





//	@When("^Logging with \"([^\"]*)\" less characters in the password \"([^\"]*)\",verifying the error message$")
//	public void logging_with_less_characters_in_the_password_verifying_the_error_message(String UN, String pwd1) throws Throwable {
//
//		//Enter Email
//		rai.inputTextjavaScriptSendkeys(rdriver,Vype_Common.txtUsername,UN);
//		//Enter Password
//		rai.inputTextjavaScriptSendkeys(rdriver,Vype_Common.txtPassword,pwd1);
//
//		//Click Login Button
//		rai.clickbutton(Vype_Common.btnLogin, "Login Button Should Be Clicked");
//
//		String errorPwd2 = rai.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength);
//		if(errorPwd2.equalsIgnoreCase("Must be at least 8 characters")){
//			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength,"Password length error message");
//		}
//	}





//	@Then("^user Logging with invalid username \"([^\"]*)\" and \"([^\"]*)\", verifying the error message$")
//	public void user_Logging_with_invalid_username_and_verifying_the_error_message(String UN1, String password) throws Throwable {
//
//		rai.inputTextjavaScriptSendkeys(rdriver,Vype_Common.txtUsername,  UN1);
//		//Enter Password
//		rai.inputTextjavaScriptSendkeys(rdriver,Vype_Common.txtPassword, password);
//
//		//Click Login Button
//		rai.clickbutton(Vype_Common.btnLogin, "Login Button Should Be Clicked");
//		String errorPwd1 = rai.getText(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect);
//		if(errorPwd1.equalsIgnoreCase("Email or password incorrect")){	
//			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect,"Email Or Password Is Incorrect");
//		}
//	}




//
//	@Then("^Verify the current url from current pages in mobile$")
//	public void verify_the_current_url_from_current_pages_in_mobile() throws Throwable {
//
//		//printing the url 
//		System.out.println("current url"+rdriver.getCurrentUrl());	
//
//		rai.verifyCurrentURLInPage("https://vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
//		Thread.sleep(3000);
//	}
//
//
//	@Then("^using flavour URL to new page in mobile$")
//	public void using_flavour_URL_to_new_page_in_mobile() throws Throwable {
//
//		System.out.println("url  -"+rai.getCurrentUrl());
//		String FlavourURL = rai.getCurrentUrl();
//		//	rai.HowerMouse(Vype_Common.btnAccount, "Home page");
//		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
//		//Click on logout button
//		Thread.sleep(3000);
//		rai.ScrollByxpath(Vype_CommonXpath.lnkLogout);
//		Thread.sleep(3000);
//		rai.clickUsingJs(Vype_CommonXpath.lnkLogout, "Logout");
//		Thread.sleep(3000);
//
//
//		rai.clickBrowseBack();
//
//		rai.launchurl(FlavourURL);
//
//	}
//
//
//
//
//	@Then("^verify the flavors page$")
//	public void verify_the_flavors_page() throws Throwable {
//
//		// Verify Lemon Berry Header is displayed.
//		Thread.sleep(5000);
//		rai.ScrollByxpath(Vype_CommonXpath.LemonBerry);
//		Thread.sleep(5000);
//		rai.VerifyElementVisible(Vype_CommonXpath.LemonBerry, "Lemon Berry");
//		// Verify Lemon Berry Content
//		rai.VerifyElementVisible(Vype_CommonXpath.LemonBerryCnt, "Lemon Berry");
//
//		rai.ScrollByxpath(Vype_PlatinumProfileTrigger.btnSubscribeAndSaveFlavourEpodPods);
//		//Subscribe & Save
//		rai.VerifyElementVisible(Vype_PlatinumProfileTrigger.btnSubscribeAndSaveFlavourEpodPods, "Subscribe & Save");
//	}
//
//
//
//	@When("^login from flavor page with email address \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void login_from_flavor_page_with_email_address_and_password(String UN1, String pwd1) throws Throwable {
//
//
//		function.loginApplication(UN1, pwd1);
//
//	}
//
//	@Then("^verify the username, password, login button fields in the login page$")
//	public void verify_and_click_on_login_elements_in_mobile() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		        //Validate Registration Page Is Displayed
//				rai.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal,"Register Page");
//
//				
//				//Verify Email Address Field
//				rai.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Email Address Present");
//
//				//Verify Password Field
//				rai.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Password Present");
//
//				//Verify Forgot? Link
//				rai.VerifyElementVisible(Vype_CommonXpath.lnkForgot, "Forgot Present");
//
//				//Validate x to close browser
//				//rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.btnCloseRegistrationPage, "Close Button For Registration Page");
//
//				//Validate Login Button
//				rai.VerifyElementVisible(Vype_CommonXpath.btnLogin, "Login Button Present");
//
//	}
//
//	@Then("^click on signup for registration process in mobile$")
//	public void click_on_signup_for_registration_process_in_mobile() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		rai.clickbutton(Vype_rewardsUiAndFunctionality.btnSignUpInLoginPage, "Sign Up Button");
//	}
//	
//	
//
//	@When("^Signing with new email address Email and password \"([^\"]*)\" by generating Email$")
//	public void signing_with_new_email_address_Email_and_password_by_generating(String pwd) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		
//	          int length = 8;
//	            boolean useLetters = true;
//	            boolean useNumbers = false;
//	            String EmailID = RandomStringUtils.random(length, useLetters, useNumbers)+"@bat.com";
//
//	            System.out.println(EmailID);
//	            Thread.sleep(4000);
//             //Enter New Email ID
//
//	           
//	            
//	            function.signup(EmailID, pwd);
//	            
	         
	            
//	            Thread.sleep(2000);
//	    		//rai.HowerMouse(Vype_CommonXpath.btnNext, "Next button");
//	    		rai.clickbutton(Vype_CommonXpath.btnNext,"Next btn");
//	    		Thread.sleep(2000);
	    
	
	    
	
	    
	//Modified By sireesha

	@When("^Entering \"([^\"]*)\" and \"([^\"]*)\" for creating profile$")
	public void entering_and_for_creating_profile(String FN, String LN) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		function.EnterFirst_Last_Name(FN, LN);
		 
	}
	
	
	
	
	

	@Then("^Entering dob \"([^\"]*)\" and address \"([^\"]*)\" and Phone number \"([^\"]*)\"$")
	public void entering_dob_and_address_and_Phone_number(String DOB, String ADD, String PhNo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions


		 function.EnterDOB_ADD_Phno(DOB, ADD, PhNo);
		
		 
	}
	
	

	@Then("^checking the conditions at end of the page$")
	public void checking_the_conditions_at_end_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrolltoBottomofthepage();

		//Check the Yes I want to receive information check box
		rai.clickbutton(Vype_rewardsUiAndFunctionality.chkBoxYesIWantToReceiveInformation,"Yes I want to receive information check box");

		//Check I acknowledge that i read and understood Terms and Condition check box
		rai.clickUsingJs(Vype_rewardsUiAndFunctionality.chkBoxIAcknowledgeThatIRead,"I acknowledge that i read and understood Terms and Condition check box");
		Thread.sleep(5000);	
		
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.vuserewardsloyaltyprogram,
				"Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards");

	}

	
	
	
	
	
	@Then("^click on signup for registration process in mobile$")
	public void click_on_signup_for_registration_process_in_mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_rewardsUiAndFunctionality.btnSignUpInLoginPage, "Sign Up Button");
	}
	
	

	@When("^Signing with new email address Email and password \"([^\"]*)\" by generating Email$")
	public void signing_with_new_email_address_Email_and_password_by_generating(String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
	          int length = 8;
	            boolean useLetters = true;
	            boolean useNumbers = false;
	            String EmailID = RandomStringUtils.random(length, useLetters, useNumbers)+"@bat.com";

	            System.out.println(EmailID);
	            Thread.sleep(4000);
             //Enter New Email ID

	           
	            
	            function.signup(EmailID, pwd);
	}
	            
	
	@When("^Clear the Email text area$")
	public void clear_the_Email_text_area() throws Throwable {

		rai.ClearTextField((Vype_CommonXpath.txtUsername));

	}
	
	@When("^Clear the Email text area in the field$")
	public void clear_the_Email_text_area_in_the_field() throws Throwable {


		rai.ClearTextField((Vype_CommonXpath.txtUsernamefield));

	}
	
	@Then("^Verify Password rules are displayed$")
	public void verify_Password_rules_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_Common.txtpwdrules, "pwdrules");
	}
	
	@Then("^Clear the Password text area$")
	public void clear_the_Password_text_area() throws Throwable {

		rai.ClearTextField(Vype_CommonXpath.txtPassword);
	}

	@Then("^Verify Password rules are marked in green color and verify next button$")
	public void verify_Password_rules_are_marked_in_green_color_and_verify_next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_Common.txtpwdrules, "greenflags");
	    rai.isEnabled(Vype_Common.btnnext, "Next button");
	    Thread.sleep(2000);
	}

	@When("^User clicks on Next button and verify user redrictes to signup form$")
	public void user_clicks_on_Next_button_and_verify_user_redrictes_to_signup_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_Common.btnnext, "Next button");
		Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_Common.pgsignup, "sign up");
		Thread.sleep(2000);
	}

	@Then("^Checking the conditions checkbox and verify the Register button is enabled$")
	public void checking_the_conditions_checkbox_and_verify_the_Register_button_is_enabled() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrolltoBottomofthepage();
		List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.conditionslist);
		System.out.println("Total no of conditions: "+list3.size());
		//Check the Yes I want to receive information check box
		rai.clickbutton(Vype_Registration.chkBoxYesIWantToReceiveInformation,"Yes I want to receive information check box");

		//Check I acknowledge that i read and understood Terms and Condition check box
		rai.clickUsingJs(Vype_Registration.chkBoxIAcknowledgeThatIRead,"I acknowledge that i read and understood Terms and Condition check box");
		Thread.sleep(5000);	
		
		rai.VerifyElementVisible(Vype_Registration.vuserewardsloyaltyprogram,"Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards");
		rai.isEnabled(Vype_Common.btnregister, "register");
	}

	@When("^User clicks on Register button and verify the user is logged in$")
	public void user_clicks_on_Register_button_and_verify_the_user_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_Common.btnregister);
		rai.clickUsingJs(Vype_Common.btnregister, "register");
		Thread.sleep(2000);
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu");

		// VerifyTextUsingOCR("My Account");
		Thread.sleep(5000);
		rai.VerifyElementsVisible(Vype_Common.lnkMyAccount,"My Account");
		Thread.sleep(3000);
		//Click on close button

		rai.clickUsingJs(Vype_CommonXpath.closemenu,"Close hamburger menu");
		Thread.sleep(2000);
	}
	@When("^User enter valid email address in email field \"([^\"]*)\" and Password field as blank and click on Login$")
	public void user_enter_valid_email_address_in_email_field_and_Password_field_as_blank_and_click_on_Login(String UN) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.inputTextjavaScriptSendkeys(adriver,Vype_Common.txtUsername,  UN);
			
			//Click Login Button
			rai.clickLink(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the error message as Password is required$")
	public void verify_the_error_message_as_Password_is_required() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd = rai.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField);
		if(errorPwd.equalsIgnoreCase("Password is required")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weErrorMsgPasswordField,"Password Is Required Error Message");
		}
	}

	@Then("^User enter valid email address in email field \"([^\"]*)\" invalid \"([^\"]*)\"  in Password field and click on Login$")
	public void user_enter_valid_email_address_in_email_field_invalid_in_Password_field_and_click_on_Login(String UN, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.inputTextjavaScriptSendkeys(adriver,Vype_Common.txtUsername,  UN);
		//Enter Password
		rai.inputTextjavaScriptSendkeys(adriver,Vype_Common.txtPassword, password);
		rai.clickLink(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the error message as email or Password incorrect$")
	public void verify_the_error_message_as_email_or_Password_incorrect() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd1 = rai.getText(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect);
		if(errorPwd1.equalsIgnoreCase("Email or password incorrect")){	
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weEmailOrPasswordIncorrect,"Email Or Password Is Incorrect");
		} 
	}

	@When("^User enter vaild email address \"([^\"]*)\" less characters in Password \"([^\"]*)\" and click on login$")
	public void user_enter_vaild_email_address_less_characters_in_Password_and_click_on_login(String UN, String pwd1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.inputTextjavaScriptSendkeys(adriver,Vype_Common.txtUsername,UN);
		//Enter Password
		rai.inputTextjavaScriptSendkeys(adriver,Vype_Common.txtPassword,pwd1);

		//Click Login Button
		rai.clickLink(Vype_Common.btnLogin, "Login Button Should Be Clicked");
	}

	@Then("^Verify the Error message as Must be atleast eight characters$")
	public void verify_the_Error_message_as_Must_be_atleast_eight_characters() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String errorPwd2 = rai.getText(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength);
		if(errorPwd2.equalsIgnoreCase("Must be at least 8 characters")){
			rai.VerifyElementsVisible(Vype_PlatinumProfileTrigger.weErrorMsgPasswordlength,"Password length error message");
		}
	}



}