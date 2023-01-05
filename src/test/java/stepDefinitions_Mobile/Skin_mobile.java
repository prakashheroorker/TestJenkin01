package stepDefinitions_Mobile;



import com.rai.framework.CommonFunctions_Mobile;
//import com.rai.framework.RAI_Desktop_Utility_Functions;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import goVype_Properties_mobile.*;

public class Skin_mobile {
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	
	//vidya.a add validation for core and collection X expand functionality
	@When("^Hower on shop and click on Shop device skins under the Personalize your ePod submenu$")
	public void hower_on_Shop_and_click_on_Shop_device_skin() throws Throwable {
	   Thread.sleep(2000);
	   
	   // Clicking on Menu and navigate to Shop
       rai.clickUsingJs(Vype_Skin_mobile.btnMenu, "Menu ");

       rai.ClickUsingOCR("Shop");

		rai.clickbutton(Vype_Skinspage.txtpersonlizepod, "Shop link from the main menu navigation");

		rai.clickbutton(Vype_Skinspage.deviceshop, "shop skin device");
		Thread.sleep(5000);
	}
		
		@Then("^Verify device skins  page is displayed$")
		public void verify_device_skins_page_is_displayed() throws Throwable {
			
		rai.ScrollByxpath(Vype_Skinspage.lnkepod);
		Thread.sleep(5000);
		rai.VerifyElementVisible(Vype_Skinspage.lnkepod, "epod2");
		rai.VerifyElementVisible(Vype_Skin_mobile.lnkCollX, "Collection X");
		rai.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");
		Thread.sleep(15000);
		}
		
		
		//CORE collection dropdown
		@Then("^Click on Core collection dropdown then verify it is expanded$")
		public void click_on_Core_collection_dropdown_then_verify_it_is_expanded() throws Throwable {
				rai.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

				rai.clickUsingJs(Vype_Skin_mobile.lnkCore, "Core Collection");
				
				rai.VerifyElementVisible(Vype_Skin_mobile.pgCore, "expanded");
				Thread.sleep(1000);
				
				rai.clickUsingJs(Vype_Skin_mobile.lnkCore, "Core Collection");
				
		}
		
				
				//collectionX dropdown
		@Then("^Click on Collection x  dropdown then verify it is expanded$")
		public void click_on_Collection_x_dropdown_then_verify_it_is_expanded() throws Throwable {
				
				rai.clickUsingJs(Vype_Skin_mobile.lnkCollX, "Collection X");
				
				rai.clickUsingJs(Vype_Skin_mobile.lnkCollX, "Collection X");
				Thread.sleep(1000);
				rai.VerifyElementVisible(Vype_Skin_mobile.lnkCollX, "Collection X");
		
		
		
		}
//vidya.a add validation for epod2 core collection
		
		@Then("^Click on Epod(\\d+) core collections then Verify the epod(\\d+) core collection skin options are displayed$")
		public void click_on_Epod_core_collections_then_Verify_the_epod_core_collection_skin_options_are_displayed(int arg1, int arg2) throws Throwable {	
			Thread.sleep(15000);
			rai.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
			Thread.sleep(2000);
	        
			//CORE collection dropdown
			rai.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

			rai.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
			
			rai.VerifyElementVisible(Vype_CommonXpath.pgCore, "expanded");
			//Thread.sleep(1000); 
            Thread.sleep(10000);
           
			
		}	
		@When("^User select any core collection \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_core_collection_and_click_on_buy_now_and_verify_it_added_to_cart(String Skin) throws Throwable {
		// Add skin
		function.add_skin(Skin);
	
}
	
	//vidya.a add validation for epod2 collection X
		@Then("^Click on Epod(\\d+) Collections X then Verify the epod(\\d+) Collection X skin options are displayed$")
		public void click_on_Epod_Collections_X_then_Verify_the_epod_Collection_X_skin_options_are_displayed(int arg1, int arg2) throws Throwable {
		
			rai.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
			Thread.sleep(2000);
	        
			// collection X dropdown
			rai.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			
			rai.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			Thread.sleep(1000);
			rai.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
	
		}	
			
		@When("^User select any Collection X \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_Collection_X_and_click_on_buy_now_and_verify_it_added_to_cart(String Skin) throws Throwable {
		// Add skin
		function.Addskin(Skin);
	}
	
	//vidya.a add validation for epod2+ core collection
		
		@Then("^Click on Epod(\\d+) plus Core collections then Verify the epod(\\d+) plus Core collection skin options are displayed$")
		public void click_on_Epod_plus_Core_collections_then_Verify_the_epod_plus_Core_collection_skin_options_are_displayed(int arg1, int arg2) throws Throwable {
			//epod2+ CORE collection dropdown
			rai.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

			rai.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
			
			rai.VerifyElementVisible(Vype_CommonXpath.pgCore, "expanded");
			//Thread.sleep(1000); 
            Thread.sleep(10000);
		}
		
		@When("^User select any Epod(\\d+) pluscore Collection \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_Epod_pluscore_Collection_and_click_on_buy_now_and_verify_it_added_to_cart(int arg,String Skin) throws Throwable {
		// Add skin
		function.add_skin(Skin);
	}
	//vidya.a add validation for epod2+ collection X
		
		@Then("^Click on Epod(\\d+) plus Collections X then Verify the epod(\\d+) plus Collection X skin options are displayed$")
		public void click_on_Epod_plus_Collections_X_then_Verify_the_epod_plus_Collection_X_skin_options_are_displayed(int arg1, int arg2) throws Throwable {	
		
			// collection X dropdown
			rai.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			
			rai.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			Thread.sleep(1000);
			rai.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
		}	
			
		@When("^User select any Epod(\\d+) plus Collection X \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_Epod_plus_Collection_X_and_click_on_buy_now_and_verify_it_added_to_cart(int arg,String Skin) throws Throwable {
		// Add skin
		function.AddSkin(Skin);
	}
	
	

	//vidya.a added logout functionality and verified
	@Then("^User clicks on hamberger menu and verify logout button displayed$")
    public void user_clicks_on_hamberger_menu_and_verify_logout_button_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions



       rai.ScrolltoTopofthepage();
       Thread.sleep(2000);
        
        
        // Clicking on Menu and navigate to Shop
        rai.clickUsingJs(Vype_CommonXpath.btnmenu, "Menu ");
        
        rai.VerifyElementsVisible(Vype_Skin_mobile.btnlogout, "Logout button");
           Thread.sleep(2000);


   
    }
	
	//vidya.a added logout validation
	@Then("^Click on log out button and verify the prelogin page is displayed$")
    public void click_on_log_out_button_and_verify_the_prelogin_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions



       rai.clickUsingJs(Vype_Skin_mobile.btnlogout, "Logout button");
        
       Thread.sleep(2000);
    
    }
	
	
	
}	
	
	
	
	
	
	
	
	