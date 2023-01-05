package stepDefinitions;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties.*;


public class OptInOut extends BaseClass{
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@Then("^Scroll down to the opt out content$")
	public void scroll_down_to_the_opt_out_content() throws Throwable {
		//Scrolling to view opt out toggle
	   gl.fnScrollToView(Vype_RevampRewards.optouttoggle);
	   //Verifying the opt out content
	   gl.VerifyElementVisible(Vype_RevampRewards.optoutcontent,"Opt out content");
	}
	@Then("^Verify the Rewards Page$")
	public void verify_the_Rewards_Page() throws Throwable {
		//Verifying the current tier
		 gl.VerifyElementVisible(Vype_RevampRewards.currenttier,"Current Tier");
		 //Verifying the benefits
		 gl.VerifyElementVisible(Vype_RevampRewards.benefits,"Benefits");
		//Verifying the perks
		 gl.VerifyElementVisible(Vype_RevampRewards.perks,"Perks");
		//Verifying the achievements
		 gl.VerifyElementVisible(Vype_RevampRewards.achievements,"Achievements");
		//Verifying the History
		 gl.VerifyElementVisible(Vype_RevampRewards.history,"History");
	}
	@Then("^Clicking on Register$")
	public void clicking_on_Register() throws Throwable {
		gl.fnScrollToView(Vype_Registration.btnRegister);
		//Verifying the register
		gl.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");
		//Clicking register
		gl.clickUsingJs(Vype_Registration.btnRegister, "Registration button");
		
	}
	@Then("^Select on opt out from rewards loyalty program$")
	public void select_on_opt_out_from_rewards_loyalty_program() throws Throwable {
		gl.clickbutton(Vype_RevampRewards.optouttoggle,"Opt out toggle");
		Thread.sleep(5000);
		//Verifying the join now button
		gl.VerifyElementVisible(Vype_RevampRewards.btnJoinnow, "Join button");
		//click on close for the pop uo
		//gl.clickbutton(Vype_RevampRewards.btnClose,"Close");
		gl.ScrollPageUp();
		//Verifying the join now button
		gl.VerifyElementVisible(Vype_RevampRewards.btnJoinnow, "Join button");
		//Verifying optin banner
		gl.VerifyElementVisible(Vype_RevampRewards.optincontent, "Optin Content");
	
		
	}
	
	//Updated Bhavitha
	
	@Then("^Verify user is already opt out$")
	public void verify_user_is_already_opt_out() throws Throwable {
		//gl.fnScrollToView(Vype_RevampRewards.optouttoggle);
		  gl.clickbutton(Vype_RevampRewards.NoThanks, "No, Thnaks Button");
		gl.VerifyElementVisible(Vype_RevampRewards.OptOutcontent,"Opt out content");
	}
	
	@When("^Scroll down to the opt out content and Click on join button$")
	public void scroll_down_to_the_opt_out_content_and_Click_on_join_button() throws Throwable {
		gl.fnScrollToView(Vype_RevampRewards.btnJoinnow);
		  
		gl.clickbutton(Vype_RevampRewards.btnJoinnow,"Clicking on opt-out button");
		Thread.sleep(2000);
	}

	@Then("^Verify user is opt in$")
	public void verify_user_is_opt_in() throws Throwable {
		 gl.VerifyElementVisible(Vype_RevampRewards.currenttier,"Current Tier");
		 //Verifying the benefits
		 gl.VerifyElementVisible(Vype_RevampRewards.benefits,"Benefits");
		//Verifying the perks
		 gl.VerifyElementVisible(Vype_RevampRewards.perks,"Perks");
		//Verifying the achievements
		 gl.VerifyElementVisible(Vype_RevampRewards.achievements,"Achievements");
		//Verifying the History
		 gl.VerifyElementVisible(Vype_RevampRewards.history,"History");
	}
	
	@When("^Entering with new email address Email and password \"([^\"]*)\" and verify next button is enabled$")
    public void signing_with_new_email_address_and_password_and_verify_next_button_is_enabled(String pwd) throws Throwable {
          int length = 8;
            boolean useLetters = true;
            boolean useNumbers = false;
            String EmailID = RandomStringUtils.random(length, useLetters, useNumbers)+"@bat.com";

 

            System.out.println(EmailID);
        //Enter New Email ID
        gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", EmailID);

 

        // Enter Password in the password text field
        gl.inputTextjavaScripfnPasswordencryption(rdriver,Vype_CommonXpath.txtPassword,pwd);

 

        //verify the next button is disabled
        gl.VerifyElementVisible(Vype_CommonXpath.btnnext, "Next button");

    }
	
	@Then("^Verify first time bonus purchase points and bonus points under history$")
	public void verify_first_time_bonus_purchase_points_and_bonus_points_under_history() throws Exception  {
		
		gl.fnScrollToView(Vype_CommonXpath.txthistory);
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.txtfirsttimePurchaseBonus, "first time purchase points under History");
		String str=gl.getText(Vype_VuseRewards_firsttimePurchase.txtfirsttimePurchaseBonus);
		if(str.equals("500"))
		{
			reportiumClient.reportiumAssert("First time Purchase bonus Points are added", true);
		}
		if(!str.equals("500"))
		{
			reportiumClient.reportiumAssert("First time Purchase bonus Points are not added", false);
		}
		System.out.println(gl.getText(Vype_VuseRewards_firsttimePurchase.firsttimePurchaseBonus, "first time purchase points"));

		
		//verify purchase points is displayed
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.txtPurchasePoints, "purchase points under history");
		System.out.print(gl.getText(Vype_VuseRewards_firsttimePurchase.txtPurchasePoints, "First time purchase points under history")+" ");
		System.out.println(gl.getText(Vype_VuseRewards_firsttimePurchase.PurchasePoints, "purchase points under history"));

		
	    
	}

 




    @When("^Click on next button and verify register signup page is displayed$")
    public void click_on_next_button_and_verify_register_signup_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete action



        gl.HowerMouse(Vype_CommonXpath.btnnext, "Next button");

        //verify the next button is enabled
        gl.clickUsingJs(Vype_CommonXpath.btnnext, "Next button");






    }

 



