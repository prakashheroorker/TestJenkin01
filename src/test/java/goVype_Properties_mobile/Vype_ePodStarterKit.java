package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_ePodStarterKit {


	//My Account link
	public static By lnkMyAccount=By.xpath("(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]//div//a[contains(text(),'My account')]");

	//Text to spend amount to upgrade status to gold
	public static By txtspendamount=By.xpath("//*[contains(text(),'Spend')]");

	// ePod Page 
	public static By pgePodStarterKit=By.xpath("(.//*[text()='1 ePod '])[1]");

	//Solo Device
	public static By lnkSoloDevice=By.xpath("(.//*[text()='Solo Device'])[1]");

	//ePod Device link
	public static By lnkePodDevice=By.xpath("//*[@href='/vype-epod-starter-kit']");

	//Text VUSE ePod
	public static By txtVuseePod=By.xpath("//*[text()='VUSE ePod']");

	//Solo device 
	public static By weTxtSoloDevice=By.xpath("//*[text()='Solo Device']"); // xpath changed regression

	//Lychee Orchard add button
	public static By btnAdd=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	//Quantity Add button
	public static By btnQuantityAdd=By.xpath("(//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");

	//Total amount after adding quantity
	public static By weTxtTotal=By.xpath("(//*[contains(@class,'Product__Price')])[4]//span");

	//Button to Add total amount
	public static By btnAddTotalAmt=By.xpath("//*[@class='Button__Container-sc-186nrqc-0 dBtxRE CartridgeModal__StyledButton-kepi1t-12 dIriId']");

	//One time purchase total
	public static By wetxtPrice=By.xpath("//*[text()='One time purchase total']/following-sibling::strong"); //*[@class='Main__TotalWrap-jzkev4-3 dzgrof']//div[4]//strong[1]

	//One time purchase total
	public static By wetxtPrice1=By.xpath("//*[text()='One time purchase total']/following-sibling::strong");// xpath changed

	//Home address
	public static By weHomeAddress=By.xpath("//*[contains(text(),'Where should we')]/../../following-sibling::div//div//div//div//div[contains(text(),'Home')]");

	//Shopify Total Value
	public static By wetxtTotal=By.xpath("//*[@class='order-details__summary__paid_by_customer']//td[contains(text(),'$')]");

	//Rewards tab on my account page
	public static By wetxtRewards=By.xpath("(//*[@href='/account/rewards'])[3]");

	//Profile tab on my account page
	public static By wetxtProfile=By.xpath("(//*[@class='Tabs__TabContainer-sc-15p5she-3 ggmkqJ'])[3]");

	//Toggle button 
	public static By btnToggle=By.id("toggle");

	//Reward Tab 
	public static By txtRewards=By.xpath("(//*[@class='Tabs__TabContainer-sc-15p5she-3 ggmkqJ'])[1]");

	//Gold Status progress
	public static By txtGoldStatus=By.xpath("(//*[contains(text(),'Your other')]/../../../preceding-sibling::div)[1]");

	//Silver Status progress
		public static By txtSilverStatus=By.xpath("(//*[contains(text(),'Your other')]/../../../preceding-sibling::div)[1]");

	
	
	//Discount code
	public static By txtDiscountCode=By.xpath("//*[contains(text(),'Copy')]/../../../..");

	//Other Gold Benefits
	public static By txtOtherBenefits=By.xpath("//*[contains(text(),'Your other')]/..");

	//Bar Progress Status
	public static By webarProgressStatus=By.xpath("//*[@class='TierProgress__ProgressBarFill-sc-1p2p3fp-4 fdASZw']");


	//Engravable ePod
	public static By wetxtEngravableePod = By.xpath("(//*[@class='ProductCard__Figure-sc-7qc70h-2 bhzVuv'])[2]");


	//Solo device tile buy now button
	public static By btnSoloDeviceBuyNow = By.xpath("//a[contains(@href,'buy-online/epod-devices')]");

	//Engraved ePod
	public static By btnEngravedDeviceBuyNow = By.xpath("(//a[contains(@href,'buy-online/engravable')])[1]");

	//Engravable epod page
	public static By pgEngravableEpod = By.xpath(".//h1[contains(text(),'ePod')]");

	//epod Device page body
	public static By pgEpodStarterKitBody = By.tagName("body");

	//Vype starter kit Image in overview
	public static By imgVypeStarterKit = By.xpath("(.//img[@alt='Vuse ePod Starter Kit'])[6]");

	//Overview slide show texts
	public static By weTxtVypeStarterKitFeature1 = By.xpath(".//h2[text()='QUIET. SMOOTH. SATISFYING.']");
	public static By weTxtVypeStarterKitFeature1Content = By.xpath(".//p[contains(text(),'quiet, smooth')]");
	public static By weTxtVypeStarterKitFeature2 = By.xpath(".//h2[text()='ALL-DAY USE*']");
	public static By weTxtVypeStarterKitFeature2Content = By.xpath(".//p[contains(text(),'When fully charged,')]");
	public static By weTxtVypeStarterKitFeature3 = By.xpath(".//h2[text()='PERFECTLY']");
	public static By weTxtVypeStarterKitFeature3Content = By.xpath(".//p[contains(text(),'Compact design')]");

	//shop flavours link
	public static By lnkShopFlavours = By.xpath(".//a[text()='Shop flavours']");

	//flavors pod page
	public static By pgFlavourPod = By.xpath("//div[contains(@class,'CartridgeList__Container')]");

	//Personalize slide show text
	public static By weTxtVypeStarterKitPersonlize = By.xpath(".//h2[text()='PERSONALIZE ']");

	//Shop Skins link
	public static By lnkShopSkins = By.xpath("(.//a[contains(@href,'epod-skins')][text()='Shop skins'])[1]");

	//Engravable device link
	public static By lnkEnravableDevice  =By.xpath("(.//a[contains(@href,'engravable')][text()='Engrave device'])[1]");

	//epod device image
	public static By imgEpod(String deviceColour)
	{
		deviceColour = deviceColour.trim().replace(" ", "-");
		return By.xpath("(.//*[contains(@src,'device-"+deviceColour+"')])[2]");
	}

	//ePod Pods Page
	public static By pgEpodPods = By.xpath(".//*[text()='ePod Pods']");


	//select flavor pods
	
	
	public static By weFlavorPods(String deviceColour)
	{
		return By.xpath("(//*[@data-tip='"+deviceColour+"')]");
	}
	
	
    

	//flavor specific pod page
	public static By pgFlavorPods(String flavor)
	{
		return By.xpath(".//h4[contains(text(),'"+flavor+"')]");
	}

	//Scroll to Nicotine Strength visibility
	public static By weTxtChooseQuantity =  By.xpath("//h4[contains(text(),'Choose quantity and nicotine strength')]");

	//epod skins page
	public static By pgEpodSkins = By.xpath(".//h4[text()='Choose your skin']");

	//Add to cart button
	public static By btnAddToCart = By.xpath(".//*[text()='Add to cart']");
	public static By btnAddItemsAndGoToCart = By.xpath(".//*[text()='Add items & go to cart']");

	//Add or decrement flavor
	public static By btnIncOrDec(int incOrDec)
	{
		return By.xpath("(//*[contains(@class,'QuantityPicker')]//*[@type='button'])["+String.valueOf(incOrDec)+"]");
	}


	//Engravable ePod
	public static By ePodlnkEngravable=By.xpath("(.//*[@class='ProductCard__FigureWrap-sc-7qc70h-1 kFvLhN'])[2]");

	//text Engravable ePod
	public static By txtEngravableEpod=By.xpath("(.//*[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 fPInSt u-hide-medium-down'])");

	//text "choose your color
	public static By txtChooseColor=By.xpath("(.//*[text()='Choose your colour'])[2]");

	//Graphite color
	public static By btnGraphiteColor=By.xpath("(.//button[@class='BuyDevices__Swatch-yfmzvh-6 bfUUvD'])");


	//Image color
	public static By selectedDeviceColour=By.xpath("(.//*[@src='static/images/products/epod/background/graphite.jpg'])");

	//text Engraved Device
	public static By textEngravedDevice=By.xpath("(.//*[@class='Addon__Overlay-sc-4qaprn-2 kTZUrh'])[1]");

	//Plus button
	public static By btnAddEngravedDevice=By.xpath("(.//*[@class='Addon__ActionsWrapper-sc-4qaprn-8 drPEwr'])[1]");


	//text customize the front
	public static By txtCustomizeFront=By.xpath("(.//*[text()='Customize the Front'])");

	//Pattern
	public static By BtnPattern=By.xpath("(.//*[@src='static/images/engraving/options/pattern.png'])");

	//select "Solstice
	public static By btnSolstice=By.xpath("(.//*[@class='Tabs__Item-sc-1eakr7i-3 dtivpi'])[2]");		

	//Add Pattern
	public static By btnAddPattern=By.xpath("(.//*[text()='Add Pattern'])");

	//Hoya Pattern
	public static By btnHoyaPattern=By.xpath("(.//*[@class='List__Item-sc-1w3oc1o-2 ieHDYp'])[2]");

	//text "Now Customize back
	public static By txtCustomizeBack=By.xpath("(.//*[text()='Now customize the Back'])");

	//button Text
	public static By btnText=By.xpath("(.//*[text()='Text'])");

	//Horizontal
	public static By btnHorizontal=By.xpath("(.//*[text()='Horizontal'])");

	//Enter text
	public static By txtAbc=By.xpath("(.//*[@class='Input__Field-sc-1d4fqnm-3 dFfLci'])");

	//Font Style
	public static By btnFontStyle=By.xpath("(.//*[@class='Fitty__Fit-lpi211-0 gDwbvW fit'])[3]");

	//Add text
	public static By btnAddText=By.xpath("(.//*[@class='Button__Container-sc-186nrqc-0 fsdDsM'])");		

	//text "Make it yours"
	public static By txtMakeItYours=By.xpath("(.//*[text()='Make it yours'])");

	//enter the name
	public static By txtEnterRecipientName=By.xpath("(.//*[@class='Input__Field-sc-1d4fqnm-3 dFfLci'])");

	//Add your name
	public static By btnAddYourName=By.xpath("(.//*[text()='Add your name'])");

	//text "Engraving Summary"
	public static By txtEngravingSummary=By.xpath("(.//*[text()='Engraving Summary'])");

	//Image at left
	public static By selectedCustomizeImage=By.xpath("(.//*[@class='BuyChrome__EngravingPattern-sc-1okt7kc-9 lfRcUt'])[1]");

	//text ePod Front
	public static By txtEpodFront=By.xpath("(.//*[@class='SummaryItem__Main-sc-1cy5yzj-2 bEKfeO'])[1]");

	//text ePod back
	public static By txtEpodBack=By.xpath("(.//*[@class='SummaryItem__Main-sc-1cy5yzj-2 bEKfeO'])[2]");

	//text ePod Box.
	public static By txtEpodBox=By.xpath("(.//*[@class='SummaryItem__Main-sc-1cy5yzj-2 bEKfeO'])[3]");

	//Add engraving button.
	public static By btnAddEngraving=By.xpath("(.//*[text()='Add engraving'])");

	//Engravable ePod
	public static By txtEngravableEpod1=By.xpath("(.//*[text()='Engravable ePod'])[2]");

	// text" Do you want add catriage to your order"
	public static By txtWantToAddCartridges=By.xpath("(.//*[text()='Do you want to add cartridges to your order?'])");

	//button I'm fine
	public static By btnImFine=By.xpath("(.//*[@class='Choice__Container-sc-187vqdi-0 ePJHWj'])");

	//text "We thought you might be interested
	public static By txtMightBeInterested=By.xpath("(.//*[text()='We thought you might be interested in this too'])");

	//epodSkin
	public static By btnEpodSkinAdd =By.xpath("(.//*[@class='Addon__ActionsWrapper-sc-4qaprn-8 drPEwr'])[2]");

	//epodSkin
	public static By txtChooseYourSkin=By.xpath("(.//*[text()='Choose your skin'])");		

	//Select skin
	public static By btnSkin=By.xpath("(.//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 JONkT'])[2]");		

	//skin price
	public static By txtSkinPrice=By.xpath("(.//*[text()='$2.00'])");

	//text" One time purchase"
	public static By txtOneTimePurchase=By.xpath("(.//*[text()='One time purchases'])");

	//Express
	public static By txtExpress=By.xpath("(.//*[text()='Express'])[2]");

	//Engravable ePod
	public static By txtEngravableEPodCartPage=By.xpath("(.//*[@class='Product___StyledDiv-sc-92om0c-13 jcBfTS']");

	//Magnetic usb
	public static By txtMagneticUSB=By.xpath("(.//*[text()='Magnetic USB Charging Cable'])[2]");

	//Subtotal
	public static By txtSubtotal=By.xpath("(.//*[text()='Subtotal'])[2]");


	//Text "$N"  value displayed on the ePod devices page
	public static By weTxtSubTotalValue(String num){

		return By.xpath("(.//*[text()='"+num+"'])[1]"); 

	}

	//Fabrichromatic
	public static By btnFabrichromatic=By.xpath("(.//*[@class='Tabs__Item-sc-1eakr7i-3 dtivpi'])[3]");

	//Minos Pattern
	public static By btnMinosPattern=By.xpath("(.//*[@class='List__Item-sc-1w3oc1o-2 ieHDYp'])[3]");

	//Engravable ePod
	public static By txtEngravableEPodCart=By.xpath("(.//*[@class='Product___StyledDiv-sc-92om0c-13 jcBfTS'])[2]");

	//Scrapes
	public static By btnScrapes=By.xpath("(.//*[@class='Tabs__Item-sc-1eakr7i-3 dtivpi'])[4]");

	//Stencil pattern
	public static By btnStencilPattern=By.xpath("(.//*[@class='List__Item-sc-1w3oc1o-2 ieHDYp'])[4]");

	//Abstraction
	public static By btnAbstraction=By.xpath("(.//*[@class='Tabs__Item-sc-1eakr7i-3 dtivpi'])[5]");

	//Trace pattern
	public static By btnTracePattern=By.xpath("(.//*[@class='List__Item-sc-1w3oc1o-2 ieHDYp'])[5]");

	//Mini Icon
	public static By BtnMiniIcon=By.xpath("//*[contains(text(),'Mini Icon')]");

	//Bolt
	public static By btnBolt=By.xpath("//*[contains(text(),'Bolt')]");
	//Berg
    public static By btnBerg=By.xpath("//*[contains(text(),'Berg')]");
   

	//Add 
	public static By btnAddMiniIcon=By.xpath("//*[contains(text(),'Add Mini Icon')]");

	//Text Icon
	public static By BtnTextIcon=By.xpath("//*[contains(text(),'Text')]");
	
	
	//Passion Fruit
		public static By lnkPassionFruit = By.xpath("(.//*[@class = 'Cartridge__Container-sc-38s8x4-0 hhyoIe'])[2]");
				// "(.//*[@class = 'BuyCartridges__Item-sc-1rtbffr-2 joIgId'])[2]");
		
		//Passion Fruit add nicotine strength (1.6%)
		public static By btnNicotineStength = By.xpath("(//*[@class = 'QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[8]");
				// "(//*[@class = 'QuantityPicker__Button-v6i9u9-1 vSeSQ'])[6]");
		
		//Add button
		public static By btnAddOnPopUpWindow = By.xpath("(//*[@class = 'Button__Container-sc-1gw2hd1-0 grExlx CartridgeModal__StyledButton-rj7zrv-12 kpurdQ'])");
				// "(//*[@class = 'Button__Container-sc-1gw2hd1-0 cgDEIA CartridgeModal__StyledButton-rj7zrv-12 jpsrvd'])");
		
		//Magnetic USB
		public static By lnkMagneticUsbChrging = By.xpath("(.//*[@class = 'Addon__Description-sc-1v6idwa-7 esIXRP'])[3]");
				// "(.//*[@class = 'Addon__Container-sc-1v6idwa-0 jwoMGs'])[3]");

		//Magnetic USB charging Add '+' button
		public static By btnMagneticUsbCharging = By.xpath("(.//*[@class = 'QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[4]");
				// "(.//*[@class = 'QuantityPicker__Button-v6i9u9-1 vSeSQ'])[4]");

		public static By txtOtherBenefitsgold=By.xpath("(//*[text()='gold'])[2]");

		
		



}
