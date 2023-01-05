package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_SubscriptionLanding;

public class TaxBreakDown {
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	String Address="";

	@And("^user navigates to account page to get the address$")
	public void user_navigates_to_account_page() throws Throwable {

		
		Address = gl.getText(Vype_CommonXpath.txtProfileAddress);	    
	}

	@When("^user navigates to epod pods page and select flavor as flavorcolor \"([^\"]*)\" and flavorname \"([^\"]*)\" and add to cart$")
	public void user_navigates_to_epod_pods_page_and_select_flavor_and_add_to_cart(String Flavor,String FlavourText) throws Throwable {

		function.navigateToePodPods();
		//Add any catridge
		gl.fnScrollToView(Vype_CommonXpath.addpod(Flavor));

		gl.clickUsingJs(Vype_CommonXpath.addpod(Flavor), Flavor);

		gl.VerifyElementVisible(Vype_CommonXpath.btnaddflavor(Flavor), "Add");

		gl.clickUsingJs(Vype_CommonXpath.btnaddflavor(Flavor), "Add");
	}

	@When("^Calculate tax breakdown$")
	public void calculate_tax_breakdown() throws Throwable {

		Thread.sleep(5000);
		/*//Click on 'Check Out' button from the Cart Page.
		gl.clickUsingJs(Vype_Cart.btnCheckOut, "Cart Page - Check Out");
		Thread.sleep(5000);
		//Verify that Check Out Page is displayed
		gl.VerifyPageDisplayed(Vype_CheckOut.pgCheckOut, "Check Out");
		//Click on Home
		gl.clickElement(Vype_CommonXpath.weHomeAddress, "Home");
		gl.ScrollPageDown();
		gl.ScrollPageDown();
		//Click on 'Go to delivery' button
		gl.clickUsingJs(Vype_CheckOut.btnGoToDelivery,"Go to delivery");*/
		function.calulateTaxBreakdown(Address);	   
	}

	


//Updated
	
	@And("^Validate tax applied correct or not$")
    public void Validate_tax_applied_correct_or_not() throws Throwable {     
        function.calulateTaxBreakdown(Address);       
    }

	@And("^User hovers on Account icon and click on MY Account$")
    public void user_hovers_on_Account_icon_and_click_on_MY_Account() throws Throwable {
        function.navigateToMyAccountFromHome();
    }

 

    @Then("^Verify user belongs to which province$")
    public void verify_user_belongs_to_which_province() throws Throwable {

        //gl.clickUsingJs(Vype_SubscriptionLanding.txtProfile,"Profile ");
        Address = gl.getText(Vype_CommonXpath.txtProfileAddress);     
    }
    
    @Then("^User enters UserCardNumber \"([^\"]*)\", UserCardExpiryDate \"([^\"]*)\", UserCardCVV \"([^\"]*)\",UserCardFullName \"([^\"]*)\" to submit order$")
    public void user_enters_UserCardNumber_UserCardExpiryDate_UserCardCVV_UserCardFullName_to_submit_order(String UserCardNumber, String UserCardExpiryDate, String UserCardCVV, String UserCardFullName) throws Throwable {

 

        //Click on 'Go to Billing' buttonh
        gl.fnScrollToView(Vype_CheckOut.btnGoToBilling);
        gl.clickUsingJs(Vype_CheckOut.btnGoToBilling, "Go to billing");
        //Check if Card details are Not filled, Fill the card details
        Thread.sleep(3000);
        //gl.clickbutton(goVype_Properties.Vype_Common.popup, "Not Now");
        /*if(gl.isObjectPresent(Vype_CommonXpath.btnDropDownPayment, "DropDown Payment") == true) {

 

            gl.selectByText(Vype_CommonXpath.btnDropDownPayment, "+ Add new card");

 


            //gl.clickUsingJs(By.xpath("(//*[contains(text(),'Wait! B')])[1]/../../../following-sibling::div[1]"), "Not now");
            Thread.sleep(2000);

 

            // Enter the Card Number
            gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);

 


            gl.ScrollPageDown();

 

            // Enter the Card Expire Date
            gl.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

 

            // Enter the Card CVV 
            gl.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

 

            // Enter the Card Name
            gl.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);

 

        }*/

 

        //if(gl.isObjectPresent(Vype_CommonXpath.btnDropDownPayment, "DropDown Payment") == false) {



        boolean b=gl.verifyobjectisnotavailable(Vype_Common.popup);
        if(b==false)
        {
            gl.clickbutton(Vype_Common.popup, "Not now");
        }

 

        if(b==true)
        {

 

        }

 

            gl.inputText(Vype_CheckOut.txtCardNumber, "Enter the Card Number",UserCardNumber);

 

            // Enter the Card Expire Date 
            gl.inputText(Vype_CheckOut.txtCardExpiryDate,"Enter the Card Expiry Date", UserCardExpiryDate);

 

            // Enter the Card CVV 
            gl.inputText(Vype_CheckOut.txtCVV,"Enter the Card CVV", UserCardCVV);

 

            // Enter the Card Name
            gl.inputText(Vype_CheckOut.txtNameOnCard,"Enter the Card Name", UserCardFullName);
        //}

 

        //If check box Billing address is same as Shipping Address is not selected then select
        /*if(!gl.IsCheckboxSelected(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "check box Billing address is same as Shipping Address ")){

 

            //In some scenarios this check box will not be visible, so if it is visible we are selecting it.*/
            //if(gl.VerifyElementVisible(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "NO")){
                gl.selectCheckbox(Vype_CheckOut.chkboxBillingAddressSameAsShippingAddress, "check box Billing address is same as Shipping Address");
            //}

 

        //}
        //Click the 'I have read the Terms & Conditions' check box
        gl.clickbutton(Vype_CheckOut.weChkoxIhaveReadTandC, "I have read the Terms and conditions checkbox");
        //Click on "Submit Order" button 
        gl.ScrollPageDown();
        gl.clickbutton(Vype_CheckOut.btnSubmitOrder,"Submit Order");

 

    }


}
