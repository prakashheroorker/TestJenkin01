package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_GoldProfileTrigger {
	
	//Rewards Page
	public static By pgRewards = By.xpath("(.//a[@href='/account/rewards'])[3]");
	
	//Toggle Button
	public static By toggleButton = By.xpath(".//div[@class='Toggle__Indicator-sc-158huto-2 jsyvDz']");
	
	//Profile Page
	public static By pgProfile = By.xpath(".//a[@href='/account']");
	
	//Reactivate Now Button
	public static By btnReactivateNow = By.xpath(".//button[@class='DisableBanner__Action-sc-1aufi30-4 dGeLTh' and text()='Reactivate now']");
	
	//Get Amount Spend
	public static By txtSpendAmount=By.xpath(".//*[@class='TierProgress__Footer-sc-1p2p3fp-9 llvSEo']/p[1]");

	//EPod Device
	public static By lnkEpodDevice=By.xpath(".//a[@href='/vype-epod-starter-kit' and text()='Device']");
	
	//Solo Device
	public static By lnkSoloDevice=By.xpath(".//*[text()='Solo Device']");
	
	//Buynow Solo Device*********
	public static By btnBuyNowSolo = By.xpath("(//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Buy now'])[1]");
	
	//Vype Epod Solo Device Page
	public static By pgVypeEPod = By.xpath(".//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 fPInSt u-hide-medium-down' and text()='Vype ePod']");
		
	//Add Items And Go To Cart (Solo Device) and ePen
	public static By btnAddItemsToCart = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Add items & go to cart']");
	
	//Price Value In One Time Purchases Screen
	public static By priceVal = By.xpath(".//span[@class='Product__Price-sc-92om0c-10 ZCyDI']");
	
	//+ Button
	public static By plusButton = By.xpath(".//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'][2]");
	
	//Checkout Button
	public static By btnCheckOut = By.xpath(".//a[@href='/checkout']");
	
	//CheckOut Page Element
	public static By txtCheckOut = By.xpath(".//*[text()='Checkout']");
	
	//Direct To Post Office
	public static By btnDirectToPostOffice = By.xpath(".//div[@class='ShippingMethod__OptionInner-sc-1esejh7-3 eTXcBs']");
	
	//Home
	public static By btnHome = By.xpath("//div[@class='ShippingMethod__OptionInner-sc-1esejh7-3 eTXcBs']");
	
	//PinCode TextBox
	public static By txtPinCode = By.xpath("//input[@placeholder='Postal code']");
	
	//Search Button
	public static By btnSearch=By.xpath("//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='SEARCH']");
	
	//PinCode List First Element
	public static By firstEleList = By.xpath("(//span[@class='StoresList__Name-sc-1b8zlke-7 grDeoO'])[1]");
	
	//Go To Delivery Button
	public static By btnGoToDelivery = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 gtYgrt' and text()='Go to delivery']");
	
	//Canada Post(Standard)
	public static By rdbtnCanadaPostDelivery = By.xpath(".//span[@class='SelectBox__Label-bqz5l1-5 jEyVbR' and text()='Canada Post (Standard)']");
	
	//Go To Billing
	public static By btnGoToBilling = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 gtYgrt' and text()='Go to billing']");
	
	//Address
	public static By txtAddress = By.xpath(".//input[@name='address' and @class='Input__Field-sc-1d4fqnm-3 ejXZmh' and @type='text']");
	
	//Address Drop down
	public static By addrDrpDwn =  By.xpath(".//div[@class='pcaitem pcafirstitem pcaselected']");
	
	//Ship To Your Address Instead Button
	public static By btnShipToYourAddressInstead = By.xpath(".//button[text()='Ship to your address instead ›']"); 
	
	//Progress Bar In Rewards Page
	public static By barProgressStatus = By.xpath("//*[contains(@class,'TierProgress__ProgressBarFill')]"); //  xpath changed
	
	//Order Value In Shopify
	public static By ShopfyorderVal = By.xpath("//div[@class='order-details__line-item-total-price type--right']");
	
	//Shopify Account
	public static By btnshopifyAccount = By.xpath(".//button[@class='juNP0']");
	
	//Shopify LogOut
	public static By btnshopifyLogOut = By.xpath(".//div[@class='_2inay' and text()='Log out']");
	
	//You have Peaked at Platinum
	public static By txtPlatinum = By.xpath(".//h3[@class='typography__H3-vraxd4-2 TierProfileHeader__Heading-c8hvo0-2 dSSdoj']");
	
	//Platinum Benefits
	public static By txtPlatinumBenifits = By.xpath(".//h4[@class='typography__H4-vraxd4-3 TierBenefits__Heading-sc-15zforz-2 fCyWZS']");
	
	//ShopifyOrderInTable
	public static By orderInTable = By.xpath("//table/tbody/tr[1]/td[2]");
	
	
	//Pods Under ePen under Products
	public static By lnkPodsEPen = By.xpath(".//a[@href='/buy-online/vype-epen-3-cartridges']");
	
	//Devices Under ePen
	public static By lnkDevicesEPen = By.xpath(".//a[@href='/buy-online/epen-3']");
	
	//ePen->Pods Page
	public static By pgPodEPen = By.xpath(".//h1[@class='typography__H1-vraxd4-0 CollectionHeader__LargeHeading-sc-63ptu-2 gbspfz' and text()='ePen Pods']");
	
	//Subscribe
	public static By lnkSubscribe = By.xpath("(.//*[@href='/subscribe'])[1]");
	
	//Why Shop Online
	public static By drpDownWhyShopOnline  = By.xpath(".//span[@class='NavLabel-sc-2zus1-0 jPyzfm' and text()='Why Shop Online?']");
	
	//Vuse+ Link Under Why Shop Online
	public static By lnkVusePlus = By.xpath("(//a[@href='/vuse-plus-vape-deals' and text()='Vuse+'])[1]"); 
	
	//Store Locator
	public static By lnkStoreLocator = By.xpath("//a[@href='/vape-stores' and text()='Store Locator']");
	
	//General Information In Pods(ePen)
	public static By txtinfoPodsePen = By.xpath("//div[@class='CollectionHeader__Description-sc-63ptu-3 exphfX']");
	
	//ePen Page Product Value
	public static By ePenDeviceValue = By.xpath(".//h3[@class='typography__H3-vraxd4-2 BuySummary__Price-sc-1htlc15-2 cSsPzc']");
	
	//Cart Page
	public static By pgCart = By.xpath(".//h1[@class='typography__H2-vraxd4-1 Header__Heading-kgwx6d-1 gynMtS' and text()='Your cart']");
	
	//One Time Purchase Value 
	public static By purchaseValue = By.xpath("//*[text()='One time purchase total']/following-sibling::strong");
	
}
