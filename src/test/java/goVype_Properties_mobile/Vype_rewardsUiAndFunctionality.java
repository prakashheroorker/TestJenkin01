package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_rewardsUiAndFunctionality {
	
	public static By DropDown(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__IconWrap')])["+(i+1)+"]");
	}
	
	public static By txtfaqs(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__Trigger-')]/..)["+(i+1)+"]");
	}
	
	// terms and condition link under faq
		public static By clickhere = By.xpath(".//*[@href='/ca/en/pages/vuse-rewards-terms-and-conditions/']");
		
		//terms and conditions page
		public static By termspage = By.xpath(".//*[text()='Vuse Rewards Terms and Conditions']");
		
		// contents in reward page
		public static By txtcontents =  By.xpath(".//*[contains(@class,'GetRewarded__Container')]");

		public static By txtcontents1 = By.xpath(".//*[contains(@class,'EarnPoints__Wrapper')]");

		public static By btnJoinNow1= By.xpath("(.//*[text()='JOIN NOW'])[1]");

		public static By pgrewards = By.xpath("(.//*[contains(@class,'Section__Container')])[1]");
		// verify the vuse rewards benfits content
		
		public static By txtbenefits = By.xpath(".//*[contains(@class,'Table__TableContainer')][1]");

		// verify unlock your vuse badge contents
		
		public static By txtunlock = By.xpath("//*[contains(@class,'Badges__Container')]");

		// verify points reak downn contents
		
		public static By txtPointsBD = By.xpath(".//*[contains(@class,'PointsBreakdown__Container')]");
		
		// verify start collecting content

		public static By txtStartcollecting = By.xpath(".//*[contains(@class,'StartCollecting__Container')]");

		// click btn join now under start collecting
		
		public static By btnJoinNow2 = By.xpath("(.//*[text()='JOIN NOW'])[2]");
		
		public static By lnkrewardspage = By.xpath(".//*[contains(@class,'Header__VuseRewards')]");
		
		
		public static By lnkpoints = By.xpath(".//*[contains(@class,'PointsChart__Svg')]");
			
		
		public static By lnkbenefits = By.xpath(".//*[text()='Your benefits']");
		
		public static By lnkbenefitsdet = By.xpath(".//*[contains(@class,'BenefitsList__Wrapper')]");
				
		
		
		
		public static By lnkperksdet = By.xpath(".//*[text()='Your perks']//..//*[contains(@class,'Badge__Title')]/../..");
				
		
		public static By lnkachieve = By.xpath(".//*[text()='Your achievements']");

		public static By lnkachievedet = By.xpath("//*[text()='Your achievements']//..//*[contains(@class,'Badge__Title')]/../..");
				

		
		
		public static By lnkcontent = By.xpath("(.//*[contains(@class,'AccountCard__Card')])[5]");
				

		public static By lnktoggle = By.xpath("(//*[text()='OPT-OUT'])");
		
		public static By lnkhistory = By.xpath(".//*[text()='Your history']");
		
		public static By lnkhistorydet = By.xpath("(.//*[contains(@class,'ActivityTable__Table')])");


		public static By lnkCurrentuser = By.xpath(".//*[contains(@class,'Tier__CurrentTierWrapper')]");


		public static By lnkCurrentpoints = By.xpath(".//*[contains(@class,'PointsChart__CurrentPoints')]");


		public static By lnperks = By.xpath(".//*[text()='Your perks']");
		
		
		public static By lnkepod2plus = By.xpath(".//*[text()='ePod 2+ devices']");
		
	public static By lnkepodpage = By.xpath(".//*[contains(@class,'EPod2PlusPreorderBanner__BoldDescription')]");
		
		public static By lnkbuynow = By.xpath(".//*[text()='BUY NOW $14.99']");
		
		public static By lnkchoose = By.xpath(".//*[text()='CHOOSE']/..");
		
		public static By lnkhelp = By.xpath(".//*[contains(@class,'sc-htpNat styles__StyledIconButton')]");
				
	    public static By lnkbadge = By.xpath	(".//*[text()='ePod2+']");
	    
	    
	    
	    public static By lnkpurchase = By.xpath(".//*[text()='ePod2+ Purchase']");
		
		
	    public static By lnkpurchasepoints = By.xpath("(//*[text()='ePod2+ Purchase']/..//*[text()='+500']/..)[1]");
	    		
		
	    public static By lnkearnedPoints = By.xpath(".//*[contains(@class,'TierChart__Chart')]");
	    
	    public static By lnkprogression = By.xpath(".//*[contains(@class,'TierChart__LifetimePoints')]");
	    
	    public static By lnkbanner = By.xpath("(.//*[contains(@class,'OrderConfirmationBanner')])[1]");


		public static By lnkEpod2purchasepoints = By.xpath("(.//*[text()='+500'])[1]");
				

		public static By lnkEpodPurchase= By.xpath("(//*[text()='ePod2+ Purchase'])[1]");
		
		public static By btnonetimepurchases=By.xpath(".//*[contains(@class,'typography__H4-sc-10lefml-3 Selector__Title')]");
		
		
		//////////
		
		
		public static By btnSignUpInLoginPage = By.xpath(".//*[text()='Sign up']");

		//Check box yes i want to receive information
		public static By chkBoxYesIWantToReceiveInformation=By.xpath("(.//*[text()='Yes, I want '])");

		//Check box I Acknowledge that i read
		public static By chkBoxIAcknowledgeThatIRead=By.xpath("(.//*[contains(text(),'By checking this box, I acknowledge that I read')])[1]");

		//Button Register
		public static By btnRegister=By.xpath("(.//*[@type='submit'])[1]");


		public static By vuserewardsloyaltyprogram=By.xpath("(.//*[contains(text(),'I want to join the Vuse Rewards loyalty program! ')])[1]");
		
		
		

}