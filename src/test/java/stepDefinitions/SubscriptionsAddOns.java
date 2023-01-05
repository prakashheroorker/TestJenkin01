package stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class SubscriptionsAddOns {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^Click on Add or modify button and select flavour \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" with Nicotine strength and click on Add$")
	public void click_on_Add_or_modify_button_and_select_flavour_with_Nicotine_strength_and_click_on_Add(String flavour1, String flavour2, String flavour3) throws Throwable {
		function.AddorModify(flavour1);
		gl.clickbutton(Vype_CommonXpath.btnSubmitUpadate, "Submit Update");
		gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");
		function.AddorModify(flavour2);
		gl.clickbutton(Vype_CommonXpath.btnSubmitUpadate, "Submit Update");
		gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");
		function.AddorModify(flavour3);
	}

	@When("^Click on Add or modify button$")
	public void click_on_Add_or_modify_button() throws Throwable {
		//Verify the "Add or modify" link is present
		gl.VerifyElementVisible(Vype_CommonXpath.btnAddmodify, "Add or modify items ");

		gl.clickUsingJs(Vype_CommonXpath.btnAddmodify, "Add or modify items ");
	}

	@Then("^Verify PICK YOUR PODS page displays\\.$")
	public void verify_PICK_YOUR_PODS_page_displays() throws Throwable {
		//Verify Pick your pods page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtPickyrPods, "Pick you pods");
	}


	@When("^Choose flavors \"([^\"]*)\" by clicking on the Add button for any desired flavors and verify selected flavour pop up opens and Flavour name,Nicotine strength,Quantity with \"([^\"]*)\",Add button$")
	public void choose_flavors_by_clicking_on_the_Add_button_for_any_desired_flavors_and_verify_selected_flavour_pop_up_opens_and_Flavour_name_Nicotine_strength_Quantity_with_Add_button(String Flavors, String quantity) throws Throwable {

		//clicking on 3 different flavors------------
		String S = Flavors;

		List<String> myList = new ArrayList<String>(Arrays.asList(S.split(","))); 

		for (String flavor : myList) {  

			Thread.sleep(2000);

			function.Pickpods(flavor,quantity);
		}
	}

}



