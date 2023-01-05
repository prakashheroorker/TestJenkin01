package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_ePen3Cartridges {


	//ePen Pods all flavours xpath. example: use "classic-tobacco" in place of flavour colour
	public static By lnkAllFlavours (String FlavourColour)
	{
		return By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/"+FlavourColour+"-vpro-epen-3-cartridge')]");
	}

	//verify flavour text 
	public static By txtFlavours(String FlavourText)
	{
		return By.xpath("//h1[contains(text(),'"+FlavourText+"')]");
	}

	//verify flavours description
	public static By txtFlavoursDescription(String FlavourText)
	{
		return By.xpath("//h1[contains(text(),'"+FlavourText+"')]/..//div//div//div");
	}


	//ePen Device: add items and go to cart
	public static By txtAddItemsgotoCart = By.xpath("//*[contains(text(),'Add items & go to cart')]");

	//ePod Pods all flavours xpath. example: use "lemon-berry" in place of flavour colour
	public static By lnkAllFlavoursePodPodsPage (String flavour)
	{
		return By.xpath("//a[contains(@href,'/buy-online/vype-epod-vpro-cartridges/"+flavour+"')]");
	}




	//#################################

	// Heading text "Vype ePen 3 cartridges" of ePen 3 Cartridges page
	public static By weTxtVypeePen3Cartridges=By.xpath("(.//*[text()='ePEN 3 CARTRIDGES'])[1]");
	public static By weTxtePenPods=By.xpath("//*[text()='ePen Pods']");

	//Button buy now Classic Peach flavor
	//	public static By btnBuyNowClassicPeach=By.xpath("(.//*[text()='Buy now'])[1]");

	//Button buy now Strawberry Smash ePen 3 Cartridge flavor
	public static By weFlavorStrawberrySmashePen3Cartridge=By.xpath("(.//*[@alt='Strawberry Smash ePen 3 Cartridge'])[1]");
	//Button buy now Strawberry Smash ePen 3 Cartridge flavor after adding already one product in cart
	public static By weFlavorStrawberrySmashePen3Cartridge1=By.xpath("(.//*[@alt='Strawberry Smash ePen 3 Cartridge'])[2]");

	//VusePlus link in header section
	public static By lnkVusePlus=By.xpath("//*[@data-tracking='nav--link--text--Vype_Plus']");
    public static By lnkHelp = By.xpath("//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Help']");
	
	
	//Why Shop Online link in header section
	public static By lnkWhyShopOnline=By.xpath("//*[text()='Why Shop Online?']");
    public static By lnkSave = By.xpath("//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Save']");
	
	
	//Store Locator link
	public static By lnkStoreLocator=By.xpath("//a[contains(@href,'vape-stores')]");

	//ePen Pods general information
	public static By txtePenPods=By.xpath("//*[contains(@class,'CollectionHeader__Description')]");

	//Subscribe and save button
	public static By btnSubscribeSave=By.xpath("(//*[text()='Subscribe & Save'])[1]");

	//Verify Subscribe and save page
	public static By txtSubscribeSave=By.xpath("//*[@class='OrderType__Container-jrlfby-0 bPWdpS']//*[text()='Subscribe & save']");
			// "//*[text()='Subscribe & save']");
			// "(//*[text()='Subscribe & Save'])[2]");
	
	
	
	public static By txtSubscribesave=By.xpath("//*[text()='Subscribe & Save'");
	
	
	//Header save
    public static By lnkHeaderSave = By.xpath("(.//*[@data-tracking='nav--link--text--Save'])[1]");
    
  //subscribe and save link
    public static By btnsubscribepercent=By.xpath("(.//*[@data-tracking='nav--link--text--Subscribe & Save (up to 30%)'])[1]");
   
	
	public static By quantity=By.xpath("(//*[@class='TinyCart__Quantity-i4vlf8-3 vixG'])[1]");
	
	
	public static By wetxtTotalvalue=By.xpath("//*[@class='typography__H3-sc-10lefml-2 Summary__Price-sc-1hujf0n-5 exunCV dvERNO']");

	//ePen Pods link
	public static By lnkePenPods=By.xpath("//*[@href='/buy-online/vype-epen-3-cartridges']");

	//Strawberry flavour
	public static By lnkStrawberryFlavour=By.xpath("//*[@href='/buy-online/vype-epen-3-cartridges/original-strawberry-vpro-epen-3-cartridge']");

	//Strawberry page
	public static By txtOriginalStrawberry=By.xpath("//*[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down']");

	//Add nicotine quantity
	public static By btnAddQuantity=By.xpath("//*[text()='12mg/ml']/..//button[2]");

	//New susbscribe and save button
	public static By btnNew=By.xpath("(//*[@class='OrderType__Trigger-sc-104vt6j-4 dedyhu'])[2]");

	//Subscribe button
	public static By btnSubscribe=By.xpath("//*[@class='Button__Label-sc-186nrqc-2 jpETUM']");

	//Mini Bag icon
	public static By btnMiniBag=By.xpath("(//*[@href='/cart'])[1]");

	//Add 2 more packs
	public static By txtAddmorepacks=By.xpath("//*[contains(text(),'more packs of any flavour')]");

	//Address box
	public static By txtAddress=By.xpath("//*[@name='address']");

	//Phone number box
	public static By txtPhnNumber=By.xpath("//*[@name='phoneNumber']");

	//Active subscription text
	public static By txtActiveSubscription=By.xpath("(//*[@class='subscriptions__Heading-sc-11juu65-2 hypNrj'])[1]");

	//text ePod pods
	public static By txtePodPods = By.xpath("//*[text()='ePod Pods']");

	//Home Page VUSE xpath
	public static By txtVuse = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']");

	//Strawberry page in cart page
	public static By txtStrawberryCartPage=By.xpath("(.//*[contains(text(),'Product')])[2]/../../following-sibling::div//div//div//div//strong");

	//Subscribe and save
	public static By weTxtSubscribeAndSave = By.xpath(".//h4[contains(text(),'Subscribe')]");

	//Learn more link under subscription and save section
	public static By lnkLearnMore = By.xpath(".//a[text()='Learn more']");


	// Heading text "Vype ePen 3 cartridges" of ePen 3 Cartridges page
	public static By weTextePenPods=By.xpath("(.//*[text()='ePen Pods'])[1]");

	//Button buy now Classic Peach flavor
	//	public static By btnBuyNowClassicPeach=By.xpath("(.//*[text()='Buy now'])[1]");



	//Favors Box/Icon
	public static By weStrawberryFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/original-strawberry-vpro-epen-3-cartridge')]");

	public static By weAppleFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/fresh-apple-vpro-epen-3-cartridge')]");

	public static By wePeachFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/classic-peach-vpro-epen-3-cartridge')]");

	public static By weVanillaFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/infused-vanilla-vpro-epen-3-cartridge')]");

	public static By weCherryFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/dark-cherry-vpro-epen-3-cartridge')]");

	public static By weCrispCrushedMintFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/vape-pods-crushed-mint-epen-3-cartridge')]");

	public static By weMasterBlendFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/master-blend-epen-3-cartridge'])[1]");

	public static By weMangoFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/tropical-mango-vpro-epen-3-cartridge')]");

	public static By weClassicTobaccoFlavorBox=By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/classic-tobacco-vpro-epen-3-cartridge')]");

	public static By weFreshAppleFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/vype-epen3-pods-fresh-apple-cartridge'])[1]");

	public static By wePeachWhirlFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen-3-cartridge-peach-whirl'])[1]");

	public static By weStrawberrySmashFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen-3-vape-pods-strawberry-smash'])[1]");

	public static By weCrispMintFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/crisp-mint-epen-3-cartridge'])[1]");

	public static By weInfusedVanillaFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen-3-cartridge-infused-vanilla'])[1]");

	public static By weBlendedTobaccoFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/vype-epen-3-pods-blended-tobacco'])[1]");

	public static By weDarkCherryFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/vype-epen3-dark-cherry-cartridge'])[1]");

	public static By weGoldenTobaccoFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen-3-golden-tobacco-cartridge'])[1]");

	public static By weIndigoDiveFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen-3-cartridge-indigo-dive'])[1]");

	public static By weScarletKickFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/epen3-cartridge-scarlet-kick-berries'])[1]");

	public static By weGreenSnapFlavorBox=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/green-snap-epen-3-cartridge'])[1]");


	//Favors 'TEXT' Box/Icon
	public static By weTxtStrawberryFlavorBox=By.xpath("(.//*[text()='Strawberry'])[1]");

	public static By weTxtAppleFlavorBox=By.xpath("(.//*[text()='Apple'])[1]");

	public static By weTxtPeachFlavorBox=By.xpath("(.//*[text()='Peach'])[1]");

	public static By weTxtVanillaFlavorBox=By.xpath("(.//*[text()='Vanilla'])[1]");

	public static By weTxtCherryFlavorBox=By.xpath("(.//*[text()='Cherry'])[1]");

	public static By weTxtCrispCrushedMintFlavorBox=By.xpath("(.//*[text()='Crisp Mint'])[1]");

	public static By weTxtMasterBlendFlavorBox=By.xpath("(.//*[text()='Master Blend'])[1]");

	public static By weTxtMangoFlavorBox=By.xpath("(.//*[text()='Mango'])[1]");

	public static By weTxtClassicTobaccoFlavorBox=By.xpath("(.//*[text()='Classic Tobacco'])[1]");

	public static By weTxtFreshAppleFlavorBox=By.xpath("(.//*[text()='Apple'])[2]");

	public static By weTxtPeachWhirlFlavorBox=By.xpath("(.//*[text()='Peach'])[2]");

	public static By weTxtStrawberrySmashFlavorBox=By.xpath("(.//*[text()='Strawberry'])[2]");

	public static By weTxtCrispMintFlavorBox=By.xpath("(.//*[text()='Crisp Mint'])[2]");

	public static By weTxtInfusedVanillaFlavorBox=By.xpath("(.//*[text()='Vanilla'])[2]");

	public static By weTxtBlendedTobaccoFlavorBox=By.xpath("(.//*[text()='Blended Tobacco'])[1]");

	public static By weTxtDarkCherryFlavorBox=By.xpath("(.//*[text()='Cherry'])[2]");

	public static By weTxtGoldenTobaccoFlavorBox=By.xpath("(.//*[text()='Classic Tobacco'])[2]");

	public static By weTxtIndigoDiveFlavorBox=By.xpath("(.//*[text()='Indigo Dive'])[1]");

	public static By weTxtScarletKickFlavorBox=By.xpath("(.//*[text()='Scarlet Kick'])[1]");

	public static By weTxtGreenSnapFlavorBox=By.xpath("(.//*[text()='Green Snap'])[1]");

	//Home in check out page
	public static By btnHome=By.xpath("(.//*[@class='ShippingMethod__OptionContainer-sc-1esejh7-2 cpRdaN'])[1]");


	//Button buy now Classic Peach flavor
	//	public static By btnBuyNowClassicPeach=By.xpath("(.//*[text()='Buy now'])[1]");


	public static By weAllFlavorSection=By.xpath("//*[contains(@class,'CartridgeThumbnail__Container')]");


	//Subscribe and Save.
	public static By TxtSubscribeAndSave=By.xpath("(.//*[@class='typography__H4-vraxd4-3 SubscriptionInfoBox__Heading-sc-116q5wh-5 gYBSiJ'])");

	//Content
	public static By weContent=By.xpath("(.//*[contains(@class,'SubscriptionInfoBox')])[1]");

	//Forgot Link
	public static By txtForgotLink=By.xpath("(//*[text()='Forgot?'])");

	//Log In
	public static By txtLogInLink=By.xpath("(//*[@class='Button__Container-sc-186nrqc-0 kxqWCV'])");

	//Strawberry
	public static By txtStrawberryFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][1])");

	//Apple
	public static By txtAppleFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][2])");

	//Peach
	public static By txtPeachFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][3])");

	//Vanilla
	public static By txtVanillaFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][4])");

	//Cherry
	public static By txtCherryFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][5])");

	//Crisp Mint
	public static By txtCrispMintFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][6])");

	//Mango
	public static By txtMangoFlavor=By.xpath("(//*[@class='CartridgeList__Item-sc-9th72d-2 lguLmf'][8])");

	//Image of Flavor
	public static By ImageStrawberrySmash=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/original-strawberry-vpro-epen-3-cartridge'])");

	//Golden Tobacco Flavor
	public static By txtGoldenTobaccoFlavor=By.xpath("(.//*[@class='CartridgeThumbnail__Figure-m1q1va-3 gpugmD'])[17]");

	//Classic tobacco
	public static By txtTobaccoFlavor=By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges/classic-tobacco-vpro-epen-3-cartridge'])[1]");

	//Classic Tobacco page.
	public static By wetxtTobaccoFlavorpge=By.xpath("(.//*[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down'])");

	//Text name of flavor.
	public static By weGoldenTobacco=By.xpath("(.//*[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down'])");

	//Flavor description,"A high intensity flavour with a darker smokier taste."
	public static By txtFlavorDescription=By.xpath("(.//*[text()='A high intensity flavour with a darker smokier taste.'])");

	//Text "0mg/ml" is displayed from the Flavor detail page
	public static By weTxt0mgperml=By.xpath("(.//*[text()='0mg/ml'])[1]");

	//Add button"12mg/ml
	public static By btnPlus12mg=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[4]");

	//Add button "0mg/ml
	public static By btnPlus0mg=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'])[2]");

	//Subtotal value.
	public static By lblSubTotalValue=By.xpath("(.//*[@class='typography__H3-vraxd4-2 Summary__Price-sc-1ju87qi-4 jgRiaq'])");

	//Label Choose Quantity
	public static By labelChooseQuantityAndNicotine=By.xpath("(.//*[@class='Selector__Row-sc-1weayt0-3 iAXCoU'])[1]");

	//Remove button.
	public static By btnRemove=By.xpath("(.//*[@class='QuantityPicker__Button-sc-19b5kqw-1 kLDkul'][1])");

	//Add to cart button.
	public static By btnAddToCart=By.xpath("(.//*[text()='Add to cart'])");

	//Tiny cart
	public static By btnTinyCart =By.xpath("(.//*[@class='TinyCart__IconWrap-fpderd-2 vzicL'])");

	//View cart button
	public static By btnViewCart=By.xpath("(.//*[@href='/cart'])[2]");

	//selected flavor in mini cart.
	public static By weSelectedFlavorInCart=By.xpath("(.//*[@class='Product__Title-sc-4j9tv5-4 cEyHVD'])[1]");

	//Sub Total
	public static By txtSubTotal=By.xpath("(.//*[@class='TinyCart__Row-fpderd-8 bfbzCz'])[1]");

	//HST text in shipping page
	public static By txtHst=By.xpath("(.//*[text()='HST'])");

	//text A1A 1A1 in check out
	public static By txtA1a1=By.xpath("(.//*[@class='Input__Field-sc-1d4fqnm-3 dFfLci'])[2]");

	//classic tobacco image left side
	public static By weClassicTobaccoFlavourImage=By.xpath("(.//*[@src='/ca/en/images/home/offers/shape.svg'])");

	//tobacco description at right side displayed.
	public static By weClassicTobaccoFlavourDescription=By.xpath("(.//*[@class='BuyOverview__Section-sc-1lne9ui-1 gXftXK'])");
			// "(.//*[@class='BuyChrome__Content-sc-1r5ifw0-6 eiaHYr'])");
}
