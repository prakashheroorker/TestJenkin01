package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_podcaps;
import goVype_Properties_mobile.Vype_podcaps_Mobile;

public class podcaps {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify ePod caps in Accessories page$")
	public void verify_ePod_caps_in_Accessories_page() throws Throwable {
		rai.ScrollByxpath(Vype_podcaps_Mobile.ePodcapsbtn);
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.ePodcapsbtn,"epod caps");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.amount,"3.99");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.plusbtn,"+ button");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.minusbtn,"- button");
		
		//rai.isDisabled(Vype_podcaps_Mobile.minusbtn, "Add button is disabled");
	}

	@When("^Click plus and minus buttons under ePod caps$")
	public void click_plus_and_minus_buttons_under_ePod_caps() throws Throwable {
		
		for(int i = 0; i<3; i++)
			rai.clickUsingJs(Vype_podcaps_Mobile.plusbtn,"+ button");
		
		rai.clickUsingJs(Vype_podcaps_Mobile.minusbtn,"- button");
		
		/**/
	}

	@Then("^Verify clear Indigo and Red yellow variants are present in drop down of ePod caps$")
	public void verify_clear_Indigo_and_Red_yellow_variants_are_present_in_drop_down_of_ePod_caps() throws Throwable {
	    
		/*rai.isEnabled(Vype_podcaps_Mobile.minusbtn, "Add button is disabled");
		
		rai.clickUsingJs(Vype_podcaps_Mobile.dropdown, "drop down");*/
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.clearIndigo,"clear Indigo");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.yellow,"Red & Yellow");
	}
	
	@When("^Click on ePod caps$")
	public void click_on_ePod_caps() throws Throwable {
		rai.clickUsingJs(Vype_podcaps_Mobile.ePodcapsbtn, "epod caps");
	}

	@Then("^verify Epod caps page$")
	public void verify_Epod_caps_page() throws Throwable {
	    rai.ScrollByxpath(Vype_podcaps_Mobile.ePodcapsPage);
	    
	    rai.VerifyElementsVisible(Vype_podcaps_Mobile.ePodcapsPage,"ePod caps page is displayed");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.ePodcapsContent, "2 caps/pack. Device and pod sold separately.");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.ePodcapsDes,"Protect your Pod with our pod caps to keep it clean.");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.ClearandIndigo,"Clear & Indigo");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.RedandYellow,"Red & Yellow");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.plus, " + ");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.minus, " - ");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.AddToCart, "Add to Cart");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.amount, " $3.99 ");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.Rightcarousel,"Right carousel");
	}

	@When("^Click any variant \"([^\"]*)\" clear Indigo or Red yellow$")
	public void click_any_variant_clear_Indigo_or_Red_yellow(String colour) throws Throwable {
		rai.clickUsingJs(Vype_podcaps_Mobile.colour(colour)," variant ");
	}

	@Then("^Verify respective colour \"([^\"]*)\" is displayed on device or not$")
	public void verify_respective_colour_is_displayed_on_device_or_not(String colour) throws Throwable {
		rai.ScrollByxpath(Vype_podcaps_Mobile.image);
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.DeviceColour(colour),"Device Colour");
		
		rai.VerifyElementsVisible(Vype_podcaps_Mobile.ColourName(colour),"Colour name");
		
		rai.clickUsingJs(Vype_podcaps_Mobile.Rightcarousel, "Rightcarousel");
		
		rai.clickUsingJs(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		
		rai.ScrollByxpath(Vype_podcaps_Mobile.ePodcapsPage);
		
		//rai.VerifyElementsVisible(Vype_podcaps_Mobile.OrderText,"Order before ");
	}
	
	@When("^Add Device to the cart$")
	public void add_Device_to_the_cart() throws Throwable {
		rai.clickbutton(Vype_podcaps.AddToCart, "Add to Cart");
	}
}
