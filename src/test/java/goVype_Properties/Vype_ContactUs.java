package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ContactUs {
//Link ContactUs in footer section pre-login
	public static By lnkContactUs=By.xpath(".//*[@href='/contact-us']");
	
	//ContactUs Page
	public static By pgContactUS = By.xpath(".//*[@class='typography__H4-vraxd4-3 lnJAdL' and text()='Contact us']");
	
	//Full Name field
	public static By txtFullName = By.xpath(".//input[@name='name']");
	
	//Email Address field
	public static By txtEmailAddress = By.xpath(".//input[@name='email']");
	
	//Phone Address field
	public static By txtPhone = By.xpath(".//input[@name='phoneNumber']");
	
	//Message field
	public static By txtMessage = By.xpath(".//textarea[@name='message']");
	
	//Send Message button
	public static By btnSendMessage = By.xpath(".//button[@class='Button__Container-sc-186nrqc-0 dBtxRE' and @type='submit']");
	
	//ContactUs footer section
	public static By weContactUsFooter = By.xpath("(//*[contains(text(),'Contact us')])[2]/../..");
	
	//Phone Icon
	public static By wePhoneIcon = By.xpath("(.//span[contains(@class,'ContactComponents')])[1]");
	
	//Location icon
	public static By weLocationIcon = By.xpath(".//*[@href='https://www.google.com/maps/place/Imperial+Tobacco+Canada+Limit%C3%A9e/@45.4817862,-73.5879825,17z/data=!3m1!4b1!4m5!3m4!1s0x4cc91a75ccc7a1c3:0x9ba1dea41d52a2e7!8m2!3d45.4817862!4d-73.5857938']");
	
	//GoogleMap Address
	public static By weGoogleAddress = By.xpath(".//*[text()='Imperial Tobacco Canada Limited']");
	
	//SupportID
	public static By weSupportID = By.xpath(".//*[contains(text(),'support@')]");
	
	
	
	
	
}
