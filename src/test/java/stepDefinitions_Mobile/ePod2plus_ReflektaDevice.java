package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_Epod_CoreCollection_Mobile;
import goVype_Properties_mobile.Vype_ePod2Plus_Reflekta;
import goVype_Properties_mobile.Vype_podcaps_Mobile;

public class ePod2plus_ReflektaDevice {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Click on the ePodtwoplus Reflekta Tile$")
	public void click_on_ePodtwoplus_Reflekta_Tile() throws Throwable {
	    
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		rai.clickbutton(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.PgReflektaDevice, "ePod2+ Reflekta Device Page");
		
		rai.VerifyElementVisible(Vype_CommonXpath.btnExit, "Exit");
		
		rai.clickbutton(Vype_CommonXpath.btnExit, "Exit");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		rai.clickbutton(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
	}

	@Then("^verify ePodtwoPlus Reflekta device page$")
	public void verify_ePodtwoplus_Reflekta_device_page() throws Throwable {
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.PgReflektaDevice, "VUSE REFLEKTA Heading");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtVapepods, "Verify text Vape Pods sold separately.");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtprice, "Device Price $19.99");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtbox, "What’s in the box?");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		//Products - 1x ePod 2+ Device and Cherry Red Charger
		String Details = rai.getText(Vype_ePod2Plus_Reflekta.txtproducts);
		
		System.out.println(Details);
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.imgDevice,"Reflekta Device Image");
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.Rightcarousel,"Right carousel");
		
		for(int i=0;i<4;i++)
		{
			rai.clickUsingJs(Vype_podcaps_Mobile.Rightcarousel,"Right carousel");
		}
		
		Thread.sleep(1000);
		
		for(int i=0;i<4;i++)
		{
			rai.clickUsingJs(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		}
		Thread.sleep(1000);
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.AddToCart, "Add to Cart");
		
	}

	@Then("^Click on Add To Cart button$")
	public void click_on_Add_to_Cart_button() throws Throwable {
		
		rai.clickbutton(Vype_podcaps_Mobile.AddToCart, "Add to Cart");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.addedtoCart,"Added to Cart Message highlighted in Green Color");
		
	   
	}
	@Then("^User clicks on the ePodtwoplus Reflekta tile$")
	public void user_clicks_on_ePodtwoplus_Reflekta_tile() throws Throwable {
	    
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		rai.clickbutton(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		
		
	}
	
	@Then("^Verify the product detail page of Reflecta with relevent content$")
	public void verify_the_product_detail_page_of_reflecta_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
        rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.PgReflektaDevice, "VUSE REFLEKTA Heading");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtVapepods, "Verify text Vape Pods sold separately.");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtprice, "Device Price $19.99");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtbox, "What’s in the box?");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		String Details = rai.getText(Vype_ePod2Plus_Reflekta.txtproducts);
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		System.out.println(Details);
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.imgDevice,"Reflekta Device Image");
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.AddToCart, "Add to Cart");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "Exit");
		
		
		
		
		
	}
	
	

	


	
	
	@When("^User click on Exit$")
	public void user_click_on_exit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.clickbutton(Vype_Epod_CoreCollection_Mobile.weexit, "Exit");
	}
	
	
	@Then("^Verify user navigated to ePod Devices page$")
	public void Verify_user_navigated_to_ePod_devices_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rai.VerifyElementVisible(Vype_CommonXpath.txtepoddevice, "ePod page  ");
		
		rai.ScrollByxpath(Vype_CommonXpath.txtepod2);
		
	
		
		
	}
	
	@When("^User clicks on ePodtwoplus Reflekta tile and verify product detail page of reflecta$")
	public void user_clicks_on_ePodtwoplus_Reflekta_tile_and_verify_product_detail_page_of_reflecta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
			
		rai.clickbutton(Vype_ePod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.PgReflektaDevice, "VUSE REFLEKTA Heading");
		
	}
	
	
	@Then("^Verify mini cart is updated and Added to cart is displayed$")
	public void verify_mini_cart_is_updated_and_added_to_cart_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String str;
		str = rai.getText(Vype_CommonXpath.txtnumber);
		rai.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
		 
		System.out.println("quantity in cart is:"+str);
		
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.addedtoCart,"Added to Cart Message highlighted in Green Color");
		
		
	}
	


}
