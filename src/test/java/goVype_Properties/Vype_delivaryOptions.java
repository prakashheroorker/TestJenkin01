package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_delivaryOptions {
	
	
	
	
	// Click on Not Now Button
		public static By btnNotnow = By.xpath("//*[text()='NO THANKS']");
	
	//text shipping options
		public static By txtshippingoptions=By.xpath("//*[contains(text(),'How would ')]/..");
		public static By txtskin(String skin)
		{
			return By.xpath("(//*[text()='"+skin+"'])[2]");
		}
		
		//shipping options
		public static By shippingoptions=By.xpath("(//*[contains(@class,'SelectBox__Container')])");

		//Subtotal total
         public static By subtotl=By.xpath("//*[text()='Subtotal']/following-sibling::strong");
 
         
       // Avliable options
         public static By ShipOptions=By.xpath("(//*[contains(@class,'SelectBox__Container')])");
}
