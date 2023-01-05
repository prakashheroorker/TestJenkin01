package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_rewardsUiAndFunctionality;

public class OnlineExclusiveBenefits {


	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	

	@And("^user clicks on online exclusive benefits and verifies page$")
	public void user_clicks_on_online_exclusive_benefits_and_verifies_page() throws Throwable {
	
		rai.ClickUsingOCR("Online Exclusive Benefits");
		
		
		rai.VerifyElementVisible(Vype_CommonXpath.weVuseCom, "VUSE.COM");


	}

	

	@And("^scroll to verify vape product tiles$")
	public void scroll_to_back_button_and_verify_back_button() throws Throwable {
		
		//rai.ScrollByxpath(Vype_CommonXpath.lnkEpod2);
		rai.SwipeDownSmallerUnits(3);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "express shipping");
	
		rai.clickLink(Vype_CommonXpath.lnkEpod2, "Elements epod2 collections ");
		//Verify epod2 page is displayed
				rai.verifyTitle("epod2 | Vuse Canada");
		

		rai.fnNavigateBack();
		//rai.ScrollByxpath(Vype_CommonXpath.lnkEpodpod);
		rai.SwipeDownSmallerUnits(1);
		rai.clickLink(Vype_CommonXpath.lnkEpodpod, "Elements epod2 collections ");
		//Verify epod pods page is displayed
				rai.verifyTitle("epod pods | Vuse Canada");
		
		rai.fnNavigateBack();
		rai.ScrollByxpath(Vype_CommonXpath.lnkvusebyu);
		
		rai.clickLink(Vype_CommonXpath.lnkvusebyu, "Elements epod2 collections ");
		//Verify vuse+ rewards page is displayed
				rai.verifyTitle("vuse x U | Vuse Canada");
		
