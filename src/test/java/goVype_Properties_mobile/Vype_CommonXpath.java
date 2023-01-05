package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_CommonXpath {

	// PreLogin

	//skins
	public static By LnkSkins=By.xpath("//*[text()='Skins']");

	public static By txtskins=By.xpath("//*[text()='Skins']");

	public static By pgcart = By.xpath("//*[text()='Product']/../../../..");

	public static By EngraveYourePod = By.xpath("//*[text()='Engrave your Devices']");
	// Province Drop down
	public static By btnLoginorRegister = By.xpath("//*[contains(@class,'Button')]//*[text()='Login/Register']");
	// "(.//*[@data-tracking='nav--link--button--Login/Register'])[1]");

	// Ontario province xpath
	public static By txtOntario = By.xpath("//option[contains(text(),'Ontario')]");

	public static By btnIam19 = By.xpath("//*[text()='I am ']");
	public static By btnIam18 = By.xpath("//*[text()='I am 18 or over']");


	//public static By lnkcheckstatus=By.xpath("//*[contains(@class, 'Button__Label-sc-1gw2hd1-2 cYUOYi')]");

	public static By txtcheckstatus=By.xpath("//*[contains(@class, 'typography__H3-sc-')]");

	public static By btnorders=By.xpath("//*[contains(@class, 'Tabs__TabContainer')][3]");

	public static By txtOrderNumber=By.xpath("//*[contains(@class, 'Order__OrderNumber-sc')]");



	public static By txtOrderDate=By.xpath("//*[contains(@class, 'Order__MetaItem-sc')]");

	public static By txtTotalDollarValue=By.xpath("//*[contains(@class, 'typography__Lead-sc')]");

	public static By lnkReOrder=By.xpath("//*[contains(@class, 'Button__Label-sc-')]");

	public static By btnprofile=By.xpath("//*[contains(@class, 'Tabs__TabContainer')][5]");

	public static By btnUnSubscribe=By.xpath("//*[contains(@class, 'Toggle__Indicator-sc')]");

	public static By txtEmailAddress=By.xpath("//*[contains(@class, 'Profile__Label-sc')]");

	public static By txtIfUnSubscribe=By.xpath("//*[contains(@class, 'Profile__Disclaimer-sc')]");


	public static By txtvuserewards=By.xpath("//*[contains(@class, 'typography__H1-sc-10lefml-0 PlusHeader__Heading-sc-nt52g4-3 cLxMcu iHajUZ')]");

	public static By lnkcheckstatus=By.xpath("//*[contains(@class, 'Button__Label-sc-1gw2hd1-2 cYUOYi')]");
	public static By lnkrewards=By.xpath("(//*[contains(@class, 'Menu__MenuItemContainer-sc-')])[6]");
	// Login button on registration Modal
	public static By btnLoginRegisterModal = By.xpath("(.//*[text()='Log in'])[1]");

	public static By btnSignRegisterModal = By.xpath("(.//*[text()='Sign up'])[1]");

	// User name text field login Modal
	public static By txtUsername = By.xpath("(.//*[@name='email'])[1]");
	// "//*[@class='Fieldset__Container-sc-5hzspr-0
	// cLFgfR']/div[1]/div[1]/div[1]");
	// "(.//*[@name='email'])[1]");

	// Password text field login Modal
	public static By txtPassword = By.xpath(".//*[@type='password']");
	// "//*[@class='Fieldset__Container-sc-5hzspr-0
	// cLFgfR']/div[2]/div[1]/div[1]");
	// "(.//*[@name='password'])[1]");

	// Login button on Login Modal
	public static By btnLogin = By.xpath("//span[text()='Log in']");
	// "(.//*[text()='Log in'])[2]");

	public static By btnNext = By.xpath(".//*[@type='submit']");

	// Forgot link
	public static By lnkForgot = By.xpath("//*[text()='Forgot?']");

	// PostLogin
	public static By btnAccount = By
			.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/following-sibling::div[3]");

	// Products link from the main menu navigation
	public static By lnkProducts = By.xpath("//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Shop']");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits'])[1]");

	// Mobile
	public static By lnkShop = By.xpath("(//*[text()='Shop'])[2]");
	// "//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Shop']");

	// Cartridges link under the epen3 section
	public static By lnkCartridgesEpen3 = By.xpath("(//*[text()='Cartridges'])[1]");
	// "(//*[text()='Pods'])[1]");
	// ".//*[contains(@href,'buy-online/vype-epen-3-cartridges') and
	// contains(text(),'Pods')]");

	// Starter Kit link under the ePod section
	public static By lnkStarterKitEpod = By.xpath("(.//a[contains(@href,'/vype-epod-starter-kit')])[1]");
	//public static By lnkDevices = By.xpath("//*[text()='Device']");
	public static By lnkDevices = By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[2]");
	// "(.//a[contains(@href,'/vype-epod-starter-kit')])[1]");
	// Cart Icon from the main menu navigation
	public static By lnkCartIcon = By.xpath("(.//a[contains(@href,'/cart')])[1]");

	// View Cart button on Hovering the Cart Icon
	public static By btnViewCart = By.xpath("(.//a[contains(@href,'/cart')])[2]");

	// Skins link under the ePod section
	public static By lnkSkinsEpod = By.xpath("//a[contains(@href,'/buy-online/vype-epod-skins') and text()='Skins']");

	// Charger link under ePod section
	public static By lnkCharger = By.xpath("//a[contains(@href,'/buy-online/vype-epod-charger')]");

	// Accessories link under ePod section
	public static By lnkAccessories = By.xpath("//*[text()='Accessories']");
	// "//a[contains(@href,'/buy-online/vype-epod-accessories')]");

	// Pods link under ePod section
	public static By lnkPodsePod = By.xpath("(.//*[@href='/buy-online/vype-epod-vpro-cartridges'])[1]");
	public static final By weVuseCom = By.xpath("//span[text()='Vuse.com']");
	public static By lnkEpod2 = By.xpath(".//a[contains(@href,'/ca/en/vuse-epod-2')]");
	public static By lnkEpodpod = By.xpath(".//a[contains(@href,'/ca/en/buy-online/vype-epod-vpro-cartridges')]");
	public static By lnkvusebyu = By.xpath(".//*[contains(text(),'Vuse x U Skins')]");
	public static By lnkvuserewards = By.xpath(".//a[contains(@href,'/ca/en/vuse-plus-vape-deals')]");
	public static By lnksubscribe = By.xpath(".//a[contains(@href,'/ca/en/subscribe')]");
	public static By lnkmix = By.xpath(".//a[contains(@href,'/ca/en/buy-online/vype-epod-vpro-cartridges')]");
	public static By lnkpasson = By.xpath(".//a[contains(@href,'/ca/en/pass-on-the-savings')]");
	public static By lnksameday = By.xpath("//*[contains(@class,'Shipping__StepHeading')][1]");
	public static By lnkshipping = By.xpath(".//*[contains(text(),'Quick & convenient shipping options')]");
	public static By lnkexpress = By.xpath(".//*[contains(text(),'Express')]");
	public static By lnkclick = By.xpath(".//*[contains(text(),'Click &')]");
	public static By lnkvapeexperience = By.xpath(".//*[contains(text(),'Take your Vape experience beyond')]");
	public static By lnkvapeproducts = By.xpath(".//*[contains(text(),'The vape products you want, when you want them')]");
	// Pods under epods
	public static By lnkEpodPods = By.xpath("(//*[text()='Pods'])[1]");
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


	// "(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]//div//a[contains(text(),'My
	// account')]");

	// Orders link
	public static By pgOrders = By.xpath("(//*[text()='My Orders'])[2]");
	// "(.//a[@href='/ca/en/account/orders/'])");


	// Logout link
	public static By lnkLogout = By.xpath("(//*[text()='Logout'])[1]");
	// "(.//a[contains(@href,'/cart')])[1]/../preceding-sibling::div[1]//div//*[contains(text(),'Logout')]");

	public static By lnksprofilesection=By.xpath("(//*[contains(@class,'MobileNav__Section')])[2]/a");

	public static By allorders=By.xpath("(//*[contains(text(),'Order no:')])/../..");
	// My Rewards
	public static By lnkMyRewards = By.xpath("(//*[text()='My Rewards'])[2]");

	// My Savings
	public static By lnkMySavings = By.xpath("(//*[text()='My Savings'])[2]");

	// My Orders
	public static By lnkMyOrders = By.xpath("(//*[text()='My Orders'])[2]");






	public static By pgMyOrders = By.xpath("(//*[text()='Orders'])");

	public static By lnkcancelorder=By.xpath("//button[text()='Cancel order']");


	public static By txtyescancel=By.xpath("//*[text()='Yes, cancel order']");


	public static By txtcancelconfirmation=By.xpath("//*[contains(text(),'Your order has ')]");


	public static By btncancelclose=By.xpath("//*[contains(text(),'Your order has ')]/../../../../button/div");


	// My Subscription
	public static By lnkMySubscription = By.xpath("(//*[text()='My Subscription'])[1]");

	// ePen and ePod tab
	public static By txtePenePod = By.xpath("(//*[text()='ePen 3'])[1]");
	public static By txtepod = By.xpath("(//*[text()='ePod'])[1]");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits']/../..//div//div//div)[1]");

	public static By txtepen3Catridges = By.xpath("(//*[text()='ePen 3'])[1]");

	// Heading text "Vype ePen 3 cartridges" of ePen 3 Cartridges page
	public static By weTxtVypeePen3Cartridges = By.xpath("(.//*[text()='ePEN 3 CARTRIDGES'])[1]");
	public static By weTxtePenPods = By.xpath("//*[contains(text(),'Vuse ePen pods are available')]");

	// "//*[@id='gatsby-focus-wrapper']/div[2]/div[2]/div/section/div/div/h1");
	// "//h1[text()='ePen Pods']");
	// "//*[text()='ePen Pods']");

	// Vuse ePod page
	public static By wetxtVuseePod = By.xpath("//*[text()=' NEW VUSE']");

	// Solo device tile buy now button
	public static By btnSoloDeviceBuyNow = By.xpath("//a[contains(@href,'buy-online/epod-devices')]");

	// Engraved ePod
	public static By btnEngravedDeviceBuyNow = By.xpath("(//a[contains(@href,'buy-online/engravable')])[1]");

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


	public static By iconsubscribe=By.xpath("//*[text()='Subscribe & Save']/../h4/div");


	public static By filteroptions=By.xpath("(//*[contains(@class,'PodsFilter__MenuItem')])");

	public static By txtresults=By.xpath("//*[contains(@class,'PodsFilterMobile__Results')]");


	public static By filterby=By.xpath("(//span[text()='Filter by'])[2]/..");

	public static By subscribetiles=By.xpath("//*[contains(@class,'styles__Card-sc')]");
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
	public static By lnkContactUs = By.xpath(".//*[@href='https://vuse-qa.ca/ca/en/contact-us/']");
	// "(//a[contains(@href,'/contact-us')])[1]");

	// FAQs text
	public static By lnkFaqs = By.xpath("//*[text()='FAQs']");
	// "//a[contains(@href,'/faq')]");
	public static By lnkStoreLocator = By.xpath("//*[text()='Store Locator']");
	// "//*[text()='//*[text()='Store Locator']']");

	//link store map
	public static By lnkStoremap = By.xpath("//*[text()='Sitemap']");

	public static By pgStoreLocator = By.xpath("//*[text()='Find a store near you']");

	// Condition of sale link
	public static By lnkConditionofSale = By.xpath("//a[contains(@href,'/pages/conditions-of-sale')]");

	// Privacy Policy link
	public static By lnkPrivacyPolicy = By.xpath(".//*[@href='/ca/en/pages/privacy-policy/']");

	// Terms and conditions link
	public static By lnkTermsandConditions = By.xpath("//a[contains(@href,'/pages/terms-conditions')]");

	// Cookie Policy link
	public static By lnkCookiePolicy = By.xpath("//a[contains(@href,'/pages/cookie-policy')]");

	// Vuse products may be harmful text
	public static By txtVuseProducts = By.xpath("//*[contains(text(),'Vuse products may')]");

	// Instagram Page
	public static By txtInstagram = By
			.xpath("//*[@src='/static/images/web/mobile_nav_type_logo.png/735145cfe0a4.png']");
	// "//*[text()='Instagram']");

	// Facebook Page
	public static By txtFacebook = By.xpath("//*[@href='https://www.facebook.com/VuseCanada/']");

	// Twitter Page
	public static By txtTwitter = By.xpath("//*[@href='https://twitter.com/vusecanada']");

	// Youtube Page
	public static By txtYoutube = By.xpath("(//*[contains(@href,'https://www.youtube.com/channel/')])");

	// Contact Us Page
	public static By txtContactUs = By.xpath(".//*[contains(text(),'Programs')]");
	// "(//*[text()='Contact us'])[1]");

	// Text 'General Questions'
	public static By weTxtGeneralQuestions = By.xpath(".//*[contains(text(),'Programs')]");
	// "(.//*[text()='General Questions'])[1]");

	// Conditions of sale Page
	public static By txtConditionsofSale = By.xpath("(//*[text()='Conditions of Sale'])[1]");

	// Privacy Policy Page
	public static By txtPrivacyPolicy = By.xpath("//a[contains(@href,'/pages/privacy-policy/')]");

	// Terms and conditions Page
	public static By txtTermsConditions = By.xpath("(//*[text()='Terms & Conditions'])[1]");

	// Cookie Policy Page
	public static By txtCookiePolicy = By.xpath("(//*[text()='Cookie Policy'])[1]");

	

	public static By txttermsandcondition=By.xpath("(//*[contains(@class,'Wrapper__Inner-sc')])[1]");
	// Social Media Links
	// Instagram
	public static By lnkLogin = By.xpath("//*[text()='Instagram']");
	public static By pgInstagram = By
			.xpath("//*[@resource-id=\"com.instagram.android:id/row_profile_header_imageview\"]");
	// "//h1[text()='Instagram']");

	// Facebook
	public static By lnkFacebook = By.xpath("//a[text()='Facebook']");
	public static By pgFacebook = By.xpath("//a[contains(@href,'facebook.com')][contains(@title,'Go')]");

	// Youtube
	public static By lnkYoutube = By.xpath(".//a[text()='Youtube']");
	public static By pgYoutube = By.xpath(".//*[text()='Subscribe']");

	// Twitter
	public static By lnkTwitter = By.xpath("//a[text()='Twitter']");
	public static By pgTwitter = By.xpath("(//*[text()='Vuse Care Canada'])[1]");

	// discard changes button
	public static By btnDiscardChanges = By.xpath("//*[text()='Discard changes']");

	// Yes, pause the subscription" button
	public static By btnYesPause = By.xpath("//*[contains(text(),'Yes, pause')]");

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

	// Edit in subscription tab.
	public static By txtEdit = By.xpath("(.//*[text()='Edit'])");

	// Cancel link
	public static By lnkCancel = By.xpath("(.//*[text()='Cancel'])");

	// Cancel Subscription
	public static By txtCancelSubscription = By.xpath("(.//*[text()='Cancel'])[1]");

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
			.xpath("(.//*[text()='Your subscription has been successfully updated.'])");

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
		// return
		// By.xpath("//a[contains(@href,'/buy-online/vype-epen-3-cartridges-vpro/"+FlavourColour+"-vpro-epen-3-cartridge')]");
		return By.xpath("//*[text()='" + FlavourColour + "']");

	}

	// verify flavour text
	public static By txtFlavours(String FlavourText) {
		return By.xpath("//h1[contains(text(),'" + FlavourText + "')]");
	}

	// verify flavours description
	public static By txtFlavoursDescription(String FlavourText) {
		return By.xpath("//h1[contains(text(),'" + FlavourText + "')]/..//div//div//div");
	}

	// ePen Device: add items and go to cart
	public static By txtAddItemsgotoCart = By.xpath("//*[contains(text(),'Add items & go to cart')]");

	// ePod Pods all flavours xpath. example: use "lemon-berry" in place of
	// flavour colour
	public static By lnkAllFlavoursePodPodsPage(String flavour) {
		return By.xpath("//a[contains(@href,'/buy-online/vype-epod-vpro-cartridges/" + flavour + "')]");
	}

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
	public static By btnAddToCart(String flavor) 
	{
		return By.xpath("(//*[text()='"+flavor+"'])/../div[4]/button");
	}


	public static By btnadd$(String flavor) 
	{ 
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../div[4]/div/div/button[1]");
	}

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

	public static By btnIncrement16percent = By.xpath(".//*[text()='1.6%']/..//div//button[2]");

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
	public static By pgeSubscribeAndSave = By.xpath(".//*[@alt='Subscribe and Save']");

	// Quality
	public static By txtQuantity = By.xpath("(.//*[text()='Quantity'])");

	// Pack
	public static By txtPack = By.xpath("(.//*[contains(text(),'Pack')])[1]");

	// Subscribe &save
	public static By lnkSubscribeAndSave = By.xpath(".//*[text()='Subscribe & Save']");
	// "(.//*[text()='Subscribe & Save'])[2]");

	// One Time purchase.
	public static By lnkOneTimePurchase = By.xpath("(.//*[text() = 'One time purchase'])");

	// ePod Charger page
	public static By txtePodAccessories = By.xpath("//*[text()='ePod Accessories']");

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
	public static By btnPattern = By.xpath("//*[contains(text(),'Pattern')]");

	// Solstice
	public static By btnSolstice(String pattern) {

		return By.xpath("//*[contains(text(),'" + pattern + "')]");
	}

	// Hoya pattern
	public static By btnHoya(String patternName) {

		return By.xpath("//*[contains(text(),'" + patternName + "')]");
	}

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
	public static By txtFirstName = By.xpath(".//*[@name='firstName']");
	
	//Last name
	public static By txtLastName = By.xpath(".//*[@name='lastName']");
	
	//DOB
	public static By txtDOB = By.xpath(".//*[@name='dob']");
	
	//Phone number
	public static By txtphno = By.xpath(".//*[@name='phoneNumber']");
	
	//Address
	public static By txtaddress = By.xpath(".//*[@name='address']");

	// Add your name button
	public static By btnAddName = By.xpath("//*[text()='Add your name']");

	// Engraving summary page
	public static By txtEngravingSummary = By.xpath("//*[text()='Engraving Summary']");

	// Items Details
	public static By btnAddEngraving = By.xpath("//*[text()='Add engraving']");

	// Solstice skin colour
	// public static By btnSolsticeColor(String flavour,String flavourName) {
	// return
	// By.xpath("//*[contains(text(),'"+flavour+"')]/following-sibling::div//div//div[@data-tip='"+flavourName+"']");
	// }

	//

	// Solstice skin colour
	public static By btnSolsticeColor(String flavour, String flavourName) {
		return By.xpath("//*[contains(text(),'" + flavour + "')]/following-sibling::div//div//div[@data-tip='"
				+ flavourName + "']");
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
	public static By wetxtVypeePod = By.xpath("(//*[text()='ePod'])[3]");// *[text()='Vype
	// ePod'])[2]

	// Choose the colour
	public static By btnColour(String clr) {

		return By.xpath("(//*[@data-tip='" + clr + "'])[2]");
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
	public static By btnAdd1 = By.xpath("(.//*[text()='Add'])[1]");// another
	// xpath:
	// (.//*[text()='Nicotine
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

	// public static By lnkInstagram=By.xpath("//*[text()='Instagram']");

	// Text on Age Certify Page
	public static By weAgeCertify = By.xpath("//*[contains(text(),'Please select your')]");
	// "//*[@class='typography__H2-sc-10lefml-1 SoftVerify__Title-sc-1gt780w-5
	// iiBpCT TCIVC']");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "//*[contains(text(),'select your province of residence and confirm')]");
	// Province Drop down
	public static By weDropDownProvince = By.xpath("//Select[@name='province']");
	// "(.//*[@name='province'])[2]");
	// "//*[@class='Dropdown__Wrap-sc-14jhbrp-1 gukAhf']//*[@name='province']");
	// I am 18/19 or over button
	public static By btnIam19orOver = By.xpath("(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");
	// "(//*[@class='Button__Label-sc-1gw2hd1-2 czwIxn'])[1]");

	// I am not 18 button
	public static By btnIamNot18 = By.xpath(".//button//span[contains(text(),'I am not')]");
	// Under 18 Error message
	public static By txtErrorMustBeAtLeast18 = By.xpath(".//div[@type='error']//p");

	// hey gold member you are almost platinum status xpath
	public static By txtYouAreAlmost = By.xpath("//*[contains(text(),'you are almost')]/..");

	// See How you will benefit
	public static By txtSeeHowYouWillBenefit = By.xpath("(//*[contains(text(),'See how you will benefit')])[1]");

	// Expand See how you will benefit
	public static By lnkSeeHowYouWillBenefit = By.xpath("(//*[contains(text(),'See how you will benefit')])[1]/following-sibling::div");

	// Close button on expended menu
	public static By btnClose = By.xpath("(//*[contains(text(),'See how you will benefit')])[1]/../div/button");

	// Order Summary
	public static By txtOrderSummary = By.xpath("//*[text()='Order Summary']");

	// Question mark xpath in shipping page
	public static By weQuestionMark = By.xpath("//*[text()='(?)']");

	// ######################################## ePen Pods Home Page xpath
	// ####################################################
	// One time button
	public static By btnOneTime = By.xpath("(//*[contains(text(),'One-time')])[1]");

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
	public static By txtMixAndMatch3Pack = By.xpath("//*[contains(text(),'Select 3 packs of your choice')]");

	// See details link
	public static By txtSeeDetails = By.xpath("(//*[text()='See details'])[2]");// (.//*[text()='Add'])[2]
	public static By btnAddproduct = By.xpath("(//*[text()='Passionfruit'])[1]");
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

	public static By txtVusePodsubscription = By.xpath("//h1[text()='ePod Vape Pod Subscription']");

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

	public static By btnsubscribenow=By.xpath("(//*[text()='Subscribe Now'])[1]");
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


	public static By txtdiscount=By.xpath("//*[text()='Discount']/../../strong");

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

	// Verify CANADA POST (EXPRESS) are displayed under the "How should we send
	// your order?
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
	// nicotine by weight. Vuse ePod pods are compatible with Vype ePod devices"
	// is displayed
	public static By txtePodPodDescription = By.xpath("(.//*[contains(@class,'CollectionHeader__Description')])");

	// Verify $12.00/pack is displayed

	// Lakshmi

	// Save link
	public static By lnkSave = By.xpath("(//*[text()='Save' and contains(@class,'Menu__MenuItemContainer-')])");

	// Programs Link
	public static By lnkPrograms = By.xpath("(//*[text()='Programs'])[1]");

	// Subscribe and Save link
	public static By lnkSubscribeandsave = By.xpath("//*[contains(text(),'Subscribe & Save')]");

	// Subscribe and Save page
	public static By pgSubscribeandsave = By.xpath("//*[@alt='Subscribe and Save']");

	// Learn more button

	public static By btnLearnMore = By.xpath("(//*[text()='Learn more'])[1]");

	// Start building an order
	public static By btnStartBuildinganOrder = By.xpath("//*[@href='/ca/en/buy-online/vuse-pods/']");

	public static By btnLimitedEditionepodBuynow = By.xpath("(//a[contains(@href,'buy-online/liquid-colour')])[1]");

	public static By pglimitededition = By.xpath("(//*[text()='Liquid Colour Collection'])[2]");
	// "//*[text()='Liquid Colour Collection']");

	public static By txtMango = By.xpath("(.//*[text()='Mango'])[1]");

	public static By txtMangoPDP = By.xpath("//*[contains(text(),'A juicy')]");
	// "(.//*[text()='A rich mango flavour immersed with fruity notes.'])");

	// sign up link
	public static By lnksignup = By.xpath("//*[text()='Sign up']");

	// *************************************************************************************************************************
	// Mobile

	// Menu
	//public static By btnMenu = By.xpath("//*[@class=\"Nav__Container-sc-9z4o2m-0 eGbTIz\"]//*[@class=\"MobileNav__Toggle-muz2dr-0 wHvKo\"]/div[1]/svg[1]/path[1]");
	// "(//*[@class='MobileNav__Toggle-muz2dr-0
	// wHvKo']//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[1]");
	// "//*[@class=\"Nav__Container-sc-9z4o2m-0
	// eGbTIz\"]//*[@class=\"MobileNav__Toggle-muz2dr-0 wHvKo\"]");
	// public static By
	// lnkMenu=By.xpath("(//*[@class='Header__Container-sc-1bea9oq-0
	// eofhAF']//*[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[1]");

	// Login/Register
	public static By lnkLoginOrRgstr = By.xpath("(//*[text()='Login/Register'])[2]");
	// "(.//div[contains(@class,'HeroCarousel__Container-sc-22lllz-0
	// iGmNmp')]//div[@class='Icon__Container-sc-1st5y7f-0 dSqsPg'])[1]");

	// Vuse Logo
	public static By wevuseLogo = By.xpath(" //*[@class='Nav__MobileLogo-sc-9z4o2m-2 fLSEWp']");

	/*public static By lnkePod2 = By
			.xpath("//*[@class='Menu__List-pbcgxm-2 HPINh menu-secondary-enter-done']//*[text()='ePod 2']");  */
	
	public static By lnkePod2 = By.xpath("(//*[contains(@class,'Menu__MenuItemContainer-')])[1]");

	public static By LnkePod = By.xpath("(//*[text()='Pods' and contains(@class,'Menu__MenuItemContainer-')])");

	// public static By lnkTermsAndCondition=
	// By.xpath("//a[contains(@href,'/pages/terms-conditions')]");

	// text Terms & Conditions"
	public static By lnkTermsAndCondition = By.xpath("//*[@href='/ca/en/pages/terms-conditions/']");

	// public static By lnkTermsAndCondition=By.xpath("//a[text()='Conditions of
	// Sale']");
	public static By pgTermsAndCondition = By.xpath("//h1[text()='Terms & Conditions']");

	// menu
	// public static By
	// btnMenu=By.xpath("//*[@class=\"Nav__Container-sc-9z4o2m-0
	// eGbTIz\"]//*[@class=\"MobileNav__Toggle-muz2dr-0 wHvKo\"]");

	public static By lnkconditonsofsale = By
			.xpath("(//*[@href='https://www.vuse.com/ca/en/pages/conditions-of-sale'])[1]");

	public static By lnksupport = By.xpath(".//*[@href='mailto:support@govype.ca']");

	public static By btnloginregister = By.xpath("(//*[text()='Login/Register'])[2]");

	public static By txtconditonsofsale = By.xpath("(//*[@class='Wrapper__Inner-x6sb1x-1 kOtHch'])[1]");

	public static By termsandcondition=By.xpath("(//*[contains(@class,'Wrapper__Inner-sc')])[1]");

	public static By goldcard = By.xpath(".//*[text()='Gold status']");

	public static By pgCart = By.xpath("//*[text()='Your cart']");

	//product details
	public static By productdetails=By.xpath("//*[contains(text(),'Product')]/../../../..");

	// order summary
	public static By btnsummary = By.xpath("//*[text()='Show order summary']");

	// Device link under ePod2 - Indu - April 20, 2021
	public static By lnkePod2Device = By.xpath(".//*[text()='Device']");

	// ePod 2 Device page - Indu - April 20, 2021
	public static By pgePod2Device = By.xpath(".//*[text()=' NEW VUSE']");

	// Engraving tile in ePod2 Device page
	public static By txtengravingtile = By.xpath(".//*[text()='Engravings']");

	// Engraving page
	public static By pgengraving = By.xpath(".//*[text()='Pick device colour & design style']");

	// Graphite color in Engraving page
	public static By btndevicecolour(String devicecolour) 
	{
		return By.xpath("//*[@data-tip='"+devicecolour+"']/button");
	}


	// Graphite color device image in Engraving page
	public static By imgDevice = By.xpath("//*[contains(@class,'BuyChrome__Photo-sc')]");

	// Pattern tile in Engraving page
	public static By txtPattern = By.xpath(".//*[text()='Pattern']");

	//selecting pattern
	public static By lnkpattern(String pattern)
	{
		return By.xpath("//*[contains(text(),'"+pattern+"')]");

	}

	// Pattern page
	public static By pgPattern = By.xpath(".//*[text()='Choose the pattern you like']");

	// Add to cart button in Engrave device page
	public static By btnAddtoCart = By.xpath(".//*[text()='Add to cart']");

	//pods
	public static By lnkpods=By.xpath("//*[text()='Pods']");

	public static By lnknotnow=By.xpath("/html[1]/body[1]/div[14]/div[3]");

	//skins
	public static By lnkskins=By.xpath("//*[contains(text(),'Skins')]");

	//skin buynow
	public static By btnbuynow=By.xpath("(//a[contains(@href,'/ca/en/buy-online/vype-epod-skins/calla')])[2]");

	//buynow
	public static By buynow=By.xpath("//*[text()='Buy now']");

	//+
	public static By btnPlus=By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	//choose quantities
	public static By txtchoose=By.xpath("//*[text()='Choose your quantities']");

	//Acessories
	//public static By lnkAccesories=By.xpath("//*[contains(text(),'Device Accessories')]");

	//+ button
	public static By btnplus=By.xpath("((//*[contains(@class,'QuantityPicker__Button')])//../div)[2]");

	//Add button
	public static By addbtn=By.xpath("(//span[text()='Add'])[1]");

	public static By imgpouch=By.xpath("(//*[@alt='The Pouch'])");

	public static By pouchcolour(String colour)
	{
		return By.xpath("//*[@data-tip='"+colour+"']/button");
	}

	public static By lnksubscribeandsave=By.xpath("(//*[text()='Subscribe & save'])");

	public static By btnmysubscription=By.xpath("(//a[text()='My Subscription'])[2]");

	public static By txtnosubscription=By.xpath("//*[text()='You have no subscription plan yet']");

	public static By pgRewards=By.xpath("(//*[text()='My Rewards'])[2]");


	public static By txtcongrats=By.xpath("//*[contains(text(),'Welcome ')]/..");


	public static By txtgoldcard=By.xpath("//*[contains(@class,'TierCard__Content')]");


	public static By txtsilvercard=By.xpath("//*[contains(@class,'TierCard__Content')]");

	public static By txtstatus=By.xpath("//*[contains(@class,'Tier__TierWrapper')][2]");

	public static By cartsummary=By.xpath("//*[contains(text(),'Cart summary')]");
	public static By txtLegalAdvisoryHeadQuarters = By.xpath("//*[contains(text(),'Imperial Tobacco Company')]");
	public static By txtAdvisoryEPodsPods = By.xpath("//*[contains(text(),'Discover a world')]");

	public static By btnmenu=By.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/preceding-sibling::button");
	
	public static By AcceptAllCookies=By.xpath("//*[text()='Accept All Cookies']");

	public static By btnsubscribeSave=By.xpath("(//*[text()='Subscribe & Save'])[1]");

	public static By pgsubscribandsave=By.xpath("//*[text()='Subscribe & save']");

	public static By wetxtTotalvalue1=By.xpath("(.//*[text()='Subscribe & Save'])[1]/../../div");

	public static By wetxtTotalvalue2=By.xpath("(.//*[text()='Add to cart'])[1]/../../div");

	public static By quantity=By.xpath("(//*[@data-tracking='nav--link--image--Cart'])[1]");


	public static By txtDatePayment = By.xpath("(//*[text()='Shipping Date'])/../..");


	public static By txtEditDetails = By.xpath("//*[text()='Edit details']");

	public static By pgsubscription=By.xpath("(//*[text()='My Subscription'])[2]");




	//Rewards tab.
	public static By lnkRewards=By.xpath("(.//*[text()='Rewards'])");


	//order summary
	public static By ordersummary=By.xpath("//*[text()='Order Summary']/..");
	

	public static By lnkAccount=By.xpath("(//*[text()='My Account'])[2]");



	// delete card
	public static By deletecard = By.xpath("//*[contains(text(),'+ Add ')]/../following-sibling::div/div[2]/button");

	// delete
	public static By txtdelete = By.xpath("//span[contains(text(),'Yes, delete')]");



	// skin 
	public static By skintype(String skin) {
		return By.xpath("//*[contains(text(),'"+skin+"')]");	//(//a[contains(@href,'/buy-online/vype-epod-skins/"+skin+"')])
	}
	//Strength

	public static By strength(String NicotineStrength)
	{
		return By.xpath(".//*[text()='"+NicotineStrength+"%']/..//div//button[2]");

	}

	public static By addflavor(String Flavor)
	{
		return By.xpath("//*[text()='"+Flavor+"']/following-sibling::button");

	}

	public static By Txtflavor(String Flavor)
	{
		return By.xpath("(//*[text()='"+Flavor+"'])[2]");

	}
	public static By flavordisc(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/following-sibling::p");
	}
	public static By Nstrength(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../../div[2]/div/button[2]");

	}




	// ****************************************************************
	//Harsha
	public static By txtonetimepurchase=By.xpath("//*[text()='One time purchase']");


	public static By btncanadapost=By.xpath("//*[text()='Canada Post (Standard)']");

	//---------Mix and match-------------
	//Subscribe and Save section in ePen Pods page 	
	public static By txtSubsandSave = By.xpath("//*[text()='Subscribe & Save']");

	public static By txtSubsandSave1 = By.xpath("//*[text()='Subscribe & save']");


	// "(//*[text()='Subscribe & Save'])[2]");
	//Verify the "Mix & Match: 3 Pack Bundle" card with Image for $30.00 and text as "Select 3 packs of your choice and save 17%" with Create button is displayed
	public static By txtMixAndMatch3PackBundle=By.xpath("(.//*[contains(text(),'Mix & Match:')]/../..)[2]");
	// "(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-6 hSDOxN'])[1]");

	public static By txtMixAndMatch2PackBundle=By.xpath("(.//*[contains(text(),'Mix & Match: ')])[2]");

	public static By ImageMixAndMatch2PackBundle=By.xpath("(.//*[contains(@class,'MultipackThumbnail__Figure-sc')])[2]");
	// "(.//*[@class='MultipackThumbnail__Content-sc-1mm41d8-6 hSDOxN'])[1]");

	//Image of mix and match 3 Pack Bundle
	public static By ImageMixAndMatch3PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-3/'])[1]");


	//Verify the"Mix & Match:5 pack Bundle" card with the image for $45.00  and text as "Select 5 packs of your choice and save 25%" with the "Create" button is displayed
	public static By txtMixAndMatch5PackBundle=By.xpath("(.//*[contains(text(),'Mix & Match:')])[1]");


	//Image of mix and match 3 Pack Bundle
	public static By ImageMixAndMatch5PackBundle=By.xpath("(.//*[contains(@class,'MultipackThumbnail__Figure-sc')])[1]");


	//Click on the "Create" button for "Mix & Match : 5Pack Bundle"
	public static By lnkCreateMixAndMatch5PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-5/'])[2]");

	public static By txtMixAndMatch5PackBundlePage= By.xpath("(.//*[text()='Mix & Match: 5 Pack Bundle'])");


	public static By txtChoose5Packs=By.xpath("(.//*[text()='Choose 5 packs to add to your bundle'])");

	public static By imgmultipack5=By.xpath("(.//*[contains(@class,'BuyChrome__Photo-sc')])");

	public static By txtmultipack5=By.xpath("(.//*[contains(text(),'Select 5 packs')])");


	//Pack (2 pods) text
	public static By txtPack2Pods=By.xpath("(.//*[text()='Pack (2 pods)'])");

	//flavor
	public static By flavor(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])/../div[4]/button"); //*[text()='"+flavor+"']/../following-sibling::div//span[text()='+ Add']

	}
	//strength
	public static By btnNicotineStrength(String strength)
	{
		return By.xpath("//*[text()='"+strength+"%']/../div/button[2]");

	}


	//flavor text in pop up
	public static By pgflavor(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]");

	}
	//text Nicotine strength
	public static By txtNicotinestrength=By.xpath("(//*[text()='Nicotine Strength (%)'])");

	//Add
	//public static By add=By.xpath(".//*[text()='ADD - $27.98']");


	//Add to cart
	public static By BtnAddToCartMixMatch=By.xpath("(.//*[text()='Add to cart'])");
	//Discount code
	public static By wetxtDiscount=By.xpath("(//*[text()='Discount'])/following-sibling::span");
	//Elements in cart
	public static By Elementsincart=By.xpath("//*[text()='One time purchases']/..");


	//Text "$N"  value displayed on the ePod devices page
	public static By weTextTotalValueN(String num){

		return By.xpath("(.//*[text()='$"+num+"'])[1]");

	}


	public static By labelSubTotal= By.xpath("(.//*[text()='Subtotal'])[2]");

	public static By btncheckout=By.xpath("//*[text()='Checkout']");

	public static By btndelivary=By.xpath("//*[text()='Go to delivery']");


	public static By btnbilling=By.xpath("//*[text()='Go to billing']");


	//Shipping Value
	public static By shippingValue = By.xpath(".//*[text()='Shipping']/following-sibling::strong");

	public static By lnkdeviceandpods=By.xpath("//*[contains(text(),'ePod Vaping Products')]");

	public static By lnkdevice=By.xpath("//*[contains(text(),'All ePod devices')]");


	public static By weTxtSubTotalValueN(String num){

		return By.xpath("(.//*[text()='"+num+"'])[1]"); 

	}


	public static By Addflavor(String flavor)

	{
		return By.xpath("(//*[text()='"+flavor+"'])/../div[4]/button");

	}
	public static By Addflavor1(String flavor)

	{
		return By.xpath("(//*[text()='"+flavor+"'])[3]/../../footer/button[2]");

	}
	public static By Nicotinestrength(String flavor)

	{
		return By.xpath("(//*[text()='"+flavor+"'])[2]/../div[3]/div/div[2]/div/button[2]");

	}

	public static By lnknicotinestrength=By.xpath("(//*[text()='Clear'])[2]/../div[3]/div/div[2]/div/button[2]");
	public static By Nicotinestrength1(String flavor)

	{
		return By.xpath("(//*[text()='"+flavor+"'])[4]/../../div[2]/div/div/div/button[2]");

	}

	public static By txtflavor(String flavor)
	{
		return By.xpath("//*[text()='"+flavor+"']/following::span[contains(text(),'Add')][1]");
	}
	public static By txtflavor2(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[1]");
	}
	public static By txtflavor1(String flavor)
	{
		return By.xpath("(//*[text()='"+flavor+"'])[3]");
	}
	public static By txtFlavor(String flavor)
	{
		return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[1]/a");
	}

	//instagram page
	public static By pginstagram=By.xpath("//*[text()='Instagram']");

	//one time purchase
	public static By btnonetimepurchase=By.xpath("(//*[text()='One time purchase'])");

	//strength
	public static By btnstrength=By.xpath("(//button[contains(@class,'QuantityPicker__Button')])[2]");
	//shipping options
	public static By shippingoptions=By.xpath("(//*[contains(@class,'SelectBox__Container')])");

	//text shipping options
	public static By txtshippingoptions=By.xpath("//*[contains(text(),'How would ')]/..");
	public static By txtskin(String skin)
	{
		return By.xpath("(//*[text()='"+skin+"'])[2]");
	}

	//subscribed items
	public static By txtsubscribed=By.xpath("(//*[contains(text(),'Your Subscribed Items')])[1]");

	public static By txtsubscribeditems=By.xpath("(//*[contains(text(),'Your Subscribed Items')])[1]/../..");

	public static By subscriptiontotal=By.xpath("(//*[contains(text(),'Your Total')])[1]/..");


	public static By txtshippingdate=By.xpath("(//*[contains(text(),'Next Shipping Date')])[1]/..");


	public static By shipping=By.xpath("(//*[contains(text(),'Shipping Date')])[2]/../../..");

	public static By disclimernote=By.xpath("(//*[contains(text(),'NOTE*:')])[1]/..");


	//Accessories list
	public static By allaccessories=By.xpath("//*[contains(@class,'Accessory__Main')]");

	public static By lnkcorecollections=By.xpath("//*[text()='Core Collection']");

	//Choose your Color
	public static By txtChooseyourClr=By.xpath("(//*[contains(text(),'CHOOSE')])[1]");

	public static By pgdevicecolour=By.xpath("//*[contains(text(),'Power on with the new')]/..");

	public static By rightarrow=By.xpath("(//*[contains(@class,'ProductImageSlider__Arrow')])[2]");

	//Product Image
	public static By weProductImage=By.xpath("//*[contains(@class,'slick-slide slick-ac')]");
	//Product Slides

	public static By weProductSlides=By.xpath("//*[contains(@class,'Products__Slide')]");

	//Text Power on with the VUSE ePod2 section
	public static By btnAddToCART=By.xpath("//*[contains(text(),'Add to cart')]");



	//Skin Selection
	public static By btnSkinSelect=By.xpath("//*[contains(@class,'SkinSelector__SkinThumbnail-s')]");
	//+ "//*[contains(@class,'SkinSelector__List')]//div");

	//Skins Add to cart button
	public static By btnSkinsAddToCART=By.xpath("//*[text()='Skins']/../following-sibling::div/button/span");

	//Charging Cable Add to cart button
	public static By btnExplore=By.xpath("//*[text()='Pods']/../following-sibling::div/button/span");


	//+ button on pod caps
	public static By btnpodcaps=By.xpath("//*[text()='Pod Caps']/../../../footer/div[1]/button[2]");

	//Adding pod caps 
	public static By btnpodcapsadd=By.xpath("//*[text()='Pod Caps']/../../../footer/div[2]/button/span");

	//adding epod2 rings
	public static By btnepodrings=By.xpath("//*[text()='ePod 2 Rings']");

	public static By txtcartsummary=By.xpath("(//*[contains(text(),'Cart summary')])[1]");

	//Adding ring
	public static By btnring(String ring)
	{
		return By.xpath("//div[@data-tip='"+ring+"']");

	}




	//Select button

	public static By btnSelectDeviceColor(String devicecolour)
	{
		return By.xpath("//*[text()='"+devicecolour+"']/../button");

	}


	//18th jan 2022
	// Starter bundle
	public static By btnStarterBundleBuyNow = By.xpath("(//a[contains(@href,'buy-online/epod-starter-bundle')])[1]");

	// start customizing
	public static By btnstartcustomising = By.xpath("//*[text()='Start customizing']");

	// Choose colour
	public static By btnchoosecolour = By.xpath("//*[text()='Choose this colour']");

	// Starter bundle customize page
	public static By txtYourcolours = By.xpath(".//*[text()='Your Colour. ']");

	public static By btnChoosecolour(String devicecolour)
	{
		return By.xpath("//*[contains(@data-tip,'"+devicecolour+"')]/div");

	}

	public static By btnchooseflavour = By.xpath("//*[contains(text(),'Choose your pack')]");

	public static By imgflvor(String flavor)
	{
		return By.xpath("//*[contains(@data-tip,'"+flavor+"')]");

	}

	public static By btnchoosepodpack=By.xpath("//*[text()='Choose pod pack']");

	public static By starterbundleselected=By.xpath("//*[contains(text(),'Your choice of ePod 2 ')]");

	// Proceed to checkout button
	public static By btnproceed = By.xpath(".//*[text()='Proceed to checkout']");

	//one time purchase
	public static By lnkOneTimePurchases=By.xpath("(.//*[text() = 'One time purchases'])/..");

	//promocode
	public static By txtpromotion=By.xpath("(.//*[text() = 'Promotion Applied'])/..");

	// Discount code "EPOD STARTER BUNDLE" in your cart page
	public static By weDiscountcode = By.xpath("(.//*[text()='EPOD STARTER BUNDLE'])[2]");

	// remove button in cart page
	public static By btnremove = By.xpath("(.//*[contains(@class,'Product__Remove-')])[1]");



	//logout
	public static By btnlogout=By.xpath("(//*[text()='Logout'])[2]");


	//edit details
	public static By btneditdetails=By.xpath("//*[text()='Edit details']");

	//cancel
	public static By btncancel=By.xpath("//*[text()='Cancel']");


	//link Personalize your ePod
	public static By lnkPersonalizeyourePod=By.xpath("//*[contains(text(),'Personalize your ePod')]");

	//Link Shop ePod 2 Skins
	public static By lnkShopePod2Skin=By.xpath("//*[contains(text(),'Shop Device Skins')]");

	//text THE ART
	public static By txtTheArt=By.xpath("(//*[contains(text(),'Collection')])[1]");

	//Buy Now
	public static By btnBuynow=By.xpath("(//a[contains(@href,'/ca/en/buy-online/vype-epod-skins/clavo/')])[3]");

	//link Core Collections
	public static By txtcorecollection = By.xpath("(//a[contains(@href,'/ca/en/buy-online/vype-epod-skins/')])");

	//text Skil Clavo
	public static By txtskin = By.xpath("//*[text()='Choose your quantities']/../../header/h1");

	// txt Price
	public static By txtprice = By.xpath("//*[text()='Choose your quantities']/../../header/h3");

	//btn '-'
	public static By btnminus = By.xpath("//*[text()='Choose your quantities']/../div/button[1]");

	//method
	public static By imgpodSkin(String Skin) {
		return By.xpath("//*[@alt='" + Skin + " ePod2 skin']");

	}

	// Buy now in skins page
	public static By btnBuynow1 = By.xpath("(//*[text()='Buy now'])");

	public static By lnkMyAccount = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[1]");
	// My Rewards);


	public static By pgMyRewards = By.xpath("(//*[text()='Rewards'])");
	public static By pgMySavings = By.xpath("(//*[text()='Savings'])");
	public static By pgMySubscription = By.xpath("(//*[text()='Subscription'])");



	public static By lnkCreateMixAndMatch2PackBundle=By.xpath("(.//*[@href='/ca/en/buy-online/multipack-2/'])[2]");

	public static By txtChoose2Packs=By.xpath("(.//*[text()='Choose 2 packs to add to your bundle'])");

	public static By txtmultipack2=By.xpath("(.//*[contains(text(),'Select 2 packs')])");





	public static By lnkStarterBundle = By.xpath(".//*[contains(text(),'Starter Bundle')]");

	/*public static By lnkForPods(String a, String b) {
		return By.xpath(".//*[text()='" + a + " for $" + b + " ePod Pods']");
	}*/


	public static By txtHealthwarning = By.xpath(".//div[contains(@class, 'HealthWarning__FigureWrap-')]");

	public static By PersonalizeYourePod = By.xpath("//*[text()='Personalize your ePod']");

	public static By lnkExperiencevuseXu = By.xpath("//*[text()='Experience vuseXu']");



	public static By lnkePodSkins = By.xpath("//*[text()='Shop Device Skins']");


	public static By packPage = By.xpath(".//*[text()='ePod Vape Pods']");

	public static By txtSubmitRequest = By.xpath("//*[text()='Submit a request']");

	public static By lnkSubscribeSave = By.xpath("//*[contains(text(),'Subscribe ')]");

	public static By lnkPassOnTheSavings = By.xpath(".//*[text()='Pass On The Savings (up to $200)']");

	public static By txtPassOntheSavings = By.xpath("(.//*[contains(text(),'Pass on ')])[2]");

	public static By lnkVuseRewards = By.xpath(".//*[text()='Vuse Rewards']");

	public static By txtinVuseRewards = By.xpath(".//*[text()='Get your perks']");

	public static By KnowYourVape = By.xpath("//*[text()='Know your Vape']");

	public static final By txtVuseNews = By.xpath(".//*[text()='Vuse News']");

	public static By LemonBerry = By.xpath("(.//*[text()='Lemon Berry'])[1]");

	public static By VuseStore = By.xpath("(//*[text()='Vuse News'])");

	public static By OnlineBenefits = By.xpath("//*[text()='Online Exclusive Benefits']");

	public static By txtOnlineBenefits = By.xpath("//*[text()='Vuse.com']");

	public static By lnkShippingndDelivery = By.xpath(".//*[text()='Shipping & Delivery']");
	
	public static By lnkHelp = By.xpath(".//button[text()='Help']");
	
	public static By lnkAllow = By.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[3]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.Button[2]");
	
	public static By lnkAllowwhile = By.xpath(".//*[text()='Allow while only using app']");

	public static By txtinShippingndDelivery = By.xpath(
			".//*[text()='Get the Vuse products you want with our range of quick and convenient shipping options.']");

	public static By lnkStorelocator = By.xpath("(.//*[text()='Store Locator'])[2]");

	public static By pgeStoreLocator1 = By.xpath(".//*[text()='Find a store near you']");

	public static By pgeStoreLocator = By.xpath(".//*[text()='Find a Vuse Store near you']");

	public static By clickVicon = By.xpath("//*[@class=\"Nav__Container-sc-9z4o2m-0 eqNYxy mobile-header-container\"]//*[@class=\"Nav__LogoWrap-sc-9z4o2m-3 jecGNH\"]");

	public static By txtSearch = By.xpath("//*[text()='Get in touch']");

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

	//public static By lnkAllAccessories=By.xpath("//*[text()='All Accessories']");

	//------------------Sandeepa------------------/
	public static By pgSubscribeAndSave =By.xpath("//*[@alt='Subscribe and Save']");
	public static By pgsubscribe=By.xpath("(//*[contains(@class,'Banner__Banner')])[2]");
	public static By whysubscribe=By.xpath("//*[contains(text(),'Why ')]");
	public static By whysubscribeOffers=By.xpath("//*[contains(@class,'DescriptiveVisual__DescriptiveVisualWrapper-sc-1dfou72-1 cnv')]");
	public static By txtfaq_pgsubscription=By.xpath("(//*[contains(text(),'Frequently Asked ')])[1]");
	public static By pgsubscription_faqs=By.xpath("(//*[contains(@class,'Question__Container')])");

	public static By weFAQList=By.xpath("//*[contains(@class,'Question__Container')]");

	//Faqlist ans
	public static By weFAQListAns=By.xpath("//*[contains(@class,'Question__Answer')]");



	//text why subscribe icons
	public static By whysubscribetxt=By.xpath("//*[contains(@class,'DescriptiveVisual__DescriptiveVisualWrapper-sc-1dfou72-1 kT')]");

	//text subscription plan
	public static By txtsubscriptionplan=By.xpath("//*[contains(text(),'A Plan ')]");

	//text how it works
	public static By txthowitworks=By.xpath("//*[contains(text(),'How It Works')]");

	//how it works icons
	public static By txthowitworksicons=By.xpath("//*[contains(@class,'DescriptiveVisual__DescriptiveVisualWrapper-sc-1dfou72-1 e')]");

	//Faq question
	//public static By questions=By.xpath("//*[contains(@placeholder,'Type keywords ')]");


	public static By popupans=By.xpath("//*[text()='FAQ']/parent::div");

	public static By TxtSubscribeAndSave=By.xpath(".//*[contains(@class,'styles__CardTitle')]");

	public static By txtCheckout=By.xpath("//*[text()='Checkout']");
	public static By eligibilitypopupans=By.xpath("//*[text()='Eligibility']/parent::div");
	public static By questions=By.xpath("//*[contains(@placeholder,'Type keywords ')]");
	public static By txtfaq_pgvuseplus=By.xpath("(//*[contains(text(),'Questions? See answers')])[1]");
	public static By pgvuseplus_faqs=By.xpath("(//*[contains(@class,'Question__Container')])");
	public static By lnksitemap = By.xpath("//*[text() = 'Sitemap']");
	public static By pgsitemap = By.xpath("(//*[text() = 'Sitemap'])[1]");


	public static By txtePodDevice = By.xpath("//*[text()='All ePod devices']");
	public static By pgePodDevice = By.xpath("(//*[contains(text(),'Own the power')])[1]");

	public static By lnkepod= By.xpath("(.//*[text()='ePod 2'])[2]");

	//Resume Subscription
	public static By btnresume=By.xpath("//*[text()='Resume']");

	public static By txtUsernamefield= By.xpath("//*[@class='Fieldset__Container-sc-5hzspr-0 dpIgUX']/div[1]/div[1]/div[1]");


	public static By LemonBerryCnt = By.xpath("(.//*[text()='A blend of lemon, citrus and pink grapefruit notes, highlighted by hints of berries.'])");



	public static By btnminiicon(String icon)
	{
		return By.xpath("//*[contains(text(),'"+icon+"')]");

	}
	
	//Vishnu
	
	
	public static By txtCoreCollection =By.xpath("//*[text()='Core Collection']");
	public static By txtDefaultSkin = By.xpath("//*[text()='Mystique']");

	
	public static By txtChooseyourQuantity = By.xpath("//*[text()='Choose your quantities']");


	public static By lnkheaders=By.xpath("//*[contains(@class,'Nav__List')]");

	
	public static By txtCollectionX = By.xpath("//*[text()='Collection X']");

	
	public static By helpall = By.xpath("//*[text()='FAQ']/../../..");
	
	//Question mark xpath in phone
    public static By weQuestionMark2 = By.xpath("(//*[text()='(?)'])[2]");
    //tool tip content
    public static By Tooltipscontent = By.xpath(".//*[@data-tip='Add delivery details (such as buzzer code) to help us deliver your order. 35 characters max.']");
    //tool tip content 2
    public static By Tooltipconent2 = By.xpath(" We require this information to get in touch with you about your order or vype account. We will also use this information to follow-up on your purchase.");

    //Added on 10Aug2022 - honey
	
  	public static By txtDatePayemtAndShipping =By.xpath("//*[@class='SubscriptionDetails__Section-sc-ftr7ny-1 jMAbYk']");
  	
  	 public static By btnupdate=By.xpath("//*[text()='Update']");
  	 
  	 
  	public static By txtDraftModal = By.xpath(".//*[text()='Looks like you already have an active Subscription']");
 // "Go to account" button in draft sub modal
	public static By btnGotoAccount = By.xpath(".//*[text()='Go to account']");

	// text "Draft subscription order" in Subscription tab
	public static By txtDraftsub = By.xpath(".//*[text()='Draft subscription order ']");

	// Discard link in Subscription tab
	public static By lnkDiscard = By.xpath(".//*[text()='Discard']");

	// Submit update button in Subscription tab
	public static By btnSubmitUpdate = By.xpath("(.//*[text()='Submit update'])[2]");

	// Continue Modification button in Subscription tab
	public static By btnContinueModification = By.xpath("(.//*[text()='Continue modification'])[2]");
	
	// ******************************************************************************************
	// Draft Order text After clicking on "Continue Modification" button in
	// Subscription tab (Date 02/09/2021)
	public static By txtDraftOrder = By.xpath(".//*[text()='Draft Order']");

	// Back link in draft order page
	public static By lnkBack = By.xpath("//a[contains(text(),'Back')]");

	// Order Summary section in draft order page
	public static By txtDraftOrderSummary = By.xpath(".//*[text()='Order Summary']");

	// Filter by option in Draft order page
	
	public static By Draftorder = By.xpath("//*[@class='PageHeader__Heading-sc-vzm0zs-2 cxTpxC']");
	
	public static By txtFilterby = By.xpath("(.//*[text()='Filter by'])[2]/parent::div//div//div");
	//(.//*[text()='Filter by'])[2]/parent::div//div//div

	// list of Pods filter
	public static By wePodsFilterlist = By.xpath(".//*[contains(@class,'PodsFilter__Menu-')]");

	// Zero Nicotine option from the list
	public static By txtZeroNicotine = By.xpath("(.//*[text()='Zero Nicotine Options'])[1]");

	// remove button for the flavour in order summary section
	public static By btnRemove = By.xpath("(.//*[text()='remove'])[1]");

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
	
	// Tobacco & Mints list option in Filterby dropdown
	public static By txtTobaccoMints = By.xpath("//*[@text='Mints']");

	// Quantity Increment button on Add Modal
	public static By btnQtyIncrement = By.xpath("//*[contains(@class,'QuantityPicker__Button')][2]");
	
	// Flavor in Order summary section
	public static By txtflavorInOrderSummary(String flavor) {
		return By.xpath("//*[text()='Order Summary']/following::span[contains(text(),'" + flavor + "')][1]");
	}

	
	// Subscription update message
	public static By txtSubUpdate = By.xpath(".//*[text()='Your subscription is successfully updated! Please give an hour for the confirmation to reach you.']");


	// *****************************************************************************************
	// Discard Subscription Modal text 1 (Date 02/08/2021)
	public static By txt1InDiscardSubModal = By.xpath(".//*[text()='Discard Draft Subscription Order']");

	// Discard Subscription Modal text 2
	public static By txt2InDiscardSubModal = By
			.xpath(".//*[text()='Are you sure you want to discard this draft order? This action cannot be undone.']");

	// Button "Yes Discard" in Discard Sub Modal
	public static By btnYesDiscard = By.xpath(".//*[text()='Yes, discard']");

	// Button "No, return" in Discard Sub Modal
	public static By btnNoReturn = By.xpath(".//*[text()='No, return']");
	
	
	// Close modal login page
	public static By btnCloselogin = By.xpath("//*[contains(@class,'CloseButton__Button')]");
	
	// Login Modal page
	public static By pgloginModal = By.xpath("//*[contains(@class,'LogInModal__Wrapper')]");

	
	public static By btnSubscribeAndSave = By.xpath("(.//*[text()='Subscribe & save'])[1]");
	
	//Acessories
    public static By lnkAccesories=By.xpath("(//*[contains(text(),'Accessories')])[1]");




