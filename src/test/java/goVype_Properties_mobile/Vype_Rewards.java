package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Rewards 
{
	//Rewards page element
	public static By pgRewards = By.xpath("(.//a[@href='/ca/en/account/rewards/'])[2]");
			// "(.//a[@href='/ca/en/account/rewards/'])");
	
	public static By textRewards=By.xpath("(.//*[text()='Rewards'])");

	
	//Silver text in silver tier card
	public static By txtSilver = By.xpath(".//*[contains(@class,'TierCard')]//span[text()='silver']");
	
	//Green tick on birthday gift
	public static By weGreenTickBirthdayGift = By.xpath("(.//*[text()='Birthday gift']//preceding-sibling::div)[1]");
	
	//15% discount coupon copy code link
	public static By lnkCopyCode = By.xpath("(.//button[contains(@class,'Monthly')][text()='Copy '])");
	
	//Coup COde Text
	public static By txtCoupon15 = By.xpath(".//span[contains(@class,'MonthlyDiscounts__Code')]");
	
	//benefits of gold user
	public static By weTxtGoldProfileUser=By.xpath("(.//*[@class='TierBenefits__Content-sc-1bk8881-3 jWypOT'])[1]");
	
	
	/* Added by Harris on June 24 2022 */
	public static By Yourhistory1 = By.xpath("(//*[contains(@class, 'AccountCard__SectionContainer')]//*[text()='Your history'])");
	
	public static By Yourperks1 = By.xpath("(//*[contains(@class, 'AccountCard__SectionContainer')]//*[text()='Your perks'])");
	
	public static By BadgeBirthday1 = By.xpath("//*[@class='Badge__Wrapper-sc-1w8jvlk-2 fAISqI']//*[@alt='Birthday icon']");
	
//	public static By BadgeBirthday1 = By.xpath(".//*[contains(@class,'Badge__Wrapper-sc-1w8jvlk-1 gLnKpm')]//*[@alt='Birthday icon']");
	
	
	
	//-----------BirthdayBonus--------------//
	public static By txtBonus1 = By.xpath("(.//*[contains(@class,'PointsEarned__Code')])");
	public static By txtBirthdaypoints = By.xpath("(//*[text()='Birthday'])[2]/..");
	public static By txtPurchase = By.xpath("(//*[contains(@class, 'ActivityTable__Row')]//*[text()='Purchase'])/..");
	
}
