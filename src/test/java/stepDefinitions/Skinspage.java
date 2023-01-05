package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;

public class Skinspage {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
   
	
	@When("^Hover on shop and click on Shop device skins under the Personalize your ePod submenu$")
	public void hover_on_shop_and_click_on_Shop_device_skins_under_the_Personalize_your_ePod_submenu() throws Throwable {
		String Header = gl.getText(Vype_CommonXpath.txtHeader);
		Header = Header.replaceAll("[\\n\\t]", ",");
		System.out.println(Header);

		gl.VerifyElementVisible(Vype_CommonXpath.txtHeader, "Header with links and shopping cart: " + Header);

		// click on Vyse logo
		gl.isclickable(Vype_CommonXpath.btnVuseLogo, "Vuse Logo");

		// Verify cart icon
		gl.VerifyElementVisible(Vype_CommonXpath.lnkCartIcon, "Cart Icon");
		
	}
				
		@Then("^Verify Device Skins  page is displayed$")
		public void verify_Device_Skins_page_is_displayed() throws Throwable {		
		// Navigate to skins
		function.navigateToePodSkinsPage();
		gl.fnScrollToView(Vype_CommonXpath.lnkepod);
		Thread.sleep(2000);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
		gl.VerifyElementVisible(Vype_CommonXpath.lnkepod, "epod2");
		Thread.sleep(2000);
		}
		
		
		//CORE collection dropdown
		@Then("^Click on core collection dropdown then verify it is expanded$")
		public void click_on_core_collection_dropdown_then_verify_it_is_expanded() throws Throwable {
				gl.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

				gl.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
				
				gl.VerifyElementVisible(Vype_CommonXpath.pgCore, "expanded");
				Thread.sleep(1000);
				
				gl.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
				
		}
		//collectionX dropdown
		@Then("^click on collection x  dropdown then verify it is expanded$")
		public void click_on_collection_x_dropdown_then_verify_it_is_expanded() throws Throwable {
				
				gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
				
				gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
				Thread.sleep(1000);
				gl.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
		
		
		
		}
		
		@Then("^click on Epod (\\d+)  core collections then Verify the epod(\\d+) core collection skin options are displayed$")
		public void click_on_Epod_core_collections_then_Verify_the_epod_core_collection_skin_options_are_displayed(int arg1, int arg2) throws Throwable {
		gl.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
		Thread.sleep(2000);
        
		//CORE collection dropdown
		gl.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

		gl.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
		
		gl.VerifyElementVisible(Vype_CommonXpath.pgCore, "expanded");
		//Thread.sleep(1000); 
        Thread.sleep(10000);
		}
		
		
	//vidya.a- added verification for - epod2 core collection functionality
		@When("^User select any Core collection \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void User_select_any_core_collection_and_click_on_buy_now_and_verify_it_added_to_cart(String Skin) throws Throwable {
		// Add skin
		function.addskinepodtwo(Skin);
	}

		
		
	//vidya.a- added verification for - epod2 collectionX functionality
		
		@Then("^Click on Epod (\\d+) collections X then Verify the epod(\\d+) collection X skin options are displayed$")
		public void click_on_Epod_collections_X_then_Verify_the_epod_collection_X_skin_options_are_displayed(int arg1, int arg2) throws Throwable {
		
			gl.clickUsingJs(Vype_CommonXpath.lnkepod, "ePod 2");
			Thread.sleep(2000);
	        
			// collection X dropdown
			gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			
			gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			Thread.sleep(1000);
			gl.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
	
		}
			
			
			
		@When("^User select any collection X \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_collection_X_and_click_on_buy_now_and_verify_it_added_to_cart(String Skin) throws Throwable {
	
		
		//function.Addskin(Skin);
			function.Addskinepodtwocollx(Skin);
	}
	
	//vidya.a- added verification for - epod2+ core collection functionality
		
