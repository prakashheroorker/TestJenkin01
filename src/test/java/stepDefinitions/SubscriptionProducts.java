package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_SilverProfileTrigger;
import goVype_Properties.Vype_Subscription;

public class SubscriptionProducts{
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@When("^user clicks on checkout button from cart page and enter Username as \"([^\"]*)\" and password as \"([^\"]*)\" to login$")
	public void user_clicks_on_checkout_button_from_cart_page_and_enter_Username_as_and_password_as_to_login(String UN, String pwd) throws Throwable {
		//Click on 'Check Out' button from the Cart Page.
		gl.clickbutton(Vype_SilverProfileTrigger.btnCheckOut, "Cart Page - Check Out");

		//Enter valid email id in the field.
		gl.inputText(Vype_Common.txtEmail, "Enter valid email Id",UN);

		//Enter valid password in text field.
		gl.inputText(Vype_Common.txtPwd, "Enter valid Password",pwd );


		//Click on Login button.
		gl.clickbutton(Vype_Common.btnLogin, "Click on Login button");
		Thread.sleep(4000);
	}
	
	@Then("^Edit subscription details and save$")
	public void edit_subscription_details_and_save() throws Throwable {
		//Subscription page is opened.
		gl.VerifyPageDisplayed(Vype_Subscription.txtActiveSubscription, "Subscription");
		gl.fnScrollToView(Vype_Subscription.btnEdit);
		//Click on Edit
		gl.clickUsingJs(Vype_Subscription.btnEdit, "Edit Details");
		//verify edit page
		gl.ScrollPageDown();
		Thread.sleep(3000);
        gl.VerifyPageDisplayed(Vype_Subscription.btncancel, "Edit details");
        //click on cancel
        gl.clickbutton(Vype_Subscription.btncancel, "Edit details");
	}

	@Then("^Modify the dispatch frequency of the product$")
	public void modify_the_dispatch_frequency_of_the_product() throws Throwable {
		//User is able to modify the dispatch frequency of the product.
		gl.clickUsingJs(Vype_Subscription.btnPlusSubscription, "Add");
		
		gl.clickUsingJs(Vype_Subscription.txtsubmitupdates, "submit update");

		//Modification is successful. updated.
		//gl.VerifyElementPresent(Vype_Subscription.txtSubscriptionUpdated,"Your subscription successfully updated");
	}
	
}
