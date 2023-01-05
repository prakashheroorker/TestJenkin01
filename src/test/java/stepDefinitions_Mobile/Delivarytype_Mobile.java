package stepDefinitions_Mobile;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CommonXpath;
import goVype_Properties_mobile.Vype_CheckOut;
import goVype_Properties_mobile.*;




public class Delivarytype_Mobile extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	String couponCodeTxt =""; 
	int cnt=0; 
	boolean couponHit = false;


	

	
	
	@Then("^Verify user should see Fedex Next day delivery option$")
	public void verify_user_should_see_Fedex_Next_Day_delivery_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		String str = rai.getText(Vype_CommonXpath.txtFedexNext);
		rai.VerifyElementsVisible(Vype_CommonXpath.txtFedexNext, str+ "is available ");
		
		
		
	}

	@Then("^User should see Kwik Save option\\(Same day delivery\\) in the delivery page$")
	public void user_should_see_Kwik_Save_option_Same_day_delivery_in_the_delivery_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String str = rai.getText(Vype_CheckOut.txtSameDayDelivery);
		rai.VerifyElementsVisible(Vype_CheckOut.txtSameDayDelivery, "KwikSave_MonToFri_Before11:00AM_TC001 message"+str+ " in delivery page ");

	}


	@Then("^Verify Next day delivery and Same Day delivery options are not available$")
	public void verify_Next_day_delivery_and_same_day_delivery_options_are_not_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    rai.verifyobjectisnotavailable(Vype_CommonXpath.txtSameDayDelivery, "Same Day Delivery");
		
		rai.verifyobjectisnotavailable(Vype_CommonXpath.txtNextDayDel, "Next Day Delivery");
	}
	
	
	
	

}
	
	
	









