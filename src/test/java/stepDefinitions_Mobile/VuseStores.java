
package stepDefinitions_Mobile;


import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_VuseStore;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_VuseStores;

public class VuseStores{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
@When("^User clicks on hamberger menu and clicks on Store$")
	public void click_on_vuse_store() throws Throwable {
	
	Thread.sleep(2000);
	// Clicking on Menu and navigate to Save
	rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
	Thread.sleep(3000);
	rai.clickUsingJs(Vype_VuseStores.WeVuseStore, "Vuse Store");
	 
		
	}

//added by sireesha


@Then("^Verify Vuse store page  and with relevant content is displayed$")
public void verify_Vuse_store_page_and_with_relevant_content_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.verifyTitle("Vuse Store Province | Vuse Canada");
    rai.VerifyElementVisible(Vype_VuseStore.lstprovince,"province list");
    
    rai.ScrollByxpath(Vype_VuseStore.txtfindus);
    rai.VerifyElementVisible(Vype_VuseStore.txtfindus,"where to find us");
    // tiles of the store
    List<WebElement> list3 = rai.findElementsList(Vype_VuseStore.lststores);
	System.out.println("Total no of  stores tiles: "+list3.size());
	for(int i=0; i<list3.size();i++)
	{
		String str = list3.get(i).getText();
		System.out.println(str);
		rai.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
	}
	//verify the map figure
	rai.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
	
// verify the exclusive store offers
	rai.ScrollByxpath(Vype_VuseStore.txtstoreoffers);
	
	rai.VerifyElementVisible(Vype_VuseStore.txtstoreoffers,"exclusive store offers");
	
	rai.ScrollByxpath(Vype_VuseStore.txtexperince);
	
	 String completeexperince=rai.getText(Vype_VuseStore.txtexperince);
		rai.VerifyElementVisible(Vype_VuseStore.txtexperince,completeexperince);
		System.out.println(completeexperince);

}

@When("^User swipe up and  click on BritishColoumbia Province Link$")
public void user_swipe_up_and_click_on_BritishColoumbia_Province_Link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrolltoTopofthepage();
	rai.clickUsingJs(Vype_VuseStore.btnbc,"BritishColoumbia");
}

@Then("^verify the BritishColoumbia province related Content is displayed$")
public void verify_the_BritishColoumbia_province_related_Content_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	rai.SwipeDownSmallerUnits(2);
	List<WebElement> list3 = rai.findElementsList(Vype_VuseStore.lststores);
	System.out.println("Total no of  stores tiles: "+list3.size());
	for(int i=0; i<list3.size();i++)
	{
		String str = list3.get(i).getText();
		System.out.println(str);
		rai.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
	}
	//verify the map figure
			rai.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
}

@When("^User swipe up and click on Alberta province link$")
public void user_swipe_up_and_click_on_Alberta_province_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.ScrolltoTopofthepage();
	rai.clickUsingJs(Vype_VuseStore.btnAB,"Alberta");
}

@Then("^Verify Alberta province related Content is displayed$")
public void verify_Alberta_province_related_Content_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	rai.SwipeDownSmallerUnits(2);
	List<WebElement> list3 = rai.findElementsList(Vype_VuseStore.lststores);
	System.out.println("Total no of  stores tiles: "+list3.size());
	for(int i=0; i<list3.size();i++)
	{
		String str = list3.get(i).getText();
		System.out.println(str);
		rai.VerifyElementVisible(Vype_VuseStore.lststores(i), "content: "+ str);
	}
	//verify the map figure
			rai.VerifyElementVisible(Vype_VuseStore.figmap,"where to find us");
   
}


