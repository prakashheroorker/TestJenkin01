package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.*;


import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_ePodStarterKit;


public class ePodPods {	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^user navigates to ePod Device$")
	public void user_navigates_to_ePod_Device() throws Throwable {

		//Navigate to device
		function.navigateToePodDevice();

	}

	@Then("^user engrave the device by selecting DeviceColour \"([^\"]*)\", PatternName \"([^\"]*)\",TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\" and FirstName\"([^\"]*)\"$")
	public void user_engrave_the_device_by_selecting_DeviceColour_PatternName_TextDirection_FontStyle_Text_and_FirstName(String DeviceColour, String PatternName, String TextDirection, String FontStyle, String Text, String FirstName) throws Throwable {

		function.engraveDevice(DeviceColour,PatternName,TextDirection,FontStyle,Text,FirstName);

		gl.fnScrollToView(Vype_CommonXpath.lnkOneTimePurchase);

		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkOneTimePurchase, "Engraved device");
	}

	@Then("^add Cartridges for engraved device with Flavor \"([^\"]*)\" and Nicotine Strength \"([^\"]*)\"$")
	public void add_Cartridges_for_engraved_device_with_Flavor_and_Nicotine_Strength(String Flavor, String NicotineStrength) throws Throwable {

		gl.fnScrollToView(Vype_CommonXpath.lnkpods);
		gl.clickUsingJs(Vype_CommonXpath.lnkpods, "Click on pods");

		//Scroll to the flavor
		gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(Flavor));

		Thread.sleep(3000);

		//Add required number of quantity for subscription

		gl.clickUsingJs(Vype_CommonXpath.btnqtydecrement(Flavor), "Decrement Quantity");
		Thread.sleep(3000);
		

		gl.clickUsingJs(Vype_CommonXpath.btnqtyincrement(Flavor), "Increment Quantity");
		Thread.sleep(1000);
		Thread.sleep(2000);

		//Add to subscription Subscription option
		gl.clickbutton(Vype_CommonXpath.btnadd(Flavor), "Add ");


	}



	@When("^user engrave the device by selecting DeviceColour \"([^\"]*)\", PatternName \"([^\"]*)\",TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\" and FirstName\"([^\"]*)\" from Elements Collection$")
	public void user_engrave_the_device_by_selecting_DeviceColour_PatternName_TextDirection_FontStyle_Text_and_FirstName_from_Elements_Collection(String DeviceColour, String PatternName, String TextDirection, String FontStyle, String Text, String FirstName) throws Throwable {

		function.engraveDeviceFromElementCollection(DeviceColour,PatternName,TextDirection,FontStyle,Text,FirstName);

		gl.fnScrollToView(Vype_CommonXpath.lnkOneTimePurchase);

		gl.VerifyObjectDisplayed(Vype_CommonXpath.lnkOneTimePurchase, "Engraved device");
	}

	@Then("^add ePod SkinName as Skin \"([^\"]*)\"$")
	public void add_ePod_SkinName_as_Skin(String Skin) throws Throwable {

		//selecting skin
		function.selectePodSkins(Skin);

	}

	@Then("^add charging cable from Acccersories$")
	public void add_charging_cable_from_Acccersories() throws Throwable {

		//click on Acccersories---------------//
		gl.fnScrollToView(Vype_CommonXpath.lnkAccesories);

		gl.clickbutton(Vype_CommonXpath.lnkAccesories, "Click on all Acessories");


		gl.clickbutton(Vype_CommonXpath.chargingcable, "click on plus button");

		gl.clickbutton(Vype_CommonXpath.addbtn, "Click on add button");

	}

	@Then("^verify the price in cart$")
	public void verify_the_price_in_cart() throws Throwable {

		function.hoverCartAndClickViewCart();
		//Verify the product is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		//verify one time purchase
		String OneTimePurchaseTotal=gl.getText(Vype_ePodStarterKit.wetxtPrice);
		float f = Float.parseFloat(OneTimePurchaseTotal.substring(1));
		gl.VerifyObjectDisplayed(Vype_ePodStarterKit.wetxtPrice, ">>>>>>>>One time purchase value is: " + f + ">>>>>>>>>>>>");


	}

	@When("^user clicks on engravable device to select device color as \"([^\"]*)\"$")
	public void user_clicks_on_engravable_device_to_select_device_color_as(String color) throws Throwable {

		function.clickAndVerifyEngravableDevice();		

		//scroll to view the element
		gl.ScrollPageDown();

		function.selectAndVerifyDeviceColor(color);
		Thread.sleep(3000);

		//Verify the setp 1 of customization i.e. customize the front page displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "01 | Customize the Front");

	}

	@When("^user select device design style as Mini Icon to select mini icon$")
	public void user_select_device_design_style_as_Mini_Icon_to_select_mini_icon() throws Throwable {

		//Click on Mini Icon
		gl.clickUsingJs(Vype_ePodStarterKit.BtnMiniIcon, "Mini Icon");

		//Select  Bolt
		gl.clickbutton(Vype_ePodStarterKit.btnBerg, "Berg");

		//However mouse to add mini icon.
		gl.HowerMouse(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");

		//Click on Mini Icon
		gl.clickbutton(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");

	}

	@When("^user customize back by selecting TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\"$")
	public void user_customize_back_by_selecting_TextDirection_FontStyle_Text(String TextDirection, String FontStyle, String Text) throws Throwable {
		//Scroll to view navigated to step 2" Now customize back"
		gl.fnScrollToView(Vype_ePodStarterKit.txtCustomizeBack);

		//Verify user is navigated to step 2" Now customize back"
		gl.VerifyElementVisible(Vype_ePodStarterKit.txtCustomizeBack, "Costomize Back");

		//Click on text
		gl.clickbutton(Vype_ePodStarterKit.btnText, "Text");

		//Select the text direction(Horizontal/Vertical)
		gl.clickbutton(Vype_ePodStarterKit.btnHorizontal, TextDirection);

		//Enter the text
		gl.inputText(Vype_CommonXpath.txtEnterText, "Enter upto 3 Characters", Text);

		//Select the font Style
		gl.clickbutton(Vype_CommonXpath.btnFontStyle(FontStyle), "Font Style");

		//Click on AddText button
		gl.clickbutton(Vype_CommonXpath.btnAddText, "Add Text");

	}

	@Then("^verify engraving summary page$")
	public void verify_engraving_summary_page() throws Throwable {

		//Verify user is redirected to engraving summary page.
		gl.VerifyElementVisible(Vype_CommonXpath.txtEngravingSummary, "Engraving Summary");
		//Click on add engraving 
		gl.clickbutton(Vype_ePodStarterKit.btnAddEngraving, "Add Engraving");


	}
	@When("^user engrave the device by selecting DeviceColour \"([^\"]*)\" and add to cart$")
	public void user_engrave_the_device_by_selecting_DeviceColour_and_add_to_cart(String devicecolour) throws Throwable {

		//adding device
		function.selectDeviceColorforepod2Corecollections(devicecolour);
	}

	@Then("^user selects skin \"([^\"]*)\" and charging cable$")
	public void user_selects_skin_and_charging_cable(String devicecolour) throws Throwable {

		gl.clickUsingJs(Vype_CommonXpath.lnkePods2, "ePod 2");
		
		gl.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);
		
		gl.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");
		
	}

	@Then("^add Cartridges for epodtwo core collection with Flavor \"([^\"]*)\"$")
	public void add_Cartridges_for_epodtwo_core_collection_with_Flavor(String Flavor) throws Throwable {

		//Adding flavor
		function.addflavorincorecollections(Flavor);
	}

	@And("^user select device design style as Mini Icon to select \"([^\"]*)\"$")
	public void user_select_device_design_style_as_Mini_Icon_to_select(String miniicon) throws Throwable {

		//gl.clickUsingJs(Vype_CommonXpath.Minimize, "Minimize");
		Thread.sleep(2000);
		//Click on Mini Icon
		gl.clickUsingJs(Vype_ePodStarterKit.BtnMiniIcon, "Mini Icon");

		gl.clickUsingJs(Vype_CommonXpath.btnminiicon(miniicon), miniicon);

		//However mouse to add mini icon.
		gl.HowerMouse(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");

		//Click on Mini Icon
		gl.clickbutton(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");
	}

	@And("^add pouch \"([^\"]*)\" from Acccersories$")
	public void add_pouch_from_Acccersories(String pouchcolour) throws Throwable {

		//click on Acccersories---------------//
		gl.fnScrollToView(Vype_CommonXpath.lnkAccesories);

		gl.clickbutton(Vype_CommonXpath.lnkAccesories, " All Acessories");

		gl.clickUsingJs(Vype_CommonXpath.lnkpouch, "pouch ");

		gl.clickUsingJs(Vype_CommonXpath.btndevicecolour(pouchcolour), "colour selected is:" + pouchcolour);

		gl.clickUsingJs(Vype_CommonXpath.AddtoCart, "Add to cart");




	}

	@When("^user adds podcaps and epod rings with design \"([^\"]*)\"$")
	public void user_adds_podcaps_and_epod_rings_with_design(String ring) throws Throwable {

		//click on Accessories---------------//
		gl.fnScrollToView(Vype_CommonXpath.lnkAccesories);

		//Accessories 
		gl.clickbutton(Vype_CommonXpath.lnkAccesories, " All Acessories");

		//+ pod caps
		gl.clickUsingJs(Vype_CommonXpath.btnpodcaps, "+ on pod caps");

		//adding pod caps
		gl.clickUsingJs(Vype_CommonXpath.btnpodcapsadd, "Add ");
		
		gl.fnScrollToView(Vype_CommonXpath.btnepodrings);
		//epod2 rings
		//gl.clickUsingJs(Vype_CommonXpath.btnepodrings, "epod2 rings ");

		//Adding ring
		gl.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );

		//Add to cart
		//gl.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to cart ");


	}

	@When("^navigate to epod page$")
	public void navigate_to_epod_page() throws Throwable {
		function.navigateToePodPods();
	}

}