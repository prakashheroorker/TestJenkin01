package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_Common {

	// PreLogin

	// Province Drop down
	public static By btnLoginorRegister = By.xpath("(.//*[@data-tracking='nav--link--button--Login/Register'])[1]");

	// Login button on registration Modal
	public static By btnLoginRegisterModal = By.xpath("(.//*[text()='Log in'])[1]");

	// Sign Up link
	public static By lnkSignUp = By.xpath("(.//*[text()='Sign up'])[1]");

	// SignUp Modal
	public static By lnkSignUpModal = By.xpath("(.//*[text()='Sign up'])[1]");

	// User name text field login Modal
	public static By txtUsername = By.xpath("(.//*[@name='email'])[1]");
	public static By registrationForm = By
			.xpath(".//*[contains(text(),'Just a few more steps to get you ready for shipping')]");

	// Password text field login Modal
	public static By txtPassword = By.xpath("(.//*[@name='password'])[1]");

	// Login button on Login Modal
	public static By btnLogin = By.xpath("(.//*[text()='Log in'])[2]");

	// Forgot link
	public static By lnkForgot = By.xpath("//*[@to='/forgot-password']");

	// PostLogin
	public static By btnAccount = By
			.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/following-sibling::div[3]");

	// Products link from the main menu navigation
	public static By lnkProducts = By.xpath("//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Shop']");
	// "(.//*[@data-tracking='nav--link--text--Vape_Kits'])[1]");
	public static By lnkShop = By.xpath("//*[@class='MegaMenu__Trigger-vlpfsa-1 cUsKZD']//*[text()='Shop']");

	// Link save
	public static By lnkSave = By.xpath("(//*[text()='Save'])[1]");

	// Cartridges link under the epen3 section
	public static By lnkCartridgesEpen3 = By
			.xpath(".//*[contains(@href,'buy-online/vype-epen-3-cartridges') and contains(text(),'Pods')]");

	// Starter Kit link under the ePod section
	public static By lnkStarterKitEpod = By.xpath("//a[contains(@href,'/ca/en/vype-epod-starter-kit')]");
	public static By lnkDevices = By.xpath("(//*[@href='/ca/en/vype-epod-starter-kit/'])[1]");
	// Cart Icon from the main menu navigation
	public static By lnkCartIcon = By.xpath("(.//a[contains(@href,'/cart')])[1]");

	// link Solo devices

	public static By lnkSoloDevice = By.xpath(".//*[text()='Solo Device']");

	public static By pgVypeEPod = By.xpath(".//h1[text()='ePod']");

	// View Cart button on Hovering the Cart Icon
	public static By btnViewCart = By.xpath("(.//a[contains(@href,'/cart')])[2]");

	// Skins link under the ePod section
	public static By lnkSkinsEpod = By.xpath("//a[contains(@href,'/buy-online/vype-epod-skins') and text()='Skins']");

	// Charger link under ePod section
	public static By lnkCharger = By.xpath("//a[contains(@href,'/buy-online/vype-epod-charger')]");

	// Pods link under ePod section
	public static By lnkPodsePod = By.xpath("(.//*[@href='/buy-online/vype-epod-vpro-cartridges'])[1]");

	// Pods under epods
	public static By lnkEpodPods = By.xpath("(.//a[contains(@href,'cartridges')][text()='Pods'])[2]");

	// mini cart single row product
	public static By weTxtAddedProduct(String flavor) {
		return By.xpath("(.//*[contains(@class,'TinyCart__Cart')]//*[contains(text(),'" + flavor + "')])[1]");
	}

	// Subtotal value in Mini cart
	public static By weTtSubtotalValueMiniCart = By
			.xpath("((.//*[contains(@class,'TinyCart')]//*[text()='Subtotal'])/..//following-sibling::strong)[1]");

	// mini cart
	public static By weMiniCart = By.xpath("(.//*[@href='/cart']//span[text()='View cart'])[1]");

	// Subscription link in my account page
	public static By lnkSubscription = By.xpath(".//a[contains(@href,'/account')]//*[text()='Subscription']");

	// Active Subscription
	public static By weActiveSubscriptions = By.xpath("(//*[@class='subscriptions__Heading-sc-11juu65-2 hypNrj'])[1]");
	// "(.//*[contains(@class,'subscriptions__Background')]//following-sibling::div)[1]");

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

	// Active Subscription text
	public static By txtActiveSubscription = By
			.xpath(".//*[contains(@class,'subscriptions')]//*[contains(text(),'Active')]");

	// Cancel Subscription modal
	public static By weCancelSubscriptionModal = By.xpath(".//*[contains(@class,'CancelSubscriptionModal')]");

	// Cancel subscription modal text
	public static By txtCancelSubscriptionModal = By
			.xpath(".//*[contains(text(),'cancel your recurring subscription')]");

	// Yes, Cancel button in cancel subscription modal
	public static By btnYesCancelModal = By.xpath(".//button//*[text()='Yes, cancel']");

	// No Subscription plan yet text
	public static By txtNoSubscription = By.xpath(".//h4[text()='You have no subscription plan yet']");

	// My account link under account icon
	public static By lnkMyAccount = By.xpath("(//*[text()='My Account'])[1]");

	// Starter Kit link under the ePen3 section
	public static By lnkStarterKitEpen3 = By.xpath(".//*[@href='/buy-online/epen-3'][text()='Device']");

	// Subtotal text in mini cart
	public static By weTxtSubtotalMiniCart = By.xpath("(.//*[contains(@class,'TinyCart')]//*[text()='Subtotal'])[1]");

	// Cartridges link under the epen3 section
	public static By lnkEpen3Pods = By.xpath("(.//*[@href='/buy-online/vype-epen-3-cartridges'])[1]");

	// Email TextField //Added by Sandeepa S
	public static By txtEmail = By.xpath("(.//*[@name='email'])");

	// Email TextField //Added by Sandeepa S
	public static By txtPwd = By.xpath("(.//*[@name='password'])");

	// LandingPage added by Sandeepa
	public static By preLandingHomePage = By.xpath("(.//*[@class='Modal__Container-lj0245-0 kdrdPv'])[1]");

	// Added by Sandeepa on 28/05/2020.
	// View Cart button on Hovering the Cart Icon
	public static By textViewCart = By.xpath("(//*[text()='View cart'])[1]");

	// Added by Sandeepa on 11/06/2020
	// starterIt(devices)under ePen
	public static By lnkDevice = By.xpath("(.//*[@href='/buy-online/epen-3'])");

	// text "Do you want to add cartridges
	public static By txtDoYouWantToAdd = By.xpath("(.//*[text()='Do you want to add cartridges to your order?'])");

	// flavours
	public static By lnkFlavous = By.xpath("(.//*[@class='BuyCartridges__Inner-sc-1liiork-1 cMPHle'])");

	// text "choose your color
	public static By txtChooseColor = By.xpath("(.//*[text()='Choose your colour'])[2]");

	// 6 different colors
	public static By lnkColors = By.xpath("(.//*[text()='Choose your colour'])[2]/../../following-sibling::div");

	// Black color
	public static By lnkBlackColors = By.xpath("//*[@data-tip='Black']");

	// black Page background
	public static By PgeBlackBackgroundColor = By
			.xpath(".//*[contains(@src,'/images/products/epod/background/black.jpg')]");

	// blue color
	public static By lnkBlue = By.xpath("//*[@data-tip='Blue']");

	// blue Page background
	public static By PgeBlueBackgroundColor = By
			.xpath(".//*[contains(@src,'/images/products/epod/background/blue.jpg')]");

	// Link FAQs in footer section pre-login
	public static By lnkFAQs = By.xpath("(.//a[contains(@href,'/faq')])[1]");

	/*
	 * ############################### Age Certify
	 * Page################################
	 */

	// Text on Age Certify Page
	public static By weAgeCertify = By.xpath(
			".//*[text()='To gain access to our platform, please select your province of residence and confirm you have reached the legal age to purchase vaping products in that province.']");
	// Province Drop down
	public static By weDropDownProvince = By.xpath("(.//*[@name='province'])[1]");
	// I am 18/19 or over button
	public static By btnIam19orOver = By.xpath("(//*[contains(text(),'I am')])[1]");

	// I am not 18 button
	public static By btnIamNot18 = By.xpath(".//button//span[contains(text(),'I am not')]");
	// Under 18 Error message
	public static By txtErrorMustBeAtLeast18 = By.xpath(".//div[@type='error']//p");

	// profile icon
	public static By btnProfile = By
			.xpath("//*[@data-tracking='nav--link--image--Vype_Home']/following-sibling::div[3]");

	// View cart
	public static By weViewCart = By.xpath("(.//*[@class='ButtonGroup__Container-veyrlq-0 gFgdJk'])[1]");

	// mini cart icon
	public static By weMiniCartIcon = By.xpath("(.//*[@class='TinyCart__IconWrap-i4vlf8-2 bCKLLv'])[1]");

	// ***************************************************************************************************************************************************
	// ***************Account
	// Section****************************************************************************************
	// Account dropdown
	public static By drpAccountSection = By.xpath("//*[contains(@class,'AccountDropdown__Dropdown')]");

	// link My Rewards
	public static By lnkMyRewards = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[2]");
	
	


	// link My Saving
	public static By lnkMySavings = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[3]");

	// link My Orders
	public static By lnkMyOrders = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[4]");

	// link My Subscription
	public static By lnkMySubscription = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[5]");

	// Myaccounts container
	public static By weMyacctContetnt = By.xpath("(//*[contains(@class,'AccountCard__Container')])[1]");

	// link Terms and Conditions
	public static By lnkTermsConditions = By.xpath("//a[text()='Terms & Conditions']");

	// link learn more
	public static By lnkLearnMore = By.xpath("//a[text()='Learn more']");

	// Pass on the savings page
	public static By pgPassonSavings = By.xpath("//h1[text()='the savings']");

	// button Copy
	public static By btnCopy = By.xpath("//*[contains(@class,'Share__Action') and text()='Copy']");

	// button link copied
	public static By btnLinkCopied = By.xpath("//*[contains(@class,'Share__Action') and text()='Link copied']");

	// Active credtis
	public static By weActiveCredits = By.xpath("//*[text()='Active credits']");

	// Order section content
	public static By weOrderContent = By.xpath("(//*[contains(@class,'OrderTemplate__Container')])[1]");
			// "(//*[contains(@class,'Order__Container')])[1]");

	// Button profile edit
	public static By btnProfileEdit = By.xpath("//button[contains(@class,'Profile__Edit')]");

	// Edit User modal
	public static By weUserModal = By.xpath("//*[text()='Edit your information']");

	// Close Modal
	public static By btnCloseUserModal = By.xpath("(//*[contains(@class,'CloseButton__Button')])[1]");

	// Button Add payment method
	public static By btnAddPayment = By.xpath("//button[text()='+ Add payment method']");

	// Add Payment modal
	public static By weAddPayemntModal = By.xpath("//*[text()='Add payment method']");

	// Close payment modal
	public static By btnclosePayModal = By.xpath("(//*[contains(@class,'CloseButton__Button')])[1]");

	// button delete card
	public static By btnDeletecard = By.xpath("(//button[contains(@class,'PaymentMethods__DeleteCard')])[1]");

	// Delete payment method Modal
	public static By weDeletePaymentMethod = By.xpath("//*[text()='Delete payment method']");

	// No return button
	public static By btnNoReturn = By.xpath("//*[text()='No, return']");

	// Subscription details content
	public static By weSubscriptionDetails = By.xpath("//*[contains(@class,'SubscriptionDetails__Container')]");

	// Button Edit details
	public static By btnEditDetails = By.xpath("//*[text()='Edit details']");

	// Edit details page
	public static By pgEditDetails = By.xpath("//*[text()='Update']");

	// Pause button
	public static By btnPause = By.xpath("//button[text()='Pause']");

	// Pause subscription modal
	public static By wePauseSubscription = By.xpath("//*[contains(@class,'PauseSubscriptionModal')]");

	// Pause Modal close
	public static By btnPauseModalClose = By.xpath("(//*[contains(@class,'Modal__Close')])[7]");

	// Cancel button
	public static By btnCancel = By.xpath("//button[text()='Cancel']");

	// Cancel Subscription Modal
	public static By weCancelSubModal = By.xpath("(//*[contains(@class,'CancelSubscriptionModal')])");

	// Cancel Modal close
	public static By btnCancelModalClose = By.xpath("(//*[contains(@class,'CloseButton__Button')])[1]");

	// New Launches section
	// Shop link
	public static By lnkSHOP = By.xpath("//*[@data-tracking='nav--link--text--Shop']");

	// Skins link
	public static By lnkSkin = By.xpath("//*[@data-tracking='nav--link--text--Skins']");

	// Liquid colour devices link
	public static By lnkLiquidColourDevice = By.xpath("//*[@data-tracking='nav--link--text--Liquid Colour Devices']");

	// Liquid Colour devices page
	public static By pgLiquidColourDevice = By.xpath("//h1[text()='Liquid Colour Collection']");

	// Differecnt colour options
	public static By weColourOptions = By.xpath("(//*[contains(@class,'BuyDevices__List')])[1]/div/child::node()");

	// Button Add items and go to cart
	public static By btnAddItem = By.xpath("//*[text()='Add items & go to cart']");

	// Citrus gen ePdod pod link
	public static By lnkCitrusGin = By.xpath("//*[@data-tracking='nav--link--text--Citrus Gin ePod Pod']");

	// Pinapple melon link
	public static By lnkPineappleMelon = By.xpath("//*[@data-tracking='nav--link--text--Pineapple Melon ePod Pod']");

	// Skins page
	public static By pgSkins = By.xpath("//*[text()='Limited Edition']");

	// Quantity + button
	public static By wePlusQty = By.xpath("(//*[contains(@class,'QuantityPicker__Button')])[2]");

	// QuantityValue
	public static By weSkinQty = By.xpath("(//*[contains(@class,'QuantityPicker__Value')])[2]");

	// Limited Edition dropdown
	public static By weLimitedEdition = By.xpath("//*[contains(@class,'Nav__Title') and text()='Limited Edition']");

	// Limited Edition Expansion
	public static By weLimitedEditionExpansion = By
			.xpath("//*[contains(@class,'Nav__Collection')][1]/div/child::node()");

	public static By weLimitedEditionExpansionItem = By.xpath("(//a[contains(@class, 'Nav__ItemLabel')])");

	// Skins product header
	public static By weSkinspageheader = By.xpath("//h1[contains(@class, 'ProductPage__Name')]");

	// Core collection dropdown
	public static By weCorecollection = By.xpath("//*[contains(@class,'Nav__Title') and text()='Core Collection']");

	// Core collection expansion
	public static By weCoreCollectionExpansion = By
			.xpath("//*[contains(@class,'Nav__Collection')][2]/div/child::node()");

	// Design Challenge dropdown
	public static By weDesignChallenge = By.xpath("//*[contains(@class,'Nav__Title') and text()='Design challenge']");

	public static By btnAddtoCart = By.xpath("//*[text()='Add to cart']");

	// Button Buy now
	public static By btnBuyNow = By.xpath("//*[ text()='Buy now']");

	// link logout
	public static By lnklogout = By.xpath("(//*[contains(@class, 'AccountDropdown__Item')])[6]");
	
	//------------------------------------------------------------------------------------------------//
	/*Added by Vinod on Oct 5, 2021 */
	
	
	public static By weSubDisclaimer = By.xpath("//*[contains(@class,'SubscriptionDisclaimer')]");
	public static By popup=By.xpath(".//*[text()='Not Now']");
	
	//Update
	

	public static By conditionslist = By.xpath("//*[contains(@class,'Checkbox__Container-sc')]");
	
	//Added bu sireesha
	
	public static By btnback = By.xpath(".//*[text()='‹ Back']");

	public static By lnkpause = By.xpath(".//*[text()='Pause']");

	public static By wepauseSubModal = By.xpath(".//*[text()='Pause subscription']");

	public static By btnnoreturn = By.xpath(".//*[text()='No, return']");

	public static By pgSubscription = By.xpath(".//*[text()='Subscription']");

	public static By pgorders = By.xpath("(.//*[text()='Orders'])[2]");

	public static By txtpwdrules = By.xpath("//*[contains(@class,'PasswordValidationUI__Validationitem-sc')]/..");

	public static By btnnext = By.xpath(".//*[text()='Next']");

	public static By txtsigupfields = By.xpath("//*[contains(@class,'Fieldset__Container')]");

	public static By pgsignup = By.xpath(".//*[text()='Sign up']");

	public static By btnregister = By.xpath(".//*[text()='Register']");

	public static By pgrewards = By.xpath(".//*[text()='summary']");

}
