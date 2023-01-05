package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_SubscriptionLanding {

	//ePen and ePod tab
	public static By txtePenePod = By.xpath("(.//*[@data-tracking='nav--link--text--Vape_Kits']/../..//div//div//div)[1]");

	//Subscribe and Save section in ePen Pods page 	
	public static By txtSubsandSave = By.xpath("//*[text()='Subscribe & Save']");
			// "(//*[text()='Subscribe & Save'])[2]");

	//Learn more link
	public static By lnkLearnMore = By.xpath("//*[text()='Learn more']");

	//Header of Subscribe and Save page
	public static By txtHeader = By.xpath("//*[contains(@class,'Nav__Container')]");

	//Basic info on Subscribe and Save page
	public static By txtBasicInfo = By.xpath("//*[contains(text(),'Save up to')]");

	//Get started button Subscribe and Save page
	public static By btnGetStarted = By.xpath("//*[contains(text(),'Save up to')]/following-sibling::div"); //Xpath changed 3times (//*[@href='/buy-online/vype-epod-vpro-cartridges'])[2]
	public static By btnGetStarted2 = By.xpath("(//*[text()='Get started'])[1]");//use this if 1 is not working

	//SUBSCRIBING IS SUPER EASY text
	public static By txtSubscribingisEasy = By.xpath("//*[text()='Subscribing is super easy']");

	//Choose your plan text
	public static By txtChooseyourPlan = By.xpath("//*[text()='Choose your plan']");

	//A plan that suits you text
	public static By txtAPlanThatSuitsYou = By.xpath("//*[text()='A plan that suits you']");

	//A plan that suites you 3 html frame text
	public static By txtHtmlFrame = By.xpath("//*[@class='Features__Feature-sc-1dfrs6n-3 cvCkxA animated fadeInUp']");

	//Vuse+ members get extra benefits text
	public static By txtVuseMembersGet = By.xpath("(//*[contains(text(),'Vuse+ members')])[3]/..");
	//public static By txtAsASilver = By.xpath("(//*[@class='typography__H4-vraxd4-3 FreeDevice__Subheading-sc-18tmbrl-4 gPApkt animated fadeInUp'])[1]");
	//public static By txtAsAPlatinum = By.xpath("(//*[@class='typography__H4-vraxd4-3 FreeDevice__Subheading-sc-18tmbrl-4 gPApkt animated fadeInUp'])[2]");

	//The fastest route to Vuse+ text
	public static By txtFastestRoute = By.xpath("(//*[contains(text(),'Subscribe ')])[3]/..");
	public static By txtThisSubscriptionPlan = By.xpath("(//*[contains(text(),'Subscribe ')])[3]/..");
			// "//*[contains(text(),'This subscription plan is')]");

	//Questions? See answers below" HTML frame:
	public static By txtQuestions = By.xpath("//*[@class='FaqCategory__Trigger-sc-1oigogi-1 gneSwS']");

	//Questions? See answers below text
	public static By txtSeeBelow = By.xpath("//*[text()='Questions? See answers below']");

	//Modify the contents of your order whenever you want.
	public static By txtModifyTheContents = By.xpath("//*[text()='Modify the contents of your order whenever you want.']");

	//Adjust your delivery date and schedule at any time.
	public static By txtAdjustYourDate = By.xpath("//*[text()='Adjust your delivery date and schedule at any time.']");

	//Cancel or pause your subscription whenever you like.
	public static By txtCancelPause = By.xpath("//*[text()='Cancel or pause your subscription whenever you like.']");

	//Address in the footer
	public static By txtAddress = By.xpath("//*[contains(text(),'Imperial Tobacco')]");

	//Choose order type
	public static By txtChooseOrderType = By.xpath("//*[contains(text(),'Choose order type')]/../following-sibling::div[1]//div");

	//button subscribe and save 
	public static By btnSubscribeSave = By.xpath("//*[contains(text(),'Choose order type')]/../following-sibling::div[1]//div//span[contains(text(),'Subscribe & save')]");

	//Subscribe and save button after adding nicotine strength
	public static By btnSave = By.xpath("//*[contains(text(),'You can cancel')]/..//div//button//span");
	public static By btnSave2time = By.xpath("(//*[@class='Button__Label-sc-186nrqc-2 jpETUM'])[2]");


	//Cart updated
	public static By txtnumber = By.xpath("(//*[contains(@href,'/ca/en/cart')])[1]//div//div");

	//Continue shopping link in your cart page
	public static By lnkContinueShopping = By.xpath("//*[contains(text(),'Not ready to checkout')]//a");

	//free device with their first subscription order
	public static By txtFreeDevice = By.xpath("//*[contains(text(),'Complimentary device')]");

	//"Shipping is free" for the Subscription orders
	public static By txtShiping = By.xpath("//*[contains(text(),'Subscription')]/../following-sibling::div//*[text()='Shipping']/following-sibling::strong");//remove index 5 from 1st text

	//verify "Delivery page" is displayed
	public static By txtCheckout = By.xpath("//*[text()='Checkout']");

	//Canada Post standard
	public static By txtCanadaPostStandard = By.xpath("//*[contains(text(),'Canada Post (Standard)')]");

	//Canada Post Express
	public static By txtCanadaPostExpress = By.xpath("//*[contains(text(),'Canada Post (Express)')]");

	//Canada Post standard for Subscription order
	public static By txtsubscriptionCanadaPostStandard = By.xpath("//*[contains(text(),'CANADA POST (STANDARD)')]");


	//Your order includes a subscription
	public static By txtYourOrder = By.xpath("//*[contains(text(),'your subscription')]");

	//Date in order confirmation page
	public static By txtDate = By.xpath("(//*[@class='FieldsetItem__Container-jou4ig-0 fnyCsy u-1-1 u-1-2-sm'])[1]");

	//My account from order confirmation page
	public static By txtMyAccount = By.xpath("(//*[@class='typography__Capitalize-vraxd4-11 eYBPAR'])[1]");

	//Rewards page is displayed
	public static By txtRewards = By.xpath("(//a[contains(@href,'/account/rewards')])[2]");
	

	//Orders tab is displayed
	public static By txtOrders = By.xpath("(//a[contains(@href,'/account/orders')])[2]");
			// "//a[contains(@href,'/account/orders')]");

	//Subscription tab is displayed
	public static By txtSubscription = By.xpath("(//a[contains(@href,'/account/subscriptions')])[2]");

	//Profile tab is displayed
	public static By txtProfile = By.xpath("//a[contains(@href,'/account')]//span[text()='Profile']");

	//Edit link in subscription page
	public static By txtEdit = By.xpath("//*[text()='Edit']");
	public static By txtEditDetails = By.xpath("//*[text()='Edit details']");

	//Links for Pause or stop Subscription 
	public static By lnkPauseSubscription = By.xpath("//*[text()='Pause']/..");

	//shipping address
	public static By txtShippingAddress = By.name("address");
	
	public static By lnkBack = By.xpath("//*[text()='‹ Back']");

	//Pause link
	public static By lnkPause = By.xpath("//*[contains(text(),'Pause')]");

	//Pause subscription pop up
	public static By txtPausePopUp = By.xpath("//*[text()='Pause subscription']/..");

	//No return in Pause subscription pop up
	public static By txtNoReturn = By.xpath("//span[text()='No, return']");

	//discard changes button
	public static By btnDiscardChanges = By.xpath("//*[text()='Discard changes']");

	//Yes, pause the subscription" button
	public static By btnYesPause = By.xpath("//*[contains(text(),'Yes, pause subscription')]");

	//Your subscription has been successfully updated text
	public static By txtYourSubscriptionPaused = By.xpath("//*[contains(text(),'Your subscription has been successfully updated')]");

	//Unpause and save changes button
	public static By btnUnpauseSave = By.xpath("//*[contains(text(),'Unpause & save changes')]");

	//Active subscription 
	public static By txtActiveSubscription = By.xpath("//*[text()='Active']");
	public static By txtSubscriptionUpdated =By.xpath("(.//*[text()='Your subscription is successfully updated!'])");
	public static By txtPaused = By.xpath("//*[text()='Paused']");

	//Cancel subscription link
	public static By lnkCancelSubscription = By.xpath("//*[contains(text(),'Cancel')]");

	//Cancel subscription pop up
	public static By txtCancelPopUp = By.xpath("//*[contains(text(),'Cancel subscription')]/..");

	//Yes cancel button on cancel subscription pop up
	public static By btnYesCancel = By.xpath("//*[contains(text(),'Yes, cancel')]");

	//You have no subscription plan yet in subscription page
	public static By txtNoSubscription = By.xpath("//*[contains(text(),'You have no subscription plan yet')]");

	//Subscription Canada post free
	public static By txtCanadaPostFree = By.xpath("//*[@class='SelectBox__Container-bqz5l1-0 kLAbBG']");


	//Passion fruit from epod pods page
	public static By txtPassionFruit = By.xpath("//*[@href='/buy-online/vype-epod-vpro-cartridges/passionfruit-fields']");

	//Passionfruit text after selecting passion fruit
	public static By txtPassion = By.xpath("//h1[@class='typography__H2-vraxd4-1 BuyOverview__Heading-sc-82rji4-2 tkmGY u-hide-medium-down']");

	public static By txtyoutube = By.xpath("//*[text()='Youtube']");

	//Active Subscriptions with date,payment,address,selection
	public static By txtDatePayment = By.xpath("//*[contains(@class,'Summary__Main-sc-16pa2df-2 zyPBr')]");
			// "//*[contains(@class,'FieldsetItem__Container')]");



	public static By txtAsASilver = By.xpath("(//*[@class='typography__H4-vraxd4-3 FreeDevice__Subheading-sc-18tmbrl-4 gPApkt animated fadeInUp'])[1]");
	public static By txtAsAPlatinum = By.xpath("(//*[@class='typography__H4-vraxd4-3 FreeDevice__Subheading-sc-18tmbrl-4 gPApkt animated fadeInUp'])[2]");


}
