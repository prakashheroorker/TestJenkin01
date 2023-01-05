package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties_mobile.*;


public class ExperiencevuseXuLanding {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
	
	
	@Then("User clicks on hamberger menu and click on Experience vuseXu link under Personalize your ePod$")
    public void User_clicks_on_hamberger_menu_and_click_on_Experience_vuseXu_link_under_Personalize_your_ePod() throws Throwable {

		
		rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");

		// Click on Shop link
		//rai.clickUsingJs(Vype_CommonXpath.lnkShop, "Shop ");

		rai.ClickUsingOCR("Shop");
	}
	@Then("click on Personalize your ePod and click on Experience vuseXu$") 
		public void	 click_on_Personalize_your_ePod_and_click_on_Experience_vuseXu() throws Throwable {
	
	rai.clickUsingJs(Vype_ExperiencevuseXuLanding.wePersonalizeYourEPod, "PersonalizeYourEPod");
	//rai.ClickUsingOCR("PersonalizeYourEPod");
	
	rai.clickUsingJs(Vype_ExperiencevuseXuLanding.lnkExperienceVuseXu, "lnkExperienceVuseXu");
	//rai.ClickUsingOCR("lnkExperienceVuseXu");
	
	}
	
	@Then("^verify Content MAKE VUSE TRULY YOURS and Verify text VUSE x U provides$")
public void verify_text_MAKE_VUSE_TRULY_YOURS_and_Verify_text_VUSE_x_U_provides() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	    
	    rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS);
	    
	    rai.SwipeDownSmallerUnits(3);
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS,"Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS","MAKEVUSETRULYYOURS");
	    
	}

	@Then("^verify text CREATE WITH US is displayed$")
	public void verify_text_CREATE_WITH_US_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(3);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weCreateWithUs);
	    
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weCreateWithUs, "Create With Us","Create With Us");
		
		
	    
	}

	/*@And("^verify text Capture lasting memories with our unique Audio Signature personalization for your ePod 2 device. Choose from 3 new patterns in the Everlasting Collection and record using our latest laser engraving technology$")
	public void verify_text_Capture_lasting_memories_with_our_unique_Audio_Signature_personalization_for_your_ePod_2_device._Choose_from_3_new_patterns_in_the_Everlasting_Collection_and_record_using_our_latest_laser_engraving_technology() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.weCaptureLasting, "The Closest");
	}*/

	@When("^verify text Record now button and click on Record now$")
	public void verify_Record_now_button_and_click_on_Record_now() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.SwipeDownSmallerUnits(2);
		
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.btnRecordNow, "RecordNow","RecordNow");
		
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.btnRecordNow,"Record Now");
		
		Thread.sleep(30000);
		
	   
		
	}

	@Then("^verify AUDIO SIGNATURE page is displayed\\.$")
	public void verify_AUDIO_SIGNATURE_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
	
		rai.SwipeDownSmallerUnits(3);
	  
	    Thread.sleep(30000);
		//gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weAudioSignature1, "Audio Signature1");
		rai.switchDefault();
	    
	}

	@Then("^verify text core collectionv and Select from (\\d+) engraving design options\\.$")
	public void verify_text_core_collectionv_and_Select_from_engraving_design_options(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(2);
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weCorecollection, "Core collection","Core collection");
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weSelectFromThree, "Select From Three","Select From Three");
	}

	@Then("^verify text EVERLASTING COLLECTION and Limited Edition designs to mark your infinite bonds\\.$")
	public void verify_text_EVERLASTING_COLLECTION_and_Limited_Edition_designs_to_mark_your_infinite_bonds() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weEverlasting, "Ever lasting","Ever lasting");
	  
	   //gl.VerifyElementPresent(Vype_ExperiencevuseXuLanding.weLimitedEdition, "Limited Edition");
	   rai.SwipeDownSmallerUnits(3);
	}

	

	@Then("^verify  text PERSONALIZE and engraving and designed with precision user our lazer technology$")
	public void verify_text_PERSONALIZE_and_engraving_and_designed_with_precision_user_our_lazer_technology() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.wePersonalize, "Personalize","Personalize");
	   rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weDesignedWithPrecision, "Designed With Precision","Personalize");
	}

	@Then("^verify text discover more button and click on discover more button$")
	public void verify_text_discover_more_button_and_click_on_discover_more_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.SwipeDownSmallerUnits(2);
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.btnDiscoverMore, "DiscoverMore","DiscoverMore");
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.btnDiscoverMore, "DiscoverMore");
		Thread.sleep(2000);
		
		
	    
	}

	@Then("^verify A MOMENT IN TIME page is displayed and text skins collections$")
	public void verify_A_MOMENT_IN_TIME_page_is_displayed_and_text_skins_collection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(2);
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weAMomentIn, "A Moment In Time","A Moment In Time");
		rai.clickBrowseBack();
		Thread.sleep(2000);
		   rai.SwipeDownSmallerUnits(2);
	   rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weSkinsCollection, "Skins Collection","Skins Collection");
	}

	@Then("^verify wrap your ePod(\\d+) in a new look and discover more button$")
	public void verify_wrap_your_ePod_in_a_new_look_and_discover_more_button(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weWrapYour, "Wrap Your","Wrap Your");
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.btnDiscoverMore1, "Discover More","Discover More");
	    
	}

	@Then("^Click on Discover more button and verify THE ART OF FLAVOUR page is displayed.$")
	public void Click_on_Discover_more_button_and_verify_THE_ART_OF_FLAVOUR_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(1);
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.btnDiscoverMore1, "Discover More","Discover More");
	    Thread.sleep(20000);
	   rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weTheArt, "The Art","The Art");
	    rai.clickBrowseBack();
	}

	@Then("^verify text put a ring on it and verify style your ePod(\\d+) device$")
	public void verify_text_put_a_ring_on_it_and_verify_style_your_ePod_device(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.SwipeDownSmallerUnits(1);
		
	   // gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.wePutA, "Put a ring");
	   // rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weStyleYour, "Style Your","Style Your");
	}

	@Then("^verify Buy now button and click on buy now button$")
	public void verify_buy_now_button_and_click_on_buy_now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.btnBuyNow, "Buy Now","Buy Now");
	//rai.clickUsingJs(Vype_ExperiencevuseXuLanding.btnBuyNow, "Buy Now");
	  Thread.sleep(20000);
	}

	@Then("^verify ePod Rings page is displayed$")
	public void verify_ePod_Rings_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase sabove into concrete actions
	    //gl.VerifyObjectDisplayed(Vype_ExperiencevuseXuLanding.weePod2Rings, "ePod 2 Rings");
	    rai.clickBrowseBack();
	}

	@Then("^verify text four U Quiz$")
	public void verify_text_four_U_Quiz() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.we4UQuiz);
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.we4UQuiz, "we4UQuiz","we4UQuiz");
	}

	@Then("^find which ePod two skin is made for u and take the quiz button$")
	public void find_which_ePod_two_skin_is_made_for_u_and_take_the_quiz_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weFindWhich, "Find Which","Find Which");
	    rai.clickUsingJs(Vype_ExperiencevuseXuLanding.btnTakeTheQuiz, "Take The Quiz");
	    Thread.sleep(20000);
	}

	@Then("^verify Quiz page is displayed$")
	public void verify_Quiz_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.we4UQUIZ,"4U QUIZ","4U QUIZ");
		rai.clickBrowseBack();
	    
	}

	@Then("^verify text IN store and Take your ePod two\\.$")
	public void verify_text_IN_store_and_Take_your_ePod_two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.SwipeDownSmallerUnits(4);
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weInStore,"weInStore","weInStore");
		rai.verifyPageByObject(Vype_ExperiencevuseXuLanding.weTakeYour, "Take Your","Take Your");
	    
	}
	
	@Then("^click and verify all footer links$")
	public void click_and_verify_all_footer_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Click on Instagram text
		rai.clickUsingJs(Vype_CommonXpath.lnkLogin, "Instagram ");
		Thread.sleep(2000);
		

		

		// Verify Instagram page is displayed
		rai.verifyPageByObject(Vype_CommonXpath.txtInstagram, "Instagram ","Instagram ");
		Thread.sleep(2000);
		rai.ClosetabAndroid();
	
	      rai.switchDefault();

		// Click on Facebook text
	      rai.clickUsingJs(Vype_CommonXpath.lnkFacebook, "Facebook text ");
		Thread.sleep(2000);
	
		Thread.sleep(2000);

		// Verify Facebook page is displayed
		rai.verifyPageByObject(Vype_CommonXpath.txtFacebook, "Facebook ","Facebook ");

		//gl.fnCloseCurrentTab();
		 rai.switchDefault();

		// Click on Twitter text
		rai.clickUsingJs(Vype_CommonXpath.lnkTwitter, "Twitter text ");

		//gl.fnSwitchToSucceedingTab();
		Thread.sleep(2000);

		// Verify twitter page is displayed
		rai.verifyPageByObject(Vype_CommonXpath.txtTwitter, "Twitter","Twitter ");

		//gl.fnCloseCurrentTab();
		rai.switchDefault();


		// Click on Youtube text
		rai.clickUsingJs(Vype_CommonXpath.lnkYoutube, "Youtube text ");

	
	
		Thread.sleep(40000);

		// Verify you tube page is displayed
		rai.verifyPageByObject(Vype_CommonXpath.txtYoutube, "Youtube ","Youtube ");

		//gl.fnCloseCurrentTab();
		rai.switchDefault();

		// Click on Contact Us text
		rai.clickUsingJs(Vype_CommonXpath.lnkContactUs, "Contact Us text ");

		/*rdriver.findElement(By.xpath("(//*[contains(text(),'Advanced')])[1]")).click();;
		Thread.sleep(2000);
		rdriver.findElement(By.id("proceed-link")).click();
		Thread.sleep(5000);*/
		// Verify Contact us page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtContactUs, "Contact Us ");
		//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");
		rai.fnBrowserBack();
		Thread.sleep(10000);


		//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

		// Click on FAQs text
		rai.clickUsingJs(Vype_CommonXpath.lnkFaqs, "FAQs text ");

		Thread.sleep(4000);
		//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

		// Verify FAQs Page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.weTxtGeneralQuestions, "FAQs ");
		rai.fnBrowserBack();

		Thread.sleep(5000);

		//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");

		// click link store locator
		rai.clickUsingJs(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");

		//gl.clickUsingJs(Vype_AgeCertify.btnIam18, "I am 18");
		// Verify Page

		Thread.sleep(5000);
		rai.VerifyElementVisible(Vype_CommonXpath.pgStoreLocator, "Store Locator ");
		rai.fnBrowserBack();

		rai.clickUsingJs(Vype_CommonXpath.lnksitemap, "sitemap");

		Thread.sleep(4000);

		rai.VerifyElementsVisible(Vype_CommonXpath.pgsitemap,"site map");

		Thread.sleep(4000);
		rai.fnBrowserBack();

		// Click on Condition of Sale text
		rai.clickUsingJs(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale link ");

		Thread.sleep(5000);
		// Verify Conditions on sale page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtConditionsofSale, "Condition of Sale ");
		rai.fnBrowserBack();
		// Click on Privacy Policy text
		rai.clickUsingJs(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy link ");

		Thread.sleep(5000);
		// Verify privacy policy page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtPrivacyPolicy, "Privacy Policy ");
		rai.fnBrowserBack();

		// Click on Terms and conditions text
		rai.clickUsingJs(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions link ");

		Thread.sleep(10000);
		// Verify Terms and conditions page is displayed
		//gl.VerifyElementVisible(Vype_CommonXpath.txtTermsConditions, "Terms and conditions ");
		//rai.ververifyTitle("Terms & Conditions | Vuse Canada");
		rai.fnBrowserBack();

		// Click on Cookie Policy text
		rai.clickUsingJs(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy link ");

		Thread.sleep(10000);
		// Verify Cookie Policy page is displayed
		//gl.VerifyElementVisible(Vype_CommonXpath.txtCookiePolicy, "Cookie Policy ");

		//gl.verifyTitle("Cookie Policy | Vuse Canada");
		rai.fnBrowserBack(); 
	}
	

	// Added by sireesha
	
	@Then("^Verify Experience VUSE x U Page and with relevant content is displayed$")
	public void verify_Experience_VUSE_x_U_Page_and_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		 rai.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada");
		    
		  //Verify MAKE VUSE TRULY YOURS text
		    
		          rai.SwipeDownSmallerUnits(4);
		    
		        rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS);
		        Thread.sleep(1000);
		        
		        rai.SwipeDownSmallerUnits(8);
		        
		  		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.weMAKEVUSETRULYYOURS,"MAKE VUSE TRULY YOURS");
		  		
		  		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weTakeYour);
		  		
		  		
		  		rai.SwipeDownSmallerUnits(13);
		  		
		  		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weWhereToFind);
				//Verify WHERE TO FIND US text
				rai.VerifyElementsVisible(Vype_ExperiencevuseXuLanding.weWhereToFind,"WHERE TO FIND US");
			
				// verify the buttons under endless way to coustomize
				
				rai.SwipeUpSmallerUnits(8);
				rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtbtns);
				Thread.sleep(1000);
				
