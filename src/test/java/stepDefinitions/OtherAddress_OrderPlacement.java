package stepDefinitions;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Registration;

public class OtherAddress_OrderPlacement extends BaseClass {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	@Then("^Click on Other Address and verify Address field is displayed below$")
	public void click_on_Other_Address_and_verify_Address_field_is_displayed_below() throws Throwable {
	    
		gl.clickbutton(Vype_CommonXpath.btnOtherResidential, "Other Residential");
		
		gl.VerifyElementVisible(Vype_Registration.txtAddress, "Address Field");
		
	}

	@Then("^Entering  valid Address \"([^\"]*)\"and click on submit and verify Almost There page is displayed$")
	public void entering_valid_Address_and_click_on_submit_and_verify_Almost_There_page_is_displayed(String Address) throws Throwable {
	
		//Enter Valid Address 
		gl.inputText(Vype_Registration.txtAddress, "Address text field", Address);
		
		gl.SelectByOption(Vype_Registration.txtAddress, "001-46005 Bole Ave");
		
		gl.fnScrollToView(Vype_CommonXpath.btnSubmit);
		
		gl.clickbutton(Vype_CommonXpath.btnSubmit, "Submit");
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtAlmostThere, "Almost there page");

		
	}

	
}