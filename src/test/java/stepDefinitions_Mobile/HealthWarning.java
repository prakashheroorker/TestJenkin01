package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties_mobile.*;


public class HealthWarning {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify the health warning message$")
	public void verify_the_health_warning_message() throws Throwable {
		rai.VerifyElementsVisible(Vype_CommonXpath.txtHealthwarning, "HW Message in Shop ePod2 device");
	}
	
	@When("^user clicks on Personalize your ePod and clicks on Experience vuseXu$")
	public void user_clicks_on_Personalize_your_ePod_and_clicks_on_Experience_vuseXu() throws Throwable {
		//click on Personalize your ePod
		rai.clickUsingJs(Vype_CommonXpath.PersonalizeYourePod, "Personalize your ePod");
		// Click on Experience vuseXu
		rai.clickUsingJs(Vype_CommonXpath.lnkExperiencevuseXu,"Experience vuseXu from the Personalize your epod section");
	}

	@When("^user clicks on Personalize your ePod and clicks on Shop ePod Skins$")
	public void user_clicks_on_Personalize_your_ePod_and_clicks_on_Shop_ePod_Skins() throws Throwable {
		//Thread.sleep(5000);
		//click on Personalize your ePod
		rai.clickUsingJs(Vype_CommonXpath.PersonalizeYourePod, "Personalize your ePod");
		//Thread.sleep(3000);
		// Click on Shop ePod2Skins
		rai.clickUsingJs(Vype_CommonXpath.lnkePodSkins,"Shop ePod2Skins");
	}

	@When("^user clicks on Personalize your ePod and clicks on Engrave Your ePod$")
	public void user_clicks_on_Personalize_your_ePod_and_clicks_on_Engrave_Your_ePod() throws Throwable {
		//Thread.sleep(3000);
		//click on Personalize your ePod
		rai.clickUsingJs(Vype_CommonXpath.PersonalizeYourePod, "Personalize your ePod");
		//Thread.sleep(3000);
		// Click on Shop ePod2Skins
		rai.clickUsingJs(Vype_CommonXpath.EngraveYourePod,"Engrave ur epod");
	}

	@When("^User clicks on hamberger menu and clicks on Save$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Save() throws Throwable {
		Thread.sleep(2000);
		// Clicking on Menu and navigate to Save
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		Thread.sleep(3000);
		// Click on Save link
		//rai.ClickUsingOCR("Save");
		
		rai.clickLink(Vype_CommonXpath.lnkSave, "Saves link from the main menu navigation");
	}

	@When("^user clicks on Starter Bundle$")
	public void user_clicks_on_Starter_Bundle() throws Throwable {
		Thread.sleep(2000);
		rai.clickUsingJs(Vype_CommonXpath.lnkStarterBundle, "Cliked on Starter Bundle link");
		rai.fnNavigateBack();
	}