//				List<WebElement> list3 = rai.findElementsList(Vype_ExperiencevuseXuLanding.txtbtns);
//				System.out.println("Total buttons: "+list3.size());
//				for(int i=0; i<list3.size();i++)
//				{
//					rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtbtns,"list of buttons");
//					rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtbtns(i));
//					String buttons=rai.getText(Vype_ExperiencevuseXuLanding.txtbtns(i));
//					System.out.println((i+1)+":"+buttons);
//					
//					
//					
//				}
				rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtbtns);
				String str= rai.getText(Vype_ExperiencevuseXuLanding.txtbtns);
				System.out.println(str);
				
	}

	@When("^User Swipe down and clicks on ePodtwo under ENDLESS WAYS TO CUSTOMIZE$")
	public void user_Swipe_down_and_clicks_on_ePodtwo_under_ENDLESS_WAYS_TO_CUSTOMIZE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		rai.SwipeUpSmallerUnits(6);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtendless);
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.epod, "button epod2");
	}

	@Then("^Verify the epodtwo tile highlighted and Verify the content$")
	public void verify_the_epodtwo_tile_highlighted_and_Verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.epod, "button epod2");
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtepod, "text eopd");
	}

	@Then("^Click on ePod Twoplus under ENDLESS WAYS TO CUSTOMIZE$")
	public void click_on_ePod_Twoplus_under_ENDLESS_WAYS_TO_CUSTOMIZE() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.epod2plus, "button epod2+");
	}

	@Then("^Verify the ePod twoplus tile highlighted and Verify the content$")
	public void verify_the_ePod_twoplus_tile_highlighted_and_Verify_the_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.epod2plus, "button epod2+");
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtepod2plus, "text epod2");
	    
	}

	@When("^User swipe down and click on Discover more button under ENGRAVING tile$")
	public void user_swipe_down_and_click_on_Discover_more_button_under_ENGRAVING_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.SwipeDownSmallerUnits(4);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtEngraving);
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtEngraving, "engraving ");
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.txtEngraving, "Discover More");
		
	}

	@Then("^Verify Engrave Your Devices Page is displayed$")
	public void verify_Engrave_Your_Devices_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtPickDeviceColour, "Pick your device colour & design style");
	}

	@Then("^User click on browse back and Verify the Experience VUSE x U page is displayed$")
	public void user_click_on_browse_back_and_Verify_the_Experience_VUSE_x_U_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		rai.fnBrowserBack();
		Thread.sleep(3000);
		rai.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada");
	}

	@When("^User swipe down and click on BuyNow button under PUT A RING ON IT$")
	public void user_swipe_down_and_click_on_BuyNow_button_under_PUT_A_RING_ON_IT() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(2000);
		rai.SwipeDownSmallerUnits(4);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.wePutA);
		
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.wePutA, "Put a ring on it");
		
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.wePutA, "Buy Now");
		
	}

	@Then("^Verify ePod Rings Page is displayed$")
	public void verify_ePod_Rings_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.weePodRings, "ePod 2 Rings");  
	}

	@When("^User swipe down and click on Discover more button under YOUR DEVICE ELEVATED tile$")
	public void user_swipe_down_and_click_on_Discover_more_button_under_YOUR_DEVICE_ELEVATED_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(1000);
		rai.SwipeDownSmallerUnits(4);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txturdevice);
        rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txturdevice, "YOUR DEVICE ELEVATED");
	    
		//Click on Discover More text
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.txturdevice, "Discover More");
	    Thread.sleep(2000);
	}

	@Then("^Verify the skins Page is displayed$")
	public void verify_the_skins_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		rai.VerifyElementVisible(Vype_CommonXpath.txtCoreCollection, "Core Collection");
		Thread.sleep(2000);
	}

	@When("^User swipe down and click on Start now button under AUDIO SIGNATURE tile$")
	public void user_swipe_down_and_click_on_Start_now_button_under_AUDIO_SIGNATURE_tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(2000);
		rai.SwipeDownSmallerUnits(12);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.weAudioSignature);
				rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.weAudioSignature, "Audio Signature");
				
				rai.clickUsingJs(Vype_ExperiencevuseXuLanding.weAudioSignature, "Start Now");
				Thread.sleep(2000);

	}

	@Then("^Verify AUDIO SIGNATURE Page is displayed$")
	public void verify_AUDIO_SIGNATURE_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//gng to the page and click on skip video
				rai.clickUsingJs(Vype_ExperiencevuseXuLanding.btnskip, "Video skip");
				
				rai.VerifyElementsVisible(Vype_ExperiencevuseXuLanding.weAudioSignature1, "Audio Signature1");
	}

	@When("^User swipe down and click on Toronto under Vuse X U WHERE TO FIND US$")
	public void user_swipe_down_and_click_on_Toronto_under_Vuse_X_U_WHERE_TO_FIND_US() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(2000);
		rai.SwipeDownSmallerUnits(13);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.txtwhereto);
		Thread.sleep(1000);
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.txtwhereto, "Where to find us");
		rai.clickUsingJs(Vype_ExperiencevuseXuLanding.lnktoronto, "Toronto");
	}

	@Then("^Verify selected Province address and visit store page link is displayed$")
	public void verify_selected_Province_address_and_visit_store_page_link_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    rai.SwipeUpSmallerUnits(2);
	    rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.lstsaddress);
		String address = rai.getText(Vype_ExperiencevuseXuLanding.lstsaddress);
		rai.VerifyElementsVisible(Vype_ExperiencevuseXuLanding.lstsaddress, address);
		System.out.println(address);
		
		rai.SwipeDownSmallerUnits(2);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.lnkstorepage);
		rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.lnkstorepage, "Store link");
	}

	@When("^User click on visit Store page link$")
	public void user_click_on_visit_Store_page_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(3000);
		rai.ScrollByxpath(Vype_ExperiencevuseXuLanding.lnkstorepage);
		rai.clickLink(Vype_ExperiencevuseXuLanding.lnkstorepage, "Store link");
	}

	@Then("^Verify related store Page is opened in the new tab$")
	public void verify_related_store_Page_is_opened_in_the_new_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    Thread.sleep(3000);
	    rai.ClosetabAndroid();
		
		//rai.VerifyElementVisible(Vype_ExperiencevuseXuLanding.pgstore, "Store page");
	}

	@When("^User close the new and Verify the Experience VUSE x U page is displayed$")
	public void user_close_the_new_and_Verify_the_Experience_VUSE_x_U_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 rai.switchDefault();
		    Thread.sleep(2000);
		    
		    rai.verifyTitle("Vuse by You: Customize Your Vape | Vuse Canada");
	   
	}

	
	

}


