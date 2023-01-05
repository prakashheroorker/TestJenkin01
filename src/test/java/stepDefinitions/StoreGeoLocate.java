package stepDefinitions;

import com.rai.framework.CommonFunctions;

import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Footer;
import goVype_Properties.Vype_StoreLocator;

public class StoreGeoLocate {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^User enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_valid_email_address_and_password(String UN, String pwd) throws Throwable {

		function.loginApplication(UN, pwd);

	}

	@And("^clicking on Store Locator$")
	public void clicking_on_store_locator() throws Throwable {

		gl.clickLink(Vype_StoreLocator.lnkStoreLocator, "lnkStoreLocator");
	}

	@Then("^Verify FAQs is displayed$")
	public void Verify_FAQs_is_displayed() throws Throwable {
		gl.ScrollPageDown();
		Thread.sleep(5000);
		// Scroll down to footer section
		gl.VerifyObjectDisplayed(Vype_Footer.lnkFAQs);

	}

	@Then("^Google API page should be displayed in the same tab$")
	public void store_locate_displyed() throws Exception {
		gl.VerifyPageDisplayed(Vype_StoreLocator.pgeStoreLocator2, "Store Locator Page");
	}

	@Then("^User clicks on search bar and types location \"([^\"]*)\"$")
	public void user_clicks_on_search_bar_and_types_location(String address) throws Throwable {

		gl.inputText(Vype_StoreLocator.txtLocationField, "Store Locator Search Bar", address);

		Thread.sleep(2000);

		gl.clickbutton(Vype_StoreLocator.txtPlacesInDropDown, "Address list");

		// Verify 'Scally Wags' is visible
		gl.VerifyElementVisible(Vype_StoreLocator.txtHastyMarket, "Hasty Market");

		gl.ScrollPageDown();

		// Verify 'Two RoseHill' is visible
		gl.VerifyElementVisible(Vype_StoreLocator.txtSkywayCigar, "Skyway cigar");
	}

	@Then("^user clicks on search bar and types zipcode \"([^\"]*)\"$")
	public void user_clicks_on_search_bar_and_types_zipcode(String zipcode) throws Throwable {

		// Enter address to search in Location field
		gl.inputText(Vype_StoreLocator.txtLocationField, "Vype_ePodStoreLocator", zipcode);

		gl.clickbutton(Vype_StoreLocator.txtPlacesInDropDown, "Address list");
		gl.VerifyObjectDisplayed(Vype_StoreLocator.txtsmokevape, "180 Smoke Vape Store");
		gl.ScrollPageDown();
		gl.VerifyObjectDisplayed(Vype_StoreLocator.txtConvenience, "Mac's convience");

	}

	@And("^User types location and verifies whether live objects is displayed\"([^\"]*)\"$")
	public void user_types_location_and_verifies_whether_live_objects_is_displayed(String location) throws Throwable {

		gl.inputText(Vype_StoreLocator.txtLocationField, "Store Locator Search Bar", location);

		Thread.sleep(2000);

		gl.clickbutton(Vype_StoreLocator.txtPlacesInDropDown, "Address list");
		// Verify the Store Name results
		gl.VerifyElementVisible(Vype_StoreLocator.txtStoreResult, "txtStoreResult");
		// Verify live objects: directions, mobile call
		gl.VerifyElementVisible(Vype_StoreLocator.LiveObjects, "LiveObjects");
	}

	@And("^User verifies whether call popup and directions are displayed\"([^\"]*)\"$")
	public void User_verifies_whether_call_popup_and_directions_are_displayed(String addressInMap) throws Throwable {

		gl.VerifyObjectDisplayed(Vype_StoreLocator.lnkphoneIcon, "Make a call pop up");

		// Verify pop modal displayed in same tab.
		// gl. VerifyPageDisplayedUsingPageTitle("Vape stores near you - Vype Store
		// Locator");

		// click on direction Icon.
		gl.clickbutton(Vype_StoreLocator.lnkDirectionIcon, "Direction Icon");

		// verify google map opened in new tab.
		gl.fnSwitchToSucceedingTab();

		// Verify Direction present in new Tab
		gl.VerifyElementPresent(Vype_StoreLocator.lnkDirectionMapTab, "In New Tab Direction");

		// Verify address present in new Tab
		gl.ElementShouldContain(Vype_StoreLocator.addressInMapTab, "addressInMapTab", addressInMap);

		// Switch to Default tab
		gl.fnCloseCurrentTab();

		gl.fnSwitchToDefaultTab();

		// Hower mouse to store name.
		gl.HowerMouse(Vype_StoreLocator.txtStoreResult, "Store Name");

		// Verify the Location is highlighted/shown in the Interactive map at the right
		// side of the window
		gl.VerifyObjectDisplayed(Vype_StoreLocator.txtStoreResult, "Location is highlighted");

	}

}