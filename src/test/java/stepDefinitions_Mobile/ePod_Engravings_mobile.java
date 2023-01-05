package stepDefinitions_Mobile;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_ePod_Engravings;
import goVype_Properties_mobile.Vype_Cart;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_ePodStarterKit;
import goVype_Properties_mobile.Vype_ePod_Engravings_mobile;
import goVype_Properties_mobile.*;

public class ePod_Engravings_mobile {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	
	
	@Then("^Swipe to engraving and click on engraving$")
	public void swipe_to_engraving_and_click_on_engraving() throws Throwable {

		rai.ScrollByxpath(Vype_CommonXpath.txtengravingtile);

		// Click on Engraving tile
		rai.clickbutton(Vype_CommonXpath.txtengravingtile, "Engraving tile");

		rai.ScrollByxpath(Vype_CommonXpath.pgengraving);

		

	}
	
	@Then("^Verify the engravings page with the relevent content$")
	public void verify_the_engravings_page_with_the_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		// Verify the Engraving device page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgengraving, "Engraving Page");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgcore, "core collection ");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgpattern, "engravable page is opened");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgtext, "engravable page is opened");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgminiicon, "engravable page is opened");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkepodeng, "ePod 2");
		
		rai.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
		
	}
	
	
	
	@Then("^Select device colour \"([^\"]*)\" and click on pattern$")
	public void select_device_colour_and_click_on_pattern(String devicecolour) throws Throwable {


		// Click on the Graphite color button
		rai.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), devicecolour );

		rai.ScrollByxpath(Vype_CommonXpath.imgDevice);
		// Verify the graphite device image is displayed or not
		rai.VerifyElementsVisible(Vype_CommonXpath.imgDevice,"device image ");

		// Scroll till Pattern tile
		rai.ScrollByxpath(Vype_CommonXpath.btndevicecolour(devicecolour));

		// Click on Pattern tile
		rai.clickUsingJs(Vype_CommonXpath.txtPattern, "Pattern tile");

		// Verify the Pattern selection page is displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.pgPattern, "Pattern selection page");

	}
	
	
	
	@Then("^Verify the choose the pattern page$")
	public void verify_the_choose_the_pattern_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txtpatternchoose, " choose pattern you like  ");
		
		rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txtpatterns, " choose pattern you like patterns  ");
	}
	
	@And("^Select pattern \"([^\"]*)\" and click on Add pattern$")
	public void select_pattern_and_click_on_Add_pattern(String pattern) throws Throwable {


		//Select pattern
		rai.clickUsingJs(Vype_CommonXpath.btnHoya(pattern), "Device pattern name is: "+ pattern);
		String Pattern = rai.getText(Vype_CommonXpath.btnHoya(pattern));
		System.out.println("Device pattern is: "+Pattern);

		rai.clickUsingJs(Vype_CommonXpath.lnkpattern(pattern), pattern );


		//CLick on Add Pattern button
		rai.clickUsingJs(Vype_CommonXpath.btnAddPattern, "Add Pattern");

		//Verify the page Now customize the back displayed
		rai.VerifyElementsVisible(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

	}
	
	@Then("^Verify text tile is displayed$")
	public void verify_text_tile_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		 // Verify the page Now customize the back displayed
		 rai.VerifyElementsVisible(Vype_CommonXpath.txtCustomizeBack, "02 | Now Customize the Back");

	}

	@When("^User click on text  and verify add text to your device page$")
	public void user_click_on_text_and_verify_add_text_to_your_device_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		// Click on Text
		 rai.clickUsingJs(Vype_CommonXpath.btnText, "Text");
		 
		 
		 rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txttextto, "Add text to your device");
		 
		 rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txthori, " Horizontal  ");
		 
		 rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txtverti, " Vertical  ");
		 
		 rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txtchoosetext, " Enter your text  ");
		 
		 rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.txttextlist, " Text pattern lists");
		 
	}
	
	  @When("^User customize back by selecting TextDirection\"([^\"]*)\",FontStyle \"([^\"]*)\",Text\"([^\"]*)\"$")
	    public void user_customize_back_by_selecting_TextDirection_FontStyle_Text(String TextDirection, String FontStyle, String Text) throws Throwable {
	        //Scroll to view navigated to step 2" Now customize back"
	        rai.ScrollByxpath(Vype_ePodStarterKit.txtCustomizeBack);

	 

	        //Verify user is navigated to step 2" Now customize back"
	        rai.VerifyElementVisible(Vype_ePodStarterKit.txtCustomizeBack, "Costomize Back");

	 

	        //Click on text
	        rai.clickbutton(Vype_ePodStarterKit.btnText, "Text");

	 

	        //Select the text direction(Horizontal/Vertical)
	        rai.clickbutton(Vype_ePodStarterKit.btnHorizontal, TextDirection);

	 

	        //Enter the text
	        rai.inputText(Vype_CommonXpath.txtEnterText, "Enter upto 3 Characters", Text);

	 

	        //Select the font Style
	        rai.clickbutton(Vype_CommonXpath.btnFontStyle(FontStyle), "Font Style");

	 

	        //Click on AddText button
	        rai.clickbutton(Vype_CommonXpath.btnAddText, "Add Text");

	 

	    }
	  
	  @Then("^Verify Engraving summary page$")
		public void verify_Engraving_summary_page() throws Throwable {


			//Verify Engraving Summary page displayed
			rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "Engraving Summary");

			List<WebElement> list;
			//Verify the engraving summary
			list = rai.findElementsList(By.xpath("//h4[contains(text(),'Items')]//following-sibling::div//div//div//main"));
			String itemName ="";

			// List<String> item=new ArrayList<String>();
			for(int i=0;i<list.size();i++){
				itemName= list.get(i).getText();
				itemName = itemName.replaceAll("[\\n\\t ]", " ");
				System.out.println(itemName);

				rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "The image is shown with customizations added: "+itemName);
			}

	  }
			@And("^Click on add to cart and verify Cart page is displayed$")
			public void click_on_add_to_cart_and_verify_cart_page_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				rai.clickbutton(Vype_CommonXpath. btnAddToCART, "Add to cart");
				
				 //Verify the Cart page is displayed
			    rai.VerifyElementVisible(Vype_Cart.pgCart, "Cart page");
				
				
			}
			@Then("^User clicks on skins then verify Device Skins screen is displayed$")
			public void user_clicks_on_Skins_then_verify_Device_Skins_screen_is_displayed() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
