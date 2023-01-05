package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_personalizeyourepod_mobile {

	public static By EngravePage = By.xpath("(//*[@alt='Vuse X U'])[2]");
	
	public static By CoreCollection = By.xpath("(//*[@alt='Core collection'])[1]");
	
	public static By CoreCollectionPage = By.xpath("//*[text()='Pick device colour & design style']");
	
	public static By ElementsCollection = By.xpath("//*[text()='Elements Collection']");
	
	public static By colour(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']");
	}
	
	public static By Imgcolour(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']");
	}
	
	public static By BtnMiniIcon = By.xpath("//*[contains(text(),'Mini Icon')]");
	
	public static By btnminiicon(String icon)
	{
		return By.xpath("//*[contains(text(),'"+icon+"')]");
		
	}
	
	public static By btnAddMiniIcon = By.xpath("//*[contains(text(),'Add Mini Icon')]");
	
	public static By Step2 = By.xpath("//*[text()='02']");
	
	public static By AddToCart = By.xpath("//*[text()='Add to cart']");
}
