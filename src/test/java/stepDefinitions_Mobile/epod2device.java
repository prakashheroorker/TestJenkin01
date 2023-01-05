package stepDefinitions_Mobile;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.*;

public class epod2device {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^user clicks on Device, Pods and Accessories and clicks on epodtwo device$")
	public void user_clicks_on_Device_Pods_and_Accessories_and_clicks_on_epodtwo_device() throws Throwable {


		//click on Device, Pods & Accessories
		rai.clickUsingJs(Vype_CommonXpath.lnkdeviceandpods, "Device, Pods & Accessories ");


		//click on Device, Pods & Accessories
		rai.clickUsingJs(Vype_CommonXpath.lnkdevice, "epod2 Device ");
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkepod);
        Thread.sleep(2000);
        rai.clickUsingJs(Vype_CommonXpath.lnkepod, "epod2");
        Thread.sleep(2000);

	}

	@Then("^swipe to engraving and click on engraving and verify page$")
	public void swipe_to_engraving_and_click_on_engraving_and_verify_page() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtengravingtile);

		// Click on Engraving tile
		rai.clickbutton(Vype_CommonXpath.txtengravingtile, "Engraving tile");

		rai.ScrollByxpath(Vype_CommonXpath.pgengraving);

		// Verify the Engraving device page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgengraving, "Engraving Page");

	}



	

	

	
	@Then("^scroll to pods and click on pods$")
	public void scroll_to_pods_and_click_on_pods() throws Throwable {


		rai.ClickUsingOCR("Not Now");

		rai.ScrollByxpath(Vype_CommonXpath.lnkpods);
		rai.clickbutton(Vype_CommonXpath.lnkpods, "Click on pods");

	}

	@Then("^scroll to skins and click on skins and select skin \"([^\"]*)\"$")
	public void scroll_to_skins_and_click_on_skins_and_select_skin(String skin) throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.lnkskins);

		rai.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");


		//rai.clickUsingJs(Vype_CommonXpath.btnbuynow, "Click on buy now");

		//Select any Solstice skin colour
		rai.clickUsingJs(Vype_CommonXpath.skintype(skin), "Skin selected is: "+skin);

		//scroll to choose quantiries
		//rai.ScrollByxpath(Vype_CommonXpath. txtchoose);

		//Click on BuyNow button
		rai.clickUsingJs(Vype_CommonXpath.buynow, "click buynow");


	}

	

	@And("^Add charging cable and pouch \"([^\"]*)\" and add to cart$")
	public void add_charging_cable_and_pouch_and_add_to_cart(String colour) throws Throwable {

		//Click on Charging cable
		rai.clickbutton(Vype_CommonXpath.btnplus, "+ ");

		//Click on Add button
		rai.clickUsingJs(Vype_CommonXpath.addbtn, "Add ");



		//Click on pouch 
		rai.clickbutton(Vype_CommonXpath.imgpouch, "pouch  ");

		//Click on colour
		rai.clickUsingJs(Vype_CommonXpath.pouchcolour(colour), colour+"colour ");


		//Click on Add to cart button
		rai.clickUsingJs(Vype_CommonXpath.btnAddtoCart, "Add to cart ");

	}

	@Then("^Scroll to core collections and verify device page$")
	public void scroll_to_core_collections_and_verify_device_page() throws Throwable {

		Thread.sleep(10000);
		rai.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");

		Thread.sleep(10000);
		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

	}

	@Then("^Select device colour \"([^\"]*)\" and verify device images and add to cart$")
	public void select_device_colour_and_verify_device_images_and_add_to_cart(String devicecolour) throws Throwable {

		// Select any colour
		rai.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

		// Verify Text Power on with the VUSE ePod2 section is displayed

		rai.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

		for(int i=0;i<4;i++)
		{
			rai.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

			rai.VerifyElementVisible(Vype_CommonXpath.weProductImage,"product images ");
		}

		// Click on Add to Cart button
		rai.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to Cart");

		// Verify mini cart is updated
		String str;
		str = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");


	}

	@Then("^Scroll to skins and select skin \"([^\"]*)\" and add to cart$")
	public void scroll_to_skins_and_select_skin_and_add_to_cart(String skinindex) throws Throwable {

		int index = Integer.parseInt(skinindex);
		
		// Scroll to skins
		rai.ScrollByxpath(Vype_CommonXpath.txtskins);


        System.out.println(index);

		List<WebElement> list =rai.findElementsList(Vype_CommonXpath.btnSkinSelect);
		System.out.println(list.get(index));
		list.get(index).click();



		// Click on Add to Cart button
		rai.clickbutton(Vype_CommonXpath.btnSkinsAddToCART, "Add to Cart");

		String str;
		// Verify Mini cart is updated
		str = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

	}


	@Then("^click on explore and select \"([^\"]*)\" and verify flavor details$")
	public void click_on_explore_and_select_and_verify_flavor_details(String flavor) throws Throwable {

		//Click on Explore button
		rai.clickUsingJs(Vype_CommonXpath.btnExplore, "Explore");

		// Verify that ePod's pods page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");


		//click on flavor
		rai.clickUsingJs(Vype_CommonXpath.txtFlavor(flavor), flavor );



		boolean b1=rai.verifyobjectisnotavailable(Vype_CommonXpath.txtflavor2(flavor));

		if(b1==true)
		{
			String flavor1=flavor.toUpperCase();
			rai.VerifyElementsVisible(Vype_CommonXpath.txtflavor2(flavor1), flavor1 );

		}
		if(b1==false)
		{
			rai.VerifyElementsVisible(Vype_CommonXpath.txtflavor2(flavor), flavor );
		}
	}



	@Then("^click on plus button under pod caps and add to cart$")
	public void click_on_plus_button_under_pod_caps_and_add_to_cart() throws Throwable {

		rai.ScrollByxpath(By.xpath("//*[text()='Pod Caps']"));
		//+ pod caps
		rai.clickUsingJs(Vype_CommonXpath.btnpodcaps, "+ on pod caps");

		//adding pod caps
		rai.clickUsingJs(Vype_CommonXpath.btnpodcapsadd, "Add ");
	}

	@Then("^click on epodtwo rings \"([^\"]*)\" and add to cart$")
	public void click_on_epodtwo_rings_and_add_to_cart(String ring) throws Throwable {

		
		//epod2 rings
		rai.clickUsingJs(Vype_CommonXpath.btnepodrings, "epod2 rings ");
		
		rai.ScrollByxpath(Vype_CommonXpath.btnring(ring));

		//Adding ring
		rai.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );

		//Add to cart
		rai.clickUsingJs(Vype_CommonXpath.btnAddToCART, "Add to cart ");

	}
	
	
	//Added by Sandeepa S
	
	@Then("^User clicks on personalize your epodtwo and clicks on shop epodtwo skins")
	public void user_clicks_on_personalize_your_epodtwo_and_clicks_on_epodtwo_device() throws Throwable {

		//click on Personalize your ePod
		rai.clickUsingJs(Vype_CommonXpath.lnkPersonalizeyourePod, "Personalize your ePod ");

		//click on Device, Pods & Accessories
		rai.clickUsingJs(Vype_CommonXpath.lnkShopePod2Skin, "Shop ePod2 Skin ");
		
	}
	
	@Then("^verify epodtwo skins page is Displayed$")
	public void Verify_epod2_skins_Page_is_Displayed() throws Throwable {
	
	//verify epod2 page : Shop This Skin
	rai.VerifyElementsVisible(Vype_CommonXpath.txtTheArt, "The Art ");
	}
	
	@Then("^swipe to our core collections and click on Buynow \"([^\"]*)\"")
	public void scroll_to_our_core_collections_and_click_on_Buynow_and_select(String Skin) throws Throwable {

		//Add skin
		function.ChooseSkin(Skin);
	}
	
	@Then("^select skin \"([^\"]*)\" and Verify selected skin page displayed")
	public void select_skin_and_verify_selected_skin_page_is_displayed(String Skin) throws Throwable {

		//Select Skin and Verify
		function.SelectSkinAndVerify(Skin);
	}

	
	
	
}
