package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.Constants;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Savings;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_Savings_Mobile;

public class Savings {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^verify Pass On The Savings page is displayed$")
	public void verify_Pass_On_The_Savings_page_is_displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_Savings_Mobile.SavingsPage,"Pass On The Savings page is displayed");
		
		rai.SwipeDownSmallerUnits(2);
		//rai.ScrollByxpath(Vype_Savings_Mobile.Getstarted);
		Thread.sleep(2000);
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Getstarted,"Get started");
		
		rai.SwipeDownSmallerUnits(2);
		
	//	rai.VerifyElementsVisible(Vype_Savings_Mobile.SavingsContent,"Pass On The Savings page Content");
		Thread.sleep(2000);
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Content,"Pass On The Savings page Content");
	}
	
	@When("^Click on GET STARTED button$")
	public void click_on_GET_STARTED_button() throws Throwable {
		rai.ScrolltoTopofthepage();
		Thread.sleep(3000);
		rai.ScrollByxpath(Vype_Savings_Mobile.Getstarted);
		
		rai.clickUsingJs(Vype_Savings_Mobile.Getstarted,"Get started");
		
		Thread.sleep(3000);
	}

	@Then("^verify it will scrool upto START PASSING ON THE SAVINGS$")
	public void verify_it_will_scrool_upto_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		//rai.SwipeDownSmallerUnits(4);
		//rai.ScrollByxpath(Vype_Savings_Mobile.Startpassing);
		//Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Startpassing,"START PASSING ON THE SAVINGS");
	}

	@Then("^verify Invite link and copy button under START PASSING ON THE SAVINGS$")
	public void verify_Invite_link_and_copy_button_under_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		rai.VerifyElementsVisible(Vype_Savings_Mobile.invitelink,"invite link");
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Copybtn,"Copy invite link");
		
		//rai.clickUsingJs(Vype_Savings_Mobile.Copybtn,"Copy invite link");
		
		//rai.VerifyElementsVisible(Vype_Savings_Mobile.LinkCopied,"Link Copied");
		
		Thread.sleep(2000);
		
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Send,"send Button");
		
		rai.VerifyElementsVisible(Vype_Savings_Mobile.Email,"Email");
		Thread.sleep(2000);
	}

	@When("^Click on Termas and conditions under START PASSING ON THE SAVINGS$")
	public void click_on_Termas_and_conditions_under_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		rai.clickUsingJs(Vype_Savings_Mobile.TermsandConditions,"Terms and Conditions");
	}

	@Then("^verify it will navigate to Vuse Pass on the Savings Program Terms and Conditions$")
	public void verify_it_will_navigate_to_Vuse_Pass_on_the_Savings_Program_Terms_and_Conditions() throws Throwable {
		rai.VerifyElementsVisible(Vype_Savings_Mobile.TermsandConditionsPage,"Terms and Conditions page");
	}

	@Then("^Navegate back and click on TRACK YOUR SAVINGS$")
	public void navegate_back_and_click_on_TRACK_YOUR_SAVINGS() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		Thread.sleep(3000);
		// Click on Save link
		rai.ClickUsingOCR("Save");
		rai.clickbutton(Vype_CommonXpath.lnkPassOnTheSavings, "Cliked on Pass On The Savings (up to $200) link");
		Thread.sleep(2000);
		
		rai.ScrollByxpath(Vype_Savings_Mobile.Trackyoursavings);
		
		rai.clickUsingJs(Vype_Savings_Mobile.Trackyoursavings,"Track your savings");
	}

	@Then("^Verify it will Navegate to SAVINGS page and Navegate back$")
	public void verify_it_will_Navegate_to_SAVINGS_page_and_Navegate_back() throws Throwable {
		rai.VerifyElementsVisible(Vype_Savings_Mobile.TrackyoursavingsPage,"Track your savings page");
		
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		Thread.sleep(3000);
		// Click on Save link
		rai.ClickUsingOCR("Save");
		rai.clickbutton(Vype_CommonXpath.lnkPassOnTheSavings, "Cliked on Pass On The Savings (up to $200) link");
		Thread.sleep(2000);
	}
	
	// added by sireesha
	
	@Then("^Verify Pass On The Savings Page and with relevant text is displayed$")
	public void verify_Pass_On_The_Savings_Page_and_with_relevant_text_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String savings=rai.getText(Vype_Savings.txtsavings);
		rai.VerifyElementVisible(Vype_Savings.txtsavings,savings);
		System.out.println(savings);
		
		rai.SwipeDownSmallerUnits(2);
		rai.VerifyElementVisible(Vype_Savings.Getstarted,"Get started");
		Thread.sleep(2000);
		rai.SwipeDownSmallerUnits(9);
		rai.VerifyElementVisible(Vype_Savings.Trackyoursavings,"Track your savings");
		Thread.sleep(2000);
		rai.SwipeUpSmallerUnits(2);
        rai.VerifyElementVisible(Vype_Savings.invitelink,"invite link");
        Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_Savings.Copybtn,"Copy invite link");
	}

	@When("^Click On GET STARTED$")
	public void click_On_GET_STARTED() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        // rai.ScrollByxpath(Vype_Savings.Getstarted);
		
		rai.SwipeUpSmallerUnits(6);
		rai.clickLink(Vype_Savings.Getstarted,"Get started");
		
	}

	@Then("^Verify it will swipe upto START PASSING ON THE SAVINGS$")
	public void verify_it_will_swipe_upto_START_PASSING_ON_THE_SAVINGS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.ScrollByxpath(Vype_Savings.Startpassing);
		rai.VerifyElementVisible(Vype_Savings.Startpassing,"START PASSING ON THE SAVINGS");
	}

	@When("^User click on Copy link and verify invite link is copied$")
	public void user_click_on_Copy_link_and_verify_invite_link_is_copied() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ClickUsingOCR("COPY");
		//gl.clickUsingJs(Vype_Savings.Copybtn,"Copy invite link");
		rai.VerifyElementsVisible(Vype_Savings.Copybtn, "link is copied");
	}

	@When("^User click on browse back and verify Pass On The Savings Page is displayed$")
	public void user_click_on_browse_back_and_verify_Pass_On_The_Savings_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.fnBrowserBack();
	    rai.VerifyElementVisible(Vype_Savings.SavingsPage,"Pass On The Savings page is displayed");
	}

	@When("^User swipe down and click on Track your savings$")
	public void user_swipe_down_and_click_on_Track_your_savings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
      // rai.ScrollByxpath(Vype_Savings.Trackyoursavings);
		
		rai.clickUsingJs(Vype_Savings.Trackyoursavings,"Track your savings");
		Thread.sleep(2000);
	}

	@Then("^Verify My savings Page is displayed$")
	public void verify_My_savings_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementsVisible(Vype_CommonXpath.pgMySavings, "Savings page");
		Thread.sleep(2000);
	}

	@When("^User swipe to faqs click on each question and verify the answers$")
	public void user_swipe_to_faqs_click_on_each_question_and_verify_the_answers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list=rai.findElementsList(Vype_Savings.pgsavings_faqs);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,15);
			String Qa="(//*[contains(text(),'"+str+"')])";
			rai.clickUsingJs(By.xpath(Qa),Qa);
			String str1="(//*[contains(text(),'"+str+"')])/../..";
			rai.ScrollByxpath(By.xpath(Qa));
			// clicking on each faq
			rai.clickUsingJs(By.xpath(str1),str);
			
			
			String QAs=rai.getText(By.xpath(str1));
			System.out.println((i+1)+":"+QAs+"\n");
			rai.VerifyElementVisible(By.xpath(str1), QAs);
		}
	}

	@When("^Click on click Here  under faqs$")
	public void click_on_click_Here_under_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_Savings.lnkclickhere, "Click here");
		Thread.sleep(2000);
		
	}

	@Then("^Verify it will Navigate to Vuse Pass on the Savings Program Terms and Conditions$")
	public void verify_it_will_Navigate_to_Vuse_Pass_on_the_Savings_Program_Terms_and_Conditions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_Savings.TermsandConditionsPage,"Terms and Conditions page");
	}

	
}
