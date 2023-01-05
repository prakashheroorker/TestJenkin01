package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_ElectricStripeCollection {

	public static By Strip(String strip)
	{
		return By.xpath("(//*[contains(text(),'"+strip+"')])[2]/../button[1]");
	}
	
	
	public static final By EelectricStrip = By.xpath("//*[contains(text(),'Electric Stripe')]/..");
	
	public static final By EelectricStripPge = By.xpath("(//*[contains(text(),'CHOOSE')])[1]/..");
	
	public static final By StripPge = By.xpath("(//*[contains(text(),'ELECTRIC STRIPE')])/..");
	
	public static final By AddtoCart = By.xpath("(//*[contains(text(),'Add to cart')])/..");
	
	public static final By Cost = By.xpath("(//*[contains(text(),'$1')])[1]");
	
	public static final By Widget = By.xpath("(//*[contains(@class,'styles__Container')])[1]");

}
