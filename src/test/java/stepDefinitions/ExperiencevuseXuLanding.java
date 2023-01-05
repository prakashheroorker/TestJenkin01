package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_AllePodDevice;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_ExperiencevuseXuLanding;

public class ExperiencevuseXuLanding {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@When("^Hower on Shop and click on Experience VUSE x U link under Personalize your ePod$")
	public void hower_on_Shop_and_click_on_Experience_VUSE_x_U_link_under_Personalize_your_ePod() throws Throwable {
		
		//Hower on shop
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");
		
		//Updated by Shaik - 19/07/22 
		//Click on Experience VUSE x U under Personalize your ePod
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.lnkExperienceVuseXu, "Experience VUSE x U");
		Thread.sleep(3000);
		
	}

	@Then("^Verify text MAKE VUSE TRULY YOURS$")
	public void verify_text_MAKE_VUSE_TRULY_YOURS() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS);
	    gl.ScrollPageUp();
	    Thread.sleep(1000);
	    
	    //Verify MAKE VUSE TRULY YOURS text
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS,"MAKE VUSE TRULY YOURS");

	}

	@Then("^Verify the ENGRAVING tile under ENDLESS WAYS TO CUSTOMIZE text$")
	public void verify_the_ENGRAVING_tile_under_ENDLESS_WAYS_TO_CUSTOMIZE_text() throws Throwable {

		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEndlessWaysToCustomize);
		gl.ScrollPageUp();
	    Thread.sleep(1000);
	    
		//added by Shaik - 19/07/22 
	    //Verify ENDLESS WAYS TO CUSTOMIZE text 
		gl.VerifyPageDisplayed(Vype_ExperiencevuseXuLanding.txtEndlessWaysToCustomize );
		
	    //gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.weDesignedWithPrecision, "Designed with precision using our laser technology");
		
		//added by Shaik - 19/07/22 
		//Verify ENGRAVING text
		gl.VerifyPageDisplayed(Vype_ExperiencevuseXuLanding.txtEngraving);
		 
	}

	@When("^Click on Discover more button under ENGRAVING tile$")
	public void click_on_Discover_more_button_under_ENGRAVING_tile() throws Throwable {
	
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEndlessWaysToCustomize);
		
		//Click on Discover More text
		gl.clickbutton(Vype_ExperiencevuseXuLanding.btnDiscoverMore, "Discover More");
	    Thread.sleep(20000);
	}

	@Then("^Verify Engrave Your Devices page is displayed$")
	public void verify_Engrave_Your_Devices_page_is_displayed() throws Throwable {
		
		//Verify text Pick your device colour & design style is displayed
		gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.txtPickDeviceColour, "Pick your device colour & design style");
	}

	@When("^Click on Discover more button under YOUR DEVICE ELEVATED tile$")
	public void click_on_Discover_more_button_under_YOUR_DEVICE_ELEVATED_tile() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEndlessWaysToCustomize);
		
		//added by Shaik - 19/07/22 
		//Verify your device elevated text
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.txturdevice, "YOUR DEVICE ELEVATED");
	    
		//Click on Discover More text
		gl.clickbutton(Vype_ExperiencevuseXuLanding.btnDiscoverMore1, "Discover More");
	    Thread.sleep(5000);
	}

	@Then("^Verify the skins page is displayed$")
	public void verify_the_skins_page_is_displayed() throws Throwable {
		
		// verify text Core Collection is displayed
		Thread.sleep(2000);
		gl.VerifyElementVisible(Vype_CommonXpath.txtCoreCollection, "Core Collection");
		Thread.sleep(2000);
	}

	@Then("^Verify text put a ring on it and verify buy now button$")
	public void verify_text_put_a_ring_on_it_and_verify_buy_now_button() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEndlessWaysToCustomize);

		//Verify Put a ring on it text
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.wePutA, "Put a ring on it");
	    
		//Verify Style your ePod device with our new silver ring
	    //gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weStyleYour, "Style your device with our new silver ring collection");
		
		//Verify Buy Now text
		gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.btnBuyNow, "Buy Now");

	}

	@When("^Click on buy now button$")
	public void click_on_buy_now_button() throws Throwable {
		
		//Click on Buy Now text
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnBuyNow, "Buy Now");
		Thread.sleep(3000);			
	
	}

	@Then("^Verify ePod Rings page is displayed$")
	public void verify_ePod_Rings_page_is_displayed() throws Throwable {
		
		//added by Shaik - 19/07/22
		//Verify text ePod Rings is displayed 
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weePodRings, "ePod 2 Rings");
	   
	}

	@When("^Click on Start now button under AUDIO SIGNATURE tile$")
	public void click_on_Start_now_button_under_AUDIO_SIGNATURE_tile() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEngraving);
		
		//Verify Audio Signature text
		gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.txtAudioSignature, "Audio Signature");

		//Verify text Start Now
		gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.btnStsrtNow, "Start Now");
		
		//added by Shaik - 19/07/22 
		//Click on Start Now text
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnStsrtNow, "Start Now");
		Thread.sleep(15000);
	
	}

	@Then("^Verify AUDIO SIGNATURE page is displayed$")
	public void verify_AUDIO_SIGNATURE_page_is_displayed() throws Throwable {
			
		//Verify text Audio Signature page is displayed
		
		//gng to the page and click on skip video
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnskip, "Video skip");
		
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weAudioSignature1, "Audio Signature1");
		
	}

	@Then("^Verify text IN STORE$")
	public void verify_text_IN_STORE() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.btnStsrtNow);
		
		//Verify IN STORE text
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weInStore);
		
		//gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weTakeYour, "Take Your");
	    
	}
	@Then("^Verify WHERE TO FIND US text and verify store tile$")
	public void verify_WHERE_TO_FIND_US_text_and_verify_store_tile() throws Throwable {
		
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.weTakeYour);
		
		//Verify WHERE TO FIND US text
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weWhereToFind,"WHERE TO FIND US");
		
		//added by Shaik - 19/07/22 
		//Verify Store tile
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.westore,"Store tile");

	}
