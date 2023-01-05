package goVype_Properties_mobile;

import org.openqa.selenium.By;

public class Vype_RevampRewards_Mobile {
	public static By optouttoggle = By.xpath("(//*[text()='OPT-OUT'])");
	public static By optoutcontent = By.xpath("(//*[text()='OPT-OUT'])/../..");
	public static By currenttier = By.xpath("//*[contains(@class,'Tier__CurrentTierWrapper')]");
	public static By benefits = By.xpath(".//*[contains(@class,'Benefits__Container')]");
	public static By perks = By.xpath("(.//*[text()='Your perks'])/..");
	public static By achievements = By.xpath("(.//*[text()='Your achievements'])/..");
	public static By history = By.xpath("(.//*[text()='Your history'])/..");
	public static By btnJoinnow = By.xpath("(.//*[text()='JOIN NOW'])/..");
	public static By btnremindlater = By.xpath("(.//*[text()='REMIND ME LATER'])");
	public static By btnClose = By.xpath("(.//button[contains(@class,'Modal__Close')])[8]");
	public static By optincontent = By.xpath(".//*[contains(@class,'OptInBanner__Container')]");
	
}
