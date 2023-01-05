package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_Engrave_EpodDevice;
import goVype_Properties_mobile.Vype_ExperiencevuseXuLanding;






public class EngraveEpodsDevice {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@When("^click on Personalize your ePod and click on Engrave your ePod2$")
	public void hover_the_mouse_on_Shop_and_click_on_Engrave_your_epod_under_Personalized_your_epod() throws Throwable {
		
		//rai.clickUsingJs(Vype_ExperiencevuseXuLanding.weShop, "Shop");

		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.wePersonalizeYourEPod, "PersonalizeYourEPod");
		rai.clickUsingJs(Vype_Engrave_EpodDevice.lnkEngravings, "Engravings");




	}


	@Then("^Verify the user is redirected to Engravings Landing Page$")
	public void verify_the_user_is_redirected_to_Engravings_Landing_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(2000);
		rai.SwipeDownSmallerUnits(2);
		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weAMoment, "A Moment","A Moment");

	}

	@Then("^Click on Explore Now Button$")
	public void click_on_Explore_Now_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_Engrave_EpodDevice.weOurCore);

		rai.clickUsingJs(Vype_Engrave_EpodDevice.weOurCore, "ExploreNow");
	}

	@Then("^Verify the user is redirected to Pick Device Color and Design StylePage$")
	public void verify_the_user_is_redirected_to_Pick_Device_Color_and_Design_StylePage() throws Throwable {

		rai.verifyPageByObject(Vype_Engrave_EpodDevice.wePickDevice, "PickDevice","PickDevice");
	}

	@Then("^Select the Colour from the Core Collection Section$")
	public void select_the_Colour_from_the_Core_Collection_Section() throws Throwable {
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnBlue, "Blue");
		Thread.sleep(1000);


	}

	@Then("^Verifiy that the device colour changes based on the selection made\\.$")
	public void verifiy_that_the_device_colour_changes_based_on_the_selection_made() throws Throwable {
		rai.SwipeDownSmallerUnits(2);
		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weDeviceClr, "Device Clr","Device Clr");

	}

	@Then("^Select the New Pattern \"([^\"]*)\"and click on \"([^\"]*)\"add patern Button$")
	public void select_the_New_Pattern_and_click_on_add_patern_Button(String Pattern, String TuAnPattern) throws Throwable {
		rai.SwipeDownSmallerUnits(2);
		rai.inputText(Vype_Engrave_EpodDevice.wePattern, "wePattern", Pattern);
		rai.SwipeDownSmallerUnits(1);
		rai.inputText(Vype_Engrave_EpodDevice.weTuAnPattern, "TuAnPattern", TuAnPattern);
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnAddPattern, "AddPattern");

	}

	@When("^Verify the user is navigated to Step(\\d+): Now customize the Back$")
	public void verify_the_user_is_navigated_to_Step_Now_customize_the_Back(int arg1) throws Throwable {
		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weNowCustomize, "weNowCustomize","NowCustomize");
	}

	@Then("^click on Text and select the text direction \\(Hortizontal /Vertical\\)$")
	public void click_on_Text_and_select_the_text_direction_Hortizontal_Vertical() throws Throwable {
		Thread.sleep(10000);
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnText, "Text");
		Thread.sleep(1000);
		rai.SwipeUpSmallerUnits(2);
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnVertical, "Vertical");
	}

	@Then("^Enter the Text \"([^\"]*)\" by selecting the font style from available styles$")
	public void enter_the_Text_by_selecting_the_font_style_from_available_styles(String text) throws Throwable {
		//rai.inputText(Vype_Engrave_EpodDevice.weEnterText, "weEnterText", text);
		rai.TypeAndHitEnterText(Vype_Engrave_EpodDevice.weEnterText, "weEnterText", text);

		rai.EnterText(text);
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnArabella, "Arabella");
	}

	@Then("^Click on Add Text Button$")
	public void click_on_Add_Text_Button() throws Throwable {
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnAddText, "AddText");

	}

	@And("^verify user is navigated to Now customize the Back$")
	public void verify_user_is_navigated_to_Now_customize_the_Back() throws Throwable {
		rai.VerifyPageByObject(Vype_Engrave_EpodDevice.weNowCustomize, "weNowCustomize", "weNowCustomize");
	}



	@Then("^Verfiy the user is redirected to Engraving Summary Page$")
	public void verfiy_the_user_is_redirected_to_Engraving_Summary_Page() throws Throwable {
		Thread.sleep(1000);
		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weEngravingSummary, "EngravingSummary","EngravingSummary");

	}

	@Then("^Verify the image on the left is as per the customizations added$")
	public void verify_the_image_on_the_left_is_as_per_the_customizations_added() throws Throwable {

		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weEngraving, "Engraving","Engraving");

	}

	@Then("^verify the Engraving Summary$")
	public void verify_the_Engraving_Summary() throws Throwable {
		rai.verifyPageByObject(Vype_Engrave_EpodDevice.weEngravingSum, "EngravingSummary","EngravingSummary");

	}

	@When("^Click on \"([^\"]*)\" Button$")
	public void click_on_Button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_Engrave_EpodDevice.btnAddToCart, "AddToCart");
	}

	@Then("^Verify the user is redirected to Cart Page$")
	public void verify_the_user_is_redirected_to_Cart_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^navigate to cart page$")
	public void navigate_to_cart_page_and_click_on_checkout_and_navigate_to_delivary_page() throws Throwable {

		// Hover on the Cart icon
		rai.clickUsingJs(Vype_CommonXpath.lnkCartIcon, "Cart Icon");

		Thread.sleep(2000);

		// Click on "View Cart" button from Tiny Cart modal
		rai.clickUsingJs(Vype_CommonXpath.btnViewCart, "View Cart button from Tiny Cart modal");

		Thread.sleep(3000);

		rai.ScrollByxpath(Vype_Cart.pgCart);

		Thread.sleep(2000);

		// Verify that Shipping Cart page
		rai.VerifyElementVisible(Vype_Cart.pgCart, "Shipping Cart");
		Thread.sleep(3000);






	}



}


