package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_Footer {
	//Link FAQs in footer section pre-login
	public static By lnkFAQs=By.xpath("//*[text()='FAQs']");
			// "(.//a[contains(@href,'/faq')])[1]");
	
	public static By lnkstorelocator=By.xpath("//*[text()='Store Locator']");
	//Location link in Contact Us Page
	public static By lnkLocation=By.xpath("//div[contains(@class,'Layout__Inner')]//a[2]");

	//Address from google map page
	public static By txtAddressfromMap = By.xpath("//*[@class='section-hero-header-title-title GLOBAL__gm2-headline-5']");

	//Full name from contact us page
	public static By txtName = By.name("name");

	//Email from contact us page
	public static By txtEmail = By.name("email");

	//Phone number from contact us page
	public static By txtPhNumber = By.name("phoneNumber");

	//Your Message from contact us page
	public static By txtYourMessage = By.name("message");

	//Submit button on Contact us page
	public static By btnSubmit = By.xpath("//*[@type='submit']");

	//Message is required text in contact us page
	public static By txtMessageRequired = By.xpath("//*[text()='Message is required']");

	//Thanks for contacting us message
	public static By txtThanksForContacting = By.xpath("//*[contains(text(),'Thanks for contacting us.')]");


	//Social Media Links
	//Instagram
	public static By lnkInstagram = By.xpath("//a[text()='Instagram']");
	public static By lnkLogin = By.xpath("//strong[text()='Log in']");
	public static By pgInstagram = By.xpath("//h1[text()='Instagram']");

	//Facebook
	public static By lnkFacebook = By.xpath("//a[text()='Facebook']");
	public static By pgFacebook = By.xpath("//a[contains(@href,'facebook.com')][contains(@title,'Go')]");

	//Youtube
	public static By lnkYoutube = By.xpath(".//a[text()='Youtube']");
	public static By pgYoutube = By.xpath(".//*[text()='Subscribe']");

	//Twitter
	public static By lnkTwitter = By.xpath("//a[text()='Twitter']");
	public static By pgTwitter = By.xpath("//span[text()='New to Twitter?']");

	//text Terms & Conditions"
	public static By lnkTermsAndCondition=By.xpath("//*[@href='/ca/en/pages/terms-conditions/']");
			// "(.//*[@class='Footer__SecondaryLink-sc-1ij96b8-10 fqTzVz'])[3]");

	//Terms & Conditions page displayed 
		public static By txtTermsAndConditionpge=By.xpath("(.//*[contains(text(),'Terms & Conditions')])[2]");

		//Conditions of Sale content present in the Terms & Condition page.
		public static By txtConditionofSale=By.xpath("(.//*[@href='https://www.vuse.com/ca/en/pages/conditions-of-sale'])[1]");
	   
		//Support email Id(support@govype.ca)
		public static By lnkSupportEmailId=By.xpath(".//*[@href='mailto:support@govype.ca']");
		
		// Contact Us
		public static By lnkContactUs=By.xpath("(.//*[@href='https://www.vuse.com/ca/en/contact-us'])");

		//public static By lnkTermsAndCondition=By.xpath("//a[text()='Conditions of Sale']");
		public static By pgTermsAndCondition=By.xpath("//h1[text()='Terms & Conditions']");
		//Terms & Conditions Page Content
		public static By weTermsandConditions = By.xpath("//h1[text()='Terms & Conditions']/../following-sibling::div");
		public static By pgTermsAndConditions=By.xpath("(//*[text()='Terms & Conditions'])[1]");
					
		

}
