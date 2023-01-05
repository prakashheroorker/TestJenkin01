package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_CommonXpath {

	// PreLogin

	public static By txtflavor2(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]");
	}
	//public static final By txtVuseNews = By.xpath("//*[text()='Vuse News']");
	public static final By wenewstiles = By.xpath("(//*[contains(@class,'typography__H4')])");

	public static final By newstitle = By.xpath("(//*[contains(@class,'typography__H1')])");

	public static final By txtgiftguide = By.xpath("(//*[contains(@class,'typography__H4')])[1]");
	public static final By txtsubscribe = By.xpath("(//*[contains(@class,'typography__H4')])[2]");
	public static final By txtcybermonday = By.xpath("(//*[contains(@class,'typography__H4')])[3]");
	public static final By txtblackfriday = By.xpath("(//*[contains(@class,'typography__H4')])[4]");
	public static final By txtvusetakeover = By.xpath("(//*[contains(@class,'typography__H4')])[5]");
	public static final By txtknowyourvape = By.xpath("(//*[contains(@class,'typography__H4')])[6]");
	// Province Drop down
	public static By btnLoginorRegister = By.xpath("//*[contains(@class,'Button')]//*[text()='Login/Register']");
	// "(.//*[@data-tracking='nav--link--button--Login/Register'])[1]");
	
	public static By txtePodDevice = By.xpath("//*[text()='All ePod devices']");


	public static By pgePodDevice = By.xpath("(//*[contains(text(),'Own the power')])[1]");


	// Ontario province xpath
	public static By txtOntario = By.xpath("//option[contains(text(),'Ontario')]");

	// Login button on registration Modal
	public static By btnLoginRegisterModal = By.xpath("(.//*[text()='Log in'])[1]");

	public static By btnSignRegisterModal = By.xpath("(.//*[text()='Sign up'])[1]");

	// User name text field login Modal
	public static By txtUsername = By.xpath("(.//*[@name='email'])[1]");

	// Password text field login Modal
	public static By txtPassword = By.xpath("(.//*[@name='password'])[1]");

	// Login button on Login Modal
	public static By btnLogin = By.xpath("(.//*[text()='Log in'])[2]");

	public static By btnNext = By.xpath(".//*[@type='submit']");

	// Forgot link
	public static By lnkForgot = By.xpath("//*[text()='Forgot?']");

	// PostLogin
	public static By btnAccount = By
			.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/following-sibling::div[3]");

	// Products link from the main menu navigation
	public static By lnkProducts = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/../div[1]/div[1]/button/span");
	//+ "//span[text()='Shop']");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits'])[1]");
	public static By lnkShop = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/../div[1]/div[1]/button/span");
	//+ "(.//*[text()='Shop'])[1]");

	//public static By lnkShop = By.xpath("(.//*[text()='Shop'])[1]");

	// Cartridges link under the epen3 section
	public static By lnkCartridgesEpen3 = By.xpath("(//*[text()='Cartridges'])[1]");
	// "(//*[text()='Pods'])[1]");
	// ".//*[contains(@href,'buy-online/vype-epen-3-cartridges') and
	// contains(text(),'Pods')]");

	// Starter Kit link under the ePod section
	public static By lnkStarterKitEpod = By.xpath("(.//a[contains(@href,'/vype-epod-starter-kit')])[1]");
	public static By lnkDevices = By.xpath("//*[text() = 'All ePod devices']");

	// Cart Icon from the main menu navigation
	public static By lnkCartIcon = By.xpath("(.//a[contains(@href,'/cart')])[1]");

	// View Cart button on Hovering the Cart Icon
	// public static By btnViewCart= By.xpath("(.//a[contains(@href,'/cart')])[2]");
	public static By btnViewCart = By.xpath("(//a/span[text()='View cart'])[1]");
	// Skins link under the ePod section
	public static By lnkSkinsEpod = By.xpath("//*[text()='Shop Device Skins']");

	// Charger link under ePod section
	public static By lnkCharger = By.xpath("//a[contains(@href,'/buy-online/vype-epod-charger')]");

	// Accessories link under ePod section
	// public static By lnkAccessories =
	// By.xpath("//a[text()='Accessories']");//a[contains(@href,'/ca/en/buy-online/vype-epod-accessories/')])[1]
	// "//a[contains(@href,'/buy-online/vype-epod-accessories')]");

	// Pods link under ePod section
	public static By lnkPodsePod = By.xpath("(.//*[@href='/buy-online/vype-epod-vpro-cartridges'])[1]");

	// "(.//a[contains(@href,'cartridges')][text()='Pods'])[2]");
	// public static By lnkDevices = By.xpath("");

	// mini cart single row product
	public static By weTxtAddedProduct(String flavor) {
		return By.xpath("(.//*[contains(@class,'TinyCart__Cart')]//*[contains(text(),'" + flavor + "')])[1]");
	}

	// Subtotal value in Mini cart
	public static By weTtSubtotalValueMiniCart = By
			.xpath("((.//*[contains(@class,'TinyCart')]//*[text()='Subtotal'])/..//following-sibling::strong)[1]");

	// Purchase message in Mini cart
	public static By txtPurchases = By.xpath("(//*[text()='Purchases'])[1]");

	// Subscription link in my account page
	public static By lnkSubscription = By.xpath(".//a[contains(@href,'/account')]//*[text()='Subscription']");

	// Active Subscription
	public static By weActiveSubscriptions = By
			.xpath("(.//*[contains(@class,'subscriptions__Background')]//following-sibling::div)[1]");

	// Subscription date
	public static By txtSubscriptionDate = By.xpath(".//*[text()='Date']");

	// Subscription Payment
	public static By txtSubscriptionPayment = By.xpath(".//*[text()='Payment']");

	// Subscription address
	public static By txtSubscriptionAddress = By.xpath(".//*[text()='Address']");

	// Edit Subscription link
	public static By lnkEditSubscription = By.xpath(".//button[contains(@class,'Subscription')][text()='Edit']");

	// Pause Subscription button
	public static By btnPauseSubscription = By.xpath(".//button[text()='Pause']");

	// Cancel Subscription button
	public static By btnCancelSubscription = By.xpath(".//button[text()='Cancel']");

	// Pause Subscription modal
	public static By wePauseSubscriptionModal = By.xpath(".//*[contains(@class,'PauseSubscriptionModal')]");

	// Pause subscription modal confirmation text
	public static By txtSubscriptionModal = By.xpath(".//*[contains(text(),'recurring subscription')]");

	// Pause button on pause modal
	public static By btnPauseModal = By.xpath(".//button//*[contains(text(),'pause')]");

	// No, return button on pause modal
	public static By btnNoReturnModal = By.xpath(".//button//*[text()='No, return']");

	// Subscription paused text
	public static By txtPausedSubscription = By.xpath(".//strong[text()='Paused']");

	// No, return button on pause modal
	public static By btnUnpauseAndSaveChanges = By.xpath(".//button//*[text()='Unpause & save changes']");

	// Cancel Subscription modal
	public static By weCancelSubscriptionModal = By.xpath(".//*[contains(@class,'CancelSubscriptionModal')]");

	// Cancel subscription modal text
	public static By txtCancelSubscriptionModal = By
			.xpath(".//*[contains(text(),'cancel your recurring subscription')]");

	// Yes, Cancel button in cancel subscription modal
	public static By btnYesCancelModal = By.xpath(".//button//*[text()='Yes, cancel']");

	// No Subscription plan yet text
	public static By txtNoSubscription = By.xpath(".//h4[text()='You have no subscription plan yet']");

	// Starter Kit link under the ePen3 section
	public static By lnkStarterKitEpen3 = By.xpath(".//*[@href='/buy-online/epen-3'][text()='Device']");

	// Subtotal text in mini cart
	public static By weTxtSubtotalMiniCart = By.xpath("(.//*[contains(@class,'TinyCart')]//*[text()='Subtotal'])[1]");

	public static By txtePenDeviceKit = By.xpath("//h1[contains(text(),'ePen Device Kits')]");

	// Cartridges link under the epen3 section
	public static By lnkEpen3Pods = By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges'])[1]");

	// Added by Sandeepa on 11/06/2020
	// starterIt(devices)under ePen
	public static By lnkDevice = By.xpath("(.//a[contains(@href,'/buy-online/epen-3')])[1]");

	// My Account link
	public static By lnkMyAccount = By.xpath("(.//a[contains(@class,'MobileNavItem__Container')])[1]");
	// "(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]//div//a[contains(text(),'My
	// account')]");

	// Orders link
	public static By pgOrders = By.xpath("(.//a[@href='/ca/en/account/orders/'])");

	// Logout link
	public static By lnkLogout = By.xpath("(//*[text()='Logout'])[1]");
	// "(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]//div//*[contains(text(),'Logout')]");

	// My Rewards
	public static By lnkMyRewards = By.xpath("//*[contains(@class,'AccountDropdown__Item')and text()='My Rewards']");

	// My Savings
	public static By lnkMySavings = By.xpath("//*[contains(@class,'AccountDropdown__Item')and text()='My Savings']");//("(//*[text()='My Savings'])[2]");

	// My Orders
	public static By lnkMyOrders = By.xpath("//*[contains(@class,'AccountDropdown__Item')and text()='My Orders']");//("(//*[text()='My Orders'])[2]");

	// My Subscription
	public static By lnkMySubscription = By.xpath("//*[contains(@class,'AccountDropdown__Item')and text()='My Subscription']");//("(//*[text()='My Subscription'])[2]");

	// ePen and ePod tab
	public static By txtePenePod = By.xpath("//*[text()='Device']");
	//public static By txtepod = By.xpath("(//*[text()='Pods'])");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits']/../..//div//div//div)[1]");

	public static By txtepen3Catridges = By.xpath("(//*[text()='ePen 3'])[1]");

	// Heading text "Vype ePen 3 cartridges" of ePen 3 Cartridges page
	public static By weTxtVypeePen3Cartridges = By.xpath("(.//*[text()='ePEN 3 CARTRIDGES'])[1]");
	public static By weTxtePenPods = By.xpath("//*[contains(text(),'Vuse ePen pods are available')]");

	// "//*[@id='gatsby-focus-wrapper']/div[2]/div[2]/div/section/div/div/h1");
	// "//h1[text()='ePen Pods']");
	// "//*[text()='ePen Pods']");

	// Vuse ePod page
	public static By wetxtVuseePod = By.xpath("//*[text()='Elements ']/../..");

	// Solo device tile buy now button
	public static By btnSoloDeviceBuyNow = By.xpath("//a[contains(@href,'buy-online/epod-devices')]");

	// Engraved ePod
	public static By btnEngravedDeviceBuyNow = By.xpath("//span[text()='Engravings']");

	// Engravable epod page
	public static By pgEngravableEpod = By.xpath(".//h1[contains(text(),'ePod')]");

	// epod Device page body
	public static By pgEpodStarterKitBody = By.tagName("body");

	// Vype starter kit Image in overview
	public static By imgVypeStarterKit = By.xpath("(.//img[@alt='Vuse ePod Starter Kit'])[6]");

	// Overview slide show texts
	public static By weTxtVypeStarterKitFeature1 = By.xpath(".//h2[text()='QUIET. SMOOTH. SATISFYING.']");
	public static By weTxtVypeStarterKitFeature1Content = By.xpath(".//p[contains(text(),'quiet, smooth')]");
	public static By weTxtVypeStarterKitFeature2 = By.xpath(".//h2[text()='ALL-DAY USE*']");
	public static By weTxtVypeStarterKitFeature2Content = By.xpath(".//p[contains(text(),'When fully charged,')]");
	public static By weTxtVypeStarterKitFeature3 = By.xpath(".//h2[text()='PERFECTLY']");
	public static By weTxtVypeStarterKitFeature3Content = By.xpath(".//p[contains(text(),'Compact design')]");

	// shop flavours link
	public static By lnkShopFlavours = By.xpath(".//a[text()='Shop flavours']");

	// flavors pod page
	public static By pgFlavourPod = By.xpath("//div[contains(@class,'CartridgeList__Container')]");

	// Personalize slide show text
	public static By weTxtVypeStarterKitPersonlize = By.xpath(".//h2[text()='PERSONALIZE ']");


	public static By lnkNothanks=By.xpath("//*[text()='No thanks']");

	// Shop Skins link
	public static By lnkShopSkins = By.xpath("(.//a[contains(@href,'epod-skins')][text()='Shop skins'])[1]");

	// Engravable device link
	public static By lnkEnravableDevice = By.xpath("(.//a[contains(@href,'engravable')][text()='Engrave device'])[1]");

	// epod device image
	public static By imgEpod(String deviceColour) {
		deviceColour = deviceColour.trim().replace(" ", "-");
		return By.xpath("(.//*[contains(@src,'device-" + deviceColour + "')])[1]");
	}

	// ePod Pods Page
	public static By pgEpodPods = By.xpath("//*[text()='ePod Vape Pods']/..");

	// select flavor pods
	public static By weFlavorPods(String flavor) {
		return By.xpath(".//img[contains(@alt,'" + flavor + "')]");
	}

	// flavor specific pod page
	public static By pgFlavorPods(String flavor) {
		return By.xpath(".//h1[contains(text(),'" + flavor + "')]");
	}

	// Scroll to Nicotine Strength visibility
	public static By weTxtChooseQuantity = By.xpath("//h4[contains(text(),'Choose quantity and nicotine strength')]");

	// epod skins page
	public static By pgEpodSkins = By.xpath(".//h4[text()='Choose your skin']");

	// Instagram text
	public static By lnkInstagram = By.xpath("(//*[@href='https://www.instagram.com/vusecanada/'])[1]");
	// "(//*[@href='https://www.instagram.com/vusecanada/'])[2]");

	// Contact text
	public static By lnkContactUs = By.xpath("//*[text()='Contact Us']");
	// "(//a[contains(@href,'/contact-us')])[1]");

	// FAQs text
	public static By lnkFaqs = By.xpath("//*[text()='FAQs']");
	// "//a[contains(@href,'/faq')]");
	public static By lnkStoreLocator = By.xpath("//*[text()='Store Locator']");
	// "//*[text()='//*[text()='Store Locator']']");

	public static By pgStoreLocator = By.xpath("//*[contains(@class,'sc-feJyhm')]");
	//By.xpath("//*[contains(text(),'Find a Vuse Store ')]");

	// Condition of sale link
	public static By lnkConditionofSale = By.xpath("//a[contains(@href,'/pages/conditions-of-sale')]");

	// Privacy Policy link
	public static By lnkPrivacyPolicy = By.xpath("//a[contains(@href,'/pages/privacy-policy')]");

	// Terms and conditions link
	public static By lnkTermsandConditions = By.xpath("(//a[contains(@href,'/pages/terms-conditions')])[1]");

	// Cookie Policy link
	public static By lnkCookiePolicy = By.xpath("//a[contains(@href,'/pages/cookie-policy')]");

	// Vuse products may be harmful text
	public static By txtVuseProducts = By.xpath("//*[contains(text(),'Vuse products may')]");

	// Instagram Page
	public static By txtInstagram = By.xpath("//*[@alt='Instagram']");
	// +
	// "//*[@src='/static/images/web/mobile_nav_type_logo.png/735145cfe0a4.png']");
	// "//*[text()='Instagram']");

	// Facebook Page
	public static By txtFacebook = By.xpath("//*[@href='https://www.facebook.com/']");

	// Twitter Page
	public static By txtTwitter = By.xpath("//*[@href='/' and @aria-label='Twitter']");

	// Youtube Page
	public static By txtYoutube = By.xpath("(//*[@href='/'])[1]");

	// Contact Us Page
	//public static By txtContactUs = By.xpath(".//*[contains(text(),'Programs')]");
	// "(//*[text()='Contact us'])[1]");

	// Text 'General Questions'
	//public static By weTxtGeneralQuestions = By.xpath(".//*[contains(text(),'Programs')]");
	// "(.//*[text()='General Questions'])[1]");

	// Conditions of sale Page
	public static By txtConditionsofSale = By.xpath("//*[contains(@class,'typography__H1')]");

	// Privacy Policy Page
	public static By txtPrivacyPolicy = By.xpath("(//*[text()='Privacy Policy'])[1]");

	// Terms and conditions Page
	public static By txtTermsConditions = By.xpath("(//*[text()='Terms & Conditions'])[1]");

	// Cookie Policy Page
	public static By txtCookiePolicy = By.xpath("(//*[text()='Cookie Policy'])[1]");

	// Cookie Policy Page content
	public static By txtcookiePolicyContent = By.xpath("(//*[text()='Cookie Policy'])[1]/../following-sibling::div");

	// Social Media Links
	// Instagram
	public static By lnkLogin = By.xpath("//*[text()='Instagram']");
	public static By pgInstagram = By.xpath("//h1[text()='Instagram']");

	// Facebook
	public static By lnkFacebook = By.xpath("//*[@href='https://www.facebook.com/VuseCanada/']");
	// + "//a[text()='Facebook']");
	public static By pgFacebook = By.xpath("//*[@href='https://www.facebook.com/']");
	// "//a[contains(@href,'facebook.com')][contains(@title,'Go')]");

	// Youtube
	public static By lnkYoutube = By.xpath(".//a[text()='Youtube']");
	public static By pgYoutube = By.xpath(".//*[text()='Subscribe']");

	// Twitter
	public static By lnkTwitter = By.xpath("//a[text()='Twitter']");
	public static By pgTwitter = By.xpath("//span[text()='New to Twitter?']");

	// discard changes button
	public static By btnDiscardChanges = By.xpath("//*[text()='Discard changes']");

	// Yes, pause the subscription" button
	public static By btnYesPause = By.xpath("//*[contains(text(),'Yes, pause subscription')]");

	// Your subscription has been successfully updated text
	public static By txtYourSubscriptionPaused = By
			.xpath("//*[contains(text(),'Your subscription has been successfully updated')]");

	// Unpause and save changes button
	public static By btnUnpauseSave = By.xpath("//*[contains(text(),'Unpause & save changes')]");

	// Active subscription
	public static By txtActiveSubscription = By.xpath("//*[text()='Active']");
	public static By txtPaused = By.xpath("//*[text()='Paused']");

	// Add/ modify button
	public static By btnAddorModify = By.xpath("//*[text()='Add/modify items']");

	// Pick your Pods page
	public static By txtPickyrPods = By.xpath("//*[text()='Pick your pods']");
	public static By btnBack = By.xpath("//*[text()='‹ Back']");
	public static By btnadd = By.xpath("(//*[text()='Add - $13'])[2]");
	public static By weProdutAdded = By.xpath("(//*[@class='Upsell__ProductContainer-d6xfq9-2 fVtKRE'])[1]");
	public static By btnSubmitUpadate = By.xpath("//*[text()='Submit updates']");
	public static By weSubscriptionUpdated = By.xpath("//*[contains(text(),'subscription is successfully updated!')]");
	public static By wetxtTotalvalue = By.xpath("//*[@class='CartridgeModal__Price-rj7zrv-13 itojYh']");

	// Cancel subscription link
	public static By lnkCancelSubscription = By.xpath("//*[contains(text(),'Cancel')]");

	// Subscription in reward page.
	public static By lblSubscription = By.xpath("(.//*[text()='Subscription'])[1]");

	//subscrption 
	public static By lblclose = By.xpath(".//*[@alt='Close']");

	// Edit in subscription tab.
	public static By txtEdit = By.xpath("(.//*[text()='Edit'])");

	// Cancel link
	public static By lnkCancel = By.xpath("(.//*[text()='Cancel'])");

	// Cancel Subscription
	public static By txtCancelSubscription = By.xpath("(.//*[text()='Cancel subscription'])");

	// Cancel message.
	public static By txtCancelMessage = By.xpath(
			"(.//*[text()='Are you sure you want to cancel your recurring subscription? This action cannot be undone.'])");

	// link yes cancel.
	public static By lnkYesCancel = By.xpath("(.//*[text()='Yes, cancel'])");

	// link no ,return
	public static By lnkNoreturn = By.xpath("(.//*[text()='No, return'])");

	// text cause or cancel Subscription.
	public static By txtSubscription = By.xpath("(.//*[text()='subscription'])");

	// cancel subcription pop up modal txt
	public static By txtCancelSubscriptionPopup = By.xpath(
			"(.//*[text()='Are you sure you want to cancel your recurring subscription? This action cannot be undone.'])");

	// Confirmation of the subscription cancel is displayed
	public static By txtSubscriptionCancelInfo = By.xpath("(.//*[text()='You have no subscription plan yet'])");

	// Pause txt pop up modal
	public static By txtPausePopupModal = By.xpath(
			"(.//*[text()='Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.'])");

	// Confirmation of the subscription Pause displayed
	public static By txtPauseConformation = By
			.xpath("//div[text()='Your subscription is successfully updated! Please give an hour for the confirmation to reach you.']");

	// No,return
	public static By lnkNoReturn = By.xpath("(.//*[text()='No, return'])");

	// Pause
	public static By lnkPause = By.xpath("(.//*[text()='Pause'])");

	// Pause text message
	public static By txtPauseMessage = By.xpath(
			"(.//*[text()='Are you sure you want to pause your recurring subscription? You will no longer receive your items until you have unpaused it.'])");

	// Pause link YesPauseSubscription
	public static By lnkYesPauseSubscription = By.xpath("(.//*[text()='Yes, pause'])");

	// ePen Pods all flavours xpath. example: use "classic-tobacco" in place of
	// flavour colour
	public static By lnkAllFlavours(String FlavourColour) {
		return By.xpath("//*[text()='" + FlavourColour + "']");

	}

	// verify flavour text
	public static By txtFlavours(String FlavourText) {
		return By.xpath("//h1[contains(text(),'" + FlavourText + "')]");
		//return By.xpath("(//*[text()='"+FlavourText+"'])[1]");
	}

	// verify flavours description
	public static By txtFlavoursDescription(String FlavourText) {
		return By.xpath("//h1[contains(text(),'" + FlavourText + "')]");//("//h1[contains(text(),'" + FlavourText + "')]/..//div//div//div");
	}

	// ePen Device: add items and go to cart
	public static By txtAddItemsgotoCart = By.xpath("//*[contains(text(),'Add items & go to cart')]");

	// One time purchase total
	public static By wetxtPrice = By.xpath("//*[text()='One time purchase total']/following-sibling::strong");

	// One time purchase total
	public static By wetxtPrice1 = By.xpath("//*[text()='One time purchase total']/following-sibling::strong");

	// Home address
	public static By weHomeAddress = By.xpath(
			"//*[contains(text(),'Where should we')]/../../following-sibling::div//div//div//div//div[contains(text(),'Home')]");

	// Direct to Post office address
	public static By weDirectToPostOffice = By.xpath(
			"//*[contains(text(),'Where should we')]/../../following-sibling::div//div//div//div//div[contains(text(),'Direct')]");

	// Postal code
	public static By txtPostalCode = By.name("postalCode");

	// Search box
	public static By txtSearchBox = By.xpath("//*[contains(text(),'SEARCH')]");

	// Address box
	public static By txtAddress = By.xpath("//*[contains(text(),'SEARCH')]/../../../following-sibling::div");

	// Add to Cart button in Modal
	public static By btnAddToCart = By.xpath("(.//*[text()='Add to cart'])[1]");
	public static By btnSubscribeandSave = By.xpath("(.//*[text()='Subscribe & Save'])[1]");

	// Get Total value text
	public static By wetxtTotalValue = By.xpath(
			"(.//*[text()='Nicotine strength'])[1]/../../following-sibling::footer//div//span[contains(text(),'$')]");

	// Text "Nicotine Strength" from the Flavor detail page
	public static By weTxtNicotineStrength = By.xpath("(.//*[contains(text(),'Nicotine strength')])[1]");

	// Text "Quantity" from the Flavor detail page
	public static By weTxtQuantity = By.xpath("(.//*[contains(text(),'quantity')])[1]");

	// Text "12mg/ml" is displayed from the Flavor detail page
	public static By weTxt12mgperml = By.xpath("(.//*[text()='12mg/ml'])[1]");

	// Text "30mg/ml" is displayed from the Flavor detail page
	public static By weTxt30mgperml = By.xpath("(.//*[text()='30mg/ml'])[1]");

	// Text "0mg/ml" is displayed from the Flavor detail page
	public static By weTxt0mgperml = By.xpath("(.//*[text()='0mg/ml'])[1]");

	// Quantity Increment button under 12 mg/ml on Add to Cart Modal
	public static By btnIncrement12mgperml = By.xpath(".//*[text()='12mg/ml']/..//div//button[2]");

	// Quantity Increment button under 30 mg/ml on Add to Cart Modal
	public static By btnIncrement30mgperml = By.xpath(".//*[text()='30mg/ml']/..//div//button[2]");

	// Quantity Increment button under 0 mg/ml on Add to Cart Modal
	public static By btnIncrement0mgperml = By.xpath(".//*[text()='0mg/ml']/..//div//button[2]");



	public static By btnstrength=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	// Quantity Increment button under 1.6% on Add to Cart Modal
	public static By btnIncrement1point6percent = By.xpath(".//*[text()='1.6%']/..//div//button[2]");
	// "(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[28]");
	// ".//*[text()='1.6%']/..//div//button[2]");

	// Quantity Increment button under 3% on Add to Cart Modal
	public static By btnIncrement3percent = By.xpath(".//*[text()='3%']/..//div//button[2]");
	// "(.//*[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[4]");
	// "(.//*[@class='QuantityPicker__Button-v6i9u9-1 iTjDwZ'])[6]");
	// ".//*[text()='3%']/..//div//button[2]");

	// Quantity Increment button under 5% on Add to Cart Modal
	public static By btnIncrement5percent = By.xpath(".//*[text()='5%']/..//div//button[2]");

	// Quantity Increment button under 1.6% on Add to Cart Modal
	public static By btn1point6percent = By.xpath(".//*[text()='1.6%']/..//div//button[2]");
	// "(//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[7]");

	// Text "Total" is displayed on Add to Cart Modal
	public static By weTxtTotal = By.xpath("(.//*[text()='Total'])[1]");

	// Text "$N" is displayed from the Flavor detail page
	public static By weTxtTotalValueN(String num) {

		return By.xpath("(.//h3[text()='$" + num + "'])[1]");

	}

	// Text "$N" is displayed from the Flavor detail page
	public static By weTxtTotalValueN1(String num) {

		return By.xpath("(.//*[text()='$" + num + "'])[4]");

	}

	// Subscribe &Save in strawberry flavour page
	public static By pgeSubscribeAndSave = By.xpath("//*[text()='Subscribe & save']");

	public static By btnSubscribeAndSave = By.xpath("(.//*[text()='Subscribe & save'])[1]");

	// Quality
	public static By txtQuantity = By.xpath("(.//*[text()='Quantity'])");

	// Pack
	public static By txtPack = By.xpath("(.//*[contains(text(),'Pack')])[1]");

	// Subscribe &save
	public static By lnkSubscribeAndSave = By.xpath(".//*[text()='Subscribe & Save']");

	// "(.//*[text()='Subscribe & Save'])[2]");

	// One Time purchase.
	public static By lnkOneTimePurchase = By.xpath("(.//*[text() = 'One time purchase'])");
	// "(.//*[text() = 'One time purchase'])");

	// ePod Charger page
	public static By txtePodAccessories = By.xpath("//*[text()='Charging Cable']");

	// pop up choose your skin
	public static By wetxtChooseSkin = By.xpath("//*[text()='Choose your skin']");

	// Text Engravable ePod
	public static By wetxtEngravableePod = By.xpath("//*[text()='Engraved']");

	// Engraved device add button
	public static By btnEngravedAdd = By
			.xpath("//h4[text()='Engraved device']/../following-sibling::div//*[contains(text(),'Add')]");

	// Customize the front
	public static By txtCustomizeFront = By.xpath("//*[contains(text(),'Customize the Front')]");

	// Pattern button
	public static By btnPattern = By.xpath("//*[(text()='Pattern')]");

	// Solstice
	public static By btnSolstice(String pattern) {

		return By.xpath("//*[contains(text(),'" + pattern + "')]");
	}

	// pattern
	public static By btpattern(String patternName) {

		return By.xpath("//*[contains(text(),'" + patternName + "')]");
	}
	public static By txtSubscriptionUpdated =By.xpath("(.//*[text()='Your subscription is successfully updated!'])");

	// Add pattern button
	public static By btnAddPattern = By.xpath("//*[text()='Add Pattern']");

	// Now customize the back page
	public static By txtCustomizeBack = By.xpath("//*[contains(text(),'Now customize the Back')]");

	// Text Button
	public static By btnText = By.xpath("//*[text()='Text']");

	// Select Vertical
	public static By btnVertical(String TextDirection) {

		return By.xpath("//*[contains(text(),'" + TextDirection + "')]");
	}

	// Select Font style
	public static By btnFontStyle(String FontStyle) {

		return By.xpath("//span[contains(text(),'" + FontStyle + "')]");
	}

	// Enter your text
	public static By txtEnterText = By.xpath("//*[@placeholder='Abc']");

	// Add text button
	public static By btnAddText = By.xpath("//*[text()='Add Text']");

	// Make it Yours age
	public static By txtMakeItYours = By.xpath("//*[contains(text(),'Make it yours')]");

	// Tell us your first name field
	public static By txtFirstName = By.name("text");

	// Add your name button
	public static By btnAddName = By.xpath("//*[text()='Add your name']");

	// Engraving summary page
	public static By txtEngravingSummary = By.xpath("//*[text()='Engraving Summary']");

	// Items Details
	public static By btnAddEngraving = By.xpath("//*[text()='Add to cart']");
	// + "//*[text()='Add engraving']");

	// Solstice skin colour
	// public static By btnSolsticeColor(String flavour,String flavourName) {
	// return
	// By.xpath("//*[contains(text(),'"+flavour+"')]/following-sibling::div//div//div[@data-tip='"+flavourName+"']");
	// }

	//

	// skin
	public static By skintype(String skin) {
		return By.xpath("(//a[contains(@href,'/buy-online/vype-epod-2-plus-skins/" + skin + "')])");
	}

	//

	// Skin colour price
	public static By txtSkinColorPrice = By
			.xpath("//*[text()='Choose your skin']/../following-sibling::footer//div//h3[contains(text(),'$')]");

	// Passionfruit field add button
	public static By btnPassionFruitAdd(String flavour) {
		return By.xpath("(//h4[text()='" + flavour + "']/../following-sibling::div//button)[1]");
	}

	// Lychee Orchard footer
	public static By wetxtlycheeOrchard = By
			.xpath("(.//*[text()='Nicotine strength'])[1]/../../following-sibling::footer");

	// Vype ePod page
	public static By wetxtVypeePod = By.xpath("(//*[text()='ePod'])[3]");// *[text()='Vype ePod'])[2]

	// Choose the colour
	public static By btnColour(String clr) {

		return By.xpath("(//*[@data-tip='" + clr + "'])");
	}

	// verify device colour
	public static By weDeviceColour(String color) {
		return By.xpath("//*[contains(@src,'images/products/epod/background/" + color + ".jpg')]");
	}

	// I am Fine button
	public static By btnIAmFine = By.xpath("//*[text()='Yes please']/following-sibling::button");

	// Flavours xpath
	public static By btnFlavour = By
			.xpath("(//*[text()='Yes please']/following-sibling::button/following-sibling::div//div)[1]");

	// ePod Skin add button
	public static By btnAdd = By
			.xpath("//h4[contains(text(),'ePod skins')]/../following-sibling::div//button[contains(text(),'Add')]");

	// Add button
	public static By btnSkinColorAdd = By.xpath("//*[text()='Choose your skin']/../following-sibling::footer//button");

	// USB charging cable +button
	public static By btnPlusUSBCable = By
			.xpath("(//*[contains(text(),'Charging Cable')])[1]/../following-sibling::div//button[2]");

	// Total Amount
	public static By txtAmount = By.xpath("//*[contains(text(),'Add items & go to cart')]/../preceding-sibling::h3");

	// Flavor selection container
	public static By weFlavorSelectionContainer = By.xpath("(.//*[contains(@class,'Cartridge')])[1]");

	// Text Choose Your Colour
	public static By weTxtChooseYourColour = By.xpath(".//span[contains(text(),'colour')]");

	// Yes lPlease buttom
	public static By btnYesPlease = By.xpath("//*[text()='Yes please']");

	// Button 'Add' on the modal
	public static By btnAdd1 = By.xpath("(.//*[text()='Add'])[1]");// another xpath: (.//*[text()='Nicotine
	// strength'])[1]/../../following-sibling::footer//button

	// Choose order type
	public static By txtChooseOrderType = By
			.xpath("//*[contains(text(),'Choose order type')]/../following-sibling::div[1]//div");

	// button subscribe and save
	public static By btnSubscribeSave = By.xpath(
			"//*[contains(text(),'Choose order type')]/../following-sibling::div[1]//div//span[contains(text(),'Subscribe & save')]");

	// Subscribe and save button after adding nicotine strength
	public static By btnSave = By.xpath("//*[contains(text(),'You can cancel')]/..//div//button//span");

	// Mini Cart is updated
	public static By txtnumber = By.xpath("(//*[contains(@href,'/ca/en/cart')])[1]//div//div");

	// Home Page VUSE xpath
	public static By txtVuse = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']");

	// Continue shopping link in your cart page
	public static By lnkContinueShopping = By.xpath("//*[contains(text(),'Not ready to checkout')]//a");

	// Add 2 more packs
	public static By txtAddmorepacks = By.xpath("//*[contains(text(),'more packs of any flavour')]");

	// "Shipping is free" for the Subscription orders
	public static By txtShiping = By.xpath(
			"//*[contains(text(),'Subscription')]/../following-sibling::div//*[text()='Shipping']/following-sibling::strong"); // *[contains(text(),'Subscription')])[5]/../following-sibling::div//*[text()='Shipping']/following-sibling::strong

	// Link FAQs in footer section pre-login
	public static By lnkFAQs = By.xpath("//*[text()='FAQs']");
	// "(.//a[contains(@href,'/faq')])[1]");

	// Text on Age Certify Page
	//public static By weAgeCertify = By.xpath("(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "//*[contains(text(),'select your province of residence and confirm')]");
	// Province Drop down
	public static By weDropDownProvince = By.xpath("(.//*[@name='province'])[2]");
	// "(.//*[@name='province'])[2]");
	// "//*[@class='Dropdown__Wrap-sc-14jhbrp-1 gukAhf']//*[@name='province']");
	// I am 18/19 or over button
	//public static By btnIam19orOver = By.xpath("(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");

	// I am not 18 button
	public static By btnIamNot18 = By.xpath(".//button//span[contains(text(),'I am not')]");

	public static By btnIam18 = By.xpath(".//button[@type='submit']");
	// Under 18 Error message
	public static By txtErrorMustBeAtLeast18 = By.xpath(".//div[@type='error']//p");

	// hey gold member you are almost platinum status xpath
	public static By txtYouAreAlmost = By.xpath("//*[contains(text(),'you are almost')]/..");

	// See How you will benefit

	public static By txtSeeHowYouWillBenefit = By.xpath("(//*[contains(text(),'See how you will benefit')])[2]");



	// Expand See how you will benefit
	public static By lnkSeeHowYouWillBenefit = By
			.xpath("(//*[contains(text(),'See how you will benefit')])[2]/following-sibling::div");

	// Close button on expended menu
	public static By btnClose = By.xpath(
			"(//*[contains(text(),'See how you will benefit')])[2]/following-sibling::div//strong/following-sibling::button");

	// Order Summary
	public static By txtOrderSummary = By.xpath("//*[text()='Order Summary']");

	// Question mark xpath in shipping page
	public static By weQuestionMark = By.xpath("//*[text()='(?)']");

	// ######################################## ePen Pods Home Page xpath
	// ####################################################
	// One time button
	public static By btnOneTime = By.xpath("//*[contains(text(),'One time purchase')]");

	// Nicotine strength
	public static By btnNicotine(String num) {
		return By.xpath("(//*[contains(text(),'" + num + "mg/ml')])[1]");
	}

	// Plus button under nicotine strength
	public static By btnforFlavourPlus(String Flavour) {
		return By.xpath("(//*[contains(text(),'" + Flavour
				+ "')]/../following-sibling::div[2]//div[2]//div//div//button[2])[1]");
	}

	// Add button under nicotine strength
	public static By btnAddePenPodsHomePage = By.xpath("(//*[text()='Add'])[1]");

	// Quantity added after pressing + button
	public static By txtQuantityAdded(String Flavour, String num) {
		return By.xpath("//*[contains(text(),'" + Flavour
				+ "')]/../following-sibling::div[2]//div[2]//div//span[text()='" + num + "']/..//div//span");
	}

	// ##################################### Epod Pods Home page xpath
	// ##########################################################

	// Mix and MAtch 3pack bundle
	public static By txtMixAndMatch3Pack = By.xpath("//*[contains(text(),'Select 2 packs of your choice')]");

	// See details link
	public static By txtSeeDetails = By.xpath("(//*[text()='See details'])[2]");// (.//*[text()='Add'])[2]
	public static By btnAddproduct = By.xpath("(//h1[contains(@class,'Card__Title')]/..//*[text()='Mango'])/../div[1]/a");
	// "(//*[text()='Passionfruit'])[1]");
	public static By btnAddproductPeach = By.xpath("(//*[text()='Lychee'])[1]");
	// Subscribe button
	public static By btnSubscribe = By.xpath("//*[text()='Subscribe & save']");

	// Nicotine strength
	public static By btnPercentNicotine(String num) {
		return By.xpath("(//*[text()='" + num + "%'])[1]");
	}

	// ################################### Vuse Pods page xpath
	// ##############################################################
	// Vuse Pods text
	public static By txtVusePods = By.xpath("//h1[contains(text(),'Vuse Pods')]");

	// Whats your device
	public static By txtWhatsYourDevice = By.xpath("//*[contains(text(),'your device?')]");

	// ePod button xpath
	public static By btnePod = By.xpath("//*[contains(text(),'ePOD')]");

	// ePen button xpath
	public static By btnePen = By.xpath("//*[contains(text(),'ePEN')]");

	// ePod Flavours details xpath
	public static By weePodFlavoursDetails = By.xpath(
			"//*[contains(@href,'ca/en/buy-online/vype-epod-vpro-cartridges')]/../../*[contains(@class,'CartridgeThumbnail__Container')]");

	// ePod Flavours xpath
	public static By weePodFlavours = By
			.xpath("//*[contains(@href,'ca/en/buy-online/vype-epod-vpro-cartridges')]/../div");

	// - and + button
	public static By btnIncrementDecrement = By
			.xpath("//*[contains(@href,'ca/en/buy-online/vype-epod-vpro-cartridges')]/../div//footer//div");

	// Add quantity button
	public static By btnAddQuantity = By.xpath("(//*[text()='5%'])[1]/../../..//footer//div//button[2]");

	// Quantity added after pressing + button
	public static By txtforVuseePodQuantityAdded = By
			.xpath("(//*[contains(text(),'Choose nicotine strength')])[9]/../following-sibling::footer//div//span");

	// Add button under nicotine strength
	public static By btnAddVusePodsHomePage = By.xpath("(//*[text()='Add'])[9]");

	// ePen Flavours xpath
	public static By weePenFlavours = By.xpath("//*[contains(@href,'ca/en/buy-online/vype-epen-3-cartridges-vpro')]");

	// ePen Flavours details xpath
	public static By weePenFlavoursDetails = By.xpath(
			"//*[contains(@href,'ca/en/buy-online/vype-epen-3-cartridges-vpro')]/../../*[contains(@class,'CartridgeThumbnail__Container')]");

	// - and + button
	public static By btnIncrementDecrementforePen = By
			.xpath("//*[contains(@href,'ca/en/buy-online/vype-epen-3-cartridges-vpro')]/../div//footer//div");

	// Add more products in subscription page for active subscription
	public static By txtAddMoreProd = By.xpath("//*[contains(text(),'Add more products')]");

	// View product in Add more products pop up in subscription page for active
	// subscription
	public static By txtViewProducts = By.xpath("//*[contains(text(),'View products')]");

	// Browse cartridges link in subscription page
	public static By lnkBrowseCartridges = By.xpath("//*[contains(text(),'Browse cartridges')]");

	// ############################################ Ontario Landing Page xpath
	// ###############################################

	// Ontario,we got you covered
	public static By txtOntarioWegot = By.xpath(".//*[text()='We got you covered']");
	// "//*[contains(text(),'got you covered')]/..");

	// Discover Now button
	public static By btnDiscoverNow = By.xpath("//*[contains(text(),'Discover now')]");

	// Find it all on Vuse.com
	public static By txtFindItAll = By.xpath("//*[contains(text(),'Find it all on')]");

	// Find it all on Vuse.com contains 3 section
	public static By txtFlavoursFindItAllContents = By.xpath("//*[contains(text(),'All the flavours and nicotine')]");
	public static By txtSavingsFindItAll = By.xpath("//*[contains(text(),'Savings with our bundle')]");
	public static By txtShippingFindItAll = By.xpath("//*[contains(text(),'Free shipping in Ontario*')]");

	// Flavour Categories
	public static By txtFlavourCategories = By.xpath("//*[contains(text(),'Flavour Categories')]");

	// Landing page Berry
	public static By txtBerryflavwithDetails = By.xpath("(//*[text()='Berry'])[2]/..");

	// Left side flavours
	public static By txtLeftFlavours = By.xpath("(//*[text()='Berry'])[1]/../..//button");

	// Shop now after all flavours
	public static By btnShopNow = By.xpath("//span[text()='Shop now']");

	// Savings on vuse.com
	public static By txtSavingsOn = By.xpath("//*[contains(text(),'Savings on')]");

	// Savings on vuse.com contents
	public static By txtSavingsOnContents = By.xpath(
			"//a[contains(@href,'buy-online/epod-starter-bundle')]/../../..//div[contains(@class,'GridItem__Container')]");

	// Delivery is easy
	public static By txtDeliveryIsEasy = By.xpath("//*[contains(text(),'DELIVERY IS EASY')]/..");

	// Same day delivery
	public static By txtSameDayDelivery = By.xpath("//*[contains(text(),'Same day')]/..");

	// Standard Shipping
	public static By txtStandardShipping = By.xpath("//*[contains(text(),'Standard')]/..");

	// Post Office Pick up
	public static By txtPostOfficPickup = By.xpath("//*[contains(text(),'Post office')]/..");

	// Coming soon
	public static By txtCommingSoon = By.xpath("//*[contains(text(),'Coming soon')]/../..");

	// Ontario Rules and regulations
	public static By txtRulesAndRegulations = By.xpath("//*[contains(text(),'IF YOU HAVE QUESTIONS ABOUT')]/../..");

	// Right arrow
	public static By btnRightArrow = By.xpath("//button[@data-role='none']");

	// different flavours in ontario landing page
	public static By txtDiffFlavours(String flavour) {
		return By.xpath("(//*[text()='" + flavour + "'])[2]/..");
	}

	// Peach flavour
	public static By txtPeach(String flavour) {
		return By.xpath("//*[text()='" + flavour + "']/..");
	}

	// ####################################################### delivery
	// page###############################################

	// Subtotal value in delivery page
	public static By txtSubtotal = By.xpath("(//*[text()='Subtotal'])[2]/following-sibling::strong");

	// Address in profile page
	public static By txtProfileAddress = By.xpath("//*[text()='Address']/following-sibling::p");

	// HST value in delivery page
	public static By txtHSTValue = By.xpath("//*[text()='HST']/following-sibling::strong");

	// GST value in delivery page
	public static By txtGSTValue = By.xpath("//*[text()='GST']/following-sibling::strong");

	// PST value in delivery page
	public static By txtPSTValue = By.xpath("//*[text()='PST']/following-sibling::strong");

	// ************** SANDEEPA's
	// XPATH*********************************************************************
	// mini cart
	// public static By weMiniCart =
	// By.xpath("(.//*[@href='/cart']//span[text()='View cart'])[1]");
	public static By weMiniCart = By.xpath("(.//*[@href='/ca/en/cart'])[1]");

	// Verify CANADA POST (EXPRESS) are displayed under the "How should we send your
	// order?
	public static By weTxtCanadaPostExpress = By.xpath("(.//*[text()='Canada Post (Express)'])");

	// Text "How should we send your order? "
	public static By weTxtSendOrder = By.xpath("(.//*[text()='How should we send your one time purchase order?'])");

	// Verify Order Summary Details are displayed on right Side of the page.
	public static By weTxtOrderSummary = By.xpath("(.//*[text()='Show order summary'])");

	// promo code
	public static By txtDiscountCode = By.xpath("(.//*[@name='discountCode'])");

	// Add promo code
	public static By txtAddPromoCode = By.xpath("(.//*[@type='submit'])");

	// Discount prize is deducted
	public static By txtDeductedPrize = By.xpath("(.//*[@class='Total__Line-sc-1axpxsv-4 dKFsVz'])[2]");

	// Logout
	// public static By lnkLogout=By.xpath("(.//*[text()='Logout'])[1]");

	// epenpods page all flavours
	public static By lnkePodPodsFlavour = By.xpath("(.//*[contains(@class,'CartridgeList__Container')])");

	// Verify the text "Discover our Vuse ePod pods offered in 1.6%, 3% and 5%
	// nicotine by weight. Vuse ePod pods are compatible with Vype ePod devices" is
	// displayed
	public static By txtePodPodDescription = By.xpath("(.//*[contains(@class,'CollectionHeader__Description')])");

	// Verify $12.00/pack is displayed

	// Lakshmi

	// Save link
	public static By lnkSave = By.xpath("//*[contains(@class,'Nav__List')]//span[text()='Save']");

	// Programs Link
	//public static By lnkPrograms = By.xpath("(//*[text()='Programs'])[1]");

	// Subscribe and Save link
	public static By lnkSubscribeandsave = By.xpath("(//*[text()='Subscribe & Save (up to 30%)'])[1]");

	// Subscribe and Save page
	public static By pgSubscribeandsave = By.xpath("//*[text()='Subscribe & Save']");

	// Learn more button

	public static By btnLearnMore = By.xpath("(//*[text()='Learn more'])[1]");

	// Start building an order
	public static By btnStartBuildinganOrder = By.xpath("//*[@href='/ca/en/buy-online/vuse-pods/']");

	public static By btnLimitedEditionepodBuynow = By.xpath("(//a[contains(@href,'buy-online/liquid-colour')])[1]");

	public static By pglimitededition = By.xpath("(//*[text()='Liquid Colour Collection'])[2]");
	// "//*[text()='Liquid Colour Collection']");

	public static By txtMango = By.xpath("(.//*[text()='Mango'])[1]");

	public static By txtMangoPDP = By.xpath("//div[contains(text(),'A juicy')]");
	// "(.//*[text()='A rich mango flavour immersed with fruity notes.'])");

	// sign up link
	public static By lnksignup = By.xpath("//*[text()='Sign up']");

	public static By btnmenu = By
			.xpath("//*[@class=\"Nav__Container-sc-9z4o2m-0 eGbTIz\"]//*[@class=\"MobileNav__Toggle-muz2dr-0 wHvKo\"]");

	// Harsha
	// button device colour
	public static By btndevicecolour(String devicecolour) {
		return By.xpath("//*[@data-tip='" + devicecolour + "']/button");

	}
	public static By pgeStoreLocator2=By.xpath(".//*[text()='Find a Vuse Store near you']");

	// pg engraving device
	public static By pgengravingdevice = By.xpath("//*[contains(text(),'Pick device colour')]");
	// skins
	public static By lnkskins = By.xpath("//*[text()='Vuse x U Skins']");

	// pods
	public static By lnkpods = By.xpath("//*[text()='Pods']");
	// skin buynow
	public static By btnbuynow = By.xpath("(//*[@href='/ca/en/buy-online/vype-epod-skins/miscere/'])[2]");

	// buynow
	public static By buynow = By.xpath("//*[text()='Buy now']");

	// Acessories
	public static By lnkAccesories = By.xpath("//*[text()='Device Accessories']");

	// + button
	public static By btnplus = By.xpath("(//*[@class='QuantityPicker__Button-v6i9u9-1 doaQiJ'])[2]");

	// Add button
	public static By addbtn = By.xpath("(//*[text()='Add'])[1]");

	// canada post
	public static By btncanada = By.xpath("//*[text()='Canada Post (Standard)']");

	// Vuse plus
	public static By txtVuseplus = By
			.xpath("//*[@class='Incentive__StyledPlusLogo-sc-1gtskae-6 lptQfH u-hide-medium-down']");

	// Indu
	//**************************************************************************************

	// Skins Page related properties

	// Shop ePod skins link under personalize your epod
	public static By lnkePodSkins = By.xpath("//a[text()='Shop Device Skins']");

	// umbra skin image
	public static By imgumbraskin = By.xpath("(.//img[contains(@alt,'Umbra skin design')])[1]");

	// Serpa Skin image
	// public static By imgserpaskin=By.xpath("(.//img[contains(@alt,'Serpa skin
	// design')])[1]");

	// Curo Skin image
	public static By imgcuroskin = By.xpath("(.//img[contains(@alt,'Curo skin design')])[1]");

	// Fabrica skin image
	public static By imgFabricaskin = By.xpath("(.//img[contains(@alt,'Fabrica skin design')])[1]");

	// Buy Now button for umbra skin
	public static By btnBuynowUmbra = By.xpath("(.//*[@href='/ca/en/buy-online/vype-epod-skins/umbra/'])[1]");

	// Buy Now button for Serpa skin
	public static By btnBuynowserpa = By.xpath("(.//*[@href='/ca/en/buy-online/vype-epod-skins/serpa/'])[1]");

	// Right Arrow in Skins page
	public static By weRightArrow = By.xpath("(.//*[contains(@class,'SkinsSlider__ArrowIcon-')])[2]");

	// Left Arrow in Skins page
	public static By weLeftArrow = By.xpath("(.//*[contains(@class,'SkinsSlider__ArrowIcon-')])[1]");

	// .//*[text()='Limited Edition']
	// .//*[text()='Core Collection']
	// .//*[text()='Design challenge']

	// list of the skins displayed in left side of the page
	public static By weleftpage = By.xpath("(.//*[contains(@class,'Nav__Container-sc-')])[2]");

	// Umbra skin image in PDP page
	public static By imgUmbraPDP = By.xpath(".//img[contains(@alt,'Umbra ePod skin')]");

	// Serpa skin image in PDP page
	public static By imgSerpaPDP = By.xpath(".//img[contains(@alt,'Serpa ePod skin')]");

	// Name of the Skin displayed in PDP page
	public static By txtUmbra = By.xpath("(.//*[text()='Umbra'])[2]");

	// Name of the Skin displayed in PDP page
	public static By txtSerpa = By.xpath("(.//*[text()='Serpa'])[2]");

	// Price of the Core Umbra Skin
	public static By txt$value = By.xpath(".//*[text()='$2.49']");

	// By default "1" quantity of the skin is selected
	public static By txt1 = By.xpath(".//span[contains(@class,'QuantityPicker__Value-')]");
	// span[contains(@class,'QuantityPicker__Value-') and contains(text(),'1']

	// Quantity increase button in Skins PDP
	public static By btnQuantityplus = By.xpath("(.//*[contains(@class,'QuantityPicker__Button-')])[2]");

	// Quantity decrease button in Skins PDP
	public static By btnQuantityminus = By.xpath("(.//*[contains(@class,'QuantityPicker__Button-')])[1]");

	// Buy Now button in PDP page
	public static By btnbuynowskinspdp = By.xpath(".//*[text()='Buy now']");

	// *************************************************************************************
	// Search text in Footer link Pages, Contact Us and FAQ
	// public static By
	// txtSearch=By.xpath("//*[text()='Search']");//*[text()='Submit a request']

	// Health Warning Message in Contact us and FAQ page
	public static By txtHWmsg = By.xpath(".//div[contains(@class, 'health-warning')]");

	// Health Warning Message in Conditions of Sale page
	public static By txtHealthwarning = By.xpath(".//div[contains(@class, 'HealthWarning__FigureWrap-')]");

	// Store Locator link
	// public static By lnkStoreLocator =
	// By.xpath(".//*[@href='/ca/en/vape-stores']");

	// StoreLocator Page
	public static By pgeStoreLocator = By.xpath(".//*[text()='Find a Vuse Store near you']");

	// ****************************************************************************************

	// "My Subscription" button from the User Account dropdown (Date 02/04/2021)
	public static By btnMySub = By.xpath("(.//*[text()='My Subscription'])[1]");

	// "Looks like you already have an active Subscription" pop up displayed when
	// clicked on checkout
	public static By txtDraftModal = By.xpath(".//*[text()='Looks like you already have an active Subscription']");

	// "Go to account" button in draft sub modal
	public static By btnGotoAccount = By.xpath(".//*[text()='Go to account']");

	//proceed to checkout
	public static By btnProceedtoCheckout=By.xpath("//*[text()='Proceed to checkout']");

	// text "Draft subscription order" in Subscription tab
	public static By txtDraftsub = By.xpath(".//*[text()='Draft subscription order ']");

	//draft one time and subscription
	public static By txtotpsubscription=By.xpath("//*[contains(@class,'SubscriptionModal__Lis')]");

	// Discard link in Subscription tab
	public static By lnkDiscard = By.xpath(".//*[text()='Discard']");

	// Submit update button in Subscription tab
	public static By btnSubmitUpdate = By.xpath("(.//*[text()='Submit update'])[2]");

	// Continue Modification button in Subscription tab
	public static By btnContinueModification = By.xpath("(.//*[text()='Continue modification'])[2]");

	// "New" tab for the newly added item
	public static By txtNew = By.xpath(".//*[text()='New']");

	// Subscription update message
	public static By txtSubUpdate = By.xpath(
			".//*[text()='Your subscription is successfully updated! Please give an hour for the confirmation to reach you.']");

	// *****************************************************************************************
	// Discard Subscription Modal text 1 (Date 02/08/2021)
	public static By txt1InDiscardSubModal = By.xpath(".//*[text()='Discard Draft Subscription Order']");

	// Discard Subscription Modal text 2
	public static By txt2InDiscardSubModal = By
			.xpath(".//*[text()='Are you sure you want to discard this draft order? This action cannot be undone.']");

	// Button "Yes Discard" in Discard Sub Modal
	public static By btnYesDiscard = By.xpath(".//*[text()='Yes, discard']");

	public static By txtdiscardpopup=By.xpath("//*[contains(text(),'Discard Dra')]");

	// Button "No, return" in Discard Sub Modal
	public static By btnNoReturn = By.xpath(".//*[text()='No, return']");

	// ******************************************************************************************
	// Draft Order text After clicking on "Continue Modification" button in
	// Subscription tab (Date 02/09/2021)
	public static By txtDraftOrder = By.xpath(".//*[text()='Draft Order']");

	// Back link in draft order page
	public static By lnkBack = By.xpath("//a[contains(text(),'Back')]");

	// Order Summary section in draft order page
	public static By txtDraftOrderSummary = By.xpath(".//*[text()='Order Summary']");

	// Filter by option in Draft order page
	public static By txtFilterby = By.xpath("(.//*[text()='Filter by'])[1]");

	// list of Pods filter
	public static By wePodsFilterlist = By.xpath(".//*[contains(@class,'PodsFilter__Menu-')]");

	// Zero Nicotine option from the list
	public static By txtZeroNicotine = By.xpath("(.//*[text()='Zero Nicotine Options'])[1]");

	// remove button for the flavour in order summary section
	public static By btnRemove = By.xpath("(.//*[text()='remove'])");

	// Polar Mint flavour
	public static By txtPolarMint = By.xpath(".//*[text()='Polar Mint']");

	// Add button for polar mint
	public static By btnAddPolarMint = By.xpath("(.//*[text()='Add - $13'])[2]");

	// Pack quantity text in Polar Mint modal
	public static By txtPackQuantity = By.xpath(".//*[text()='Pack quantity']");

	// Quantity Increment button under 0% on Add Modal
	public static By btnIncrement0percent = By.xpath(".//*[text()='0%']/..//div//button[2]");

	// Add button in modal
	public static By btnADD = By.xpath(".//*[text()='Add']");

	// Submit updates button in draft order page
	public static By btnSubmitupdates = By.xpath(".//*[text()='Submit updates']");

	// *********************************************************************************

	// Looks like you already have an active subscription modal
	public static By txtinSubscriptionModal = By.xpath(".//*[contains(@class,'Modal__Section-sc-')]");

	// ********************************************************************************************

	// Experience vuseXu link under Personalize your epod section
	public static By lnkExperiencevuseXu = By.xpath("(.//a[contains(@href,'/ca/en/vusebyu/')])[1]");

	// Video in Personalize your epod->Experience vuseXu page
	public static By weVideoinvuseXu = By.xpath(".//*[@class='video-element-desktop']");

	// Engrave your ePod link under Personalize your epod section
	public static By lnkEngraveyourePod = By.xpath("//*[text()='Engrave your Devices']");

	// Text in Engrave your ePod page
	public static By txtinEngraveyourePod = By.xpath("//*[@id='hero']");

	// Ring link under Personalize your epod section
	public static By lnkRing = By.xpath(".//a[contains(@href,'/ca/en/buy-online/epod-ring/')]");

	public static final By txtEngraving = By.xpath("//*[text()='Engraving']");

	public static By txtengraveurepod=By.xpath("//*[contains(text(),'Engrave ')]");

	// Text in Ring page
	public static By txtinRing = By.xpath("(.//*[text()='ePod Ring'])[2]");

	// Save link
	// public static By
	// lnkSave=By.xpath("(.//*[@data-tracking='nav--link--text--Save'])[1]");

	// 'Liquid Colour Devices' link under New launches
	public static By lnkLiquidColourDevices = By.xpath(".//*[text()='Liquid Colour Devices']");

	// Text in Liquid Colour Devices page
	public static By txtinLiquidColourDevices = By.xpath("(.//*[text()='Liquid Colour Collection'])[2]");

	// Link Skins under New Launches
	public static By lnkSkins = By.xpath(".//*[text()='Skins']");

	// Pineapple Melon ePod Pods link under New launches
	public static By lnkPineappleMelon = By.xpath(".//*[text()='Pineapple Melon ePod Pods']");

	// Pod Caps link under New launches
	public static By lnkPodCaps = By.xpath(".//*[text()='Pod Caps']");

	// Text in Pod Caps Page
	public static By txtinPodCaps = By.xpath(".//*[text()='Pod Caps']");

	// Mango ePod Pod link under New launches
	public static By lnkePods2 = By.xpath("(//*[text()='ePod 2'])[2]");

	// Text in Mango ePod Pod Page
	public static By txtinMangoePod = By.xpath("(.//*[text()='Mango'])[2]");

	// text in 'Pineapple Melon' page
	public static By txtinPineappleMelon = By.xpath(".//*[text()='Pineapple Melon']");

	// Link Starter Bundle under Save -> Offer Section
	public static By lnkStarterBundle = By.xpath(".//*[text()='Starter Bundle for $19.99']");

	// 3 for $33 ePod Pods link in Save -> Offers section
	public static By lnk3For33 = By.xpath(".//*[text()='3 for $32 Pods']");

	// 5 for $50 ePod Pods link in Save -> Offers section
	public static By lnk5For50 = By.xpath(".//*[text()='5 for $52 Pods']");

	// Mix and Match 5 pack page
	public static By txtin5For50 = By.xpath("//h1[contains(text(),'Mix & Match: 5 Pack Bundle')]");

	// Subscribe & Save (up to 30%) link in Save -> Offers section
	public static By lnkSubscribeSave = By.xpath("//*[contains(text(),'Subscribe ')]");

	// Pass On The Savings (up to $200) link in Save -> Offers section
	public static By lnkPassOnTheSavings = By.xpath(".//*[text()='Pass On The Savings (up to $200)']");

	// Vuse+ Rewards link in Save -> Offers section
	public static By lnkVuseRewards = By.xpath(".//*[text()='Vuse Rewards']");

	// Text in Pass on the savings page
	public static By txtPassOntheSavings = By.xpath("(.//*[contains(text(),'Pass on ')])[2]");

	// Text in Vuse+ Rewards page
	public static By txtinVuseRewards = By.xpath(".//*[text()='Get your perks']");

	// Help link from the header navigation
	public static By lnkHelp = By.xpath("(.//*[@data-tracking='nav--link--text--Help'])[1]");

	// Shipping & Delivery link in Help section
	public static By lnkShippingndDelivery = By.xpath("(.//*[text()='Shipping & Delivery'])[1]");

	// text in Shipping & Delivery Page
	public static By txtinShippingndDelivery = By.xpath(".//*[text()='Get the Vuse products you want with our range of quick and convenient shipping options.']");

	// Contact Us link in Help section
	public static By lnkContactUS = By.xpath("(.//*[text()='Contact Us'])[2]");

	// FAQs link in Help section
	public static By lnkFAQ = By.xpath(".//*[text()='FAQ']");

	// Store Locator link in Help section
	public static By lnkStorelocator = By.xpath("(.//*[text()='Store Locator'])[1]");

	// ****************************************************************************************

	// Starter bundle related Xpaths

	// Starter bundle customize page
	public static By txtYourcolours = By.xpath(".//*[text()='Your Colour. ']");
	// Starter bundle
	public static By btnStarterBundleBuyNow = By.xpath("(//a[contains(@href,'buy-online/epod-starter-bundle')])[1]");

	// start customizing
	public static By btnstartcustomising = By.xpath("//*[text()='Start customizing']");

	// Choose colour
	public static By btnchoosecolour = By.xpath("//*[text()='Choose this colour']");

	// choose flavour
	//public static By btnchooseflavour = By.xpath("//*[text()='Choose this flavour']");

	// Proceed to checkout button
	public static By btnproceed = By.xpath(".//*[text()='Proceed to checkout']");

	// Discount code "EPOD STARTER BUNDLE" in your cart page
	public static By weDiscountcode = By.xpath("(.//*[text()='EPOD STARTER BUNDLE'])[2]");

	// remove button in cart page
	public static By btnremove = By.xpath("(.//*[contains(@class,'Product__Remove-')])[1]");

	// PassionFriut flavour
	public static By txtPassionFruit = By.xpath("(.//*[text()='Passionfruit'])[1]");

	// PassionFriut PDP page
	public static By txtPassionFruitPDP = By.xpath("(.//*[text()='Tropical passionfruit with almond notes.'])");

	// PassionFriut line item in cart page
	public static By txtPassionFruitcart = By.xpath("(.//*[contains(@class,'Product__Container-')])[5]");

	// $9.00 discount value in cart page for starter bundle kit
	public static By weDiscountvalue = By.xpath(".//*[text()='9.00']");

	// **************************************************************************************

	public static By imgVuseLogo = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']");

	public static By txtCalla = By.xpath("(//*[text()='Calla'])[2]");

	public static By imgArrow = By.xpath("(//*[contains(@class,'SkinsSlider__ArrowCircle')])[2]");

	public static By btnBuyNow = By.xpath("(//*[text()='Calla'])[2]/../../following-sibling::div//a");

	public static By txtCimento = By.xpath("(//*[text()='Cemento'])[2]");
	//+ "(//*[text()='Cimento'])[2]");

	public static By txtTweed = By.xpath("(//*[text()='Tweed'])[3]");

	public static By txtClavo = By.xpath("(//*[text()='Clavo'])[3]");

	public static By txtCiel = By.xpath("(//*[text()='Ciel'])[3]");

	public static By txtVerde = By.xpath("(//*[text()='Verde'])[3]");

	public static By btnTweedBuyNow = By.xpath("(//*[text()='Tweed'])[3]/../../following-sibling::div//a");

	// ***Harsha*****
	// Vuse Logo
	public static By btnVuseLogo = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']");

	// Header
	public static By txtHeader = By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/..");

	// dropdown
	public static By dropdownprovince = By.xpath("(//select[@name='province'])[1]");

	public static By txtepodexp = By.xpath("//*[text()='REDESIGNED TO POWER YOUR ePod EXPERIENCE']/../..");

	public static By products = By.xpath("//*[contains(@class,'Products__List')]");

	public static By imgdevice = By.xpath("//*[@alt='epod2 devices']");

	public static By txtchooseepod2 = By.xpath("//*[text()='WHY CHOOSE']/..");

	
	// + "//*[text()='Device']/..");

	public static By lnkpersonaliseyourepod = By.xpath("//*[text()='Experience VUSE x U']/..");

	public static By lnkNewlaunches = By.xpath("//*[text()='Pod Caps']/..");

	public static By lnkepodskins = By.xpath("//*[text()='Skins']");

	public static By btnleftarrow = By.xpath("(//*[contains(@class,'SkinsSlider__ArrowCircle')])[1]");

	public static By btnrightarrow = By.xpath("(//*[contains(@class,'SkinsSlider__ArrowCircle')])[2]");

	// public static By txtcalla=By.xpath("(//*[@alt='Calla skin
	// design'])[3]/../..");
	// + "(//*[@alt='Calla skin design'])[3]");

	public static By pgskins = By.xpath("(//*[contains(@class,'SkinsSlider__ArrowCircle')])[1]/../..");

	//public static By lnksaveall = By.xpath("//*[text()='Starter Bundle for $14.99']/../../../..");
	// + "//*[text()='Starter Bundle for $14.99']/..");

	public static By lnksaveall1 = By.xpath("//*[text()='Subscribe & Save (up to 30%)']/..");

	public static By lnkAbout = By.xpath("//*[@data-tracking='nav--link--text--About']");

	public static By Aboutall = By.xpath("(//*[text()='About']/../following-sibling::div//div)[3]");
	// + "//*[text()='The Vuse Store']/..");

	// public static By
	// lnkHelp=By.xpath("//*[@data-tracking='nav--link--text--Help']");

	public static By helpall = By.xpath("//*[text()='FAQ']/../../..");
	// + "//*[text()='FAQ']/..");

	// public static By btnBuyNow =
	// By.xpath("(//*[text()='Calla'])[3]/../../following-sibling::div//a");

	public static By podSkin(String Skin) {
		return By.xpath("//*[@href='/ca/en/buy-online/vype-epod-skins/" + Skin + "/']");

	}

	public static By imgpodSkin(String Skin) {
		return By.xpath("//*[@alt='" + Skin + " ePod2 skin']");

	}

	public static By txtskin = By.xpath("//*[text()='Choose your quantities']/../../header/h1");

	public static By txtprice = By.xpath("//*[text()='Choose your quantities']/../../header/h3");

	public static By btnminus = By.xpath("//*[text()='Choose your quantities']/../div/button[1]");

	// skins page
	public static By btnPlus = By.xpath("//*[text()='Choose your quantities']/../div/button[2]");

	public static By txtcorecollection = By.xpath("//*[text()='OUR CORE ']");
	// buy now in skins page
	public static By btnBuynow = By.xpath("//*[text()='Buy now']/..");

	public static By pgcart = By.xpath("//*[text()='Product']/../../../..");

	public static final By txtAbout = By.xpath("//span[text()='About']");

	public static final By txtVuseNews = By.xpath("//*[text()='Vuse News']");

	public static final By txtOnlineExclusive = By.xpath("//*[text()='Online Exclusive Benefits']");

	public static final By weVuseCom = By.xpath("//span[text()='Vuse.com']");

	public static final By txtTheVuseStore = By.xpath("//*[text()='Vuse Store']");

	// public static final By txtWelcome = By.xpath("//*[text()='Welcome ']");

	public static By lnkonepoint6 = By.xpath("//*[text()='Pods - 0% and 1.6% Nicotine']");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits']/../..//div//div//div)[1]");

	public static By lnkthreeandfive = By.xpath("//*[text()='Pods - 3% and 5% Nicotine']");
	public static By lnkEpod2 = By.xpath(".//a[contains(@href,'/ca/en/vuse-epod-2')]");
	public static By lnkEpodpod = By.xpath(".//a[contains(@href,'/ca/en/buy-online/vype-epod-vpro-cartridges')]");
	public static By lnkvusebyu = By.xpath(".//a[contains(@href,'/ca/en/vusebyu')]");
	public static By lnkvuserewards = By.xpath(".//a[contains(@href,'/ca/en/vuse-rewards-loyalty-program/')]");
	//".//a[contains(@href,'/ca/en/vuse-plus-vape-deals')]");
	public static By lnksubscribe = By.xpath(".//a[contains(@href,'/ca/en/subscribe')]");
	public static By lnkmix = By.xpath("(.//a[contains(@href,'/ca/en/buy-online/vype-epod-vpro-cartridges')])[2]");
	//".//a[contains(@href,'/ca/en/buy-online/vype-epod-vpro-cartridges')]");
	public static By lnkpasson = By.xpath(".//a[contains(@href,'/ca/en/pass-on-the-savings')]");
	public static By lnksameday = By.xpath("//*[contains(@class,'Shipping__StepHeading')][1]");
	public static By lnkshipping = By.xpath(".//*[contains(text(),'Quick & convenient shipping options')]");	
	public static By lnkexpress = By.xpath(".//*[contains(text(),'Express')]");
	public static By lnkclick = By.xpath(".//*[contains(text(),'Click &')]");
	public static By lnkvapeexperience = By.xpath(".//*[contains(text(),'Take your Vape experience beyond')]");
	public static By lnkvapeproducts = By.xpath(".//*[contains(text(),'The vape products you want, when you want them')]");


	//-------------------------------------------------------------------------------------------------//

	/* Added by Vinod on Sep 12, 2021 for BDD Script Development */

	public static By webAllFlavorsePodPage(String flavor) {
		// return
		// By.xpath("//div[contains(@class,'CartridgeThumbnail')]/Strong[text()='"+flavor+"']");
		return By.xpath("(.//*[text()='"+flavor+"'])");

	}

	public static By toggleSubscribeePodPage(String flavor) {
		return By.xpath("//div[contains(@class,'ProductCard')]/Strong[text()='" + flavor
				+ "']/following::div[contains(@class,'Toggle__Indicator')][1]");
	}
	public static By btnqtyincrement(String flavor) {
		return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[3]/div/div[2]/div/button[2]");
	}
	public static By btnqtydecrement(String flavor) {
		return By.xpath(
				"//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[3]/div/div[2]/div/button[1]");
	}
	public static By btnadd(String flavor) {
		return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//*[contains(text(),'ADD')]");
	}
	public static By btnaddtoSubscription(String flavor) {
		return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//*[contains(text(),'Add as Subscription')]");
	}


	public static By lnkEpodPods = By.xpath(".//*[contains(@data-tracking,'Pods') ]");

	public static By btnAdd(String flavor) {
		return By.xpath(".//*[text()='" + flavor + "']/..//*[text()='ADD - $69.95']");
	}

	// Golden Tobbacco flavour
	public static By txtGoldenTobacco = By.xpath(".//*[contains(text(),'Golden Tobacco')]");

	public static By txtflavor(String flavor) {
		return By.xpath("//*[contains(text(),'" + flavor + "')]/../../main/button");
	}

	// Flavor in Order summary section
	public static By txtflavorInOrderSummary(String flavor) {
		return By.xpath("//*[text()='Order Summary']/following::span[contains(text(),'" + flavor + "')][1]");
	}

	// delete card
	public static By deletecard = By.xpath("//*[contains(text(),'+ Add ')]/../../div/div/button");

	// delete
	public static By txtdelete = By.xpath("//span[contains(text(),'Yes, delete')]");

	// Tobacco & Mints list option in Filterby dropdown
	public static By txtTobaccoMints = By.xpath("(//*[text()='Mints'])[1]");

	// Quantity Increment button on Add Modal
	public static By btnQtyIncrement = By.xpath("//*[contains(@class,'QuantityPicker__Button')][2]");

	// ePod Pods all flavours xpath. example: use "lemon-berry" in place of flavour
	// colour
	public static By lnkAllFlavoursePodPodsPage(String flavor) {
		return By.xpath("(//h1[contains(@class,'Card__Title') and text()='"+flavor+"'])/../div[1]/a");
	}

	// Close modal login page
	public static By btnCloselogin = By.xpath("(//button[contains(@class,'CloseButton__Button')])[1]");

	// Login Modal page
	public static By pgloginModal = By.xpath("(//h2[text()='Log in'])");

	// ------------------------------------------------------------------------------------------------------------------

	// Updated by Divya for BDD script development - Sep 2021

	public static By chargingcable = By.xpath("//*[text()='Charging Cable']/../../../footer/div[1]/button[2]");
	// Accessories link under ePod section
	public static By lnkAccessories = By.xpath("//a[text()='Accessories']");// a[contains(@href,'/ca/en/buy-online/vype-epod-accessories/')])[1]
	// Serpa Skin image
	public static By imgserpaskin = By.xpath(".//*[text()='Collection X']");
	public static final By txtWelcome = By.xpath("//*[contains(text(),'Designed to go')]");// Vuse store page element

	// Search text in Footer link Pages, Contact Us and FAQ
	public static By txtSearch = By.xpath("//*[text()='Get in touch']");

	// 3 for $33 ePod Pods link in Save -> Offers section
	public static By lnkForPods(String a, String b) {
		return By.xpath(".//*[text()='" + a + " for $" + b + " Pods']");
	}

	public static By txtSubmitRequest = By.xpath("//*[text()='Submit a request']");

	// ------------------------------------------------------------------------------------------------------------------

	// Updated by Harsha for BDD script development - Sep 2021

	//Resume Subscription
	public static By btnresume=By.xpath("//*[text()='Resume']");


	public static By txtepod = By.xpath("//*[text() = 'All ePod devices']");

	//Redesign to Power  your ePod Experience
	public static By txtNewVuse=By.xpath("//*[contains(text(),'The Stripe')]/../..");

	// Exit button
	public static By btnExit=By.xpath("//*[text()='Exit']");

	//Device Colorlist
	//public static By weDeviceColorList =By.xpath("//*[contains(@class,'Product__Container')]");


	public static By weDeviceColorList =By.xpath("//*[contains(@class,'Selection__List-sc')]//*[contains(@class,'Product__Container-sc')]");

	//Device Colorlist
	public static By weDeviceColors =By.xpath("//div[contains(@class,'Product__Name')]");

	//Navigation dots
	public static By weNavigationDots =By.xpath("(//*[contains(@class,'Navigation__Dots')])[2]");

	//Next Button
	public static By btnnext =By.xpath("(//*[text()='Next'])[1]/..");

	public static By txtselectpopup=By.xpath("(//*[contains(text(),'Make a selection to continue')])[1]");

	//Compare and Contrast
	public static By weCompareandContrast =By.xpath("//*[text()='COMPARE']/../..");
	public static By txtCompareandContrast =By.xpath("//*[text()='COMPARE']");

	//Device Container
	public static By weDeviceContainer=By.xpath("//*[contains(@class,'Device__Container')]");


	//Marker Container
	public static By weMarkerContainer=By.xpath("//*[contains(@class,'Marker__Dot-sc')]");
	public static By weMarkerContainer1=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[1]");
	public static By weMarkerContainer2=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[2]");
	public static By weMarkerContainer3=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[3]");
	public static By weMarkerContainer4=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[4]");
	public static By weMarkerContainer5=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[5]");
	public static By weMarkerContainer6=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[6]");
	public static By weMarkerContainer7=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[7]");
	public static By weMarkerContainer8=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[8]");
	public static By weMarkerContainer9=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[9]");
	public static By weMarkerContainer10=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[10]");
	public static By weMarkerContainer11=By.xpath("(//*[contains(@class,'Marker__Dot-sc')])[11]");

	public static By weMarkerContainer(int index)
	{


		return By.xpath("(//*[contains(@class,'Marker__Dot-sc')])['"+index+"']");
		//(//*[contains(@class,'Marker__Dot-sc')])
	}



	// Markers text

	public static By weMarkerText(int index)
	{


		return By.xpath("(//*[contains(@class,'Marker__Text')])['"+index+"']");
	}

	public static By weMarkerText=By.xpath("//*[contains(@class,'Marker__Text')]");




	public static By text1Marker=By.xpath("//*[contains(text(),'Compact design')]");
	public static By text2Marker=By.xpath("//*[contains(text(),'Green battery')]");
	public static By text3Marker=By.xpath("//*[contains(text(),'Full battery charge')]");
	public static By text4Marker=By.xpath("//*[contains(text(),'Black magnetic USB')]");
	public static By text5Marker=By.xpath("//*[contains(text(),'Compatible')]");
	public static By text6Marker=By.xpath("//*[contains(text(),'Compact angular')]");
	public static By text7Marker=By.xpath("(//*[contains(text(),'Splash proof')])[1]");
	public static By text8Marker=By.xpath("//*[contains(text(),'White LED 3')]");
	public static By text9Marker=By.xpath("//*[contains(text(),'Charges up to 80%')]");
	public static By text10Marker=By.xpath("//*[contains(text(),'Vape while you charge')]");
	public static By text11Marker=By.xpath("//*[contains(text(),'Cherry Red magnetic')]");

	//FAQ
	public static By weFAQ=By.xpath("//span[text()='Frequently']/parent::h1/..");
	public static By weFAQContainer=By.xpath("//*[contains(@class,'Question__Container')]/..");

	public static By lnksubscribesave=By.xpath("//*[contains(text(),'Subscribe & Save')]");

	public static By btnsubscribenow=By.xpath(".//*[contains(text(),'Subscribe Now')]");


	public static By pgsubscribesave=By.xpath("//*[contains(text(),'Save up to ')]/../../../..");

	public static By pgsubscription=By.xpath("//*[contains(text(),'ePod Vape')]");
	//Programs Link
	public static By lnkPrograms=By.xpath("(//*[text()='Programs'])[1]");



	//right arrow
	public static By rightarrow=By.xpath("(//button[contains(@class,'ProductImageSlider__Arrow-sc')])[2]"); 

	public static By btnselectdevice(String devicecolour)
	{
		return By.xpath("//*[text()='"+devicecolour+"']/../button/span");

	}




	public static By lnkAnniversaryboxset=By.xpath(".//*[@href='/ca/en/buy-online/epod2/anniversary-boxset']");
	public static By pgboxset=By.xpath("//*[contains(text(),'NEW LIMITED-EDITION ePod 2')]/..");

	public static By btnChargingCaseAddToCART=By.xpath("//*[text()='Charging Case']/../following-sibling::div/button/span");

	//Product Image
	public static By weProductImage=By.xpath("(//*[contains(@class,'ProductImage')]/..)[1]");
	//Product Slides

	public static By weProductSlides=By.xpath("//*[contains(@class,'Products__Slide')]");

	//products link
	public static By lnkPods=By.xpath("//*[text()='Pods']");
	public static By lnkSkin=By.xpath("//*[contains(text(),'Skins')]");
	public static By lnkEngraving=By.xpath("//*[text()='Engraving']");
	public static By lnkAllAccessories=By.xpath("//*[text()='All Accessories']");
	public static By lnkstripcollections=By.xpath("(//*[text()='STRIPE COLLECTION'])");
	public static By lnkcorecollections=By.xpath("(//*[text()='Core Collection'])");

	public static By txtelementcollection=By.xpath("(//*[contains(text(),'Electric Stripe')])[1]");
	//Back Button
	public static By btnback=By.xpath("(//*[text()='Back'])[1]");

	//sept24
	//Faq list
	public static By weFAQList=By.xpath("//*[contains(@class,'Question__Container')]");

	//Faqlist ans
	public static By weFAQListAns=By.xpath("//*[contains(@class,'Question__Answer')]");

	//page subscribe
	public static By pgsubscribe=By.xpath("(//*[contains(@class,'Banner__Banner')])[2]");

	//text why subscribe
	public static By whysubscribe=By.xpath("//*[contains(text(),'Why ')]");

	//text why subscribe icons
	public static By whysubscribetxt=By.xpath("//*[contains(@class,'DescriptiveVisual__DescriptiveVisualWrapper-sc-1dfou72-1 kT')]");

	//text subscription plan
	public static By txtsubscriptionplan=By.xpath("//*[contains(text(),'A Plan ')]");

	//text how it works
	public static By txthowitworks=By.xpath("//*[contains(text(),'How It Works')]");

	//how it works icons
	public static By txthowitworksicons=By.xpath("//*[contains(@class,'DescriptiveVisual__DescriptiveVisualWrapper-sc-1dfou72-1 e')]");

	//Faq question
	public static By questions=By.xpath("//*[contains(@placeholder,'Type keywords ')]");


	//sept 27 Harsha
	public static By popupans=By.xpath("//*[text()='FAQ']/parent::div");

	public static By btnbuyNow=By.xpath("//*[contains(text(),'Buy now')]");

	//Choose your Color
	public static By txtChooseyourClr=By.xpath("(//*[contains(text(),'CHOOSE')])[1]");

	//Text Power on with the VUSE ePod2 section
	public static By txtPowerOntheVuseePod2=By.xpath("//*[contains(text(),'Power on')]");

	public static By lnkheaders=By.xpath("//*[contains(@class,'Nav__List')]");

	public static By txtcorecollections=By.xpath("//*[text()='OUR CORE ']/..");

	public static By btnshopNow=By.xpath("//*[text()='Shop NOW']/..");

	//skins
	public static By LnkSkins=By.xpath("//*[text()='Vuse x U Skins']");

	//Skins Add to cart button
	public static By btnSkinsAddToCART=By.xpath("//*[text()='Skins']/../following-sibling::div/button/span");
	//Charging Cable Add to cart button
	public static By btnChargingCableAddToCART=By.xpath("//*[text()='Charging Cable']/../following-sibling::div/button/span");
	//Charging Cable Add to cart button
	public static By btnExplore=By.xpath("//*[text()='Pods']/../following-sibling::div/button/span");
	//Skin Selection
	public static By btnSkinSelect=By.xpath("//*[contains(@class,'SkinSelector__List')]//div");


	public static By btnChoosecolour(String devicecolour)
	{
		return By.xpath("//*[contains(@data-tip,'"+devicecolour+"')]/div");

	}

	public static By btn1point6percent1=By.xpath(".//*[text()='1.6 %']/..//div//button[2]");

	//Text Power on with the VUSE ePod2 section
	public static By btnAddToCART=By.xpath(".//*[text()='Add to cart']");
	// "//*[text()='ePod Rings']/../../../footer/div[2]/button/span");

	//Select button

	public static By btnSelectDeviceColor(String devicecolour)
	{
		return By.xpath("//*[text()='"+devicecolour+"']/../button");

	}

	public static By txtsubtotal=By.xpath("(//*[contains(text(),'Subtotal')])[2]");

	//order summary in pick ur pods
	public static By txtordersummary=By.xpath("//*[text()='Order Summary']/../div[1]");

	//subtotal in pick ur pods page
	public static By txtpodssubtotal=By.xpath("//*[text()='Order Summary']/../div[2]");

	//subscription created message
	public static By txtsubscriptioncreated=By.xpath("//*[contains(text(),'Your subscription')]");
	//subscribed items
	public static By txtsubscribeditems=By.xpath("(//*[contains(text(),'Your Subscribed ')])[1]/../div/div");
	//Subscription total
	public static By subscriptiontotal=By.xpath("(//*[contains(text(),'Your Total')])[1]/..");
	//subscription
	public static By txtsubscriptionpods=By.xpath("//*[text()='ePod Vape Pod Subscription']");

	public static By btnAddmodify = By.xpath("//*[text()='Add/modify items']");

	//verifying Added product
	public static By weProdutAdded(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/..");
	}

	//Add pod flavor
	public static By btnflavor(String flavor)
	{
		return By.xpath("//*[text()='"+flavor+"']/../button");

	}

	//save
	public static By txtsave=By.xpath("//*[@data-tracking='nav--link--text--Save']");

	public static By btnexplore=By.xpath("(//*[text()='Explore'])");

	public static By imgflvor(String flavor)
	{
		return By.xpath("//*[@alt='"+flavor+"']");

	}

	//strength
	public static By btnstrength(String Strength)
	{
		return By.xpath("//*[text()='Choose pod pack']/../../div[4]//*[text()='"+Strength+"%']");

	}

	public static By btnchoosepodpack=By.xpath("//*[text()='Choose pod pack']");

	//one time purchase
	public static By lnkOneTimePurchases=By.xpath("(.//*[text() = 'One time purchases'])/..");

	//promocode
	public static By txtpromotion=By.xpath("(.//*[text() = 'Promotion Applied'])/..");

	public static By addpod(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../..//*[text()='Nicotine strength']/../../div[2]/div/div/button[2]");

	}


	public static By btnaddflavor(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../following-sibling::footer//span[text()='Add']");

	}

	//--------------------------------------------------------------------------------------------------------

	/* Added by Vinod on Oct 5, 2021 */ 

	public static By weOrderConfirmation = By.xpath("//*[text()='Order confirmation']");

	public static By txtQtyValue = By.xpath("//*[contains(@class,'QuantityPicker__Value')]");

	public static By weSubscriptionDiscount = By.xpath("//*[text()='Discount']/following-sibling::span");

	/* Added by Divya */

	public static By btnAddFlavor(String flavor){
		return By.xpath("(//*[text()='"+flavor+"'])[1]");
	}

	/* Added by Vinod on Oct 28, 2021 */

	public static By weAddressComplete(String postalcode) {

		return By.xpath("//*[@title='"+postalcode+"']//span");
	}

	public static By weAutoAddress = By.xpath("//div[contains(@title,'canadapost')]");

	public static By weAutoAddressFirst = By.xpath("//*[contains(@class,'pcaselected')]");

	public static By txtSameDayDel = By.xpath("//*[text()='Same day delivery']");

	public static By txtNextDayDel = By.xpath("//*[text()='Next day delivery']");

	//Updated by Harsha in October Month for BDD Scripting

	public static By eligibilitypopupans=By.xpath("//*[text()='Eligibility']/parent::div");

	public static By txtfaq_pgvuseplus=By.xpath("(//*[contains(text(),'Questions? See answers')])[1]");

	public static By pgvuseplus_faqs=By.xpath("(//*[contains(@class,'Question__Container')])");

	//oct 07 Harsha

	//Subscribe and Save section in Pods page 	
	public static By txtSubsandSave = By.xpath("//*[text()='Subscribe & Save']");
	//Verify the "Mix & Match: 2 Pack Bundle" card with Image for $21.99 and text as "Select 3 packs of your choice and save 17%" with Create button is displayed
	public static By txtMixAndMatch2PackBundle=By.xpath("(//*[contains(text(),'Mix & Match: ')])[2]");
	// "(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-6 hSDOxN'])[1]");

	//Image of mix and match 2 Pack Bundle
	public static By ImageMixAndMatch2PackBundle=By.xpath("(//*[contains(@alt,'multipack thumbnail')])[2]");


	//Verify the"Mix & Match:5 pack Bundle" card with the image for $53.99  and text as "Select 5 packs of your choice and save 25%" with the "Create" button is displayed
	public static By txtMixAndMatch5PackBundle=By.xpath("(//*[contains(text(),'Mix & Match: ')])[1]");


	//Image of mix and match 3 Pack Bundle
	public static By ImageMixAndMatch5PackBundle=By.xpath("(//*[contains(@alt,'multipack thumbnail')])[1]");

	public static By lnkCreateMixAndMatch5PackBundle=By.xpath("(//span[text()='Create'])[1]");

	public static By lnkCreateMixAndMatch2PackBundle=By.xpath("(//span[text()='Create'])[2]");
	public static By txtChoose5Packs=By.xpath("(.//*[text()='Mix & Match: 5 Pack Bundle'])");

	public static By txtChoose2Packs=By.xpath("(.//*[text()='Mix & Match: 2 Pack Bundle'])");

	//strength

	public static By btnplusstrength= By.xpath("//*[text()='Pack quantity']/../following-sibling::div/div/button[2]");


	//flavor text in pop up
	public static By pgflavor(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]");

	}
	//text Nicotine strength
	public static By txtNicotinestrength=By.xpath("(//*[text()='Nicotine strength'])");

	//Add
	public static By add=By.xpath("//span[text()='Add']");


	//flavor
	public static By flavor(String flavor)
	{
		return By.xpath("//*[text()='"+flavor+"']/../following-sibling::div//span[text()='+ Add']");

	}

	//Add to cart
	public static By BtnAddToCartMixMatch=By.xpath("(.//*[text()='Add to cart'])");

	




	//link site map
	public static By lnksitemap=By.xpath("//*[text()='Sitemap']");

	public static By pgsitemap=By.xpath("(//*[text()='Sitemap'])[1]/..");

	//18/10/2021
	public static By lnkflavour(String flavor)
	{
		return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//*[contains(text(),'ADD')]");
	}

	public static By btnAddflavor(String flavor)
	{
		return By.xpath("//*[@alt='"+flavor+"']/../../../div/footer/button[1]");

	}

	public static By lnknoflavors=By.xpath("//*[contains(@class,'BuyCartridges__Item')]");


	public static By txtdiscount=By.xpath("//small[text()='Subtotal']/../following-sibling::div[1]");
	//oct26

	//Element collection
	public static By btnelementcollection=By.xpath("//*[text()='Elements Collection']");

	public static By btndirection(String direction)
	{
		return By.xpath("//*[contains(text(),'"+direction+"')]");
	}

	public static By pgdevicecolour=By.xpath("//*[contains(text(),'Power on with the new')]/..");

	//oct 28
	public static By btnminiicon(String icon)
	{
		return By.xpath("//*[contains(text(),'"+icon+"')]");

	}

	public static By lnkpouch=By.xpath("(//*[contains(text(),'The Pouch')])[1]");

	public static By txtContactUs = By.xpath(".//*[contains(text(),'Get in touch')]");

	//Text 'General Questions'
	public static By weTxtGeneralQuestions = By.xpath(".//*[contains(text(),'What do you need help wit')]");

	//nov2
	public static By addpod1(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[3]/../../div[3]/div[2]/div/div/button[2]");

	}

	public static By btnaddflavor1(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[3]/../following-sibling::footer//span[text()='Add']");

	}
	public static By Txtflavor(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]");

	}
	//nov8
	//+ button on pod caps
	public static By btnpodcaps=By.xpath("//*[text()='Pod Caps']/../../../footer/div[1]/button[2]");

	//Adding pod caps 
	public static By btnpodcapsadd=By.xpath("//*[text()='Pod Caps']/../../../footer/div[2]/button/span");

	//adding epod2 rings
	public static By btnepodrings=By.xpath("//*[text()='ePod Rings']");

	//Adding ring
	public static By btnring(String ring)
	{
		return By.xpath("//div[contains(@color,'accessories/swatches/"+ring+".png)')]");

	}

	//In subscription page
	public static By txtfaq_pgsubscription=By.xpath("(//*[contains(text(),'Frequently Asked ')])[1]");

	public static By pgsubscription_faqs=By.xpath("(//*[contains(@class,'Question__Container')])");

	public static By lnksaveall = By.xpath("//*[contains(@class,'MegaMenu__Group-sc-vlpfsa')]");

	public static By btnchooseflavour = By.xpath("//*[contains(text(),'Choose your pack')]");

	//Updated by Vinod on Nov 10 for BDD

	public static By weAgeCertify = By.xpath("(//div[contains(@class,'ButtonGroup__Container')]//button)[1]");

	public static By btnIam19orOver = By.xpath("(//div[contains(@class,'ButtonGroup__Container')]//button)[1]");

	//Added by Vinod on Nov 16 for BDD

	public static By btnSubscribeNow = By.xpath("(//*[contains(@class,'SubscribeNow')])[1]");

	public static By wePodSubcription = By.xpath("//*[contains(text(),'Pod Subscription')]");

	public static By btnDropDownPayment = By.xpath("//select[@name='paymentMethodId']");

	public static By weClosePopup = By.xpath("(//div[contains(@class,'PopOverContainer')])[1]//div[2]");

	public static By wePriceSummary = By.xpath("//*[contains(@class,'Summary__Price')]");

	public static By txtIncentiveDisclaimerCart = By.xpath("//*[contains(@class,'Incentive__Disclaimer')]");

	public static By weUserStatus = By.xpath("//*[contains(@class,'TierCard__Tier')]");

	/* Added by Manaswini - BDD */

	public static By btnsPlusMinusForicotineStrenghts = By.xpath("(.//*[text()='1.6%']/..//div)");

	public static By btnRIncrement1point6percent=By.xpath(".//*[text()='1.6%']/..//div//button[1]");

	public static By txtProfileStatus = By.xpath("(//*[contains(@class,'TierProfileHeader')]/following::span/strong)[1]");

	public static By lnkRewards = By.xpath("//*[text()='Rewards']");

	public static By lnkPromotion = By.xpath("//div[contains(@class,'ApplyPromotion__IconWrap')]");

	public static By btnOrders = By.xpath("//*[text()='Orders']");

	public static By btnCancelOrder = By.xpath("//*[text()='Cancel order']");

	public static By btnCancelOrderConfirmation = By.xpath("//*[contains(text(),'cancel order')]");

	public static By btnCancelOrderSuccess = By.xpath("//*[contains(text(),'successfully cancelled')]");

	public static By btnCancelOrderClose = By.xpath("//*[contains(text(),'successfully cancelled')]/preceding::button[contains(@class,'close-btn')]");

	//Added by Manaswini for BDD in November

	public static By txtSignUp = By.xpath(".//*[text()='Sign up']");

	public static By LemonBerry = By.xpath("(.//*[text()='Lemon Berry'])[2]");

	public static By LemonBerryCnt = By.xpath("(.//*[text()='A blend of lemon, citrus and pink grapefruit notes, highlighted by hints of berries.'])");

	//Added by Vinod for BDD in November

	public static By txtIncentiveStatus = By.xpath("//*[contains(@class,'Incentive__Tier')]");

	public static By txtBenefitStatus = By.xpath("//*[contains(@class,'Incentive__DropdownWrap')]/following::strong[contains(@class,'Incentive__DropdownTitle')]");

	public static By txtNewUser = By.xpath("//*[text()='Reach a lifetime spend of $100']");

	public static By epodelements=By.xpath("//*[contains(text(),'Core Collection')]");

	//----------------Harika epod accessories-----------------------------//

	//ePod Charger page
	public static By txtchargingcable = By.xpath("//*[text()='Charging Cable']");
	// phone holder page
	public static By txtPhoneHolder = By.xpath("//*[text()='Phone Holder with Pod Cap']");
	//Device case page
	public static By txtdevicecase = By.xpath("//*[text()='Device Case']");
	//travel case page
	public static By txttravelcase = By.xpath("//*[text()='Travel Case']");

	public static By txtcharingcableprice = By.xpath("//*[text()='$5.99']");
	public static By txtphoneholderprice = By.xpath("//*[text()='$7.99']");
	public static By txtdevicecaseprice = By.xpath("//*[text()='$9.99']");
	public static By txttravelcaseprice = By.xpath("//*[text()='$18.99']");

	public static By btnproductsliderprev = By.xpath("(.//*[contains(@class,'ProductImageSlider__Arrow')])[1]");
	public static By btnproductslidernext = By.xpath("(.//*[contains(@class,'ProductImageSlider__Arrow')])[2]");

	public static By Btnplus = By.xpath("(.//*[contains(@class,'QuantityPicker__Button')])[2]");
	public static By btnMinus=By.xpath("(.//*[contains(@class,'QuantityPicker__Button')])[1]");

	public static By AddtoCart=By.xpath("//*[text()='Add to cart']/..");

	public static By txtCollectionX = By.xpath("//*[text()='Collection X']");
	public static By txtCoreCollection =By.xpath("//*[text()='Core Collection']");
	public static By txtDefaultSkin = By.xpath("//*[text()='Mystique']");
	public static By imgDefaultSkin = By.xpath("//img[@alt='Mystique - ePod 2+ ePod2 skin']");
	public static By txtChooseyourQuantity = By.xpath("//*[text()='Choose your quantities']");
	public static By lnkAllepodDevices = By.xpath("//a[text()='All ePod devices']");
	//.//*[text()='All ePod devices']
	public static By EpodflavorSection(String FlavourSection) {

		return By.xpath("//div[@id='"+FlavourSection+"']");
	}

	//public static By imgflavor = By.xpath("(.//*[text()='"+flavor+"']/..//*[@class='Origami__Container-sc-3zmvwr-0 laAJvH'])");
	// "//img[@alt='epod-mango-wonder-vpro-cartridges']");

	public static By lnkepod= By.xpath("(.//*[text()='ePod 2'])[2]");

	public static By pgaccesss=  By.xpath("//*[text()='Charging Cable']");

	public static By imgflavor(String flavor) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[text()='"+flavor+"']/..//*[@class='Origami__Container-sc-3zmvwr-0 laAJvH'])");
	}

	public static By lnkElectricStripe = By.xpath("//*[text()='Electric Stripe']");

	//BoostPlan Xpaths
	public static By btnGetYourKit = By.xpath("//*[contains(@class,'Button')]//*[text()='Get your kit']");

	public static By pgCreateAccount = By.xpath("(.//*[text()='Create account'])");

	//Place Your Order Pop-Up
	public static By pgOrder = By.xpath("(.//*[text()='Place your order'])");




	public static By btnChoosePod = By.xpath("//*[text()='Choose a pod']");

	public static By lnkFlavor(String flavor) {
		return By.xpath("(.//*[text()='"+flavor+"'])");
	}

	public static By btnNicStrength = By.xpath("(.//*[@name='strength'])");

	public static By btnStrength = By.xpath("(.//*[@name='strength'])//option[2]");//*[text()='1.6%']");
	public static By txtStrength = By.xpath("//*[text()='1.6 %']");
	/*    public static By txtStrength (int i) {
    return By.xpath("//*[text()='1.6%']/..//option["+(i+1)+"]");
}*/

	public static By txtStarterKit = By.xpath("(.//*[text()='Where do you want your starter kit to be shipped?'])");

	public static By btnSameResidential = By.xpath("(.//*[text()='Same as residential address'])");

	public static By btnOtherResidential = By.xpath("(.//*[text()='Other'])");

	public static By btnSubmit = By.xpath("//*[contains(@class,'Button')]//*[text()='Submit']");

	public static By txtAlmostThere = By.xpath("//*[text()='Almost There']");

	public static By flavorAddButtonInePodVapePodsPage(String flavor) {
		return By.xpath("(//h1[contains(@class,'Card__Title') and text()='"+flavor+"'])/..//div[4]//button[1]");
	}

	public static By txtAddedtocart =By.xpath("//div[@id='toast-portal']//p");

	public static By AcceptAllCookies=By.xpath("//*[text()='Accept All Cookies']");

	public static By txtExciseTax = By.xpath("(//*[text()='Excise Tax'])[1]/following-sibling::strong");

	public static By listlines=By.xpath("//*[contains(@class,'Total__Line-')]");

	public static By listlines(int i)
	{
		return By.xpath("(//*[contains(@class,'Total__Line-')])["+(i+1)+"]");
	}


	public static By txtDiscount=By.xpath("(//*[text()='Discount'])/../../strong");

	//public static By AcceptAllCookies=By.xpath("//*[text()='Accept All Cookies']");

	public static  By txtdeliveryoptions=By.xpath("//*[contains(@class,'SelectBox__Label')]");

	public static By txtbillingpage=By.xpath("//*[contains(text(),'Almost there')]");

	public static By txtdelivery(String delivery)
	{
		return By.xpath("//*[contains(text(),'"+delivery+"')]");
	}

	//Updated

	//Updated Bhavitha

	public static By lnksubscribesaveunderprograms=By.xpath("//*[contains(text(),'Subscribe & Save ')]");

	public static By btnsubscribenow1=By.xpath("(//*[contains(text(),'Subscribe Now')])[1]");

	public static By txtdelivery1(String delivery)
	{
		return By.xpath("(//*[contains(text(),'"+delivery+"')])[1]");
	}

	public static By txtdelivery2(String delivery)
	{
		return By.xpath("(//*[contains(text(),'"+delivery+"')])[2]");
	}

	public static By btnincrement=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	public static By btndecrement=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[1]");

	public static By PaymentDeleted=By.xpath("//*[contains(text(),'No payment')]");



	//Added on Dec 19th
	public static By flavordisc(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/following-sibling::p");
	}
	public static By Nstrength(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../../div[2]/div/button[2]");

	}

	public static By addflavor(String Flavor)
	{
		return By.xpath("(//*[text()='"+Flavor+"'])[1]/following-sibling::button");

	}


	public static By txtnewaddons=By.xpath("//*[contains(@class,'Selection__NewItemsContainer')]");


	public static By txtcurrentsubscriptionitems=By.xpath("//span[contains(text(),'Your Current')]/..");

	public static By lnkfilter=By.xpath("(//*[text()='Filter by'])[1]");

	public static By txtflavortypes=By.xpath("//*[contains(@class,'PodsFilter__MenuItem-sc')]");

	public static By txthistory=By.xpath("//*[text()='Your history']");

	//Sasikala xpaths updated 

	public static By pgaccessories= By.xpath(".//*[contains(@class,'Accessories')]");

	public static By weaccessoriesname= By.xpath("//*[contains(@class,'Accessory__Name')]");

	public static By weaccessoriesrList= By.xpath("//*[contains(@class,'Section__Container-sc')]//*[contains(@class,'Accessory__Container-sc')]");

	public static By txtcontent= By.xpath("//*[text()='Keep your vape and pods together in the sleek Vuse travel case.']");

	public static By Btnimage= By.xpath("(.//*[@class='slick-slide slick-active slick-center slick-current'])[1]");

	public static By btnquantityinc= By.xpath(".//*[contains(@class,'QuantityPicker__Value-sc')]");

	public static By btnphoneholdertext= By.xpath(".//div[contains(@class,'RichText__Container-sc')]");

	public static By txtepoddevice= By.xpath(".//*[contains(@class,'RightSidedBanner__RightSidedInner-sc')]");

	public static By txtepod2= By.xpath(".//*[contains(@class,'Navigation__Container-sc')]/..//*[text()='ePod 2']");

	public static By txtepod2plus= By.xpath(".//*[contains(@class,'Navigation__Container-sc')]/.//*[text()='ePod 2+']");

	public static By btnnicotine= By.xpath(".//*[contains(@class,'Selector__Strength')]");

	public static By lnkCore= By.xpath("//*[text()='Core Collection']");

	public static By pgCore=  By.xpath("(//*[contains(@class,'Nav__ItemContainer-sc-')])[8]");

	public static By lnkCollX= By.xpath("//*[text()='Collection X']");

	public static By wetxtSkin= By.xpath("//*[text()='Collection X']/../..");

	public static By lnksite= By.xpath(".//*[text()='Sitemap']");

	public static By txtSitemap= By.xpath("(.//*[text()='Sitemap']/..)[1]");


	public static By btndevicecolor= By.xpath(".//*[text()='01. Choose your device colour']");

	public static By btndevicecolorsel= By.xpath(".//*[contains(@class,'Step2__Step2SwatchWrap')]");

	public static By btnchosseimage= By.xpath(".//*[contains(@class,'Step2__Step2MobileDevice-sc')]");

	public static By btnflavour= By.xpath(".//*[contains(@class,'FlavourList__Container-sc')]");

	public static By btnnicstr= By.xpath(".//*[contains(text(),'Choose Nicotine Strength (w/w)')]");

	public static By btnsubtotal= By.xpath("//*[@id='gatsby-focus-wrapper']/div[2]/div[2]/div[1]/section[1]/div/div/div/div/div[1]/div/section/div[1]/strong");

	public static By btntax= By.xpath("(.//*[contains(text(),'EPOD STARTER BUNDLE')])[2]/../..//*[text()='9.99']");

	public static By btnonetime= By.xpath(".//*[contains(text(),'One time purchase total')]/..//*[text()='$']");

	public static By btnaddrings=By.xpath(" //*[text()='ePod Rings']/../../../footer/div[2]/button/span");

	public static By txtFedexNext = By.xpath("//*[contains(text(),'Fedex - Next day')]/..");






	public static By btnflavorimage(String flavor) {
		// TODO Auto-generated method stub
		return By.xpath("(.//*[contains(@alt,'"+flavor+"')])[2]");
	}



	public static By skinTypCore(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-plus/']");


	}
	public static By Skintype(String Skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-skins/"+Skin+"-epod-2/']");


	}

	public static By skinType(String skin) {
		return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-epod-2-plus/']");


	}

	//Added by sireesha

	public static By txtwhysubscribe = By.xpath("(//*[contains(@class,'Section__SectionWrapper')])[1]");

	public static By txtpaln = By.xpath("(//*[contains(@class,'Section__SectionInner-sc')])[2]");



	public static By pgsubscribeepod =By.xpath(".//*[text()='ePod Vape Pod Subscription']");

	public static By txthowit = By.xpath("(//*[contains(@class,'Section__SectionInner-sc')])[3]");

	public static By btnsubscribenow2 = By.xpath("(.//*[text()='Subscribe Now'])[1]");

	public static By lnkclickhere = By.xpath(".//*[text()='click here']");

	public static By pgsubterms = By.xpath(".//*[text()='Subscription Terms']");

	public static By conditionslist = By.xpath("//*[contains(@class,'Checkbox__Container-sc')]");

	public static By lstXUtiles = By.xpath(".//*[@class='animated is-in-view']");

	public static By closemenu= By.xpath(".//*[contains(@class,'MobileNav__CloseIcon')]");

	public static By txtUsernamefield = By.xpath("By.xpath(\".//*[contains(@class,'MobileNav__CloseIcon')]\")") ;




	public static By lstXUtiles(int i) {
		// TODO Auto-generated method stub
		return By.xpath("(//*[@class='animated is-in-view')])["+(i+1)+"]");
	}

	public static By tilesvape = By.xpath("(.//*[contains(@class,'HomeOffer__Container-sc')])");
	public static By tileepod = By.xpath("(.//*[contains(@class,'HomeOffer__OfferLogoImg-sc')])[1]");
	public static By tilepod = By.xpath(".//*[text()='Vape Pods']");
	public static By tilevusexu = By.xpath("(.//*[contains(@class,'HomeOffer__OfferLogoImg-sc')])[2]");
	public static By btnletgo = By.xpath("(.//*[contains(@class,'Button__Label-sc')])[1]");
	public static By btnsubscribe = By.xpath(".//*[text()='Subscribe now']");
	public static By btnshopnow = By.xpath(".//*[text()='Shop now']");
	public static By btngetstarted = By.xpath(".//*[text()='Get started']");public static By tilesvape(int i) {
	// TODO Auto-generated method stub
		return By.xpath("(.//*[contains(@class,'HomeOffer__Container-sc')])["+(i+1)+"]");
	}
	
	//Added by akhila
	
	public static By websiteurl = By.xpath("//a[@href='https://www.vuse.com/ca/en/']");

	public static By lnkAccdetailspage = By.xpath("//a[@href='https://www.vuse.com/ca/en/account']");


	//birthday bonus
	public static By BirthadayBadgeDisabled=By.xpath("//*[@class='Badge__Wrapper-sc-1w8jvlk-2 bpJIbj']");
	public static By BirthadayDiscount=By.xpath("//*[text()='Points earned']/../following-sibling::strong");


	//mix & match
	public static By combineddiscount=By.xpath("//*[text()='COMBINED DISCOUNTS']");

	public static By multipack2=By.xpath("//*[text() ='Multipack 2: save 18%']");

	public static By epodpodpage=By.xpath("//*[text() ='ePod Vape Pods']");

	public static By Multipack2discount=By.xpath("(//*[text() ='MULTIPACK 2'])[1]");

	public static By Multipack2discountprize=By.xpath("//*[text() ='MULTIPACK 2']/../following-sibling::strong");

	public static By LEDMultipack2discountprize=By.xpath("//*[text() ='LEP MULTIPACK 2']/../following-sibling::strong");

	public static By Multipack5discount=By.xpath("(//*[text() ='MULTIPACK 5'])[1]");

	public static By LEPMultipack5discount=By.xpath("//*[text() ='LEP MULTIPACK 5'])[1]");

	public static By Multipack5discountprize=By.xpath("//*[text() ='MULTIPACK 5']/../following-sibling::strong");

	public static By LEDMultipack5discountprize=By.xpath("//*[text() ='LEP MULTIPACK 5']/../following-sibling::strong");

	//Electric stripe
	public static By ElectricStrip=By.xpath("//*[contains(text(),'Electric Stripe')]/..");

	public static By ElectricStripPge=By.xpath("(//*[contains(text(),'CHOOSE')])[1]/..");

	public static By StripPage= By.xpath("(//*[contains(text(),'ELECTRIC STRIPE')])/..");

	public static By widget= By.xpath("(//*[contains(@class,'styles__Container')])[1]");

	public static By Strip(String strip) {
	    return By.xpath("(//*[contains(text(),'"+strip+"')])[2]/../button[1]");
	    
	}
	public static By BoltGreyStripe= By.xpath("//*[text()='Bolt Grey']");
	public static By CharcoakxStripe= By.xpath("//*[text()='Charcoal-X']");
	public static By GalacticBlueStripe= By.xpath("//*[text()='Galactic Blue']");

	//epodprice
	public static By productprice= By.xpath("(//*[contains(@class,'Product__PriceSpan')])[2]");

	public static By txtBonus = By.xpath("(.//*[contains(@class,'PointsEarned__Code')])/../..");
	
	public static By wetxtDiscount=By.xpath("((//*[text()='Discount'])/following-sibling::span)[1]");
	public static By lnkepod2 = By.xpath("(//*[contains(@class,'Navigation__NavigationButton')])[2]");
	
}
