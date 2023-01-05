package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_PlatinumProfileTrigger {
	
	//
	
	public static final By PriceVal = By.xpath("(//*[text()='13.99'])[1]");

		//Rewards Page
		public static By pgRewards = By.xpath("(//*[text()='Rewards'])");
				// "(.//*[text()='Rewards'])");
		
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
		
		//Buynow Solo Device
		public static By btnBuyNowSolo = By.xpath("//*[@href='/ca/en/buy-online/epod-devices/']");
				// "//*[@href='/ca/en/buy-online/epod-devices/']//*[text()='Buy now']");//xpath changed
		
		//Rose Gold Color Device
		public static By btnRoseGold = By.xpath("(//*[@data-tip='Rose Gold'])[1]");
				// "(.//*[@class='BuyDevices__Swatch-sc-14cdzpe-6 drJyGy'])[1]");
				// "(.//div[@class='BuyDevices__SwatchItem-sc-14cdzpe-5 enhXMX'])[3]");
				// ".//button[@class='BuyDevices__Swatch-sc-14cdzpe-6 hZXRvL']");
				// ".//button[@class='BuyDevices__Swatch-yfmzvh-6 gedmdc']");
		
		//Rose Gold Color Changed
		public static By RoseGoldePod = By.xpath(".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/VUSE_ROSE_DEVICE_HWW-650x650px_cd40d67c-12b7-4f11-a991-86d4528cba1a.png?v=1604601066']");
				// ".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Vuse_ePod_RoseGold_1200x.png?v=1591716598' and @class='BuyChrome__Photo-sc-1okt7kc-8 ffRURY']");//.//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/rose_1200x.png?v=1588180193' and @class='BuyChrome__Photo-sc-1okt7kc-8 ffRURY']
		
		//Vype Epod Solo Device Page
		public static By pgVypeEPod = By.xpath(".//h1[text()='ePod']"); //.//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 fPInSt u-hide-medium-down' and text()='Vype ePod']
			
		//Cost Of Solo Device
		public static By costSoloDevice = By.xpath(".//h3[@class='typography__H3-vraxd4-2 BuySummary__Price-sc-1htlc15-2 cSsPzc']");
		
		//Cost Of USB Magnetic Cable
		public static By costUSBMagenticCable = By.xpath("(.//span[@class='Addon__Price-sc-4qaprn-5 gkusDr'])[2]");
		
		//Add Items And Go To Cart (Solo Device) and ePen
		public static By btnAddItemsToCart = By.xpath("//*[text()='Add items & go to cart']");
				// ".//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Add items & go to cart']");
		
		//Yes Please Button
		public static By btnYesPlease = By.xpath("(.//*[text()='Yes please'])");
		
		//All 10 Flavours in Solo Device
		public static By flavoursPod = By.xpath(".//div[@class='BuyCartridges__Container-sc-1liiork-0 fzMDbs']");
		
		//Blood Orange Flavour
		public static By weBloodOrangeFlavour =  By.xpath(".//img[@alt='Blood Orange']");//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/BloodOrange.png?v=1588180180' and @alt='Blood Orange']
		
		//Add Button For Blood Orange Flavour
		//public static By btnAddBloodOrange = By.xpath("(.//*[text()='+ Add'])[3]");
		public static By btnAddBloodOrange = By.xpath("(.//div[@class='Cartridge__Overlay-sc-38s8x4-10 dYLrSa'])[2]");
				// "(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[3]");
			
		//1.6% Blood Orange Nicotine Strength
		public static By btnPlusOnePointSixPercentBloodOrange = By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");
		
		//Quantity value of Blood Orange Flavour
		public static By txtQuantityValueBloodOrange = By.xpath("//span[@class=QuantityPicker__Value-v6i9u9-2 dBxpvX']");
				// "//span[@class='QuantityPicker__Value-sc-19b5kqw-2 ktiaUE']");
		
		//Polar Mint Flavour
		public static By lnkPolarMintFlavour = By.xpath(".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Mint_4f5568f5-2eed-439a-8443-909e49cf41a4.png?v=1588877342' and @alt='Polar Mint']");
		
		//Polar Mint Add Button
		public static By btnAddPolarMintFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[5]");
		
		//Flavour Page With Nicotine Strengths
		public static By pgFlavourWithNicotineStrengths = By.xpath(".//h4[@class='typography__H4-vraxd4-3 lnJAdL']");
		
		//Berry Blast Flavour
		public static By weBerryBlastFlavour = By.xpath(".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Berry.png?v=1588180177' and @alt='Berry Blast']");
		
		//Berry Blast Add Button
		public static By btnAddBerryBlastFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[6]");
		
		//Mango Wonder Flavour
		public static By weMangoWonderFlavour = By.xpath(".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Mango.png?v=1588180221' and @alt='Mango Wonder']");
		
		//Mango Wonder Add Button
		public static By btnAddMangoWonderFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[7]");
			
		//Golden Tobacco Flavour
		public static By weGoldenTobaccoFlavour = By.xpath(".//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Tobacco.png?v=1588180259']");
		
		//Golden Tobacco Add Btn
		public static By btnAddGoldenTobaccoFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[8]");
		
		//Vanilla Medley Flavour
		public static By weVanillaMedleyFlavour = By.xpath(".//img[@alt='Vanilla Medley']");
		
		//Vanilla Medley Add Btn
		public static By btnAddVanillaMedleyFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[9]");
		
		//Garden Strawberry Flavour
		public static By weGardenStrawberryFlavour = By.xpath(".//img[@alt='Garden Strawberry']");
		
		//Garden strawberry Add button
		public static By btnAddGardenStrawberry = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[10]");
		
		//-----------
		//Infused Cucumber Objects
		
		
		//Infused Cucumber Flavour
		public static By lnkInfusedCucumberFlavour = By.xpath(".//img[ @alt='Cucumber']");//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Cucumber.png?v=1588180220' and @alt='Infused Cucumber']

		//Add Button 
		public static By btnAddInfusedCucumberFlavour = By.xpath("(.//button[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[4]");
		
		//Infused Cucumber Page
		public static By pgInfusedCucumber = By.xpath(".//h4[@class='typography__H4-vraxd4-3 lnJAdL']");
		
		//Nicotine Strength 1.6% Plus Button
		public static By btnPlusOnePointSixPercent = By.xpath("//*[@class='CartridgeModal__Inner-kepi1t-2 hJCZll']//div[2]//div[1]//button[2]");//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]
		
		//Value Of 1.6% Nicotine Strength
		public static By weValueNicotineStrength = By.xpath("(.//span[@class='QuantityPicker__Value-sc-19b5kqw-2 ktiaUE'])[2]");
		
		//Add In Nicotine Strength
		public static By btnAddNicotineStrength = By.xpath("//*[text()='Add']");
				// ".//button[@class='Button__Container-sc-186nrqc-0 dBtxRE CartridgeModal__StyledButton-kepi1t-12 dIriId']");
		
		//Added Element
		public static By weAdded = By.xpath(".//button[@class='Cartridge__Action-sc-1rejg92-7 cxexGP']/span");

		//We Thought You Might Be Interested In This Too
		public static By weTxtWeThoughtYouMightBeInterestedInThisToo = By.xpath("(.//header[@class='BuySection__Header-sc-1bcwzdv-1 jSnsps u-hide-medium-down']//h4)[4]");


		//-----------
		
		//I am Fine Button
		public static By btnIAmFine = By.xpath(".//*[text()='Yes please']/following-sibling::button");
		
		//Magnetic USB Charging Cable
		public static By btnUSBChargingCable = By.xpath("(//*[contains(text(),'Pod Caps')])[1]");
				// "(.//h4[@class='typography__H4-vraxd4-3 Addon__Heading-sc-4qaprn-3 dAxjJG'])[2]");
		
		//Price Value In One Time Purchases Screen
		public static By priceVal = By.xpath("(//*[text()='26.00'])[1]");
		//public static By PriceVal = By.xpath("//span[@class='Product__Price-ra1xzv-10 euFcXD']");
				// "(//*[text()='13.00'])[1]");
				// "(.//div[@class='Total__Line-sc-1axpxsv-4 fzizUR'])[3]");
				// "(//*[text()='13.00'])[1]");
				// "(.//div[@class='Total__Line-sc-1axpxsv-4 fzizUR'])[3]");
				// ".//span[@class='Product__Price-sc-92om0c-10 ZCyDI']");
		
		//+ Button
		public static By plusButton = By.xpath("(//div[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[12]");
		
		//Quantity value
		public static By txtQuantityValue = By.xpath(".//span[@class='QuantityPicker__Value-sc-19b5kqw-2 ktiaUE']");
			
		//Items In Cart
		public static By itemsInCart = By.xpath("(//*[text()='Passionfruit'])[3]");
				// "(.//*[text()='Strawberry'])[2]");
		
		public static By itemsinCart = By.xpath(".//div[@class='Product__Container-sc-ra1xzv-0 dYImQG']");
				// ".//div[@class='Product__Container-sc-92om0c-0 hwBTQx']");
		
		//Price Values In Cart
		public static By priceValuesInCart = By.xpath(".//*[@class='Main__CartSection-jzkev4-9 bXUvao']//div//div//div[2]");
		
		//Cart Page
		public static By pgCart = By.xpath("//*[text()='Your cart']");
				// ".//h1[@class='typography__H2-vraxd4-1 Header__Heading-kgwx6d-1 gynMtS' and text()='Your cart']");
		
		//Prices In Cart
		public static By pricesInCart = By.xpath("//div[@class='Product__Cell-sc-92om0c-1 Product__PriceCell-sc-92om0c-5 hglEYU u-text-center']");
			
		//One Time Purchase Value 
		public static By purchaseValue = By.xpath(".//*[text()='One time purchase total']/following-sibling::strong");
		
		//Shipping Value
		public static By shippingValue = By.xpath(".//*[text()='Shipping']/following-sibling::strong");
		
		//Shipping Value For Subscription
		public static By weShippingValueForSubscriptionInDeliveryPage = By.xpath("(.//*[text()='Shipping']/following-sibling::strong)[1]");
		
		
		//Checkout Button
		public static By btnCheckOut = By.xpath(".//a[@href='/checkout']");
		
		//CheckOut Page Element
		public static By txtCheckOut = By.xpath(".//*[text()='Checkout']");
		
		//Direct To Post Office
		public static By btnDirectToPostOffice = By.xpath(".//div[@class='ShippingMethod__OptionInner-sc-1esejh7-3 eTXcBs']");
		
		//Home
		public static By btnHome = By.xpath("//div[@class='ShippingMethod__OptionInner-sc-1esejh7-3 eTXcBs']"); // xpath changed //div[@class='ShippingMethod__OptionInner-sc-1esejh7-3 fTQDOP']
		
		//PinCode TextBox
		public static By txtPinCode = By.xpath("//input[@placeholder='Postal code']");
		
		//Search Button
		public static By btnSearch=By.xpath("//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='SEARCH']");
		
		//PinCode List First Element
		public static By firstEleList = By.xpath("(//span[@class='StoresList__Name-sc-1b8zlke-7 grDeoO'])[1]");
		
		//Go To Delivery Button
		public static By btnGoToDelivery = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 gtYgrt' and text()='Go to delivery']");
		
		//One Time Purchase Total Value
		public static By cartValueTotal = By.xpath("//div[@class='Total__Line-sc-1flxtnt-4 fnEapu' and span='One time purchase total']//strong");
		
		//Canada Post(Standard)
		public static By rdbtnCanadaPostDelivery = By.xpath(".//span[@class='SelectBox__Label-bqz5l1-5 jEyVbR' and text()='Canada Post (Standard)']");
		
		//Discount Code
		public static By txtDiscountCode = By.xpath(".//*[@class='PriceBreakdownDiscounts__Code-sc-71wp3s-1 kTcZOT']");
				//"(.//*[text()='Discount code'])");
		
		//Go To Billing
		public static By btnGoToBilling = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 gtYgrt' and text()='Go to billing']");
		
		//Address
		public static By txtAddress = By.xpath(".//input[@name='address' and @class='Input__Field-sc-1d4fqnm-3 ejXZmh' and @type='text']");
		
		//Address Drop down
		public static By addrDrpDwn =  By.xpath(".//div[@class='pcaitem pcafirstitem pcaselected']");
		
		//Ship To Your Address Instead Button
		public static By btnShipToYourAddressInstead = By.xpath(".//button[text()='Ship to your address instead ›']"); 
		
		//Progress Bar In Rewards Page
		public static By barProgressStatus = By.xpath("//*[contains(@class,'TierProgress__ProgressBarFill')]");
				// "//*[@class='TierProgress__ProgressBarFill-sc-1p2p3fp-4 ccNFpj']");
		
		//Order Value In Shopify
		public static By ShopfyorderVal = By.xpath(".//div[@class='order-details__line-item-total-price type--right']");
		
		//ShopifyOrder Total Value
		public static By ShopifyOrderTotalValue = By.xpath(".//tbody[@class='order-details__summary__paid_by_customer']//tr[2]//td[2]");
		
		//Shopify Account
		public static By btnshopifyAccount = By.xpath(".//button[@class='juNP0']");
		
		//Shopify LogOut
		public static By btnshopifyLogOut = By.xpath(".//div[@class='_2inay' and text()='Log out']");
		
		//You have Peaked at Platinum
		public static By txtPlatinum = By.xpath("//*[contains(text(),' Platinum status gives you')]");
				//".//h3[@class='typography__H3-vraxd4-2 TierProfileHeader__Heading-c8hvo0-2 dSSdoj']");
		
		//Platinum Card
		public static By wePlatinumCard = By.xpath(".//*[contains(@class,'TierCard__Content')]");
				// ".//*[@class='TierProfileHeader__CardWrap-sc-1q6fxmg-4 iUGXuW']");
		
		
		//Platinum Benefits
		public static By txtPlatinumBenifits = By.xpath("//*[text()='Your other ']");
				// ".//h4[@class='typography__H4-vraxd4-3 TierBenefits__Heading-sc-15zforz-2 fCyWZS']");
		
		//Platinum Benfits Points(Free shipping,Birthday gift,early access)
		public static By txtPlatinumBenifitsPoints = By.xpath(".//div[@class='TierBenefits__Content-sc-1bk8881-3 gdqGoK']");
				// ".//div[@class='TierBenefits__Content-sc-1bk8881-3 dIMYBn']");
		
		//ShopifyOrderInTable
		public static By orderInTable = By.xpath("//table/tbody/tr[1]/td[2]");
		
		
		//Pods Under ePen under Products
		public static By lnkPodsEPen = By.xpath(".//a[@href='/buy-online/vype-epen-3-cartridges']");
		
		//Devices Under ePen
		public static By lnkDevicesEPen = By.xpath(".//a[@href='/buy-online/epen-3']");
		
		//ePen->Pods Page
		public static By pgPodEPen = By.xpath(".//h1[@class='typography__H1-vraxd4-0 CollectionHeader__LargeHeading-sc-63ptu-2 gbspfz' and text()='ePen Pods']");
		
		//Subscribe
		public static By lnkSubscribe = By.xpath("(.//a[contains(@href,'/subscribe')])[1]");
		
		//Why Shop Online
		public static By drpDownWhyShopOnline  = By.xpath(".//*[text()='Why Shop Online?']");
		
		//Vuse+ Link Under Why Shop Online
		public static By lnkVusePlus = By.xpath("(//*[text()='Vuse+ Rewards'])[1]"); 
		
		//Store Locator
		public static By lnkStoreLocator = By.xpath("//*[text()='Store Locator']");
		
		//General Information In Pods(ePen)
		public static By txtinfoPodsePen = By.xpath("//div[@class='CollectionHeader__Description-sc-63ptu-3 exphfX']");
		
		//ePen Page Product Value
		public static By ePenDeviceValue = By.xpath(".//h3[@class='typography__H3-vraxd4-2 BuySummary__Price-sc-1htlc15-2 cSsPzc']");
		
		//Engravable Device
		public static By lnkEngravableDevice =By.xpath(".//h4[@class='typography__H4-vraxd4-3 ProductCard__Name-sc-7qc70h-6 fxtnmS' and text()='Engravable ePod']");
		
		//Buy Now Engravable Device
		public static By btnBuyNowEngravableEpod = By.xpath("(.//button[@class='Button__Container-sc-186nrqc-0 hIWVdw ProductCard__StyledButton-sc-7qc70h-11 eJezfu u-hide-medium-down'])[2]");
		
		//Grpahite Color Engravable Device
		public static By btnGraphiteColorEngravableDevice = By.xpath(".//button[@class='BuyDevices__Swatch-yfmzvh-6 bfUUvD']");
		
		//Engraved Device
		public static By btnEngravedDevice=By.xpath("(.//div[@class='Addon__Overlay-sc-4qaprn-2 kTZUrh'])[1]");
		
		//Engraved Device Add Button
		public static By btnAddEngravedDevice = By.xpath("(.//button[@class='Addon__Action-sc-4qaprn-9 hNpTMZ' and text()='+ Add'])[1]");
		
		//Engravable EPod Page
		public static By pgEngravableePod = By.xpath(".//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 fPInSt u-hide-medium-down' and text()='Engravable ePod']");
		
		//Customise the Front Page
		public static By pgCustomiseTheFront = By.xpath(".//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Customize the Front']");
		
		//Front Text
		public static By lnkFrontTextPattern = By.xpath(".//img[@src='static/images/engraving/options/pattern.png' and @class='EngravingOption__Figure-sc-95ewki-8 dSCSP']");
		
		//Choose The Pattern You Like Page
		public static By pgChooseThePatternYouLike = By.xpath(".//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Choose the pattern you like']");
		
		//Solstice Pattern 
		public static By btnSolsticePattern = By.xpath(".//button[@class='EngravingComponents__SelectOption-sc-1jc808b-0 gpRyFV' and text()='Solstice']");
		
		//Pattern To Add
		public static By wePatternFront = By.xpath(".//img[@src='static/images/engraving/patterns/solstice/grove.svg' and @alt='Grove pattern']");
		
		//EPod After Adding Pattern
		public static By weEPodAfterFrontPattern = By.xpath(".//img[@src='static/images/engraving/patterns/solstice/grove.svg' and @class='BuyChrome__EngravingPattern-sc-1okt7kc-9 lfRcUt']");
		
		//Add Pattern
		public static By btnAddPattern = By.xpath(".//button[@class='Button__Container-sc-186nrqc-0 fsdDsM']");
		
		//Customise The Back Page
		public static By pgCustomiseTheBack = By.xpath(".//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Now customize the Back']");
		
		//Text On Back Of EPod
		public static By btnTxtOnBackOfEpod = By.xpath(".//span[@class='EngravingOption__Name-sc-95ewki-1 kzcJHL' and text()='Text']");
		
		//Add Text To your Device
		public static By pgAddTextToYourDevice = By.xpath(".//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Add text to your device']");
		
		//Horizontal button
		public static By btnHorizontal = By.xpath(".//button[@class='EngravingComponents__SelectOption-sc-1jc808b-0 erVDpe' and text()='Horizontal']");
		
		//Text For Horizontal Button
		public static By txtHorizontal = By.xpath(".//small[@class='Input__Hint-sc-1d4fqnm-8 kOSESU' and text()='Add up to 3 characters-go ahead, express yourself.']");
			
		//Font Selection
		public static By weFontStyle = By.xpath("(.//span[@class='EngravingOption__Name-sc-95ewki-1 cWnoey'])[1]");		
		
		//Enter Your Text
		public static By weEnterYourTextBack = By.xpath(".//input[@class='Input__Field-sc-1d4fqnm-3 dFfLci' and @name='text']");
		
		//Add Text Button
		public static By btnAddTextBackSection = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Add Text']");
		
		//BackText On ePod
		public static By weBackTextPrintedOnEPod = By.xpath(".//*[@class='BuyChrome__CustomText-sc-1okt7kc-10 BuyChrome___StyledCustomText3-sc-1okt7kc-11 dfAhjv']/span");
		
		//Make it yours page ePod
		public static By pgMakeItYours = By.xpath("//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Make it yours']");
		
		//ePod Box Name Text Box
		public static By weBoxName = By.xpath(".//input[@class='Input__Field-sc-1d4fqnm-3 dFfLci' and @type='text']");
		
		//Text On Box
		public static By weTxtOnBox = By.xpath(".//div[@class='BuyChrome__BoxText-sc-1okt7kc-14 coNwar']//span//span//span//span");
		
		//Add Your Name
		public static By btnAddYourName = By.xpath(".//span[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Add your name']");
		
		//Engraving Summary Page
		public static By pgEngravingSummary = By.xpath(".//h3[@class='typography__H3-vraxd4-2 Heading__Title-sc-1kmghi1-4 klCZRW' and text()='Engraving Summary']");
		
		//Engraving Summary Page List
		public static By lstEngravingSummary = By.xpath(".//div[@class='BuyChrome__Content-sc-1okt7kc-6 eORxlo']/div[2]");
		
		//Add Engraving Button
		public static By btnAddEngraving = By.xpath(".//button[@class='Button__Container-sc-186nrqc-0 fsdDsM']");
		
		
		
		//Add Skin
		public static By btnAddSkin = By.xpath(".//button[@class='Addon__Action-sc-4qaprn-9 hNpTMZ']");
		
		//Choose Your Skin Page
		public static By pgChooseYourSkin = By.xpath(".//h4[@class='typography__H4-vraxd4-3 CustomSkinModal__Heading-sc-7b2hv1-10 kwZGXW' and text()='Choose your skin']");
		
		//Fractural Fabrichromatic Skin
		public static By weFracturalFabrichromaticSkin = By.xpath("(//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 emkcng'])[2]");//div[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 dotxwq'])[2]
		
		//Fractural Skin Element Text
		public static By weTxtFractural = By.xpath("(//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 emkcng'])[2]");
		
		//Add Button In Choose Skin
		public static By btnAddChooseSkin = By.xpath(".//button[@class='Button__Container-sc-186nrqc-0 dBtxRE CustomSkinModal__StyledButton-sc-7b2hv1-17 hPFhEC']");
		
		//EPod Skin Is Added
		public static By btnRemoveEPodSkinAfterAdding = By.xpath(".//button[@class='Addon__ProductRemove-sc-4qaprn-15 dGfQpG']");
		
		//Lychee Online Only under Engravable device 
		public static By weLycheeFlavour = By.xpath("(.//*[@class='Cartridge__Main-sc-1rejg92-4 kaxtBC'])[1]");
		
		//Online Only For Lychee Flavour
		public static By weLycheeOnlineOnly = By.xpath("(.//*[@class='Cartridge__OnlineTag-sc-1rejg92-12 hUtZSU u-hide-medium-down'])[1]");
		
		//Passion Fruit Online Only under Engravable device
		public static By wePassionFruitFlavour = By.xpath("(.//*[@class='Cartridge__Main-sc-1rejg92-4 kaxtBC'])[2]");
		
		//Online Only For Passion Fruit Flavour
		public static By wePassionFruitOnlineOnly = By.xpath("(.//*[@class='Cartridge__OnlineTag-sc-1rejg92-12 hUtZSU u-hide-medium-down'])[2]");
		
		//Vuse + Page Objects
		
		//Vuse+ Page
		public static By pgVusePlus = By.xpath("//*[text()=' Rewards']");
				// "//*[text()='This is ']");
				// ".//h1[@class='typography__H1-vraxd4-0 PlusHeader__Heading-o7hjgb-3 buRUMC']/strong");
		
		//Get More with Vuse+
		public static By weGetMoreWithVusePlusContent = By.xpath("//*[text()='Get More with Vuse+']");
				// ".//h3[@class='typography__H3-vraxd4-2 Video__Subheading-sc-19zycmh-2 eeqNNk']");
		
		//Video
		public static By weVideoInVusePlusPage = By.xpath(".//div[@class='VideoContainer__Container-sc-1bbjn8r-0 jFpRQs']");
		
		//Video Link and also used for pause and play
		public static By lnkVideo = By.xpath("//iframe[@src='https://player.vimeo.com/video/415737261']");
				// ".//iframe[@src='https://player.vimeo.com/video/415737261' and @class='VideoContainer__Video-sc-1bbjn8r-1 bGjCKp']");
		//.//iframe[@src=https://player.vimeo.com/video/415737261' and @class='VideoContainer__Video-sc-1bbjn8r-1 bGjCKp']
		//Progress Bar Of Video
		
		public static By weValueOfProgress = By.xpath(".//div[@class='focus-target']");
		
		//Volume In Video
		public static By weVolumeInVideo = By.xpath(".//*[@class='volume']");
		
		
		
		//Shopify Orders
		public static By shopifyOrderItems = By.xpath(".//div[@class='ui-stack ui-stack--alignment-center ui-stack--spacing-tight unfulfilled-card__line_item__details']");
		
		//***********************************
		
		 //Passionfriuit
		public static By ImgPassionfruit = By.xpath("(//*[text()='Passionfruit'])[1]");
		
		
		//Products ->Under Epod -> Pods object
		public static By lnkpodsUnderEpodsUnderProducts = By.xpath(".//a[@href='/buy-online/vype-epod-vpro-cartridges' and @data-tracking='nav--link--text--ePod_Pods']");
		
		//EPod Pods Page
		public static By pgEpodsPods = By.xpath(".//h1[@class='typography__H1-vraxd4-0 CollectionHeader__LargeHeading-sc-63ptu-2 gbspfz']");
		
		//EPods Advisory Text
		public static By txtAdvisoryEPodsPods = By.xpath("//*[text()='ePod Vape Pods']/..");
				//+ "//*[@class='CollectionHeader__Description-sc-1no8wao-3 ivqVuD']"); 
		
		//Advisory Text below cost
		public static By txtCostBelowAdvisoryText = By.xpath(".//h4[@class='typography__H4-vraxd4-3 CollectionHeader__Price-sc-63ptu-5 ituhyI']");
		
		//Social Media Links
		public static By lnkSocialMediaLinks = By.xpath(".//div[@class='Footer__Social-sc-1ij96b8-11 bwJmAx']");
		
		//Footer Links Section 1(Contact us,faq's,store locator)
		public static By lnkFootersListSection1 = By.xpath(".//div[@class='Footer__List-sc-1ij96b8-4 jmiCeo']");
		
		//Footer Links Section 2(Conditions Of Sale,Privacy Policy,Terms & Conditions,Cookie Policy)
		public static By lnkFooterListSection2 = By.xpath(".//div[@class='Footer__SecondaryList-sc-1ij96b8-9 jeHics']");
		
		//Legal Advisory and head quarters
		public static By txtLegalAdvisoryHeadQuarters = By.xpath("//*[contains(text(),'Imperial Tobacco Company')]");
				//+ "(.//p[@class='Footer__Disclaimer-sc-1uvvy50-6 kzykla'])[2]");
				// "(.//p[@class='Footer__Disclaimer-sc-1ij96b8-6 fQlgeh'])[2]");
		
		//Subscription Button
		public static By btnSubscriptionBox = By.xpath(".//div[@class='SubscriptionInfoBox__TriggerContent-d3gg5w-2 dxpQsv']");
				// ".//button[@class='SubscriptionInfoBox__Trigger-sc-116q5wh-1 wdWDe']");
		
		//EPod Pods Flavour
		public static By weEPodPodsFlavour = By.xpath("//h1[contains (@class , 'Card__Title')]");//div[@class='CartridgeList__Inner-sc-9th72d-1 dpXSqR']

		//Passion Fruit Flavour
		public static By lnkEPodPodsFlavourPassionFruit = By.xpath("//*[@href='/buy-online/vype-epod-vpro-cartridges/passionfruit-fields']");//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/PassionFruit.png?v=1588180249' and @alt='Passionfruit Fields']
		
		//Passionfruits Fields Flavour Page
		public static By pgPassionfruitsFieldsFlavour = By.xpath(".//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down']");
		
		//OutOfStock
		public static By weOutOfStockForNicotineStrength = By.xpath(".//*[@class='Selector__Tag-sc-1weayt0-6 jsqzMH']");
		
		//Lychee Flavour
		public static By lnkEPodPodsFlavourLychee = By.xpath("(.//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/lychee.png?v=1588180218' and @alt='Lychee Orchard'])[2]");
		
		//Cucumber Flavour
		public static By lnkEPodPodsFlavourCucumber = By.xpath("//*[@href='/buy-online/vype-epod-vpro-cartridges/infused-cucumber-epod-cartridge']");//img[@src='https://cdn.shopify.com/s/files/1/0039/4926/4969/products/Cucumber.png?v=1588180220' and @alt='Infused Cucumber']
		
		//Cucumber Flavour Page
		public static By pgCucumberFlavourEpodsPods = By.xpath(".//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down']");//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down' and text()='Infused Cucumber']
		
		//Cucumber Page Flavour Description
		public static By weCucumberFlavourPageDescription = By.xpath(".//div[@class='RichText__Container-sc-1rvf6d4-0 fqLGqG']//div");
		
		//Subscription Box In Cucumber Flavour
		public static By weSubscriptionBoxCucumberFlavour = By.xpath("(.//*[@class='OrderType__Trigger-sc-104vt6j-4 dedyhu'])[2]");
		
		//Nicotine Strengths In Cucumber Flavour
		public static By weNicotineStrengthCucumberFlavour = By.xpath(".//*[@class='Selector__Container-sc-11d7cac-0 gPpGuU']");
				// ".//*[@class='Selector__Strength-sc-1weayt0-6 knGHXH']");//*[@class='Selector__Strength-sc-1weayt0-5 ktNvAO']
		
		//Plus and Minus Buttons For Nicotine Strengths
		public static By btnsPlusMinusForicotineStrenghts = By.xpath(".//button[contains(@class,'QuantityPicker__Button')]");
				// ".//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul']");
		
		//Total Amount In Cucumber Flavour Page
		public static By weTotalAmountInCucumberFlavour = By.xpath(".//h3[@class='typography__H3-sc-10lefml-2 Summary__Price-sc-1hujf0n-5 guBiwN jokeHU']");
			// ".//*[@class='typography__H3-vraxd4-2 Summary__Price-sc-1ju87qi-4 jgRiaq']");//*[@class='typography__H3-vraxd4-2 Summary__Price-sc-1ju87qi-4 gNYcsz']
		
		//Add To Cart In Flavour Page
		public static By btnAddToCartFlavour = By.xpath(".//*[@class='Button__Container-sc-1gw2hd1-0 grExlx Summary__StyledButton-sc-1hujf0n-3 fPkWpE']");
				// ".//*[@class='Summary__Container-sc-1hujf0n-0 gzZrNp']");
				// ".//*[@class='Button__Container-sc-1gw2hd1-0 grExlx Summary__StyledButton-sc-1hujf0n-3 fPkWpE']");//button[@class='Button__Container-sc-186nrqc-0 dBtxRE Summary__StyledButton-sc-1ju87qi-3 giWzOp']
		
		//---------------------------------------
		//Epod Pods Flavour
		
		//First Nicotine Strength Flavour Plus button
		public static By btnPlusButtonEPodPodsFlavour1STnicotineStrength = By.xpath("(.//button[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[2]");
				// "(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");
		
		//Second Nicotine Strength Flavour Plus Button
		public static By btnPlusButtonEPodPodsFlavour2NDnicotineStrength = By.xpath("(.//button[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[4]");
				// "(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");
		
		//Second Nicotine Strength Flavour Plus Button
		public static By btnPlusButtonEPodPodsFlavour3RDnicotineStrength = By.xpath("(.//button[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[6]");
				// "(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[6]");	
		
		//First Nicotine Strength Flavour Minus button
		public static By btnMINUSbuttonEPodPodsFlavour1STnicotinestrength = By.xpath("(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[1]");

		//Second Nicotine Strength Flavour Minus button
		public static By btnMINUSbuttonEPodPodsFlavour2NDnicotinestrength = By.xpath("(.//button[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[1]");
				// "(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[3]");

		//Third Nicotine Strength Flavour Minus button
		public static By btnMINUSbuttonEPodPodsFlavour3RDnicotinestrength = By.xpath("(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[5]");
			
		//Quantity Text For 1st Nicotine Strength Added
		public static By weQuantityFlavour1STnicotineStrength = By.xpath("(.//span[@class='QuantityPicker__Value-v6i9u9-2 dBxpvX'])[1]");
				// "(.//div[@class='QuantityPicker__Container-sc-19b5kqw-0 lkzym']//span)[1]");
		
		//Quantity Text For 2nd Nicotine Strength Added
		public static By weQuantityFlavour2NDnicotineStrength = By.xpath("(.//div[@class='QuantityPicker__Container-sc-19b5kqw-0 lkzym']//span)[2]");
		
		//Quantity Text For 3rd Nicotine Strength Added
		public static By weQuantityFlavour3RDnicotineStrength = By.xpath("(.//div[@class='QuantityPicker__Container-sc-19b5kqw-0 lkzym']//span)[3]");
		
		//Mini Cart
		public static By btnMiniCart = By.xpath("(.//a[@data-tracking='nav--link--image--Cart' and @href='/cart' ])[1]");
		
		//View Cart in Mini Cart
		public static By btnViewCartInMiniCart = By.xpath("(.//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='View cart'])[1]");

		//Items Number in Mini Cart
		public static By weItemsQuantityMiniCart = By.xpath("(.//*[@class='TinyCart__Quantity-i4vlf8-3 vixG'])[1]");
				// "(.//*[@class='TinyCart__Quantity-fpderd-3 PDZHI'])[1]");
		

		
		
		//*********************************************
		//Login Page
		
		//Error Message - Password Is Required
		public static By weErrorMsgPasswordField = By.xpath("//*[text()='Password is required']");
		//Error Message - Password length
        public static By weErrorMsgPasswordlength= By.xpath("//*[text()='Must be at least 8 characters']");
		
		//Error Message - Email Or Password incorrect- .//*[@class='FormFeedback__Container-sc-10iswkd-0 coCkSX']/p
		public static By weEmailOrPasswordIncorrect = By.xpath(".//div[@type='error']/p");
		
		//Click On Vuse Logo
		public static By pgHomeVuseLogo = By.xpath(".//a[@data-tracking='nav--link--image--Vype_Home' and @href='/']");
		
		//SignUp button in Login Page
		public static By btnSignUpInLoginPage = By.xpath(".//*[text()='Sign up']");
		
		//Close Registration Page
		public static By btnCloseRegistrationPage = By.xpath("(.//button[@type='button'])[2]");
				// "(.//*[@icon='close-small'])[2]");
		
			
		
		//=======================================================================================================================================================================================================================================================
		
		
		//New Release Objects
		
		//Description Under Flavour - Passion Fruit
		public static By weDescriptionUnderFlavourEpodPods = By.xpath("//*[contains(text(),'A fusion of ')]");
		
		//Subscribe & Save - Passion Fruit
		public static By btnSubscribeAndSaveFlavourEpodPods = By.xpath("(.//*[text()='Subscribe & save'])[1]");//xpath changed
		
		//CheckOut Button If User Is Not Logged In
		public static By btnCheckOutIfUserNotLoggedIn = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 gtYgrt' and text()='Checkout']");
		
		//++++++++++++++++++++++++++++++++++++++++
		
		
		//Flavours in EPen3 EPod Page
		
		//All Flavors In Epen3 epod page
		public static By weAllFlavoursEpenEpodPage = By.xpath(".//div[@class='CartridgeList__Inner-sc-1pl5t7r-1 iQvzaI']");
				// ".//div[@class='CartridgeList__Item-sc-2ftro7-2 fuCErR']");
			
		//All Flavors Nicotine Strengths
		public static By weAllNicotineStrengthsEpenEpodPage= By.xpath(".//div[@class='CartridgeList__Inner-sc-1pl5t7r-1 iQvzaI']");
				// "(.//*[@class='CartridgeThumbnail__Strength-b1fml5-17 iqWIYQ'])");
		
		//All Flavors Add Button and Quantity Picker
		public static By weAllQuantityPickerAndAddBtnEpenEpodPage= By.xpath(".//div[@class='CartridgeList__Inner-sc-1pl5t7r-1 iQvzaI']");
				// ".//*[@class='CartridgeThumbnail__Footer-b1fml5-14 irQZhv']");
		
		//All flavors - 0 Nicotine Strengths
		public static By weAllFlavour0MGMLNicotineStrength = By.xpath(".//*[@class='CartridgeThumbnail__Strength-m1q1va-17 kCpUVv']/button[@class='CartridgeThumbnail__Option-m1q1va-18 fpppRO' and text()='0mg/ml']");
		
		//Footer Only For Nicotine Free Strengths
		public static By weMinusPlusAddBtnFor0MGMLNicotineStrength = By.xpath(".//*[@class='CartridgeThumbnail__Content-m1q1va-6 cvvBOU']//div[3]//*[@class='CartridgeThumbnail__Option-m1q1va-18 fpppRO' and text()='0mg/ml']/../../following-sibling::footer");
		
		//Classic Tobacco Flavour
		public static By lnkFlavourEpenEpodPageClassicTobacco = By.xpath(".//a[@href='/buy-online/vype-epen-3-cartridges/classic-tobacco-vpro-epen-3-cartridge']");
		
		//Title
		public static By weFlavourTitleEpenEpodPageClassicTobacco = By.xpath("(.//*[@class='CartridgeThumbnail__Title-m1q1va-8 YJwsn'])[1]");
		
		//Validate Nicotine Strengths
		public static By weNicotineStrengthsFlavourEpenEpodNew = By.xpath(".//*[@class='Selector__Strength-sc-1weayt0-6 knGHXH']");
		
		//One time purchase button
		public static By btnOneTimePurchaseInFlavourEpen = By.xpath(".//*[@class='OrderType__Label-sc-104vt6j-1 jANEwk' and text()='One time purchase']");
		
		//Total Amount
		public static By weTotalAmountEpenEpodFlavour = By.xpath(".//*[@class='typography__H3-vraxd4-2 Summary__Price-sc-1ju87qi-4 jgRiaq']");
		
		//Add To Cart Button
		public static By btnAddToCartFlavourEpenEpod = By.xpath(".//*[@class='Summary__ButtonWrap-sc-1ju87qi-1 bcbciW']/button//*[@class='Button__Label-sc-186nrqc-2 jpETUM']");
		
	//****************************
		
		//Pods Under EPod
		public static By lnkPodsUnderEpod = By.xpath(".//a[@href='/buy-online/vype-epod-vpro-cartridges' and text()='Pods']");
		
		//Epod Pods Page
		public static By pgEPodPods = By.xpath(".//*[@class='typography__H1-vraxd4-0 CollectionHeader__LargeHeading-sc-63ptu-2 gbspfz' and text()='ePod Pods']");
		

	//******************************	
		
		//+++++++++++++++++++++++++++++++++++++++++
		
		//Subscription Page EPen3
		
		//Subscribe & Save
		public static By btnSubscribeAndSave = By.xpath(".//*[@class='NavLabel-sc-2zus1-0 jPyzfm' and text()='Subscribe & Save']");
		
		//Subscribe and Save Page
		public static By pgSubscriptionAndSave = By.xpath(".//*[@class='typography__H1-vraxd4-0 Header__Heading-sc-1rhhdnz-4 iEFYMG animated fadeInUp']");
		
		//Get Started 
		public static By btnGetStarted = By.xpath("(.//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Get started'])[1]");
		
		//Subscribing Is Easy
		public static By weSubscribingIsEasy = By.xpath(".//*[@class='typography__H3-vraxd4-2 Steps__Heading-sc-1q16bmh-2 mIdjs animated fadeInUp' and text()='Subscribing is super easy']");
		
		//Steps For Subscribing Is Easy
		public static By weStepsForSubscribingIsEasy = By.xpath(".//*[@class='Steps__Step-sc-1q16bmh-3 kShtco animated fadeInUp']");
		
		//Text Under Steps
		public static By txtUnderStepsSubscribingIsEasy = By.xpath(".//*[@class='Steps__Step-sc-1q16bmh-3 kShtco animated fadeInUp']/h4");
		
		//Choose Your Plan
		public static By weChooseYourPlan = By.xpath(".//*[@class='typography__H3-vraxd4-2 Plans__Heading-sc-1fm03jq-2 vzFBG animated fadeInUp' and text()='Choose your plan']");
		
		//Choose Your Plans 
		public static By weChooseYourPlansSteps = By.xpath(".//*[@class='Plans__Plan-sc-1fm03jq-3 gASpBy animated fadeInUp']");
		
		//Get Started Below Choose Your Plan
		public static By btnGetStartedBelowChooseYourPlan = By.xpath("(.//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Get started'])[2]");
		
		//Plan that suits you
		public static By weAPlanThatSuitsYou = By.xpath(".//*[@class='typography__H3-vraxd4-2 Features__Heading-sc-1dfrs6n-2 DLXFi' and text()='A plan that suits you']");
		
		//Plan that suits you Steps
		public static By weAPlanThatSuitsYouSteps = By.xpath(".//*[@class='Features__Feature-sc-1dfrs6n-3 cvCkxA animated fadeInUp']");
		
		//Vuse+ Members Get Extra Benefits
		public static By weVusePlusMembersGetExtraBenefits = By.xpath(".//*[@class='typography__H3-vraxd4-2 FreeDevice__Heading-sc-18tmbrl-3 fkepas animated fadeInUp']");
		
		//Vuse + Members Text
		public static By weTxtVusePlusMembersText = By.xpath(".//*[@class='typography__H4-vraxd4-3 FreeDevice__Subheading-sc-18tmbrl-4 gPApkt animated fadeInUp']");
		
		//Fastest Route To Vuse+
		public static By weFastestRouteToVusePlus = By.xpath(".//*[@class='typography__H3-vraxd4-2 FastestRoute__Heading-sc-11d8aq6-3 knQJfD animated fadeInUp']");
		
		//Questions? See Answers below
		public static By weQuestionsSeeAnswersBelow = By.xpath(".//*[@class='typography__H2-vraxd4-1 Faq__Heading-sc-1vfstnh-1 bxqEVl']");
		
		//EPod Selection In Subscription Box
		public static By btnEPodSelectionUnderSubcription = By.xpath(".//button[@class='Filters__FilterContainer-gxdyu-3 eZGOES']");
		
		//Passion Fruit Flavour In Subscription Under EPod
		public static By btnPassionFruitFlavourSubcriptionInEpod = By.xpath(".//img[@class='CartridgeThumbnail__Swatch-m1q1va-4 lfoeuN' and @alt='Passionfruit']");
		
		//3% Nicotine Strength 
		public static By btnThreeNicotineStrengthPassionFruit = By.xpath("(.//button[@class='CartridgeThumbnail__Option-m1q1va-18 fpppRO' and text()='3%'])");
		
		//3% Nicotine Strength Is Selected
		public static By btnThreeNicotineStrengthSelectedPassionFruit = By.xpath(".//button[@class='CartridgeThumbnail__Option-m1q1va-18 hElRbH']");
		
		//Plus Button Is Clicked
		public static By btnPlusPassionFruit = By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");
		
		//Quantity Picker Is Available
		public static By weQuantityPickerPassionFruit = By.xpath("(.//*[@class='QuantityPicker__Value-sc-19b5kqw-2 ktiaUE'])[1]");
		
		//Add Button Passion Fruit Flavor
		public static By btnAddPassionFruitFlavorSubscription = By.xpath("(.//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Add'])[1]");
		
		//Plus Button In Cart Page
		public static By btnPlusInCartPage = By.xpath("(.//button[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");
		
		//Quantity Picker In Cart page
		public static By weQuantityInCartPage = By.xpath(".//*[@class='QuantityPicker__Value-sc-19b5kqw-2 ktiaUE']");
		
		//Add 2 more packs to your subscription to checkout
		public static By weAddPacksToYourSubscription = By.xpath(".//*[text()='Add 2 more packs to your subscription to checkout']");
		
		//Continue Shopping
		public static By lnkContinueshopping = By.xpath(".//a[@href='/' and text()='Continue shopping']");
		
		//Subscribe & Save Button In Flavour Page
		public static By btnSubscribeAndSaveFlavourEpodPodsPage = By.xpath(".//*[@class='OrderType__Label-sc-104vt6j-1 jANEwk' and text()='Subscribe & save']");
		
		//One Time Purchase Button In Flavor Page
		public static By btnOneTimePurchaseFlavorEPodPodsPage = By.xpath(".//*[@class='OrderType__Label-sc-104vt6j-1 jANEwk' and text()='One time purchase']");
		
		//Subscribe and Save button to add to cart
		public static By btnSubscribeAndSaveToAddToCart = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Subscribe & Save']");
		
		// Subscription requires a minimum of 3 packs to checkout
		public static By weSubscriptionRequiresAMinimumOfThreePacksToCheckOut=By.xpath(".//*[@class='CartridgePage__Disclaimer-rohhib-9 hEmXeK' and text()='Subscription requires a minimum of 3 packs to checkout']");
		
		//CArt Page Product Qty Price Headings
		public static By weProductQtyPriceHeadingsInCartPage = By.xpath("(.//*[@class='Main__TableHeader-jzkev4-5 jSePYd'])[1]");
		
		//Free Device For Subscription
		public static By weFreeDeviceForSubscriptionCartPage = By.xpath(".//*[@class='Product__ProductName-sc-92om0c-8 kGCZkQ' and text()='ePod Device']");
		
		//Select your subscription day
		public static By weSelectYourSubscriptionDayCartPage = By.xpath(".//*[@class='SubscriptionDate__Label-f2tkxy-1 ffLmjj' and text()='Select your subscription start day:']");
		
		//Learn More
		public static By lnkLearnMore = By.xpath(".//a[@href='/subscribe' and text()='Learn more']");
		
		//Flavor Choose Nicotine Strength And Quantity
		public static By weTxtChooseNicotineStrengthAndQuantity = By.xpath(".//*[text()='Choose quantity and nicotine strength']");
		
		//Passion Fruit One Time EPod Pods Page
		public static By btnOneTimePassionFieldFlavorEPodPodsPage = By.xpath("(.//*[@class='CartridgeThumbnail__Option-m1q1va-18 fpppRO' and text()='One-time'])[1]");
		
		//Passion Fruit Subscribe And Save
		public static By btnSubscribePassionFlavorEPodEpodsPage = By.xpath("(.//*[@class='CartridgeThumbnail__Option-m1q1va-18 fpppRO' and text()='Subscribe'])[1]"); 
		
		//Passion Fruit Subscribe And Save Selected
		public static By weSubscribeSelectedPassionFlavorEPodPodsPage = By.xpath(".//button[@class='CartridgeThumbnail__Option-m1q1va-18 hElRbH']");
		
		
		//CArt Page
		//Discount Form under Discount Text Box
		public static By txtDiscountFormUnderDiscountTextBox = By.xpath(".//*[@class='DiscountForm__Disclaimer-sc-8njqg3-2 bGSUOR']");
		
		//Subscription 20% in Discount
		public static By txtSubscription20PercentInCartSummary = By.xpath(".//*[@class='PriceBreakdownDiscounts__Code-sc-17eyuez-1 iaRtee' and text()='Subscription 20%']");
		
		//Subscription 25% in Discount
		public static By txtSubscription25PercentInCartSummary = By.xpath(".//*[@class='PriceBreakdownDiscounts__Code-sc-17eyuez-1 iaRtee' and text()='Subscription 25%']");
		
		//Platinum 5%
		public static By txtPlatinum5PercentDiscountInCartSummary = By.xpath(".//*[@class='PriceBreakdownDiscounts__Code-sc-17eyuez-1 iaRtee' and text()='Platinum 5%']");
		
		
		//Billing Page
		//I have read and Agreed Conditions of Sale and subscription to T&C
		public static By weChkBoxIhaveReadTAndC = By.xpath(".//*[@class='Checkbox__Indicator-sc-1aku8c-4 hLkMai']");
		
		
		//Order Confirmation Page
		//Date of Order
		public static By weDateInConfirmationPage = By.xpath(".//*[@class='SubscriptionDetails__Label-sc-1mdyq21-2 iVHEBZ' and text()='Date']/..//following-sibling::span");
		
		//Product Quantity
		public static By weProductQuantityInConfirmationPage = By.xpath(".//*[@class='Product__Quantity-sc-4j9tv5-3 ejAjHf']");
		
		//Product
		public static By weProductInConfirmationPage = By.xpath(".//*[@class='Product__Title-sc-4j9tv5-4 cEyHVD']");
		
		
		
		
		
		
		
		
		
		//Subscriptions Tab In My Account
		//Subscription Tab
		public static By tabSubscriptionsInMyAccount = By.xpath(".//a[@href='/account/subscriptions']");
		
		//Subscription Heading
		public static By weTxtSubscriptionHeadingInSubscriptionTab = By.xpath(".//*[@class='subscriptions__Heading-vf05dk-1 kmPBGP']");
		
		//Edit Button
		public static By btnEditInSubscriptionPage = By.xpath(".//button[@class='SubscriptionDetails__Edit-sc-1mdyq21-7 kDvJFT']");
			
		//Date Field
		public static By edtDateFieldInSubscriptionPage = By.xpath(".//*[@class='DateInput DateInput_1 DateInput__block DateInput__block_2']");
		
		//Calender
		public static By weCalender = By.xpath(".//*[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']");
		
		//Address Field
		public static By edtAddressField = By.xpath(".//input[@class='Input__Field-sc-1d4fqnm-3 dFfLci' and @placeholder='Start typing...']");
		
		//Address List
		public static By weAddressComplete = By.xpath(".//*[@class='aclogo pcalogoen' and @title='www.canadapost.ca']");
		
		//Pause Button
		public static By btnPauseSubscription = By.xpath(".//*[@class='SubscriptionEditForm__Alert-io8o4s-1 kThREX']/button[text()='Pause']");
		
		//Cancel Button
		public static By btnCancelSubscription = By.xpath(".//*[@class='SubscriptionEditForm__Alert-io8o4s-1 kThREX']/button[text()='Cancel']");
		
		//Pause Subscription Pop Up modal
		public static By popUpPauseSubscription = By.xpath(".//*[@class='typography__H4-vraxd4-3 lnJAdL' and text()='Pause subscription']");
		
		//Pause Subscription Text
		public static By wePauseSubscriptionText = By.xpath(".//*[@class='PauseSubscriptionModal__Inner-sc-1u2qwkn-0 XghnS']//p[text()='Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.']");
		
		//Yes,Pause Subscription Button
		public static By btnYesPauseSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Yes, pause subscription']");
		
		//No,return button
		public static By btnNoReturnSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='No, return']");
		
		//DisCard Changes button In Pause Subscription
		public static By btnDiscardInPauseSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Discard changes']");
		
		//Unpause and Save Changes
		public static By btnUnpauseAndSaveChangesInPauseSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Unpause & save changes']");
		
		//Stop Subscription Pop Up modal
		public static By popUpStopSubscription = By.xpath(".//*[@class='typography__H4-vraxd4-3 lnJAdL' and text()='Cancel subscription']");
		
		//Stop Subscription Text
		public static By weStopSubscriptionText = By.xpath(".//*[@class='CancelSubscriptionModal__Inner-upsgl1-0 hewKDr']/p[text()='Are you sure you want to cancel your recurring subscription? This action cannot be undone.']");
		
		//Yes,Cancel In Cancel Subscription
		public static By btnYesCancelInCancelSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='Yes, cancel']");
		
		//No Return In Cancel Subscription
		public static By btnNoCancelInCancelSubscription = By.xpath(".//*[@class='Button__Label-sc-186nrqc-2 jpETUM' and text()='No, return']");
		
		//No Subscriptions In Subscription Page
		public static By weTxtNoSubscriptionsInSubscriptionPage = By.xpath(".//*[text()='You have no subscription plan yet']");
		
		//flavour names for epenpods
		public static By weClassicTobacco = By.xpath("(//*[text()='Classic Tobacco'])[1]");
		public static By weMango = By.xpath("(//*[text()='Mango'])[1]");
		public static By weCrispMint = By.xpath("(//*[text()='Crisp Mint'])[1]");
		public static By weCherry = By.xpath("(//*[text()='Cherry'])[1]");
		public static By weVanilla = By.xpath("(//*[text()='Vanilla'])[1]");
		public static By wePeach = By.xpath("(//*[text()='Peach'])[1]");
		public static By weApple = By.xpath("(//*[text()='Apple'])[1]");
		public static By weStrawberry = By.xpath("(//*[text()='Strawberry'])[1]");

		//nicotine value
		public static By weNicotineLevel1 =  By.xpath("(//*[text()='0mg/ml'])[2]");
		public static By weNicotineLevel2 = By.xpath("(//*[text()='12mg/ml'])[2]");
		public static By weNicotineLevel3 = By.xpath("(//*[text()='30mg/ml'])[2]");

		//Add button
		public static By btnAdd1 = By.xpath("(//*[text()='Add'])[1]");

		//All Flavors Add Button and Quantity Picker
		public static By weQuantityAddIcon= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[15]");
		public static By weQuantitySubIcon= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[14]");
		
		//Click on + icon
		public static By weQuantityAdd12mg= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[9]");
		
		//Add To cart
		public static By btnAddToCart= By.xpath("//*[text()='Add to cart']");
		
		public static By weClassic= By.xpath("(//*[text()='Classic Tobacco'])[2]");
		public static By weCrossIcon= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[4]");
		public static By we30mgml= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[17]");
		public static By btnAdd= By.xpath("(//*[text()='Add'])[2]");
		public static By we0mgml= By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dxAGYZ'])[20]");
		public static By btnAdd0mgml= By.xpath("(//*[text()='Add'])[3]");
		

	/* Added by Bhavitha for BDD development */
		
	
		public static By weGoldCard = By.xpath("//*[contains(text(),'Hi ')]/../following-sibling::div");


		
		//Added by Manaswini for BDD in November
		public static By ValPrice = By.xpath(" (//*[text()='35.98'])[1]");
		
		public static By weErrorMsgEmailFeild = By.xpath(".//*[text()='Email address is required']");
	
	
	
	//=======================================================================================================================================================================================================================================================
}