		@Then("^click on Epod(\\d+) plus core collections then Verify the epod(\\d+) plus core collection skin options are displayed$")
		public void click_on_Epod_plus_core_collections_then_Verify_the_epod_plus_core_collection_skin_options_are_displayed(int arg1, int arg2) throws Throwable {	
		
			//epod2+ CORE collection dropdown
			gl.VerifyElementVisible(Vype_CommonXpath.lnkCore, "Core Collection");

			gl.clickUsingJs(Vype_CommonXpath.lnkCore, "Core Collection");
			
			gl.VerifyElementVisible(Vype_CommonXpath.pgCore, "expanded");
			//Thread.sleep(1000); 
            Thread.sleep(10000);
           

		}
           
			
		@When("^User select any Epod(\\d+) pluscore collection \"([^\"]*)\" and click on buy now and verify it added to cart$")
		public void user_select_any_Epod_pluscore_collection_and_click_on_buy_now_and_verify_it_added_to_cart(int arg,String Skin) throws Throwable {
	
		
		function.addskinepodpluscore(Skin);
	}
	
	//vidya.a- added verification for - epod2+ collectionX functionality
		
		@Then("^Click on Epod(\\d+) plus collections X then Verify the epod(\\d+) plus collection X skin options are displayed$")
		public void click_on_Epod_plus_collections_X_then_Verify_the_epod_plus_collection_X_skin_options_are_displayed(int arg1, int arg2) throws Throwable {
		
			// collection X dropdown
			gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			
			gl.clickUsingJs(Vype_CommonXpath.lnkCollX, "Collection X");
			Thread.sleep(1000);
			gl.VerifyElementVisible(Vype_CommonXpath.lnkCollX, "Collection X");
			Thread.sleep(10000);
	
           
		}
		
		@When("^User select any Epod(\\d+) plus collection X \"([^\"]*)\" and click on buy now then verify it added to cart$")
		public void user_select_any_Epod_plus_collection_X_and_click_on_buy_now_then_verify_it_added_to_cart(int arg1, String Skin) throws Throwable {
		
			function.AddSkinepodpluscollx(Skin);
	}
	
	
	@Then("^Hower on shop and navigate to device and select device with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void hower_on_shop_and_navigate_to_device_and_select_device_with(String devicecolour, String skin,
			String flavour, String FlavourSection) throws Throwable {
		// Navigate to ePODdevives
		function.navigateToePodDevice();
		
		gl.fnScrollToView(Vype_CommonXpath.lnkepod);
		gl.clickUsingJs(Vype_CommonXpath.lnkepod, "epod2");


		// Adding Device color, Skin and flavor in to the cart
		function.selectDeviceColorforepod2Corecollections(devicecolour);
		Thread.sleep(2000);
		
		//gl.ScrollPageUp();
		gl.fnScrollToView(Vype_CommonXpath.lnkProducts);
		Thread.sleep(2000);
		// Navigate to skins
		function.navigateToePodSkinsPage();
		
		gl.fnScrollToView(Vype_CommonXpath.lnkepod);
		gl.clickUsingJs(Vype_CommonXpath.lnkepod, "epod2");



		// Adding skin
		function.addskinepodpluscore(skin);

		// Navigate to epod vape pods page
		function.navigateToePodPods();

		// Adding flavor
		// function.addflavorincorecollections(flavour);
		function.addpods(flavour, FlavourSection);
	}

	@Then("^verify device skin page$")
	public void verify_device_skin_page() throws Throwable {

		
		// Updated on 7july 2022
		// verify text Collection X is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtCollectionX, "Collection X");

		// verify text Core Collection is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtCoreCollection, "Core Collection");

		// verify Mystique skin is displayed by default
		gl.VerifyElementVisible(Vype_CommonXpath.txtDefaultSkin, "Default skin Name");

		// verify Mystique skin image is displayed by default
		gl.VerifyElementVisible(Vype_CommonXpath.imgDefaultSkin, "Default skin image");

		// verify choose your quantity is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtChooseyourQuantity, "Choose your quantity");

		// verify buy now button is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.buynow, "Buy now");

	}

