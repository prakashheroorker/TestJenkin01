package stepDefinitions_Mobile;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;


import goVype_Properties_mobile.*;

public class RewardsSubscription extends BaseClass {
	String currentPoints;
	String updatedPoints;
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify the current points of the user in Rewards page$")
	public void Verify_the_current_points_of_the_user_in_Rewards_page() throws Throwable {
	    
		//Verify Rewards page
		rai.verifyTitle("Rewards | Vuse Canada");
		
		//Verify Current Points
		rai.VerifyElementVisible(Vype_RewardsSubscription_Mobile.txtCurrentPtns, "Current Points");
		
		 currentPoints = rai.getText(Vype_RewardsSubscription_Mobile.txtCurrentPtns);
		System.out.println("The Current Points are :- " + currentPoints);
	}
	@Then("^Verify the cart summary and Subscription discount is applied in the Cart Summary Page$")
	public void verify_the_cart_summary_and_Subscription_discount_is_applied_in_the_Cart_Summary_Page() throws Throwable {
		
		//Verify Cart Summary
		rai.VerifyElementVisible(Vype_RewardsSubscription_Mobile.txtCartSummary, "Cart Summary");
		
		//Verify the prod=uct is added in cart page
		String products=rai.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
				
		rai.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		String discount=rai.getText(Vype_CommonXpath.wetxtDiscount);

		//Verify the applied Discount in Cart Summary 
		rai.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount,"Discount code" +discount);
				
	}
	@Then("^Verify the Current Points are updated in the Rewards page$")
	public void Verify_the_Current_Points_are_updated_in_the_Rewards_page() throws Throwable {
		
		//Verify Rewards page
		rai.verifyTitle("Rewards | Vuse Canada");
				
		//Verify Updated Points
		rai.VerifyElementVisible(Vype_RewardsSubscription_Mobile.txtUpdatedPtns, "Updated Points");
				
		updatedPoints = rai.getText(Vype_RewardsSubscription_Mobile.txtUpdatedPtns);
		System.out.println("The Updated Points are :- " + updatedPoints);
	
	}
	@Then("^Verify first subscription order user will receive '(\\d+)' points for one time per user$")
	public void verify_first_subscription_order_user_will_receive_points_for_one_time_per_user(int arg1) throws Throwable {
		
		rai.ScrollByxpath(Vype_RewardsSubscription_Mobile.txtYourhistory);
		
		//Verify Your History
		rai.VerifyElementVisible(Vype_RewardsSubscription_Mobile.txtYourhistory, "Your History");
		
		//Verify Subscription Points
		rai.VerifyElementVisible(Vype_RewardsSubscription_Mobile.txtSubscriptionPoints, "Subscription Points");
		
		currentPoints = currentPoints.replace(",", "");
		updatedPoints = updatedPoints.replace(",", "");

		int a =Integer.valueOf(currentPoints);
		int b=Integer.valueOf(updatedPoints);
		int total = a+2000; 
		System.out.println(total);
		
		try {
		if(b==total) {
			System.out.println("Subscription points are added");
			reportiumClient.reportiumAssert("Subscription points are added", true);
		}
		
	}
		catch(Exception e) {
			
				System.out.println("No change in current points");
			reportiumClient.reportiumAssert("No change in current points", false);
		}
	}

}