//Add
    public static By add=By.xpath("//*[contains(text(),'Add ')]/../../button[1]");



public static By lnkAllAccessories=By.xpath("//*[contains(@class,'Accessory__Name-')]");

public static By lnkForPods(String a, String b) {
    return By.xpath("//*[text()='Multipack " + a + ": save " + b + "%']");
    
    
    
    
}
public static By lnksubscribesave=By.xpath("//*[text()='Subscribe & Save (up to 33%)']");

public static By FirstName = By.xpath("(.//*[@name='firstName'])[1]");


public static By LastName = By.xpath("(.//*[@name='lastName'])[1]");

public static By closeFlavor = By.xpath("(//*[contains(@class,'Icon__Container-')])[14]");



//Updated

public static By closemenu= By.xpath(".//*[contains(@class,'MobileNav__CloseIcon')]");

public static By lnkePodVapingProducts=By.xpath("//*[contains(text(),'ePod Vaping Products')]");

public static By FlavorPopUp= By.xpath("//div[contains(@class,'MobileModal__Inner')]");

public static By listlines=By.xpath("//*[contains(@class,'Total__Line-')]");

public static By wedropdown= By.xpath(".//*[text()='Show order summary']/..//*[contains(@class,'Icon__Container-sc')]");



public static By listlines(int i)
{
    return By.xpath("(//*[contains(@class,'Total__Line-')])["+(i+1)+"]");
}



