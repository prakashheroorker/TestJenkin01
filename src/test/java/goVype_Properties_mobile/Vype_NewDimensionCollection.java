package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_NewDimensionCollection {

	
	public static By weepoddevice= By.xpath("//*[contains(@class,'Selection__List')]");

	public static By Strip(String strip)
	{
		return By.xpath("(//*[contains(text(),'"+strip+"')])[2]/../button[1]");
	
	}
	
 // public static final By ClickShop = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[1]/button/span");
	//*[contains(text(),'Shop')]

  //public static final By AllePoddevices = By.xpath("//*[contains(text(),'All ePod devices')]");
	
	public static final By ClickOnepod2 = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div[1]/div/section[1]/div/div/div[1]/button[2]");
	//*[contains(text(),'ePod 2')]
	
	public static final By NewDimension = By.xpath("//*[contains(text(),'New Dimension')]/..");
	
	public static final By NewDimensionPge = By.xpath("(//*[contains(text(),'CHOOSE')])[1]/..");
	
	
	public static final By StripPge = By.xpath("(//*[contains(text(),'New Dimension')])/..");
	
	public static final By AddtoCart = By.xpath("(//*[contains(text(),'Add to cart')])/..");
	
	public static final By Cost = By.xpath("(//*[contains(text(),'$1')])[1]");
	
	public static final By Widget = By.xpath("(//*[contains(@class,'styles__Container')])[1]");
	
	public static By SelectDevice(String Device)
	{
		return By.xpath("(//*[contains(text(),'"+Device+"')])/../button[1]");
	
	}
}
