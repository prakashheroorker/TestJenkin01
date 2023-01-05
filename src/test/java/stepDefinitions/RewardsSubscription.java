package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_Cart;
import goVype_Properties.Vype_CheckOut;
import goVype_Properties.Vype_Common;
import goVype_Properties.Vype_CommonXpath;
import goVype_Properties.Vype_RewardsSubscription;

public class RewardsSubscription extends BaseClass { 
	
	String currentPoints;
	String updatedPoints;
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	@Then("^Verify the Rewards page and current points of the user$")
	public void verify_the_Rewards_page_and_current_points_of_the_user() throws Throwable {
	    
		//Verify Rewards page
		gl.VerifyPageDisplayedUsingPagetitle("Rewards | Vuse Canada");
		
		//Verify Current Points
		gl.VerifyElementVisible(Vype_RewardsSubscription.txtCurrentPtns, "Current Points");
		
		 currentPoints = gl.getText(Vype_RewardsSubscription.txtCurrentPtns);
		System.out.println("The Current Points are :- " + currentPoints);
	}

	@Then("^Verify the cart summary and SUBSCRIPTION discount is applied in the Cart Summary Page$")
	public void verify_the_cart_summary_and_SUBSCRIPTION_discount_is_applied_in_the_Cart_Summary_Page() throws Throwable {
		
		//Verify Cart Summary
		gl.VerifyObjectDisplayed(Vype_RewardsSubscription.txtCartSummary, "Cart Summary");
		
		//Verify the prod=uct is added in cart page
		String products=gl.getText(Vype_CommonXpath.pgcart);
		System.out.println(products);
				
		gl.VerifyElementVisible(Vype_CommonXpath.pgcart,products);

		String discount=gl.getText(Vype_CommonXpath.wetxtDiscount);

		//Verify the applied Discount in Cart Summary 
		gl.VerifyElementVisible(Vype_CommonXpath.wetxtDiscount,"Discount code" +discount);
				
	}

	@Then("^Verify the Rewards page and verify the Current Points are updated in the Rewards page$")
	public void verify_the_Rewards_page_and_verify_the_Current_Points_are_updated_in_the_Rewards_page() throws Throwable {
		
		//Verify Rewards page
		gl.VerifyPageDisplayedUsingPagetitle("Rewards | Vuse Canada");
				
		//Verify Updated Points
		gl.VerifyElementVisible(Vype_RewardsSubscription.txtUpdatedPtns, "Updated Points");
				
		updatedPoints = gl.getText(Vype_RewardsSubscription.txtUpdatedPtns);
		System.out.println("The Updated Points are :- " + updatedPoints);
	
	}

	@Then("^Verify for first subscription order user will receive '(\\d+)' points for one time per user$")
	public void verify_for_first_subscription_order_user_will_receive_points_for_one_time_per_user(int arg1) throws Throwable {
		
		gl.fnScrollToView(Vype_RewardsSubscription.txtYourhistory);
		
		//Verify Your History
		gl.VerifyElementVisible(Vype_RewardsSubscription.txtYourhistory, "Your History");
		
		//Verify Subscription Points
		gl.VerifyElementVisible(Vype_RewardsSubscription.txtSubscriptionPoints, "Subscription Points");
		
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
