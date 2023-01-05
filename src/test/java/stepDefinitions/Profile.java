package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;
import cucumber.api.java.en.*;

import goVype_Properties_mobile.*;

import com.rai.framework.Constants;

public class Profile {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	String home;

	@When("^User hovers on Profile Icon$")
	public void user_hovers_on_Profile_Icon() throws Throwable {

		home = gl.getCurrentUrl();
		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");

	}

	@Then("^All the Account options will be displayed$")
	public void all_the_Account_options_will_be_displayed() throws Throwable {

		function.verifylinksInAccountSection();

	}

	@When("^User clicks on My Account link$")
	public void user_clicks_on_My_Account_link() throws Throwable {

		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyAccount, "My Account");

	}

	@Then("^My Account section should be displayed$")
	public void my_Account_section_should_be_displayed() throws Throwable {

		gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MyAccount);
		

	}
	//Modified 


	@And("^Navigate back to Home page$")
	public void navigate_back_to_Home_page() throws Throwable {

		function.NavigateBackTo(home);

	}
	
	@When("^User hovers on Profile icon and click on My rewards link$")
	public void user_hovers_on_Profile_icon_and_click_on_My_rewards_link() throws Throwable {

		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyRewards, "My Rewards");
		Thread.sleep(3000);

	}

	@Then("^My Rewards section should be displayed$")
	public void my_Rewards_section_should_be_displayed() throws Throwable {

		gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MyRewards);

	}

	@When("^User hovers on Profile icon and  clicks on My Savings link$")
	public void user_hovers_on_Profile_icon_and_clicks_on_My_Savings_link() throws Throwable {

		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMySavings, "My Savings");
		Thread.sleep(3000);

	}

	@When("^User hovers on Profile icon clicks on My Orders link$")
	public void user_hovers_on_Profile_icon_clicks_on_My_Orders_link() throws Throwable {
		
		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyOrders, "My Orders");
		Thread.sleep(2000);

	}

	@Then("^My Orders section should be displayed$")
	public void my_Orders_section_should_be_displayed() throws Throwable {

		Thread.sleep(1000);
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgorders, "page order");

	}

	@When("^User hovers on Profile icon clicks on My Subscription link$")
	public void user_hovers_on_Profile_icon_clicks_on_My_Subscription_link() throws Throwable {
		gl.HowerMouse(goVype_Properties.Vype_Common.btnAccount, "Account Section");
		gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMySubscription, "My Subscription");
		Thread.sleep(3000);

	}

	@When("^User click on browser back and verify subscription page is displayed$")
	public void user_click_on_browser_back_and_verify_subscription_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        gl.browserBack();
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgSubscription, "page subscription");

	}

	
	
	
	@Then("^Verify profile section with relevant content is displayed$")
	public void verify_profile_section_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MyAccount);
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.btnProfileEdit,"Edit icon");
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.btnAddPayment,"Add payment");
		List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.lsttiles);
		System.out.println("Total no of tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			gl.fnScrollToView(Vype_CommonXpath.lsttiles(i));
			String str = list3.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.lsttiles(i), "content: "+ str);
		}
