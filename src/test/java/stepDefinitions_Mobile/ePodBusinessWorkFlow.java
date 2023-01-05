package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;



public class ePodBusinessWorkFlow {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	

@Then("^Navigates to Cart page and verify Subscription discliamer message$")
public void navigates_to_Cart_page_and_verify_Subscription_discliamer_message() throws Throwable {
	
	function.navigatetoViewCart();
	Thread.sleep(4000);
	//Verifying the banner
	rai.VerifyElementVisible(Vype_Common.weSubDisclaimerBanner, "Sub Discliamer Banner");
	//scrolling to disclimer msg
	rai.ScrollByxpath(Vype_Common.weSubDisclaimer);

	//Verify Subscription Disclaimer message
	rai.VerifyElementVisible(Vype_Common.weSubDisclaimer, "Sub Discliamer");
	
	Thread.sleep(2000);
    
}


@Then("^select delivery for subscription$")
public void select_delivery_for_subscription() throws Throwable {
	
	rai.ScrollByxpath(Vype_CheckOut.CanadaExpressSubsDeliveryOption);
	//click on fedex
	rai.clickbutton(Vype_CheckOut.CanadaExpressSubsDeliveryOption, "Canada Express delivery for subscription");

}

@When("^User clicks on No thanks as user is non vype member$")
public void user_clicks_on_No_thanks_as_user_is_non_vype_member() throws Throwable {
   rai.SwipeDownSmallerUnits(3);
   rai.ClickUsingOCR("NO THANKS");
}


}