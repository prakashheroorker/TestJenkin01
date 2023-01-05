package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Cart {
	//Text 'Your Cart'
	public static By pgCart= By.xpath("(.//*[text()='Your cart'])[1]");

	//Button CheckOut
	public static By btnCheckOut=By.xpath("//*[text()='Checkout']");


	//Add promotion
    public static By btnAddpromotion = By.xpath("//*[text()='Add promotion']");
    
    public static By btnremove=By.xpath("//*[text()='remove']");
	
	//Flavor text 'Classic Peach'   
	public static By weTxtFlavorClassicPeach= By.xpath("(.//*[text()='Classic Peach'])[2]");	

	//Flavor text 'Passion fruit Fields'   
	public static By weTxtFlavorPassionFruitFields= By.xpath("(.//*[text()='Passionfruit'])[2]");
			//"(.//*[text()='Passionfruit Fields'])[2]");	

	//Device text 'ePod Solo Devices'
	public static By weTxtePodSoloDevices=By.xpath("(.//*[text()='ePod Solo Devices'])[2]");

	//Skin text 'Express'
	public static By weTxtSkinExpress=By.xpath("(.//*[text()='Express'])[2]");

	//Text 'Magnetic USB Charging Cable'
	public static By weTxtMagneticUSBChargingCable=By.xpath("(.//*[text()='Magnetic USB Charging Cable'])[2]");

	//Text 'Lychee Orchard'
	public static By wetxtLycheeOrchard = By.xpath("(.//*[text()='Lychee'])[2]");//*[text()='Lychee Orchard'])[2]

	//Subscription in your cart page 
	public static By txtSubscription = By.xpath("(.//*[text()='Subscriptions'])[3]");


	//Text 'Strawberry Smash ePen 3 Cartridge' from the Flavor detail page
	public static By weTxtStrawberrySmashePen3Cartridge=By.xpath("(.//*[text()='Strawberry Smash ePen 3 Cartridge'])[2]");

	//Nicotine Strength text  '12 mg/ml'
	public static By weTxt12mgperml=By.xpath("(.//*[contains(text(),'Product')])[2]/../../following-sibling::div//div//div//div//small");

	
	public static By weTxt5mgperml=By.xpath("(//*[text()='5%'])[2]");

	//Nicotine Strength text '30 mg/ml'
	public static By weTxt30mgperml=By.xpath("(.//*[contains(text(),'Product')])[2]/../../following-sibling::div//div//div//div//small");

	//Subtotal value for items
	public static By txtSubTotal = By.xpath("(.//*[contains(text(),'Product')])[2]/../../following-sibling::div//div[2]//div[2]//div//span[contains(text(),'$')]");
	
	//Text "$N" sub total value displayed from the Cart page
	public static By weTxtSubTotalValueN(String num){

		return By.xpath("(.//*[text()='"+num+"'])[1]");

	}

	//Text "$N" One time purchase total value displayed from the Cart page
	public static By weTxtOneTimePurchaseTotalValueN(String num){

		return By.xpath("(.//*[text()='"+num+"'])[1]");

	}

	//Cart Summary in your cart page
	public static By txtCartSummary = By.xpath("//*[text()='Cart summary']");

	//Date field under cart summary in your cart page
	public static By weDateField = By.id("date");

	//Select your Subscription start day in your cart page
	public static By txtSelectYourSubscription = By.xpath("//*[contains(text(),'Select your subscription start day')]");

	//+ button to add 1 more subscription
	public static By btnAdd = By.xpath("(//*[@class='QuantityPicker__Button-v6i9u9-1 bsPweh'])[2]");
			//+ "(//*[@class='QuantityPicker__Container-v6i9u9-0 hcomfH'])");
			// "(//*[contains(text(),'Product')])[2]/../../following-sibling::div//div/following-sibling::div//div//div//div//button[2]");

	//Scrolling element
	public static By weScrollToCheckout = By.xpath(".//small[contains(text(),'taxes calculated')]");



	//Specific 'flavor' text
	public static By weTxtSpecificFlavor(String flavor)
	{
		return By.xpath(".//*[contains(@class,'Product')][text()='"+flavor+"']");
	}



	//Increment product count
	public static By btnIncrementProductCount = By.xpath("(.//button[contains(@class,'Quantity')])[2]");


	//Discount code input field
	public static By edtDiscountCode = By.xpath(".//*[text()='Discount code']/../div/input");

	//Add discount button
	public static By btnAddDiscount = By.xpath(".//button[@type='submit']//*[text()='ADD']");
	
	
	
    //Add discount button
    public static By btnAdddiscount = By.xpath("//*[text()='add']");
    
   //adding discount
    public static By btnAddingDiscount = By.xpath("//*[text()='Add']");
 
public static By txtdiscount=By.xpath(".//*[text()='Discount code']");

	//Your cart is empty text
	public static By weTxtYourCartIsEmpty = By.xpath(".//*[contains(text(),'cart is empty')]");

	//Subscription discount percentage
	public static By weTxtSubscriptionDiscountRate(String discount)
	{
		return By.xpath(".//*[text()='Discount']//following-sibling::span[contains(text(),'"+discount+"')]");
	}

	//Text 'Original Strawberry' from the Flavor detail page
	public static By weTxtOriginalStrawberryFlavor=By.xpath("(.//*[text()='Original Strawberry'])[2]");

	//click on plus button in edit subscription for active
	public static By btnPlus=By.xpath("//*[text()='Your selection']/..//div//span//div[3]//button[2]");
	
	//Total amount after adding quantity
	public static By weTxtTotal=By.xpath("//*[contains(text(),'One time purchase to')]/../strong");
			//+ "(//*[contains(@class,'Product__Price')])[4]//span");
	
	
	//**************************************************************
	//Added by Sandeepa
	
		//Discount code
		public static By wetxtDiscount=By.xpath("(.//*[@class='Total__Line-sc-1axpxsv-4 fzizUR'])[2]");
				// "(.//*[@class='Total__Line-sc-1axpxsv-4 dKFsVz'])[2]");
		
		//Discount code for Addind_3Packs_RegularFLow test
		public static By lblDiscount=By.xpath("(.//*[text()='Discount'])");
				// "(.//*[text()='Discount'])");
		
		//Removing items from cart
		public static By lnkRemoveItems=By.xpath("(.//*[@class='Product__Remove-ra1xzv-11 bjcctm'])[1]");
				// "(.//*[@icon='close-small'])[1]");
		
		
		//Text 'Plate' -device green color
		//public static By txtSkinColor= By.xpath("(.//*[text()='Plate'])[2]");//Skin color
		
		
		
		//text 'tikiti-device color
		public static By txtSkinColor= By.xpath("(//*[text()='Cimento'])[2]");//Skin color
		
		//Text 'Magnetic USB Charging Cable'
		public static By txtMagneticUSBChargingCable= By.xpath("(.//*[text()='Magnetic USB Charging Cable'])[2]");
		
		//Vype plus text is displayed at the top of the page inside the HTML frame.
		
	    public static By weTxtVypePlus=By.xpath("//*[contains(text(),'you are almost')]/..");

				// "(.//*[@class='Incentive__StyledPlusLogo-sc-1gtskae-6 lptQfH u-hide-medium-down'])");
				// "(.//*[@class='Incentive__StyledPlusLogo-sc-1gtskae-6 ixCqat u-hide-medium-down'])");

		//Text "HEY SILVER MEMBER, YOU ARE ALMOST GOLD STATUS! SPEND $61.38 MORE TO UPGRADE"
	  
	    public static By weTxtHeySilverMember=By.xpath("//*[contains(text(),'silver')]");
	       
	        //Text show how you will benefit" link is present at the top right in the HTML Frame.
	        public static By weTxtSeeHowYouBenefit=By.xpath("(.//*[contains(text(),'See how you will benefit')])[1]");

		
		//Pop dispalyed with below information "gold,free shipping on all orders,birthday gift
		public static By weTxtPopupDisplayedSilver=By.xpath("(//*[text()='silver']//../div/..)[1]");
				// "(.//*[@class='Incentive__DropdownContainer-sc-1gtskae-9 dogkzU'])[2]");

		//pop up "x"(close pop up)
		public static By lnkPopupClose=By.xpath("(//*[contains(text(),'Free')]//..//..//..//div)[1]");
				// "(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[5]");
		
				// "(.//*[@icon='close-small'])[2]");
		
		
		public static By lnkPopupCloseSilver=By.xpath("(//*[text()='silver'])[2]/../button");

		
		//Continue shopping
		public static By lnkContinueShopping=By.xpath("(.//*[text()='Continue shopping'])");
		
		//text"YOU ARE ALMOST SILVER STATUS! SPEND $100.00 MORE TO UPGRADE".
		public static By weTxtYouAreAlmostSilverStatus=By.xpath("//*[text()='you are almost']/../..");
				// "(.//*[@class='Incentive__Tier-sc-1gtskae-3 epWSyy'])");
				// "(.//*[@class='Incentive__Disclaimer-sc-1gtskae-5 pIIwz'])");
		
		//mini cart is updated.
		public static By weTxtMiniCartUpdated=By.xpath("(.//*[text()='Passionfruit'])[2]");
				// "(.//*[text()='Classic Tobacco'])[2]");
		
		//Subtotal in minicart
		public static By weTxtSubTotalMiniCart=By.xpath("(.//*[@class='TinyCart__Row-i4vlf8-8 hsIqzm'])[1]");
		
		

		

		
		
		
		
	

}
