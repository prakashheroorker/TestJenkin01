package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_epod2Plus_Reflekta;
import goVype_Properties.Vype_podcaps;

public class epod2Plus_ReflektaDevice {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	

	@Then("^Click on Add to Cart button$")
	public void click_on_Add_to_Cart_button() throws Throwable {
		
		gl.clickbutton(Vype_podcaps.AddToCart, "Add to Cart");
		
		gl.VerifyObjectDisplayed(Vype_epod2Plus_Reflekta.addedtoCart,"Added to Cart Message highlighted in Green Color");
		
	   
	}
	
	
	
	@When("^User clicks on ePodtwoplus Reflekta Tile$")
	public void user_clicks_on_ePodtwoplus_Reflekta_Tile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
       gl.VerifyElementVisible(Vype_epod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		gl.clickbutton(Vype_epod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
	}

	@Then("^Verify the product detail page of reflecta with relevent content$")
	public void verify_the_product_detail_page_of_reflecta_with_relevent_content() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
        gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.PgReflektaDevice, "VUSE REFLEKTA Heading");
		
		gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.txtVapepods, "Verify text Vape Pods sold separately.");
		
		gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.txtprice, "Device Price $19.99");
		
		gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.txtbox, "What’s in the box?");
		
		gl.VerifyElementVisible(Vype_epod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		String Details = gl.getText(Vype_epod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		System.out.println(Details);
		
       gl.VerifyObjectDisplayed(Vype_podcaps.Leftcarousel,"Left carousel");
		
		gl.VerifyObjectDisplayed(Vype_epod2Plus_Reflekta.imgDevice,"Reflekta Device Image");
		
		gl.VerifyElementPresent(Vype_podcaps.AddToCart, "Add to Cart");
		
       gl.VerifyPageDisplayed(Vype_CommonXpath.btnExit, "Exit");
		
		
		
		
		
	}
	
	

	@When("^User click on exit$")
	public void user_click_on_exit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		gl.clickbutton(Vype_CommonXpath.btnExit, "Exit");
	}

	
	
	@When("^User clicks on ePodtwoplus Reflekta Tile and verify product detail page of reflecta$")
	public void user_clicks_on_ePodtwoplus_Reflekta_Tile_and_verify_product_detail_page_of_reflecta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 gl.VerifyElementVisible(Vype_epod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
			
		gl.clickbutton(Vype_epod2Plus_Reflekta.ReflektaTile, "ePod2+ Reflekta Tile");
		
		gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.PgReflektaDevice, "VUSE REFLEKTA Heading");
		
	}
	
	

	@Then("^Verify mini cart is updated and added to cart is displayed$")
	public void verify_mini_cart_is_updated_and_added_to_cart_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String str;
		str = gl.getText(Vype_CommonXpath.txtnumber);
		gl.VerifyElementVisible(Vype_CommonXpath.txtnumber, "Cart is updated with " + str + " number ");
		 
		System.out.println("quantity in cart is:"+str);
		
		
		gl.VerifyObjectDisplayed(Vype_epod2Plus_Reflekta.addedtoCart,"Added to Cart Message highlighted in Green Color");
		
		
	}

}
