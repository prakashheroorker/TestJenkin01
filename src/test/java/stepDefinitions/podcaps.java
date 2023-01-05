package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_podcaps;

public class podcaps {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@Then("^Verify ePod caps$")
	public void verify_ePod_caps() throws Throwable {
		gl.VerifyObjectDisplayed(Vype_podcaps.ePodcaps,"epod caps");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.amount,"3.99");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.plusbtn,"+ button");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.minusbtn,"- button");
		
		gl.isEnabled(Vype_podcaps.minusbtn, "Add button is disabled");
	}

	@When("^Click plus and minus buttons$")
	public void click_plus_and_minus_buttons() throws Throwable {
		
		for(int i = 0; i<3; i++)
			gl.clickUsingJs(Vype_podcaps.plusbtn,"+ button");
		
		gl.clickUsingJs(Vype_podcaps.minusbtn,"- button");
		
	}

	@Then("^Verify clear Indigo and Red yellow variants are present in drop down$")
	public void verify_clear_Indigo_and_Red_yellow_variants_are_present_in_drop_down() throws Throwable {

		//gl.isEnabled(Vype_podcaps.minusbtn, "Add button is disabled");
		
		//gl.clickUsingJs(Vype_podcaps.dropdown, "drop down");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.clearIndigo,"clear Indigo");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.yellow,"Red & Yellow");
	}
	
	@When("^click on ePod caps$")
	public void click_on_ePod_caps() throws Throwable {
	    gl.clickUsingJs(Vype_podcaps.ePodcapsbtn, "epod caps");
	}

	@Then("^Verify Epod caps page$")
	public void verify_Epod_caps_page() throws Throwable {
		gl.VerifyObjectDisplayed(Vype_podcaps.ePodcapsPage,"ePod caps page is displayed");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.ePodcapsContent, "2 caps/pack. Device and pod sold separately.");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.ePodcapsDes,"Protect your Pod with our pod caps to keep it clean.");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.ClearandIndigo,"Clear & Indigo");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.RedandYellow,"Red & Yellow");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.plus, " + ");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.minus, " - ");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.AddToCart, "Add to Cart");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.amount, " $3.99 ");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.Leftcarousel,"Left carousel");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.Rightcarousel,"Right carousel");
	}

	@When("^Click any variant clear Indigo or Red yellow\"([^\"]*)\"$")
	public void click_any_variant_clear_Indigo_or_Red_yellow(String colour) throws Throwable {
		Thread.sleep(10000);
		gl.clickbutton(Vype_podcaps.colour(colour)," variant ");
		
	}

	@Then("^Verify respective colour is displayed on device or not\"([^\"]*)\"$")
	public void verify_respective_colour_is_displayed_on_device_or_not(String colour) throws Throwable {
		
		
		Thread.sleep(6000);
		gl.VerifyObjectDisplayed(Vype_podcaps.ePodcapsPage);
		
		gl.VerifyObjectDisplayed(Vype_podcaps.DeviceColour(colour),"Device Colour");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.ColourName(colour),"Colour name");
		
		gl.clickUsingJs(Vype_podcaps.Rightcarousel, "Rightcarousel");
		
		gl.clickUsingJs(Vype_podcaps.Leftcarousel,"Left carousel");
		
		gl.VerifyObjectDisplayed(Vype_podcaps.OrderText,"Order before ");
	}

	@When("^Add the device to cart$")
	public void add_the_device_to_cart() throws Throwable {
	    gl.clickbutton(Vype_podcaps.AddToCart, "Add to Cart");
	}
}
