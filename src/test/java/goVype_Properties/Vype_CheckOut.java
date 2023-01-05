package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_CheckOut {
	//Text 'CheckOut'
	public static By pgCheckOut= By.xpath("//*[text()='Checkout']");

	//Go to delivery button
	public static By btnGoToDelivery=By.xpath("//*[text()='Go to delivery']");

	//Go to billing button
	public static By btnGoToBilling=By.xpath("(.//*[text()='Go to billing'])[1]");
	
	//
	public static By txtPhonunum=By.xpath("//*[@name='phoneNumber']");

	//click the check box
	public static By weChkoxIhaveReadTandC=By.xpath("(.//*[text()='I have read and agreed to the'])[1]");//(.//*[text()='I have read and agreed to the'])[1]

	//Submit Order button
	public static By btnSubmitOrder=By.xpath("(.//*[text()='Submit Order'])[1]");

	//Text Field Card Number
	public static By txtCardNumber=By.xpath("(.//*[@name='cardNumber'])[1]");

	//Text Field Card Expire
	public static By txtCardExpiryDate=By.xpath("(.//*[@name='expiry'])[1]");

	//Text Field CVV
	public static By txtCVV=By.xpath("(.//*[@name='cvv'])[1]");

	//Text Field Name on Card
	public static By txtNameOnCard=By.xpath("(.//*[@name='fullName'])[1]");

	//Check box Save Card details for future Orders.
	public static By chkboxSaveCreditCardDetails=By.xpath("//*[contains(text(),'Save credit card')]");

	//Check box Billing Address same as Shipping Address
	public static By chkboxBillingAddressSameAsShippingAddress=By.xpath("//*[contains(text(),'Billing address is')]");

	//Home address selection button
	public static By btnHomeAddress = By.xpath("(.//button[contains(@class,'Shipping')])[1]");
	
	//Direct To Post Office Address
	public static By btnPostOfficeAddress = By.xpath("(.//button[contains(@class,'Shipping')])[2]");

	//Text Shipping Free
	public static By txtFree = By.xpath(".//small[text()='Shipping']/following-sibling::strong[text()='FREE']");

	//Text Discount below order summary
	public static By txtDiscount =  By.xpath("//small[text()='Discount']");

	//Text Discount Disclaimer
	public static By txtDiscountDisclaimer = By.xpath("//*[@class='ApplyPromotion__Subheading-sc-1x9i83w-3 fWyXdN']");
			// "//*[contains(@class,'DiscountForm__Disc')]");

	//Canada Post Standard radio button text 
	public static By txtCanadaPostStandardRadioBtn = By.xpath("(//div[@class='SelectBox__Main-eza1l3-4 gzdtar'])[2]");

	//Text 'Page Confirmation'
	public static By pgOrderCofirmation= By.xpath("(.//*[text()='Order confirmation'])[1]");
	//Text 'Thank you for your order!'
	public static By weTxtThankYouForYourOrder= By.xpath("(.//*[contains(text(),'Thank you ')])[1]");
	//Text 'We are getting started on your order....'
	public static By weTxtWeAreGettingStarted=By.xpath("(.//*[text()='We are getting started on your order right away, and you will receive an order confirmation email shortly.'])[1]");

	//Order Value
	public static By weTxtOrderValue=By.xpath("//*[text()='Order']/..//div//span[1]");

	//Discount
	public static By weTxtDiscount = By.xpath("//small[text()='Discount']");
	
	//address from dropdown
	public static By txtdropdownaddress = By.xpath("((//*[contains(@class,'pca pcalist')])[1]//div)[1]");
	
	//Address box
	public static By txtAddress=By.xpath("//*[@name='address']");
	
	//FEDEX Next-Day
	//public static By txtFedexNextDay = By.xpath("(//*[@class='SelectBox__Container-eza1l3-0 dJuRmP'])[1]");
			// "//*[contains(text(),'day delivery')]/../..");
	
	//Same day delivery for KwikSave
	public static By txtSameDayDelivery = By.xpath("//*[contains(text(),'day delivery')]/../..");
		
	
	//*************SAndeepa's xpath **************************
	//first name
		public static By weTxtFirstNameField=By.xpath("(.//*[@class='Fieldset__Container-sc-5hzspr-0 gzdwwb'])");
		
		//Canada post express radio button active.
		public static By btnCanadaPostExpress=By.xpath("(.//*[@class='SelectBox__Dot-eza1l3-3 dkBETJ'])");
		
//-------------------------------------------------------------------------------------
		//Updated by Divya for BDD Script Development
		
	
	    //FEDEX Next-Day
	public static By txtFedexNextDay = By.xpath("//*[contains(text(),'Fedex')]/..");

	//	Updated by Harsha for BDD Script Development in October
	
	public static By txtdelivarytype=By.xpath("//*[text()='Delivery']/..//div//span[1]");

	public static By txtordersummary=By.xpath("//*[text()='Order Summary']/..");

	
	//submit
	public static By btnsubmit=By.xpath("//button[@type='submit']");
	
	public static By txtdeliverycharges(String type)
	{
		return By.xpath("//*[contains(text(),'"+type+"')]/../..//*[contains(@class,'SelectBox__Price')]");
	
	}
	
	public static By txtdeliverycharges=By.xpath(".//small[text()='Shipping']/following-sibling::strong");



}
