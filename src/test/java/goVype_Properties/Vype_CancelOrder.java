package goVype_Properties;

import org.openqa.selenium.By;

public class Vype_CancelOrder {
	
	//verify current status
	public static By txtstatus=By.xpath("//*[contains(@class,'Tier__CurrentTierWrapper')]");
	
	//verify current points
	public static By currentpoints=By.xpath("//*[text()='Current points']/span");
	
	//subtotal value in order confirmation page
	public static By txtsubtotal=By.xpath("//*[text()='Subtotal']/../strong");
	
	//discount
	public static By txtdiscount=By.xpath("//*[text()='Discount']/../../strong");

	//return points today
	public static By txtreturnpoints=By.xpath("//*[text()='Today']/../../tr[2]/td[2]");
	
	//purchase points today
	public static By txtpurchasepointstoday=By.xpath("//*[text()='Today']/../../tr[3]/td[2]");
	
	//Your history
	public static By txtyourhistory=By.xpath("//*[text()='Your history']");
	
	//start savings
	public static By txtsavings=By.xpath("//*[text()='Start saving']");
}