		rai.fnNavigateBack();
		

	}
	@And("^scroll to vape experience and verify respective pages$")
	public void scroll_to_vape_experience_and_verify_respective_pages() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkvuserewards);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkvapeexperience, "express shipping");
	
		rai.clickLink(Vype_CommonXpath.lnkvuserewards, "Elements epod2 collections ");
		//Verify vuse+ rewards page is displayed
				rai.verifyTitle("vuse+ rewards | Vuse Canada");
		

		rai.fnNavigateBack();
		rai.ScrollByxpath(Vype_CommonXpath.lnksubscribe);
		
		rai.clickLink(Vype_CommonXpath.lnksubscribe, "Elements epod2 collections ");
		//Verify subscribe & save page is displayed
				rai.verifyTitle("subscribe & save | Vuse Canada");
		
		rai.fnNavigateBack();
		rai.ScrollByxpath(Vype_CommonXpath.lnkmix);
		
		rai.clickLink(Vype_CommonXpath.lnkmix, "Elements epod2 collections ");
		//Verify mix & match page is displayed
				rai.verifyTitle("mix & match| Vuse Canada");
		
		rai.fnNavigateBack();
		rai.ScrollByxpath(Vype_CommonXpath.lnkpasson);
		
		rai.clickLink(Vype_CommonXpath.lnkpasson, "Elements epod2 collections ");
		//Verify pass on savings page is displayed
				rai.verifyTitle("pass on savings| Vuse Canada");
		
		rai.fnNavigateBack();
		

	}
	@And("^verify shipping options$")
	public void verify_shipping_options() throws Throwable {
		
		rai.ScrollByxpath(Vype_CommonXpath.lnksameday);
		rai.VerifyElementVisible(Vype_CommonXpath.lnkshipping, "express shipping");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkexpress, "express shipping");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkclick, "click & collect shipping");
			}
	
	
	
	//Added by sireesha
	
	
	@When("^User clicks on online exclusive benefits and verifies exclusive benefits page$")
	public void user_clicks_on_online_exclusive_benefits_and_verifies_exclusive_benefits_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
        rai.ClickUsingOCR("Online Exclusive Benefits");
		
		
		rai.VerifyElementVisible(Vype_CommonXpath.weVuseCom, "VUSE.COM"); 
	}

	@When("^Swipe to vape products we want section$")
	public void swipe_to_vape_products_we_want_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		rai.SwipeDownSmallerUnits(6);
		
		// Verify text of vape prdoucts
		rai.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "Vape products we want them");
		
	}

	@Then("^Verify Exclusive page and with some of the tiles is displayed$")
	public void verify_Exclusive_page_and_with_some_of_the_tiles_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//no of tiles under the vape products 
	   
		List<WebElement> list3 = rai.findElementsList(Vype_CommonXpath.tilesvape);
		System.out.println("Total no of tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			String tiles=rai.getText(Vype_CommonXpath.tilesvape(i));
			rai.SwipeDownSmallerUnits(1);
			System.out.println((i+1)+":"+tiles);
			rai.VerifyElementVisible(Vype_CommonXpath.tilesvape(i), tiles);
		}
		
	}

	@Then("^Click on All New Epod(\\d+) tile$")
	public void click_on_All_New_Epod_tile(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.SwipeUpSmallerUnits(4);
		
	  rai.clickUsingJs(Vype_CommonXpath.tileepod, "tile new epod 2");  
	}

	@Then("^Verify All ePod Device page is displayed$")
	public void verify_All_ePod_Device_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  rai.verifyTitle("Epod 2 | Vuse Canada");
	}

	@Then("^User click on browse back and verify the exclusive benefits page$")
	public void user_click_on_browse_back_and_verify_the_exclusive_benefits_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rai.fnBrowserBack();
	   rai.SwipeDownSmallerUnits(2);
	   rai.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "Vape products we want them");
	   
	}

	@When("^User Swipe down and clicks on Vape pods tile$")
	public void user_Swipe_down_and_clicks_on_Vape_pods_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.SwipeDownSmallerUnits(6);

	    rai.clickUsingJs(Vype_CommonXpath.tilepod, "tile vape pods");  
	}

	@Then("^Verify ePod Vape Pods page is displayed$")
	public void verify_ePod_Vape_Pods_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.verifyTitle("Vuse Pods for the ePod Vape | Vuse Canada");
	}

	@When("^User  Swipe down and clicks on Vuse XU tile$")
	public void user_Swipe_down_and_clicks_on_Vuse_XU_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.SwipeDownSmallerUnits(10);
		 
		 rai.clickUsingJs(Vype_CommonXpath.tilevusexu, "tile vuse Xu"); 
		 
	}

	@Then("^Verify the Vuse Xu page is displayed$")
	public void verify_the_Vuse_Xu_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rai.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada"); 
	}

	@When("^User Swipe down  to vuseplus rewards tile and click on Letsgo button$")
	public void user_Swipe_down_to_vuseplus_rewards_tile_and_click_on_Letsgo_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
         rai.SwipeDownSmallerUnits(12);
		 
		 rai.clickUsingJs(Vype_CommonXpath.btnletgo, "button let go"); 
	}

	@Then("^Verify the Vuse rewards page is displayed$")
	public void verify_the_Vuse_rewards_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	rai.verifyTitle("Vuse Plus Rewards Program Subscribe Online | Vuse Canada");
	}

	@When("^User  Swipe down to Subscribe and save tile and click on Subscribe now button$")
	public void user_Swipe_down_to_Subscribe_and_save_tile_and_click_on_Subscribe_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(14);
		 
		 rai.clickUsingJs(Vype_CommonXpath.btnsubscribe, "subscribe and save"); 
	}

	@Then("^Verify Subscribe and save page is displayed$")
	public void verify_Subscribe_and_save_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyTitle("Subscribe | Vuse Canada");
	    
	}

	@When("^User Swipe down to Mix and Match bundle and  click on shop now button$")
	public void user_Swipe_down_to_Mix_and_Match_bundle_and_click_on_shop_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(16);
		 
		 rai.clickUsingJs(Vype_CommonXpath.btnshopnow, "shop now");  
	}

	@When("^User Swipe down to pass on the savings tile and clicks on Get started button$")
	public void user_Swipe_down_to_pass_on_the_savings_tile_and_clicks_on_Get_started_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(18);
		 
		 rai.clickUsingJs(Vype_CommonXpath.btngetstarted, "get started");
	}

	@Then("^Verify Vuse pass on savings  page is displayed$")
	public void verify_Vuse_pass_on_savings_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.verifyTitle("Pass On The Savings | Vuse Canada");
	}

	
	}