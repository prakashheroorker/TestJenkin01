package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.Then;



import goVype_Properties.Vype_Subscription;

public class SubscriptionProductStaticPageElements {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^Verify subscribe and save option is available$")
	public void verifies_subscribe_and_save_option_is_available() throws Throwable {
	   
		//Verify subscribe and save option is available.
		gl.VerifyElementPresent(Vype_Subscription.txtSubscribeAndsave, "Subscribe & Save");
		
		//Click on down arrow/subscribe & save.
	    gl.clickUsingJs(Vype_Subscription.txtSubscribeAndsave, "Subscribe & Save");
		
	}

	
}
