package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_NewDimensionCollection;
import goVype_Properties.Vype_ePod_CoreCollection;
import goVype_Properties.Vype_epod2Plus_Reflekta;
import goVype_Properties.Vype_podcaps;

public class NewDimensionCollection {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	//Harris--Updated Xpath NewDimensionPge
	@And("^Click on New Dimension Collection$")
	public void click_on_New_Dimension_Collection() throws Throwable {

		gl.clickbutton(Vype_NewDimensionCollection.NewDimension, "NewDimension");
		Thread.sleep(2000);

		

		

	}
	
	@Then("^Verify New dimension Collection page is displayed with relevant content$")
	public void verify_New_dimension_Collection_page_is_displayed_with_relevant_content() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Verify the "Choose your colour" page is displayed
		gl.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");
		
		

		String devicecolor = gl.getText(Vype_NewDimensionCollection.weepoddevice);
		gl.VerifyElementVisible(Vype_NewDimensionCollection.weepoddevice, "New dimension devices are"+ devicecolor);
		System.out.println("New dimension devices are:" + devicecolor);
		
		
		
		 //exit button
        // gl.VerifyElementVisible(Vype_ePod_CoreCollection.weexit, "devices");
     	gl.VerifyElementVisible(Vype_CommonXpath.btnExit, "Exit");
         //next button
         //gl.VerifyElementVisible(Vype_ePod_CoreCollection.wenext, "devices");
         gl.VerifyElementVisible(Vype_CommonXpath.btnnext, "Next");

	}

	@When("^User Select on any of the \"([^\"]*)\" and verify the product detail page$")
	public void user_Select_on_any_of_the_and_verify_the_product_detail_page(String Device) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		gl.clickbutton(Vype_NewDimensionCollection.SelectDevice(Device), "New Dimension Strip");
		Thread.sleep(5000);
		
		gl.VerifyElementPresent(Vype_NewDimensionCollection.NewDimensionPge, "New Dimension Page");
		
		gl.VerifyElementVisible(Vype_epod2Plus_Reflekta.txtChooseyour, "title");
		
		gl.VerifyElementPresent(Vype_epod2Plus_Reflekta.txtprice, "Device Price $16.99");
		
		gl.VerifyElementVisible(Vype_epod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		String Details = gl.getText(Vype_epod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		
		System.out.println(Details);
		
		gl.VerifyObjectDisplayed(Vype_epod2Plus_Reflekta.imgDevice,"New dimension Device Image");
		
		gl.VerifyElementPresent(Vype_podcaps.AddToCart, "Add to Cart");
		
	}

	
	
	
	
}