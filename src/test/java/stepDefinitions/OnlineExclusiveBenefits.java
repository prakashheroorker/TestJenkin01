package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.*;



public class OnlineExclusiveBenefits {


	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@When("^User howers on About and click on online exclusive benefits and verifies page$")
	public void user_howers_on_About_and_click_on_online_exclusive_benefits_and_verifies_page() throws Throwable {

		Thread.sleep(4000);
		// Hover the mouse on Products link
		gl.HowerMouse(Vype_CommonXpath.lnkAbout, "Shop link from the main menu navigation");

		// Click on device link under the ePod section
		gl.clickLink(Vype_CommonXpath.txtOnlineExclusive, "Online Exclusive Benefits section");

		// Verify that ePod starter kit page is displayed.
		gl.VerifyPageDisplayed(Vype_CommonXpath.weVuseCom, "VUSE.COM");


	}

	

	@And("^Scroll to verify vape product tiles$")
	public void scroll_to_back_button_and_verify_back_button() throws Throwable {
		
		gl.fnScrollToView(Vype_CommonXpath.lnkEpod2);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "express shipping");
	
		gl.clickLink(Vype_CommonXpath.lnkEpod2, "Elements epod2 collections ");
		//Verify epod2 page is displayed
		
		gl.verifyTitle("ePod 2 | Vuse CA");


		

		gl.navigateBack();
		gl.fnScrollToView(Vype_CommonXpath.lnkEpodpod);
		
		gl.clickLink(Vype_CommonXpath.lnkEpodpod, "Elements epod2 collections ");
		//Verify epod pods page is displayed
		gl.verifyTitle("Vuse Pods for the ePod Vape | Vuse Canada");
		
		gl.navigateBack();
		gl.fnScrollToView(Vype_CommonXpath.lnkvusebyu);
		
		gl.clickLink(Vype_CommonXpath.lnkvusebyu, "Elements epod2 collections ");
		//Verify vuse+ rewards page is displayed
		gl.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada");
		