//Added by sireesha
	@Then("^Verify Experience VUSE x U page and with relevant content is displayed$")
	public void verify_Experience_VUSE_x_U_page_and_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    gl.VerifyPageDisplayedUsingPagetitle("Vuse by You: Customize Your Vape | Vuse Canada");
	    
	  //Verify MAKE VUSE TRULY YOURS text
	    
	          gl.ScrollPageDown();
	    
	        gl.fnScrollToView(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS);
	        Thread.sleep(1000);
	        
	  		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS,"MAKE VUSE TRULY YOURS");
	  		
	  		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.weTakeYour);
			
			//Verify WHERE TO FIND US text
			gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weWhereToFind,"WHERE TO FIND US");
		
			// verify the buttons under endless way to coustomize
			
			gl.ScrollPageUp();
			gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtbtns);
			Thread.sleep(1000);
			
			List<WebElement> list3 = gl.findElementsList(Vype_ExperiencevuseXuLanding.txtbtns);
			System.out.println("Total buttons: "+list3.size());
			for(int i=0; i<list3.size();i++)
			{
				gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtbtns,"list of buttons");
				gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtbtns(i));
				String buttons=gl.getText(Vype_ExperiencevuseXuLanding.txtbtns(i));
				System.out.println((i+1)+":"+buttons);
				
				
				
			}
	}

	@When("^User scroll down and clicks on ePodtwo under ENDLESS WAYS TO CUSTOMIZE$")
	public void user_scroll_down_and_clicks_on_ePodtwo_under_ENDLESS_WAYS_TO_CUSTOMIZE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtendless);
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.epod, "button epod2");
	}

	@Then("^Verify the epodtwo tile highlighted and verify the content$")
	public void verify_the_epodtwo_tile_highlighted_and_verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.epod, "button epod2");
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtepod, "text eopd");
	}

	@Then("^Click on ePod twoplus under ENDLESS WAYS TO CUSTOMIZE$")
	public void click_on_ePod_twoplus_under_ENDLESS_WAYS_TO_CUSTOMIZE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.epod2plus, "button epod2+");
		
	}

	@Then("^Verify the ePod twoplus tile highlighted and verify the content$")
	public void verify_the_ePod_twoplus_tile_highlighted_and_verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.epod2plus, "button epod2+");
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtepod2plus, "text epod2");
	}

	@When("^User scrolls down and click on Discover more button under ENGRAVING tile$")
	public void user_scrolls_down_and_click_on_Discover_more_button_under_ENGRAVING_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtEngraving);
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtEngraving, "engraving ");
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnDiscoverMore, "Discover More");
		
	}

	@Then("^User click on browse back and verify the Experience VUSE x U page is displayed$")
	public void user_click_on_browse_back_and_verify_the_Experience_VUSE_x_U_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.browserBack();
		Thread.sleep(3000);
		gl.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada");
	}

	@When("^User scrolls down and click on Discover more button under YOUR DEVICE ELEVATED tile$")
	public void user_scrolls_down_and_click_on_Discover_more_button_under_YOUR_DEVICE_ELEVATED_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txturdevice);
        gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.txturdevice, "YOUR DEVICE ELEVATED");
	    
		//Click on Discover More text
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnDiscoverMore1, "Discover More");
	    Thread.sleep(2000);
	}

	@When("^User scrolls down and click on BuyNow button under PUT A RING ON IT$")
	public void user_scrolls_down_and_click_on_BuyNow_button_under_PUT_A_RING_ON_IT() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.wePutA);
		
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.wePutA, "Put a ring on it");
		
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnBuyNow, "Buy Now");
		
	}

	@When("^User scrolls down and click on Start now button under AUDIO SIGNATURE tile$")
	public void user_scrolls_down_and_click_on_Start_now_button_under_AUDIO_SIGNATURE_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Verify Audio Signature text
		Thread.sleep(2000);
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtAudioSignature);
				gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.txtAudioSignature, "Audio Signature");
				
				gl.clickUsingJs(Vype_ExperiencevuseXuLanding.btnStsrtNow, "Start Now");
				Thread.sleep(2000);

	}

	@When("^User scrolls down and click on Toronto under Vuse X U WHERE TO FIND US$")
	public void user_scrolls_down_and_click_on_Toronto_under_Vuse_X_U_WHERE_TO_FIND_US() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Thread.sleep(2000);
		gl.ScrollPageDown();
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.txtwhereto);
		Thread.sleep(1000);
		gl.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtwhereto, "Where to find us");
		gl.clickUsingJs(Vype_ExperiencevuseXuLanding.lnktoronto, "Toronto");
		
	   
	}

	@Then("^Verify selected province address and visit store page link is displayed$")
	public void verify_selected_province_address_and_visit_store_page_link_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String address = gl.getText(Vype_ExperiencevuseXuLanding.lstaddress);
		gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.lstaddress, address);
		System.out.println(address);
		gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.lnkstorepage, "Store link");
	}

	@When("^User click on visit store page link$")
	public void user_click_on_visit_store_page_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(15000);
		gl.fnScrollToView(Vype_ExperiencevuseXuLanding.lnkstorepage);
		gl.clickLink(Vype_ExperiencevuseXuLanding.lnkstorepage, "Store link");
	}

	@Then("^Verify related store page is opened in the new tab$")
	public void verify_related_store_page_is_opened_in_the_new_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		gl.fnSwitchToSucceedingTab();
	    Thread.sleep(3000);
	    
	  
		
		//gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.pgstore, "Store page");
		//Thread.sleep(15000);
	}

	@Then("^User close the new and verify the Experience VUSE x U page is displayed$")
	public void user_close_the_new_and_verify_the_Experience_VUSE_x_U_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    gl.fnSwitchToPrecedingTab();
	    Thread.sleep(2000);
	    
	    gl.VerifyPageDisplayedUsingPagetitle("Vuse by You: Customize Your Vape | Vuse Canada");
	}	
}
