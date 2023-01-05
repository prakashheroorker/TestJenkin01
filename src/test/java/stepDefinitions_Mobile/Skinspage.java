package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.CommonFunctions;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Desktop_Utility_Functions;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import goVype_Properties_mobile.*;

public class Skinspage {
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@When("^Hower on Shop and navigate to device and select device with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void hower_on_shop_and_navigate_to_device_and_select_device_with(String devicecolour, String skin,
			String flavour, String FlavourSection) throws Throwable {
	    
      function.navigateToePodDevice();
		
		rai.ScrollByxpath(Vype_CommonXpath.lnkepod);
		rai.clickUsingJs(Vype_CommonXpath.lnkepod, "epod2");


		// Adding Device color, Skin and flavor in to the cart
		function.selectDeviceColorforepod2Corecollections(devicecolour);
		
		
		Thread.sleep(2000);
		
		//gl.ScrollPageUp();
		//rai.ScrollByxpath(Vype_CommonXpath.lnkProducts);
		Thread.sleep(2000);
		// Navigate to skins
		function.navigateToePodSkinsPage();
		
		rai.ScrollByxpath(Vype_Skinspage.lnkepod);
		rai.clickUsingJs(Vype_Skinspage.lnkepod, "epod2");



		// Adding skin
		function.addskin(skin);

		// Navigate to epod vape pods page
		function.navigateToePodPods();

		// Adding flavor
		// function.addflavorincorecollections(flavour);
		function.addpods(flavour, FlavourSection);
	}

	@When("^navigate to Cart and Verify the items in Cart$")
	public void navigate_to_Cart_and_Verify_the_items_in_Cart() throws Throwable {
		function.hoverCartAndClickViewCart();
		
	}

	@Then("^Verify the price in cart$")
	public void verify_the_price_in_cart() throws Throwable {
		//function.hoverCartAndClickViewCart();
		//Verify the product is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		//verify one time purchase
		String OneTimePurchaseTotal=rai.getText(Vype_ePodStarterKit.wetxtPrice);
		float f = Float.parseFloat(OneTimePurchaseTotal.substring(1));
		rai.VerifyElementVisible(Vype_ePodStarterKit.wetxtPrice, ">>>>>>>>One time purchase value is: " + f + ">>>>>>>>>>>>");

	    
	}

	/*
	 * @When("^user Enters UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\" to submit order$"
	 * ) public void
	 * user_Enters_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName_to_submit_order
	 * (String arg1, String arg2, String arg3, String arg4) throws Throwable {
	 * 
	 * 
	 * }
	 */

	@When("^Verify order confirmation page$")
	public void verify_order_confirmation_page() throws Throwable {
		Thread.sleep(10000);
		function.verifyOrderConfirmationPage();
	    
	}
	
	@When("^Hower on Shop and click on Shop device skins$")
	public void hower_on_Shop_and_click_on_Shop_device_skins() throws Throwable {
	   Thread.sleep(2000);
	   
   function.ePodSkinsPage();
   
	}

	@Then("^Scroll to our Core collections and click on Buynow and select \"([^\"]*)\"$")
	public void scroll_to_our_Core_collections_and_click_on_Buynow_and_select(String Skin) throws Throwable {
		
		function.addskin(Skin);
		
	}
	
	@Then("^Verify device skin page$")
	public void verify_device_skin_page() throws Throwable {
	   
		rai.VerifyElementVisible(Vype_CommonXpath.txtCollectionX, "Collection X");

		// verify text Core Collection is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtCoreCollection, "Core Collection");

		// verify Mystique skin is displayed by default
		rai.VerifyElementVisible(Vype_CommonXpath.txtDefaultSkin, "Default skin Name");

		// verify Mystique skin image is displayed by default
		rai.VerifyElementVisible(Vype_Skinspage.imgDefaultSkin, "Default skin image");

		// verify choose your quantity is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourQuantity, "Choose your quantity");

		// verify buy now button is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.buynow, "Buy now");

	}
	
