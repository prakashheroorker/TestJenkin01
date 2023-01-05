package stepDefinitions;


import com.rai.framework.*;

import cucumber.api.java.en.*;
import goVype_Properties.*;


public class GoldProfileTrigger {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);

	private String SpendAmount="";
	private float i;
	

@When("^User navigates to Rewards page$")
public void user_navigates_to_Rewards_page() throws Throwable {
	
	gl.HowerMouse(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
	Thread.sleep(2000);
	gl.clickUsingJs(Vype_CommonXpath.lnkMyRewards, "Rewards");
	
    
}

@Then("^verifies the amount to be spend to upgrade to Gold status$")
public void verifies_the_amount_to_be_spend_to_upgrade_to_next_status() throws Throwable {
	
	gl.fnScrollToView(Vype_ePodStarterKit.txtspendamount);
	gl.VerifyElementVisible(Vype_ePodStarterKit.txtspendamount, "Spend some money to upgrade to gold");
	
	//Get text to spend amount
	
	SpendAmount=gl.getText(Vype_ePodStarterKit.txtspendamount);
	System.out.println(SpendAmount);
	String Amount = SpendAmount.substring(7,13);
	i=Float.parseFloat(Amount);
	System.out.println("Amount needs to spend is: "+ i);
	
	gl.fnScrollToView(Vype_SilverProfileTrigger.labelYourStatus);
    
    //Verify that Rewards page is displayed
    gl.VerifyPageDisplayed(Vype_SilverProfileTrigger.labelYourStatus, "Rewards Page");
	
  
}

@When("^User selects required product \"([^\"]*)\" for one time purchase and add to the cart$")
public void user_selects_required_product_for_one_time_purchase_and_add_to_the_cart(String flavor) throws Throwable {
	
	gl.fnScrollToView(Vype_CommonXpath.webAllFlavorsePodPage(flavor));
	function.chooseFlavourInePodPodsPage(flavor);
	gl.ScrolltoTopofthepage();
	gl.ScrollPageDown();
	gl.clickUsingJs(Vype_CommonXpath.btnOneTime, "One time Purchase");
	gl.fnScrollToView(Vype_CommonXpath.txtPack);
	gl.clickUsingJs(Vype_CommonXpath.btn1point6percent, "Add Button");
	Thread.sleep(2000);
	gl.clickbutton(Vype_CommonXpath.btnAddToCart, "Add to Cart");
	Thread.sleep(2000);
 
}

@When("^User navigates to Cart page and adds required quantities to upgrade to Gold status$")
public void user_navigates_to_Cart_page_and_adds_required_quantities_to_upgrade_to_Gold_status() throws Throwable {
	
	function.hoverCartAndClickViewCart();
	gl.ScrolltoTopofthepage();
	gl.VerifyElementVisible(Vype_CommonXpath.txtIncentiveDisclaimerCart, "Incentive Disclaimer");
	String text = gl.getText(Vype_CommonXpath.txtYouAreAlmost);
	gl.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);
	String incentiveStatus = gl.getText(Vype_CommonXpath.txtIncentiveStatus);
	gl.fnCompareTextIgnoreCase("gold status", incentiveStatus);
	gl.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	gl.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	String str = gl.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
	gl.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);
	String benefitStatus = gl.getText(Vype_CommonXpath.txtBenefitStatus);
	gl.fnCompareTextIgnoreCase("gold", benefitStatus);
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

@Then("^User verifies the submitted order in Orders page and reward category is updated as Gold \"([^\"]*)\"$")
public void user_verifies_the_submitted_order_in_Orders_page_and_reward_category_is_updated_as_Gold(String rewardstatus) throws Throwable {
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
	if(progressBarValue>=60.5){
		gl.VerifyObjectDisplayed(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Reached Gold Level");
	} 
	
}

@And("^User navigates to Cart page and purchases below the Gold benefits spend value$")
public void user_navigates_to_Cart_page_and_purchases_below_the_Gold_benefits_spend_values() throws Throwable {
	
	function.hoverCartAndClickViewCart();
	gl.ScrolltoTopofthepage();
	gl.VerifyElementVisible(Vype_CommonXpath.txtIncentiveDisclaimerCart, "Incentive Disclaimer");
	String text = gl.getText(Vype_CommonXpath.txtYouAreAlmost);
	gl.VerifyElementVisible(Vype_CommonXpath.txtYouAreAlmost, text);
	String incentiveStatus = gl.getText(Vype_CommonXpath.txtIncentiveStatus);
	gl.fnCompareTextIgnoreCase("gold status", incentiveStatus);
	gl.VerifyElementVisible(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	gl.clickUsingJs(Vype_CommonXpath.txtSeeHowYouWillBenefit, "See how you will benefit");
	String str = gl.getText(Vype_CommonXpath.lnkSeeHowYouWillBenefit);
	gl.VerifyElementVisible(Vype_CommonXpath.lnkSeeHowYouWillBenefit, str);
	String benefitStatus = gl.getText(Vype_CommonXpath.txtBenefitStatus);
	gl.fnCompareTextIgnoreCase("gold", benefitStatus);
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
			
			gl.clickbuttonTillElementValueReaches(Vype_Cart.btnMinus, 4, "- button");
			Thread.sleep(2000);
			break;
		}

	}   
   
}

@And("^User verifies the submitted order in Orders page and reward category is NOT updated as Gold and remains as \"([^\"]*)\"$")
public void user_verifies_the_submitted_order_in_Orders_page_and_reward_category_is_NOT_updated_as_Gold(String rewardstatus) throws Throwable {
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
	
	String statusSilver = gl.getText(Vype_CommonXpath.txtProfileStatus);
	statusSilver = statusSilver.trim();
	
	gl.fnCompareTextIgnoreCase(statusSilver, "Silver status");
	
	//Check other benefits 
	gl.VerifyElementVisible(Vype_ePodStarterKit.txtOtherBenefits,"Your other Silver benefits");

	//Verify the progress bar
	
	String barProgressStatus = gl.getAttributeValue(Vype_GoldProfileTrigger.barProgressStatus, "style");
	barProgressStatus=barProgressStatus.substring(7);
	barProgressStatus.trim();
	barProgressStatus=barProgressStatus.substring(0,barProgressStatus.length()-2);
	Float progressBarValue = Float.parseFloat(barProgressStatus);
	if(progressBarValue<60.5){
		gl.VerifyObjectDisplayed(Vype_GoldProfileTrigger.barProgressStatus, "Progress Bar Did NOT Reach Gold Level");
	} 
	
}

}
