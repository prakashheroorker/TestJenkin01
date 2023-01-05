package stepDefinitions_Mobile;

import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties_mobile.Vype_Benefits_Rewards;


public class Benefits_Rewards {

	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	String points="";
	float i,k,m;
	String pointsNum;
	@Then("^Verify Whether Silver graph is Displayed$")
	public void verify_Whether_Silver_graph_is_Displayed() throws Throwable {
	    
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.silverimage, "Silverimage");

		 String str=rai.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		 
		 str = str.replace(",","");
		 i = Float.parseFloat(str);
		 
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.silvercard, "silvercard");
	}

	
	/*
	 * @Then("^Add quantity for onetime purchase and click on Add to cart$") public
	 * void add_quantity_for_onetime_purchase_and_click_on_Add_to_cart(String count)
	 * throws Throwable {
	 * 
	 * boolean
	 * b1=rai.verifyobjectisnotavailable(Vype_Benefits_Rewards.btnonetimepurchase);
	 * 
	 * if(b1==true) {
	 * 
	 * rai.ScrollByxpath(Vype_Benefits_Rewards.btnstrength); int flavorcount =
	 * Integer.parseInt(count); for(int i=0;i<flavorcount;i++) {
	 * rai.clickUsingJs(Vype_Benefits_Rewards.btnstrength, "+ "); }
	 * 
	 * 
	 * rai.clickUsingJs(Vype_Benefits_Rewards.btnAddToCART, "Add to cart "); }
	 * if(b1==false) {
	 * 
	 * //one time purchase
	 * rai.clickUsingJs(Vype_Benefits_Rewards.btnonetimepurchase,
	 * "One time purchase ");
	 * 
	 * rai.ScrollByxpath(Vype_Benefits_Rewards.btnstrength); int flavorcount =
	 * Integer.parseInt(count); for(int i=0;i<flavorcount;i++) {
	 * rai.clickUsingJs(Vype_Benefits_Rewards.btnstrength, "+ "); }
	 * 
	 * 
	 * rai.clickUsingJs(Vype_Benefits_Rewards.btnAddToCART, "Add to cart "); }
	 */
	//}

	@Then("^verify the purchase points in the Rewards page$")
	public void verify_the_purchase_points_in_the_Rewards_page() throws Throwable {
		String str3=rai.getText(Vype_Benefits_Rewards.TotalAmount);
		 pointsNum=str3.substring(1);
		 
		m=Float.parseFloat(pointsNum);
		m=m*8;
		System.out.println("PointsGained "+m);
		System.out.println(Math.round(m));
		m=m+i;
		System.out.println("current points "+m);
		
		System.out.println(Math.round(m));
		

		rai.clickbutton(Vype_Benefits_Rewards.btnAccount, "Post Login Vype Home");
		Thread.sleep(2000);
		rai.clickLink(Vype_Benefits_Rewards.lnkRewards, "Rewards");
		Thread.sleep(2000);
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.rewardspage, "rewards");
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.lifetimepoints, "points");
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.points,"points");
		
		
		String str2=rai.getText(Vype_Benefits_Rewards.points1).replace(",", "");
		 System.out.println("current points in reward page after order "+str2);
		
		 k = Float.parseFloat(str2);
		 if(k==m) {
			 System.out.println("points in rewards page"+k);
		 }
		 
		 
		 
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.currentpoints, "currentpoints");
		
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.purchasepoints, "purchase");
		
		String str1=rai.getText(Vype_Benefits_Rewards.purchasepoint);
		System.out.println("purchase points "+str1);
		
	}
	
	@Then("^Verify Whether gold graph is Displayed$")
	public void verify_Whether_gold_graph_is_Displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.goldimage, "goldimage");

		 String str=rai.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		// i = Float.parseFloat(str);
		 
	rai.VerifyElementsVisible(Vype_Benefits_Rewards.goldcard, "silvercard");
	}
	@Then("^Verify Whether Platinum graph is Displayed$")
	public void verify_Whether_Platinum_graph_is_Displayed() throws Throwable {
		
		  rai.VerifyElementsVisible(Vype_Benefits_Rewards.platinumimage, "platinumimage");

			 String str=rai.getText(Vype_Benefits_Rewards.points1);
			 System.out.println("current points in reward page before order "+str);
			 
			 rai.VerifyElementsVisible(Vype_Benefits_Rewards.platinumcard, "platinumcard");
			 
	}
	@Then("^Verify Whether Premium graph is Displayed$")
	public void verify_Whether_Premium_graph_is_Displayed() throws Throwable {
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.premium, "premium");

		 String str=rai.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		 
		rai.VerifyElementsVisible(Vype_Benefits_Rewards.premiumcard, "premiumcard");
	}
	
	@Then("^Verify Whether Supreme graph is Displayed$")
	public void verify_Whether_Supreme_graph_is_Displayed() throws Throwable {
rai.VerifyElementsVisible(Vype_Benefits_Rewards.supremeimage, "supereme");
		
		String str=rai.getText(Vype_Benefits_Rewards.points1);
		System.out.println("current points in reward page before order "+str);
		 
		 rai.VerifyElementsVisible(Vype_Benefits_Rewards.supremecard, "Supremecard");
	}

}
