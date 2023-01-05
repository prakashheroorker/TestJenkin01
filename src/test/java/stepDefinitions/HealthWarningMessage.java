package stepDefinitions;

import org.junit.Assert;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.Then;

import goVype_Properties.Vype_CommonXpath;

public class HealthWarningMessage {	

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


	@Then("^user navigates to ePod Device page and verify the health warning message$")
	public void user_navigates_to_ePod_Device_page_and_verify_the_health_warning_message() throws Throwable {

		//gl.clickUsingJs(Vype_CommonXpath.btnVuseLogo ,"Vuse logo");

		//function.navigateToMyAccountFromHome();

		gl.refresh();
		Thread.sleep(5000);
		//Navigate to ePod Device page
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link");



		// Verify the Submenu with ePod is loaded
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtepod, "ePod page  ");

		Thread.sleep(5000);

		// Click on device link under the ePod section
		gl.clickUsingJs(Vype_CommonXpath.txtepod, "device");

		Thread.sleep(5000);





		//Verify the "Health Warning" Message is displayed in ePod Device page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Shop ePod2 device");


	}

	@Then("^user navigates to ePod pods page and verify the health warning message$")
	public void user_navigates_to_ePod_pods_page_and_verify_the_health_warning_message() throws Throwable {


		gl.refresh();
		//Navigate to ePod pods page
		function.navigateToePodPods();

		//Verify the "Health Warning" Message is displayed in ePod pods page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in shop epod2 pods");


	}

	@Then("^user navigates to ePod Accessories page and verify the health warning message$")
	public void user_navigates_to_ePod_Accessories_page_and_verify_the_health_warning_message() throws Throwable {

		//function.navigateToMyAccountFromHome();
		gl.refresh();
		// Hover the mouse on Products link
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shops link from the main menu navigation");

		// Click on ePod Charger link
		gl.clickbutton(Vype_CommonXpath.lnkAccessories, "Charger link ");

		// Verify the user is redirected to Vuse ePod Charger Page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePodAccessories, "ePod Accessories ");
		//Verify the "Health Warning" Message is displayed in ePod Accessories page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in shop ePod2 Accessories");

	}

	@Then("^user navigates to Experience vuseXu page and verify the health warning message$")
	public void user_navigates_to_Experience_vuseXu_page_and_verify_the_health_warning_message() throws Throwable {
		gl.refresh();
		
		Thread.sleep(5000);

		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on Experience vuseXu link under the ePod section
		gl.clickbutton(Vype_CommonXpath.lnkExperiencevuseXu,"Experience vuseXu from the Personalize your epod section");

		Thread.sleep(5000);

		//Verify that Experience vuseXu page is displayed.
		gl.VerifyPageDisplayed(Vype_CommonXpath.weVideoinvuseXu, "Experience vuseXu page");

		//Verify the "Health Warning" Message is displayed in ePod Accessories page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Experience vuse X U page");

	}

	@Then("^user navigates to shop ePod skins page and verify the health warning message$")
	public void user_navigates_to_shop_ePod_skins_page_and_verify_the_health_warning_message() throws Throwable {		

		//function.navigateToMyAccountFromHome();
		gl.refresh();
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on shop ePod skins link under the Personalize your ePod section
		gl.clickUsingJs(Vype_CommonXpath.lnkePodSkins, "Cliked on shop ePod skins");

		Thread.sleep(3000);

		//Verify ePod skins page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.imgserpaskin, "ePod skins page is displayed");

		gl.ScrollPageUp();

		//Verify the "Health Warning" Message is displayed in ePod skins page page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Shop ePod2 skins pages");

	}

	@Then("^user navigates to Engrave Your ePod page and verify the health warning message$")
	public void user_navigates_to_Engrave_Your_ePod_page_and_verify_the_health_warning_message() throws Throwable {

		//function.navigateToMyAccountFromHome();
		
		gl.refresh();
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on Engrave Your ePod link under the Personalize your ePod section
		gl.clickbutton(Vype_CommonXpath.lnkEngraveyourePod, "Cliked on Engrave your ePod link");

		Thread.sleep(3000);

		//Verify Engrave Your ePod is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinEngraveyourePod, "Engrave your ePod page is displayed");

		gl.ScrollPageUp();

		//Verify the "Health Warning" Message is displayed in Engrave Your ePod page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Engrave your ePod2 page");

	}

	@Then("^user navigates to New launches Skins Page and verify the health warning message$")
	public void user_navigates_to_New_launches_Skins_Page_and_verify_the_health_warning_message() throws Throwable {

		//function.navigateToMyAccountFromHome();
		gl.refresh();
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on skins link under the New Launches section
		gl.clickbutton(Vype_CommonXpath.lnkSkins, "Cliked on skins");

		Thread.sleep(3000);

		//Verify skins PDP page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.weleftpage, "skins PDP page is displayed");

		//Verify the "Health Warning" Message is displayed in ePod skins page page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in new launches Skins page");

	}

	@Then("^user navigates to New launches Pod Caps and verify the health warning message$")
	public void user_navigates_to_New_launches_Pod_Caps_and_verify_the_health_warning_message() throws Throwable {

		
		gl.refresh();
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on Pod Caps link under the New Launches section
		gl.clickbutton(Vype_CommonXpath.lnkPodCaps, "Cliked on POD CAPS");

		Thread.sleep(3000);

		//Verify Pod Caps PDP page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinPodCaps, "Pod Caps PDP page is displayed");

		//Verify the "Health Warning" Message is displayed in Pod Caps page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Pod CAPs page");

	}

	@Then("^user navigates to New launches ePod two and verify the health warning message$")
	public void user_navigates_to_New_launches_ePod2_and_verify_the_health_warning_message() throws Throwable {

		gl.refresh();
		
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on Mango ePod Pod link under the New Launches section
		gl.clickbutton(Vype_CommonXpath.lnkePods2, "Cliked on New Launches ePod 2");

		Thread.sleep(3000);

		//Verify Mango ePod Pod PDP page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.wetxtVuseePod, "VUSE ePod");

		//Verify the "Health Warning" Message is displayed in Mango ePod Pod page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in New Launches ePod 2");


	}

	@Then("^user navigates to New launches Engraving and verify the health warning message$")
	public void user_navigates_to_New_launches_Engraving_and_verify_the_health_warning_message() throws Throwable {

		gl.refresh();
		//Hover the mouse on Shop link
		gl.HowerMouse(Vype_CommonXpath.lnkProducts, "Shop link from the main menu navigation");

		//Verify the Submenu with ePen3 and ePod is loaded
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtePenePod, "ePen ePod ");

		//Click on Ring link under the New Launches section
		gl.clickbutton(Vype_CommonXpath.txtengraveurepod, "Clicked on Engraving under New launches");

		Thread.sleep(3000);

		//Verify Engrave Your ePod is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinEngraveyourePod, "Engrave your ePod page is displayed");

		gl.ScrollPageUp();

		//Verify the "Health Warning" Message is displayed in Engrave Your ePod page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in new launched Engraving page");

	}

	@Then("^user navigates to Offers Starter Bundle and verify the health warning message$")
	public void user_navigates_to_Offers_Starter_Bundle_and_verify_the_health_warning_message() throws Throwable {

		
		gl.refresh();

		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");


		//Click on Starter bundle link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkStarterBundle, "Cliked on Starter Bundle link");

		Thread.sleep(3000);

		//Verify Starter bundle page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtYourcolours, "Starter Bundle page is displayed");

		//Verify the "Health Warning" Message is displayed in Engrave Your ePod page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Starter Bundle page");

	}

	@Then("^user navigates to Offers \"([^\"]*)\" for \"([^\"]*)\" ePod Pods and verify the health warning message$")
	public void user_navigates_to_Offers_three_for_thirty_three_ePod_Pods_and_verify_the_health_warning_message(String a,String b) throws Throwable {

		gl.refresh();
		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");

		//Click on 3 for $33 ePod Pods link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkForPods(a,b), "Cliked on" +a+" for $"+b+" ePod Pods link");

		Thread.sleep(3000);

		//Verify 3 for $33 ePod Pods page is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtMixAndMatch3Pack, a +" for $"+b+ " ePod Pods page is displayed");

		//Verify the "Health Warning" Message is displayed in 3 for $33 ePod Pods page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in 3 for $33 ePod Pods page");

	}

	@Then("^user navigates to Save Offers \"([^\"]*)\" for \"([^\"]*)\" ePod Pods and verify the health warning message$")
	public void user_navigates_to_Offers_five_for_fifty_ePod_Pods_and_verify_the_health_warning_message(String a,String b) throws Throwable {

		gl.refresh();
		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");


		//Click on 5 for $50 ePod Pods link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkForPods(a,b), "Cliked on" +a+" for $"+b+" ePod Pods link");

		Thread.sleep(3000);

		//Verify 5 for $50 ePod Pods page is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.txtin5For50, a+" for $"+b+" ePod Pods page is displayed");

		//Verify the "Health Warning" Message is displayed in 5 for $50 ePod Pods page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in 5 for $50 ePod Pods page");

	}

	@Then("^user navigates to Programs Subscribe & Save and verify the health warning message$")
	public void user_navigates_to_Programs_Subscribe_Save_and_verify_the_health_warning_message() throws Throwable {

		gl.refresh();
		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");


		//Click on Subscribe & Save (up to 30%) link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkSubscribeSave, "Cliked on Subscribe & Save (up to 30%) link");

		Thread.sleep(3000);

		//Verify Subscribe & Save (up to 30%) page is displayed
		//gl.VerifyObjectDisplayed(Vype_CommonXpath.pgeSubscribeAndSave, "Subscribe & Save (up to 30%) page is displayed");

		//Verify the "Health Warning" Message is displayed in Subscribe & Save (up to 30%) page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Subscribe & Save (up to 30%) page");


	}

	@Then("^user navigates to Programs Pass On The Savings and verify the health warning message$")
	public void user_navigates_to_Programs_Pass_On_The_Savings_and_verify_the_health_warning_message() throws Throwable {

		gl.refresh();
		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");


		//Click on Pass On The Savings (up to $200) link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkPassOnTheSavings, "Cliked on Pass On The Savings (up to $200) link");

		Thread.sleep(3000);

		//Verify Pass On The Savings (up to $200) page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtPassOntheSavings, "Pass On The Savings (up to $200) page is displayed");

		//Verify the "Health Warning" Message is displayed in Pass On The Savings (up to $200) page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Pass On The Savings (up to $200) page");

	}

	@Then("^user navigates to Programs Vuse plus Rewards and verify the health warning message$")
	public void user_navigates_to_Programs_Vuse_plus_Rewards_and_verify_the_health_warning_message() throws Throwable {

		gl.refresh();
		//Hover the mouse on Save link
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");


		//Click on Vuse+ Rewards link under the Save -> Offers section
		gl.clickbutton(Vype_CommonXpath.lnkVuseRewards, "Cliked on Vuse+ Rewards link");

		Thread.sleep(3000);

		//Verify Vuse+ Rewards page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinVuseRewards, "Vuse+ Rewards page is displayed");

		//Verify the "Health Warning" Message is displayed in Vuse+ Rewards page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Vuse+ Rewards page");

	}

	@Then("^user navigates to Help Shipping & Delivery link and verify the health warning message$")
	public void user_navigates_to_Help_Shipping_Delivery_link_and_verify_the_health_warning_message() throws Throwable {

		
		//Hover the mouse on Help link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link from the main menu navigation");

		//Click on Shipping & Delivery link under the Help section
		gl.clickbutton(Vype_CommonXpath.lnkShippingndDelivery, "Cliked on Shipping & Delivery link");

		Thread.sleep(3000);

		//Verify Shipping & Delivery page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page is displayed");

		//Verify the "Health Warning" Message is displayed in Shipping & Delivery page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Shipping & Delivery page");

	}

	@Then("^user navigates to Help Store Locator link and verify the health warning message$")
	public void user_navigates_to_Help_Store_Locator_link_and_verify_the_health_warning_message() throws Throwable {

		//Hover the mouse on Help  link
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link from the main menu navigation");

		//Click on Store Locator link under the Help section
		gl.clickbutton(Vype_CommonXpath.lnkStorelocator, "Cliked on Store Locator link");

		Thread.sleep(3000);

		//Verify Store Locator page is displayed
		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgeStoreLocator, "Store Locator page is displayed");

		//Verify the "Health Warning" Message is displayed in Store Locator page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Store Locator page ");

	}

	@Then("^user navigates to About Vuse News link and verify the health warning message$")
	public void user_navigates_to_About_Vuse_News_link_and_verify_the_health_warning_message() throws Throwable {

		//Hover the mouse on Help  link
		gl.HowerMouse(Vype_CommonXpath.txtAbout, "About link from the main menu navigation");


		//Click on Store Locator link under the Help section
		gl.clickbutton(Vype_CommonXpath.txtVuseNews, "Cliked on Vuse News link");

		Thread.sleep(10000);


		//gl.verifyTitle("Vuse Store Edmonton - Vape Shop");

		//Verify the "Health Warning" Message is displayed in Store Locator page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in About Vuse News page ");

	}

	@Then("^user navigates to About Online Exclusive Benefits and verify the health warning message$")
	public void user_navigates_to_About_Online_Exclusive_Benefits_and_verify_the_health_warning_message() throws Throwable {

		//Hover the mouse on Help  link
		gl.HowerMouse(Vype_CommonXpath.txtAbout, "About link from the main menu navigation");


		//Click on Store Locator link under the Help section
		gl.clickbutton(Vype_CommonXpath.txtOnlineExclusive, "Cliked on Online Exclusive Benefits link");

		Thread.sleep(3000);


		gl.VerifyObjectDisplayed(Vype_CommonXpath.weVuseCom,"Online Exclusive Benefits page");

		//Verify the "Health Warning" Message is displayed in Store Locator page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in About Online Exclusive Benefits page ");

	}

	@Then("^user navigates to About The Vuse Store link and verify the health warning message$")
	public void user_navigates_to_About_The_Vuse_Store_link_and_verify_the_health_warning_message() throws Throwable {


		//Hover the mouse on Help  link
		//gl.HowerMouse(Vype_CommonXpath.txtAbout, "About link from the main menu navigation");


		//Click on Store Locator link under the Help section
		gl.clickLink(Vype_CommonXpath.txtTheVuseStore, "Cliked on The Vuse Store link");

		Thread.sleep(10000);

		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtWelcome,"The Vuse Store page");

		//Verify the "Health Warning" Message is displayed in Store Locator page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in About The Vuse Store page ");

		//gl.closeAllBrowser();

	}

	@Then("^user scroll down and verify health warning message in Store Locator page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Store_Locator_page() throws Throwable {

		gl.ScrolltoBottomofthepage();
		//Click on "Store Locator"
		gl.clickLink(Vype_CommonXpath.lnkStoreLocator, "Store Locator text ");

		//Verify Store Locator Page is displayed.
		gl.VerifyObjectDisplayed(Vype_CommonXpath.pgeStoreLocator, "Store Locator ");

		//Verify the "Health Warning" Message is displayed in Store Locator page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Store Locator");

		gl.browserBack();
		Thread.sleep(3000);

	}

	@Then("^user scroll down and verify health warning message in Condition of sale page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Condition_of_sale_page() throws Throwable {

		//Click on  Condition of Sale text 
		gl.clickLink(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale link ");

		Thread.sleep(2000);
		//Verify Conditions on sale page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtConditionsofSale, "Condition of Sale ");

		//Verify the "Health Warning" Message is displayed in Contact Us page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Condition of Sale");

		gl.browserBack();
		Thread.sleep(3000);

	}

	@Then("^user scroll down and verify health warning message in Privacy Policy page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Privacy_Policy_page() throws Throwable {
		//Click on  Privacy Policy text 
		gl.clickLink(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");
		Thread.sleep(2000);

		//Verify privacy policy page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");

		//Verify the "Health Warning" Message is displayed in Contact Us page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Privacy Policy");

		gl.browserBack();
		Thread.sleep(3000);

	}

	@Then("^user scroll down and verify health warning message in Terms and conditions page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Terms_and_conditions_page() throws Throwable {
		//Click on  Terms and conditions text 
		gl.clickLink(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions link ");

		Thread.sleep(2000);
		//Verify Terms and conditions page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtTermsConditions, "Terms and conditions ");

		//Verify the "Health Warning" Message is displayed in Contact Us page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Terms and conditions");

		gl.browserBack();
		Thread.sleep(3000);

	}

	@Then("^user scroll down and verify health warning message in Cookie Policy page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Cookie_Policy_page() throws Throwable {
		//Click on  Cookie Policy text 
		gl.clickLink(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy link ");
		Thread.sleep(2000);
		//Verify Cookie Policy page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy ");

		//Verify the "Health Warning" Message is displayed in Contact Us page
		gl.VerifyObjectDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Cookie Policy ");


		gl.browserBack();
		Thread.sleep(3000);

	}

	@Then("^user scroll down and verify health warning message in Contact Us page$")
	public void user_scroll_down_and_verify_health_warning_message_in_Contact_Us_page() throws Throwable {

		//Click on  Contact Us text 
		gl.clickLink(Vype_CommonXpath.lnkContactUs, "Contact Us text ");
		Thread.sleep(2000);
		//Verify Contact us page is displayed
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtSearch, "Contact Us ");

		Thread.sleep(5000);

		//Verify the "Health Warning" Message is displayed in Contact Us page
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in Contact US");

		gl.browserBack();
		Thread.sleep(3000);


	}

	@Then("^user scroll down and verify health warning message in FAQ page$")
	public void user_scroll_down_and_verify_health_warning_message_in_FAQ_page() throws Throwable {

		//Click on  FAQs text 
		gl.clickLink(Vype_CommonXpath.lnkFaqs, "FAQs text ");

		//Verify FAQs Page is displayed.
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtSubmitRequest, "FAQ ");

		//Verify the "Health Warning" Message is displayed in FAQ Us page
		gl.VerifyPageDisplayed(Vype_CommonXpath.txtHealthwarning, "HW Message in FAQ");

		gl.browserBack();
		Thread.sleep(3000);


	}


}