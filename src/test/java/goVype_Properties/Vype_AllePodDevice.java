package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_AllePodDevice {

	
	
	
	public static By txtbbanner =By.xpath(".//*[contains(@class,'Banner__BannerInner')]");
	public static By lnkallfqs =By.xpath(".//*[text()='SEE ALL FAQS >']");
	public static By txttitles = By.xpath(".//*[@class='section-title']");
	public static By txttitle = By.xpath(".//*[text()='What do you need help with?']");
	public static By txtepod =By.xpath("Epod 2 | Vuse Canada");
	public static By lnklearnmore = By.xpath(".//*[text()='Learn more']");
	
	public static By weepoddevices= By.xpath(".//*[contains(@class,'Card__Slide-sc')]/..");
	
	public static By txtepod2= By.xpath(".//*[contains(@class,'Navigation__Container-sc')]/..//*[text()='ePod 2']");
	
	public static By txtepod2plus =By.xpath(".//*[contains(@class,'Navigation__Container-sc')]/..//*[text()='ePod 2+']");
	public static By txtcompare = By.xpath(".//*[text()='Compare and contrast']");
	
	public static By tabcompare = By.xpath(".//*[contains(@class,'CompareAndContrast__Flex')]");
	
	public static By txtfeatureacces = By.xpath(".//*[text()='Featured Accessories']");
	
	public static By tilesfeature = By.xpath(".//*[contains(@class,'FeaturedAccessories__Text-sc')]");
	
	public static By txtXU = By.xpath(".//*[text()='Experience VuseXu personalization']");
	
	public static By txtone =By.xpath(".//*[text()='ONE FOR ALL']");
	
	public static By txtjust =By.xpath(".//*[text()='JUST IN CASE']");
	
	public static By txtred =By.xpath(".//*[text()='RED MEANS GO']");
	
	public static By txtring =By.xpath(".//*[text()='PUT A RING ON IT']");
	
	public static By txtpower =By.xpath(".//*[text()='POWER ON AND ']");
	
	public static By txtengravings = By.xpath(".//*[text()='ENGRAVINGS']");
	
	public static By txtskin =  By.xpath(".//*[text()='SKINS COLLECTION']");
	
	
	public static By txttitles(int i) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[@class='section-title'])["+(i+1)+"]");
	}
	
	public static By txtfaq(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__Trigger-')]/..)["+(i+1)+"]");
	}
	
	public static By dropdown(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__IconWrap')])["+(i+1)+"]");
	}

	public static By tilesfeature(int i) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[contains(@class,'FeaturedAccessories__Text-sc')])["+(i+1)+"]");
	}
	
}
