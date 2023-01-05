package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_VuseRewards_firsttimePurchase {

	public static By OrderConfirmationBlueBanner = By.xpath("//div[@class='OrderConfirmationBanner__Wrapper-sc-1670l7p-1 jttqUS']");
	public static By VusePlusEarnedPoints = By.xpath("//span[contains(text(),'You have earned ')]");
	public static By VusePlusTotalPoints = By.xpath("//span[contains(text(),'Your total points balance is')]");
	public static By VusePlusCurrentPoints= By.xpath("//span[@class='PointsChart__Points-sc-no6n7i-7 fsqkqA']");
	public static By txtfirsttimePurchaseBonus = By.xpath("//td[text()='First Time Purchase Bonus']");
	public static By txtPurchasePoints= By.xpath("//td[text()='Purchase']");
	public static By firsttimePurchaseBonus = By.xpath("//td[text()='First Time Purchase Bonus']//following-sibling::td");
	public static By PurchasePoints = By.xpath("//td[text()='Purchase']//following-sibling::td");
	
	

}
