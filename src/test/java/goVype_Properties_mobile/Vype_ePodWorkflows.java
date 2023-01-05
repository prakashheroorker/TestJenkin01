package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_ePodWorkflows {

	//Vuse ePod page
	public static By wetxtVuseePod = By.xpath("//*[text()='VUSE ePod']");

	//Vype ePod page
	public static By wetxtVypeePod = By.xpath("(//h3[text()='ePod'])");//*[text()='Vype ePod'])[2]

	//Choose the colour
	public static By btnColour(String clr) {

		return By.xpath("(//div[@data-tip='"+clr+"'])[2]");
		//(//div[@data-tip='"+clr+"'])[2]
	}
	
	
	//
	//To retrive flavor text
		public static By weFlavorCart(String fla) {
			return By.xpath("(//*[text()='"+fla+"'])[3]");
		}
	
	//
	//verify device colour
	public static By weDeviceColour(String color){
		return By.xpath("//*[contains(@src,'images/products/epod/background/"+color+".jpg')]");
		
		//*[contains(@src,'/ca/en/images/products/epod/background/black.jpg')]
	}

	//The Pouch
		public static By BtnPouchAdd=By.xpath("(//*[text()='The Pouch'])[1]/../following-sibling::div//button[2]");
		
		
		//epod Skins
		public static By epodSkins=By.xpath("//*[@class='Addon__ActionsWrapper-sc-1v6idwa-9 fKHQrV']");

		//Limited Edition
		public static By wetxtLimitedEdition=By.xpath("(.//*[text()='Limited Edition ePod'])");
		
		
		//Text Starter bundle
        public static By wetxtStarterbundle = By.xpath("//*[text()='Starter Bundle']");
		
	//I am Fine button
	public static By btnIAmFine = By.xpath("//*[text()='Yes please']/following-sibling::button");

	//Flavours xpath
	public static By btnFlavour = By.xpath("(//*[text()='Yes please']/following-sibling::button/following-sibling::div//div)[1]");
			// "(//*[text()='Yes please']/following-sibling::button/following-sibling::div//div)[1]");

	//ePod Skin add button
	public static By btnAdd = By.xpath("//h4[contains(text(),'ePod skins')]/../following-sibling::div//button[contains(text(),'Add')]");

	//Add button
	public static By btnSkinColorAdd = By.xpath("//*[text()='Choose your skin']/../following-sibling::footer//button");

	//USB charging cable +button
	public static By btnPlusUSBCable = By.xpath("(//*[text()='Charging Cable'])[1]/../following-sibling::div//button[2]");

	public static By btnPlusMagneticCharger = By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[13]");
	
	//Total Amount
	public static By txtAmount = By.xpath("//*[contains(text(),'Add items & go to cart')]/../preceding-sibling::h3");

	//pop up choose your skin 
	public static By wetxtChooseSkin = By.xpath("//*[text()='Choose your skin']");

	//Text Engravable ePod
	public static By wetxtEngravableePod = By.xpath("//*[text()='Engravable ePod']");

	//Engraved device add button
	public static By btnEngravedAdd = By.xpath("//h4[text()='Engraved device']/../following-sibling::div//*[contains(text(),'Add')]");

	//Customize the front
	public static By txtCustomizeFront = By.xpath("//*[contains(text(),'Customize the Front')]");

	//Pattern button
	public static By btnPattern = By.xpath("//*[contains(text(),'Pattern')]");

	//Solstice
	public static By btnSolstice(String pattern){

		return By.xpath("//*[contains(text(),'"+pattern+"')]");
	}

	//Hoya pattern
	public static By btnHoya (String patternName) {

		return By.xpath("//*[contains(text(),'"+patternName+"')]");
	}

	//Add pattern button
	public static By btnAddPattern = By.xpath("//*[text()='Add Pattern']");

	//Now customize the back page
	public static By txtCustomizeBack = By.xpath("//*[contains(text(),'Now customize the Back')]");

	//Text Button
	public static By btnText = By.xpath("//*[text()='Text']");

	//Select Vertical
	public static By btnVertical(String TextDirection){

		return By.xpath("//*[contains(text(),'"+TextDirection+"')]");
	}

	//Select Font style
	public static By btnFontStyle (String FontStyle){

		return By.xpath("//span[contains(text(),'"+FontStyle+"')]");
	}

	//Enter your text
	public static By txtEnterText = By.xpath("//*[@placeholder='Abc']");

	//Add text button
	public static By btnAddText = By.xpath("//*[text()='Add Text']");

	//Make it Yours age
	public static By txtMakeItYours = By.xpath("//*[contains(text(),'Make it yours')]");

	//Tell us your first name field
	public static By txtFirstName = By.name("text");

	//Add your name button
	public static By btnAddName = By.xpath("//*[text()='Add your name']");

	//Engraving summary page
	public static By txtEngravingSummary = By.xpath("//*[text()='Engraving Summary']");

	//Items Details
	public static By btnAddEngraving = By.xpath("//*[text()='Add engraving']");

	//Solstice skin colour
	public static By btnSolsticeColor(String flavour,String flavourName) {
		return By.xpath("//*[contains(text(),'"+flavour+"')]/following-sibling::div//div//div[@data-tip='"+flavourName+"']");
	}

	//Skin colour price
	public static By txtSkinColorPrice = By.xpath("//*[text()='Choose your skin']/../following-sibling::footer//div//h3[contains(text(),'$')]");

	//Passionfruit field add button
	public static By btnPassionFruitAdd(String flavour){
		return By.xpath("//h4[text()='"+flavour+"']/../following-sibling::div//button");
	}

	//Lychee Orchard footer
	public static By wetxtlycheeOrchard = By.xpath("(.//*[text()='Nicotine strength'])[1]/../../following-sibling::footer");










	//choose you skin pop up
	public static By wetxtPopUp = By.xpath("//*[@class='CustomSkinModal__Inner-sc-7b2hv1-2 jrrKEG']");



	//Abstraction skin colour
	public static By btnSkinColour = By.xpath("//*[@data-tip='Umbra']");


	///Your Cart page products
	public static By wetxtPage = By.xpath("//*[@class='Main__CartSection-jzkev4-9 bXUvao']");

	//Flavour color
	public static By weTxtFlavour = By.xpath("(//*[text()='Red'])[2]");

	//Skin text "Classic"
	public static By weTxtSkin = By.xpath("(//*[text()='Classic'])[2]");

	//Verify left panel shows the design of device
	public static By weDesignOfDevice=By.xpath("(.//*[@class='BuyChrome__Background-sc-1r5ifw0-16 igbhgb'])");
			// "(.//*[@class='BuyChrome__Background-sc-1r5ifw0-17 gUQJkr'])");
			// "(.//*[@class='BuyChrome__Background-sc-1okt7kc-17 iRDBLn'])");

	//Passion Fruit
	public static By weepodDeviceCustomizablePage=By.xpath("//*[@class='BuyChrome__Main-sc-1r5ifw0-5 bilDhI']");
			// "//*[@class='BuyChrome__Main-sc-1okt7kc-5 ptbBS']");//(.//*[@class='BuyChrome__Content-sc-1okt7kc-6 eORxlo'])

	//Yes lPlease buttom
	public static By btnYesPlease = By.xpath("//*[text()='Yes please']");

	//Lychee Orchard add button
	public static By btnLycheeAdd = By.xpath("(//*[@class='Cartridge__Action-sc-1rejg92-7 ktZhBD'])[1]");


	//Lychee orchard pop up displayed
	public static By wetxtLycheePopUp = By.xpath("//*[@class='CartridgeModal__Inner-kepi1t-2 hJCZll']");

	//Skins added
	public static By wetxtSkinName = By.xpath("//*[@class='Addon__ProductName-sc-4qaprn-14 INFFI']");



	//Items Details
	public static By txtItems = By.xpath("//*[@class='SummaryItem__Main-sc-1cy5yzj-2 bEKfeO']");





	//Engravable ePod
	public static By txtVerifyAddedProduct = By.xpath("//*[@class='Product___StyledDiv-sc-92om0c-13 jcBfTS']");

	//Scapes skin colour
	public static By btnScapesColor = By.xpath("(//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 ckHym'])[2]");

	//Fabrichromatic skin colour
	public static By btnFabrichromaticColour = By.xpath("(//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 emkcng'])[2]");//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 dotxwq'])[2]

	//Left side with an interactive product image for ePods Skins
	public static By weLeftSideImage = By.xpath("//*[@alt='Halftone']");

	//Right side panel, "Choose your skin", with skin icons
	public static By weRightSideIcons = By.xpath("(//h4[text()='Choose your skin']/../..//div)[2]");

	//All Skin Colour 
	public static By weSkinsColour = By.xpath("//*[@class='CustomSkinModal__DesktopSwatchListInner-sc-7b2hv1-13 fsOsVt']/div/div[@data-tip]");

	//Abstraction skin device image
	public static By weAbstractionSkin = By.xpath("(//*[@alt='Umbra'])[1]");

	//1 quantity is available by default 
	public static By txtQuantity = By.xpath("//*[text()='Choose your skin']/../..//footer/preceding-sibling::div[1]//div[2]//span");

	//Choose your skin + button
	public static By btnPlus = By.xpath("//*[text()='Choose your skin']/../..//footer/preceding-sibling::div[1]//div[2]//button[2]");

	//Choose your skin "-" button
	public static By btnMinus = By.xpath("//*[text()='Choose your skin']/../..//footer/preceding-sibling::div[1]//div[2]//button[1]");	

	//Add to Cart button
	public static By btnAddtoCart = By.xpath("//*[text()='Add to cart']");
	
	//Add button in epod accessories page for charging cable
	public static By btnAccessoriesAdd = By.xpath("//*[contains(text(),'Charging Cable')]/../../..//footer//button//span");

	//Subtotal value
	public static By txtSubtotal = By.xpath("(//*[@class='Total__Line-sc-1flxtnt-4 fnEapu'])[1]/strong");

	//Header of the page
	public static By txtHeader = By.xpath("//*[contains(@class,'Nav__Container')]");

	//Top Footer frame with social links
	public static By weFooterTop = By.xpath("//*[contains(@class,'Footer__Main')]");

	//Bootom footer frame
	public static By weBottomFooter = By.xpath("//*[contains(@class,'Footer__Main')]/following-sibling::section");

	//ePod Charger page
	public static By txtePodAccessories = By.xpath("//*[text()='ePod Accessories']");

	//Vuse Logo 
	public static By txtVuseLogo = By.xpath("(//*[@class='Nav__LogoWrap-sc-1kiounr-3 jqeHpn'])[1]");

	//Profile icon
	public static By weProfileIcon = By.xpath("(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]");

	//USB Charging Cable image
	public static By weUSBCable = By.xpath("//*[contains(@alt,'Charging Cable')]"); 

	//Verify the description for the product as "Magnetic USB Charging Cable"
	public static By txtChargingCable = By.xpath("//*[contains(text(),'Charging Cable')]");

	//Price 
	public static By txtPrice = By.xpath("//*[contains(text(),'Charging Cable')]/following-sibling::span");

	//Footer Condition of sale, privacy policy, cookie policy links
	public static By txtLinks = By.xpath("//*[contains(@class,'Footer__Main')]/following-sibling::section//div//div//div");

	//Quantity added in cart
	public static By txtQuantityAdded = By.xpath("(//*[@class='TinyCart__Quantity-fpderd-3 PDZHI'])[1]");

	//Floating message added to cart
	public static By txtFloatingMessage = By.xpath("(//*[@class='Toast__Inner-zzyniu-1 cIYbeg'])[1]");

	//Starter kit page header
	public static By txtStarterKitHeader = By.xpath("//*[@class='Nav__Container-sc-1kiounr-0 kWOAxc']");
	
	//==================================ePodPods Page===================
	   //Verify the "Mix & Match: 3 Pack Bundle" card with Image for $30.00 and text as "Select 3 packs of your choice and save 17%" with Create button is displayed
		public static By txtMixAndMatch3PackBundle=By.xpath("(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-5 cNLKyg'])[2]");
				// "(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-6 hSDOxN'])[1]");

	   //Image of mix and match 3 Pack Bundle
		public static By ImageMixAndMatch3PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-3/'])[1]");
		
	   //Verify the"Mix & Match:5 pack Bundle" card with the image for $45.00  and text as "Select 5 packs of your choice and save 25%" with the "Create" button is displayed
		public static By txtMixAndMatch5PackBundle=By.xpath("(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-5 cNLKyg'])[1]");
		
		//Image of mix and match 3 Pack Bundle
		public static By ImageMixAndMatch5PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-5/'])[1]");
		
		//Click on the "Create" button for "Mix & Match : 3Pack Bundle"
		public static By lnkCreateMixAndMatch3PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-3/'])[1]");
				// "(.//*[@href='/ca/en/buy-online/multipack-3/'])[2]");
		
		//Click on the "Create" button for "Mix & Match : 5Pack Bundle"
		public static By lnkCreateMixAndMatch5PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-5/'])[3]");
		
		//============Mix and match 3 pack bundle Page===================
		
		//Mix and match 3 pack bundle Page
		public static By txtMixAndMatch3PackBundlePage= By.xpath("(.//*[text()='Mix & Match: 3 Pack Bundle'])");
		
		public static By txtMixAndMatch5PackBundlePage= By.xpath("(.//*[text()='Mix & Match: 5 Pack Bundle'])");
		//*Verify the page is divided vertically in two halfs
		public static By ImageDividedMixMatch=By.xpath("(.//*[@class='BuyChrome__SidebarWrap-sc-1r5ifw0-2 gpIzmQ'])");
				// "(.//*[@id='buy-chrome-sidebar'])");
				// "(.//*[@class='BuyChrome__SidebarWrap-sc-1r5ifw0-2 ckuDkK'])");

		public static By ImageDivided5packMixMatch=By.xpath("(.//*[@src='/ca/en/images/products/epod/multipack/5-pack-large.jpg'])");
		
		//right side of the page contains the Heading "Mix & Match :3 pack bundle" with the text Select 3 packs of your choice and save 17%" and Pack (2 pods).
		public static By txtHeaderMixAndMatch3PackBundle=By.xpath("(.//*[@class='BuyOverview__Container-sc-1lne9ui-0 fcdSXs'])");
				// "(.//*[@class='BuyOverview__Container-sc-1lne9ui-0 gyxEdu'])");
		
		//Pack (2 pods) text
		public static By txtPack2Pods=By.xpath("(.//*[text()='Pack (2 pods)'])");
		
		//Choose 3 packs to add to your bundle
		public static By txtChoose3Packs=By.xpath("(.//*[text()='Choose 3 packs to add to your bundle'])");
		
		public static By txtChoose5Packs=By.xpath("(.//*[text()='Choose 5 packs to add to your bundle'])");
		
		//Verify the "17" flavours are displayed.
	   public static By ImageFlvours=By.xpath("(.//*[@class='BuyCartridges__Inner-sc-1rtbffr-1 cwSuyc'])");
	   		// "(.//*[@class='BuyCartridges__Inner-sc-1rtbffr-1 lhdImK'])");
		
	  //flavour name with + select button should be displayed.
	   public static By txtPassionFruit=By.xpath("(.//*[@class='typography__H4-sc-10lefml-3 Cartridge__Name-sc-38s8x4-6 fdiSLf hRIVwI'])[2]");
	   
	  //Plus button to increase the product items on Cart page.
	   public static By btnPlusOrAddProductinCartPage=By.xpath("(.//*[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[2]");
	   		// "(.//*[@class='QuantityPicker__Button-v6i9u9-1 kIZJbH'])[2]");
	   
	  //flavour name with + select button should be displayed.
	   public static By txtBloodOrange=By.xpath("(.//*[@class='typography__H4-sc-10lefml-3 Cartridge__Name-sc-38s8x4-6 fdiSLf hRIVwI'])[1]");
	   		// "(.//*[@class='Cartridge__Overlay-sc-38s8x4-10 iPVGHI'])[3]");
	   
	   
	 //flavour name with + select button should be displayed.
	   public static By txtCucumber=By.xpath("(.//*[@class='typography__H4-sc-10lefml-3 Cartridge__Name-sc-38s8x4-6 fdiSLf hRIVwI'])[3]");
	   		// "(.//*[@class='Cartridge__Overlay-sc-38s8x4-10 iPVGHI'])[4]");
	   
	   
	   //flavour name with + select button should be displayed.
	     public static By txtPolarMintFlavour=By.xpath("(//*[@class='Cartridge__Overlay-sc-38s8x4-10 dYLrSa'])[4]");
	     		// "(.//*[@class='Cartridge__Overlay-sc-38s8x4-10 iPVGHI'])[5]");
	   
	   //flavour name with + select button should be displayed.
	   public static By txtLycheeFlavour=By.xpath("(.//*[@class='Cartridge__Overlay-sc-38s8x4-10 dYLrSa'])[1]");
	   		// "(.//*[@class='Cartridge__Overlay-sc-38s8x4-10 iPVGHI'])[1]");
	   
	   //bottom of the page contains text you are saving 17% $30.and 25% $45 as well.
	   public static By txtSaving17Percent=By.xpath("(.//*[@class='MultipackSummary__Label-z9fywz-3 bOrygt'])");
	   		// "(.//*[@class='MultipackSummary__Label-z9fywz-3 jkxXiT'])");
	   
	   //"Add three packs" button should be displayed when the user did not select any of the packs and is in disabled state untill the user adds 3 packs
	   public static By txtAddThreePacks=By.xpath("(.//*[@class='Button__Container-sc-1gw2hd1-0 grExlx BuySummary__StyledButton-ioorab-3 MultipackSummary__AddButton-z9fywz-4 dxRWld ilpbIf'])");
	   		// "(.//*[@class='Button__Container-sc-1gw2hd1-0 fZrcYn BuySummary__StyledButton-ioorab-3 MultipackSummary__AddButton-z9fywz-4 lltdbh'])");
	   
	   //flavour modal - PassionFruit
	   public static By txtPassionFruitModal=By.xpath("(.//*[@class='CartridgeModal__Description-rj7zrv-15 ciRXHo'])");
	   		// "(.//*[@class='CartridgeModal__Inner-rj7zrv-2 lltlHM'])");
	   
	 //flavour modal - Blood Orange
	   public static By txtBloodOrangeModal=By.xpath("(.//*[@class='CartridgeModal__Inner-rj7zrv-2 lltlHM'])");
	   
	   //flavour modal - Blood Orange.
	   //public static By txtBloodOrangeModal=By.xpath("(.//*[text()='Passionfruit'])[3]");
	   
	   public static By txt5packPassionFruitModal=By.xpath("(.//*[text()='Passionfruit'])[4]");
	   
	   //passion fruit modal contains name of falvour description
	   public static By txtPassionFruitDescription=By.xpath("(.//*[@class='CartridgeModal__Description-rj7zrv-15 ciRXHo'])");
	   
	   //plus button
	   public static By btnNicotinePlus=By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[19]");
	   		// "(.//*[@icon='plus-small'])[1]");
	   public static By btnnicotinePlus=By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[20]");
	   public static By btnNicotineplus=By.xpath("(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[21]");
	   //Total value is updated and the select button is enabled
	   public static By txtTotalValue=By.xpath("(.//*[@class='CartridgeModal__Footer-rj7zrv-9 hxhLGC'])");
	   		// "(.//*[@class='CartridgeModal__Footer-rj7zrv-9 cwQHKA'])");
	   
	   //Add button.
	   public static By btnPassionFruitAdd=By.xpath("(.//*[text()='Add'])");
	   
	   //Selected flavour is shown at the bottom left side of the page.
	   public static By imageSelected=By.xpath("(.//*[@data-tip='Passionfruit'])");
	   
	   // At the right side bottom of the page "Add two More packs" button is in disabled state.
	   public static By btnAddTwoMorePacks=By.xpath("(.//*[text()='Add two more pack'])");
	   
	// At the right side bottom of the page "Add one more pack" button is in disabled state.
	   public static By btnAddOneMorePack=By.xpath("(.//*[text()='Add one more pack'])");
	   
	   public static By btnAddFourMorePacks=By.xpath("(.//*[text()='Add four more packs'])");
	   public static By btnAddthreeMorePacks=By.xpath("(.//*[text()='Add three more packs'])");
	   public static By btnAddtwoMorePacks=By.xpath("(.//*[text()='Add two more packs'])");
	   //public static By btnAddOneMorePacks=By.xpath("(.//*[text()='Add one more packs'])");
	   
	   //Add to cart
	   public static By BtnAddToCartMixMatch=By.xpath("(.//*[text()='Add to cart'])");
	   
	 //Vuse limited Edition
		public static By txtVuseLimitedEdition=By.xpath("(.//*[@class='Skin__FigureWrap-sc-1fsub9-1 itYNis'])[29]");
		
		//Buy now
		public static By btnBuyNow=By.xpath("(.//*[@href='/ca/en/buy-online/vype-epod-skins/halftone/'])[5]");
	   
		//Text Halftone.
		public static By wetxtHalftone= By.xpath("(.//*[text()='Halftone'])");
		
		//Choose your quantities
		public static By wetxtChooseYourQuantities=By.xpath("(.//*[text()='Choose your quantities'])");

		//Plus button.
		public static By btnHalftonePlus=By.xpath(".//*[@icon='plus-small']");
		
		//Buy Now button
		public static By BtnBuyNow=By.xpath("(.//*[text()='Buy now'])");
		
		//text "Do you want to add cartridges to your order.
		public static By txtDoYouAddCartridges=By.xpath(".//*[contains(text(),'Do you want to add cartridges to your order?')]");
		
		
		//pouch price
        public static By txtPouchprice=By.xpath("//*[contains(text(),'The Pouch')]/following-sibling::span");
        //caps price
        public static By txtcapsprice=By.xpath("//*[contains(text(),'Pod Caps')]/following-sibling::span");
         //Charging Case
        public static By txtchrgingcase=By.xpath("//*[contains(@alt,'Charging Case')]");
        //charging case price
        public static By txtchargingcaseprice=By.xpath("//*[contains(text(),'Charging Case')]/following-sibling::span");
        
        //Verify pouch
        public static By txtPouch=By.xpath("//*[contains(@alt,'The Pouch')]");
        //Verify Pod caps
        public static By txtpodcaps=By.xpath("//*[contains(@alt,'Pod Caps')]");








}