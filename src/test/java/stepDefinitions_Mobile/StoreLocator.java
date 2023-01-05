package stepDefinitions_Mobile;

import org.openqa.selenium.By;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class StoreLocator {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@And("^user scrolls to store locator footer link and store locator$")
	public void user_scrolls_to_store_locator_footer_link_and_store_locator() throws Throwable {

		//Scroll down to footer section
		rai.ScrollByxpath(Vype_Footer.lnkstorelocator);

		//Click on the 'Store Locator' that is present in the Home Page
		rai.clickLink(Vype_StoreLocator.lnkStoreLocator, "lnkStoreLocator");
		Thread.sleep(5000);
		rai.ClickUsingOCR("ALlow");
		Thread.sleep(5000);

		//rai.ClickUsingOCR("ALlow only while using the app");
	}

	@Then("^Verify Store Locator page and verify Name and location fields$")
	public void verify_Store_Locator_page_and_verify_Name_and_location_fields() throws Throwable {

		//Verify the Google API page is displayed.
		rai.VerifyElementVisible(Vype_StoreLocator.txtFindAStore, "Store Locator Page");

		//input fields
		rai.VerifyElementVisible(Vype_StoreLocator.inputname, "dropdown ");


	}


	@Then("^Enter Location \"([^\"]*)\" and verify all results$")
	public void enter_Location_and_verify_all_results(String Location) throws Throwable {

		rai.selectByValue(Vype_StoreLocator.dropdwnLocation, "dropdwnLocation", "Location");
		//Enter address to search in Location field
		rai.TypeAndHitEnterText(Vype_StoreLocator.txtLocationField, "txtLocationField", Location);
		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");
		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");

		rai.ScrollByxpath(By.xpath("(.//*[contains(text(),'Stores')])"));

	}

	@And("^Verify store name \"([^\"]*)\"$")
	public void verify_store_name(String Storename) throws Throwable {

		//check store name in page
		rai.CheckTextOnThePage("storemap", Storename);

	}


	@Then("^click on name and enter store name \"([^\"]*)\" and verify \"([^\"]*)\"$")
	public void click_on_name_and_enter_store_name_and_verify(String Name, String storeName) throws Throwable {
		rai.selectByValue(Vype_StoreLocator.dropdwnLocation, "dropdwnLocation", "Name");
		rai.TypeAndHitEnterText(Vype_StoreLocator.txtStoreNameField, "txtStoreNameField", Name);
		Thread.sleep(5000);
		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");
		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");

		rai.ScrollByxpath(By.xpath("(.//*[contains(text(),'Stores')])"));
		rai.CheckTextOnThePage("storemap", storeName);
	}


	@Then("^Verify Live objects present on storemap page$")
	public void verify_Live_objects_present_on_storemap_page() throws Throwable {

		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");

		//Verify live objects: directions, mobile call
		rai.VerifyElementVisible(Vype_StoreLocator.LiveObjects, "LiveObjects");


	}

	@Then("^switch to list view and click on phone icon$")
	public void switch_to_list_view_and_click_on_phone_icon() throws Throwable {

		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");

		//Click on phone Icon.
		rai.clickbutton(Vype_StoreLocator.lnkphoneIcon, "Phone Icon");

		Thread.sleep(1000);
		//Verify live objects: directions, mobile call
		rai.VerifyElementVisible(Vype_StoreLocator.LiveObjects, "LiveObjects");

	}

	@Then("^swich to list view and click on directions icon$")
	public void swich_to_list_view_and_click_on_directions_icon() throws Throwable {

		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");

		// click on dirctions icon
		rai.clickbutton(Vype_StoreLocator.lnkDirectionIcon, "Direction Icon");

		//verify google map opened in new tab.
		rai.ClickUsingOCR("Always show");

		//Verify Direction present in new Tab
		rai.VerifyElementVisible(Vype_StoreLocator.lnkDirectionMapTab, "In New Tab Direction");

	}



	@Then("^verify direction details and navigate back to store locator page$")
	public void verify_direction_details_and_navigate_back_to_store_locator_page() throws Throwable {
		
		
		rai.ScrollByxpath(By.xpath("//*[@data-value='Directions']"));


		// Switch to Default tab		
		rai.ClosetabAndroid();	

		// switc to list view
		rai.clickbutton(Vype_StoreLocator.switchtolistview, "Switch to list view");
		//Verify the Loaction is highlighted/shown in the Interactive map at the right side of the window
		rai.VerifyElementVisible(Vype_StoreLocator.lnkDirectionIcon, "Location is highlighted");
	}




}
