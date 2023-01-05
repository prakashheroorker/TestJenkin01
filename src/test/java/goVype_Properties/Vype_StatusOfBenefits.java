package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_StatusOfBenefits {



	//Text "Hi Trudie, you've peaked at Platinum!"
	public static By txtHiTrudie=By.xpath(".//*[text()='Hi ']");
			// "(.//*[@class='typography__H3-vraxd4-2 TierProfileHeader__Heading-c8hvo0-2 dSSdoj'])");

	//Text "Congratulations! Platinum status gives you the most offers. Benefit now."
	public static By txtCongratulation=By.xpath("(.//*[contains(@class,'TierProfileHeader__Subheading')])");
			// "(.//*[@class='TierProfileHeader__Subheading-c8hvo0-3 iqjwpD'])");

	//Text"Please note that it might take a few minutes to sync your status".
	public static By txtSyncYourStatus=By.xpath("(.//*[text()='Please note that it might take a few minutes to sync your status.'])");




	//Text "Your other Platinum benefits"
	public static By txtYourPlatinumBenefits=By.xpath(".//*[text()='Your other ']");

	//Text "Your Status Progress"
	public static By txtYourStatusProgress=By.xpath("(.//*[text()='Your status progress'])");

	//Link Orders
	public static By lnkOrders=By.xpath("(.//*[text()='Orders'])");

	//Order conformation
	public static By txtOrderNumber=By.xpath("(.//*[text()='Order no:'])[1]");
			// "(.//*[@class='Order__OrderNumber-sc-1h51x8k-3 gZZpHn'])[26]");

	//order Date
	public static By txtOrderDate=By.xpath("(.//*[text()='Date: '])[1]");

	//Total $ value paid
	public static By txtTotalDollarValue=By.xpath("(.//*[text()='Total:'])[1]");

	//Number and type of product purchased.
	public static By txtPurchasedProductName=By.xpath("(.//*[@class='Order__Product-sc-1h51x8k-11 csXlR'])[2]");

	//Reorder
	public static By lnkReOrder=By.xpath("(.//*[text()='Reorder'])[1]");

	//Subscription link
	public static By lnkSubscription=By.xpath("(.//*[text()='Subscription'])[1]");

	//Content of SubcriptionPage(You have no subscription plan yet).
	public static By txtSubscriptionPage=By.xpath("(.//*[text()='You have no subscription plan yet'])");

	//Profile link.
	public static By lnkProfile=By.xpath("(.//*[text()='Profile'])");

	//email address in  profile Page.
	public static By txtEmailAddress=By.xpath("(.//*[text()='annil.ramroop@bat.com'])");

	//Password
	public static By txtPassword=By.xpath("(.//*[text()='•••••••••••••'])");

	//Address
	public static By txtAddress=By.xpath("(.//*[text()='123 Meow Street, Edmonton AB, A1A 1A1'])");

	//Phone number
	public static By txtPhoneNumber=By.xpath("//*[text()='Phone number']/..");

	//text "Please note if you unsubscribe, you will still receive certain transactional emails, such as messages related to your Vuse account and any orders you might place."
	public static By txtIfYouUnsubscribe=By.xpath("(.//*[@class='Profile__Disclaimer-sc-167mk7i-8 elRQqU'])");














}