		gl.navigateBack();
		

	}
	
	
	
	@And("^scroll to vape experience and verify respective pages$")
	public void scroll_to_vape_experience_and_verify_respective_pages() throws Throwable {
		
		gl.fnScrollToView(Vype_CommonXpath.lnkvuserewards);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkvapeexperience, "express shipping");
		
		gl.clickLink(Vype_CommonXpath.lnkvuserewards, "Elements epod2 collections ");
		//Verify vuse+ rewards page is displayed
		gl.verifyTitle("Vuse Plus Rewards Program Subscribe Online | Vuse Canada");
		

		gl.navigateBack();
		gl.fnScrollToView(Vype_CommonXpath.lnksubscribe);
		
		gl.clickLink(Vype_CommonXpath.lnksubscribe, "Elements epod2 collections ");
		//Verify subscribe & save page is displayed
		gl.verifyTitle("Vape - shop online - Vuse Canada");
		
		gl.navigateBack();
		gl.fnScrollToView(Vype_CommonXpath.lnkmix);
		
		gl.clickLink(Vype_CommonXpath.lnkmix, "Elements epod2 collections ");
		//Verify mix & match page is displayed
		gl.verifyTitle("Vuse Pods for the ePod Vape | Vuse Canada");
		
		gl.navigateBack();
		gl.fnScrollToView(Vype_CommonXpath.lnkpasson);
		
		gl.clickLink(Vype_CommonXpath.lnkpasson, "Elements epod2 collections ");
		//Verify pass on savings page is displayed
		gl.verifyTitle("Pass on the Savings | Start Saving with Vuse");
		
		gl.navigateBack();
		

	}
	@And("^verify shipping options$")
	public void verify_shipping_options() throws Throwable {
		
		gl.fnScrollToView(Vype_CommonXpath.lnksameday);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkshipping, "express shipping");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkexpress, "express shipping");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkclick, "click & collect shipping");
			}
	
	//Added by sireesha
	
	@When("^Scroll to vape products we want section$")
	public void scroll_to_vape_products_we_want_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.ScrollPageDown();
          gl.fnScrollToView(Vype_CommonXpath.lnkvapeproducts);
		
		// Verify text of vape prdoucts
		gl.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "Vape products we want them");
	}

	@Then("^Verify tiles are displayed$")
	public void verify_tiles_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		List<WebElement> list3 = gl.findElementsList(Vype_CommonXpath.tilesvape);
		System.out.println("Total no of tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			String tiles=gl.getText(Vype_CommonXpath.tilesvape(i));
			System.out.println((i+1)+":"+tiles);
			gl.VerifyElementVisible(Vype_CommonXpath.tilesvape(i), tiles);
		}
	}

	@Then("^Click on All New Epod(\\d+) Tile$")
	public void click_on_All_New_Epod_Tile(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 gl.clickUsingJs(Vype_CommonXpath.tileepod, "tile new epod 2");  
		 
		 Thread.sleep(2000);
	}

	@Then("^Verify All ePod Device Page is displayed$")
	public void verify_All_ePod_Device_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.verifyTitle("Epod 2 | Vuse Canada");
		Thread.sleep(3000);
	}

	@Then("^User click on browse back and verify the Exclusive benefits page$")
	public void user_click_on_browse_back_and_verify_the_Exclusive_benefits_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		 gl.browserBack();
		   
		   gl.VerifyElementVisible(Vype_CommonXpath.lnkvapeproducts, "Vape products we want them");
	}

	@When("^User scroll down and clicks on Vape pods tile$")
	public void user_scroll_down_and_clicks_on_Vape_pods_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_CommonXpath.tilepod);

		    gl.clickUsingJs(Vype_CommonXpath.tilepod, "tile vape pods");  
		    
		    Thread.sleep(2000);
	}

	@Then("^Verify ePod Vape Pods Page is displayed$")
	public void verify_ePod_Vape_Pods_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		gl.verifyTitle("Vuse Pods for the ePod Vape | Vuse Canada");
		Thread.sleep(3000);
	}

	@When("^User  scroll down and clicks on Vuse XU tile$")
	public void user_scroll_down_and_clicks_on_Vuse_XU_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
	    
        gl.fnScrollToView(Vype_CommonXpath.tilevusexu);
		 
		 gl.clickUsingJs(Vype_CommonXpath.tilevusexu, "tile vuse Xu");
		 
		 Thread.sleep(2000);
	}

	@Then("^Verify the Vuse Xu Page is displayed$")
	public void verify_the_Vuse_Xu_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 gl.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada"); 
		 Thread.sleep(3000);
	}

	@When("^User scroll down  to vuseplus rewards tile and click on Letsgo button$")
	public void user_scroll_down_to_vuseplus_rewards_tile_and_click_on_Letsgo_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		gl.ScrollPageDown();
         gl.fnScrollToView(Vype_CommonXpath.btnletgo);
         
		 
		 gl.clickUsingJs(Vype_CommonXpath.btnletgo, "button let go");
		 Thread.sleep(2000);
	}

	@Then("^Verify the Vuse Rewards page is displayed$")
	public void verify_the_Vuse_Rewards_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.verifyTitle("Vuse Plus Rewards Program Subscribe Online | Vuse Canada");
		
		Thread.sleep(3000);
	}

	@When("^User  scroll down to Subscribe and save tile and click on Subscribe now button$")
	public void user_scroll_down_to_Subscribe_and_save_tile_and_click_on_Subscribe_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_CommonXpath.btnsubscribe);
		 
		 gl.clickUsingJs(Vype_CommonXpath.btnsubscribe, "subscribe and save"); 
		 Thread.sleep(2000);
	}

	@Then("^Verify Subscribe and Save page is displayed$")
	public void verify_Subscribe_and_Save_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.verifyTitle("Subscribe | Vuse Canada");
		
		Thread.sleep(3000);
	}

	@When("^User scroll down to Mix and Match bundle and  click on shop now button$")
	public void user_scroll_down_to_Mix_and_Match_bundle_and_click_on_shop_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_CommonXpath.btnshopnow);
		 
		 gl.clickUsingJs(Vype_CommonXpath.btnshopnow, "shop now");
		 Thread.sleep(2000);
	}

	@When("^User scroll down to pass on the savings tile and clicks on Get started button$")
	public void user_scroll_down_to_pass_on_the_savings_tile_and_clicks_on_Get_started_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_CommonXpath.btngetstarted);
		 
		 gl.clickUsingJs(Vype_CommonXpath.btngetstarted, "get started");
		 
		 Thread.sleep(2000);
	}

	@Then("^Verify Vuse pass on Savings  page is displayed$")
	public void verify_Vuse_pass_on_Savings_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.verifyTitle("Pass On The Savings | Vuse Canada");
		
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}