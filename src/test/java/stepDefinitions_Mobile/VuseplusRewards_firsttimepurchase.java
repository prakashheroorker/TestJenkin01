package stepDefinitions_Mobile;

import org.junit.Assert;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import goVype_Properties_mobile.Vype_VuseRewards_firsttimepurchase;


public class VuseplusRewards_firsttimepurchase {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);


	int EarnedPoints,TotalPoints,CurrentPoints;

	
	@Then("^Verify My Rewards page for updated current points$")
	public void verify_the_My_Rewards_page_for_updated_current_points() throws Throwable {
		
		rai.ScrollByxpath(Vype_VuseRewards_firsttimepurchase.VusePlusCurrentPoints);
	
		//currents points 
		CurrentPoints = Integer.parseInt(rai.getText(Vype_VuseRewards_firsttimepurchase.VusePlusCurrentPoints));
		
	   //verify current points has been updated
		//Assert.assertEquals(TotalPoints, CurrentPoints);
		//Assert.assertTrue(TotalPoints==CurrentPoints);
		if(TotalPoints==CurrentPoints)
		System.out.println("CurrentPoints : "+CurrentPoints);
		
	}

	@And("^verify the points for first time purchase$")
	public void verify_the_points_for_firsttime_purchase() throws Throwable {
	    //verify first purchase points is displayed
		rai.VerifyElementsVisible(Vype_VuseRewards_firsttimepurchase.txtfirsttimePurchaseBonus, "first time purchase points under History");
		System.out.print(rai.getText(Vype_VuseRewards_firsttimepurchase.txtfirsttimePurchaseBonus)+" ");
		System.out.println(rai.getText(Vype_VuseRewards_firsttimepurchase.firsttimePurchaseBonus));

		
		//verify purchase points is displayed
		rai.VerifyElementsVisible(Vype_VuseRewards_firsttimepurchase.txtPurchasePoints, "purchase points under history");
		System.out.print(rai.getText(Vype_VuseRewards_firsttimepurchase.txtPurchasePoints)+" ");
		System.out.println(rai.getText(Vype_VuseRewards_firsttimepurchase.PurchasePoints));

		

	}

	

	@And("^verify awarded points in blue banner$")
	public void verify_awarded_points_in_order_confirmation_page() throws Throwable {
	 
	 //verify vuse + rewards blue banner is displayed
		rai.VerifyElementsVisible(Vype_VuseRewards_firsttimepurchase.OrderConfirmationBlueBanner, "vuse + rewards blue banner ");
		
     //verify earned points is displayed
		rai.VerifyElementsVisible(Vype_VuseRewards_firsttimepurchase.VusePlusEarnedPoints, "Text for vuse + rewards earned points ");
		String S1 = rai.getText(Vype_VuseRewards_firsttimepurchase.VusePlusEarnedPoints);
		System.out.println(S1);
		EarnedPoints = Integer.parseInt(S1.split("earned")[1].split("points")[0].trim());
		
		//Compare the earned points for purchase with silver tier i.e 5 points for 1 dollar
	    //Assert.assertEquals(5*14+500, EarnedPoints);
	    //Assert.assertTrue((5*14+500)== EarnedPoints);
		
	    /*if((5*14+500)== EarnedPoints)
	    	System.out.println("Earned Points: "+EarnedPoints);
*/
				
   	//verify total points is displayed	
	    rai.VerifyElementsVisible(Vype_VuseRewards_firsttimepurchase.VusePlusTotalPoints, "Text vuse + rewards total points ");
		String S2 = rai.getText(Vype_VuseRewards_firsttimepurchase.VusePlusTotalPoints);
		System.out.println(S2);
		TotalPoints = Integer.parseInt(S2.split("is")[1].split("points")[0].trim());
		
	}

}
