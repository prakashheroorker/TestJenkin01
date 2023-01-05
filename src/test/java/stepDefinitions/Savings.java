package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.Constants;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Savings;
import goVype_Properties.Vype_VuseStore;

public class Savings {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@When("^Hover on save and click on Pass On The Savings under Save$")
	public void hover_on_save_and_click_on_Pass_On_The_Savings_under_Save() throws Throwable {
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save ");
		
		gl.clickUsingJs(Vype_Savings.Savings, "Pass On The Savings");
		Thread.sleep(2000);
	}

	@Then("^Verify Pass On The Savings page is displayed$")
	public void verify_Pass_On_The_Savings_page_is_displayed() throws Throwable {
		gl.VerifyElementPresent(Vype_Savings.SavingsPage,"Pass On The Savings page is displayed");
		
		gl.VerifyElementPresent(Vype_Savings.Getstarted,"Get started");
		
		gl.fnScrollToView(Vype_Savings.SavingsContent);
		
		gl.VerifyElementPresent(Vype_Savings.SavingsContent,"Pass On The Savings page Content");
		
		gl.VerifyElementPresent(Vype_Savings.Content,"Pass On The Savings page Content");
		
	}

	@When("^Click on GET STARTED$")
	public void click_on_GET_STARTED() throws Throwable {
		gl.ScrollPageUp();
		
		gl.fnScrollToView(Vype_Savings.Getstarted);
		
		gl.clickbutton(Vype_Savings.Getstarted,"Get started");
		
		Thread.sleep(3000);
	}

	@Then("^Verify it will scroll upto START PASSING ON THE SAVINGS$")
	public void verify_it_will_scrool_upto_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		gl.fnScrollToView(Vype_Savings.Startpassing);
		gl.VerifyElementPresent(Vype_Savings.Startpassing,"START PASSING ON THE SAVINGS");
	}

	@Then("^Verify Invite link and copy button under START PASSING ON THE SAVINGS$")
	public void verify_Invite_clike_and_copy_button_under_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		gl.VerifyElementPresent(Vype_Savings.invitelink,"invite link");
		
		gl.VerifyElementPresent(Vype_Savings.Copybtn,"Copy invite link");
		
		//gl.clickUsingJs(Vype_Savings.Copybtn,"Copy invite link");
		
		//gl.VerifyElementPresent(Vype_Savings.LinkCopied,"Link Copied");
		
		Thread.sleep(2000);
		
		gl.VerifyElementPresent(Vype_Savings.Send,"send Button");
		
		gl.VerifyElementPresent(Vype_Savings.Email,"Email");
		Thread.sleep(2000);
	}

	@When("^Click on Terms and Conditions under START PASSING ON THE SAVINGS$")
	public void click_on_Termas_and_Conditions_under_START_PASSING_ON_THE_SAVINGS() throws Throwable {
		gl.fnScrollToView(Vype_Savings.TermsandConditions);
		gl.clickUsingJs(Vype_Savings.TermsandConditions,"Terms and Conditions");
		
	}

	@Then("^Verify it will navigate to Vuse Pass on the Savings Program Terms and Conditions$")
	public void verify_it_will_navigate_to_Vuse_Pass_on_the_Savings_Program_Terms_and_Conditions() throws Throwable {
		gl.VerifyElementPresent(Vype_Savings.TermsandConditionsPage,"Terms and Conditions page");
		
	}

	@Then("^Navegate back and Click on TRACK YOUR SAVINGS$")
	public void navegate_back_and_Click_on_TRACK_YOUR_SAVINGS() throws Throwable {
		gl.navigateBack();
		
		Thread.sleep(2000);
		
		gl.fnScrollToView(Vype_Savings.Trackyoursavings);
		
		gl.clickUsingJs(Vype_Savings.Trackyoursavings,"Track your savings");
	}

	@Then("^Verify it will navigate to SAVINGS page and Navigate back$")
	public void verify_it_will_navegate_to_SAVINGS_page_and_Navegate_back() throws Throwable {
		gl.VerifyElementPresent(Vype_Savings.TrackyoursavingsPage,"Track your savings page");
		
		gl.navigateBack();
		
		Thread.sleep(2000);
	}
	
	
//Modified By sireesha
	
	@Then("^Verify Pass On The Savings page and with relevant text is displayed$")
	public void verify_Pass_On_The_Savings_page_and_with_relevant_text_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String savings=gl.getText(Vype_Savings.txtsavings);
		gl.VerifyElementPresent(Vype_Savings.txtsavings,savings);
		System.out.println(savings);
		
		gl.fnScrollToView(Vype_Savings.Getstarted);
		gl.VerifyElementPresent(Vype_Savings.Getstarted,"Get started");
		
		gl.fnScrollToView(Vype_Savings.Trackyoursavings);
		gl.VerifyElementPresent(Vype_Savings.Trackyoursavings,"Track your savings");
		
		gl.fnScrollToView(Vype_Savings.invitelink);
        gl.VerifyElementPresent(Vype_Savings.invitelink,"invite link");
        gl.fnScrollToView(Vype_Savings.Copybtn);
		gl.VerifyElementPresent(Vype_Savings.Copybtn,"Copy invite link");
	}

	@When("^User click on copy link and verify invite link is copied$")
	public void user_click_on_copy_link_and_verify_invite_link_is_copied() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.fnScrollToView(Vype_Savings.Copybtn);
		gl.ClickUsingOCR("COPY");
		//gl.clickUsingJs(Vype_Savings.Copybtn,"Copy invite link");
		gl.VerifyElementPresent(Vype_Savings.txtlinkcopy,"linked is copied");
	}

	@When("^User click on browse back and verify Pass On The Savings page is displayed$")
	public void user_click_on_browse_back_and_verify_Pass_On_The_Savings_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.browserBack();
	    gl.VerifyElementPresent(Vype_Savings.SavingsPage,"Pass On The Savings page is displayed");
	    
	}

	@When("^User scroll down and click on Track your savings$")
	public void user_scroll_down_and_click_on_Track_your_savings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        gl.fnScrollToView(Vype_Savings.Trackyoursavings);
		
		gl.clickUsingJs(Vype_Savings.Trackyoursavings,"Track your savings");
		Thread.sleep(2000);
	}

	@Then("^Verify My savings page is displayed$")
	public void verify_My_savings_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MySavings);
	}


	@When("^User scrolls to faqs click on each question and verify the answers$")
	public void user_scrolls_to_faqs_click_on_each_question_and_verify_the_answers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list=gl.findElementsList(Vype_Savings.pgsavings_faqs);
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			str=str.substring(0,15);
			String Qa="(//*[contains(text(),'"+str+"')])";
			gl.clickUsingJs(By.xpath(Qa),Qa);
			String str1="(//*[contains(text(),'"+str+"')])/../..";
			gl.fnScrollToView(By.xpath(Qa));
			// clicking on each faq
			gl.clickUsingJs(By.xpath(str1),str);
			
			
			String QAs=gl.getText(By.xpath(str1));
			System.out.println((i+1)+":"+QAs+"\n");
			gl.VerifyElementPresent(By.xpath(str1), QAs);
		}
	}
	
	@When("^Click on click here  under faqs$")
	public void click_on_click_here_under_faqs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   gl.clickUsingJs(Vype_Savings.lnkclickhere, "Click here");
	}


	
	
}
