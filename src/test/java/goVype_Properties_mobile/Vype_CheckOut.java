package goVype_Properties_mobile;

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
	public static By txtCardNumber=By.xpath("(.//*[text()='Card number'])");

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
	
	public static By txtfedex=By.xpath("//*[contains(text(),'Fedex')]/..");
	//Direct To Post Office Address
	public static By btnPostOfficeAddress = By.xpath("(.//button[contains(@class,'Shipping')])[2]");

	public static By txtdelivary=By.xpath("(//*[contains(text(),'Get it by ')])[2]");
	
	public static By txtdelivery1=By.xpath("(//*[contains(text(),'Delivery')])[2]/../div");
	//Text Shipping Free
	public static By txtFree = By.xpath(".//small[text()='Shipping']/following-sibling::strong[text()='FREE']");

	//Text Discount below order summary
	public static By txtDiscount =  By.xpath("//small[text()='Discount']");

	//Text Discount Disclaimer
	public static By txtDiscountDisclaimer = By.xpath("//*[@class='ApplyPromotion__Disclaimer-sc-1x9i83w-6 kDJCuj']");
			// "//*[contains(@class,'DiscountForm__Disc')]");

	//Canada Post Standard radio button text 
	public static By txtCanadaPostStandardRadioBtn = By.xpath("(//div[@class='SelectBox__Main-eza1l3-4 gzdtar'])[2]");

	//Text 'Page Confirmation'
	public static By pgOrderCofirmation= By.xpath("(.//*[text()='Order confirmation'])[1]");
	//Text 'Thank you for your order!'
	public static By weTxtThankYouForYourOrder= By.xpath("(.//*[contains(text(),'Thank you for your ')])[1]");
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

		public static By wetxtyoursubscription=By.xpath(".//*[text()='Your subscription has been successfully created. You will receive a confirmation within an hour.']");
		 
		//FEDEX Next-Day
		public static By txtFedexNextDay = By.xpath("//*[contains(text(),'Fedex')]/..");


		
		public static By txtdelivarytype=By.xpath("//*[text()='Delivery']/..//div//span[1]");
				
	    public static By txtordersummary=By.xpath("//*[text()='Order Summary']/..");
	    
	    //harsha
	    
	    public static By btnshowordersummary=By.xpath("//*[text()='Show order summary']");
	  
	  //For Delivary Option change�������
	    public static By DeliveryOption2= By.xpath("(//*[contains(text(),'Fedex')]/..)[2]"); 

	  //For Delivary Option change
	    public static By DeliveryOption1= By.xpath("(//*[contains(text(),'Fedex')]/..)[1]");
	    
	    public static By CanadaExpressSubsDeliveryOption = By.xpath("(.//*[@name='Canada Post (Express)_sub'])/../div[1]");
	    
	    //Updated
	    
	    public static By txtdeliveryoptions=By.xpath("//*[contains(@class,'SelectBox__Label')]");

		public static By txtbillingpage =By.xpath("//*[contains(text(),'Almost there')]");

		public static By txtDeliverycharges =By.xpath(".//small[text()='Shipping']/following-sibling::strong");

		public static By WeChkoxIhaveReadTandC =By.xpath("(.//*[text()='I have read and agreed to the'])[1]");

		public static By btnSubmit=By.xpath("//button[@type='submit']");

		public static By btnSubmitorder=By.xpath("(.//*[text()='Submit Order'])[1]");

		public static By WeTxtOrderValue=By.xpath("//*[text()='Order']/..//div//span[1]");

		public static By txtOrdersummary=By.xpath("//*[text()='Order']/..//div//span[1]");


		public static By txtdelivery(String delivery) {
			 return By.xpath("//*[contains(text(),'"+delivery+"')]");
		}

		  public static By txtdeliverycharges(String type)
    {
        return By.xpath("//*[contains(text(),'"+type+"')]/../..//*[contains(@class,'SelectBox__Price')]");
    
    }
		  
		  public static By btnsubmit=By.xpath("//button[@type='submit']");
			
			
			
			public static By txtdeliverycharges=By.xpath(".//small[text()='Shipping']/following-sibling::strong");




}