public static  By txtdeliveryoptions=By.xpath("//*[contains(@class,'SelectBox__Label')]");
public static By txtDiscount=By.xpath("(//*[text()='Discount'])/../../strong");





public static By txtbillingpage=By.xpath("//*[contains(text(),'Almost there')]");



public static By txtdelivery(String delivery)
{
    return By.xpath("//*[contains(text(),'"+delivery+"')]");
}
public static By txtExciseTax = By.xpath("(//*[text()='Excise Tax'])[1]/following-sibling::strong");



public static By weOrderConfirmation = By.xpath("//*[text()='Order confirmation']");




public static By showordersummary=By.xpath("//*[contains(text(),'Show order summary')]");

  public static By txtdeliverycharges(String type)
   {
    return By.xpath("//*[contains(text(),'"+type+"')]/../..//*[contains(@class,'SelectBox__Price')]");

   }

public static By txtdelivery1(String delivery)
{
	return By.xpath("(//*[contains(text(),'"+delivery+"')])[1]");
}

public static By txtdelivery2(String delivery)
{
	return By.xpath("(//*[contains(text(),'"+delivery+"')])[2]");
}

public static By OrderSummary=By.xpath("//*[contains(text(),'Show order summary')]/..");

//Updated Bhavitha

public static By txtDatepayment = By.xpath("//*[contains(@class,'Summary__Main-sc-16pa2df-2 zyPBr')]");


