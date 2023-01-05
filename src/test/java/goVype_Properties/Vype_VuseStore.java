package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_VuseStore {
	
	public static By WeVuseStore=By.xpath("(.//*[text()='Vuse Store'])");
	
	public static By WeVuseStoreWest=By.xpath("(.//*[contains(text(),'Vuse Store West')])[1]");
	
	
   public static By lnkContactNumber=By.xpath("//h3[text()='CONTACT']/../p[1]/a");
   public static By WeOpeningHours=By.xpath("//h3[text()='CONTACT']/../p[1]/a");
   
   public static By lnkGetDirections=By.xpath("(.//*[contains(text(),'Directions')])[1]");
   
   public static By weVuseStore=By.xpath("(.//*[text()='Vuse Store West Edmonton Mall'])");
   
   public static By lnkSendToFriend=By.xpath("(.//*[contains(text(),'Send to a friend')])");

   public static By weShare=By.xpath("(.//*[contains(text(),'SHARE')])");

   public static By lnkClose=By.xpath("(.//*[@class='close'])");
   
   public static By weSwap=By.xpath("(.//*[contains(text(),'SWAP')])");

   public static By weGetComplete=By.xpath("(.//*[contains(text(),'GET THE COMPLETE EXPERIENCE')])");
   public static By btnCallNow=By.xpath("(.//*[contains(text(),'Call now to book')])");
   
   public static By weWereToFind=By.xpath(" (.//*[contains(text(),'Where to find us')])");
   public static By lnkFindOther=By.xpath("(.//*[contains(text(),'Find other Vuse Stores in Canada')])");
   public static By lnkVuseStore=By.xpath("(.//*[contains(text(),'VUSE STORE')])");
   public static By weFrequentlyAsked=By.xpath(" (.//*[contains(text(),'FREQUENTLY ASKED QUESTIONS ')])");
   public static By lnkWereareYou=By.xpath("(.//*[@class='title'])[1]");
  
   
   
   
   
   public static By weWeAreLocated=By.xpath("(.//*[@class='content'])[2]");
   public static By lnkOpeningHours=By.xpath("(.//*[@class='title'])[2]");
   public static By lnkWhatProducts=By.xpath("(.//*[@class='title'])[3]");
   public static By lnkPaymentMethods=By.xpath("(.//*[@class='title'])[4]");
   public static By lnkShopingMethods=By.xpath("(.//*[@class='title'])[5]");
   public static By lnkDoYouScan=By.xpath("(.//*[@class='title'])[6]");
   
  
   public static By weOurCurrent=By.xpath("(.//*[@class='content'])[3]");
   public static By weVuseProducts=By.xpath("(.//*[@class='content'])[4]");
   public static By wePaymentMethodsContent=By.xpath("(.//*[contains(text(),'We accept cash, AMEX, and credit cards and debit cards from all major banks.')])");
   
   public static By weShopingMethodsContent=By.xpath("(.//*[contains(text(),'Walk-ins, Click & Collect and Call & Collect are available. ')])");
   
   public static By weDoYouScanContent=By.xpath("(.//*[contains(text(),'Vuse Store is reserved for 18+ only and requires a valid-government ID to be shown as proof. We do not scan your ID or take photos of it.')])");
   
    //Added by sirresha
   public static By btnstore = By.xpath(".//*[text()='Vuse Store']");

   public static By lstprovince = By.xpath("(.//*[contains(@class,'ProvinceNavigation__NavigationWrapp')])");

   public static By txtfindus = By.xpath(".//*[text()='Where to find us']");

   public static By lststores =By.xpath("(.//*[contains(@class,'StoreLocationCard__StoreInformation-sc')])");

   public static By figmap = By.xpath(".//*[text()='Map']");

   public static By txtstoreoffers = By.xpath("(.//*[contains(@class,'StoreBannerCarousel__StoreBannerCarouselBlock-sc')])");

   public static By txtexperince = By.xpath("(.//*[contains(@class,'StoreExperience__ExperiencesContent')])");

   public static By btnbc = By.xpath(".//*[text()='British Columbia']");

   public static By btnAB = By.xpath(".//*[text()='Alberta']");

   public static By lststores(int i) {
   	// TODO Auto-generated method stub
   	return By.xpath("(.//*[contains(@class,'StoreLocationCard__StoreInformation-sc')])["+(i+1)+"]");
   }
}


