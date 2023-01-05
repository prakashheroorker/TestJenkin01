package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.GenericLib;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import java.util.Set;

import com.rai.framework.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Footer;
import goVype_Properties.Vype_StoreLocator;

public class StoreName extends BaseClass {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	GenericLib gL = new GenericLib();
	
	@When("^Click on the Store Locator that is present in the Home Page$")
	public void click_on_the_Store_Locator_that_is_present_in_the_Home_Page() throws Throwable {
		gl.fnScrollToView(Vype_Footer.lnkFAQs);
		gl.clickLink(Vype_StoreLocator.lnkStoreLocator, "lnkStoreLocator");
	}

	@Then("^Verify the Google API page is displayed in the same tab$")
	public void verify_the_Google_API_page_is_displayed_in_the_same_tab() throws Throwable {
		gl.VerifyPageDisplayed(Vype_StoreLocator.pgeStoreLocator2, "Store Locator Page");
	}
	
	@Then("^Search the store by selecting the Name from the drop down list$")
	public void search_the_store_by_selecting_the_Name_from_the_drop_down_list() throws Throwable {
		gl.selectByText(Vype_StoreLocator.dropdwnLocation, "dropdwnLocation", "Name");
	}

	@When("^Enter the Store Name in edit field \"([^\"]*)\"$")
	public void enter_the_Store_Name_in_edit_field(String StoreName) throws Throwable {
		gl.inputText(Vype_StoreLocator.txtStoreNameField, "txtStoreNameField", StoreName );
		Thread.sleep(3000);
	}


	@Then("^Verify the Store Name results \"([^\"]*)\"$")
	public void verify_the_Store_Name_results(String StoreName) throws Throwable {
		gl.ElementShouldContain(Vype_StoreLocator.txtbishop, "txtStoreResult", StoreName);
		Thread.sleep(3000);
	}
	
	@When("^Search the store by selecting the Location from the dropdown list$")
	public void search_the_store_by_selecting_the_Location_from_the_dropdown_list() throws Throwable {
		gl.selectByText(Vype_StoreLocator.dropdwnLocation, "dropdwnLocation", "Location");
		Thread.sleep(3000);
	}
	@When("^Search the store by select and Clear already existing search results$")
	public void search_the_store_by_select_and_Clear_already_existing_search_results() throws Throwable {
		gl.selectByText(Vype_StoreLocator.dropdwnLocation, "dropdwnLocation", "Location");
		Thread.sleep(3000);
		gl.clickUsingJs(Vype_StoreLocator.btnClear, "Clear search results");
		Thread.sleep(3000);
	}

	@Then("^Enter address to search in Location field \"([^\"]*)\"$")
	public void enter_address_to_search_in_Location_field(String location) throws Throwable {
		gl.inputText(Vype_StoreLocator.txtLocationField, "txtLocationField", location );
		gL.enterEnterUsingSelenium(Vype_StoreLocator.txtLocationField);
	}
	

	@Then("^Enter address to search and Verify address is Visible \"([^\"]*)\"$")
	public void enter_address_to_search_and_Verify_address_is_Visible(String location) throws Throwable {
		gl.inputText(Vype_StoreLocator.txtLocationField, "txtLocationField", location);
		Thread.sleep(3000);
		gL.enterEnterUsingSelenium(Vype_StoreLocator.txtLocationField);
		//gl.clickbutton(Vype_StoreLocator.txtPlacesInDropDown, "Address list");
		Thread.sleep(3000);
		gl.VerifyElementVisible(Vype_StoreLocator.txtlocationStoreResult1, "txtStoreResult");
		Thread.sleep(3000);
	}
	@Then("^Verify live objects: directions, mobile call$")
	public void verify_live_objects_directions_mobile_call() throws Throwable {
		//gl.VerifyElementVisible(Vype_StoreLocator.LiveObjects, "LiveObjects");
	}

	@Then("^Verify the Google API page is displayed and Store all window handles$")
	public void verify_the_Google_API_page_is_displayed_and_Store_all_window_handles() throws Throwable {
		Set<String> allWindowHandles = rdriver.getWindowHandles();
		//If allWindowHandles.Count is greater than 1 then you can say that new window has been opened.
		if (allWindowHandles.size() > 1)
		{
			System.out.println("New window has been opened. Switch to new window ");
		}
		else{
			System.out.println("Link opened in same tab");
			gl.VerifyPageDisplayed(Vype_StoreLocator.pgeStoreLocator2, "Store Locator Page in same tab ");
		}
	}

}
