package stepDefinitions;


import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class PlatinumProfileTrigger {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	private String SpendAmount="";
	private float i;



@Then("^verifies the amount to be spend to upgrade to Platinum status$")
public void verifies_the_amount_to_be_spend_to_upgrade_to_Platinum_status() throws Throwable {
	
	gl.fnScrollToView(Vype_ePodStarterKit.txtspendamount);
	gl.VerifyElementVisible(Vype_ePodStarterKit.txtspendamount, "Spend some money to upgrade to platinum");
	
	//Get text to spend amount
	
	SpendAmount=gl.getText(Vype_ePodStarterKit.txtspendamount);
	System.out.println(SpendAmount);
	String Amount = SpendAmount.substring(7,13);
	i=Float.parseFloat(Amount);
	System.out.println("Amount needs to spend is: "+ i);
	

}

@When("^User navigates to Cart page and adds required quantities to upgrade to Platinum status$")
public void user_navigates_to_Cart_page_and_adds_required_quantities_to_upgrade_to_Platinum_status() throws Throwable {
	
	function.hoverCartAndClickViewCart();
	gl.ScrolltoTopofthepage();
	gl.VerifyElementVisible(Vype_CommonXpath.txtIncentiveDisclaimerCart, "Incentive Disclaimer");
	String text = gl.getText(Vype_CommonXpath.txtYouAreAlmost);
	gl.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);
	String incentiveStatus = gl.getText(Vype_CommonXpath.txtIncentiveStatus);
	gl.fnCompareTextIgnoreCase("platinum status", incentiveStatus);
	gl.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	gl.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	String str = gl.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
	gl.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);
	String benefitStatus = gl.getText(Vype_CommonXpath.txtBenefitStatus);
	gl.fnCompareTextIgnoreCase("platinum", benefitStatus);
	gl.clickUsingJs(Vype_CommonXpath.btnClose, "Click on X button ");
	Thread.sleep(2000);
	
	//gl.ScrollPageDown();
	//Steps to remove promotion
	//gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkPromotion, "Promotion");
	//Thread.sleep(2000);
	//gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnRemove, "Remove");
	//Thread.sleep(2000);
	//gl.ScrollPageUp();
	String TotalAmount = gl.getText(Vype_Cart.weTxtTotal);
	float FinalFloatPriceValue=Float.parseFloat(TotalAmount.substring(1));
	
	for(int n=1;n>0;){
		if(FinalFloatPriceValue<i){

			//Add quantity 
			gl.clickbutton(Vype_Cart.btnAdd, "+");
			Thread.sleep(2000);
			String TotalAmount1 = gl.getText(Vype_Cart.weTxtTotal);
			FinalFloatPriceValue = Float.parseFloat(TotalAmount1.substring(1));
			n++;
		}
		else{
			System.out.println("No need to add more quantity");
			break;
		}

	}   
   
}


@Then("^User verifies the submitted order in Orders page and reward category is updated as Platinum \"([^\"]*)\"$")
public void user_verifies_the_submitted_order_in_Orders_page_and_reward_category_is_updated_as_Platinum(String rewardstatus) throws Throwable {
    
	gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	Thread.sleep(2000);
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkMyOrders, "My Orders");
	Thread.sleep(2000);
	gl.VerifyElementVisible(Vype_SilverProfileTrigger.textOrderNumber, "Order number on Orders page ");
    gl.VerifyElementVisible(Vype_SilverProfileTrigger.textDate, "Order date on Orders page ");
	
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkRewards, "Rewards");
	Thread.sleep(2000);
	gl.ScrollPageDown();
	String UserStatus = gl.getText(Vype_CommonXpath.weUserStatus);

	gl.fnCompareTextIgnoreCase(UserStatus, rewardstatus);
	
	String statusPlatinum = gl.getText(Vype_CommonXpath.txtProfileStatus);
	statusPlatinum = statusPlatinum.trim();
	
	gl.fnCompareTextIgnoreCase(statusPlatinum, "Platinum status");
	
	gl.fnScrollToView(Vype_ePodStarterKit.txtOtherBenefits);
	
	//Check other benefits 
	gl.VerifyElementVisible(Vype_ePodStarterKit.txtOtherBenefits,"Your other Platinum benefits");

	//Verify the progress bar
	
	String barProgressStatus = gl.getAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
	barProgressStatus=barProgressStatus.substring(7);
	barProgressStatus.trim();
	barProgressStatus=barProgressStatus.substring(0,barProgressStatus.length()-2);
	Float progressBarValue = Float.parseFloat(barProgressStatus);
	if(progressBarValue>=100.00){
		gl.VerifyObjectDisplayed(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Reached Platinum Level");
	} 
	
	
}

