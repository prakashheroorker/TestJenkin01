/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.GenericLib;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;

import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_OrderConfirmation;
import goVype_Properties.Vype_PlatinumProfileTrigger;
import goVype_Properties.Vype_Rewards;
import goVype_Properties.Vype_SilverProfileTrigger;
import goVype_Properties.Vype_StatusOfBenefits;
import goVype_Properties.Vype_ePodWorkflows;

public class BatCanadaAnniversaryBoxset{
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@Then("^Hower on shop and navigate to device and select boxset$")
	public void hower_on_shop_and_navigate_to_device_and_select_boxset() throws Throwable 
	{// Navigate to ePODdevives
		function.navigateToePodDevice();

		//Adding Device to the cart
		function.selectDeviceinAnniversaryBoxset();
	
	}
	@And("^add skin and charging cabel to cart \"([^\"]*)\"$")
	public void add_skin_and_charging_cabel_to_cart(String skinindex) throws Throwable {
		//add Skin to the cart
		function.addSkinCorecollections(skinindex);
	}

	@And("^add charging case to cart$")
	public void add_charging_case_to_cart() throws Throwable {
		//add charing case to the cart
		function.addchargingcase();
	}

	@And("^add flavor in epod to cart \"([^\"]*)\"$")
	public void add_flavor_in_epod_to_cart(String Flavour) throws Throwable {
	   	function.addflavorincorecollections(Flavour);
	}
	}
*/
