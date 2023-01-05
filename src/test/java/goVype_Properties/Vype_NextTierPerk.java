package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_NextTierPerk {

	// Verify Rewards Page is displayed
	public static By pgRewardsSection = By.xpath("//*[@alt = 'Vuse rewards']");
	
	// Verify Current Tier and Next Tier Progression Bar is displayed
	public static By imgTierChart = By.xpath("//*[contains(@class,'TierChart__Container')]");
	
	// Verify Lifetime earned points are displayed 
	public static By txtLifetimePoints = By.xpath("//*[text() = 'Lifetime earned points ']");
	
	// Verify Points Graph is displayed
	public static By imgPointsGraph = By.xpath("//*[contains(@class,'PointsChart__Container')]");
	
	// Verify Current Points are displayed
	public static By txtCurrentPoints = By.xpath("//*[contains(@class,'PointsChart__CurrentPoints')]");

	//Verify the text points away for Next Tier level(i.e, Gold,platinum,Premium, Supreme) is present
	public static By txtPointsAway = By.xpath("//*[contains(@class,'PointsChart__PointsAway')]");

	// Verify the Next Tier Benefits (i.e, Gold,platinum,Premium, Supreme) list is displayed
	public static By txtBenefits = By.xpath("//*[contains(@class,'NextTierBanner__Benefits')]//div//div//div//div/../..");

	// Verify Next Tier Perks (ie, Gold,platinum,Premium, Supreme)  Text is present
	public static By txtNextTierPerks = By.xpath("//*[contains(@class,'NextTierBanner__Title')]");

	// Verify Your Perks Section is displayed 
	public static By txtPerks = By.xpath("//*[contains(@class,'Badge__BadgesContainer')]");

	//*[contains(@class,'NextTierBanner__Benefits')]//div//div//div/../..
	
	
	
	
	
}
