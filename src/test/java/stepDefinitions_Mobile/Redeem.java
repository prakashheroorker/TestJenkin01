package stepDefinitions_Mobile;


import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;
import com.rai.framework.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties_mobile.*;

public class Redeem extends BaseClass{

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	String points="",pointsNum="",DisPrice="",SubTotal,TotalAmount;
	float i,Price,SubTotalPrice,Discount,OTPTotal;
	
	@When("^Click on Promotion Dropdown in Cart summary page$")
	public void click_on_Promotion_Dropdown_in_Cart_summary_page() throws Throwable {
		rai.clickUsingJs(Vype_redeem.Promotiondropdown, "Promotion Dropdown");
	}

	@When("^verify the vuse reward points$")
	public void verify_the_vuse_reward_points() throws Throwable {
		rai.VerifyElementVisible(Vype_redeem.lnkRedeem,"Redeem button");
	}

	@When("^Verify the worning message desplayed when redeem is grater than fifty thousand points\"([^\"]*)\"$")
	public void verify_the_worning_message_desplayed_when_redeem_is_grater_than_fifty_thousand_points(String GraterPoints) throws Throwable {
		
		rai.clickUsingJs(Vype_redeem.lnkRedeem,"Redeem nutton");
		
		
		//rai.ClearText(Vype_redeem.Points, "clearing Points");
		//Thread.sleep(4000);
		
		//function.addrewardpoints(GraterPoints);
		
		/*Map<String, Object> params = new HashMap<>();
		params.put("label", 1000);
		// params.put("text", "alva.white36@bat.com");
		params.put("text", GraterPoints);
		params.put("operation", "sinraie");
		rdriver.executeScript("mobile:edit-text:set", params);*/
		
		//rai.inputText(Vype_redeem.Points, "Points", GraterPoints);
		rai.inputTextjavaScriptSendkeys(rdriver, Vype_redeem.Points, GraterPoints);
		
		Thread.sleep(1000);
		//rai.SwipeDown(1);
		
		rai.VerifyElementVisible(Vype_redeem.WorngMsg, "Worng Message");
	
	}

	
	@When("^Click on the REDEEM button$")
	public void click_on_the_REDEEM_button() throws Throwable {
		//Thread.sleep(2000);
		rai.clickUsingJs(Vype_redeem.lnkRedeem,"Redeem nutton");
	}

	@When("^Redeem  points\"([^\"]*)\"$")
	public void redeem_points(String Points) throws Throwable {
		
		rai.ClearText(Vype_redeem.Points, "clearing Points");
		
		/*Map<String, Object> params = new HashMap<>();
		params.put("label", 1000);
		// params.put("text", "alva.white36@bat.com");
		params.put("text", Points);
		params.put("operation", "sinraie");
		rdriver.executeScript("mobile:edit-text:set", params);*/
		
		rai.inputTextjavaScriptSendkeys(rdriver, Vype_redeem.Points, Points);
		
		rai.clickUsingJs(Vype_redeem.Redeembtn,"Redeem nutton");
		
		System.out.println("Redeemed Discount : "+i);
	}

	@Then("^Verify the Cart page is updated with the  redeemed point$")
	public void verify_the_Cart_page_is_updated_with_the_redeemed_point() throws Throwable {
		//rai.fnScrollToView(Vype_redeem.VuseRewards);
		rai.SwipeDown(1);
		Thread.sleep(1000);
		rai.VerifyElementVisible(Vype_redeem.Rewards, "Rewards");
		
		//Discoun is Added
		DisPrice = rai.getText(Vype_redeem.DiscountPrice);
		DisPrice = DisPrice.substring(2);
		Price = Float.parseFloat(DisPrice);
		
		if(i==Price)
		System.out.println("Discount Price : $" +Price);
		
		//SubTotal Amount
		SubTotal = rai.getText(Vype_redeem.SubTotal);
		SubTotal = SubTotal.substring(1);
		SubTotalPrice = Float.parseFloat(SubTotal);
		
		//System.out.println("Discount Price : $" +SubTotalPrice);
		
		//Total Cart Price
		TotalAmount = rai.getText(Vype_redeem.TotalAmount);
		TotalAmount = TotalAmount.substring(1);
		OTPTotal = Float.parseFloat(TotalAmount);
		System.out.println("One time purchase total before shipping : $" +OTPTotal);
		Discount = SubTotalPrice - Price;
		
		if(Discount == OTPTotal)
		System.out.println("One time purchase total before shipping : $" +OTPTotal);
	}
	

	@Then("^Scroll down to your History and Verify Reward Redemption points are dedected$")
	public void scroll_down_to_your_History_and_Verify_Reward_Redemption_points_are_dedected() throws Throwable {
     //rai.fnScrollToView(Vype_redeem.History);
		rai.SwipeDown(1);   
	    rai.VerifyElementVisible(Vype_redeem.RewardsRedemption, "RewardsRedemption");
	}
	
	
	
	//Updated Bhavitha
	
	float RPoints,FindDis;
	String pnt,TaxAmount;
	
	@When("^Redeem the points to get discount \"([^\"]*)\"$")
	public void redeem_the_points_to_get_discount(int Points) throws Throwable {
		//rai.ClearText(Vype_redeem.Points, "clearing Points");
		String input = "0";
		//rai.HowerMouse(Vype_redeem.Points,"Points");
		rai.inputTextjavaScriptSendkeys(adriver, Vype_redeem.Points, input);
//		while(!(rai.isDisabled(Vype_redeem.decrementbttn, "Decrease the points"))==true) {
//			
//		rai.clickbutton(Vype_redeem.decrementbttn,"Decrease the points");
//		}
		
		for(int i=200; i<=Points;) {
			rai.clickbutton(Vype_redeem.incrementbttn,"increase the points");
			System.out.println("Print the points to redeem: "+(i));
			i = i + 200;
			Thread.sleep(2000);
		}
		
		
		
		//rai.VerifyElementVisible(Vype_redeem.Points, "Points to redeem");
		
		
		RPoints = Points/200;
		
		System.out.println("Discount caluculation through points: "+RPoints);
	}

	@Then("^Verify the cart page is updated with the redeemed points$")
	public void verify_the_cart_page_is_updated_with_the_redeemed_points() throws Throwable {
		rai.clickbutton(Vype_redeem.lnkRedeem,"Redeem button");

		rai.SwipeDownSmallerUnits(2);
		//Discoun is Added
		DisPrice = rai.getText(Vype_redeem.DiscountPrice);
		DisPrice = DisPrice.substring(2);
		Price = Float.parseFloat(DisPrice);
		
		if(RPoints==Price)
		System.out.println("Discount Price : $" +Price);
		
		//SubTotal Amount
		SubTotal = rai.getText(Vype_redeem.SubTotal);
		SubTotal = SubTotal.substring(1);
		SubTotalPrice = Float.parseFloat(SubTotal);
		
		
		if(rai.VerifyElementVisible(Vype_redeem.ExciseTax, "Excise Tax")) {
			
			TaxAmount = rai.getText(Vype_redeem.ExciseTaxAmount);
			TaxAmount = TaxAmount.substring(1);
			Discount = SubTotalPrice + Float.parseFloat(TaxAmount) - Price;
			
		}
		else {
		
		//Total Cart Price
		TotalAmount = rai.getText(Vype_redeem.TotalAmount);
		TotalAmount = TotalAmount.substring(1);
		OTPTotal = Float.parseFloat(TotalAmount);
		
		Discount = SubTotalPrice - Price;
		
		}
		System.out.println("Discount price calculation : $" +Discount);
	}
	
	
}
