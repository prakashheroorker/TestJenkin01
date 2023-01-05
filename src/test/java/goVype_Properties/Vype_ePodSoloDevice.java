package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ePodSoloDevice {

	//Text 'Features'
	public static By weTxtFeatures=By.xpath("(.//*[text()='Features'])[1]");

	//Features description
	public static By weTxtFeatureDescription=By.xpath("((.//*[text()='Features'])[1]/..//div)[1]");
	
	public static By wePlusbtnMagneticUSBCable=By.xpath("(//*[contains(text(),'Charging Cable')])[1]/../following-sibling::div//button[2]");

	//Text 'Vype ePod'
	public static By weTxtVypeEpod=By.xpath("(.//*[text()='ePod'])[3]");

	//Button 'Yes Please' 
	public static By btnYesPlease=By.xpath("(.//*[text()='Yes please'])[1]");

	//10 Different Flavor Cartridge Option
	public static By we10DifferentFlavorCartridgeOptions=By.xpath("((.//*[text()='Yes please'])[1]/..//div//div)[1]");

	//Passion fruit Fields Cartridge
	public static By btnAddPassionFruitFieldsCartridge=By.xpath("(.//*[@class='Cartridge__Overlay-sc-1rejg92-9 hBTdxO'])[2]");

	//Text "Nicotine Strength" from the Add to Cart modal
	public static By weTxtNicotineStrength=By.xpath("(.//*[text()='Nicotine strength'])[1]");

	//Text "Quantity" from the Add to Cart modal
	public static By weTxtQuantity=By.xpath("(.//*[text()='Quantity'])[1]");

	//Quantity Increment button under Nicotine Strength 1.6% on Add to Cart Modal
	public static By btnIncrementNicotineStrengthPercentage=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");

	//Text "Total" is displayed on Add to Cart Modal
	public static By weTxtTotal=By.xpath("(.//*[text()='Total'])[1]");

	//Get Total value text
	public static By wetxtTotalValue = By.xpath("(.//*[text()='Nicotine strength'])[1]/../../following-sibling::footer//div//span[contains(text(),'$')]");

	//Button 'Add' on the modal
	public static By btnAdd=By.xpath("(.//*[text()='Add'])[1]");// another xpath: (.//*[text()='Nicotine strength'])[1]/../../following-sibling::footer//button

	//Text "$N"  value displayed on the ePod devices page
	public static By weTxtTotalValueN(String num){

		return By.xpath("(.//*[text()='$"+num+"'])[1]");

	}


	//Button Add items and Go to Cart
	public static By btnAddItemsAndGoToCart=By.xpath("(.//*[text()='Add items & go to cart'])[1]");// not used in common file

	//Text 'We thought you might be interested in this too' is displayed.
	public static By weTxtWeThoughtYouMight=By.xpath("(.//*[text()='We thought you might be interested in this too'])[1]");

	//Section 'ePod skins' 
	public static By weTxtePodSkins=By.xpath("//h4[text()='ePod skins']");

	//Text 'Choose your skin' on Add skin overlay 
	public static By weTxtChooseYourSkin=By.xpath("(.//*[text()='Choose your skin'])[1]");

	//Increment Button Magnetic USB charging cable
	public static By wePlusButtonMagneticUSBCable=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");

	//Quantity Increment button under Nicotine Strength 3% on Add to Cart Modal
	public static By btnIncrementPercentage=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[6]");


	//Choose Solo device colours buttons
	public static By btnSoloDeviceColour(String colour)
	{
		return By.xpath(".//*[@data-tip='"+colour+"']//button");
	}

	//Solo device colours
	public static By imgSoloDevice(String colour)
	{
		return By.xpath(".//img[contains(@src,'"+colour+"')]");
	}

	//I'm fine
	public static By btnImFine = By.xpath(".//button[contains(text(),'fine')]");

	//Flavor selection container
	public static By weFlavorSelectionContainer = By.xpath("(.//*[contains(@class,'Cartridge')])[1]");

	//Text Choose Your Colour
	public static By weTxtChooseYourColour = By.xpath(".//span[contains(text(),'colour')]");

	//Add Flavor
	public static By weAddFlavor(String flavor)
	{
		return By.xpath("(.//*[@id='cartridges']//*[text()='"+flavor+"']/..)//following-sibling::div//button//*[contains(text(),'Add')]");
	}

	//Add or decrement flavor
	public static By btnIncOrDec(int incOrDec)
	{
		return By.xpath("(//*[contains(@class,'CartridgeMod')]//*[@type='button'])[2]");
				// "((//*[contains(@class,'CartridgeMod')]//*[@type='button'])["+String.valueOf(incOrDec)+"])[2]");
	
	                    // ((//*[contains(@class,'CartridgeMod')]//*[@type='button'])["+String.valueOf(2)+"])[2]
	}

	//Buy Summary value in products page
	public static By weTxtBuySummaryValue = By.xpath(".//*[contains(@class,'Summary')]//h3");
	
	//Total value in Add Modal
	public static By weTxtSummaryValue = By.xpath(".//*[contains(@class,'CartridgeModal__Price-')]");
	

	//Text 'ePod'
	public static By weTxtEpod=By.xpath("(.//*[text()='ePod'])[3]");


	//Lychee flavour
	public static By lnkLycheeFlavour=By.xpath("(.//*[@class='BuyCartridges__Item-sc-1liiork-2 cHngBI'])[1]");



	//Button 'Add' on the modal
	public static By btnPlus=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");



	//Total value

	public static By lblTotalValue  = By.xpath("(.//*[@class ='typography__H3-vraxd4-2 BuySummary__Price-sc-1htlc15-2 cSsPzc'])");


	//Abstraction
	public static By weTxtAbstraction=By.xpath("(.//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 JONkT'])[2]");



	//Solo device
	public static By weSoloDevice=By.xpath("(.//*[@class='ProductCard__Figure-sc-7qc70h-2 bhzVuv'])[1]");

	//Engravable epod  @added by Sandeepa on 22/5/2020
	public static By weEngravableEpod=By.xpath("(.//*[@class='ProductCard__Figure-sc-7qc70h-2 bhzVuv'])[2]");

	//Limited Edition  @added by Sandeepa on on 22/5/2020
	public static By weLimitedEdition=By.xpath("(.//*[@class='ProductCard__Figure-sc-7qc70h-2 bhzVuv'])[3]");

	//Page view
	public static By pageView=By.xpath("(.//*[@class='BuyChrome__Container-sc-1okt7kc-0 fWPYzT'])");

	//Verify left panel shows the design of device
	public static By weDesignOfDevice=By.xpath("(.//*[@class='BuyChrome__Background-sc-1okt7kc-17 iRDBLn'])");

	//
	//Passion Fruit
	public static By epodDeviceCustomizablePage=By.xpath("(.//*[@class='BuyChrome__Main-sc-1okt7kc-5 ptbBS'])");

	//What's in the box
	public static By txtWhatInBox=By.xpath("(.//*[@class='BuyOverview__Subheading-sc-1lne9ui-3 hIyDeV u-hide-medium-down'])[2]");
			// "(.//*[@class='BuyOverview__Subheading-sc-82rji4-3 fEVOFU u-hide-medium-down'])[2]");

	//Choose your colour
	public static By txtChooseYourColour= By.xpath("(.//*[text()='Choose your colour'])[2]");


	//choose your colour(gold)
	public static By weColour=By.xpath("(.//*[@class='BuyChrome__Photo-sc-1okt7kc-8 ffRURY'])");

	//gold in epod page
	public static By wegoldColour=By.xpath("(//*[@data-tip='Gold'])[2]");
	//Verify the color.
	public static By selectedDeviceColour=By.xpath("(.//*[@src='/ca/en/images/products/epod/background/gold.jpg'])");
			// "(.//*[@src='static/images/products/epod/background/gold.jpg'])");

	//Add Diaglogue box 
	public static By addDialogueBox=By.xpath("(.//*[@class='CartridgeModal__Inner-kepi1t-2 hJCZll'])"); 

	public static By txtMagneticUSBCable=By.xpath("(.//*[@class='BuySection__Content-sc-1bcwzdv-3 cbqjoL'])[4]");

	public static By txtEpodBox=By.xpath("(.//*[@class='BuySection__Content-sc-1bcwzdv-3 cbqjoL'])[3]");

	//ePod Skin add button
	public static By ePodSkinbtnAdd = By.xpath("//*[@class='Addon__Action-sc-4qaprn-9 hNpTMZ']");

	//choose you skin pop up
	public static By wetxtPopUp = By.xpath("//*[@class='CustomSkinModal__Inner-sc-7b2hv1-2 jrrKEG']");

	//pop up choose your skin 
	public static By wetxtChooseSkin = By.xpath("//*[text()='Choose your skin']");

	//Abstraction skin colour
	public static By btnSkinColour = By.xpath("(//*[@class='CustomSkinModal__SkinThumbnail-sc-7b2hv1-22 jpUEXd'])[2]");

	//Add button
	public static By btnSkinColorAdd = By.xpath("//*[@class='Button__Container-sc-186nrqc-0 dBtxRE CustomSkinModal__StyledButton-sc-7b2hv1-17 hPFhEC']");

	//Skins added
	public static By wetxtSkinName = By.xpath("//*[@class='Addon__ProductName-sc-4qaprn-14 INFFI']");

	//Item Selected
	public static By weItemSelected=By.xpath("(.//*[text()='ePod Solo Devices'])[1]");

	//Item Selected
	public static By weEpodSkinItemSeleceted=By.xpath("(.//*[text()='Tropico'])[1])");
	
	public static By we21DifferentFlavorCatridgeOptions=By.xpath("(.//*[@class='BuyCartridges__Inner-sc-1rtbffr-1 cwSuyc'])");
			// "(.//*[@class='BuyCartridges__Container-sc-1rtbffr-0 hYBxUe'])");

	//Tikiti colr in ePod skin modal
		public static By weTxtClearHoloreaphic=By.xpath("(.//*[@data-tip='Cimento'])");
				// "(.//*[@data-tip='Clear Holographic Skin'])");
		
		//Text "Quantity" from the Add to Cart modal
	    public static By weTxtPackQuantity=By.xpath("(.//*[text()='Pack quantity'])");
	    
	  //ePod device.
		public static By txtEPod= By.xpath("(.//*[text()='ePod'])[3]");
	   
		//ePod product Iamge
		public static By imageEpodSoloDevice =By.xpath("(.//*[@src='/ca/en/images/products/epod/background/black.jpg'])");
	
}
