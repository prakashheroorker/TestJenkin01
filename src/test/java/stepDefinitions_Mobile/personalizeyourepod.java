package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties_mobile.Vype_personalizeyourepod_mobile;

public class personalizeyourepod {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify Engrave Your ePod landing page is displayed$")
	public void verify_Engrave_Your_ePod_landing_page_is_displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_personalizeyourepod_mobile.EngravePage,"Engrave Page");
	}

	@When("^Click on OUR CORE COLLECTION$")
	public void click_on_OUR_CORE_COLLECTION() throws Throwable {
		rai.ScrollByxpath(Vype_personalizeyourepod_mobile.CoreCollection);
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.CoreCollection,"Core Collection");
	}

	@Then("^Verify CORE COLLECTION landing page is displayed$")
	public void verify_CORE_COLLECTION_landing_page_is_displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_personalizeyourepod_mobile.CoreCollectionPage,"Core Collection");
	}

	@When("^Select colour under Element Collection\"([^\"]*)\"$")
	public void select_colour_under_Element_Collection(String colour) throws Throwable {
		rai.ScrollByxpath(Vype_personalizeyourepod_mobile.ElementsCollection);
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.ElementsCollection,"Elements Collection");
		
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.colour(colour),"Elements Collection");
	}

	@Then("^Verify that the device colour changes\"([^\"]*)\"$")
	public void verify_that_the_device_colour_changes(String colour) throws Throwable {
		rai.VerifyElementsVisible(Vype_personalizeyourepod_mobile.Imgcolour(colour),"Device colur");
	}

	@When("^click on mini icon and select New\"([^\"]*)\"$")
	public void click_on_mini_icon_and_select_New(String icon) throws Throwable {
		rai.ScrollByxpath(Vype_personalizeyourepod_mobile.BtnMiniIcon);
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.BtnMiniIcon,"Mini Icon");
		
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.btnminiicon(icon),"Mini Icon");
	}

	@Then("^Verify the user is navigated to next Step$")
	public void verify_the_user_is_navigated_to_next_Step() throws Throwable {
		Thread.sleep(2000);
		rai.ScrolltoTopofthepage();
		Thread.sleep(2000);
		rai.ScrollByxpath(Vype_personalizeyourepod_mobile.Step2);
		Thread.sleep(2000);
		rai.VerifyElementsVisible(Vype_personalizeyourepod_mobile.Step2,"Step2");
	}

	@Then("^Add to cart$")
	public void add_to_cart() throws Throwable {
		rai.clickUsingJs(Vype_personalizeyourepod_mobile.AddToCart,"Add To Cart");
	}
}
