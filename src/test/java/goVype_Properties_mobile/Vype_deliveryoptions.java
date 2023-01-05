package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_deliveryoptions {
	
	
	//Subtotal total
    public static By Subtotl=By.xpath("//*[text()='Subtotal']/following-sibling::strong");

  //+ button to add more Products
  	public static By BtnAdd = By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");
  	
  	
  	public static By Dilvryoptions=By.xpath("(.//*[contains(@class,'Section__Block')])[2]");

  //Go to delivery button
  	public static By BtnGoToDelivery=By.xpath("//*[text()='Go to delivery']");
  	
  	
  //text shipping options
  		public static By Txtshippingoptions=By.xpath("//*[contains(text(),'How would ')]/..");
  		public static By txtskin(String skin)
  		{
  			return By.xpath("(//*[text()='"+skin+"'])[2]");
  		}
  		
  		
  	// Avliable options
        public static By shipOptions=By.xpath("(//*[contains(@class,'SelectBox__Container')])");

      //shipping options
       public static By ShippingOptions=By.xpath("(//*[contains(@class,'SelectBox__Container')])");




}