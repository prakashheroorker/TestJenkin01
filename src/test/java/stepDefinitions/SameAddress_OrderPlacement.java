package stepDefinitions;

import org.openqa.selenium.WebElement;


import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_Registration;

public class SameAddress_OrderPlacement extends BaseClass {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	
	@When("^User Clicks on Get your Kit and Verify Create Account Pop-Up page is displayed$")
	public void user_Clicks_on_Get_your_Kit_and_Verify_Create_Account_Pop_Up_page_is_displayed() throws Throwable {
		
		gl.fnScrollToView(Vype_CommonXpath.btnGetYourKit);
		
		gl.clickbutton(Vype_CommonXpath.btnGetYourKit, "Get Your Kit");
		
		gl.VerifyElementVisible(Vype_CommonXpath.pgCreateAccount, "Create Account Pop-Up");
	    
	}

	@When("^User Create Account with valid email address \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_Create_Account_with_valid_email_address_and_password(String UN, String pwd) throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtUsername, "Password textfield on Login Modal");

	    // Verify Next button in login model
		gl.VerifyElementVisible(Vype_CommonXpath.btnNext, "Next button ");

		// Enter User name in the user name text field
		gl.inputText(Vype_CommonXpath.txtUsername, "Username textfield on Login Modal", UN);

		// Enter Password in the password text field
		gl.inputPasswordEncrypted(Vype_CommonXpath.txtPassword, "Password textfield on Login Modal", pwd);
		
		// Click on Login button
		gl.clickbutton(Vype_CommonXpath.btnNext, "Next button");


	}

	@Then("^checking the conditions and click on Register and verify order place Pop-Up is displayed$")
	public void checking_the_conditions_and_click_on_Register_and_verify_order_place_Pop_Up_is_displayed() throws Throwable {
		gl.ScrollPageDown();

		//Check I acknowledge that i read and understood Terms and Condition check box
		gl.clickUsingJs(Vype_Registration.chkBoxIAcknowledgeThatIRead,"I acknowledge that i read and understood Terms and Condition check box");
		
		//Check the Yes I want to receive information check box
		gl.clickbutton(Vype_Registration.chkBoxYesIWantToReceiveInformation,"Yes I want to receive information check box");
		Thread.sleep(5000);	
		// Clicking register
		gl.fnScrollToView(Vype_Registration.btnRegister);
		// Verifying the register
		gl.VerifyElementVisible(Vype_Registration.btnRegister, "Registration button");
		// Clicking register
		gl.clickbutton(Vype_Registration.btnRegister, "Registration button");

		//Place Order page
		gl.VerifyElementVisible(Vype_CommonXpath.pgOrder, "Place Order Pop-Up");

	}

	@Then("^Click on choose a pod Dropdown and selects Flavour \"([^\"]*)\" in ePod Pod pack section$")
	public void click_on_choose_a_pod_Dropdown_and_selects_Flavour_in_ePod_Pod_pack_section(String flavor) throws Throwable {
	   
		gl.waitTillElementVisible(Vype_CommonXpath.btnChoosePod);
		
		gl.clickUsingJs(Vype_CommonXpath.btnChoosePod, "Choose a Pod");
		
		gl.waitTillElementVisible(Vype_CommonXpath.lnkFlavor(flavor));
		
		gl.clickUsingJs(Vype_CommonXpath.lnkFlavor(flavor), "flavor");
		
		
	}

	@Then("^Click on Choose a Nicotine Strength Dropdown\"([^\"]*)\"and selects Strength in ePod Pod section$")
	public void click_on_Choose_a_Nicotine_Strength_Dropdown_and_selects_Strength_in_ePod_Pod_section(String strength) throws Throwable {		
		gl.waitTillElementVisible(Vype_CommonXpath.btnNicStrength);
		
		gl.clickbutton(Vype_CommonXpath.btnNicStrength, "Choose a Nicotine Strength");
		Thread.sleep(5000);
		try {
			
			WebElement e1 = rdriver.findElement(Vype_CommonXpath.btnStrength);
			for(int i=0;i>=5;)
     		{
			String s=e1.getText();
			//System.out.println(s +"=Strength");
			if(!s.equals(strength))
 			{
 				i++;
 				
 			}
 			if(s.equals(strength))
 			{
 				Thread.sleep(2000);
				e1.click();
 				//System.out.println("Strength =" +e1.getText());
 				break;
 			}
				
     		}
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		
	/*	WebElement drop = driver.findElement(Vype_CommonXpath.btnStrength);
        Select dropdown = new Select(drop);
        dropdown.selectByVisibleText("1.6%");
		*/
		
		
	/*	gl.waitTillElementVisible(Vype_CommonXpath.btnStrength);
		String s = "Strength 1.6%";
		gl.selectByValue(Vype_CommonXpath.btnStrength,s,"1.6 %");

		*/
		//gl.selectByValue(Vype_CommonXpath.btnStrength,"1.6%");
	/*	
		WebElement input = driver.findElement(Vype_CommonXpath.btnNicStrength);
		
		for (int i =0;i<=1;i++) {
			input.sendKeys(Keys.DOWN);
		}
		input.sendKeys(Keys.DOWN, Keys.ENTER);
		
		
		WebElement drop = driver.findElement(Vype_CommonXpath.btnNicStrength);
        Select dropdown = new Select(drop);
        dropdown.selectByIndex(1);
		*/
	}

	@Then("^Verify Same as residentail address is selected and Click on Submit$")
	public void verify_Same_as_residentail_address_is_selected_and_Click_on_Submit() throws Throwable {
		
		gl.VerifyElementVisible(Vype_CommonXpath.btnSameResidential, "Same as Residentails Address");
		
		gl.clickbutton(Vype_CommonXpath.btnSubmit, "Submit");
		
		gl.VerifyElementVisible(Vype_CommonXpath.txtAlmostThere, "Almost there page");
		
	}

	
}