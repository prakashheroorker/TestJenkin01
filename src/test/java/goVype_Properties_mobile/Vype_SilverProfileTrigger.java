
package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_SilverProfileTrigger
{
	//The total cart value should be 100 or greater than 100
	public static float testCaseConditionForTotalCartValue = 0.00f;

	//class="ProductCard__Figure-sc-7qc70h-2 bhzVuv"
	public static By ePodPage = By.xpath("(.//*[@class='ProductCard__Figure-sc-7qc70h-2 bhzVuv'])[1]");

	//Solo Device
	public static By ePodlnkSoloDevice=By.xpath("(.//*[text()='Solo Device'])[1]");
	
	//Passion Fruit Filed product
	public static By ePodPassionFruitFileds=By.xpath("(//h4[text()='Passionfruit']/../following-sibling::div//button)[1]");
			// "(.//*[@class='Cartridge__Overlay-sc-1rejg92-9 hBTdxO'])[2]");
	
	//Increment button 1.6%
	public static By btnIncrementNicotineStrength=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");
	
	//Increment button 3%
	public static By btnIncrementNicotineStrength3Btn=By.xpath(".//*[text()='1.6%']/..//div//button[2]");
			//"(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[6]");
	
	//Button 'Add' on the modal
	public static By btnAdd=By.xpath("(.//*[text()='Add'])[1]");
	
	//Button Add items & go to cart
	public static By btnAddItemsGoToCart=By.xpath("(.//*[text()='Add items & go to cart'])");
	
	// Mini cart
    public static By miniCart= By.xpath("(.//*[@href='/cart'])[1]");
    
	//View cart
    public static By btnViewCart= By.xpath("(.//*[@href='/cart'])[2]");
    
    //Your Cart page
    public static By yourPgCart= By.xpath("(.//*[text()='Your cart'])[1]");
    
    //Subtotal label
    public static By labelSubTotal= By.xpath("(.//*[text()='Subtotal'])[2]");
    
    //Subtotal value:
   // public static By labelSubTotal= By.xpath("(.//*[text()='129.99'])[1]");
    
    //One time purchase total
   /// public static By labelOneTimePurchseTotal= By.xpath("(.//*[text()='129.99'])[1]");
    
   //Text "$N"  value displayed on the ePod devices page
  	public static By weTxtSubTotalValueN(String num){

  		return By.xpath("(.//*[text()='"+num+"'])[1]"); 

  	}
    
    // Verify the cart value as per the test case condition
	public static boolean VerifyCartValueAsPerTestCaseOneCondition(Float num){
	 		
  		if(num>=testCaseConditionForTotalCartValue)
  		{
  			return true;	
  		}
  		else
  		{
  			return false;
  		}

  	}
	
    // Verify the cart value as per the test case condition
	public static boolean VerifyCartValueAsPerTestCaseTwoCondition(Float num){
	 		
  		if(num>=testCaseConditionForTotalCartValue && num< 250)
  		{
  			return true;	
  		}
  		else
  		{
  			return false;
  		}

  	}
	
	 // Verify the cart value as per the test case three condition(total,value in a month should less than 100$)
/*		public static boolean VerifyMultipleCartValueInAMonthAsPerTestCaseThreeCondition(int TotalNumberOfOrdersInAMonth){
			
			//float totalPurchasedInaAMonth = 0.00f;
			
			float totalPurchaseValueInAMonth=0.0f;
			
			for(int i=0; i<TotalNumberOfOrdersInAMonth; i++)
			{
				totalPurchaseValueInAMonth= totalPurchaseValueInAMonth+i;
			}
			
			if(totalPurchaseValueInAMonth<100)
			{
				true;
			}
			else
			{
				false;
			}	

	  	}*/
		
		// Verify the cart value as per the test case Three condition i.e less than $100.
		public static boolean VerifyCartValueAsPerTestCaseThreeCondition(float num){
		 		
	  		if(num<testCaseConditionForTotalCartValue)
	  		{
	  			return true;	
	  		}
	  		else
	  		{
	  			return false;
	  		}

	  	}
	
	
	//Button cart page CheckOut
	public static By btnCheckOut=By.xpath("//*[text()='Checkout']");
			// "(.//*[@class='Total__ButtonWrap-sc-1flxtnt-6 eYYxrh'])");
	
	//Text 'CheckOut'
	public static By pgCheckOut= By.xpath("(.//*[text()='Checkout'])");
	
	//Postal code in shipping page.
	public static By txtPostalCode= By.xpath("(.//*[@name='postalCode'])");
	
	//Search Button on shipping page
	public static By btnSearch= By.xpath("(.//*[text()= 'SEARCH'])");
	
	//Ship to your address instead
    public static By btnShipToYourAddressInstead = By.xpath("(.//*[text()='Ship to your address instead ›'])");
	
	//Go To Delivery button 
	public static By btnGoToDelivery = By.xpath("(.//*[text()='Go to delivery'])");
			// "(.//*[@class='Button__Container-sc-186nrqc-0 kxqWCV'])");

	//Go to Billing button 
    public static By btnGoToBilling = By.xpath("(.//*[text()='Go to billing'])");
    
    //Address text field billing page.
    public static By txtAddressField=By.xpath("(.//*[@class ='Input__Field-sc-1d4fqnm-3 ejXZmh'])");
        
    //Address text field label in billing page.
    public static By labelAddressField=By.xpath("(.//*[@class ='Label-sc-1qtzju1-0 Input__StyledLabel-sc-1d4fqnm-1 cyGGmi'])");
    
    //Address text field selection billing page.
    public static By addressDropDown=By.xpath("(.//*[@class ='pcadescription'])");
    
    
    //Address filed required error label
    public static By addressErrorText = By.xpath("(.//*[text() = 'Address is required'])");
    
    
    //Profile link.
    public static By userProfile=By.xpath("//*[@class='AccountDropdown__Avatar-sc-13vvt9x-5 CqXzZ']");
    		// "//*[@class='AccountDropdown__Avatar-sc-13vvt9x-5 fOEayg']//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg']");
    		// "(.//*[@class ='typography__Capitalize-vraxd4-11 eYBPAR'])[1]");
    
    public static By userProfileInOrderPagwe=By.xpath("(.//*[@class ='Icon__Container-sc-1my58dh-0 kqfyID'])[2]");
    
    //My account button
    public static By textMyAccount =By.xpath("(.//*[text()='My Account'])[1]");
    		// "(.//*[text()='My account'])[1]");
   
    //Rewards
    public static By textRewards=By.xpath("(.//*[text()='Rewards'])");

    //Profile
    //public static By textProfile=By.xpath("(.//*[text()='Rewards'])");
    
   //Silver status
    public static By labelYourStatus=By.xpath("(.//*[text() = 'Your status progress'])/../div");
    
    
   
    //Silver status
    public static By textSilverStatus=By.xpath("(.//*[text()='$100'])");
   
    //Orders
    public static By textOrders=By.xpath("(.//*[text()='Orders'])");

    //Order number
    public static By textOrderNumber=By.xpath("(.//*[text()='Order no:'])");

    //Date text field
    public static By textDate=By.xpath("(.//*[@class='Order__MetaItem-sc-1j6u1u8-7 hVUWDx'])[1]");
    		// "(.//*[@class='Order__MetaItem-sc-1h51x8k-7 fXysgC'])[1]");

    //Profile text field
    public static By textProfile=By.xpath("(.//*[text()='Profile'])");

    //yes I want to receive
    public static By toggleButton=By.xpath("(//*[contains(text(),'Please')])/preceding-sibling::p[1]/label");
    		// "(.//*[@class='Toggle__Indicator-sc-1te86bk-2 icWPpS'])[1]");
    		// "(.//*[@class='Toggle__Indicator-sc-158huto-2 jsyvDz'])");

    //Paid on shopify
    public static By labelPaid=By.xpath("(.//*[text()='Paid'])[3]");
    
    
    // Total purchased value in an order
    public static By txtOrderTotalPurchasedVlaue=By.xpath("(.//*[@class ='typography__Lead-sc-10lefml-5 ewNNOV'])[1]");
    
    // Progress bar on Rewards page.
    public static By progressBarOnRewardsPage=By.xpath("(.//*[@class='TierProgress__ProgressBarInner-sc-1dcep92-3 ccyUDm'])");
    
    //Logout
    public static By lnkLogout=By.xpath("(.//*[text()='Logout'])[1]");
    
    //Vypelog(Vuse).
    public static By labelVuse=By.xpath("(.//*[@class='Nav__DesktopLogo-sc-1kiounr-1 gcxCQp'])");
    
    //Why shop online?
    public static By labelWhyShopLine=By.xpath("(.//*[text()='Why Shop Online?'])");
    
    
    //Vuse plus
    public static By lnkVusePlus=By.xpath("//*[@class='RewardsDropdown__Dropdown-sc-10xcy2t-2 cCXjiT']//*[@href='/ca/en/vuse-plus-vape-deals/']");
    		// "(.//*[@class='RewardsDropdown__Item-sc-1hfqtj2-3 bsYpzh'])[1]");
    
    //Vuse Landing Page.
    public static By txtVuseLandingPage=By.xpath("(.//*[@class='typography__H1-sc-10lefml-0 PlusHeader__Heading-nt52g4-3 gjWRld iPVOol'])");
    		// "(.//*[@class='typography__H1-vraxd4-0 PlusHeader__Heading-o7hjgb-3 buRUMC'])");
    
    //Scroll down till Find your status.
    public static By lnkFindYourStatus=By.xpath("(.//*[text()='Check your status'])");
    		// "(.//*[text()='Find out your status'])");
    
    //User profile.
    public static By userProfileIconOnHomePage=By.xpath("//*[text()='Profile']");
    
   
 

}

