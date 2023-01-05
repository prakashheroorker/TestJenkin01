package stepDefinitions_Mobile;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_rewardsUiAndFunctionality;
import goVype_Properties_mobile.*;

public class Epod_CoreCollection_Mobile {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	@Then("^User clicks on ePod Vaping Products and clicks on All ePod devices$")
	public void user_clicks_on_ePod_Vaping_Products_and_clicks_on_All_ePod_devices() throws Throwable {

		//click on Device, Pods & Accessories
		rai.clickUsingJs(Vype_CommonXpath.lnkePodVapingProducts, "epod vaping products ");


		//click on Device, Pods & Accessories
		rai.clickUsingJs(Vype_CommonXpath.lnkdevice, " all epod Devices ");
		
//		boolean b=rai.verifyobjectisnotavailable(Vype_Common.popup);
//        if(b==false)
//        {
//          rai.clickLink(Vype_Common.popup, "Not now");
//        //  rai.ClickUsingOCR("Not Now");
//        }
//
//        if(b==true)
//        {
//
//        }
		
	}
	
	
	
	@Then("^Verify user navigated to ePod devices screen and verify relevant content$")
	public void verify_user_navigated_to_ePod_devices_screen_and_verify_relevant_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//rai.RefreshPage();
		//rai.VerifyElementsVisible(Vype_CommonXpath.txtepoddevice, "ePod page  ");
		
		
        
        rai.VerifyElementsVisible(Vype_CommonXpath.txtepoddevice, "ePod page  ");
        
        rai.ScrollByxpath(Vype_CommonXpath.txtepod2);
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtepod2, "ePod 2  ");
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
		
		String devices = rai.getText(Vype_Epod_CoreCollection_Mobile.weepoddevices);
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weepoddevices, "devices");
        System.out.println("ePod 2+ devices are:"+devices);
	}
	
	
	@Then("^Click on ePod(\\d+) tab and verify ePod(\\d+) device tiles are displayed$")
	public void click_on_ePod_tab_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable {
	    
		rai.clickbutton(Vype_CommonXpath.txtepod2, "ePod 2  ");
		
		String devices = rai.getText(Vype_Epod_CoreCollection_Mobile.weepoddevices);
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weepoddevices, "devices");
        System.out.println("ePod 2 devices are:"+devices);
	}
	
	

	
	
	
	
	@When("^User Clicks on ePod(\\d+) Core Collection tile$")
	public void user_Clicks_on_ePod_Core_Collection_tile(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");
		Thread.sleep(5000);
	}

	@Then("^Verify ePod(\\d+) Core Collection screen is displayed with relevant content$")
	public void verify_ePod_Core_Collection_screen_is_displayed_with_relevant_content(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

		String devicecolor = rai.getText(Vype_Epod_CoreCollection_Mobile.weepoddevicecolor);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weepoddevicecolor, "devices");
		System.out.println("ePod 2 devices are:" + devicecolor);

		// exit button
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "devices");

		// next button
		// rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile_Mobile.wenext);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.wenext, "devices");

		// frequently asked questions
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weFAQContainer, "FAQ's");
	}

	@Then("^Click on select for any of color \"([^\"]*)\"$")
	public void click_on_select_for_any_of_color(String devicecolour) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);
	}

	@Then("^Verify product detail screen is displayed with relevant content$")
	public void verify_product_detail_screen_is_displayed_with_relevant_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Verify Text Power on with the VUSE ePod2 section is displayed

		rai.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

//	    
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnprice, "price");
		
	    rai.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
		
	    rai.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">"); 
	    	    
	    rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
	   // rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile_Mobile.btnback);
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile. btnback, "back");
	    
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btncontent, "content");
	    
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnseppods, "pods are sold seperately");
	}