//updated by sasikala

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

public static By txtFedexNext = By.xpath("//*[contains(text(),'Fedex - Next day')]/..");

public static By txtNextDayDel = By.xpath("//*[text()='Next day delivery']");


//for trail
public static By btndevicecolor= By.xpath(".//*[text()='01. Choose your device colour']");

public static By btndevicecolorsel= By.xpath(".//*[contains(@class,'Step2__Step2SwatchWrap')]");

public static By btnchosseimage= By.xpath(".//*[contains(@class,'Step2__Step2MobileDevice-sc')]");

public static By btnflavour= By.xpath(".//*[contains(@class,'FlavourList__Container-sc')]");

public static By btnnicstr= By.xpath(".//*[contains(text(),'Choose Nicotine Strength (w/w)')]");

public static By btnflavorimage(String flavor) {
	// TODO Auto-generated method stub
	return By.xpath("(.//*[contains(@alt,'"+flavor+"')])[2]");
}

public static By btnstrength(String Strength)
{
return By.xpath("//*[text()='Choose pod pack']/../../div[4]//*[text()='"+Strength+"%']");

}

public static By imgflvorbundle=By.xpath("//*[@data-tip='Blueberry Ice']");

public static By imgflvorbundle(String flavor) {
	// TODO Auto-generated method stub
	return By.xpath("//*[@data-tip='"+flavor+"']");
}

