package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_rewardsUiAndFunctionality{
	// vuse rewards page under save 
	public static By page =  By.xpath(".//*[contains(@class,'VuseRewardDecoration')][1]");
	
	// terms and condition link under faq
	public static By clickhere = By.xpath(".//*[@href='/ca/en/pages/vuse-rewards-terms-and-conditions/']");
	//terms and conditions page
	public static By termspage = By.xpath(".//*[text()='Vuse Rewards Terms and Conditions']");
	// text vuse reward
	public static final By txtrewards = By.xpath(".//*[text()='Vuse Rewards']");
	// contents in reward page
	public static By txtcontents =  By.xpath(".//*[contains(@class,'GetRewarded__Container')]");

	public static By txtcontents1 = By.xpath(".//*[contains(@class,'EarnPoints__Wrapper')]");

	public static By btnJoinNow1= By.xpath("(.//*[text()='JOIN NOW'])[1]");

	// verify the reward section of the profile page
	public static By pgrewardsUi = By.xpath(".//*[contains(@class,'AccountCard__SectionContainer')][1]");
    
	// verify the vuse rewards benfits content
	public static By txtbenefits = By.xpath(".//*[contains(@class,'Table__TableContainer')][1]");
    
	// verify unlock your vuse badge contents
	public static By txtunlock = By.xpath("//*[contains(@class,'Badges__Container')]");
    
	// verify points reak downn contents
	public static By txtPointsBD = By.xpath(".//*[contains(@class,'PointsBreakdown__Container')]");
    
	// verify start collecting content
	public static By txtStartcollecting  = By.xpath(".//*[contains(@class,'StartCollecting__Container')]");
    
	// click btn join now under start collecting
	public static By btnJoinNow2 = By.xpath("(.//*[text()='JOIN NOW'])[2]");
	public static By dropdown(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__IconWrap')])["+(i+1)+"]");
	}
	
	public static By txtfaq(int i)
	{
		
		return By.xpath("(.//*[contains(@class,'Question__Trigger-')]/..)["+(i+1)+"]");
	}


	public static By werewardspage = By.xpath(".//*[contains(@class,'Header__VuseRewards')]");
			
	
	public static By wepoints = By.xpath(".//*[contains(@class,'PointsChart__Svg')]");
		
	
	public static By webenefits = By.xpath(".//*[text()='Your benefits']");
	
	public static By webenefitsdet = By.xpath(".//*[contains(@class,'BenefitsList__Wrapper')]");
			
	
	public static By weperks = By.xpath(".//*[text()='Your perks']");
	
	public static By weperksdet = By.xpath(".//*[text()='Your perks']//..//*[contains(@class,'Badge__Title')]/../..");
			
	
	public static By weachieve = By.xpath(".//*[text()='Your achievements']");

	public static By weachievedet = By.xpath("//*[text()='Your achievements']//..//*[contains(@class,'Badge__Title')]/../..");
			

	public static By weprofile1 = By.xpath(".//*[text()='Profile']");
	
	public static By wecontent = By.xpath(".//*[contains(@class,'Button__Container')]/..");
			

	public static By wetoggle = By.xpath(".//*[contains(@class,'Button__Container')]");
			// ".//*[contains(@class,'Toggle__Indicator')]");
	
	public static By wehistory = By.xpath(".//*[text()='Your history']");
	
	public static By wehistorydet = By.xpath("(.//*[contains(@class,'ActivityTable__Table')])");
			
	
	public static By weCurrentpoints = By.xpath(".//*[contains(@class,'PointsChart__CurrentPoints')]");
		
	
	public static By weCurrentuser = By.xpath(".//*[contains(@class,'Tier__CurrentTierWrapper')]");
	
	
	public static By weepod2plus = By.xpath(".//*[text()='ePod 2+ devices']");
			
	public static By weepodpage = By.xpath(".//*[contains(@class,'EPod2PlusPreorderBanner__BoldDescription')]");
	
	public static By webuynow = By.xpath(".//*[text()='BUY NOW $14.99']");
	
	public static By wechoose = By.xpath(".//*[text()='CHOOSE']/..");
	
	public static By wehelp = By.xpath(".//*[contains(@class,'sc-htpNat styles__StyledIconButton')]");
			
    public static By webadge = By.xpath	(".//*[text()='ePod2+']");
    
    
    
    public static By wepurchase = By.xpath(".//*[text()='ePod2+ Purchase']");
	
	
    public static By wepurchasepoints = By.xpath("(//*[text()='ePod2+ Purchase']/..//*[text()='+500']/..)[1]");
    		
	
    public static By weearnedPoints = By.xpath(".//*[contains(@class,'TierChart__Chart')]");
    
    public static By weprogression = By.xpath(".//*[contains(@class,'TierChart__LifetimePoints')]");
    
    public static By webanner = By.xpath("(.//*[contains(@class,'OrderConfirmationBanner')])[1]");


	public static By weEpod2purchasepoints = By.xpath("//*[text()='Today']/../../tr[3]/td[2]");
			

	public static By weEpodPurchase= By.xpath("//*[text()='Today']/../../tr[3]/td[1]");
	
	//--------------added by sasikala
	public static By lnkepodpage = By.xpath(".//*[contains(@class,'EPod2PlusPreorderBanner__BoldDescription')]");	
			
		
}