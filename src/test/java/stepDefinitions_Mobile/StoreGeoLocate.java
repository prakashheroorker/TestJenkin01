package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class StoreGeoLocate {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@When("^Click on the Store Locator$")
	public void click_on_the_Store_Locator() throws Throwable {
	    
		//Click on the Store Locator  
		rai.clickLink(Vype_StoreLocator.lnkStoreLocator, "lnkStoreLocator");

	}

	@Then("^Google API page should be displayed in the same page$")
	public void google_API_page_should_be_displayed_in_the_same_page() throws Throwable {
		
		//Verify the Google API in same page
		rai.VerifyElementVisible(Vype_StoreLocator.pgeStoreLocator2,"Store Locator Page");
   
	}
	
	@Then("^user clicks on search bar and types location \"([^\"]*)\"$")
	public void user_clicks_on_search_bar_and_types_location(String address) throws Throwable {
		
		rai.inputText(Vype_StoreLocator.txtLocationField, "Store Locator Search Bar", address);

		Thread.sleep(5000);
		
		rai.clickbutton(Vype_StoreLocator.txtPlacesInDropDown, "Address list");
		
		// Verify 'Hasty Market' is visible
		rai.VerifyElementVisible(Vype_StoreLocator.txtHastyMarket, "Hasty Market");

		rai.ScrolltoBottomofthepage();

		// Verify 'Sky cigar' is visible
		rai.VerifyElementVisible(Vype_StoreLocator.txtSkywayCigar, "Skyway cigar");

	}


}