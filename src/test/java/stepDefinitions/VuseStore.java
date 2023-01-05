package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_PlusContents;
import goVype_Properties.Vype_VuseStore;
import goVype_Properties_mobile.Vype_CommonXpath;

public class VuseStore {
	

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
//	@When("^click on vuse store$")
//	public void click_on_vuse_store() throws Throwable {
//		gl.HowerMouse(Vype_VuseStore.WeVuseStore, "Vuse Store");
//		
//	 
//		gl.clickUsingJs(Vype_VuseStore.WeVuseStore, "Vuse Store");
//	}
//
//	@Then("^Verify Vuse store page is displayed$")
//	public void verify_Vuse_store_page_is_displayed() throws Throwable {
//	    Thread.sleep(4000);
//	    gl.ScrollPageDown();
//	   //.VerifyElementPresent(Vype_VuseStore.WeOpeningHours, "WeOpeningHours");
//	}
//
//	@Then("^Click on contact number and verify$")
//	public void click_on_contact_number_and_verify() throws Throwable {
//		gl.HowerMouse(Vype_VuseStore.lnkContactNumber, "Contact Number");
//	 gl.clickbutton(Vype_VuseStore.lnkContactNumber, "Contact Number");
//	 Thread.sleep(3000);
//	 gl.VerifyElementPresent(Vype_VuseStore.WeOpeningHours, "OpeningHours");
//	}
//
//	@When("^Click on get direction and verify location maps is displayed$")
//	public void click_on_get_direction_and_verify_location_maps_is_displayed() throws Throwable {
//	   gl.clickUsingJs(Vype_VuseStore.lnkGetDirections, "GetDirections");
//	   Thread.sleep(6000);
//	   gl.fnSwitchToPrecedingTab();
//	  
//	   gl.fnCloseCurrentTab();
//	   gl.fnSwitchToDefaultTab();
//	}
//
//	@When("^click on send to a friend and verify share pop up opens$")
//	public void click_on_send_to_a_friend_and_verify_share_pop_up_opens() throws Throwable {
//		gl.clickUsingJs(Vype_VuseStore.lnkSendToFriend, "SendToFriend");
//		gl.VerifyElementPresent(Vype_VuseStore.weShare, "Share");
//		gl.clickUsingJs(Vype_VuseStore.lnkClose, "Close");
//		
//	   
//	}
//
//	@Then("^Scroll down and verify Swipe your device section$")
//	public void scroll_down_and_verify_Swipe_your_device_section() throws Throwable {
//	  gl.fnScrollToView(Vype_VuseStore.weSwap);
//	  
//	}
//
//	@Then("^Scroll down and verify complete experience section$")
//	public void scroll_down_and_verify_complete_experience_section() throws Throwable {
//	 gl.fnScrollToView(Vype_VuseStore.weGetComplete);
//	}
//
//	@Then("^Click on call not to call back button and verify pop up modal$")
//	public void click_on_call_not_to_call_back_button_and_verify_pop_up_modal() throws Throwable {
//	   gl.ScrollPageDown();
//      gl.clickUsingJs(Vype_VuseStore.btnCallNow, "CallNow");
//      gl.VerifyElementPresent(Vype_VuseStore.weGetComplete, "weGetComplete");
//	}
//
//	@Then("^Scroll down till where to find us section$")
//	public void scroll_down_till_where_to_find_us_section() throws Throwable {
//	gl.fnScrollToView(Vype_VuseStore.weWereToFind);
//	}
//
//	@When("^click on Find other vuse stores and verify$")
//	public void click_on_Find_other_vuse_stores_and_verify() throws Throwable {
//	 
//	gl.clickUsingJs(Vype_VuseStore.lnkFindOther, "Find Other Vuse Store");
//	Thread.sleep(20000);
//	gl.fnSwitchToPrecedingTab();
//	
//	gl.fnCloseCurrentTab();
//	gl.fnSwitchToDefaultTab();
//	
//	}
//
//	@Then("^Scroll down and verify frequently asked question$")
//	public void scroll_down_and_verify_frequently_asked_question() throws Throwable {
//	    gl.fnScrollToView(Vype_VuseStore.weFrequentlyAsked);
//	   
//	}
//
//	@Then("^Click on Where are you located verify content$")
//	public void click_on_Where_are_you_located_verify_content() throws Throwable {
//	   
//		
//		
//	  gl.clickUsingJs(Vype_VuseStore.lnkWereareYou, "Were are You");
//	  Thread.sleep(2000);
//	  
//	  String WeAreLocated=gl.getText(Vype_VuseStore.weWeAreLocated);
//		gl.VerifyElementPresent(Vype_VuseStore.weWeAreLocated,WeAreLocated);
//
//	 
//	}
//
//	@When("^Click on What are your opening hours and verify content$")
//	public void click_on_What_are_your_opening_hours_and_verify_content() throws Throwable {
//		
//	    gl.clickUsingJs(Vype_VuseStore.lnkOpeningHours, "OpeningHours");
//	    
//	    Thread.sleep(2000);
//	    
//	    String OurCurrent=gl.getText(Vype_VuseStore.weOurCurrent);
//		gl.VerifyElementPresent(Vype_VuseStore.weOurCurrent,"OurCurrent");
//
//	  
//	
//	}
//
//	@Then("^Click on What products do you carry and verify content$")
//	public void click_on_What_products_do_you_carry_and_verify_content() throws Throwable {
//	    
//		gl.clickUsingJs(Vype_VuseStore.lnkWhatProducts, "WhatProducts");
//		
//		Thread.sleep(2000);
//	    
//	    String VuseProducts=gl.getText(Vype_VuseStore.weVuseProducts);
//		gl.VerifyElementPresent(Vype_VuseStore.weVuseProducts,VuseProducts);
//
//	    
//	   
//	  
//	}
//
//	@Then("^Click on payment methods and verify content$")
//	public void click_on_payment_methods_and_verify_content() throws Throwable {
//	   gl.clickUsingJs(Vype_VuseStore.lnkPaymentMethods, "PaymentMethods");
//	   Thread.sleep(2000);
//	   
//	   gl.ScrollPageDown();
//	   
//	   String PaymentMethodsContent=gl.getText(Vype_VuseStore.wePaymentMethodsContent);
//		gl.VerifyElementPresent(Vype_VuseStore.wePaymentMethodsContent,PaymentMethodsContent);
//
//	 
//	   
//	}
//
//	@Then("^Click on shoping methods and verify Content$")
//	public void click_on_shoping_methods_and_verify_Content() throws Throwable {
//	  gl.clickUsingJs(Vype_VuseStore.lnkShopingMethods, "lnkShopingMethods");
//	  gl.ScrollPageDown();
//	  gl.fnScrollToView(Vype_VuseStore.lnkShopingMethods);
//	
//	  Thread.sleep(2000);
//	  
//	  
//	  String ShopingMethodsContent=gl.getText(Vype_VuseStore.weShopingMethodsContent);
//		gl.VerifyElementPresent(Vype_VuseStore.weShopingMethodsContent,ShopingMethodsContent);
//
//	  
//	}
//
//	
//	@Then("^Click on do you scan Id and verify content$")
//	public void click_on_do_you_scan_Id_and_verify_content() throws Throwable {
//		gl.clickUsingJs(Vype_VuseStore.lnkDoYouScan, "DoYouScan");
//		Thread.sleep(2000);
//		
//		
//		 String DoYouScanContent=gl.getText(Vype_VuseStore.weDoYouScanContent);
//			gl.VerifyElementPresent(Vype_VuseStore.weDoYouScanContent,DoYouScanContent);
//
//		
//
//	}
	