//	@Then("^verify Vuse store page is displayed$")
//	public void verify_Vuse_store_page_is_displayed() throws Throwable {
//	    Thread.sleep(4000);
//	    rai.ClickUsingOCR("ON");
//	    rai.SwipeDownSmallerUnits(4);
//	    //rai.VerifyElementVisible(Vype_VuseStores.WeOpeningHours, "WeOpeningHours");
//	}
//
//	@Then("^click on contact number and verify$")
//	public void click_on_contact_number_and_verify() throws Throwable {
//	//rai.ScrollByxpath(Vype_VuseStores.lnkContactNumber);
//		rai.ClickUsingOCR("866-477-1169");
//	 rai.clickUsingJs(Vype_VuseStores.lnkContactNumber, "Contact Number");
//	 
//	 Thread.sleep(3000);
//	 rai.VerifyElementVisible(Vype_VuseStores.WeOpeningHours, "OpeningHours");
//	 rai.fnNavigateBack();
//	 rai.fnNavigateBack();
//	}
//
//	@When("^click on get direction and verify location maps is displayed$")
//	public void click_on_get_direction_and_verify_location_maps_is_displayed() throws Throwable {
//	   rai.clickUsingJs(Vype_VuseStores.lnkGetDirections, "GetDirections");
//	  Thread.sleep(6000);
//	 
//	  rai.SwipeDownSmallerUnits(1);
//	   rai.ClickUsingOCR("Get directions");
//	   Thread.sleep(6000);
//	  
//
//	  // rai.VerifyElementPresent(Vype_VuseStore.weVuseStore, "weVuseStore");
//	   //rai.fnNavigateBack();
//	   
//	   rai.ClosetabAndroid();
//	   rai.switchDefault();
//
//
//	 
//	}
//
//	@When("^Click on send to a friend and verify share pop up opens$")
//	public void click_on_send_to_a_friend_and_verify_share_pop_up_opens() throws Throwable {
//		rai.ClickUsingOCR("Get directions");
//		rai.SwipeDownSmallerUnits(2);
//		rai.clickUsingJs(Vype_VuseStores.lnkSendToFriend, "SendToFriend");
//		rai.VerifyElementVisible(Vype_VuseStores.weShare, "Share");
//		rai.clickUsingJs(Vype_VuseStores.lnkClose, "Close");
//		
//	   
//	}
//
//	@Then("^scroll down and verify Swipe your device section$")
//	public void scroll_down_and_verify_Swipe_your_device_section() throws Throwable {
//	  rai.ScrollByxpath(Vype_VuseStores.weSwap);
//	  
//	}
//
//	@Then("^scroll down and verify complete experience section$")
//	public void scroll_down_and_verify_complete_experience_section() throws Throwable {
//	 rai.ScrollByxpath(Vype_VuseStores.weGetComplete);
//	}
//
//	@Then("^click on call not to call back button and verify pop up modal$")
//	public void click_on_call_not_to_call_back_button_and_verify_pop_up_modal() throws Throwable {
//	   rai.SwipeDownSmallerUnits(2);
//      rai.clickUsingJs(Vype_VuseStores.btnCallNow, "CallNow");
//      rai.VerifyElementVisible(Vype_VuseStores.weGetComplete, "weGetComplete");
//	}
//
//	@Then("^scroll down till where to find us section$")
//	public void scroll_down_till_where_to_find_us_section() throws Throwable {
//	rai.ScrollByxpath(Vype_VuseStores.weWereToFind);
//	}
//
//	@When("^Click on Find other vuse stores and verify$")
//	public void click_on_Find_other_vuse_stores_and_verify() throws Throwable {
//	 
//	rai.clickUsingJs(Vype_VuseStores.lnkFindOther, "Find Other Vuse Store");
//	Thread.sleep(20000);
//	
//	//rai.VerifyElementPresent(Vype_VuseStore.lnkVuseStore, "Use Store");
//	rai.ClosetabAndroid();
//	rai.switchDefault();
//	
//	}
//
//	@Then("^scroll down and verify frequently asked question$")
//	public void scroll_down_and_verify_frequently_asked_question() throws Throwable {
//	    rai.ScrollByxpath(Vype_VuseStores.weFrequentlyAsked);
//	   
//	}
//
//	@Then("^click on Where are you located verify content$")
//	public void click_on_Where_are_you_located_verify_content() throws Throwable {
//	   
//		
//		
//	  rai.clickUsingJs(Vype_VuseStores.lnkWereareYou, "Were are You");
//	  Thread.sleep(2000);
//	  
//	  String WeAreLocated=rai.getText(Vype_VuseStores.weWeAreLocated);
//		rai.VerifyElementVisible(Vype_VuseStores.weWeAreLocated,WeAreLocated);
//
//	 
//	}
//
//	@When("^click on What are your opening hours and verify content$")
//	public void click_on_What_are_your_opening_hours_and_verify_content() throws Throwable {
//		
//	    rai.clickUsingJs(Vype_VuseStores.lnkOpeningHours, "OpeningHours");
//	    
//	    Thread.sleep(2000);
//	    
//	    String OurCurrent=rai.getText(Vype_VuseStores.weOurCurrent);
//		rai.VerifyElementVisible(Vype_VuseStores.weOurCurrent,"OurCurrent");
//
//	   // rai.VerifyElementPresent(Vype_VuseStore.weOurCurrent, "OurCurrent");
//	
//	}
//
//	@Then("^click on What products do you carry and verify content$")
//	public void click_on_What_products_do_you_carry_and_verify_content() throws Throwable {
//	    
//		rai.clickUsingJs(Vype_VuseStores.lnkWhatProducts, "WhatProducts");
//		
//		Thread.sleep(2000);
//	    
//	    String VuseProducts=rai.getText(Vype_VuseStores.weVuseProducts);
//		rai.VerifyElementVisible(Vype_VuseStores.weVuseProducts,VuseProducts);
//
//	    
//	  // rai.VerifyElementPresent(Vype_VuseStore.weVuseProducts, "VuseProducts");
//	  
//	}
//
//	@Then("^click on payment methods and verify content$")
//	public void click_on_payment_methods_and_verify_content() throws Throwable {
//	   rai.clickUsingJs(Vype_VuseStores.lnkPaymentMethods, "PaymentMethods");
//	   Thread.sleep(2000);
//	   
//	   rai.SwipeDownSmallerUnits(2);
//	   
//	   String PaymentMethodsContent=rai.getText(Vype_VuseStores.wePaymentMethodsContent);
//		rai.VerifyElementVisible(Vype_VuseStores.wePaymentMethodsContent,PaymentMethodsContent);
//
//	  //rai.VerifyElementPresent(Vype_VuseStore.wePaymentMethodsContent, "PaymentMethodsContent");
//	   
//	}
//
//	@Then("^click on shoping methods and verify Content$")
//	public void click_on_shoping_methods_and_verify_Content() throws Throwable {
//	  rai.clickUsingJs(Vype_VuseStores.lnkShopingMethods, "lnkShopingMethods");
//	  rai.SwipeDownSmallerUnits(2);
//	  rai.ScrollByxpath(Vype_VuseStores.lnkShopingMethods);
//	
//	  Thread.sleep(2000);
//	  
//	  
//	  String ShopingMethodsContent=rai.getText(Vype_VuseStores.weShopingMethodsContent);
//		rai.VerifyElementVisible(Vype_VuseStores.weShopingMethodsContent,ShopingMethodsContent);
//
//	  //rai.VerifyElementPresent(Vype_VuseStore.weShopingMethodsContent, "ShopingMethodsContent");
//	}
//
//	
//	@Then("^click on do you scan Id and verify content$")
//	public void click_on_do_you_scan_Id_and_verify_content() throws Throwable {
//		rai.clickUsingJs(Vype_VuseStores.lnkDoYouScan, "DoYouScan");
//		Thread.sleep(2000);
//		
//		
//		 String DoYouScanContent=rai.getText(Vype_VuseStores.weDoYouScanContent);
//			rai.VerifyElementVisible(Vype_VuseStores.weDoYouScanContent,DoYouScanContent);
//
//		//rai.VerifyElementPresent(Vype_VuseStore.weDoYouScanContent, "DoYouScanContent");
//			
//	}
//			
//			@Then("^verify all footer links$")
//			public void verify_all_footer_links() throws Throwable {
//			  rai.SwipeDownSmallerUnits(5);
//
//				rai.ScrollByxpath(Vype_CommonXpath.lnkInstagram);
//				// Verify Instagram text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkInstagram, "Instagram text ");
//
//				// Verify Facebook text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkFacebook, "Facebook text ");
//
//				// Verify Twitter text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkTwitter, "Twitter text ");
//
//				// Verify Youtube text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkYoutube, "Youtube text ");
//
//				// Verify Contact Us text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkContactUs, "Contact Us text ");
//
//				// Verify FAQs text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkFaqs, "FAQs text ");
//
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkStoreLocator, "Store Locator Text ");
//				
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkStoremap, "Store Map Text ");
//
//				rai.SwipeDown(1);
//
//				// Verify Condition of Sale text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkConditionofSale, "Condition of Sale text ");
//
//				// Verify Privacy Policy text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkPrivacyPolicy, "Privacy Policy text ");
//
//				// Verify Terms and conditions text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkTermsandConditions, "Terms and conditions text ");
//
//				// Verify Cookie Policy text is displayed
//				rai.VerifyElementsVisible(Vype_CommonXpath.lnkCookiePolicy, "Cookie Policy text ");
//
//	}
}

