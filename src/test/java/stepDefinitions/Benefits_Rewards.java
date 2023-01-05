package stepDefinitions;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties.Vype_Benefits_Rewards;
import goVype_Properties.Vype_CommonXpath;

public class Benefits_Rewards extends BaseClass {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	String points="";
	float i,k,m;
	String pointsNum;
	@Then("^Verify Whether Silver graph Is Displayed$")
	public void verify_Whether_Silver_Card_Is_Displayed() throws Throwable {
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.silverimage, "Silverimage");

		 String str=gl.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		 
		 i = Integer.parseInt(str);
		 
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.silvercard, "silvercard");
		
	}
	@Then("^verify the purchase points in the rewards page$")
	public void verify_the_purchase_points_in_the_rewards_page() throws Throwable {
		 
		 String str3=gl.getText(Vype_Benefits_Rewards.TotalAmount);
		 pointsNum=str3.substring(1);
		 
		m=Float.parseFloat(pointsNum);
		m=m*10;
		System.out.println(Math.round(m));
		m=m+i;
		System.out.println(Math.round(m));
		

		gl.clickbuttonUsingSelenium(Vype_CommonXpath.btnAccount, "Post Login Vype Home");
		Thread.sleep(2000);
		gl.clickbuttonUsingSelenium(Vype_CommonXpath.lnkRewards, "Rewards");
		Thread.sleep(2000);
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.rewardspage, "rewards");
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.lifetimepoints, "points");
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.points,"points");
		
		
		String str2=gl.getText(Vype_Benefits_Rewards.points1).replace(",", "");
		 System.out.println("current points in reward page after order "+str2);
		
		 k = Float.parseFloat(str2);
		 if(k==m) {
			 System.out.println("points in rewards page"+k);
		 }
		 
		 
		 
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.currentpoints, "currentpoints");
		
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.purchasepoints, "purchase");
		
		String str1=gl.getText(Vype_Benefits_Rewards.purchasepoint);
		System.out.println("purchase points "+str1);
		
		
	}
	
	@Then("^Verify Whether gold graph Is Displayed$")
	public void verify_Whether_gold_graph_Is_Displayed() throws Throwable {
		
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.goldimage, "goldimage");

		 String str=gl.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		 
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.goldcard, "silvercard");
	}
		@Then("^Verify Whether Platinum graph Is Displayed$")
		public void verify_Whether_Platinum_graph_Is_Displayed() throws Throwable {
      gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.platinumimage, "platinumimage");

		 String str=gl.getText(Vype_Benefits_Rewards.points1);
		 System.out.println("current points in reward page before order "+str);
		 
      gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.platinumcard, "platinumcard");
		}
		@Then("^Verify Whether Premium graph Is Displayed$")
		public void verify_Whether_Premium_graph_Is_Displayed() throws Throwable {
			gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.premium, "premium");

			 String str=gl.getText(Vype_Benefits_Rewards.points1);
			 System.out.println("current points in reward page before order "+str);
			 
			gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.premiumcard, "premiumcard");
		}
		@Then("^Verify Whether Supreme graph Is Displayed$")
		public void verify_Whether_Supreme_graph_Is_Displayed() throws Throwable {
		gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.supremeimage, "supereme");
		
		String str=gl.getText(Vype_Benefits_Rewards.points1);
		System.out.println("current points in reward page before order "+str);
		 
		 gl.fnVerifyObjectDisplayed(Vype_Benefits_Rewards.supremecard, "Supremecard");
		
}
}



