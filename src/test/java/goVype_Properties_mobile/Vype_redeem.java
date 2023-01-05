package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_redeem {

	
	public static By Promotiondropdown = By.xpath("//*[contains(@class,'ApplyPromotion__IconWrap')]");
	//public static By lnkRedeem = By.xpath("//*[contains(text(),'redeem')]");
	//public static By lnkRedeem = By.xpath("//*[text()='redeem']");
	
	//public static By Points = By.xpath("//*[@id=\"pointsAmount\"]");
	public static By Redeembtn = By.xpath("//*[contains(text(),'Redeem')]");
	public static By Rewards = By.xpath("//*[text()='Rewards']/../..");
	public static By DiscountPrice = By.xpath("//*[contains(text(),'Rewards')]/../following-sibling::strong");
	public static By SubTotal = By.xpath("//*[text()='Subtotal']/following-sibling::strong");
	public static By TotalAmount = By.xpath("//*[contains(text(),'One time ')]/following-sibling::strong");
	public static By WorngMsg = By.xpath("//*[contains(text(),'The points')]");
	
	
	//Updated bhavitha
	public static By MultipackDiscount = By.xpath("//*[contains(text(),'MULTIPACK 5')]/../following-sibling::strong");
	
	public static By NoThanks = By.xpath("//*[contains(text(),'No thanks')]");
	
	public static By CongratesPopUp = By.xpath("//*[contains(text(),'Congratulations! ')]");
	
	//public static By WorngMsg = By.xpath("//*[contains(text(),'The points')]");
	
	public static By incrementbttn = By.xpath("(//*[contains(@class,'RedeemForm__RoundButton')])[2]");
	
	public static By decrementbttn = By.xpath("(//*[contains(@class,'RedeemForm__RoundButton')])[1]");
	
	//public static By Points = By.xpath("(//*[contains(@class,'InputField__Input') and @value])[1]");
	
	public static By WarningMesg = By.xpath("//*[contains(text(),'The points')]");
	
	public static final By ExciseTax = By.xpath("//*[text()='Excise Tax']");
	
	public static final By ExciseTaxAmount = By.xpath("//*[text()='Excise Tax']/following-sibling::strong");
	
	public static By RewardsRedemption = By.xpath("(//*[contains(text(),'Reward Redemption')])[1]");
	
	public static By Points = By.xpath("(//input[@id='pointsAmount'])[1]");
	
	public static By lnkRedeem = By.xpath("//*[contains(text(),'Redeem')]");
}