@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" in signup page$")
    public void enter_and_in_signup_page(String FN, String LN) throws Throwable {
        //Enter the First Name
        gl.inputText(Vype_Registration.txtFirstName, "First name text field", FN);

 

        //Enter the Last Name
        gl.inputText(Vype_Registration.txtLastName, "Last name text field", LN);

 

    }

 

 


    @Then("^Enter dob \"([^\"]*)\" , address \"([^\"]*)\" and Phone number \"([^\"]*)\" in signup page$")
    public void enter_dob_address_and_Phone_number_in_signup_page(String DOB, String ADD, String PhNo) throws Throwable {

        gl.inputText(Vype_Registration.txtDateOfBirth, "Date Of Birth text field", DOB);

        
        
        

        //Enter Valid Address 
        gl.inputText(Vype_Registration.txtAddress, "Address text field", ADD);
        WebElement e1=rdriver.findElement(Vype_Registration.txtAddress);
        
        e1.sendKeys(Keys.ENTER);

        //Enter Valid Phone Number
        gl.inputTextjavaScriptSendkeys(rdriver,Vype_Registration.txtPhoneNumber,  PhNo);

 

    }
    @When("^Clicked on Login or Sign up$")
    public void clicked_on_Login_or_Sign_up() throws Throwable {

 

        //Click on "Login/Register" button 
        gl.clickbutton(Vype_CommonXpath.btnLoginorRegister,"Login or Register");

 

        //Verify that Register modal is displayed
        gl.VerifyElementVisible(Vype_CommonXpath.btnLoginRegisterModal, "Login button on registrationModal");

 

        //Click on Login button
        gl.clickbutton(Vype_CommonXpath.btnLoginRegisterModal, "Registration modal login");

 

        //Verify that Login modal is displayed.
        gl.VerifyElementVisible(Vype_CommonXpath.txtPassword, "Username textfield on Login Modal");

 


    }    
    
    @Then("^Verify and click on login elements$")
    public void verify_and_click_on_login_elements() throws Throwable {

 

        //Validate Registration Page Is Displayed
        gl.VerifyObjectDisplayed(Vype_Common.btnLoginRegisterModal,"Register Page");

 

        //Click Login Button
        gl.clickElement(Vype_Common.btnLoginRegisterModal, "Login Button In Registration Page");                        

 

        //Verify Email Address Field
        gl.VerifyElementVisible(Vype_Common.txtUsername, "Email Address Present");

 

        //Verify Password Field
        gl.VerifyElementVisible(Vype_Common.txtPassword, "Password Present");

 

        //Verify Forgot? Link
        gl.VerifyElementVisible(Vype_ConditionsOfSale.lnkForgot, "Forgot Present");

 

        //Validate x to close browser
        gl.VerifyElementVisible(Vype_PlatinumProfileTrigger.btnCloseRegistrationPage, "Close Button For Registration Page");

 

        //Validate Login Button
        gl.VerifyElementVisible(Vype_Common.btnLogin, "Login Button Present");

 

    }

    
    @And("^Click on No Thanks link$")
    public void click_on_No_Thanks_link() throws Throwable {
       
    	gl.clickUsingJs(Vype_CommonXpath.lnkNothanks, "No Thanks");
    }
 

 

@Then("^Checking the conditions and verify the register button$")
    public void checking_the_conditions_and_verify_the_register_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        gl.ScrollPageDown();
        List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.conditionslist);
        System.out.println("Total no of conditions: "+list3.size());
        //Check the Yes I want to receive information check box
        gl.clickbutton(Vype_Registration.chkBoxYesIWantToReceiveInformation,"Yes I want to receive information check box");

 

 

       //Check I acknowledge that i read and understood Terms and Condition check box
        gl.clickUsingJs(Vype_Registration.chkBoxIAcknowledgeThatIRead,"I acknowledge that i read and understood Terms and Condition check box");
        Thread.sleep(5000);    

        gl.VerifyElementVisible(Vype_Registration.vuserewardsloyaltyprogram,"Yes, I want to join the Vuse Rewards loyalty program! Membership can be cancelled at any time. By joining, you agree that you have read and accepted the Vuse Rewards");
        gl.isEnabled(Vype_Common.btnregister, "register");

    }


@When("^User clicks on register button and verify the user is logged in$")
    public void user_clicks_on_register_button_and_verify_the_user_is_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        gl.fnScrollToView(Vype_Common.btnregister);

        gl.clickUsingJs(Vype_Common.btnregister, "register");


         gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
    }

@Then("^Scroll down and Verify opt out content$")
public void scroll_down_and_Verify_opt_out_content() throws Throwable {
	//Scrolling to view opt out toggle
   gl.fnScrollToView(Vype_RevampRewards.optouttoggle);
   //Verifying the opt out content
   gl.VerifyElementVisible(Vype_RevampRewards.optoutcontent,"Opt out content");
}

@When("^User navigate to Rewards section$")
public void user_navigate_to_Rewards_section() throws Throwable {

	// hover on profile and click on my rewards
	gl.HowerMouse(Vype_CommonXpath.btnAccount, "Profile");
	gl.clickbutton(Vype_CommonXpath.lnkMyRewards, "My Rewards");

}

}
