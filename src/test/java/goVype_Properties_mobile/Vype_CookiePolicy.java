package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_CookiePolicy {	
	
	//Cookie Policy Link
		public static By lnkCookiePolicy=By.xpath(".//*[@href='/ca/en/pages/cookie-policy/']");

		//Capture Cookie Policy text
		public static By txtCookiePolicy=By.xpath("(.//*[text()='Cookie Policy'])[1]");

		//Capture cookie policy content
		public static By txtcookiePolicyContent=By.xpath("//*[@class='RichText__Container-sc-1rvf6d4-0 fqLGqG']");

		//Support Email ID link
		public static By lnkSupportID=By.xpath("(//*[@href='mailto:support@govype.ca'])[1]");

		//Hyperlink of https://www.govype.ca
		public static By lnkgovype=By.xpath("");//*[@href='https://www.govype.ca/']
		
		//Hyperlink of Terms and Conditions 
		public static By lnkTermsConditions=By.xpath("//*[@href='https://www.vuse.com/ca/en/pages/terms-conditions']");//*[@href='https://govype.ca/pages/terms-conditions']
		
		//Verify terms and conditions page
		public static By txtTermsConditions= By.xpath("//*[@class='typography__H1-vraxd4-0 fQtXVO']");

		//Hyperlink of Privacy Policy
		public static By lnkPrivacyPolicy=By.xpath("(//*[@href='https://www.vuse.com/ca/en/pages/privacy-policy'])[1]");//*[@href='https://govype.ca/pages/privacy-policy'])[1]
		
		//Hyperlink of http://www.allaboutcookies.org/  
		public static By lnkAllaboutCookies=By.xpath("//*[@href='https://www.allaboutcookies.org/']");//*[@href='http://www.allaboutcookies.org/']
		
		//Verify allaboutcookies page
		public static By txtWelcomeTo= By.xpath("//*[@class='welcome']");

		//Hyperlink of policies/privacy/partners
		public static By lnkPartners=By.xpath("//*[@href='http://www.google.com/policies/privacy/partners/']");
		
		//VErify Privacy & terms
		public static By txtPrivacyTerms= By.xpath("//*[@class='nrAB0c']");
				// "(//*[@class='jg30ib'])[1]");

		//Hyperlink of Contact Us
		public static By lnkContactUs=By.xpath("(//*[@href='/contact-us'])[1]");//*[@href='https://www.vuse.com/ca/en/contact-us']
		//same UI new xpath 
		
		
		//Verify contact us page
		public static By txtcontactus=By.xpath("(//*[@class='typography__H4-vraxd4-3 lnJAdL'])[1]");

}