//		String Account = gl.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weMyacctContetnt, Account);
//		System.out.println(Account);
	   
	}

	@When("^User clicks on Edit button in the User Name$")
	public void user_clicks_on_Edit_button_in_the_User_Name() throws Throwable {
		
		gl.clickUsingJs(goVype_Properties.Vype_Common.btnProfileEdit, "My Account");
		Thread.sleep(2000);

	}

	@Then("^Edit Your Information pop up modal should be displayed$")
	public void edit_Your_Information_pop_up_modal_should_be_displayed() throws Throwable {
		
		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.btnProfileEdit, "Edit User Information Modal");

	}

	@When("^User clicks on close button in Edit Your Information modal$")
	public void user_clicks_on_close_button_in_Edit_Your_Information_modal() throws Throwable {

		gl.clickUsingJs(goVype_Properties.Vype_Common.btnCloseUserModal, "Close Modal");
		Thread.sleep(2000);
		
	}

	@When("^User clicks on Add Payment Method link$")
	public void user_clicks_on_Add_Payment_Method_link() throws Throwable {
		
		gl.fnScrollToView(goVype_Properties.Vype_Common.btnAddPayment);
		gl.clickUsingJs(goVype_Properties.Vype_Common.btnAddPayment, "Add Payment Method");
		Thread.sleep(2000);

	}

	@Then("^Add payment Method modal should be displayed$")
	public void add_payment_Method_modal_should_be_displayed() throws Throwable {
		
		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weAddPayemntModal, "Add Payment Method Modal");

	}

	@When("^User clicks on close button in Add Payment Method modal$")
	public void user_clicks_on_close_button_in_Add_Payment_Method_modal() throws Throwable {
		
		gl.clickUsingJs(goVype_Properties.Vype_Common.btnclosePayModal, "Close Modal");
		Thread.sleep(2000);

	}

	@When("^User clicks on Delete button for saved cards$")
	public void user_clicks_on_Delete_button_for_saved_cards() throws Throwable {

		gl.clickUsingJs(goVype_Properties.Vype_Common.btnDeletecard, "Delete saved card button");
		Thread.sleep(2000);
		
		
	}

	@Then("^Delete payment method modal should be displayed$")
	public void delete_payment_method_modal_should_be_displayed() throws Throwable {
		
		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weDeletePaymentMethod,
				"Delete Payment Method Modal");

	}

	@When("^User clicks on No return button in Delete payment method modal$")
	public void user_clicks_on_No_return_button_in_Delete_payment_method_modal() throws Throwable {
		
		gl.clickUsingJs(goVype_Properties.Vype_Common.btnNoReturn, "No Return button");
		Thread.sleep(2000);
		
	}
	
	@Then("^Verify order section with relevant content is displayed$")
	public void verify_order_section_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgorders, "page order");
		gl.fnScrollToView(goVype_Properties.Vype_Common.weOrderContent);
		String Order = gl.getText(goVype_Properties.Vype_Common.weOrderContent);
		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weOrderContent, Order);
		System.out.println(Order);
		
	}
	
	@Then("^Verify reward section with relevant content is displayed$")
	public void verify_reward_section_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgrewards, "page rewards");
		
		List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.lsttiles);
		System.out.println("Total no of tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			gl.fnScrollToView(Vype_CommonXpath.lsttiles(i));
			String str = list3.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_CommonXpath.lsttiles(i), "content: "+ str);
		}
//		gl.fnScrollToView(goVype_Properties.Vype_Common.weMyacctContetnt);
//		String Reward = gl.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
//		gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weMyacctContetnt, Reward);
//		System.out.println(Reward);
	}
	

	@Then("^Verify savings sections with relevant content is displayed$")
	public void verify_savings_sections_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
	gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MySavings);
	gl.VerifyElementVisible(goVype_Properties.Vype_Common.lnkTermsConditions,"Terms and conditions");
	gl.VerifyElementVisible(goVype_Properties.Vype_Common.lnkLearnMore,"Learn more link");
	gl.fnScrollToView(goVype_Properties.Vype_Common.weMyacctContetnt);
	String Saving = gl.getText(goVype_Properties.Vype_Common.weMyacctContetnt);
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weMyacctContetnt, Saving);
	System.out.println(Saving);
    
}

@When("^User clicks on Terms and Condition link$")
public void user_clicks_on_Terms_and_Condition_link() throws Throwable {
	
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkTermsConditions, "Terms and Conditions");
	Thread.sleep(2000);
   
}

@Then("^Terms and Conditions should be displayed$")
public void terms_and_Conditions_should_be_displayed() throws Throwable {
	
	gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_TermsAndConditions);
  
}

@When("^User clicks on Learn More link$")
public void user_clicks_on_Learn_More_link() throws Throwable {
	
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkLearnMore, "Learn More");
	Thread.sleep(5000);
    
}


 @Then("^Verify subscription section with relevant content is displayed$")