public static By btnaddrings=By.xpath(" //*[text()='ePod Rings']/../../../footer/div[2]/button/span");

public static By pgengravingdevice = By.xpath("//*[contains(text(),'Pick device colour')]");



public static By skinTypCore(String skin) {
return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-plus/']");


}
public static By Skintype(String Skin) {
return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-skins/"+Skin+"-epod-2/']");


}

public static By skinType(String skin) {
return By.xpath(".//*[@href='/ca/en/buy-online/vype-epod-2-plus-skins/"+skin+"-epod-2-plus/']");


}

public static By lsttiles(int i) {
    // TODO Auto-generated method stub
    return By.xpath("(//*[contains(@class, 'AccountCard__Container-sc')])["+(i+1)+"]");
}




//sireesha xpaths

public static By lsttiles =By.xpath("//*[contains(@class, 'AccountCard__Container-sc')]");
// online exclusive benefits
public static By tilesvape = By.xpath("(.//*[contains(@class,'HomeOffer__Container-sc')])");

public static By tileepod = By.xpath("(.//*[contains(@class,'HomeOffer__OfferLogoImg-sc')])[1]");

public static By tilepod = By.xpath(".//*[text()='Vape Pods']");

public static By tilevusexu = By.xpath("(.//*[contains(@class,'HomeOffer__OfferLogoImg-sc')])[2]");

