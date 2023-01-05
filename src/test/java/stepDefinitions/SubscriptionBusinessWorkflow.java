package stepDefinitions;


import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class SubscriptionBusinessWorkflow {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	
	@When("^User navigates to Subscribe ePods$")
	public void user_navigates_to_Subscribe_ePods() throws Throwable {
		
		gl.fnScrollToView(Vype_CommonXpath.btnSubscribeNow);
		Thread.sleep(2000);
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnSubscribeNow, "Subscriber Now");
		
	
	}

	@When("^User subscribes for flavour \"([^\"]*)\" with required quantity \"([^\"]*)\" and add to the cart from Subscription page$")
	public void user_subscribes_for_flavour_with_required_quantity_and_add_to_the_cart_from_Subscription_page(String flavor, int quantity) throws Throwable {
	    
		gl.waitTillElementVisible(Vype_CommonXpath.wePodSubcription);
		
		//Scroll to the flavor
		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor));
		
		Thread.sleep(3000);
		
		//Add required number of quantity for subscription
		
		for (int i = 0; i < quantity; i++) {
			
			gl.clickUsingJs(Vype_CommonXpath.btnqtyincrement(flavor), "Increment Quantity");
			Thread.sleep(1000);
							
		}
		
		Thread.sleep(2000);
		
		gl.clickbutton(Vype_CommonXpath.btnAdd(flavor), "Add Product");
		
		Thread.sleep(5000);
		
		
	}
	
		
		

}
