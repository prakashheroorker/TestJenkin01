package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_Redeem {

	
	
	

	public static By webAllFlavorsePodPage(String flavor) {
	    return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[1]/a");
	}
	



	public static By btnqtyincrement(String flavor) {
	    return By.xpath( "//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[3]//button[2]");
	}
	
	public static By btnadd(String flavor) {
	    return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//*[contains(text(),'ADD')]");
	}
	
	public static By Products = By.xpath("//*[text()='Product']");
	
	public static By PromotionDropdown = By.xpath("//*[contains(@class,'ApplyPromotion__IconWrap')]");
	
	public static By lnkRedeem = By.xpath("//*[contains(text(),'Redeem')]");
	
	public static By IncressPoints = By.xpath("(//*[contains(@class,'RedeemForm__RoundButton')])[2]");
	
	public static By Redeembtn = By.xpath("//*[contains(text(),'Redeem')]");
	
	public static By Rewards = By.xpath("//*[text()='Rewards']/../..");
	
	public static By RewardsRedemption = By.xpath("(//*[text()='Reward Redemption'])[1]");
	
	public static By History = By.xpath("(//*[text()='Today'])[1]");
	
	public static By btnCheckOut=By.xpath("//*[text()='Checkout']");
	
	public static By btnAccount = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/following-sibling::div[3]");
	
	public static By MyRewards = By.xpath("(//*[text()='My Rewards'])[1]");
	
	public static By DiscountPrice = By.xpath("//*[contains(text(),'Rewards')]/../following-sibling::strong");
	
	public static By TotalAmount = By.xpath("//*[contains(text(),'One time ')]/following-sibling::strong");
	
	public static By SubTotal = By.xpath("//*[text()='Subtotal']/following-sibling::strong");
	
	public static By VuseRewards = By.xpath("(//*[contains(text(),'Vuse Rewards')])[3]");
	
	public static By WorngMsg = By.xpath("//*[contains(text(),'The points')]");
	
	//Updated Bhavitha
	public static By incrementbttn = By.xpath("(//*[contains(@class,'RedeemForm__RoundButton')])[2]");
	
	public static By decrementbttn = By.xpath("(//*[contains(@class,'RedeemForm__RoundButton')])[1]");
	
	public static By Points = By.xpath("(//*[contains(@class,'InputField__Input') and @value])[1]");
	
	public static By WarningMesg = By.xpath("//*[contains(text(),'The points')]");
	
	//public static By MultipackDiscount = By.xpath("//*[contains(text(),'MULTIPACK 5')]/../following-sibling::strong");

	public static By MultipackDiscount = By.xpath("//*[contains(text(),'MULTIPACK 5')]/../following-sibling::strong");
	
	public static By NoThanks = By.xpath("//*[contains(text(),'No thanks')]");
	
	public static By CongratesPopUp = By.xpath("//*[contains(text(),'Congratulations! ')]");
	
	public static final By ExciseTax = By.xpath("//*[text()='Excise Tax']");
	
	public static final By ExciseTaxAmount = By.xpath("//*[text()='Excise Tax']/following-sibling::strong");
	
	public static final By RedeemedPoints = By.xpath("(//*[contains(text(),'Reward Redemption')])[1]");
	
	public static final By RedeemedPoint = By.xpath("(//*[contains(text(),'Reward Redemption')])[1]");
	
	public static final By PurchasePoints = By.xpath("(//*[text()='Purchase'])[1]/..");
	
	
}