	@When("^user clicks on \"([^\"]*)\" for \\$\"([^\"]*)\" ePod Pods$")
	public void user_clicks_on_for_$_ePod_Pods(String a, String b) throws Throwable {
		Thread.sleep(2000);
		rai.clickUsingJs(Vype_CommonXpath.lnkForPods(a,b), "Cliked on" +a+" for $"+b+" ePod Pods link");
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_CommonXpath.packPage, a +" for $"+b+ " ePod Pods page is displayed");
	}

	@When("^user clicks on Subscribe & Save$")
	public void user_clicks_on_Subscribe_Save() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.lnkSubscribeSave, "Cliked on Subscribe & Save (up to 33%) link");
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_CommonXpath.pgeSubscribeAndSave, "Subscribe & Save (up to 33%) page is displayed");
	}

	@When("^user clicks on Pass On The Savings$")
	public void user_clicks_on_Pass_On_The_Savings() throws Throwable {
		rai.clickbutton(Vype_CommonXpath.lnkPassOnTheSavings, "Cliked on Pass On The Savings (up to $200) link");
		Thread.sleep(3000);
		//Verify Pass On The Savings (up to $200) page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPassOntheSavings, "Pass On The Savings (up to $200) page is displayed");
	}

	@When("^user clicks on Vuse\\+ Rewards$")
	public void user_clicks_on_Vuse_Rewards() throws Throwable {
		//Click on Vuse+ Rewards link under the Save -> Offers section
		rai.clickbutton(Vype_CommonXpath.lnkVuseRewards, "Cliked on Vuse+ Rewards link");
		Thread.sleep(3000);
		//Verify Vuse+ Rewards page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtinVuseRewards, "Vuse+ Rewards page is displayed");
	}

	@When("^User clicks on hamberger menu and clicks on About$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_About() throws Throwable {
		Thread.sleep(2000);
		// Clicking on Menu and navigate to Shop
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		Thread.sleep(1000);
		rai.ClickUsingOCR("About");
	}

	@When("^user clicks on Know your Vape$")
	public void user_clicks_on_Know_your_Vape() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.KnowYourVape, "Know Your Vape");
		Thread.sleep(2000);
	}

	@When("^user clicks on Vuse News$")
	public void user_clicks_on_Vuse_News() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.txtVuseNews, "Cliked on Vuse News link");
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_CommonXpath.VuseStore,"Vuse Store Edmonton - Vape Shop");
	}

	@When("^user clicks on Online Exclusive Benefits$")
	public void user_clicks_on_Online_Exclusive_Benefits() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.OnlineBenefits, "Cliked on Vuse News link");
		Thread.sleep(3000);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtOnlineBenefits,"Vuse Store Edmonton - Vape Shop");
	}

	@When("^User clicks on hamberger menu and clicks on Help$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_Help() throws Throwable {
		// Clicking on Menu and navigate to Help
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
		rai.ClickUsingOCR("Help");
	}

	@When("^user clicks on Shipping & Delivery$")
	public void user_clicks_on_Shipping_Delivery() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.lnkShippingndDelivery, "Cliked on Shipping & Delivery link");
		Thread.sleep(3000);
		//Verify Shipping & Delivery page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtinShippingndDelivery, "Shipping & Delivery page is displayed");
		rai.ClickUsingOCR("Allow");
	}

	//For post login
	@When("^user clicks on Store Locator$")
	public void user_clicks_on_Store_Locator() throws Throwable {
		//Click on Store Locator link under the Help section
		rai.clickUsingJs(Vype_CommonXpath.lnkStorelocator, "Cliked on Store Locator link");
		Thread.sleep(3000);
		
		//rai.ClickUsingOCR("Allow only while using the app");
		//Verify Store Locator page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgeStoreLocator1, "Store Locator page is displayed");
		
		rai.ClickUsingOCR("Allow only while using the app");
		
	}
	
	//For pre login
	@When("^user clicks on store Locator$")
	public void user_clicks_on_store_Locator() throws Throwable {
		//Click on Store Locator link under the Help section
		rai.clickUsingJs(Vype_CommonXpath.lnkStorelocator, "Cliked on Store Locator link");
		Thread.sleep(3000);
		//Verify Store Locator page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgeStoreLocator, "Store Locator page is displayed");
	}
	
	@When("^user scroll down and click on Store Locator$")
	public void user_scroll_down_and_click_on_Store_Locator() throws Throwable {
		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		Thread.sleep(3000);
		//Click on "Store Locator"
		rai.clickUsingJs(Vype_CommonXpath.lnkStoreLocator, "Store Locator text ");
		Thread.sleep(2000);
		rai.ClickUsingOCR("Allow");
		rai.ClickUsingOCR("Allow only while using the app");
		//Verify Store Locator Page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.pgeStoreLocator, "Store Locator ");

	}
	
	@When("^Go to Home page and scroll down$")
	public void Go_to_Home_page_and_scroll_down() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.clickVicon, "Home page");
		Thread.sleep(2000);
		rai.ScrollByxpath(Vype_CommonXpath.lnkFaqs);
		Thread.sleep(2000);

	}

	@When("^click on Condition of sale$")
	public void click_on_Condition_of_sale() throws Throwable {
		//Click on  Condition of Sale text 
		rai.clickUsingJs(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale link ");
		Thread.sleep(2000);
		//Verify Conditions on sale page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtConditionsofSale, "Condition of Sale ");

	}

	@When("^click on Privacy Policy page$")
	public void click_on_Privacy_Policy_page() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");
		Thread.sleep(2000);
		//Verify privacy policy page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");

	}

	@When("^click on Terms and conditions$")
	public void click_on_Terms_and_conditions() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions link ");
		Thread.sleep(2000);
		//Verify Terms and conditions page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtTermsConditions, "Terms and conditions ");

	}

	@When("^click on Cookie Policy page$")
	public void user_scroll_down_and_click_on_Cookie_Policy_page() throws Throwable {
		//Click on  Cookie Policy text 
		rai.clickUsingJs(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy link ");
		Thread.sleep(2000);
		//Verify Cookie Policy page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy ");

	}

	@When("^click on Contact Us page$")
	public void user_scroll_down_and_click_on_Contact_Us_page() throws Throwable {
		//Click on  Contact Us text 
		rai.clickUsingJs(Vype_CommonXpath.lnkContactUs, "Contact Us text ");
		Thread.sleep(2000);
		//Verify Contact us page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtSearch, "Contact Us ");

	}

	@When("^click on FAQ page$")
	public void user_scroll_down_and_click_on_FAQ_page() throws Throwable {
		//Click on  FAQs text 
		rai.clickUsingJs(Vype_CommonXpath.lnkFaqs, "FAQs text ");
		//Verify FAQs Page is displayed.
		rai.VerifyElementsVisible(Vype_CommonXpath.txtSubmitRequest, "FAQ ");

	}
	
	@When("^User clicks on hamberger menu$")
    public void user_clicks_on_hamberger_menu() throws Throwable {
        Thread.sleep(2000);
        // Clicking on Menu and navigate to Save
        rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
        Thread.sleep(3000);

    }
}
