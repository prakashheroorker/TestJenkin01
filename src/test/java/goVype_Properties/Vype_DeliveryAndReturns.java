package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_DeliveryAndReturns {
	//DeliveryAndReturns link from Home page
	public static By lnkDeliveryNReturns = By.xpath(".//*[@href='/pages/delivery-returns']");

	// DeliveryAndReturns Page 
	public static By pgeDeliveryAndReturns=By.xpath(".//h1[text()='Delivery & Returns']");
	
	//DeliveryAndReturns page content
	public static By weDeliveryNReturnsContent = By.xpath(".//*[@class='Section__Container-sc-2cfreo-0 dOlTOC']");
	
	//Support Email ID
	public static By lnkSupportEmailID = By.xpath(".//a[@href='mailto:support@govype.ca']");
	
	//Delivery
		public static By lnkDelivery=By.xpath("(.//*[text()='Delivery'])");
		
	
}