//	
	
	
	@When("^Click on add to cart then verify the mini cart is updated and added to cart is displayed$")
	public void click_on_add_to_cart_then_verify_the_mini_cart_is_updated_and_added_to_cart_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
		Thread.sleep(3000);
		String str;
		str = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
		 System.out.println("quantity in cart is:"+str);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.txtadded, "added to cart ");
	}

	@When("^User clicks on pods and verify ePod Pods screen is displayed$")
	public void user_clicks_on_pods_and_verify_ePod_Pods_screen_is_displayed() throws Throwable {
		rai.clickUsingJs(Vype_CommonXpath.lnkpods, "Click on pods");
		Thread.sleep(3000);
		
		rai.waitTillElementPresenceLocated(Vype_CommonXpath.pgEpodPods);



	    // Verify that ePod's pods page is displayed.
	    rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
	}

	@When("^Swipe down and click on flavor image \"([^\"]*)\" and verify the product detail$")
	public void swipe_down_and_click_on_flavor_image_and_verify_the_product_detail(String flavor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		function.flavourpdpscreen(flavor);
	}

	@When("^User clicks on plus button and verify the quantity is increased$")
	public void user_clicks_on_plus_button_and_verify_the_quantity_is_increased() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.clickbutton(Vype_CommonXpath.Btnplus, "+ ");
		 
		 String quantity=rai.getText(Vype_CommonXpath. btnquantityinc);
		 rai.VerifyElementVisible(Vype_CommonXpath. btnquantityinc, "quantity");
		 System.out.println("quantity is:"+ quantity);
	}

	@Then("^Click on ePod(\\d+) tab and verify ePod(\\d+) devices are displayed$")
	public void click_on_ePod_tab_and_verify_ePod_devices_are_displayed(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.clickbutton(Vype_CommonXpath.txtepod2, "ePod 2  ");
			
			
         rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weepoddevices, "devices");
         
	}
	@Then("^Verify the epod(\\d+)\\+ device page$")
	public void verify_the_epod_device_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//verify epod2+ device page is displaayed
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");
	}

	@Then("^Click on buy now and verify the ePod(\\d+)\\+ Device screen with relevent content$")
	public void click_on_buy_now_and_verify_the_ePod_Device_screen_with_relevent_content(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//click on BUY NOW $14.99(xpath changed)
		rai.clickbutton(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
		
		//verify choose color page
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wechoose, "Choose Colour");
		
		String devicecolorepodplus = rai.getText(Vype_Epod_CoreCollection_Mobile.weepoddevicecolorplus);
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weepoddevicecolorplus, "devices");
        System.out.println("ePod 2+ devices are:"+devicecolorepodplus);
        
        //exit button
       // rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "devices");
    	rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "Exit");
        //next button
        //rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.wenext, "devices");
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.wenext, "Next");
        
        //frequently asked questions
    	rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weFAQContainer, "FAQ's");
	}

	

	@Then("^Verify product detail screen for ePod(\\d+) plus is displayed with relevant content$")
	public void verify_product_detail_screen_for_ePod_plus_is_displayed_with_relevant_content(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btncontentepodplus,"The Power on with the Vuse ePod2 Section ePod 2+");

		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnpriceepodplus, "price");
		
	    rai.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
		
	    rai.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">"); 
	    	    
	    rai.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
		
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile. btnback, "back");
	    
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btncontent, "content");
	    
	    rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnseppods, "pods are sold seperately");
	}
	
	

	@Then("^Verify pods page is displayed$")
	public void verify_pods_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		rai.waitTillElementPresenceLocated(Vype_CommonXpath.pgEpodPods);



	      // Verify that ePod's pods page is displayed.
		rai.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
	}
	
	
	@Then("^User clicks on Skins then verify Device Skins screen is displayed$")
	public void user_clicks_on_Skins_then_verify_Device_Skins_screen_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
		
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtSkin, "Choose your skin page is opened ");
		
		rai.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
        Thread.sleep(2000);
	}
	
	
	
	@Then("^Verify the epod(\\d+)\\+ device screen with relevent content$")
	public void verify_the_epod_device_screen_with_relevent_content(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnera, "a new era");
		
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btneratext, "Be one of the first to access the power of connectivity with the my vuse app powered THE NEW ePod 2+");
	
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btneravideo, "Watch Video");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnoverview, "overview");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnfeatures, "features");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btndownload, "download");
	}
	
	
	
	@Then("^User click on watch vedio and verify a new tab with youtube is displayed$")
	public void user_click_on_watch_vedio_and_verify_a_new_tab_with_youtube_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_Epod_CoreCollection_Mobile.btneravideo, "Watch Video");
		
		//rai.VerifyTextUsingOCR("Introducing the ePod 2+","Introducing the ePod 2+");
	
		
		//rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.pgYoutubeepodplus, "Youtube");
		
		
	}
	
	@When("^Close the current tab and verify epod device screen is displayed in previous tab$")
	public void close_the_current_tab_and_verify_epod_device_screen_is_displayed_in_previous_tab()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(1000);
		rai.clickBrowseBack();
		rai.ClickUsingOCR("X");
		//rai.clickbutton(Vype_Epod_CoreCollection_Mobile.btneravideoclose, "Watch Video close");
		Thread.sleep(1000);
		rai.clickBrowseBack();

		
		
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");

	}
	
	@When("^User click on overview button and verify the relevent content displayed$")
	public void user_click_on_overview_button_and_verify_the_relevent_content_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickUsingJs(Vype_Epod_CoreCollection_Mobile.btnoverview, "overview");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkbluetooth, "Bluetooth connected");
		
	//	rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnktile, "The power of connectivity");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkpair, "Pair your device to the MYVUSE app through");
	}
	
	
	
	@When("^User click on features button$")
	public void user_click_on_features_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_Epod_CoreCollection_Mobile.btnfeatures, "features");
	
	
	}
	
	
	
	@Then("^Verify device lock tile is displayed with the relevent content$")
	public void verify_device_lock_tile_is_displayed_with_the_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkdevicelock, "device lock");
		
		
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnksecuretext, "ADevice lock secures your ePod 2+ so no one but you has access.");
	}

	
	
	@Then("^Swipe down and verify cloud control tile is displayed with relevent content$")
	public void Swipe_down_and_verify_cloud_control_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkcloud);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkcloud, "Cloud Control");
		
	
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkcloudtiletext, "Adjust your vapour cloud size with cloud control directly in the MYVUSE app.");
	}

	
	
	@Then("^Swipe down and verify recharge reminder tile is displayed with relevent content$")
	public void Swipe_down_and_verify_recharge_reminder_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkrecharge);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkrecharge, "Recharge Reminder");
		
		
		rai.SwipeDownSmallerUnits(2);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkrechargetext, "*may vary by operating platform");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkrechargetiletext, "Turn on recharge reminder* on the MYVUSE app so you'll never be without power.");
		
		
		
	}

	
	
	@Then("^Swipe down and verify find my vape tile is displayed with relevent content$")
	public void Swipe_down_and_verify_find_my_vape_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkvape);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkvape, "Find Your Vape");
		
		
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkvapetext, "Vuse Epod 2+ Connected Vape Device _ Vuse Canada");
	}

	
	
	@Then("^Swipe down and verify shop online tile is displayed with relevent content$")
	public void Swipe_down_and_verify_shop_online_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkonline);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkonline, "Shop Online");
		
	
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkonlinetext, "Save your favourite pods to your list, track current and past orders and get recommendations based on your preferences.");
		
	}

	
	
	@Then("^Swipe down and verify enjoy haptics tile is displayed with relevent content$")
	public void Swipe_down_and_verify_enjoy_haptics_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkhaptics);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkhaptics, "Enjoy Haptics");
		
	
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkhapticstext, "text under title");
	}

	
	
	@Then("^Swipe down and verify power button tile is displayed with relevent content$")
	public void Swipe_down_and_verify_power_button_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkpower);
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkpower, "Power button");
		
	
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkpowertext, "Wake it up, pair it, lock it, unlock it or rest it - there's a lot of power in one button.");
	}

	
	
	@Then("^Swipe down and verify LED Indicator tile is displayed with relevent content$")
	public void Swipe_down_and_verify_LED_Indicator_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.lnkled);

		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkled, "Led indicator");
		

		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.lnkledtext, "Upgraded multicoloured LED indicator light reflects how much power is available in your battery.");
		
		
	}

	
	@When("^User click on download button$")
	public void user_click_on_download_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_Epod_CoreCollection_Mobile.btndownload, "download");
	}

	@Then("^Verify myvuse myway tile is displayed with the relevent content$")
	public void verify_myvuse_myway_tile_is_displayed_with_the_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnmyway, "MYVUSE MYWAY");
		
		
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnmywaytext, "The all-new ePod 2+ is here, redesigned to power your ePod experience. Featuring the fastest charge yet, wireless connection and access to the");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnmywaylink, "download The app");
		
	}

	@Then("^Swipe down and verify App Features tile is displayed with relevent content$")
	public void Swipe_down_and_verify_App_Features_tile_is_displayed_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile.btnfeature);
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnfeature, "App Features");
		
	
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnfeaturetext, "Dive even deeper into the features of the");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.btnread, "READ MORE");
		
        rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
		
					
		
		
	}

	@When("^User clicks on buynow button and verify epod(\\d+)\\+ device screen is displayed$")
	public void user_clicks_on_buynow_button_and_verify_epod_device_screen_is_displayed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		
        rai.clickbutton(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
		
		//verify choose color page
		rai.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wechoose, "Choose Colour");
	}
	
	
	@When("^User clicks on personalize your epod and click on Shop device skin$")
	public void user_clicks_on_personalize_your_epod_and_click_on_Shop_device_skin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_Skinspage.txtpersonlizepod, "Shop link from the main menu navigation");

		rai.clickbutton(Vype_Skinspage.deviceshop, "shop skin device");
		Thread.sleep(5000);
	}
	
	
	
	
	
}