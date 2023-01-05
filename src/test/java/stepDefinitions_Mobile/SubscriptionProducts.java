package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;

public class SubscriptionProducts {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@And("^click on edit details and verify details and click on cancel$")
	public void click_on_edit_details_and_verify_details_and_click_on_cancel() throws Throwable {

		rai.SwipeDown(1);
		//edit details
		rai.clickUsingJs(Vype_CommonXpath.btneditdetails, "Edit details");

		//verify edit details
		rai.VerifyElementsVisible(Vype_CommonXpath.btneditdetails, "cancel ");

		//click on cancel
		rai.clickUsingJs(Vype_CommonXpath.btncancel, "Cancel ");
	}

	@And("^click on add or modify items and verifify pick your pods page$")
	public void click_on_add_or_modify_items_and_verifify_pick_your_pods_page() throws Throwable {

		//Scroll to Add/Modify items button
		rai.ScrollByxpath(Vype_CommonXpath.btnAddorModify);

		//Click Add/Modify button
		rai.clickbutton(Vype_CommonXpath.btnAddorModify, "Add/Modify");

		//Scroll to order summary
		rai.ScrollByxpath(Vype_CommonXpath.ordersummary);

		rai.VerifyElementVisible(Vype_CommonXpath.ordersummary, "Order summary");


		//Scroll to Submit Update
		rai.ScrollByxpath(Vype_CommonXpath.btnSubmitUpadate);


	}

	@And("^click on Submit updates and verify subscription is updated message$")
	public void click_on_Submit_updates_and_verify_subscription_is_updated_message() throws Throwable {

		//Click Submit update button
		rai.clickbutton(Vype_CommonXpath.btnSubmitUpadate, "Submit Update");
		
		Thread.sleep(2000);

		//Verify Subscription is successfully updated msg is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.weSubscriptionUpdated,"Subscription updated");
	}


}
