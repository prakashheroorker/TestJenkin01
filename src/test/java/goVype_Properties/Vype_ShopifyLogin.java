package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ShopifyLogin {

	//Link Log in here
	public static By lnkLoginHere=By.xpath("(.//*[@href='/admin'])[1]");

	//Email TextField
	public static By txtEmail=By.xpath("(.//*[@type='email'])[1]");

	//Button submit
	public static By btnSubmit=By.xpath("(.//*[@type='submit'])[1]");

	//Password TextField
	public static By txtPassword=By.xpath("(.//*[@type='password'])[1]");

	//Button Login
	public static By btnLogin=By.xpath("(.//*[@type='submit'])[1]");
	
	//Orders link
		public static By lnkOrders=By.xpath("(.//*[text()='Orders'])[1]");

		//Orders search field
		public static By txtSearchOrders=By.xpath("(.//*[@placeholder='Filter orders'])[1]");

		//Text "#OrderNumber" Order Number from the OrderPage of Shopify
		public static By weTxtOrderNumberN(String OrderNumber){

			return By.xpath("(.//*[contains(text(),'"+OrderNumber+"')])[1]");

		}

		//Text "$N" sub total value displayed from the Cart page
		public static By weTxtSubTotalValueN(String num){

			return By.xpath("(.//*[text()='$"+num+"'])[1]");

		}

		//scroll to view subtotal
		public static By weContactInformation = By.xpath(".//*[text()='Contact information']");

		//Applied discount text
		public static By weTxtAppliedDiscount = By.xpath(".//*[text()='Discount']//following-sibling::td[contains(text(),'$')]");


		//Discount row
		public static By weTxtDiscount = By.xpath(".//table//*[text()='Discount']");

		//Shopify Total Value
		public static By wetxtTotal=By.xpath("//*[@class='order-details__summary__paid_by_customer']//td[contains(text(),'$')]");



}
