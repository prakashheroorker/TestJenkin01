package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ConditionsOfSale {
	//Post Login Forgot Link		
	public static By lnkForgot = By.xpath(".//a[@to='/forgot-password/' and text()='Forgot?']");
	
	//ConditionsOfSale link from Home page
	public static By lnkConditionsOfSale = By.xpath("//a[contains(@href,'/pages/conditions-of-sale')]");

	//ConditionsOfSale Page 
	public static By pgeConditionsOfSale=By.xpath(".//h1[text()='Conditions of Sale']/../following-sibling::div");
	
	//ConditionsOfSale Page Content
	public static By weConditionsOfSaleContent = By.xpath(".//h1[text()='Conditions of Sale']/../following-sibling::div");

 
	
	//Support Email ID
	public static By lnkSupportEmailID = By.xpath(".//a[@href='mailto:support@govype.ca']");
	
	//Terms And Conditions Link
	public static By lnkTermsAndConditions=By.xpath(".//a[contains(@href,'/pages/terms-conditions')]");//a[@href='https://govype.ca/pages/terms-conditions']
	
	//Terms And Conditions Page
	public static By pgeTermsAndConditions=By.xpath(".//h1[text()='Terms & Conditions']");
	
	//Contact Us Link
	public static By lnkContactUs=By.xpath("(.//a[contains(@href,'/contact-us')])[1]");//.//a[@href='https://govype.ca/contact-us']
	
	//Contact Us Page
	public static By pgContactUsPage=By.xpath(".//h1[text()='Contact us']");
	
	//Cookie Policy Link
	public static By lnkCookiePolicy=By.xpath(".//a[contains(@href,'/cookie-policy')]");//.//a[@href='https://govype.ca/pages/cookie-policy']
	
	//Sublink of conditions of sale Cookie Policy Link
	public static By lnkPolicy=By.xpath("(.//a[contains(@href,'/cookie-policy')])[2]");
	
	//Cookie Policy
	public static By pgCookiePolicy=By.xpath(".//h1[text()='Cookie Policy']");
	
	//Delivery And Return Policy Link
	public static By lnkDeliveryAndReturnPolicy=By.xpath(".//a[@href='https://govype.ca/pages/delivery-returns']");
	
	//Delivery And Return Policy
	public static By pgDeliveryAndReturnPolicy=By.xpath(".//h1[text()='Delivery & Returns']");

	public static By lnkinfoSupportEmailID = By.xpath("//a[@href='mailto:info.ca@vuse.com']");
	
	
	
	
}
