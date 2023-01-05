package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;


import cucumber.api.java.en.Then;


import goVype_Properties.Vype_CommonXpath;


public class OneTimePurchase_BusinessWorkflows {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);


@Then("^Verify product added is displayed in the page$")
public void verify_product_added_is_displayed_in_the_page() throws Throwable {
	
	
	//gl.fnScrollToView(Vype_CommonXpath.txtSeeDetails);

	//Click on any flavour See details link
	gl.clickLink(Vype_CommonXpath.btnAddproduct , "Passion fruit ");
	
function.addQuantityForOneTimePurchaseforePodPods();

}


    
}