package stepDefinitions;

import java.util.List;
import org.openqa.selenium.WebElement;
import com.rai.framework.*;
import cucumber.api.java.en.*;
import goVype_Properties.*;


public class SubscriptionAccountWorkflow {


	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^Verify subscription confirmation page and verify subscription details$")
	public void verify_subscription_confirmation_page_and_verify_subscription_details() throws Throwable {

		//verify subscription page
		function.verifySubscriptionConfirmationPage();

	}


	@Then("^click on Add or modify button and select flavour \"([^\"]*)\" with Nicotine strength and click on Add$")
	public void click_on_Add_or_modify_button_and_select_flavour_with_Nicotine_strength_and_click_on_Add(String flavour) throws Throwable {

		//Add or modify items
		function.AddorModify(flavour);
	}

	@Then("^Verify order summary and click on submit update$")
	public void verify_order_summary_and_click_on_submit_update() throws Throwable {

		String ordersummary=gl.getText(Vype_CommonXpath.txtordersummary);
		System.out.println(ordersummary);
		//Verify Product is added under product summary
		gl.VerifyElementVisible(Vype_CommonXpath.txtordersummary,ordersummary);

		String subtotal=gl.getText(Vype_CommonXpath.txtpodssubtotal);
		System.out.println(subtotal);
		gl.VerifyElementVisible(Vype_CommonXpath.txtpodssubtotal,subtotal);

		//Scroll to Submit Update
		gl.fnScrollToView(Vype_CommonXpath.btnSubmitUpadate);

		//Click Submit update button
		gl.clickbutton(Vype_CommonXpath.btnSubmitUpadate, "Submit Update");

		Thread.sleep(2000);

	}

	@And("^verify user does not have active subscription and click on browse cartridges$")
	public void verify_user_does_not_have_active_subscription_and_click_on_browse_cartridges() throws Throwable {

		String str;

		//Verify the "Subscription" page will reflect the completion by showing no subscriptions on the Subscription page.
		str = gl.getText(Vype_SubscriptionLanding.txtNoSubscription);
		gl.VerifyElementVisible(Vype_SubscriptionLanding.txtNoSubscription, str + " ");

		gl.clickLink(Vype_CommonXpath.lnkBrowseCartridges, "Browse Cartridges");

		//Verify the user is navigated to the new cartridge page i.e,, VUSE PODS Page
		gl.VerifyElementVisible(Vype_CommonXpath.txtsubscriptionpods," Subscription Vuse Pods ");


	}





	@And("^verify subscription update message$")
	public void verify_subscription_update_message() throws Throwable {

		//Verify Subscription is successfully updated msg is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.weSubscriptionUpdated,"Subscription updated ");
		String str1;

		List<WebElement> list;
		list = gl.findElementsList(Vype_CommonXpath.txtsubscribeditems);
		System.out.println("Subscription includes: "+list.size());
		for(int i=0;i<list.size();i++){
			str1 = list.get(i).getText();
			str1 = str1.replaceAll("[\\n\\t]", " ");
			gl.VerifyElementVisible(Vype_CommonXpath.txtsubscribeditems,str1+ " ");
		}
	}
	
	/*
	 * @Then("^click on subscribe and save and add quantity and click on add to cart$"
	 * ) public void
	 * click_on_subscribe_and_save_and_add_quantity_and_click_on_add_to_cart()
	 * throws Throwable {
	 * 
	 * //Subscribe and save function.addQuantityForSubscribeAndSave(); }
	 */



}
