package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_SubscriptionLanding;

public class DeliveryOptions{
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	







@Then("^Verify user should see Fedex Next Day delivery option$")
public void verify_user_should_see_Fedex_Next_Day_delivery_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	String str = gl.getText(Vype_CommonXpath.txtFedexNext);
	gl.VerifyObjectDisplayed(Vype_CommonXpath.txtFedexNext, str+ "is available ");
	
	
	
}

@Then("^User should see Kwik Save option\\(Same day delivery\\) in the Delivery page$")
public void user_should_see_Kwik_Save_option_Same_day_delivery_in_the_Delivery_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String str = gl.getText(Vype_CheckOut.txtSameDayDelivery);
	gl.VerifyObjectDisplayed(Vype_CheckOut.txtSameDayDelivery, "KwikSave_MonToFri_Before11:00AM_TC001 message"+str+ " in delivery page ");

}

@Then("^Verify Next day delivery and Same day delivery options are not available$")
public void verify_Next_day_delivery_and_same_day_delivery_options_are_not_available() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
    gl.verifyobjectisnotavailable(Vype_CommonXpath.txtSameDayDel, "Same Day Delivery");
	
	gl.verifyobjectisnotavailable(Vype_CommonXpath.txtNextDayDel, "Next Day Delivery");
}



}