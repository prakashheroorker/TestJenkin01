package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_MyAccount {
//Link MyAccount in Home page
	public static By lnkContactUs=By.xpath(".//*[@href='/contact-us']");
	//.//*[@class='AccountDropdown__Dropdown-v80ema-2 cuRsoB']
	//MyAccounts link
	public static By lnkMyAccounts = By.xpath(".//*[@href='/account/rewards']");
	
	//MyAccounts page
	public static By pgMyAccounts = By.xpath(".//*[@class='Tabs__Inner-sc-15p5she-2 jALwXL']");
	
	//Profile link
	public static By lnkProfile = By.xpath("//*[contains(@class,'AccountDropdown')]//*[contains(@class,'Icon')]");
			// ".//*[@href='/account']");
	
	//Profile page
	public static By pgProfile = By.xpath(".//*[@class='Profile__Header-joucly-0 hQbCvE']");
	
	//Profile Email Address
	public static By weProfileEmail = By.xpath("//*[text()='Email address']/following-sibling::p");
		
	// Profile Phone Number
	public static By wePhoneNumber = By.xpath("//*[text()='Phone number']/following-sibling::p");
	
	
}