	@Then("^Verify All header links$")
	public void verify_All_header_links() throws Throwable {
	    
		List<WebElement> lst;
		String Headers = rai.getText(Vype_CommonXpath.lnkheaders);
		System.out.println("Header Links :" + Headers);

		lst = rai.findElementsList(Vype_CommonXpath.lnkheaders);
		for (int i = 0; i < lst.size(); i++) {
			String s = lst.get(i).getText();
			rai.VerifyElementVisible(Vype_CommonXpath.lnkheaders, "All Headers are:  " + s);
		}
		// Hower on Shop
		
		
		//rai.clickbutton(Vype_Skinspage.lnkDevices, "Starter Kit from the Epod section");

		
		rai.clickLink(Vype_CommonXpath.lnkShop, "Shop");
    
		rai.clickbutton(Vype_Skinspage.epod2vaping, "epod2 vaping products");
		//n
		rai.VerifyElementsVisible(Vype_Skinspage.productslist,"products");

		String str = rai.getText(Vype_Skinspage.productslist);
		System.out.println("---------Under Shop----------------------");

		System.out.println(str);
		// verify sublinks under shop
		rai.VerifyElementVisible(Vype_Skinspage.productslist, "Shop ");
		List<WebElement> lst1;

		lst1 = rai.findElementsList(Vype_Skinspage.productslist);
		for (int i = 0; i < lst1.size(); i++) {
			str = lst1.get(i).getText();
			rai.VerifyElementVisible(Vype_Skinspage.productslist, "Element under shop are:  " + str);
			
			rai.clickbutton(Vype_Skinspage.clickback,"click back");
			
			rai.clickbutton(Vype_Skinspage.clickback,"click back");
			
		}

		// Hower on Save
		
		rai.clickbutton(Vype_Skinspage.clicksave,"save button");
		
		rai.VerifyElementsVisible(Vype_Skinspage.savelist,"savelist");

		System.out.println("---------Under Save----------------------");
		String str1 = rai.getText(Vype_Skinspage.lnksaveall);

		System.out.println("Under save :" + str1);

		// Validate under save link
		List<WebElement> lst2;

		lst2 = rai.findElementsList(Vype_Skinspage.lnksaveall);
		for (int i = 0; i < lst2.size(); i++) {
			str1 = lst2.get(i).getText();
			rai.VerifyElementVisible(Vype_Skinspage.lnksaveall, "Element under save are:  " + str1);
			
			rai.clickbutton(Vype_Skinspage.clickback,"click back");
		}
		
		
		// Hower on About
		
		rai.clickbutton(Vype_Skinspage.clickabout,"Click on about button");
		
		rai.VerifyElementsVisible(Vype_Skinspage.aboutpage,"about page");

		System.out.println("---------Under About----------------------");
		String str2 = rai.getText(Vype_Skinspage.aboutpage);

		System.out.println("Under About " + str2);
		List<WebElement> lst3;
		lst3 = rai.findElementsList(Vype_Skinspage.aboutpage);
		for (int i = 0; i < lst3.size(); i++) {
			str2 = lst3.get(i).getText();
			rai.VerifyElementVisible(Vype_Skinspage.aboutpage, "Element under save are:  " + str2);
			
			rai.clickbutton(Vype_Skinspage.clickback,"click back");
		}

		// Hower on Help
		
		
		rai.clickbutton(Vype_Skinspage.clickhelp,"click on help button");
		
		rai.VerifyElementsVisible(Vype_Skinspage.verifyhelp, "verifying the help page");

		System.out.println("---------Under Help----------------------");
		String str3 = rai.getText(Vype_CommonXpath.helpall);

		System.out.println(str3);
		List<WebElement> lst4;
		lst4 = rai.findElementsList(Vype_CommonXpath.helpall);
		for (int i = 0; i < lst4.size(); i++) {
			str = lst4.get(i).getText();
			rai.VerifyElementVisible(Vype_CommonXpath.helpall, "Element under Help are:  " + str3);
			
			rai.clickbutton(Vype_Skinspage.clickback,"click back");
		}

		rai.clickLink(Vype_Skinspage.btnloginregister, "Pre Login Home");
	}
}

