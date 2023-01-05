package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_podcaps {

	public static By ePodcaps = By.xpath("//*[text()='Pod Caps']");
	
	public static By amount = By.xpath("//*[text()='$3.99']");
	
	public static By plusbtn = By.xpath("(.//*[text()='Pod Caps']/../.././..//*[contains(@class,'QuantityPicker__Button')])[2]");
			// "(//*[@class='QuantityPicker__Button-sc-v6i9u9-1 fcILyn'])[6]");
	
	public static By minusbtn = By.xpath("(.//*[text()='Pod Caps']/../.././..//*[contains(@class,'QuantityPicker__Button')])[1]");
			//"(//*[@class='QuantityPicker__Button-sc-v6i9u9-1 fcILyn'])[5]");
	
	public static By Addbtn = By.xpath("(//*[@class='AccessoryDropdown__Trigger-sc-1rimysr-2 fEKpt'])[2]");
	
	public static By dropdown = By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 kkrdTf'])[5]");
	

	public static By clearIndigo = By.xpath("//*[@class='Accessory__Swatch-sc-6l5mf2-13 kmGjgQ swatch-selected']");
	
	public static By yellow = By.xpath("//*[@class='Accessory__Swatch-sc-6l5mf2-13 eBKOPG']");

	public static By ePodcapsbtn = By.xpath("//*[@alt='Pod Caps']");
	
	public static By ePodcapsPage = By.xpath("//h1[text()='Pod Caps']");
	
	public static By ePodcapsContent = By.xpath("//*[text()='2 caps/pack. Device and pod sold separately.']");
	
	public static By ePodcapsDes = By.xpath("//*[text()='Protect your Pod with our pod caps to keep it clean. Prioritize hygiene and cleanliness and keep away from unwanted dust and debris when you’re on the go.']");
	
	public static By ClearandIndigo = By.xpath("//*[@data-tip='Clear & Indigo']");
	
	public static By RedandYellow = By.xpath("//*[@data-tip='Red & Yellow']");
	
	public static By minus = By.xpath("(//*[@class='QuantityPicker__Button-sc-v6i9u9-1 ktllwy'])[1]");
	
	public static By plus = By.xpath("(//*[@class='QuantityPicker__Button-sc-v6i9u9-1 ktllwy'])[2]");
	
	public static By AddToCart = By.xpath("//*[text()='Add to cart']");
	
	public static By Leftcarousel = By.xpath("(//*[@data-role='none'])[1]");
	
	public static By Rightcarousel = By.xpath("(//*[@data-role='none'])[2]");
	
	public static By colour(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']");
	}
	
/*	public static By DeviceColour(String colour)
	{
		return By.xpath("//*[@alt='"+colour+"']");
	}
	
	*/
	public static By DeviceColour(String colour)
	{
		return By.xpath("(//img[@alt='"+colour+"'])[3]");
	}
	
	public static By ColourName(String colour)
	{
		return By.xpath("//*[text()='"+colour+"']");
	}
	public static By OrderText = By.xpath("//*[contains(@class,'styles__EstimatedDate')]");
	//public static By OrderText = By.xpath("//*[text()='Order before ']");
}
