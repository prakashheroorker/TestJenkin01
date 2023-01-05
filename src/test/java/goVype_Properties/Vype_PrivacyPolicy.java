package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_PrivacyPolicy {
	
	
	//PrivacyPolicy link from Home page
		public static By lnkPrivacyPolicy = By.xpath(".//a[@href='/pages/privacy-policy']");

		// PrivacyPolicy Page 
		public static By pgPrivacyPolicy=By.xpath(".//h1[text()='Privacy Policy' and @class='typography__H1-vraxd4-0 fQtXVO']");
		
		//PrivacyPolicy page content
		public static By wePrivacyPolicyContent = By.xpath("(//*[text()='Privacy Policy'])[1]/../following-sibling::div");
				
		
		//Support Email ID
		//public static By lnkPPSupportEmailID = By.xpath(".//*[@href='mailto:support@govype.ca'][1]");
		public static By lnkPPSupportEmailID=By.xpath("(.//*[contains(text(),'info.ca@vuse.com')])[3]");
		
		//Terms & COnditions link
		public static By lnkTermsConditions = By.xpath(".//a[@href='https://www.vuse-qa.ca/ca/en/pages/terms-conditions']");
		
		//Terms and COnditions page
		public static By pgTermsConditions=By.xpath("(.//*[text()='Terms & Conditions'])[1]");
		
		//Condition of Sale link
		public static By lnkConditionofSale = By.xpath("(//*[text()='Conditions of Sale'])[1]");
				//"(.//a[@href='https://www.vuse.com/ca/en/pages/conditions-of-sale'])[1]");
		
		//Condition of Sale page
		public static By pgConditionofSale =By.xpath(".//h1[@class='typography__H1-vraxd4-0 fQtXVO' and text()='Conditions of Sale']");
		
		//Terms & Conditions text.
		public static By txtTermsAndCondition=By.xpath("(.//*[text()='Terms & Conditions'])[1]");
		
		//Terms & Conditions text.
		public static By txtConditionsOfSale=By.xpath("(.//*[text()='Conditions of Sale'])[1]");
		
	
}
