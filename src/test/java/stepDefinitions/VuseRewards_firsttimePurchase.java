package stepDefinitions;

import org.junit.Assert;

import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import goVype_Properties.Vype_Opt_in;
import goVype_Properties.Vype_VuseRewards_firsttimePurchase;

public class VuseRewards_firsttimePurchase {

	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	int EarnedPoints,TotalPoints,CurrentPoints;

	
	@Then("^Verify the My Rewards page for updated current points$")
	public void verify_the_My_Rewards_page_for_updated_current_points() throws Throwable {
		
		gl.fnScrollToView(Vype_VuseRewards_firsttimePurchase.VusePlusCurrentPoints);
	
		//currents points 
		CurrentPoints = Integer.parseInt(gl.getText(Vype_VuseRewards_firsttimePurchase.VusePlusCurrentPoints, "Current points"));
		
	   //verify current points has been updated
		//Assert.assertEquals(TotalPoints, CurrentPoints);
		Assert.assertTrue(TotalPoints==CurrentPoints);
		
	}

	@And("^verify the points for firsttime purchase$")
	public void verify_the_points_for_firsttime_purchase() throws Throwable {
	    //verify first purchase points is displayed
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.txtfirsttimePurchaseBonus, "first time purchase points under History");
		System.out.print(gl.getText(Vype_VuseRewards_firsttimePurchase.txtfirsttimePurchaseBonus,"first time purchase points under History")+" ");
		System.out.println(gl.getText(Vype_VuseRewards_firsttimePurchase.firsttimePurchaseBonus, "first time purchase points"));

		
		//verify purchase points is displayed
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.txtPurchasePoints, "purchase points under history");
		System.out.print(gl.getText(Vype_VuseRewards_firsttimePurchase.txtPurchasePoints, "purchase points under history")+" ");
		System.out.println(gl.getText(Vype_VuseRewards_firsttimePurchase.PurchasePoints, "purchase points under history"));

		

	}

	

	@And("^verify awarded points in order confirmation page$")
	public void verify_awarded_points_in_order_confirmation_page() throws Throwable {
	 
	 //verify vuse + rewards blue banner is displayed
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.OrderConfirmationBlueBanner, "vuse + rewards blue banner ");
		
     //verify earned points is displayed
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.VusePlusEarnedPoints, "Text for vuse + rewards earned points ");
		String S1 = gl.getText(Vype_VuseRewards_firsttimePurchase.VusePlusEarnedPoints, "vuse + rewards earned points");
		System.out.println(S1);
		EarnedPoints = Integer.parseInt(S1.split("earned")[1].split("points")[0].trim());
		
		//Compare the earned points for purchase with silver tier i.e 5 points for 1 dollar
	    //Assert.assertEquals(5*14+500, EarnedPoints);
	    Assert.assertTrue((5*14+500)== EarnedPoints);
		

				
   	//verify total points is displayed	
		gl.VerifyObjectDisplayed(Vype_VuseRewards_firsttimePurchase.VusePlusTotalPoints, "Text vuse + rewards total points ");
		String S2 = gl.getText(Vype_VuseRewards_firsttimePurchase.VusePlusTotalPoints, "vuse + rewards total points");
		System.out.println(S2);
		TotalPoints = Integer.parseInt(S2.split("is")[1].split("points")[0].trim());
		
	}

}