//				boolean b=rai.verifyobjectisnotavailable(Vype_Common.popup);
//		        if(b==false)
//		        {
//		         //   rai.clickUsingJs(Vype_Common.popup, "Not now");
//		          rai.ClickUsingOCR("Not Now");
//		        }
//
//		        if(b==true)
//		        {
//
//		        }
		        
		        rai.ClickUsingOCR("Not Now");
				rai.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
				
				rai.VerifyElementVisible(Vype_CommonXpath.wetxtSkin, "Choose your skin page is opened ");
				
				
		        Thread.sleep(2000);
			}

			@Then("^scroll to Accessories and click on Accessories$")
			public void scroll_to_Accessories_and_click_on_Accessories() throws Throwable {
				//Scroll to Accessories
				rai.ScrollByxpath(Vype_CommonXpath.lnkAccesories);

				//Click on Accessories link
				rai.clickbutton(Vype_CommonXpath.lnkAccesories, "Click on all Acessories");

			}
			
			@When("^User click on add to cart under charging cable accessories$")
			public void user_click_on_add_to_cart_under_charging_cable_accessories() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			   rai.isEnabled(Vype_ePod_Engravings_mobile.lnkAccessoryadd,"charging cable add button");
				rai.clickbutton(Vype_ePod_Engravings_mobile.lnkAccessoryadd, "charging cable add button");
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkAccessoryaddED, " added to cart ");
				
			}
			
			
			
			
			@When("^Click on Direction \"([^\"]*)\" and enter the \"([^\"]*)\"$")
			public void click_on_direction_and_enter_the(String TextDirection, String Text) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			 
				// Select direction
				 rai.clickUsingJs(Vype_CommonXpath.btnVertical(TextDirection),
						 "Text direction selected is: " + TextDirection);
				 String Direction = rai.getText(Vype_CommonXpath.btnVertical(TextDirection));
				 System.out.println("Text direction is: " + Direction);
				 
				// Enter your text
				 rai.inputText(Vype_CommonXpath.txtEnterText, "Enter your text field", Text);
			}
			
			

			@When("^Select the Font style \"([^\"]*)\" and click on add text$")
			public void select_the_font_style_and_click_on_add_text(String FontStyle) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			  
				
				 // Select Font style
				 rai.clickUsingJs(Vype_CommonXpath.btnFontStyle(FontStyle), "Font style is: " + FontStyle);
				 String FontStyle1 = rai.getText(Vype_CommonXpath.btnFontStyle(FontStyle));
				 System.out.println("Font style is: " + FontStyle1);
				 
				 // Click on Add Text button
				 rai.clickbutton(Vype_CommonXpath.btnAddText, "Add Text");
			}
	
			
			
			
			@Then("^Verify user navigate to ePod Devices page$")
			public void Verify_user_navigate_to_ePod_devices_page() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				//rai.ClickUsingOCR("Not Now");
				
				
			
				boolean b=rai.verifyobjectisnotavailable(Vype_Common.popup);
		        if(b==false)
		        {
		            rai.clickUsingJs(Vype_Common.popup, "Not now");
		          //rai.ClickUsingOCR("Not Now");
		        }

		        if(b==true)
		        {

		        }
		        
		        rai.VerifyElementVisible(Vype_CommonXpath.txtepoddevice, "ePod page  ");
				
				rai.ScrollByxpath(Vype_CommonXpath.txtepod2);
				
			}	
			
			
			
			@When("^User click on ePod(\\d+) button and verify the relevent content$")
			public void user_click_on_ePod_button_and_verify_the_relevent_content(int arg1) throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
			 
				rai.clickUsingJs(Vype_ePod_Engravings_mobile.lnkepodeng, "ePod 2");
				
				Thread.sleep(3000);
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgcore, "core collection is opened");
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgpattern, "engravable page is opened");
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgtext, "engravable page is opened");
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.pgminiicon, "engravable page is opened");
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkepodeng, "ePod 2");
				
				rai.VerifyElementVisible(Vype_CommonXpath.txtepod2plus, "ePod 2+  ");
				
				
				
				
				
			}
			
			
			@When("^User click on add to cart under Podcaps accessories$")
			public void user_click_on_add_to_cart_under_podcaps_accessories() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				
				
				 rai.isEnabled(Vype_ePod_Engravings_mobile.lnkepodcaps,"podcaps add button");
				rai.clickbutton(Vype_ePod_Engravings_mobile.lnkepodcaps, "podcaps");
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkAccessoryaddED, " added to cart ");
				
			}
			
			
			@When("^User clicks on personalize your epod and clicks on engravings$")
			public void user_clicks_on_personalize_your_epod_and_clicks_on_engravings() throws Throwable {
			    // Write code here that turns the phrase above into concrete actions
				//click on Device, Pods & Accessories
				rai.clickbutton(Vype_Skinspage.txtpersonlizepod, "personalize your epod link from the main menu navigation");
				
				rai.clickbutton(Vype_ePod_Engravings_mobile.lnkengrave, "engrave your eod");
			}

			

			
			
			
			
			@Then("^Select device colour \"([^\"]*)\" and click on mini icon$")
			public void select_device_colour_and_click_on_mini_icon(String devicecolour) throws Throwable {
				rai.clickUsingJs(Vype_CommonXpath.btndevicecolour(devicecolour), devicecolour );

				rai.ScrollByxpath(Vype_CommonXpath.imgDevice);
				// Verify the graphite device image is displayed or not
				rai.VerifyElementsVisible(Vype_CommonXpath.imgDevice,"device image ");

				// Scroll till Pattern tile
				rai.ScrollByxpath(Vype_CommonXpath.btndevicecolour(devicecolour));

				// Click on mini icon tile
				rai.clickUsingJs(Vype_ePodStarterKit.BtnMiniIcon, "Mini Icon");
				
			}
			
			@Then("^user select device design style as Mini Icon to select \"([^\"]*)\"in mobile$")
			public void user_select_device_design_style_as_Mini_Icon_to_select_in_mobile(String miniicon) throws Throwable {
				Thread.sleep(2000);
				
				rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkmini, "Choose the mini icon you like");
		        
		        
		        rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkicons, "list of mini icon" );
		 

				rai.clickUsingJs(Vype_CommonXpath.btnminiicon(miniicon), miniicon);

				//However mouse to add mini icon.
				//rai.HowerMouse(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");

				//Click on Mini Icon
				rai.clickbutton(Vype_ePodStarterKit.btnAddMiniIcon, "Add Mini Icon");
			}
			
			
			@When("^User select the Design \"([^\"]*)\" and click on add$")
			 public void user_select_the_design_and_click_on_add(String ring) throws Throwable {
			     // Write code here that turns the phrase above into concrete actions
			     
				 rai.ScrollByxpath(Vype_CommonXpath.btnepodrings);
				 
				 rai.VerifyElementVisible(Vype_CommonXpath.btnepodrings, "epod rings" );
				 
				 rai.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );
				 
				 rai.isEnabled(Vype_ePod_Engravings_mobile.lnkaddring,"rings add button");
					rai.clickbutton(Vype_ePod_Engravings_mobile.lnkaddring, "rings");
					rai.VerifyElementVisible(Vype_ePod_Engravings_mobile.lnkAccessoryaddED, " added to cart ");
				 
				 
			 }		
			@Then("^Swipe to click on engraving tile$")
		    public void swipe_to_click_on_engraving_tile_and_verify_engraving_screen() throws Throwable {

		 

		        rai.ScrollByxpath(Vype_CommonXpath.txtengravingtile);

		 

		        // Click on Engraving tile
		        rai.clickbutton(Vype_CommonXpath.txtengravingtile, "Engraving tile");

		 

		    }
			
			@When("^Click on epodtwo rings select \"([^\"]*)\" design and click on add from Acccessories page$")
		    public void click_on_epodtwo_rings_with_select_design_and_click_on_add_from_Accessories_page(String ring) throws Throwable {

		 

		        

		        rai.ScrollByxpath(Vype_CommonXpath.btnepodrings);
		        //Adding ring
		        rai.clickUsingJs(Vype_CommonXpath.btnring(ring), ring );

		 

		        //Add to cart
		        rai.clickUsingJs(Vype_CommonXpath.btnaddrings, "Add to cart ");

		 


		    }
			
			@Then("^Swipe to click on pods tile and verify pods screen$")
		    public void swipe_to_click_on_pods_tile_and_verify_pods_screen() throws Throwable {

		       rai.clickbutton(Vype_CommonXpath.txtepod2, "ePod 2  ");

		 

		        rai.ScrollByxpath(Vype_CommonXpath.lnkpods);
		        rai.clickbutton(Vype_CommonXpath.lnkpods, "Click on pods");
		    }
			
			@Then("^Swipe to click on skins tile and verify skins screen$")
		    public void swipe_to_click_on_skins_tile_and_verify_skins_screen() throws Throwable {
		        rai.ClickUsingOCR("Not Now");
		        rai.ScrollByxpath(Vype_CommonXpath.lnkskins);

		 

		        rai.clickbutton(Vype_CommonXpath.lnkskins, "click on skins");
		        rai.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
		        Thread.sleep(2000);

		    }
			
			
			@When("^User selects device colour as \"([^\"]*)\"$")
			public void user_selects_device_colour_as(String color) throws Throwable {

			 

			//scroll to view the element
			        //(1);

			 

				rai.clickUsingJs(Vype_CommonXpath.btndevicecolour(color), color );
			        Thread.sleep(3000);

			 

			        //Verify the setp 1 of customization i.e. customize the front page displayed
			        rai.VerifyElementsVisible(Vype_CommonXpath.pgengravingdevice, "01 | Customize the Front");

			 

			    }
			
			@Then("^Verify Engraving summary and Add to cart$")
		    public void verify_Engraving_summary_and_Add_to_cart() throws Throwable {

		 


		        //Verify Engraving Summary page displayed
		        rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "Engraving Summary");

		 

		        List<WebElement> list;
		        //Verify the engraving summary
		        list = rai.findElementsList(By.xpath("//h4[contains(text(),'Items')]//following-sibling::div//div//div//main"));
		        String itemName ="";

		 

		        // List<String> item=new ArrayList<String>();
		        for(int i=0;i<list.size();i++){
		            itemName= list.get(i).getText();
		            itemName = itemName.replaceAll("[\\n\\t ]", " ");
		            System.out.println(itemName);

		 

		            rai.VerifyElementsVisible(Vype_CommonXpath.txtEngravingSummary, "The image is shown with customizations added: "+itemName);
		        }
		        
			}		
}