	@Then("^Verify all header links$")
	public void verify_all_header_links() throws Throwable {

		List<WebElement> lst;
		String Headers = gl.getText(Vype_CommonXpath.lnkheaders);
		System.out.println("Header Links :" + Headers);

		lst = gl.findElementsList(Vype_CommonXpath.lnkheaders);
		for (int i = 0; i < lst.size(); i++) {
			String s = lst.get(i).getText();
			gl.VerifyElementPresent(Vype_CommonXpath.lnkheaders, "All Headers are:  " + s);
		}
		// Hower on Shop
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

		String str = gl.getText(Vype_CommonXpath.lnkepod2);
		System.out.println("---------Under Shop----------------------");

		System.out.println(str);
		// verify sublinks under shop
		gl.VerifyElementPresent(Vype_CommonXpath.lnkepod2, "Shop ");
		List<WebElement> lst1;

		lst1 = gl.findElementsList(Vype_CommonXpath.lnkepod2);
		for (int i = 0; i < lst1.size(); i++) {
			str = lst1.get(i).getText();
			gl.VerifyElementPresent(Vype_CommonXpath.lnkepod2, "Element under shop are:  " + str);
		}

		// Hower on Save
		gl.HowerMouse(Vype_CommonXpath.lnkSave, "Save link from the main menu navigation");

		System.out.println("---------Under Save----------------------");
		String str1 = gl.getText(Vype_CommonXpath.lnksaveall);

		System.out.println("Under save :" + str1);

		// Validate under save link
		List<WebElement> lst2;

		lst2 = gl.findElementsList(Vype_CommonXpath.lnksaveall);
		for (int i = 0; i < lst2.size(); i++) {
			str1 = lst2.get(i).getText();
			gl.VerifyElementPresent(Vype_CommonXpath.lnksaveall, "Element under save are:  " + str1);
		}
		// Hower on About
		gl.HowerMouse(Vype_CommonXpath.lnkAbout, "About link from the main menu navigation");

		System.out.println("---------Under About----------------------");
		String str2 = gl.getText(Vype_CommonXpath.Aboutall);

		System.out.println("Under About " + str2);
		List<WebElement> lst3;
		lst3 = gl.findElementsList(Vype_CommonXpath.Aboutall);
		for (int i = 0; i < lst3.size(); i++) {
			str2 = lst3.get(i).getText();
			gl.VerifyElementPresent(Vype_CommonXpath.Aboutall, "Element under save are:  " + str2);
		}

		// Hower on Help
		gl.HowerMouse(Vype_CommonXpath.lnkHelp, "Help link from the main menu navigation");

		System.out.println("---------Under Help----------------------");
		String str3 = gl.getText(Vype_CommonXpath.helpall);

		System.out.println(str3);
		List<WebElement> lst4;
		lst4 = gl.findElementsList(Vype_CommonXpath.helpall);
		for (int i = 0; i < lst4.size(); i++) {
			str = lst4.get(i).getText();
			gl.VerifyElementPresent(Vype_CommonXpath.helpall, "Element under Help are:  " + str3);
		}

		gl.clickLink(Vype_CommonXpath.btnLoginorRegister, "Pre Login Home");

	}

	@Then("^navigate to cart page and click on checkout and navigate to delivary page$")
	public void navigate_to_cart_page_and_click_on_checkout_and_navigate_to_delivary_page() throws Throwable {

		// Hower and view cart
		function.hoverCartAndClickViewCart();

		// Verify the prod=uct is added in cart page
		String products = gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart, products);

		// checkout and delivary page
		function.checkoutanddelivarypage();
	}
	@When("^Hower on shop and click on Shop ePodtwo skins$")
    public void hower_on_shop_and_click_on_Shop_ePodtwo_skins() throws Throwable {
        String Header = gl.getText(Vype_CommonXpath.txtHeader);
        Header = Header.replaceAll("[\\n\\t]", ",");
        System.out.println(Header);

        gl.VerifyElementVisible(Vype_CommonXpath.txtHeader, "Header with links and shopping cart: "+Header);

        //click on Vyse logo
        gl.isclickable(Vype_CommonXpath.btnVuseLogo, "Vuse Logo");

        //Verify cart icon
        gl.VerifyElementVisible(Vype_CommonXpath.lnkCartIcon, "Cart Icon");


        //Navigate to skins
        function.navigateToePodSkinsPage();
    }

	
	
	
}
