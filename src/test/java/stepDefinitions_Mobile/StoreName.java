package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class StoreName {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@When("^Click on the Store Locator present in the Home Page$")
	public void Click_on_the_Store_Locator_present_in_the_Home_Page() throws Throwable {
	
			//Click on the Store Locator  
			rai.clickLink(Vype_StoreLocator.lnkStoreLocator, "lnkStoreLocator");

	}

	@Then("^Verify the Google API page is displayed in the same page$")
	public void verify_the_Google_API_page_is_displayed_in_the_same_tab() throws Throwable {
			
			//Verify the Google API in same page
			rai.VerifyElementVisible(Vype_StoreLocator.pgeStoreLocator2,"Store Locator Page");
   
	}

}
