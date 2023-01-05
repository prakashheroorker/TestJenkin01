package stepDefinitions;



import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;

import goVype_Properties.*;



public class ePod_Engravings {
	

	
		RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
		CommonFunctions function = new CommonFunctions(gl);
	
		
		@When("^User clicks on epod(\\d+)\\+ engraving tile$")
		public void user_clicks_on_epod_engraving_tile(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
			
			gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

			

		}
	
		@When("^Select any device colour \"([^\"]*)\" and click on add pattern$")
		public void select_any_device_colour_and_click_on_add_pattern(String devicecolour) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
			gl.clickbutton(Vype_CommonXpath.btndevicecolour(devicecolour), "colour selected is:" + devicecolour);

			
			 gl.clickUsingJs(Vype_CommonXpath.btnPattern, "Pattern");
			
		}

		@Then("^Verify the choose the pattern page is displayed$")
		public void verify_the_choose_the_pattern_page_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
			gl.VerifyElementVisible(Vype_ePod_Engravings.txtpatternchoose, " choose pattern you like  ");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.txtpatterns, " choose pattern you like patterns  ");
		}
		
		

		@When("^Select any pattern \"([^\"]*)\" and click on add pattern$")
		public void select_any_pattern_and_click_on_add_pattern(String patternName) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
			// Select pattern
			 gl.clickUsingJs(Vype_CommonXpath.btpattern(patternName), "Device pattern name is: " + patternName);
			 String Pattern = gl.getText(Vype_CommonXpath.btpattern(patternName));
			 System.out.println("Device pattern is: " + Pattern);

			 // CLick on Add Pattern button
			 gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddPattern, "Add Pattern");
		}

		
		
		@Then("^Verify text tile is displayed$")
		public void verify_text_tile_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions

			 // Verify the page Now customize the back displayed
			 gl.VerifyPageDisplayed(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

		}

		@When("^User clicks on text  and verify add text to your device page$")
		public void user_clicks_on_text_and_verify_add_text_to_your_device_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			// Click on Text
			 gl.clickUsingJs(Vype_CommonXpath.btnText, "Text");
			 
			 
			 gl.VerifyPageDisplayed(Vype_ePod_Engravings.txttextto, "Add text to your device");
			 
			 gl.VerifyElementVisible(Vype_ePod_Engravings.txthori, " Horizontal  ");
			 
			 gl.VerifyElementVisible(Vype_ePod_Engravings.txtverti, " Vertical  ");
			 
			 gl.VerifyElementVisible(Vype_ePod_Engravings.txtchoosetext, " Enter your text  ");
			 
			 gl.VerifyElementVisible(Vype_ePod_Engravings.txttextlist, " Text pattern lists");
			 
		}

		@When("^Click on direction \"([^\"]*)\" and enter the \"([^\"]*)\"$")
		public void click_on_direction_and_enter_the(String TextDirection, String Text) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 
			// Select direction
			 gl.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
					 "Text direction selected is: " + TextDirection);
			 String Direction = gl.getText(Vype_CommonXpath.btnVertical(TextDirection));
			 System.out.println("Text direction is: " + Direction);
			 
			// Enter your text
			 gl.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);
		}
		
		

		@When("^Select the font style \"([^\"]*)\" and click on add text$")
		public void select_the_font_style_and_click_on_add_text(String FontStyle) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
			
			 // Select Font style
			 gl.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
			 String FontStyle1 = gl.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
			 System.out.println("Font style is: " + FontStyle1);
			 
			 // Click on Add Text button
			 gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAddText, "Add Text");
		}

		@Then("^Verify engraving summary page with relevent content$")
		public void verify_engraving_summary_page_with_relevent_content() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		
			gl.VerifyElementVisible(Vype_ePod_Engravings.txtengraving, " Engraving Summary  ");
			
			String summary = gl.getText(Vype_ePod_Engravings.btnsummary);
			gl.VerifyElementVisible(Vype_ePod_Engravings.btnsummary, " Engraving Summary  " + summary);
			 System.out.println("Font style is: " + summary);
			 
			
		}

		@When("^Click on add to cart and verify cart page is displayed$")
		public void click_on_add_to_cart_and_verify_cart_page_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
			
			 //Verify the Cart page is displayed
		    gl.VerifyElementVisible(Vype_Cart.pgCart, "Cart page");
			
			
		}

		@When("^User click on accessories$")
		public void user_click_on_accessories() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		
			gl.clickbutton(Vype_ePod_Engravings.lnkAccessory, "Accessories");
			Thread.sleep(3000);
			
		}

		@When("^User click on add to cart under chargingcable accessories$")
		public void user_click_on_add_to_cart_under_chargingcable_accessories() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   gl.isEnabled(Vype_ePod_Engravings.lnkAccessoryadd,"charging cable add button");
			gl.clickbutton(Vype_ePod_Engravings.lnkAccessoryadd, "charging cable add button");
			gl.VerifyElementVisible(Vype_ePod_Engravings.lnkAccessoryaddED, " added to cart ");
			
		}
		
		@When("^User clicks on Skins and verify Device Skins  page is displayed$")
		public void User_clicks_on_Skins_and_verify_Device_Skins_page_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			gl.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
			
			gl.VerifyObjectDisplayed(Vype_CommonXpath.wetxtSkin, "Choose your skin page is opened ");
			
			gl.VerifyElementVisible(Vype_CommonXpath.lnkepod, "ePod 2");
            Thread.sleep(2000);
			
		}
			
		
		
		
		@When("^User hover on shop and clicks on engrave your devices$")
		public void user_hover_on_shop_and_clicks_on_engrave_your_devices() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			 // Hover the mouse on Products link
		       gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");
		       
		       gl.clickbutton(Vype_ePod_Engravings.lnkengrave, "engrave your eod");

		}

		@Then("^Verify the engravings page with relevent content$")
		public void verify_the_engravings_page_with_relevent_content() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
			gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgcore, "core collection ");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgpattern, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgtext, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgminiicon, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.lnkepodeng, "ePod 2");
			
			gl.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
			
		}

		@When("^User clicks on ePod(\\d+) button and verify the relevent content$")
		public void user_clicks_on_ePod_button_and_verify_the_relevent_content(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 
			gl.clickbutton(Vype_ePod_Engravings.lnkepodeng, "ePod 2");
			
			Thread.sleep(3000);
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgcore, "core collection is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgpattern, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgtext, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.pgminiicon, "engravable page is opened");
			
			gl.VerifyElementVisible(Vype_ePod_Engravings.lnkepodeng, "ePod 2");
			
			gl.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
			
			
			
			
			
		}
		
		
		
		@When("^User click on add to cart under podcaps accessories$")
		public void user_click_on_add_to_cart_under_podcaps_accessories() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
			
			 gl.isEnabled(Vype_ePod_Engravings.lnkepodcaps,"podcaps add button");
			gl.clickbutton(Vype_ePod_Engravings.lnkepodcaps, "podcaps");
			gl.VerifyElementVisible(Vype_ePod_Engravings.lnkAccessoryaddED, " added to cart ");
			
		}
		
	
