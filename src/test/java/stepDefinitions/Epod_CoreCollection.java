package stepDefinitions;


import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.*;
import goVype_Properties.*;



public class Epod_CoreCollection {
	

	
		RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
		CommonFunctions function = new CommonFunctions(gl);
		
		@When("^User hover on shop and clicks on All ePod Devices$")
		public void User_hover_on_shop_and_clicks_on_All_ePod_Devices() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
			//Navigate to device
			function.navigateToePodDevice();
		}
		
		@When("^Scroll down and click on flavor image \"([^\"]*)\" and verify the product detail page of flavor$")
	    public void Scroll_down_and_click_on_flavor_image_and_verify__the_product_detail_page_of_flavor(String flavor) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions

	        function.flavourpdp(flavor);

	 

	    }
		
		@When("^Click on add to cart and verify the mini cart is updated$")
	    public void click_on_add_to_cart_and_verify_the_mini_cart_is_updated() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        gl.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");

	        String str;
	        str = gl.getText(Vype_CommonXpath.txtnumber);
	        gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");

	        System.out.println("quantity in cart is:"+str);

	 

	    }
		
		
		
		@Then("^Verify user navigated to ePod devices page and verify relevant content$")
		public void Verify_user_navigated_to_ePod_devices_page_and_verify_relevant_content() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.VerifyPageDisplayed(Vype_CommonXpath.txtepoddevice, "ePod page  ");
			
			gl.fnScrollToView(Vype_CommonXpath.txtepod2);
			
			gl.VerifyElementVisible(Vype_CommonXpath.txtepod2, "ePod 2  ");
			
			gl.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
			
			String devices = gl.getText(Vype_ePod_CoreCollection.weepoddevices);
            gl.VerifyElementVisible(Vype_ePod_CoreCollection.weepoddevices, "devices");
            System.out.println("ePod 2+ devices are:"+devices);
			
		}
		@Then("^Verify user navigated to ePod devices page$")
		public void Verify_user_navigated_to_ePod_devices_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			
			gl.VerifyPageDisplayed(Vype_CommonXpath.txtepoddevice, "ePod page  ");
			
			gl.fnScrollToView(Vype_CommonXpath.txtepod2);
			
		
			
			
		}
		@Then("^Click on ePod(\\d+) button and verify ePod(\\d+) device tiles are displayed$")
		public void Click_on_ePod_button_and_verify_ePod_device_tiles_are_displayed(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			gl.clickbutton(Vype_CommonXpath.txtepod2, "ePod 2  ");
			
			String devices = gl.getText(Vype_ePod_CoreCollection.weepoddevices);
            gl.VerifyElementVisible(Vype_ePod_CoreCollection.weepoddevices, "devices");
            System.out.println("ePod 2 devices are:"+devices);
            
		}
		
		
		
		@When("^User clicks on ePod(\\d+) Core Collection$")
		public void User_clicks_on_ePod_Core_Collection(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.clickUsingJs(Vype_CommonXpath.lnkcorecollections, "epod2 core collections");
			Thread.sleep(5000);
		}

		@Then("^Verify ePod(\\d+) Core Collection page is displayed with relevant content$")
		public void Verify_ePod_Core_Collection_page_is_displayed_with_relevant_content(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			// Verify the "Choose your colour" page is displayed
			gl.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");
			
			String devicecolor = gl.getText(Vype_ePod_CoreCollection.weepoddevicecolor);
            gl.VerifyElementVisible(Vype_ePod_CoreCollection.weepoddevicecolor, "devices");
            System.out.println("ePod 2 devices are:"+devicecolor);
            
            //exit button
           // gl.VerifyElementVisible(Vype_ePod_CoreCollection.weexit, "devices");
        	gl.VerifyElementVisible(Vype_CommonXpath.btnExit, "Exit");
            //next button
            //gl.VerifyElementVisible(Vype_ePod_CoreCollection.wenext, "devices");
            gl.VerifyElementVisible(Vype_CommonXpath.btnnext, "Next");
            
            //frequently asked questions
        	gl.VerifyElementVisible(Vype_CommonXpath.weFAQContainer, "FAQ's");
            
		}
		
		
		@Then("^Click on select for any color \"([^\"]*)\"$")
		public void click_on_select_for_any_color(String devicecolour) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.clickUsingJs(Vype_CommonXpath.btnSelectDeviceColor(devicecolour), "colour selected is:" + devicecolour);

			
			}

		

		@Then("^Verify product detail page is displayed with relevant content$")
		public void Verify_product_detail_page_is_displayed_with_relevant_content() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			// Verify Text Power on with the VUSE ePod2 section is displayed

		gl.VerifyElementVisible(Vype_CommonXpath.pgdevicecolour,"The Power on with the Vuse ePod2 Section");

