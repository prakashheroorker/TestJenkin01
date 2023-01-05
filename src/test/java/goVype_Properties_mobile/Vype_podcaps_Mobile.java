package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_podcaps_Mobile {

	public static By ePodcaps = By.xpath("//*[text()='Pod Caps']");
	
	public static By amount = By.xpath("//*[text()='$3.99']");
	
	public static By plusbtn = By.xpath("(//*[contains(@class, 'QuantityPicker__Button')])[6]");
	
	public static By minusbtn = By.xpath("(//*[contains(@class, 'QuantityPicker__Button')])[5]");
	
	public static By Addbtn = By.xpath("(//*[@class='AccessoryDropdown__Trigger-sc-1rimysr-2 fEKpt'])[2]");
	
	public static By dropdown = By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 kkrdTf'])[5]");
	
	public static By clearIndigo = By.xpath("//*[@class='Accessory__Swatch-sc-6l5mf2-13 kmGjgQ swatch-selected']");

	public static By yellow = By.xpath("//*[@class='Accessory__Swatch-sc-6l5mf2-13 eBKOPG']");

	public static By ePodcapsbtn = By.xpath("//*[@alt='Pod Caps']");
	
	public static By ePodcapsPage = By.xpath("//h1[text()='Pod Caps']");
	
	public static By ePodcapsContent = By.xpath("//*[text()='2 caps/pack. Device and pod sold separately.']");
	
	public static By ePodcapsDes = By.xpath("(//*[contains(text(),'Protect your Pod with our pod caps')])[2]");
	
	public static By ClearandIndigo = By.xpath("//*[@data-tip='Clear & Indigo']");
	
	public static By RedandYellow = By.xpath("//*[@data-tip='Red & Yellow']");
	
	public static By minus = By.xpath("(//*[contains(@class, 'QuantityPicker__Button')])[1]");
	
	public static By plus = By.xpath("(//*[contains(@class, 'QuantityPicker__Button')])[2]");
	
	public static By AddToCart = By.xpath("//*[text()='Add to cart']");
	
	public static By Leftcarousel = By.xpath("(//*[@data-role='none'])[1]");
	
	public static By Rightcarousel = By.xpath("(//*[@data-role='none'])[2]");
	
	public static By colour(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']");
	}
	
	public static By DeviceColour(String colour)
	{
		return By.xpath("(//*[@alt='"+colour+"'])[3]");
	}
	
	public static By ColourName(String colour)
	{
		return By.xpath("//*[text()='"+colour+"']");
	}
	
	//public static By OrderText = By.xpath("//*[text()='Order before ']");
	
	public static By OrderText = By.xpath("//*[text()='Free shipping on your first ']");
	public static By image = By.xpath("(//*[@alt='Clear & Indigo'])[3]");
}
