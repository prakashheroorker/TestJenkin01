package stepDefinitions;

import java.util.List;


import org.openqa.selenium.WebElement;

import com.rai.framework.BaseClass;
import com.rai.framework.CommonFunctions;
import com.rai.framework.RAI_Desktop_Utility_Functions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import goVype_Properties.Vype_NextTierPerk;



public class NextTierPerk extends BaseClass {
	
	RAI_Desktop_Utility_Functions gl = new RAI_Desktop_Utility_Functions();
	CommonFunctions function = new CommonFunctions(gl);
	
	

	@Then("^Verify the user is navigated to Rewards page with relevant information$")
	public void verify_the_user_is_navigated_to_Rewards_page_with_relavant_information() throws Throwable {
	    
		gl.VerifyPageDisplayed(Vype_NextTierPerk.pgRewardsSection, "Rewards Page is displayed");
		// Verify Current Tier and Next Tier Progression Bar is displayed
		gl.VerifyObjectDisplayed(Vype_NextTierPerk.imgTierChart, "Current and Next Tier Images are present");
		// Verify Lifetime earned points are displayed
		gl.VerifyElementVisible(Vype_NextTierPerk.txtLifetimePoints, "Life Time Earned Points");
		gl.ScrollPageDown();
		
		// Verify Points Graph is displayed
		gl.VerifyElementVisible(Vype_NextTierPerk.imgPointsGraph, "Current Points Graph is present");
		// Verify Current Points are displayed
		gl.VerifyElementVisible(Vype_NextTierPerk.txtCurrentPoints, "Current available Points");
		
		String currentPoints = gl.getText(Vype_NextTierPerk.txtCurrentPoints);
		System.out.println("The Current Points are : \n " +currentPoints);

		gl.VerifyElementVisible(Vype_NextTierPerk.txtPointsAway, "Points Away from Gold");
		
		String AwayFromNextTier = gl.getText(Vype_NextTierPerk.txtPointsAway);
		System.out.println("Next Tier is :" + AwayFromNextTier);

		
	}

	@And("^Scroll down the Rewards Page to see Next Tier Gold Perks and its content$")
	public void scroll_down_the_Rewards_Page_to_see_Next_Tier_Gold_Perks_and_its_content() throws Throwable {
		
		gl.fnScrollToView(Vype_NextTierPerk.txtPerks);
		
		//gl.VerifyElementVisible(Vype_NextTierPerk.txtGoldPerks, "Only 820 points away from the Gold Perks");
		
		String Gold =gl.getText(Vype_NextTierPerk.txtNextTierPerks);
		gl.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Gold);
		System.out.println("The Gold level is : \n" + Gold);

		List<WebElement> lst =gl.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Gold Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			gl.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}

	}
	@And("^Scroll down the Rewards Page to see Next Tier Platinum Perks and its content$")
	public void scroll_down_the_Rewards_Page_to_see_Next_Tier_Platinum_Perks_and_its_content() throws Throwable {
		
		gl.fnScrollToView(Vype_NextTierPerk.txtPerks);
		
		String Platinum =gl.getText(Vype_NextTierPerk.txtNextTierPerks);
		gl.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Platinum);
		System.out.println("The Platinum level is : \n" + Platinum);

		List<WebElement> lst =gl.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Platinum Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			gl.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}
	}
	
	@And("^Scroll down the Rewards Page to see Next Tier Premium Perks and its content$")
	public void scroll_down_the_Rewards_Page_to_see_Next_Tier_Premium_Perks_and_its_content() throws Throwable {
		
		gl.fnScrollToView(Vype_NextTierPerk.txtPerks);
		
		String Premium =gl.getText(Vype_NextTierPerk.txtNextTierPerks);
		gl.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Premium);
		System.out.println("The Premium Tier level is : \n" + Premium);

		List<WebElement> lst =gl.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Premium Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			gl.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}
	}
	
	@And("^Scroll down the Rewards Page to see Next Tier Supreme Perks and its content$")
	public void scroll_down_the_Rewards_Page_to_see_Next_Tier_Supreme_Perks_and_its_content() throws Throwable {
		
		gl.fnScrollToView(Vype_NextTierPerk.txtPerks);
		
		String Supreme =gl.getText(Vype_NextTierPerk.txtNextTierPerks);
		gl.VerifyElementVisible(Vype_NextTierPerk.txtNextTierPerks, Supreme);
		System.out.println("The Supreme level is : \n" + Supreme);

		List<WebElement> lst =gl.findElementsList(Vype_NextTierPerk.txtBenefits);
		System.out.println("The Supreme Tier Benefits are :" +lst.size());
		for(int i=0;i<lst.size();i++)
		{
			String Benefits =lst.get(i).getText();
			System.out.println((i+1)+". "+ Benefits);
			gl.VerifyElementVisible(Vype_NextTierPerk.txtBenefits, Benefits);
		}
	}

	
}
