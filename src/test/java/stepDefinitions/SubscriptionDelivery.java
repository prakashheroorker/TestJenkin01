package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import goVype_Properties.Vype_OrderConfirmation;
import goVype_Properties.Vype_Subscription;

public class SubscriptionDelivery {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@And("^Verify subscription is added to cart$")
	public void verify_subscription_is_added_to_cart() throws Throwable {
		gl.VerifyElementVisible(Vype_Subscription.txtSubscriptions, "Subscription");
	}
	
	@And("^verify order confirmation page details$")
	public void verify_order_confirmation_page_details() throws Throwable {
		//Verify that Order Confirmation page is displayed
		gl.VerifyPageDisplayed(Vype_OrderConfirmation.pgOrderCofirmation,"Order Cofirmation");
		//Verify Order confirmation page indicates that "Your order includes a subscription" info.
		gl.VerifyElementVisible(Vype_Subscription.txtSubscriptionInfo, "Subscription Information");
		gl.fnScrollToView(Vype_Subscription.txtOrderSubscription);
		//Verify information on when subscription starts, payment method, address, and user's selection of the products.
		gl.VerifyElementPresent(Vype_Subscription.txtOrderSubscription, "Payment method");
		gl.fnScrollToView(Vype_Subscription.txtOrderDelivery);
		//Verify Order ID, day of order submission, contact info, delivery method, and shipping info.
		gl.VerifyElementPresent(Vype_Subscription.txtOrderDelivery, "Delivery method");
	}
}