public static By btnletgo = By.xpath("(.//*[contains(@class,'Button__Label-sc')])[1]");

public static By btnsubscribe = By.xpath(".//*[text()='Subscribe now']");

public static By btnshopnow = By.xpath(".//*[text()='Shop now']");

public static By btngetstarted = By.xpath(".//*[text()='Get started']");

public static By lnkAbout = By.xpath("//*[@data-tracking='nav--link--text--About']");

public static By lnksmenusection = By.xpath("//*[contains(@class,'MobileNav__Sc')]");

public static final By txtOnlineExclusive = By.xpath("//*[text()='Online Exclusive Benefits']");





public static By tilesvape(int i) {
	// TODO Auto-generated method stub
	return By.xpath("(.//*[contains(@class,'HomeOffer__Container-sc')])["+(i+1)+"]");
}


public static By pgMyAccount = By.xpath(".//*[text()='Profile']");

//akhila new

public static By websiteurl = By.xpath("//a[@href='https://www.vuse.com/ca/en/']");

public static By lnkAccdetailspage = By.xpath("//a[@href='https://www.vuse.com/ca/en/account']");

public static By txtAddedtocart =By.xpath("//div[@id='toast-portal']//p");

public static By flavorAddButtonInePodVapePodsPage(String flavor) {
  return By.xpath("(//h1[contains(@class,'Card__Title') and text()='"+flavor+"'])/..//div[4]//button[1]");
}








public static By BirthadayBadgeDisabled=By.xpath("//*[@class='Badge__Wrapper-sc-1w8jvlk-2 bpJIbj']");
public static By BirthadayDiscount=By.xpath("//*[text()='Points earned']/../following-sibling::strong");






//birthday bonus

public static By txtBonus = By.xpath("(.//*[contains(@class,'PointsEarned__Code')])/../..");

public static By lnkflavour(String flavor)
{
	return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//button[1]");
	//return By.xpath("//h1[contains(@class,'Card__Title') and text()='"+flavor+"']/../div[4]//*[contains(text(),'ADD')]");

}

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


//Cookie Policy Page content
public static By txtcookiePolicyContent = By.xpath("(//*[text()='Cookie Policy'])[1]/../following-sibling::div");



}


