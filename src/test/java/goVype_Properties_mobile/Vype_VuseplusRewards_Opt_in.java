package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_VuseplusRewards_Opt_in {

	public static By VusePlusCheckbox  = By.xpath("(.//*[contains(text(),'I want to join the Vuse Rewards loyalty program! ')])[1]");
	public static By VuseRewardsModal = By.xpath("//h3[text()='VUSE REWARDS']");
	public static By BtnJoinVuseRewards =By.xpath("(//*[text()='JOIN NOW'])[2]") ;
	public static By NextTierProgressionBar  =By.xpath("//div[@class='TierChart__Container-sc-15eyx4m-0 ewsTGI']") ;
	public static By LifetimeEarnedPoints  =By.xpath("//p[text()='Lifetime earned points ']") ;
	public static By CurrentPointGraph  =By.xpath("//p[text()='Current points']") ;
	public static By RewardsHistorySection  =By.xpath("//h2[text()='Your history']") ;
	//public static By SubscribeNewsletterPoints  =By.xpath("//span[text()='JOIN NOW']") ;
//	public static By Opt_inOfferPoints  =By.xpath("//span[text()='JOIN NOW']") ;
	public static By SubscribeNewsletterPoints  =By.xpath("//td[text()='Subscribe to Newsletter']//following-sibling::td") ;
	public static By Opt_inOfferPoints  =By.xpath("//td[text()='Opt-in Offer']//following-sibling::td") ;
	public static By Opt_inOfferttxt  =By.xpath("//td[text()='Opt-in Offer']") ;
	public static By SubscribeNewslettertxt   =By.xpath("//td[text()='Subscribe to Newsletter']") ;
	

}
