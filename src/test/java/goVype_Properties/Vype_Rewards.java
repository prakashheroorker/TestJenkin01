package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_Rewards 
{
	//Rewards page element
	public static By pgRewards = By.xpath("(.//a[@href='/ca/en/account/rewards/'])");
	// ".//*[contains(@class,'TierCard')]//*[@tier]");
	
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
	public static By Yourhistory = By.xpath("(//*[contains(@class, 'AccountCard__SectionContainer')]//*[text()='Your history'])");
	
	public static By Yourperks = By.xpath("(//*[contains(@class, 'AccountCard__SectionContainer')]//*[text()='Your perks'])");
	
	public static By BadgeBirthday = By.xpath("//*[@class='Badge__Wrapper-sc-1w8jvlk-1 iMDjFf']//*[@alt='Birthday icon']");
	
//	public static By BadgeBirthday1 = By.xpath(".//*[contains(@class,'Badge__Wrapper-sc-1w8jvlk-1 gLnKpm')]//*[@alt='Birthday icon']");
	
	public static By txtBirthdaypoints = By.xpath("(//*[contains(@class, 'ActivityTable__Row')]//*[text()='Birthday'])/..");//*[contains(@class, 'ActivityTable__Row-sc-11bo538-1 ActivityTable__ActivityRow')]");

	public static By txtPurchase = By.xpath("(//*[contains(@class, 'ActivityTable__Row')]//*[text()='Birthday'])/..");//*[contains(@class, 'ActivityTable__Row-sc-11bo538-1 ActivityTable__ActivityRow')][2]");

	
}
