package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_AgeCertify;
import goVype_Properties_mobile.Vype_CommonXpath;

public class SocialMediaRibbon {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^user scrolls down and clicks Instagram link$")
	public void user_scrolls_down_and_clicks_Instagram_link() throws Throwable {

		//scroll to bottom of the page
		rai.ScrolltoBottomofthepage();
		
		//click on instagram link
		rai.clickLink(Vype_CommonXpath.lnkInstagram,"Instagram");
		
	//	rai.ClickUsingOCR("Allow");
		Thread.sleep(4000);
		
		
		// Verify user is directed to "Instagram Page"
		  rai.VerifyTextUsingOCR("instagram", "instagram");
		  
		// Swtich to home page tab
		
		  rai.clickBrowseBack();
		rai.switchDefault();

	}

	@Then("^verify instagram page$")
	public void verify_instagram_page() throws Throwable {

		//click on always show
        rai.ClickUsingOCR("Always Show");

        boolean b=rai.verifyobjectisnotavailable(Vype_CommonXpath.pginstagram);
		if(b==false)
		{
			
			rai.VerifyElementsVisible(Vype_CommonXpath.pginstagram,"Instagram ");

		}
		if(b==true)
		{
			//verify instagram page
			rai.VerifyTextUsingOCR("vusecanada", "vusecanada");
		}

       
	}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//newly added
	
	
	@Then("^scroll down in mobile and verify Facebook link$")
	public void scroll_down_in_mobile_and_verify_Facebook_link() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.lnkInstagram);
		Thread.sleep(4000);
		rai.SwipeUpSmallerUnits(1);
        rai.ClickUsingOCR("FACEBOOK");
		
		Thread.sleep(4000);
		
		// Verify user is directed to "Facebook Page"
		rai.VerifyTextUsingOCR("facebook", "facebook");

		 rai.clickBrowseBack();
		//rai.ClosetabAndroid();
		rai.switchDefault();

	    
	}
	
	
	
	@Then("^scroll down in mobile and verify Youtube link$")
	public void scroll_down_in_mobile_and_verify_Youtube_link() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkInstagram);
		
		Thread.sleep(4000);
		
		// Click on the Youtube link
     
		rai.ClickUsingOCR("YOUTUBE");
					
		Thread.sleep(4000);
	
		rai.VerifyTextUsingOCR("YouTube", "YouTube");
    
		rai.switchDefault();


	    
	}

	
	@Then("^scroll down in mobile and verify Twitter link$")
	public void scroll_down_in_mobile_and_verify_Twitter_link() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.lnkInstagram);
		
		Thread.sleep(4000);
		rai.SwipeUpSmallerUnits(1);
		// Write code here that turns the phrase above into concrete actions
		rai.ClickUsingOCR("TWITTER");
		

		// Verify user is directed to "Twitter Page"
		rai.VerifyTextUsingOCR("Twitter", "Twitter");

		 rai.clickBrowseBack();
		
		rai.switchDefault();
		
		

	}
	
	@Given("^user navigates to application in mobile$")
	public void user_navigates_to_application_in_mobile() throws Throwable {
	//  rai.fnClearCache();
		
		function.launchApplication1("https:vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
		
		Thread.sleep(10000);
		//Verify that Age Certify Page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.weAgeCertify, "Age Certify");

	}
	
	@When("^user click on i am not eighteen plus button$")
	public void user_click_on_i_am_not_eighteen_plus_button() throws Throwable {
		
	
		rai.ScrollByxpath(Vype_AgeCertify.btnIamNot18);
		//Click on "I am not 18" button 
		rai.clickUsingJs(Vype_AgeCertify.btnIamNot18, "I am not 18");		
		
	}

	@Then("^verify user is not able to access social media links$")
	public void verify_user_is_not_able_to_access_social_media_links() throws Throwable {
		//Verify error message is displayed
		rai.VerifyElementVisible(Vype_AgeCertify.txtErrorMustBeAtLeast18, "Must Be At Least 18 Years Of Age Error Message");
			
	}
}