public void verify_subscription_section_with_relevant_content_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 
	 
	 gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgSubscription, "page subscription");
	 
	 gl.VerifyElementVisible(goVype_Properties.Vype_Common.btnEditDetails, "Edit Details button");
	 gl.VerifyElementVisible(goVype_Properties.Vype_Common.lnkpause,"Pause");
	 gl.VerifyElementVisible(goVype_Properties.Vype_Common.btnCancel,"cancel");
	gl.fnScrollToView(goVype_Properties.Vype_Common.weSubscriptionDetails);
	String Subscription = gl.getText(goVype_Properties.Vype_Common.weSubscriptionDetails);
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weSubscriptionDetails, Subscription);
	System.out.println(Subscription);
   
}

@When("^User clicks on Edit details button for Shipping$")
public void user_clicks_on_Edit_details_button_for_Shipping() throws Throwable {
	
	gl.fnScrollToView(goVype_Properties.Vype_Common.btnEditDetails);
	gl.clickUsingJs(goVype_Properties.Vype_Common.btnEditDetails, "Edit Details button");
	Thread.sleep(1000);
    
}

@Then("^User is navigated to Edit Details page$")
public void user_is_navigated_to_Edit_Details_page() throws Throwable {
	
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.pgEditDetails, "Edit details page");
	Thread.sleep(2000);
   
}

@When("^User clicks on Cancel Subscription link$")
public void user_clicks_on_Cancel_Subscription_link() throws Throwable {
	
	gl.clickUsingJs(goVype_Properties.Vype_Common.btnCancel, "Cancel link");
	//gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");
	Thread.sleep(2000);
   
}

@Then("^Cancel Subscription modal should be displayed$")
public void cancel_Subscription_modal_should_be_displayed() throws Throwable {
	
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.weCancelSubModal, "Cancel subscription modal");
   
}

@When("^User clicks on No return button in Cancel Subscription modal$")
public void user_clicks_on_No_return_button_in_Cancel_Subscription_modal() throws Throwable {
	
	gl.clickUsingJs(goVype_Properties.Vype_Common.btnCancelModalClose, "Close Modal");
  
}
// added by sireesha
@When("^User clicks on pause Subscription link$")
public void user_clicks_on_pause_Subscription_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkpause, "pause link");
}

@Then("^Pause Subscription modal should be displayed$")
public void pause_Subscription_modal_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.wepauseSubModal, "pause subscription modal");
}

@When("^User clicks on No return button in pause Subscription modal$")
public void user_clicks_on_No_return_button_in_pause_Subscription_modal() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.btnCancelModalClose, "Close Modal");
    
}
@When("^User click on browse back and verify savings section should be displayed$")
public void user_click_on_browse_back_and_verify_savings_section_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.browserBack();
	Thread.sleep(1000);
	gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MySavings);
}

@Then("^User is navigated to PASS ON THE SAVINGS page$")
public void user_is_navigated_to_PASS_ON_THE_SAVINGS_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyObjectDisplayed(goVype_Properties.Vype_Common.pgPassonSavings, "Pass on the savings");  
}

@Then("^My Subscription section should be displayed$")
public void my_Subscription_section_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyElementVisible(goVype_Properties.Vype_Common.pgSubscription, "page subscription");
}
@Then("^My Savings section should be displayed$")
public void my_Savings_section_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.VerifyPageDisplayedUsingPagetitle(Constants.VUSE_MySavings);
}

@When("^User click on My Rewards link$")
public void user_click_on_My_Rewards_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyRewards, "My Rewards");
    
}

@When("^User clicks on My Savings link$")
public void user_clicks_on_My_Savings_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMySavings, "My Savings");
}

@When("^User clicks on My Subscription link$")
public void user_clicks_on_My_Subscription_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMySubscription, "My Subscription"); 
}
@When("^User clicks on My Orders link$")
public void user_clicks_on_My_Orders_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	gl.clickUsingJs(goVype_Properties.Vype_Common.lnkMyOrders, "My Orders");
}











}