//	    
		gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnprice, "price");
		
	    gl.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
		
	    gl.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">"); 
	    	    
	    gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
		
	    gl.VerifyElementVisible(Vype_CommonXpath. btnback, "back");
	    
	    gl.VerifyElementVisible(Vype_ePod_CoreCollection.btncontent, "content");
	    
	    gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnseppods, "pods are sold seperately");
		
		}
		
		@When("^Click on add to cart then Verify the mini cart is updated and added to cart is displayed$")
		public void Click_on_add_to_cart_then_Verify_the_mini_cart_is_updated_and_added_to_cart_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
			Thread.sleep(3000);
			String str;
			str = gl.getText(Vype_CommonXpath.txtnumber);
			gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
			 
			System.out.println("quantity in cart is:"+str);
			gl.VerifyElementVisible(Vype_ePod_CoreCollection.txtadded, "added to cart ");
		}

		@Then("^User click on right and left corousal and verify the different images$")
	    public void User_click_on_right_and_left_corose_and_verify_the_different_images() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions



			for(int i=0;i<4;i++)
			{
				gl.clickUsingJs(Vype_CommonXpath.rightarrow, "-> ");

				gl.VerifyObjectDisplayed(Vype_CommonXpath.weProductImage,"product images ");
			}

			
	       
	       
	    }
		
		@Then("^Click on ePod(\\d+) button and verify ePod(\\d+) devices are displayed$")
		public void Click_on_ePod_button_and_verify_ePod_devices_are_displayed(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
            gl.clickbutton(Vype_CommonXpath.txtepod2, "ePod 2  ");
			
			
            gl.VerifyElementVisible(Vype_ePod_CoreCollection.weepoddevices, "devices");
          
		}

		@When("^User clicks on pods and verify ePod Pods page is displayed$")
		public void User_clicks_on_pods_and_verify_ePod_Pods_page_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			gl.clickUsingJs(Vype_CommonXpath.lnkpods, "Click on pods");
			Thread.sleep(3000);
			
			gl.waitTillElementVisible(Vype_CommonXpath.pgEpodPods);



		    // Verify that ePod's pods page is displayed.
		    gl.VerifyElementVisible(Vype_CommonXpath.pgEpodPods, "ePod Pods");
		}
		