	//Modified by sireesha
	@When("^User click on Vuse store from header in home page$")
	public void user_click_on_Vuse_store_from_header_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.clickUsingJs(Vype_VuseStore.btnstore,"vuse store header");
	}

	@Then("^Verify vuse store page  and with relevant content is displayed$")
	public void verify_vuse_store_page_and_with_relevant_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gl.verifyTitle("Vuse Store Province | Vuse Canada");
	    gl.VerifyElementVisible(Vype_VuseStore.lstprovince,"province list");
	    
	    gl.fnScrollToView(Vype_VuseStore.txtfindus);
	    gl.VerifyElementVisible(Vype_VuseStore.txtfindus,"where to find us");
	    // tiles of the store
	    List<WebElement> list3 = gl.findElementsList(Vype_VuseStore.lststores);
		System.out.println("Total no of  stores tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			String str = list3.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
		}
		//verify the map figure
		gl.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
		
	// verify the exclusive store offers
		gl.fnScrollToView(Vype_VuseStore.txtstoreoffers);
		
		gl.VerifyElementVisible(Vype_VuseStore.txtstoreoffers,"exclusive store offers");
		
		gl.fnScrollToView(Vype_VuseStore.txtexperince);
		
		 String completeexperince=gl.getText(Vype_VuseStore.txtexperince);
			gl.VerifyElementPresent(Vype_VuseStore.txtexperince,completeexperince);
			System.out.println(completeexperince);

	}

	@When("^User click on BritishColoumbia Province link$")
	public void user_click_on_BritishColoumbia_Province_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.fnScrollToView(Vype_VuseStore.btnbc);
		gl.clickUsingJs(Vype_VuseStore.btnbc,"BritishColoumbia");
	}

	@Then("^verify the BritishColoumbia province related content is displayed$")
	public void verify_the_BritishColoumbia_province_related_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list3 = gl.findElementsList(Vype_VuseStore.lststores);
		System.out.println("Total no of  stores tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			String str = list3.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
		}
		//verify the map figure
				gl.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
	}

	@When("^User click on Alberta province link$")
	public void user_click_on_Alberta_province_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickUsingJs(Vype_VuseStore.btnAB,"Alberta");
	}

	@Then("^Verify Alberta province related content is displayed$")
	public void verify_Alberta_province_related_content_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> list3 = gl.findElementsList(Vype_VuseStore.lststores);
		System.out.println("Total no of  stores tiles: "+list3.size());
		for(int i=0; i<list3.size();i++)
		{
			String str = list3.get(i).getText();
			System.out.println(str);
			gl.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
		}
		//verify the map figure
				gl.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
	}



	}
	
	

	



