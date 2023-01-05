package stepDefinitions_Mobile;

import org.openqa.selenium.By;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties_mobile.Vype_CancelOrder;


public class CancelOrderMobile {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	int points;
	int currentPoints;
	int subtotal;
	int Earnedpoints;
	
	@Then("^verify the status of the tier for the user$")
	public void verify_the_status_of_the_tier_for_the_user() throws Throwable {
	    
		//verify status of user
				String str=rai.getText(Vype_CancelOrder.txtstatus);
				rai.VerifyPageObject(Vype_CancelOrder.txtstatus, str+" status");
				System.out.println("Status of user: "+str);
				if(str.equalsIgnoreCase("silver"))
				{
					points=5;
				}
				if(str.equalsIgnoreCase("Gold"))
				{
					points=6;
				}
				if(str.equalsIgnoreCase("Platinum"))
				{
					points=7;
				}
				if(str.equalsIgnoreCase("Premium"))
				{
					points=8;
				}
				if(str.equalsIgnoreCase("supreme"))
				{
					points=10;
				}
				
				//verify current points
				String str1=rai.getText(Vype_CancelOrder.currentpoints);
				str1=str1.replace(",","");
				currentPoints=Integer.parseInt(str1);
				System.out.println("Current points "+currentPoints);
				rai.VerifyPageObject(Vype_CancelOrder.currentpoints, "Current points "+currentPoints);
			   
	}

	@Then("^Verify blue banner in Order confirmation page$")
	public void verify_blue_banner_in_order_confirmation_page() throws Throwable {
	    
		//taking subtotal
				String str=rai.getText(Vype_CancelOrder.txtsubtotal);
				str=str.substring(1);
				Float subtotal1=Float.parseFloat(str);
				if(rai.verifyobjectisnotavailable(Vype_CancelOrder.txtdiscount))
				{
					subtotal=Math.round(subtotal1);
				}
				else
				{
					String Discount=rai.getText(Vype_CancelOrder.txtdiscount);
					Discount=Discount.substring(2);
					Float discount=Float.parseFloat(Discount);
					subtotal1=subtotal1-discount;
					subtotal=Math.round(subtotal1);
				}
				
				//scroll to savings
				rai.ScrollByxpath(Vype_CancelOrder.txtsavings);
				
				//Earned points
				Earnedpoints=(subtotal*points);
				System.out.println("Total earned points :"+ Earnedpoints);
				
				//verify earned points
				String str1="//span[text()='"+Earnedpoints+"']";
			    rai.VerifyElementsVisible(By.xpath(str1),"Earned points "+Earnedpoints);
			    
			    //verify total earned points
			    currentPoints=currentPoints+Earnedpoints;
			    rai.VerifyElementsVisible(By.xpath(str1),"Points balance "+currentPoints);

	}

	@Then("^Verify points history and current points in Rewards page$")
	public void verify_points_history_and_current_points() throws Throwable {
	   

		currentPoints=currentPoints-Earnedpoints;
		rai.VerifyElementsVisible(Vype_CancelOrder.currentpoints, "Current points "+currentPoints);
	   
		//scroll to your history
		rai.ScrollByxpath(Vype_CancelOrder.txtyourhistory);
		
		//purchase points
		rai.VerifyElementsVisible(Vype_CancelOrder.txtpurchasepointstoday, "Earned points for purchase "+Earnedpoints);
		
		//Return points
		String str=rai.getText(Vype_CancelOrder.txtreturnpoints);
		String earnedpoints=String.valueOf(Earnedpoints);
		String earnpoints1="-"+earnedpoints;
		if(str.equals(earnpoints1))
		{
			System.out.println(earnedpoints+" points are returned");
			rai.VerifyElementsVisible(Vype_CancelOrder.txtreturnpoints, earnedpoints+" points are returned");
		}
		else
		{
			System.out.println(earnedpoints+" points are not returned");
			rai.VerifyElementsVisible(Vype_CancelOrder.txtreturnpoints, earnedpoints+" points are not  returned");
		}
	    
	}
		
	}

	


