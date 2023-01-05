package stepDefinitions;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_GoldProfileTrigger;
import goVype_Properties.Vype_ePodStarterKit;

public class Nonvypeuser {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

/*	@Then("^Choose Flavour \"([^\"]*)\" and Nicotine Strength \"([^\"]*)\"$")
	public void choose_Flavour_and_Nicotine_Strength(String arg1, String arg2) throws Throwable {
		function.addCartridgesforEngravedDevice("lemon-berry","1.6");
	}
*/
	@Then("^Verify how you will benefit$")
	public void verify_how_you_will_benefit() throws Throwable {
		gl.VerifyElementVisible(Vype_CommonXpath.txtVuseplus, "VUSE+ ");
		String text = gl.getText(Vype_CommonXpath.txtYouAreAlmost);
		gl.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);

		gl.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");

		gl.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");

		String str = gl.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
		gl.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);

		gl.clickUsingJs(Vype_CommonXpath.btnClose, "Click on X button ");
	}

	@Then("^Add quantity to reach sliver profile$")
	public void add_quantity_to_reach_sliver_profile() throws Throwable {
		//Get the total amount added
		String TotalAmount = gl.getText(Vype_Cart.weTxtTotal);
		float TotalAmountFlo=Float.parseFloat(TotalAmount.substring(1));
		float FinalFloatPriceValue = TotalAmountFlo;

		for(int n=1;n>0;){
			if(FinalFloatPriceValue<100){

				//Add quantity 
				gl.clickbutton(Vype_Cart.btnAdd, "+");
				Thread.sleep(5000);
				String TotalAmount1 = gl.getText(Vype_Cart.weTxtTotal);
				FinalFloatPriceValue = Float.parseFloat(TotalAmount1.substring(1));
				n++;
			}
			else{
				System.out.println("No need to add more quantity");
				break;
			}

		}               

		String TotalAmount2 = gl.getText(Vype_Cart.weTxtTotal);
		System.out.println("Total amount is: "+ TotalAmount2);						

	}

	@Then("^Verify silver status progress and Check Discount,other benefits displayed$")
	public void verify_silver_status_progress_and_Check_Discount_other_benefits_displayed() throws Throwable {
		String status = gl.getText(Vype_ePodStarterKit.txtSilverStatus);
		gl.VerifyElementVisible(Vype_ePodStarterKit.txtSilverStatus, status);
		gl.ScrollPageDown();
		//Check Discount displayed
		String discountCode = gl.getText(Vype_ePodStarterKit.txtDiscountCode);
		gl.VerifyElementVisible(Vype_ePodStarterKit.txtDiscountCode,discountCode);
		gl.ScrollPageDown();
		gl.ScrollPageDown();
		//Check other benefits 
		String benefits = gl.getText(Vype_ePodStarterKit.txtOtherBenefits);
		gl.VerifyElementVisible(Vype_ePodStarterKit.txtOtherBenefits,benefits);

		gl.ScrollPageDown();
	}

	@Then("^Verify the progress bar$")
	public void verify_the_progress_bar() throws Throwable {
		String barProgressStatus = gl.getAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
		barProgressStatus=barProgressStatus.substring(7);
		barProgressStatus.trim();
		barProgressStatus=barProgressStatus.substring(0,barProgressStatus.length()-2);
		Float progressBarValue = Float.parseFloat(barProgressStatus);
		if(progressBarValue>=23){
			gl.VerifyObjectDisplayed(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Reached next Level");
		} 
	}

}
