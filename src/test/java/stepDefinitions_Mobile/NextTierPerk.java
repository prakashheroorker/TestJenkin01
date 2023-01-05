package stepDefinitions_Mobile;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions_Mobile;
import com.rai.framework.RAI_Mobile_Utility_Functions;

import cucumber.api.java.en.Then;
import goVype_Properties_mobile.Vype_NextTierPerk;


public class NextTierPerk extends BaseClass {
	
	RAI_Mobile_Utility_Functions rai = new RAI_Mobile_Utility_Functions();
	CommonFunctions_Mobile function = new CommonFunctions_Mobile(rai);
	
	@Then("^Verify that user is navigated to Rewards page with relevant information in mobile$")
	public void verify_that_user_is_navigated_to_Rewards_page() throws Throwable {
		rai.VerifyElementsVisible(Vype_NextTierPerk.pgRewrdsUI, "Rewards Page is displayed");
		// Verify Current Tier and Next Tier Progression Bar is displayed
		rai.VerifyPageObject(Vype_NextTierPerk.imgNextTierChart, "Current and Next Tier Images are present");
		// Verify Lifetime earned points are displayed
		rai.VerifyElementsVisible(Vype_NextTierPerk.txtLifetimepoints, "Life Time Earned Points are displayed");
		rai.SwipeDownSmallerUnits(1);
		// Verify Points Graph is displayed
		rai.isObjectPresent(Vype_NextTierPerk.imgpointsGraph, "Current Points Graph is present");
		// Verify Current Points are displayed
		rai.VerifyElementVisible(Vype_NextTierPerk.txtcurrentPoints, "Current available Points are displayed");
		
		String CurrentPoints = rai.getText(Vype_NextTierPerk.txtcurrentPoints);
		System.out.println("The Current Points are : \n " +CurrentPoints);
		
		rai.VerifyElementsVisible(Vype_NextTierPerk.txtPointsaway, "Points Away from Gold");
		
		String Awayfrom_NextTier = rai.getText(Vype_NextTierPerk.txtPointsaway);
		System.out.println("Next Tier is :" + Awayfrom_NextTier);
	}

	@Then("^Scroll down the Rewards Page to see the Next Tier Gold Perks and its content in mobile$")
	public void scroll_down_the_Rewards_Page_to_see_the_Next_Tier_Gold_Perks() throws Throwable {
	  //  rai.scrolltoXPath(rdriver, "//*[contains(@class,'Badge__BadgesContainer')]");
	  //  rai.SwipeDownSmallerUnits(4);
		
	    rai.ScrollByxpath(Vype_NextTierPerk.txtperks);
	    rai.SwipeDownSmallerUnits(1);
	    
	    String Gold =rai.getText(Vype_NextTierPerk.txtNextTierPerks);
		rai.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Gold);
		System.out.println("The Gold level is : \n" + Gold);
		
		List<WebElement> lst =rai.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Gold Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			rai.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}
		}
	@Then("^Scroll down the Rewards Page to see the Next Tier Platinum Perks and its content in mobile$")
		public void scroll_down_the_Rewards_Page_to_see_the_Next_Tier_Platinum_Perks() throws Throwable {
		 
		    rai.ScrollByxpath(Vype_NextTierPerk.txtperks);
		    rai.SwipeDownSmallerUnits(1);
		    String Platinum =rai.getText(Vype_NextTierPerk.txtNextTierPerks);
			rai.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Platinum);
			System.out.println("The Platinum level is : \n" + Platinum);

			List<WebElement> lst =rai.findElementsList(Vype_NextTierPerk.txtBenefits);
			System.out.println("The Platinum Tier Benefits are :" +lst.size());
			for(int i=0;i<lst.size();i++)
			{
				String Benefits =lst.get(i).getText();
				System.out.println((i+1)+". "+ Benefits);
				rai.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
			}
	   }
	@Then("^Scroll down the Rewards Page to see the Next Tier Premium Perks and its content in mobile$")
	    public void scroll_down_the_Rewards_Page_to_see_the_Next_Tier_Premium_Perks() throws Throwable {
	 
	    rai.ScrollByxpath(Vype_NextTierPerk.txtperks);
	    rai.SwipeDownSmallerUnits(1);
	    String Premium =rai.getText(Vype_NextTierPerk.txtNextTierPerks);
		rai.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Premium);
		System.out.println("The Premium level is : \n" + Premium);

		List<WebElement> lst =rai.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Premium Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			rai.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}
    }
    @Then("^Scroll down the Rewards Page to see the Next Tier Supreme Perks and its content in mobile$")
      public void scroll_down_the_Rewards_Page_to_see_the_Next_Tier_Supreme_Perks() throws Throwable {
 
    	rai.ScrollByxpath(Vype_NextTierPerk.txtperks);
    	rai.SwipeDownSmallerUnits(1);
    	String Supreme =rai.getText(Vype_NextTierPerk.txtNextTierPerks);
    	rai.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Supreme);
    	System.out.println("The Supreme level is : \n" + Supreme);

    	List<WebElement> lst =rai.findElementsList(Vype_NextTierPerk.txtBenefits);
    	System.out.println("The Supreme Tier Benefits are :" +lst.size());
    	for(int i=0;i<lst.size();i++)
    	{
		String Benefits =lst.get(i).getText();
		System.out.println((i+1)+". "+ Benefits);
		rai.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
    	}
    }




}
