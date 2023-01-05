package stepDefinitions;

import com.rai.framework.CommonFunctions;

import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;


public class ElectricStripeCollection {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	@When("^Hover on shop and click on All Epod Devices$")
	public void hover_on_shop_and_click_on_All_Epod_Devices() throws Throwable {
		Thread.sleep(4000);
		// Hover the mouse on Products link
		gl.HowerMouse(Vype_CommonXpath.lnkShop, "Shop link from the main menu navigation");

		Thread.sleep(3000);
        gl.clickUsingJs(Vype_CommonXpath.lnkAllepodDevices, "lnkAllepodDevices");
	}

	@When("^Click on Epodtwo and verify the page is displayed$")
	public void click_on_Epod_and_verify_the_page_is_displayed() throws Throwable {
	    
		
		gl.clickUsingJs(Vype_CommonXpath.lnkepod2, "lnkepod2");
		
		
	}

	@When("^Click on Electric Shop collection and select \"([^\"]*)\"$")
	public void click_on_Electric_Shop_collection_and_select(String Strip) throws Throwable {
	    
		gl.clickbutton(Vype_CommonXpath.ElectricStrip, "ElectricStrip");
		Thread.sleep(2000);
		
		gl.VerifyElementVisible(Vype_CommonXpath.BoltGreyStripe, "Bolt Grey Stripe");
		gl.VerifyElementVisible(Vype_CommonXpath.CharcoakxStripe, "Charcoak-x Stripe");
		gl.VerifyElementVisible(Vype_CommonXpath.GalacticBlueStripe, "Galactic Blue Stripe");
		//gl.VerifyElementVisible(Vype_CommonXpath.ElectricStripPge, "ElectricStrip Page");
		
		gl.clickbutton(Vype_CommonXpath.Strip(Strip), "ElectricStrip Strip");
		Thread.sleep(15000);
		
		gl.VerifyElementVisible(Vype_CommonXpath.StripPage, "Strip Page");
		
		gl.VerifyElementVisible(Vype_CommonXpath.AddtoCart, "AddtoCart");
		
		gl.VerifyElementVisible(Vype_CommonXpath.widget, "Widget");
		
		gl.clickbutton(Vype_CommonXpath.AddtoCart, "AddtoCart");
	}
}