//		@When("^Scroll down and click on flavor image \"([^\"]*)\" and verify the product detail page of flavor$")
//		public void Scroll_down_and_click_on_flavor_image_and_verify__the_product_detail_page_of_flavor(String flavor) throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//			
//			function.flavourpdp(flavor);
//
//		}		
			@When("^User clicks on Skins$")
			public void User_clicks_on_Skins() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
			}
			
		

			
			@When("^User clicks on Skins then verify Device Skins  page is displayed$")
			public void User_clicks_on_Skins_then_verify_Device_Skins_page_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
				
				gl.VerifyObjectDisplayed(Vype_CommonXpath.wetxtSkin, "Choose your skin page is opened ");
				
				gl.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
	            Thread.sleep(2000);
				
			}
			
			
			@When("^Click on buy now and verify the ePod(\\d+)\\+ Device Page with relevent content$")
			public void Click_on_buy_now_and_verify_the_ePod_Device_Page_with_relevent_content(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				//click on BUY NOW $14.99(xpath changed)
				gl.clickbutton(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
				
				//verify choose color page
				gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wechoose, "Choose Colour");
				
				String devicecolorepodplus = gl.getText(Vype_ePod_CoreCollection.weepoddevicecolorplus);
	            gl.VerifyElementVisible(Vype_ePod_CoreCollection.weepoddevicecolorplus, "devices");
	            System.out.println("ePod 2+ devices are:"+devicecolorepodplus);
	            
	            //exit button
	           // gl.VerifyElementVisible(Vype_ePod_CoreCollection.weexit, "devices");
	        	gl.VerifyElementVisible(Vype_CommonXpath.btnExit, "Exit");
	            //next button
	            //gl.VerifyElementVisible(Vype_ePod_CoreCollection.wenext, "devices");
	            gl.VerifyElementVisible(Vype_CommonXpath.btnnext, "Next");
	            
	            //frequently asked questions
	        	gl.VerifyElementVisible(Vype_CommonXpath.weFAQContainer, "FAQ's");
				
			}	
			
			
			@Then("^Verify product detail page for ePod(\\d+) plus is displayed with relevant content$")
			public void verify_product_detail_page_for_ePod_plus_is_displayed_with_relevant_content(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btncontentepodplus,"The Power on with the Vuse ePod2 Section ePod 2+");

				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnpriceepodplus, "price");
				
			    gl.VerifyElementVisible(Vype_CommonXpath.btnproductsliderprev, "<");
				
			    gl.VerifyElementVisible(Vype_CommonXpath.btnproductslidernext, ">"); 
			    	    
			    gl.VerifyElementVisible(Vype_CommonXpath. btnAddToCART, "Add to cart");
				
			    gl.VerifyElementVisible(Vype_CommonXpath. btnback, "back");
			    
			    gl.VerifyElementVisible(Vype_ePod_CoreCollection.btncontent, "content");
			    
			    gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnseppods, "pods are sold seperately");
			}	
			
			
			
			@Then("^Verify epod(\\d+)\\+ device page$")
			public void verify_epod_device_page(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				//verify epod2+ device page is displaayed
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkepodpage, "ePod2+ page");
			}
			
			
			@Then("^Verify the epod(\\d+)\\+ device page with relevent content$")
			public void verify_the_epod_device_page_with_relevent_content(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnera, "a new era");
				
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btneratext, "Be one of the first to access the power of connectivity with the my vuse app powered THE NEW ePod 2+");
			
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btneravideo, "Watch Video");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnoverview, "overview");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnfeatures, "features");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btndownload, "download");
			}
			
			
			
			@Then("^User click on watch vedio and verify anew tab with youtube is displayed$")
			public void user_click_on_watch_vedio_and_verify_anew_tab_with_youtube_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.clickbutton(Vype_ePod_CoreCollection.btneravideo, "Watch Video");
				
				gl.fnSwitchToSucceedingTab();
				
				gl.VerifyPageDisplayed(Vype_ePod_CoreCollection.pgYoutubeepodplus, "Youtube");
				
				
			}
			
			@When("^Close the current tab and verify epod(\\d+)\\+ device page is displayed in previous tab$")
			public void close_the_current_tab_and_verify_epod_device_page_is_displayed_in_previous_tab(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
                gl.fnCloseCurrentTab();
				
				gl.fnSwitchToDefaultTab();
				
				gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.lnkepodpage, "ePod2+ page");
				
			}
			
			@When("^User click on overview button and verify the relevent content$")
			public void user_click_on_overview_button_and_verify_the_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.clickbutton(Vype_ePod_CoreCollection.btnoverview, "overview");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkbluetooth, "Bluetooth connected");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnktile, "The power of connectivity");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkpair, "Pair your device to the MYVUSE app through");
			}
			
			
			
			@When("^User clicks on features button$")
			public void user_clicks_on_features_button() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.clickbutton(Vype_ePod_CoreCollection.btnfeatures, "features");
			
			
			}
			
			
			
			@Then("^Verify device lock tile is displayed with relevent content$")
			public void verify_device_lock_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkdevicelock, "device lock");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkaccessdenied, "Access denied");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnksecuretext, "ADevice lock secures your ePod 2+ so no one but you has access.");
			}

			
			
			@Then("^Scroll down and verify cloud control tile is displayed with relevent content$")
			public void scroll_down_and_verify_cloud_control_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkcloudtile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkcloud, "Cloud Control");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkcloudtile, "Go big...Or Small");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkcloudtiletext, "Adjust your vapour cloud size with cloud control directly in the MYVUSE app.");
			}

			
			
			@Then("^Scroll down and verify recharge reminder tile is displayed with relevent content$")
			public void scroll_down_and_verify_recharge_reminder_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkrechargetile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkrecharge, "Recharge Reminder");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkrechargetile, "FULL POWE MODE: ON");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkrechargetext, "*may vary by operating platform");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkrechargetiletext, "Turn on recharge reminder* on the MYVUSE app so you'll never be without power.");
				
				
				
			}

			
			
			@Then("^Scroll down and verify find my vape tile is displayed with relevent content$")
			public void scroll_down_and_verify_find_my_vape_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkvapetile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkvape, "Find Your Vape");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkvapetile, "Don't lose your vuse");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkvapetext, "Vuse Epod 2+ Connected Vape Device _ Vuse Canada");
			}

			
			
			@Then("^Scroll down and verify shop online tile is displayed with relevent content$")
			public void scroll_down_and_verify_shop_online_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkonlinetile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkonline, "Shop Online");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkonlinetile, "SHOP EASILY");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkonlinetext, "Save your favourite pods to your list, track current and past orders and get recommendations based on your preferences.");
				
			}

			
			
			@Then("^Scroll down and verify enjoy haptics tile is displayed with relevent content$")
			public void scroll_down_and_verify_enjoy_haptics_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			  
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkhapticstile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkhaptics, "Enjoy Haptics");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkhapticstile, "Engage all the senses");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkhapticstext, "text under title");
			}

			
			
			@Then("^Scroll down and verify power button tile is displayed with relevent content$")
			public void scroll_down_and_verify_power_button_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkpowertile);
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkpower, "Power button");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkpowertile, "Power button");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkpowertext, "Wake it up, pair it, lock it, unlock it or rest it - there's a lot of power in one button.");
			}

			
			
			@Then("^Scroll down and verify LED Indicator tile is displayed with relevent content$")
			public void scroll_down_and_verify_LED_Indicator_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				gl.fnScrollToView(Vype_ePod_CoreCollection.lnkledtile);
		
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkled, "Led indicator");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkledtile, "Multi-coloured led indicator");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.lnkledtext, "Upgraded multicoloured LED indicator light reflects how much power is available in your battery.");
				
				
			}

			
			@When("^User clicks on download button$")
			public void user_clicks_on_download_button() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				gl.clickbutton(Vype_ePod_CoreCollection.btndownload, "download");
			}

			@Then("^Verify myvuse myway tile is displayed with relevent content$")
			public void verify_myvuse_myway_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnmyway, "MYVUSE MYWAY");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnmywaytile, "The Power Duo");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnmywaytext, "The all-new ePod 2+ is here, redesigned to power your ePod experience. Featuring the fastest charge yet, wireless connection and access to the");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnmywaylink, "download The app");
				
			}

			@Then("^Scroll down and verify App Features tile is displayed with relevent content$")
			public void Scroll_down_and_verify_App_Features_tile_is_displayed_with_relevent_content() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				gl.fnScrollToView(Vype_ePod_CoreCollection.btnfeature);
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnfeature, "App Features");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnfeaturetile, "Vuse News");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnfeaturetext, "Dive even deeper into the features of the");
				
				gl.VerifyElementVisible(Vype_ePod_CoreCollection.btnread, "READ MORE");
				
                gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
				
							
				
				
			}

			@When("^User clicks on buynow button and verify epod(\\d+)\\+ device page is displayed$")
			public void user_clicks_on_buynow_button_and_verify_epod_device_page_is_displayed(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   
				
                gl.clickbutton(Vype_rewardsUiAndFunctionality.webuynow, "BUY NOW $17.99");
				
				//verify choose color page
				gl.VerifyElementVisible(Vype_rewardsUiAndFunctionality.wechoose, "Choose Colour");
			}
		
}	
		
		
		
		
		
		
		
