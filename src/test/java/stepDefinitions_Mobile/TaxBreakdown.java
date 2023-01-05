package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;
import cucumber.api.java.en.*;
import goVype_Properties_mobile.*;

public class TaxBreakdown {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	public  String Address;
	@Then("^user clicks on hamberger menu and clicks on My Account and verifies province$")
	public void user_clicks_on_hamberger_menu_and_clicks_on_My_Account_and_verifies_province() throws Throwable {
	   
		//Navigate to my account
		function.navigateToMyAccountFromHome();
		
		//get address
		Address = rai.getText(Vype_CommonXpath.txtProfileAddress);
	}
	
	
	
	@Then("^click on go to billing and calculate tax break down$")
	public void click_on_go_to_billing_and_calculate_tax_break_down() throws Throwable {
	    
		//Click on 'Go to Billing' button
		rai.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");

		//click on order summary
		rai.clickUsingJs(Vype_CommonXpath.btnsummary, "summary");
		//scroll to one time purchase
		rai.ScrollByxpath(Vype_CommonXpath.txtonetimepurchase);
		//calculate tax
		function.calulateTaxBreakdown(Address);

	}

	

}
