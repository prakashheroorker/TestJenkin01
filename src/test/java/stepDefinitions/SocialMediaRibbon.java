package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_AgeCertify;
import goVype_Properties.Vype_CommonXpath;


public class SocialMediaRibbon {	
	//GenericLib gl = new GenericLib(this.getClass().getSimpleName());
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^scroll down and verify Instagram link$")
	public void scrolled_down_and_clicked_on_the_Instagram_logo() throws Throwable {
		gl.fnScrollToView(Vype_CommonXpath.lnkFaqs);
	    function.clickAndVerifyInstagramLogo();
	    
	}
	
	@Then("^scroll down and verify Facebook link$")
	public void scrolled_down_and_clicked_on_the_Facebook_logo() throws Throwable {
		gl.fnScrollToView(Vype_CommonXpath.lnkFaqs);
	    function.clickAndVerifyFacebookLogo();
	    
	}
	
	@Then("^scroll down and verify Youtube link$")
	public void scroll_down_and_verify_Youtube_link() throws Throwable {
		gl.fnScrollToView(Vype_CommonXpath.lnkFaqs);
		function.clickAndVerifyYoutubeLogo();
		//Verify that Pre-Login home page displayed
		//gl.VerifyPageDisplayed(Vype_CommonXpath.btnLoginorRegister, "Pre Login Home");
		
		
	}
	
	@Then("^scroll down and verify Twitter link$")
	public void scroll_down_and_verify_Twitter_link() throws Throwable {
		//Scroll down to footer section
		gl.fnScrollToView(Vype_CommonXpath.lnkFAQs);
		function.clickAndVerifyTwitterLogo();
		//Verify home page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.btnAccount, "Home");
	}

	@Given("^user navigates to application$")
	public void user_navigates_to_application() throws Throwable {
		// Launch Application
		gl.launchApplication("https:vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
		Thread.sleep(10000);
		//Verify that Age Certify Page is displayed.
		gl.VerifyElementVisible(Vype_CommonXpath.weAgeCertify, "Age Certify");

	}
	
	@When("^user clicks on i am not eighteen plus button$")
	public void user_clicks_on_i_am_not_eighteen_plus_button() throws Throwable {		
		//Click on "I am not 18" button 
		gl.clickUsingJs(Vype_AgeCertify.btnIamNot18, "I am not 18");		
		
	}

	@Then("^user is not able to access social media links$")
	public void user_is_not_able_to_access_social_media_links() throws Throwable {
		//Verify error message is displayed
		gl.VerifyElementVisible(Vype_AgeCertify.txtErrorMustBeAtLeast18, "Must Be At Least 18 Years Of Age Error Message");
			
	}
	

	


}
