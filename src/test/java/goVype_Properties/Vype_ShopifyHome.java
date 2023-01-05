package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ShopifyHome {

	//Orders link
	public static By lnkOrders=By.xpath("(.//*[text()='Orders'])[1]");

	//Orders search field
	public static By txtSearchOrders=By.xpath("(.//*[@placeholder='Filter orders'])[1]");

	//Text "#OrderNumber" Order Number from the OrderPage of Shopify
	public static By weTxtOrderNumberN(String OrderNumber){

		return By.xpath("(.//*[text()='"+OrderNumber+"'])[1]");

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
