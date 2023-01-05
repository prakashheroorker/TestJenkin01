package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;

import com.rai.framework.RAI_Mobile_Utility_Functions;

import goVype_Properties_mobile.*;

import cucumber.api.java.en.*;


public class NewDimensionCollection {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);

	@And("^Click on New Dimension collection$")
	public void click_on_New_Dimension_collection() throws Throwable {

		rai.clickbutton(Vype_NewDimensionCollection.NewDimension, "NewDimension");
		Thread.sleep(2000);

		

		

	}
	
	@Then("^Verify New Dimension Collection page is displayed with relevant content$")
	public void verify_New_dimension_Collection_page_is_displayed_with_relevant_content() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Verify the "Choose your colour" page is displayed
		rai.VerifyElementVisible(Vype_CommonXpath.txtChooseyourClr, "Choose your Color");

		String devicecolor = rai.getText(Vype_NewDimensionCollection.weepoddevice);
		rai.VerifyElementVisible(Vype_NewDimensionCollection.weepoddevice, "New dimension devices are"+ devicecolor);
		System.out.println("New dimension devices are:" + devicecolor);
		
		
		 //exit button
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "devices");
    	
        //next button
      //  rai.ScrollByxpath(Vype_Epod_CoreCollection_Mobile_Mobile.wenext);
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.wenext, "devices");
        

	}

	@When("^User select on any of the \"([^\"]*)\" and verify the product detail page$")
	public void user_Select_on_any_of_the_and_verify_the_product_detail_page(String Device) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_NewDimensionCollection.SelectDevice(Device), "New Dimension Strip");
		Thread.sleep(5000);
		
		rai.VerifyElementVisible(Vype_NewDimensionCollection.NewDimensionPge, "New Dimension Page");
		
		String Details = rai.getText(Vype_ePod2Plus_Reflekta.txtproducts);
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtproducts, "1x ePod 2+ Device and Cherry Red Charger");
		System.out.println(Details);
		
        rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.txtChooseyour, "title");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.txtprice, "Device Price $19.99");
		
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.Leftcarousel,"Left carousel");
		
		rai.VerifyElementVisible(Vype_ePod2Plus_Reflekta.imgDevice,"Reflekta Device Image");
		
		rai.VerifyElementVisible(Vype_podcaps_Mobile.AddToCart, "Add to Cart");
		
		rai.VerifyElementVisible(Vype_Epod_CoreCollection_Mobile.weexit, "Exit");
		
		
	}
	
	@When("^User select on any of the \"([^\"]*)\" and verify the page$")
	public void user_Select_on_any_of_the_and_verify_thepage(String Device) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		rai.clickbutton(Vype_NewDimensionCollection.SelectDevice(Device), "New Dimension Strip");
		Thread.sleep(5000);
		
		rai.VerifyElementVisible(Vype_NewDimensionCollection.NewDimensionPge, "New Dimension Page");

	
}
	
	
}