//		
		
		@When("^User selects device color as \"([^\"]*)\"$")
	    public void user_selects_device_color_as(String color) throws Throwable {

	 

	    //scroll to view the element
	            gl.ScrollPageDown();

	 

	            function.selectAndVerifyDeviceColor(color);
	            Thread.sleep(3000);

	 

	            //Verify the setp 1 of customization i.e. customize the front page displayed
	            gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "01 | Customize the Front");

	 

	        }
		
		
		@And("^User select device design style as Mini Icon to select \"([^\"]*)\"$")
	    public void user_select_device_design_style_as_Mini_Icon_to_select(String miniicon) throws Throwable {

	 

	        //gl.clickUsingJs(Vype_CommonXpath.Minimize, "Minimize");
	        Thread.sleep(2000);
	        //Click on Mini Icon
	        gl.clickUsingJs(Vype_ePodStarterKit.BtnMiniIcon, "Mini Icon");
	        
	        gl.VerifyElementVisible(Vype_ePod_Engravings.lnkmini, "Choose the mini icon you like");
	        
	        
	        gl.VerifyElementVisible(Vype_ePod_Engravings.lnkicons, "list of mini icon" );
	 

	        gl.clickUsingJs(Vype_CommonXpath.btnminiicon(miniicon), miniicon);

	 

	        //However mouse to add mini icon.
	        gl.HowerMouse(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");

	 

	        //Click on Mini Icon
	        gl.clickbutton(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");
	    }
		
		
		 
		 @When("^User select the design \"([^\"]*)\" and click on add$")
		 public void user_select_the_design_and_click_on_add(String ring) throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
		     
			 gl.fnScrollToView(Vype_CommonXpath.btnepodrings);
			 
			 gl.VerifyElementPresent(Vype_CommonXpath.btnepodrings, "epod rings" );
			 
			 gl.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );
			 
			 gl.isEnabled(Vype_ePod_Engravings.lnkaddring,"rings add button");
				gl.clickbutton(Vype_ePod_Engravings.lnkaddring, "rings");
				gl.VerifyElementVisible(Vype_ePod_Engravings.lnkAccessoryaddED, " added to cart ");
			 
			 
		 }

		 @Then("^verify engraving summary page and click on add to cart$")
		    public void verify_engraving_summary_page_and_click_on_add_to_cart() throws Throwable {

		 

		        //Verify user is redirected to engraving summary page.
		        gl.VerifyElementVisible(Vype_CommonXpath.txtEngravingSummary, "Engraving Summary");
		        //gl.VerifyElementVisible(Vype_ePod_Engravings.txtengraving, " Engraving Summary  ");

		 

		        String summary = gl.getText(Vype_ePod_Engravings.btnsummary);
		        gl.VerifyElementVisible(Vype_ePod_Engravings.btnsummary, " Engraving Summary  " + summary);
		         System.out.println("Font style is: " + summary);

		 

		        //Click on add engraving 
		        gl.clickbutton(Vype_ePodStarterKit.btnAddEngraving, "Add Engraving");

		 


		    }
		 
		 @When("^User selects epod rings with \"([^\"]*)\" design and click on add from Acccessories page$")
		    public void user_selects_epod_rings_with_design_and_click_on_add_from_Accessories_page(String ring) throws Throwable {

		 

		        

		        gl.fnScrollToView(Vype_CommonXpath.btnepodrings);
		        //Adding ring
		        gl.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );

		 

		        //Add to cart
		        gl.clickUsingJs(Vype_CommonXpath.btnaddrings, "Add to cart ");

		 


		    }
		 
		 @Then("^Click on engraving tile and verify engraving page is displayed$")
		    public void Click_on_engraving_tile_and_verify_engraving_page_is_displayed() throws Throwable {

		 

		        gl.fnScrollToView(Vype_CommonXpath.btnEngravedDeviceBuyNow);
		        // Click on engravaing
		        gl.clickbutton(Vype_CommonXpath.btnEngravedDeviceBuyNow, "Engraving");

		         gl.VerifyObjectDisplayed(Vype_CommonXpath.pgengravingdevice, "engravable page is opened");

		 

		         gl.VerifyElementVisible(Vype_ePod_Engravings.pgcore, "core collection ");

		 

		         gl.VerifyElementVisible(Vype_ePod_Engravings.pgpattern, "engravable page is opened");

		 

		         gl.VerifyElementVisible(Vype_ePod_Engravings.pgtext, "engravable page is opened");

		 

		         gl.VerifyElementVisible(Vype_ePod_Engravings.pgminiicon, "engravable page is opened");

		 

		         gl.VerifyElementVisible(Vype_ePod_Engravings.lnkepodeng, "ePod 2");

		 

		         gl.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");

		 


		    }
		 
		 @When("^User customize back by selecting TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\"$")
		    public void user_customize_back_by_selecting_TextDirection_FontStyle_Text(String TextDirection, String FontStyle, String Text) throws Throwable {
		        //Scroll to view navigated to step 2" Now customize back"
		        gl.fnScrollToView(Vype_ePodStarterKit.txtCustomizeBack);

		 

		        //Verify user is navigated to step 2" Now customize back"
		        gl.VerifyElementVisible(Vype_ePodStarterKit.txtCustomizeBack, "Costomize Back");

		 

		        //Click on text
		        gl.clickbutton(Vype_ePodStarterKit.btnText, "Text");

		 

		        //Select the text direction(Horizontal/Vertical)
		        gl.clickbutton(Vype_ePodStarterKit.btnHorizontal, TextDirection);

		 

		        //Enter the text
		        gl.inputText(Vype_CommonXpath.txtEnterText, "Enter upto 3 Characters", Text);

		 

		        //Select the font Style
		        gl.clickbutton(Vype_CommonXpath.btnFontStyle(FontStyle), "Font Style");

		 

		        //Click on AddText button
		        gl.clickbutton(Vype_CommonXpath.btnAddText, "Add Text");

		 

		    }

}