@Then("^Order is Cancelled successfully$")
public void Order_is_Cancelled_successfully() throws Exception{
	
	gl.ScrolltoTopofthepage();
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnOrders, "Orders");
	Thread.sleep(2000);
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnCancelOrder, "Cancel Order");
	Thread.sleep(2000);
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnCancelOrderConfirmation, "Cancel Order Confirmation");
	gl.waitTillElementVisible(Vype_CommonXpath.btnCancelOrderSuccess);
	gl.VerifyElementVisible(Vype_CommonXpath.btnCancelOrderSuccess, "Cancelled Successfully");
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnCancelOrderClose, "Cancel Order");
}

@And("^User navigates to Cart page and purchases below the Platinum benefits spend value$")
public void user_navigates_to_Cart_page_and_purchases_below_the_Platinum_benefits_spend_values() throws Throwable {
	
	function.hoverCartAndClickViewCart();
	gl.ScrolltoTopofthepage();
	gl.VerifyElementVisible(Vype_CommonXpath.txtIncentiveDisclaimerCart, "Incentive Disclaimer");
	String text = gl.getText(Vype_CommonXpath.txtYouAreAlmost);
	gl.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);
	String incentiveStatus = gl.getText(Vype_CommonXpath.txtIncentiveStatus);
	gl.fnCompareTextIgnoreCase("platinum status", incentiveStatus);
	gl.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	gl.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	String str = gl.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
	gl.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);
	String benefitStatus = gl.getText(Vype_CommonXpath.txtBenefitStatus);
	gl.fnCompareTextIgnoreCase("platinum", benefitStatus);
	gl.clickUsingJs(Vype_CommonXpath.btnClose, "Click on X button ");
	Thread.sleep(2000);
	
	//gl.ScrollPageDown();
	//Steps to remove promotion
		/*
		 * gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkPromotion, "Promotion");
		 * Thread.sleep(2000); gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnRemove,
		 * "Remove"); Thread.sleep(2000); gl.ScrollPageUp();
		 */
	gl.ScrollPageDown();
	Thread.sleep(2000);
	String TotalAmount = gl.getText(Vype_Cart.weTxtTotal);
	float FinalFloatPriceValue=Float.parseFloat(TotalAmount.substring(1));
	
	for(int n=1;n>0;){
		if(FinalFloatPriceValue<i){

			//Add quantity 
			gl.clickbutton(Vype_Cart.btnAdd, "+");
			Thread.sleep(2000);
			String TotalAmount1 = gl.getText(Vype_Cart.weTxtTotal);
			FinalFloatPriceValue = Float.parseFloat(TotalAmount1.substring(1));
			n++;
		}
		else{
			
			gl.clickbuttonTillElementValueReaches(Vype_Cart.btnMinus, 4, "- button");
			Thread.sleep(2000);
			break;
		}

	}   
   
}

@And("^User verifies the submitted order in Orders page and reward category is NOT updated as Platinum and remains as \"([^\"]*)\"$")
public void user_verifies_the_submitted_order_in_Orders_page_and_reward_category_is_NOT_updated_as_Platinum(String rewardstatus) throws Throwable {
    gl.ScrolltoTopofthepage();
	gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	Thread.sleep(2000);
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkMyOrders, "My Orders");
	Thread.sleep(2000);
	gl.VerifyElementVisible(Vype_SilverProfileTrigger.textOrderNumber, "Order number on Orders page ");
    gl.VerifyElementVisible(Vype_SilverProfileTrigger.textDate, "Order date on Orders page ");
	
	gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkRewards, "Rewards");
	Thread.sleep(2000);
	gl.ScrollPageDown();
	String UserStatus = gl.getText(Vype_CommonXpath.weUserStatus);

	gl.fnCompareTextIgnoreCase(UserStatus, rewardstatus);
	
	String statusGold = gl.getText(Vype_CommonXpath.txtProfileStatus);
	statusGold = statusGold.trim();
	
	gl.fnCompareTextIgnoreCase(statusGold, "Gold status");
	
	gl.fnScrollToView(Vype_ePodStarterKit.txtOtherBenefits);
	
	//Check other benefits 
	gl.VerifyElementVisible(Vype_ePodStarterKit.txtOtherBenefits,"Your other Gold benefits");

	//Verify the progress bar
	
	String barProgressStatus = gl.getAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
	barProgressStatus=barProgressStatus.substring(7);
	barProgressStatus.trim();
	barProgressStatus=barProgressStatus.substring(0,barProgressStatus.length()-2);
	Float progressBarValue = Float.parseFloat(barProgressStatus);
	if(progressBarValue>60.5 & progressBarValue<100.00 ){
		gl.VerifyObjectDisplayed(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Did NOT Reach Platinum Level");
	} 
	
}
		

}
