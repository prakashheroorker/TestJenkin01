package stepDefinitions;

import org.openqa.selenium.By;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.*;
import goVype_Properties.Vype_CancelOrder;
import goVype_Properties.Vype_CommonXpath;

public class CancelOrder {
	
	int points;
	int currentPoints;
	int subtotal;
	int Earnedpoints;
	
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	
	@Then("^verify the status of the tier of the user$")
	public void verify_the_status_of_the_tier_of_the_user() throws Throwable {
		
		//verify status of user
		String str=gl.getText(Vype_CancelOrder.txtstatus);
		gl.VerifyObjectDisplayed(Vype_CancelOrder.txtstatus, str+" status");
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
		String str1=gl.getText(Vype_CancelOrder.currentpoints);
		str1=str1.replace(",","");
		currentPoints=Integer.parseInt(str1);
		System.out.println("Current points "+currentPoints);
		gl.VerifyObjectDisplayed(Vype_CancelOrder.currentpoints, "Current points "+currentPoints);
	   
	}
	
	
	@Then("^Verify blue banner in order confirmation page$")
	public void verify_blue_banner() throws Throwable {
	    
		//taking subtotal
		String str=gl.getText(Vype_CancelOrder.txtsubtotal);
		str=str.substring(1);
		Float subtotal1=Float.parseFloat(str);
		if(gl.verifyobjectisnotavailable(Vype_CancelOrder.txtdiscount))
		{
			subtotal=Math.round(subtotal1);
		}
		else
		{
			String Discount=gl.getText(Vype_CancelOrder.txtdiscount);
			Discount=Discount.substring(2);
			Float discount=Float.parseFloat(Discount);
			subtotal1=subtotal1-discount;
			subtotal=Math.round(subtotal1);
		}
		
		//scroll to savings
		gl.fnScrollToView(Vype_CancelOrder.txtsavings);
		
	

		
		//Earned points
		Earnedpoints=(subtotal*points);
		System.out.println("Total earned points :"+ Earnedpoints);
		
		//verify earned points
		String str1="//span[text()='"+Earnedpoints+"']";
	    gl.VerifyObjectDisplayed(By.xpath(str1),"Earned points "+Earnedpoints);
	    
	    //verify total earned points
	    currentPoints=currentPoints+Earnedpoints;
	    gl.VerifyObjectDisplayed(By.xpath(str1),"Points balance "+currentPoints);

		
		
		
	}
	
	@Then("^Verify points history and current points in Rewards page$")
	public void verify_points_history_and_current_points() throws Throwable {
		
		currentPoints=currentPoints-Earnedpoints;
		gl.VerifyObjectDisplayed(Vype_CancelOrder.currentpoints, "Current points "+currentPoints);
	   
		//scroll to your history
		gl.fnScrollToView(Vype_CancelOrder.txtyourhistory);
		
		//purchase points
		gl.VerifyObjectDisplayed(Vype_CancelOrder.txtpurchasepointstoday, "Earned points for purchase "+Earnedpoints);
		
		//Return points
		String str=gl.getText(Vype_CancelOrder.txtreturnpoints);
		String earnedpoints=String.valueOf(Earnedpoints);
		String earnpoints1="-"+earnedpoints;
		if(str.equals(earnpoints1))
		{
			System.out.println(earnedpoints+" points are returned");
			gl.VerifyObjectDisplayed(Vype_CancelOrder.txtreturnpoints, earnedpoints+" points are returned");
		}
		else
		{
			System.out.println(earnedpoints+" points are not returned");
			gl.VerifyObjectDisplayed(Vype_CancelOrder.txtreturnpoints, earnedpoints+" points are not  returned");
		}
	    
	}

}
